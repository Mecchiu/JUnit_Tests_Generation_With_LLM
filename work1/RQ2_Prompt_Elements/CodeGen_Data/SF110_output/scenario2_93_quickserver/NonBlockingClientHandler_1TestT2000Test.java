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
private static final String NAMESPACE = "test/com.sun.nio.ch.TCP_NAK";

		/**
		 * A client that does not return to the client, it calls the 
		 * wakeupSelector after RegisterForRead.
		 */
    public final class Client extends Server {

    	private final NonBlockingClientHandler_1Test
    	   serverHandler = new NonBlockingClientHandler_1Test();

		public Client(
				ServerConnectionFactory serverClientFactory,
				ServerAddressFactory serverAddressFactory,
				ServerConnectionFactory serverServerFactory,
				int port,
				int portMin,
				int portMax)
		throws IOException {
			super(serverClientFactory, serverAddressFactory, serverServerFactory, port, portMin, portMax);
		}

		static NonBlockingClientHandler_1Test getInstance() {
			return Server_GetInstanceL(NonBlockingClientHandler_1Test::new);
		}

		public Client(int portNum) {
			super(ServerHandler.getInstance(ServerHandler.getNonBlockingServerFactory(NonBlockingServer.DEFAULT)), null, null, portNum);
		}

		public ServerClient getClient(int portNum) {
			return Server_GetClient(0, new TCPServerClientFactory(serverClientFactory), portNum);
		}

		public void stop() {
			stopNow = true;
		}

		static boolean stopNow = false;

		//
		// Test method for 'NonBlockingClientHandler.getWakeupSelectorAfterRegisterRead()'
		//
		@Test 
		public void test_getWakeupSelectorAfterRegisterRead() {
			assertFalse("getWakeupSelectorAfterRegisterRead returned true", serverHandler.getWakeupSelectorAfterRegisterRead());
			serverHandler.stop();
			try {
				serverHandler.getWakeupSelectorAfterRegisterRead();
			} catch (Exception exc) {
				String expectedString;
				if (exc instanceof UnsatisfiedLinkError) {
					expectedString =  "UnsatisfiedLinkError";
				} else if (exc instanceof UnsatisfiedLinkError_1_13) {
					expectedString =  "UnsatisfiedLinkError_1_13";
				}
				fail(Client_getWakeupSelectorAfterRegisterReadString(exc, expectedString));
			}
		}
	}

	/**
	* Test method for {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterRead()}. Tests behavior of
	* constructor that takes 0 as the port when port is unset.
	*
	*/
	@Test
	public void test_Client_0Server_GetClient_0_server_GetClient() {
    	final Server connectionServer = serverServerFactory.getServer();
		final Server connectionClient = connectionServer.newServerClient();
		Server_SetNonBlockingServerFactory(connectionServer, NonBlockingServer.DEFAULT);
		Server_SetNonBlockingServerFactory(connectionClient, NonBlockingServer.DEFAULT);
        Server_SetNonBlockingConnectorFactory(connectionClient, NonBlockingConnectorFactory.DEFAULT);
		final ServerServerConnectionFactory connectionServerFactory = Server_GetNonBlockingConnectionFactory(connectionServer);
		final ServerServerConnectionFactory connectionClientFactory = Server_GetNonBlockingConnectionFactory(connectionClient);
		final ServerConnectionFactory socketFactory = ServerConnectionFactory_NonBlockingTCPAddress(connectionClient.getSocket().getLocalAddress(), 20);
		Server_SetSocketFactory(connectionClient, socketFactory);
		Server_SetNonBlockingServerFactory(connectionClient, NonBlockingServer.DEFAULT);
	}

	/**
	* Test method for {@link NonBlockingClientHandler#Server_SetNonBlockingServerFactory(ConnectionServer)}.
	* Tests behavior of constructor with null parameter.
	*
	*/
	@Test (expected = IllegalArgumentException.class)
	public void test_Server_SetNonBlockingServerFactory_null_connectionServer() {
    	Server_SetNonBlockingServerFactory(null, 0);
	}

	/**
	* Test method for {@link NonBlockingClientHandler#Server_SetNonBlockingServerFactoryNonBlock(ConnectionServer)}.
	* Tests behavior of constructor with 0 as the port when port is unset, it throws UnsatisfiedLinkError
	* when port is already set to nonBlocking.
	*
	*/
	@Test (expected = UnsatisfiedLinkError_1_3.class)
	public void test_Server_SetNonBlockingServerFactoryNonBlock_0_connectionServer() {
		Server_SetNonBlockingServerFactoryNonBlock(null);
	}

	/**
	* Test method for {@link NonBlockingClientHandler#Server_SetNonBlockingServerFactoryNonBlock(ConnectionServer)}.
	* Tests behavior of constructor with null parameter.
	*
	*/
	@Test (expected = IllegalArgumentException.class)
	public void test_Server_SetNonBlockingServerFactoryNonBlock_null_connectionServer() {
    	Server_SetNonBlockingServerFactoryNonBlock(null);
	}

	/**
	* Test method for {@link NonBlockingClientHandler#Server_SetNonBlockingConnectionFactory(ServerConnection)}.
	* Tests behavior of constructor with null parameter.
	*
	*/
	@Test (expected = IllegalArgumentException.class)
	public void test_Server_SetNonBlockingConnectionFactory_null_serverConnection() {
    	Server_SetNonBlockingConnectionFactory(null);
	}

	/**
	* Test method for {@link NonBlockingClientHandler#Server_SetNonBlockingSslContext(SslContext)}.
	* Tests behavior of constructor with null parameter.
	*
	*/
	@Test (expected = IllegalArgumentException.class)
	public void test_Server_SetNonBlockingSslContext_null_sslContext() {
    	Server_SetNonBlockingSslContext(null);
	}

	/**
	* Test method for {@link NonBlockingClientHandler#Server_SetNonBlockingSslContext(SslContext, int, int, SslCallback)}.
	* Tests behavior of constructor with undefined parameters.
	*
	*/
	@Test (expected = IllegalArgumentException.class)
	public void test_Server_SetNonBlockingSslContext_undefined_callbacks() {
    	Server_SetNonBlockingSslContext(null, 0, 0, null);
	}

    private static String Client_getWakeupSelectorAfterRegisterReadString(
			Exception exc, String expected) {
		return new StringBuilder(StringUtil.getStackTrace(exc))
		.append("[")
		.append("getWake