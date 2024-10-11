// QuickServer_8Test.java
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
* It contains one unit test case for the {@link QuickServer#resumeService()} method.
*/
class QuickServer_8Test {
		
	static final boolean debug = System.getProperty("debug")!= null? true : false;
	static final boolean quiet = System.getProperty("quiet")!= null? true : false;

	//private static int port;
	//private static String address;
	private static MySQLSession session;
	private static int port;

	static{
		try {
			address = new InetAddress("0.0.0.0").getHostAddress();
		} catch(UnknownHostException e) {
			address = "0.0.0.0";
		}
		port = AvailablePort.getRandomAvailablePort(AvailablePort.SOCKET);
	}
	
	private static class MySQLSession implements SQLSession {
		
		private XmlQueueServer xmlQueueServer = null;

		private boolean ready = false;
		private String xpath = null;

		private volatile ClientHandler clientHandler = null;
		private volatile ClientCommandHandler clientCommandHandler = null;
		private volatile ServerCommandHandler serverCommandHandler = null;
		private volatile ServerEventHandler serverEventHandler = null;
		private volatile ClientBinaryHandler clientBinaryHandler = null;
		private volatile ClientDataChannel clientDataChannel = null;
		private volatile ClientExtendedEventHandler clientExtendedEventHandler = null;
		private volatile ClientWriteHandle writeHandle = null;
		private volatile ClientAuthenticationHandler clientAuthenticationHandler = null;
		private volatile ClientDataHandler clientDataHandler = null;

		public void setXpath(String xpath) {
			this.xpath = xpath;
		}

		public String getXpath() {
			return xpath;
		}
		
		public void setXpathAsString(String xpath) throws Exception
		{
			setXpath(xpath.replace("$QSS_INSTANCE_ID", "" + getInstanceId()));
		}
		
		public void setXpathTimeout(int timeout) throws Exception
		{
			setXpath(xmlQueueServer.getXmlQueueServer().getXpath() + "&timeout=" + timeout);
		}
		
		public ClientBinaryHandler getClientBinaryHandler()
		{
			return clientBinaryHandler;
		}

		public ClientCommandHandler getClientCommandHandler()
		{
			return clientCommandHandler;
		}

}
}