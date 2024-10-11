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
private final Set<Integer> stopThreadAccess;
		private final List<SocketInfo> closeSockets;
        private final SocketManager socketManager;
		private final Server server;
        private final NonBlockingServerHandler serverHandler;

		/**
				* Constructs a new instance of
				* {@link NonBlockingClientHandler_2Test}.
				*
				* @param stopThreadAccess is the set of threads and sockets that have been passed to {@link NonBlockingClientHandler#stopThreadAccess}
				* @param closeSockets is the list of sockets
				* @param socketManager is the {@link Server}
				* @param serverHandler is the {@link ServerHandler} (from the {@link Server})
                */
        NonBlockingClientHandler_2Test(Set<Integer> stopThreadAccess, List<SocketInfo> closeSockets, SocketManager socketManager, Server server, ServerHandler serverHandler) {
            this.stopThreadAccess = stopThreadAccess;
            this.closeSockets 	= closeSockets;
            this.socketManager = socketManager;
            this.server = server;
            this.serverHandler = serverHandler;
            
			this.startThreadAcessCount = this.stopThreadAccess.size();   //the number of connections requested so far for the Server while the ServerHandler is running
        	this.serverHandler.startUp(server);
        	this.startThreadAcessCount = this.stopThreadAccess.size(); 	//the number of connections requested so far for the Server while the ServerHandler is running
        }

		/**
		* Tests getMaxThreadAccessCount method.
                */
        @Test
        public void testGetMaxThreadAccessCount() throws Exception {
            ServerHandler currentServerHandler = new ServerHandler(this.server, socketManager, this.serverHandler);
            
            int maxThreadAccessCount = this.getMaxThreadAccessCount(currentServerHandler);

            assertEquals(this.stopThreadAccess.size(), maxThreadAccessCount);
        }

        /**
		 * Tests the end of the server up after getting and end of a thread up,
                * and without end of all channels being processed until
		 * the closeSockets method has been called.
                *
                * @throws IOException exception.
		 */
        @Test
        public void testEndOfServerWhenChannelClosingIsDoneAfterClosingNioChannels() throws IOException {
            ServerHandler currentServerHandler = new ServerHandler(this.server, socketManager, this.serverHandler);
            currentServerHandler.setMaxThreadAccessCount(startThreadAcessCount);

            this.serverHandler.endOfProcessing(currentServerHandler);

            Set<Integer> closeThreadAccess = currentServerHandler.stopThreadAccess();

            assertTrue(closeThreadAccess.isEmpty());

            Map<Integer, ServerSocketChannel> currentServerSockets = new HashMap<>();
            Collection<SocketInfo> closeSockets = new HashSet<>(this.closeSockets);

            while(!closeSockets.isEmpty()) {
                closeSockets.remove(closeSockets.iterator().next());

                int socketNumber = closeSockets.iterator().next().number;
                
                ServerSocketChannel serverSocketChannel = currentServerSockets.get(socketNumber);
                System.out.println("socketNumber: " + socketNumber + " serverSocketChannel: " + serverSocketChannel);
                Collection<ServerConnection> serverConnections = serverSocketChannel.getValidAcceptableConnections();
                if (!serverConnections.isEmpty()) {
                    ServerConnection serverConnection = serverConnections.iterator().next();
                    ServerSocketChannel serverSvcChannel = serverConnection.getServerSocketChannel();
                    System.out.println("serverSvcChannel: " + serverSvcChannel);

                    while (!serverSvcChannel.isConnectionPending()) {

                        boolean isClient = serverSvcChannel.getInputStream() instanceof SocketInputStream;
                        SocketInputStream clientInputStream = (SocketInputStream) serverSvcChannel.getInputStream();
                        ByteBuffer bbClientInput = clientInputStream.getDataBuffer();

                        SocketAddress remoteAddress = serverSvcChannel.getRemoteAddress();
                        if (remoteAddress == null) {
                            remoteAddress = (SocketAddress) null;
                        }

                        ServerConnection clientConnection = new ServerConnection(serverSvcChannel, isClient, remoteAddress, bbClientInput.remaining());
                        server.addServerConnection(clientConnection);
                        
                        ServerConnectionManager serverConnectionManager = serverSvcChannel.getServerConnectionManager();
                        if(serverConnectionManager!=null) {
                            serverConnectionManager.shutdownAll(null);
                        }
                    }
                }
                
                currentServerSockets.put(socketNumber, serverSocketChannel);

                closeSockets.remove(closeSockets.iterator().next());
            }
        }

        /**
                * Creates a socket.
                * The input and output streams are null (so no matter if the socket is TCP or UDP).
                *
                * @return a Socket object
                */		
        private Socket newSocket() throws UnsupportedEncodingException {
            InetSocketAddress remoteAddress = new InetSocketAddress(NonBlockingClientHandler_2Test.HOST,NonBlockingClientHandler_2Test.PORT);
            byte[] buffer = new byte[100];
            
            BufferedInputStream bis = new BufferedInputStream( new ByteArrayInputStream(buffer));
            
            return new Socket(InetAddress.getByName(NonBlockingClientHandler_2Test.HOST),
                                  NonBlockingClientHandler_2Test.PORT, remoteAddress.getHostName(), remoteAddress.getPort(), bis);
        }

    }
}
