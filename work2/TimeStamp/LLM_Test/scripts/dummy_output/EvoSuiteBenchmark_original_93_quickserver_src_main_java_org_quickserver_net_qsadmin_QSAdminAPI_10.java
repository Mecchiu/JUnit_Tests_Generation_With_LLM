// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains one unit test case for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {
		private static final String URL = "http://127.0.0.1:9080/QSAdminAPI?command=logon&password=";

		private String responseString = null;

        private String username;

        private String password;

        private QSAdminAPI qsAdminApi;

        private String testMessage;


		public QSAdminAPITest(String username, String password, String testMessage) {
			this.username = username;
			this.password = password;
			this.testMessage = testMessage;
			}

        /**
        * Sets up the QSAdminAPI object to login and log on the remote QsAdminServer.
        */
        void setUp() {
            // This is called before each test.
            qsAdminApi = new QSAdminAPI(username, password);
        }

        /**
        * Tears down the QSAdminAPI object.
        */
        void tearDown() {
        	if(qsAdminApi!= null) {
        		try {
        			qsAdminApi = null;
        		} catch (IOException e) {
    				e.printStackTrace();
    			}
        	}
        }

        /**
        * Tests if QsAdmin API is correctly set up and log on and log off.
        */
        void test() {

        	if(! qsAdminApi.logon()) {
        		throw new RuntimeException("QSAdmin API failed to logon");	
        	} else {
				if (! qsAdminApi.logon()) {
				    throw new RuntimeException("QSAdminAPI failed to logon");	
				} else {
		        	  System.out.println("---"+ testMessage +"---");
		        	  System.out.println("Testing Server: "+this.username+":"+testMessage);
			 }
		    }
        }

        /**
        * Tests if QsAdmin API is correctly logged on and log off.
        */
        void testLogOnOff() {
        	if(qsAdminApi.logon()) {
        		System.out.println("Successfully logged in");
        		return;
        	} else {
			    System.out.println("Not able to log on");
        	}
        }

        /**
        * Get Test Message.
        */
        public void getTestMsg(){
        	if(! this.testMessage.isEmpty()) {
			if(qsAdminApi.logon().equals("false")) {
				throw new RuntimeException("Login Failed");	
			} else {
				System.out.println("Test Message : "+testMessage);
			}
		}
        }
}