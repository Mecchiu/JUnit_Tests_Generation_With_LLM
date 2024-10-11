// NonBlockingClientHandler_2Test.java
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
* It contains one unit test case for the {@link NonBlockingClientHandler#getMaxThreadAccessCount()} method.
*/
class NonBlockingClientHandler_2Test {
		static String testServerName = "NONSERVER";
	//	static final String testServerName = "127.0.0.1:1588";
	//	static final String testServerName = "localhost";
	public static final String KEY_TYPE = "TLSv1_3_"; //"AES_KEY";
	
	
	class TestContext {
		
		public final byte[] clientWriteData = new byte[1024]; // for key.
		public final byte[] writeClientData = new byte[1024]; // for  key.
		public final byte[] readServerData = new byte[1024]; // for key.
		public final KeyPair key = new KeyPair(); // for key.
		
	}
	
	class TestHandler implements ClientHandler {
		
		public TestContext testContext;
		public Map<Integer, TestContext> contexts;
		public Throwable testException = new Throwable("Test Exception");
		public Map<Integer, Throwable> handleExceptions = new HashMap<>();
		public boolean gotSasl = false;
		public boolean gotFinal = false;

		public ClientConnection getConnection() {
			return new ClientConnection(null);
		}

		public void setHandshakeStatus() {
		}

		public void setSSLSocketFactory(SSLSocketFactory socketFactory) {
		}

		public void writeBytes(ByteBuffer buffer, InputStream in) throws Exception {
			testContext.writeInputStream_1(in);
		}

		public void writeBytes(String s) throws Exception {
			testContext.writeString(s);
		}
		
		public String readString(InputStream in) throws Exception {
			return ByteBuffer.wrap(testContext.readClientData).get(0);
		}

		public void receive_WriteResult(SendResult receiveResult) throws IOException {
			
		}

}
}