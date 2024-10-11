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
		/**
         * Test class constructor.
         * @since v1.3
         */
    private NonBlockingClientHandler_2Test() {
    }
}

/**
*/
class NonBlockingClientHandler_2Test2 {

		/**
         * Test class.
         * @since v1.4
         */
    public static class NonBlockingClientHandler_2Test2Test implements Runnable {

        private NonBlockingClientHandler_2Test2 testClientHandler;

        private Object lock;

        /**
        * Creates a new instance of NonBlockingClientHandler_2Test by the specified clientHandler.
        * @since v1.3
        */
        public NonBlockingClientHandler_2Test2Test(NonBlockingClientHandler_2Test2 testClientHandler) {
            this.testClientHandler = testClientHandler;
            this.lock = Synchronized.newLock(testClientHandler);
        }

        private synchronized NonBlockingClientHandler_2Test2Test() {
            super();
            this.testClientHandler = null;
            this.lock = null;
        }

        /**
         * Invoke the testClientHandler.
         * @since v1.4
         */
        public synchronized void run() {
            this.testClientHandler.run();
        }
    }
}