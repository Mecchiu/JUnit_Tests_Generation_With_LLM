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
	 * Main method of {@link QuickServer_13Test}.
	 */
	@Test
	public void getPID_Test()throws Exception{
		assertNotNull("The JVM PID is not set", getPID());
	}
	
	/**
	 * Test the {@link QuickServer#run()} run method.
     * Since this is a blocking method, the {@link java.lang.Thread#interrupt()}
     * shall be called at the end of the run method that blocks until the
     * shutdown has been completed.
     *
	 */
	@Test
	public void run_Test(){
		
		try{
			long start = System.currentTimeMillis();
			
			Thread thread = new Thread(new Runnable(){

				public void run(){
					while (true) {
						try {
							Thread.sleep(10);
						} catch (InterruptedException ex) {
							System.out.println(ex);
						}
					}
				}
			});
			thread.start();
			thread.join(2000);

			assertNotNull("The Thread is null", thread);
			assertTrue("Thread is still alive", thread.isAlive());
			assertTrue("Thread count is still 1", thread.isAlive() && thread.getName().contains(Quickserver.class.getSimpleName()+"."+String.valueOf(thread.getId())));
		}catch(Exception ex){
			System.out.println("Exception");
			ex.printStackTrace();
			fail("Exception");
		}
	}

	/**
	 * Test {@link QuickServer#run()} is blocking mode.
	 */
	@Test
	public void run_blocking_Test(){
		
		try{
			assertTrue("The JVM PID can be set", getPID()!=null);
			long end = System.currentTimeMillis();
		
			long sleepTime = end-start;

			assertTrue("run() should return immediately", sleepTime >= 10);
		}catch(Exception ex){
			System.out.println("Exception");
			ex.printStackTrace();
			fail("Exception");
		}
	}

}