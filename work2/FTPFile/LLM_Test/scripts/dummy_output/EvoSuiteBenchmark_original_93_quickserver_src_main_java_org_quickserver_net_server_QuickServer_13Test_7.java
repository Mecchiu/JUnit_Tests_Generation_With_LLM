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
		/**
		Returns PID of the JVM that owns this Test case.
		*/
    public static String getPID() {
        return  ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
    }

		/**
		Test {@link QuickServer#getPID()} with blocking mode.
		It does testing getPID() without blocking call and will block the test class instance running in the service.
		*/
    public static void main(String args[]) {
    //This one will block the test class instance running in the service
		try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {
        }
        //The quick server's PID is set when running the test.
		// The PID in the server is the instance of its own class, 
		// the ID of the thread where the test is running.

        String pid = getPID();

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                System.out.println("Running test: "+getPID());
            }
        }));

        //Get current PID of the test class owner's server
        String result = getPID();
        System.err.println(pid+" is equal to "+result);
    }
}