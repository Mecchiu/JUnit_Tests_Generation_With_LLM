// QuickServer_6Test.java
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
* It contains one unit test case for the {@link QuickServer#stopService()} method.
*/
class QuickServer_6Test {
		static boolean started = false;
		static Server myServer = null;
		static List<Client> clients= new ArrayList<>();

	public QuickServer_6Test(){

		String dataMode = "XmlMode";

		if(ManagementFactory.hasFeature(ManagementFactory.FEATURE_XML_FIELDS))
			dataMode = "XmlStrings";

		if(ManagementFactory.hasFeature(ManagementFactory.FEATURE_MESSAGING)) {

			if (!ManagementFactory.getMXBeanNamespace().getNamespace().equals("http://quickserver.org/ns/"))
				throw new Exception("The server must be in the same namespace from within the same machine");
		}
	}


	// public Object destroy()
	public interface Service {
		public void stopService();
	}

	private static void stopServices() {
		if(started) {
			if( myServer == null)
				throw new Exception("No server"); // Server is dead, no one left

			if (myServer.isRunning()) {
				try {
					myServer.stop();
				} catch(AppException ae) {
					// ignore it
				}

				List<Client> clientList = clients;
				if( clientList!= null) {
					for(Client cl : clientList) {
						try {
							cl.close();
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
					clients.clear();
				}
				// System.out.println("I killed the server.");
				started = false;
			}
		}
	}




	private boolean initialize(String addr, int port, int numThreads, String dataMode, String timeout)
		throws Exception
	{
}
}