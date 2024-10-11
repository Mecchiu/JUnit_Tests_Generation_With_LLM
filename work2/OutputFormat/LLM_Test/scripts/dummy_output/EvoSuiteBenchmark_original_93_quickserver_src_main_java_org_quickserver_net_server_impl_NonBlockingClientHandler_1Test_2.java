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
		
    static class ClientWriteHandler extends SelectorHandler {
		public int totalBytesWritten;
		private ClientWriteHandler[] readyHandlers;

		public ClientWriteHandler(ClientWriteHandler[] readyHandlers, int totalBytesCount) {
			super(null);
			this.readyHandlers = readyHandlers;
			this.totalBytesWritten = totalBytesCount;
		}

		public ClientWriteHandler(ClientWriteHandler[] readyHandlers) {
			super(null);
			this.readyHandlers = readyHandlers;
			this.totalBytesWritten = 0;
		}
	}

    @Test
    public void testClientReadByteBuffer() throws Exception {
	    NonBlockingClientHandler_1Test test = new NonBlockingClientHandler_1Test();

		Thread w = new Thread(() -> {
			test.doHandshake();
		});
		Thread ready = new Thread(() -> test.doSelectRead());
		ready.start();
		//awaitReady();
		//awaitConnection();
		synchronized(test) {
			test.doSelectRead();
			while(test.threadAccessCount>1){
				test.wait();
			}
			//processFinished(test);
			test.doWakeupSelectorAfterRegisterRead();
			test.doSelectRead();
			while(!ready.isAlive()){
				try { test.wait(); } catch (Exception e) {}
			}
		}
}
}