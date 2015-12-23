#!/usr/bin/env julia

#https://github.com/joshbode/zmq-example/blob/master/julia-server.jl

using JSON
using ZMQ
using Logging

BASE_PORT = int(ARGS[1])
WORKER = int(ARGS[2])
PORT = BASE_PORT + WORKER

Logging.configure(level=Logging.DEBUG)
context = ZMQ.Context()
socket = ZMQ.Socket(context, ZMQ.REP)
ZMQ.bind(socket, "tcp://*:$PORT")
Logging.info("Ready")
while true
    data =takebuf_string(convert(IOStream, ZMQ.recv(socket)))
    Logging.info("Received: [", join(data, ", "), "]")
    result = ["ok"]
    ZMQ.send(socket, JSON.json(result))
    Logging.info("Sent: $result")
end