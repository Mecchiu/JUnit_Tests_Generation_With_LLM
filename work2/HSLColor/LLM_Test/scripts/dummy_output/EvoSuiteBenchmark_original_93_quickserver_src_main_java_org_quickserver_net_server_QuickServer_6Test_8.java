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
		
	public static TestInstance instance3(String s) throws Exception {
		System.err.println("Test case "+s);
		if(instance == null) {
			init();
			instance = new TestInstance(s);
		}
		return instance;
	}
	
	private static TestInstance instance;
	private static String server_server_url;
	private static volatile Service readyTest_service;
	private static volatile boolean startedService = Boolean.FALSE;
	private static volatile boolean running = Boolean.FALSE;
	private static volatile String port;
	private static volatile String name;
	private static volatile QueueEventHandler queue_event_handler;
	private static volatile ClientCommandHandler client_command_handler;

	private void init() throws Exception {
    
    	// Create Server URL 
    	String urlstr = "tcp://127.0.0.1:3123";
    	
    	// Set Server URL
    	server_server_url = urlstr;
    	
    	//Create a Pool of ClientConnections
    	// Create a ClientConnectionListener which listens for
    	// 	   the connection open event.
    	ClientConnectionManager connectionManager = new ManagedClientConnectionManager();
    	final ClientCommonClientConnectionListener listener
    	=  new ClientCommonClientConnectionListener(connectionManager);
    	
    	// Create a QueueFactory which creates Queue based on QueueFactory.
    	QueueFactory queueFactory = new ManageQueueFactory(getClass().getClassLoader());

    	// Create a Manager which creates ClientHandlers that manage a set of threads
    	//     and a set of queues.
    	//     a. Create a ThreadGroup that runs all threads.
    	ThreadGroup group = new ThreadGroup();

    	// Create a ManagedClientConnectionManager
    	//     which binds all ClientHandlers.
    	ClientConnectionManager connectionManager1 = new ManagedClientConnectionManager();

    	// Create a ThreadFactory
    	ThreadFactory threadPoolFactory = new ThreadPoolExecutor_FACTORY();

    	ManagedClientConnectionManager connectionManager2 = new ManagedClientConnectionManager();

    	//Create a ClientPool which creates ClientHandlers that manage a set of queues
    	//     and a set of queues.
    	//     a. Create a QueueFactory which creates Queue based on QueueFactory.
}
}