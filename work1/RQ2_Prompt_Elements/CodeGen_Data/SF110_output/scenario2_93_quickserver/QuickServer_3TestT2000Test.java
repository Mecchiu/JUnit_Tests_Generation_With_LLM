// QuickServer_3Test.java
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
* It contains one unit test case for the {@link QuickServer#initService(Object[])} method.
*/
class QuickServer_3Test {
/**
		 * @see QuickServer#initService(Object[])
		 */
	public boolean initService(Object[] param) {
		try {
			QuickServerService.initService(param);
		} catch (Exception e) {
			serviceError = e;
			return false;
		}
		return true;
	}
}


//----------------------------
//------------------------------------------------------------------
// QuickServer_2_4_Test.java
//------------------------------------------------------------------
class QuickServer_2_4_Test {

  /**
 * This class executes a very fast test method, and a fast test method with the exception
 * of {@link SocketTimeoutException} in the background.
 * @see TestService
  */
  public static void testService_5() {
    long start; //start time of the test
    start = System.currentTimeMillis();

	Service service;
    try {
      service = new TestService();
    } catch (RuntimeException e) {
      //ignore
    }
    int num = 1;

    while (System.currentTimeMillis() < start+50L) {
      System.out.println(Thread.currentThread().getName()
	+ ": Executing test with " + num + " times");
      try {
	      Thread.sleep(1000);
	} catch (InterruptedException e) {}
      num ++;
    }

  } // end of main program

	public static void main(String args[]) {
	  try {
 	    System.exit(new QuickServer_2_4_Test().testService_5());
	  } catch (Exception e) {
		System.err.println(e.getMessage());
		e.printStackTrace();
		System.exit(1);
	  }
  } // end of main
} // end of class QuickServer_2_4_Test
