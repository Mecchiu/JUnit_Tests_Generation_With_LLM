// QuickServer_7Test.java
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
* It contains one unit test case for the {@link QuickServer#suspendService()} method.
*/
class QuickServer_7Test {
		
    // Initialize test
    public static void main(String args[]) {
        try {
            assertNotNull(QuickServer_7Test.class.getName());
        } catch (Exception e) {
            System.err.println("Can't create class "+QuickServer_7Test.class.getName());
        }
    }

    // DataMode to test
    public static final String DataMode = "String";

    // Number of concurrent threads
    public int threadCount;

	//  A list of services that need to be initialized to begin with.
	public static QuickServer instance = null;
	
	/**
	 * Main function. It does all the work.
	 */
	public static void main(String[] args) {

        // if there is no instance then create it
		if (instance == null) {

			// create instance
			QuickServer_7Test testInstance = new QuickServer_7Test();

			// start service
			instance = testInstance;

			// save instance
			instance.save(instance.getClass().getName());

			// start test
			testInstance.start();
		}

        // test
	    Test testInstance = new Test();

	    testInstance.setTestMode(true);

	    // save instance
	    Test testInstance = instance.save(instance.getClass().getName());

	    // start test
	    testInstance.start();
	}

        // set the test mode
        boolean testMode = false;

	/**
	* Starts all tests in testMode.
	*/
	public void start() {

		// clear out the test instance
		instance = null;

			// for each thread
}
}