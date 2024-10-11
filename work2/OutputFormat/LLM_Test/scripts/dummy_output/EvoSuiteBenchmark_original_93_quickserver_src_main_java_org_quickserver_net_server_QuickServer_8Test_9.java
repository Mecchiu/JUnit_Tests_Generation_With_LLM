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
		public static void main(String args[]) {
			QuickServer test = new QuickServer();
			test.startServer();
		}
			public void startServer(){
        final QuickServer client;
        try {
      	System.setProperty("java.rmi.server.hostname", "127.0.0.1");
    	System.setProperty("java.rmi.server.registry", "com.ibm.ws.registry.ServerRegistryImpl");
  		client = new QuickServer_8Test ();
	    int port = 6666;
		} catch (UnsatisfiedLinkError e) {
			System.err.println("Quick server can not be started.");
			e.printStackTrace();
		}
		try {
			for (;;) {
				try {
        //waitForServer();
        client.resumeService();
				break;
	    }
				catch (Exception e) {
				}
			}
  		//client.startServer();
			client.resumeService();
		} catch (Exception e) {
			e.printStackTrace();
		}
}

/**
 * Simple utility class for the tests. It contains four methods for test cases.
*/
class QuickServer_8Test  extends QuickServer{
		final String commandHandler;    // a class representing the command handler to use
		final int      port;            // the port we wish to open
		/*
		  The only way to test this is inside tests.
		*/
		public QuickServer(){
			this("EchoServer","4600",1234);
		}
		public QuickServer(String host,int port,int port2){
		  super(host,port,port2);
		  commandHandler = "quick";
            super.startServer();
        	  this.port = 7777;
		}

		/*
		  The only way to test this is inside tests.
		*/
		@Override
		public char[] commandHandler(String arg0){
			return super.commandHandler(commandHandler+arg0).toCharArray();
		}


		@Override
		public <T> T invoke(Class<T> arg0,String argu,boolean argd,T argo){
			return super.invoke(commandHandler,argu,argd,argo);
		}

}
}