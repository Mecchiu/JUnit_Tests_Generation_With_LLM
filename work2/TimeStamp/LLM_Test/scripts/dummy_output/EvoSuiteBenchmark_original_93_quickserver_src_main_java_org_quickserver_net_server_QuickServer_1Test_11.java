// QuickServer_1Test.java
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
* It contains one unit test case for the {@link QuickServer#getVersionNo()} method.
*/
class QuickServer_1Test {
		
	/**
	* Returns version of QuickServer library.
	*
	* @since 1.2
	*/
	public static float getVersionNo();
		

	/**
	**/

	public void test() throws Exception {
		
		System.out.println("** Start");
		
		/**
		* Create some clients that can be tested.
		*/
		
		// 1.Create SimpleServer(quickServer.EchoCommandHandler.class)
		ClientConfiguration c = new ClientConfiguration();
		c.setName("Echo Server");
		
		ServerInfo info = new ServerInfo();
		info.setName("Echo Server v1.0");

		Server server = ServerFactory.lookup("Echo Server");;
		
		Client client = new Client(server, info); 
		client.createClient();
		System.setOut(new PrintWriter(System.out,true));
		client.config.setDataMode(DataMode.String);
		
		System.setOut(null);
		System.out.println("Test: Echoserver");
		
		/**
		* Setup server and client.
		*
		* Use ClientHandler to get data for communication
		*/
		
		server.configure(c); 
		System.setOut(new PrintWriter(System.out,true));

		// 2.Initialize connection information of the client
		ClientConfig configClient = new ClientConfig();
		configClient.setName("Echo Server v1.0");
		configClient.addCharSet("UTF-8");
		configClient.setPort(4123);
		configClient.setDataMode(DataMode.String);
		
		System.setOut(null);
		System.out.println("Test: Echoserver initial info: "+configClient.getClientInfo());

		// 3.Initialize connection information of the client
		System.setOut(new PrintWriter(System.out,true));

		// 4. Start the server by calling the server factory method
		System.out.println("Starting server with clients ");
		ServerFactory.startServer(server);
		
		
		// 5.Get a reference to the client handler
		Object cli = server.getClientHandler();
		
		// 6.Handle the client command request
//		System.out.println("Client command handler test");
//		cli = server.setClientCommandHandler("clientHandler");
//		assert
}
}