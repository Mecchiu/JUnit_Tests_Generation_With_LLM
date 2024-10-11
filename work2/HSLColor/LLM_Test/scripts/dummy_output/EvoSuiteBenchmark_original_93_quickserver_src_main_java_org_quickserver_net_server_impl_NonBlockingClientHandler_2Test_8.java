// NonBlockingClientHandler_2Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains one unit test case for the {@link NonBlockingClientHandler#getMaxThreadAccessCount()} method.
*/
class NonBlockingClientHandler_2Test {
		private static final Logger logger = Logger.getLogger("NonBlockingClientHandler_2Test");
		
		private static int maxThreadAccessCount = 5;
		
		public NonBlockingClientHandler_2Test() {
			super();
		}

	@Test
	public void testNonBlockingClientHandler_1() throws Exception {
	
		logger.log(Level.INFO, "TestNonBlockingClientHandler_1: doNotAllowTasks");	
		doTasks();
		assertEquals(maxThreadAccessCount, NonBlockingClientHandler.getMaxThreadAccessCount());
	}

	@Test
	public void testNonBlockingClientHandler_2() throws Exception {
	
		logger.log(Level.INFO, "TestNonBlockingClientHandler_2: initial handshake");
		try {
			NonBlockingClientHandler.doHandshake();
			fail("DoHandshake not expected to work.");
		} catch (ConnectionLostException expected) {}
		
		logger.log(Level.INFO, "TestNonBlockingClientHandler_2: readInput");
		try {
			doRead();
			assertEquals(1, readByteBuffer.size());
		} catch (IOException iae) {
			fail("Read does not happen from the stream.");
		}

		//this will take no significant while
		doTasks();

		logger.log(Level.INFO, "TestNonBlockingClientHandler_2: readInput");
		try {
			doRead();
			assertEquals(1, readByteBuffer.size());
		} catch (IOException iae) {
			fail("Read does not happen from the stream.");
		}
		
		try {
			doWrite();
			assertEquals(1, writeByteBuffer.size());
		} catch (IOException iae) {
			fail("Write does not happen from the stream.");
		}

		NonBlockingClientHandler.doNonBlockingClientHandler_2.doHandshake();
}
}