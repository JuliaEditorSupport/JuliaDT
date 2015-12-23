package com.juliacomputing.jldt.kernel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.zeromq.ZMQ;
import org.zeromq.ZMQ.Context;
import org.zeromq.ZMQ.Socket;

import java.io.IOException;

public class ZMQKernelProxy {

    private final String host;
    private final int port;
    private Socket requester;
    private Context context;
    private ObjectMapper mapper = new ObjectMapper();

    public ZMQKernelProxy(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect() {
        context = ZMQ.context(1);
        requester = context.socket(ZMQ.REQ);
        requester.connect("tcp://" + host + ":" + port);
    }

    public void disconnect() {
        requester.close();
        context.term();
    }

    public void send(Object message) {
        try {
            requester.send(mapper.writeValueAsBytes(message));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public <T> T receive(Class<T> clazz) {
        final byte[] bytes = requester.recv();
        try {
            return mapper.readValue(bytes, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



