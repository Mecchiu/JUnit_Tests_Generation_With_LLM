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
	public void returnThread() throws Exception {
		NonBlockingClientHandler.setClientWriteHandler(null);
		
		ClientReadHandler rh = new ClientReadHandler();
		ClientSocketChannelBase clientSockChanBase = ClientSocketChannelBase.create(new NonBlockingClientHandler(rh).clientSocketChannel); 
		
		ClientWriteHandler rh2 = new NonBlockingClientHandler(rh).clientWriteHandler;
		ClientSocketChannelBase clientSockChanBase2 = ClientSocketChannelBase.create(rh2);
		
		NonBlockingClientHandler rh3 = new NonBlockingClientHandler(null,rh, false, null, true);

		
		
		
	}

	@Test
	public void processGotDataInBuffers() throws AppException, IOException, ClassNotFoundException, NullPointerException, ClosedChannelException {
		NonBlockingClientHandler.setClientWriteHandler(new ReadHandler());
		NonBlockingClientHandler.setClientReadHandler(new ClientWriteHandler());

		NonBlockingClientHandler.setInitialHandshakeStatus(true);

		
		byte[] src = { 1, 2, 3, 4, 7, 8, 9 };
		NonBlockingClientHandler.setInputStream(new ByteArrayInputStream(src));
		NonBlockingClientHandler.setSocketChannels(NonBlockingClientHandler.create(null), NonBlockingClientHandler.create(null));
		NonBlockingClientHandler.setBlockingMode(true);
			
		
			
	}

	@Test
	public void processHandshake() throws Exception {
		ClientWriteHandler rh = new ClientWriteHandler();
		ClientReadHandler rh2 = new ClientWriteHandler();
		ClientSocketChannelBase clientSockChanBase = ClientSocketChannelBase.create(rh).clientSocketChannel;
		ClientSocketChannelBase clientSockChanBase2 = ClientSocketChannelBase.create(rh2).clientSocketChannel;

		NonBlockingClientHandler.setClientWriteHandler(rh);
}
}