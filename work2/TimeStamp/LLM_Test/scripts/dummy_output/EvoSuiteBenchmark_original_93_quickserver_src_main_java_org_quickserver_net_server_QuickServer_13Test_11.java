// QuickServer_13Test.java
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
* It contains one unit test case for the {@link QuickServer#getPID()} method.
*/
class QuickServer_13Test {
		QuickServer_13Test() {
		}
		@Test
		public void run() {
			System.out.println("Started QUICKSERVER@");
			
			System.out.println("PID of JVM : "+QuickServer.getPID());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				StringBuilder strBuilder = new StringBuilder();
				e.printStackTrace(strBuilder);
				System.err.println(strBuilder.toString());
			}
			
    		System.out.println("Getting System.getpid()");
			String pid = String.valueOf(System.getpid());
			System.out.println("PID of JVM is : "+pid);
			
    		System.out.println("Starting to start the server");
      		QuickServer.getPID() == pid  || QuickServer.getPID() == 0?
      	        true : false;
			
			System.out.println("Getting System.getpid()");
			String pid2 = String.valueOf(System.getpid());
			System.out.println("PID of JVM is : "+pid2); 

    		System.out.println("Starting to start the server");
      		QuickServer.getPID() == pid  || QuickServer.getPID() == 0?
      	        true : false;
			
			System.out.println("Started QUICKSERVER@");
		}
	
		
}