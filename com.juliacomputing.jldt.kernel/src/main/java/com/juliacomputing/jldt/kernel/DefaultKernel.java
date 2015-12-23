package com.juliacomputing.jldt.kernel;

import com.juliacomputing.jldt.kernel.api.Kernel;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;

@Service
@Component
public class DefaultKernel implements Kernel {

    public static final int DEFAULT_PORT = 5555;
    public static final String DEFAULT_HOST = "localhost";

    private ZMQKernelProxy proxy;

//    public static void main(String[] args) throws InterruptedException {
//        final DefaultKernel kernel = new DefaultKernel();
//        kernel.start();
//        for (int i = 0; i < 1000; i++) {
//            final String[] keywords = kernel.keywords();
//        }
//        kernel.stop();
//    }

    @Activate
    public void start() {
        proxy = new ZMQKernelProxy(DEFAULT_HOST, DEFAULT_PORT);
        proxy.connect();

    }

    @Deactivate
    public void stop() {
        proxy.disconnect();
    }

    @Override
    public String[] keywords() {
        proxy.send(new Keywords());
        return proxy.receive(String[].class);
    }
}
