// NonBlockingClientHandler_0Test.java
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
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} method.
*/
class NonBlockingClientHandler_0Test {
		private static class S1 implements Runnable {
			private static void testMethod(int arg0, int arg1, int arg2) {
				return;
			}
		}

		/**
		* Create a test file for a nonblocking client handshake attempt. There is no need to call
		* {@link ClientServerFactory#createServer} or {@link ClientServerFactory#createSelector} to produce a
		* server to be generated to run the test.
		*/
		static public void testMethod() {
			NonBlockingClientHandler.clear();
}
}