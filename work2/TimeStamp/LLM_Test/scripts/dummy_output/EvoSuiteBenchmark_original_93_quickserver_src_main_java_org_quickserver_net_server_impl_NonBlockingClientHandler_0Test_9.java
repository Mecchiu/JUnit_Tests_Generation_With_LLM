// NonBlockingClientHandler_0Test.java
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
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} method.
*/
class NonBlockingClientHandler_0Test {
		
	protected Client createClient(SocketChannel socketChannel) throws IOException, ConnectionClosedException
	{
		return new Client(socketChannel);
	}

	protected Client createClient(SocketChannel socketChannel, HostAndPort hostAndPort, URL url) throws IOException, ConnectionClosedException
	{
		return new Client(socketChannel, hostAndPort, url);
	}


	/**
	 * Simple test class.
	 * Creates a BasicClientHandler with SSL enabled and waits for connections to establish.
	 * @pre	sslConfigured, clientSSLOnNonBlocking, getWakeupSelectorAfterRegisterWrite() is true
	 * @see BasicClientHandler#setSSLOnNonBlocking()
	 * @see BasicClientHandler#setSSLOnNonBlocking(boolean)
	 * @since 1.4.5
	 */
	private class ClientHandler extends BasicClientHandler {

		protected ClientHandler(SocketChannel listenChannel, HostAndPort hostAndPort) throws IOException	{
			super(listenChannel, hostAndPort, false, false);
		}

		protected ClientHandler(SocketChannel listenChannel,
		        HostAndPort hostAndPort,
		        boolean useSSL, boolean getDataModeInNonBlocking) throws IOException, ClassNotFoundException, ConnectionClosedException
		{
			super(listenChannel, hostAndPort, useSSL, getDataModeInNonBlocking);
		}

		protected ClientHandler(SocketChannel listenChannel,
		        HostAndPort hostAndPort,
		        boolean useSSL, boolean getDataModeInNonBlocking,
		        boolean initialHandshakeStatus,
		        boolean willReturn) throws IOException, ClassNotFoundException, ConnectionClosedException
		{
			super(listenChannel, hostAndPort, useSSL, getDataModeInNonBlocking, initialHandshakeStatus, willReturn);
		}

}
}