// NonBlockingClientHandler_1Test.java
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
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterRead()} method.
*/
class NonBlockingClientHandler_1Test {
		private static final String DUMMY = "dummy";
			private final String url = "udp://127.0.0.1:8081";
			private final String userName = "";
			private final String password = "";
			private final String certfile = "mycertfile";
			private final boolean debug;

		public NonBlockingClientHandler_1Test(String testCase, String timeout, boolean debug) {
			this.debug = debug;
			this.testCase = testCase;
			this.timeout = timeout;
			//System.out.println(testCase);
			//System.out.println(this.timeout);
		}

		@Test
		public void test() throws Exception {
			NonBlockingClientHandler handler = new NonBlockingClientHandler();
			handler.setSocketTimeout(timeout);

			/*
			for(TestCase tc = 0; tc < testCase.length(); tc++) {
				String testCase = testCase.toLowerCase();
				if (testCase.endsWith("e")) {
					setBlockingMode(false);
				}
			}
			*/

			if (debug) {
				System.out.println("\nStarted test of NonBlockingClientHandler_1Test\n\n");
			}
			Thread testThread = new Thread(new NonBlockingClientHandlerTestThread(handler));
			testThread.start();

			NonBlockingClientHandler_1TestResult result = new NonBlockingClientHandler_1TestResult();
}
}