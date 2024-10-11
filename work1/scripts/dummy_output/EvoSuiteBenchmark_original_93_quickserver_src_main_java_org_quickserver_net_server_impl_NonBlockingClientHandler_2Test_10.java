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
		public static void main(String[] args) {
			String appName;

			//noinspection ResultOfMethodCallIgnored
			System.setProperty("javax.net.ssl.keyStore", "/etc/ssl/ssl.keys");
			System.setProperty("javax.net.ssl.keyStorePassword", "hX3xJdC1Zgk0");
			//noinspection ResultOfMethodCallIgnored
			System.setProperty("javax.net.ssl.keyStoreType", "JKS");

			try {
				NonBlockingClientHandler_2Test testCase = new NonBlockingClientHandler_2Test();

				//testcase.testGetMaxThreadAccessCount();
				appName = testCase.testGetMaxThreadAccessCount();
				System.out.println("\tTest : "+appName);

			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		}

		public NonBlockingClientHandler_2Test() {

		}

		public String testGetMaxThreadAccessCount() throws IOException {
		}
}