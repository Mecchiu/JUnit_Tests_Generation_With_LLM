// QuickServer_2Test.java
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
* It contains one unit test case for the {@link QuickServer#getNewLine()} method.
*/
class QuickServer_2Test {
		
	/**
	* @since 1.4.8
	* @throws  SecurityException 
	*/
	@Test
	public void testGetNewLine() throws SecurityException {
		
		System.out.println(getNewLine());
	}
	
	/**
	* @since 1.4.8
	* @throws  SecurityException 
	*/
	@Test
	public void testIsClosed() throws SecurityException {
		
		boolean closed = false;
		try {
			QuickServer.isClosed();
		} catch (IOException ex) {
			closed = true;
		}
		assertEquals("exception should be java.io.Errno.EADBUSY", closed, True);
	}
	
	/**
	* @since 1.4.8
	* @throws  SecurityException 
	*/
	@Test
	public void testIsShutdown() throws SecurityException {

		boolean shutdown = false;
		try {
			QuickServer.isShutdown();
		} catch (IOException ex) {
			shutdown = true;
		}
		assertEquals("exception should be java.io.Errno.EADBUSY", shutdown, True);
	}
	
	/**
	* @since 1.4.8
	* @throws  SecurityException 
	*/
	@Test
	public void testIsOpen() throws SecurityException {

		boolean open = false;
		try {
			QuickServer.isOpen();
		} catch (IOException ex) {
			open = true;
		}
		assertEquals("exception should be java.io.Errno.EADBUSY", open, True);
	}

	/**
	* @since 1.4.10
	* @throws  SecurityException 
	*/
 	@Test
	public void testQuit() throws SecurityException {
		
		try {
			QuickServer.quit();
			fail("Exception is expected but got " + e);
		} catch (Exception e) {
			if (e instanceof IOException) {
				
			}
			
		}
	}
}