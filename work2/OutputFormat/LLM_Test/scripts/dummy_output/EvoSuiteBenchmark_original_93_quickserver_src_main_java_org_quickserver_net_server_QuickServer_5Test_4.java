// QuickServer_5Test.java
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
* It contains one unit test case for the {@link QuickServer#startService()} method.
*/
class QuickServer_5Test {
		// v1.1
    QuickServer();
    // v1.2
    QuickServer(int port, Server server);
	// v1.3
    QuickServer(int port, Map<String,String> props);

	//  v1.4.0
    QuickServer(int port, Map<String,String> props, Map<String,String> headers, int maxConnections, boolean useBinaryDataMode, int maxIdleConnections, int maxActiveConnions);
	// v1.4.5
    QuickServer(int port, Map<String,String> props, Map<String,String> headers, boolean useBinaryDataMode);
	// v1.5.0
    QuickServer(int port, Class c, Map<String,String> props);

	// v1.4.5
    QuickServer(Map<String,String> params);
	// v1.6.x
	//quickServer(Map<String,String> params);

	//v1.6.x
	public void run();
	//v1.6.x
    private Thread serviceThread;

	public void run()	{
	   if (port == 0){
	      startService();
	   }else if (port == -1){
		  try {
			  serviceThread.join(10000);
			} catch( InterruptedException e) {
				e.printStackTrace();
			}
		  if (!serviceThread.isAlive()){
			  serviceThread = new Thread(this);
			  serviceThread.start();
		  }
		  //get a free port
		  port = ManagementFactory.getMemoryMXBean().getAvailableProcessors();
		  port = port / 2;
		  System.err.println("starting QuickServer on port: "+port);
		  try {
		      serviceThread.join(10000);
		  } catch( InterruptedException e ) {
			  e.printStackTrace();
		  }
		  if (!serviceThread.isAlive()){
		    serviceThread = new Thread(this);
		    serviceThread.start();
		  }

	  } else {
	      System.out.println("Port is already open ("+port+")!");
	  }

  }
}