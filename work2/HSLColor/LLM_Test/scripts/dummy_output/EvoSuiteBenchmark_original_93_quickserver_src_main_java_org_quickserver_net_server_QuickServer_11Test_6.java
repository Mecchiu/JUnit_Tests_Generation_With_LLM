// QuickServer_11Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_11Test {
		/**
		* A class representing a test case to test the QuickServer.
		*/
    private static class TestCase {
    	/**
    	* The full path to the test case file.
    	*/
    	String testPath = null;
    
        /**
        * The TestCase's name.
        */
        private String name;

        /**
        * The test case's data folder.
        */
        private String dataFolder;

        /**
        * @param aName the test case's name.
        * @param aDataFolder the test case's data folder.
        */
        
    	public TestCase(String aName, String aDataFolder) {
    		name = aName;
    		dataFolder = aDataFolder;
    	}

        /**
        * @return the test case's name.
        */
        public String getName() {
            return name;
        }

        /**
        * @return the test case's data path.
        */
        public String getDataFolder() {
            return dataFolder;
        }
    }

	private static ArrayList<TestCase> testCases = new ArrayList<TestCase>();

    static {
        testCases.add(new TestCase("", ""));
    }
    private static void testCase(TestCase tc) {
        testCases.add(tc);
    }

    /**
     * Test case 1. Load SSLContext.
     */
    @Test
    void test1() {

		/**
		* Open the file for reading.
		*/
		ArrayList<TestCase> testCases = new ArrayList<TestCase>();

		testCases.add(new TestCase("Load SSLContext", TestDataFactory.generateTestData(TestDataFactory.EchoService, false)));

		/**
		* Test SSLContext.
		*/
}
}