// NonBlockingClientHandler_1Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterRead()} method.
*/
class NonBlockingClientHandler_1Test {
		
	@Test
	public void execute() throws Exception {
        
		NonBlockingClientHandler handler = new NonBlockingClientHandler();
		TheClient theClient = new TheClient(theClientHandler, handler, 10, 10, 500);
		theClient.setSocket(new Socket(127,0));
		theClient.setTimeout(1000);
		theClient.connect();
		waitTillFullyWritten();
		theClient.setWakeupSelectorAfterRegisterRead();
		theClient.run();
		

//       theClient = handler.getSelectionKey().channel();
	}
	
    private SSLSocketChannel theClientHandler;

    private SocketChannel theSelectionKey;
    
    private SocketChannel theSocket;

    private Object waitTillFullyWritten = new Object();

    private void waitTillFullyWritten() throws Exception {
        synchronized (waitTillFullyWritten) {
            while (waitTillFullyWritten.get() == false && theSelectionKey.isValid() == false)
                waitTillFullyWritten.wait();
        }
    }

    void doHandshake() throws Exception {
        theClient.doHandshake();
    }

    void doTasks() throws Exception {
    	theClient.doTasks();
        theSelChannelThread.join();
        theSelectionKey.ready();
        theClientHandler.closeAfterRunning();
    }

	private void closeAfterRunning() throws Exception {
		theClientHandler.socketChannel = null;
		theClientHandler.setClientWriteHandler(null);
		waitTillFullyWritten.notify();
	}

    private SelectionKey theSelectionKey;
 	
    private SelectionKey theSelChannelThread;

    private ThreadChannelClientHandler theClientHandler;

    private ServerChannel theServerChannel;

    private SocketChannel theSocket;
}