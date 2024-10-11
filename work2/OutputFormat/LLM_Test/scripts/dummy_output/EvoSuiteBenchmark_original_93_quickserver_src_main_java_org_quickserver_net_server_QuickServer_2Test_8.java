// QuickServer_2Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains one unit test case for the {@link QuickServer#getNewLine()} method.
*/
class QuickServer_2Test {
		private ClientHandler command = null;
		private ClientHandler exceptionhandler = null;
		private ClientResponseHandler exceptionhandler2 = null;
		private UserClientHandler userhandler = null;
		private ClientObjectHandler clientobj = null;
		private ClientBinaryHandler clientbin = new ClientBinaryHandler();
		private ClientWriteHandler clientwrite = new ClientWriteHandler();
		private ClientAuthenticationHandler clientauthen = new ClientAuthenticationHandler();
		private ClientCommandHandler commandhandler = new ClientCommandHandler(this);

		/**
		 * Creates/Configures a new instance of {@link QuickServer} based on
		 * the configuration values stored in {@link QuickServerConfig}.
		 * @param config configuration values
		 */
		public QuickServer_2Test(QuickServerConfig config) {
			if(config.getClientPort()!= 4123){
				createServer("Echo server v"+config.getServerVersion(), config.getPort());
			}
			this.setName("Echo Server "+config.getName());
			setDaemon(true);
		}

		private static void createServer(String name, int port) throws SocketException {

			String location = "quickServer@"+name;
			ServerSocket socket = new ServerSocket();

			socket.bind(new InetSocketAddress(port), 5);

			socket.setReuseAddress(true);

			System.out.println("QuickServer created: "+name+" at "+location);

		/*	socket.setSoTimeout(1000);
			socket.setSoLinger(true, 10);
			while(readReady()){
				do {
					try {
						System.exec("/bin/cat");
					} catch (IOException e) {
						e.printStackTrace();
					  //continue;
					}
				} while (readReady());
			}
			socket.close();*/
		}

		@Override public String getName() { return this.name; }
		
		@Override public void run() {
}
}