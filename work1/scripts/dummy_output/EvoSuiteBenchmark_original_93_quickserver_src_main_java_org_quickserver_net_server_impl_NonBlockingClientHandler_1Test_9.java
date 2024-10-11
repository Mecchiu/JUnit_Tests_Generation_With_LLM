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
		private int id;

		/**
		 * Creates a new object.
		 */
		public NonBlockingClientHandler_1Test() {
		}

		/**
		 * Creates a new object.
		 *
		 * @since 1.4.4
		 */
		public NonBlockingClientHandler_1Test(int id) {
			this.id=id;
		}

		/**
		 * Creates a new object.
		 *
		 * @since 1.4.7
		 */
		public NonBlockingClientHandler_1Test() {
			this(null);
		}

		/**
		 * Creates a new object.
		 *
		 * @param id String id
		 *
		 * @since 1.4.7
		 */
		public NonBlockingClientHandler_1Test(String id) {
			this.id = id == null? null : Integer.parseInt(id);
		}

		/**
		 * Gets {@link #id}, {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} status.
		 * @since 1.4.4
		 */
		public int getWakeupSelectorAfterRegisterRead() {
			return id==null?0:id.equals(int.class.getName())?0:id;
		}

		/**
		 * Gets {@link #id}, {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} status.
		 *
		 * @return status
		 *
		 * @since 1.4.4
		 */
		public int getWakeupSelectorAfterRegisterWrite() {
			return id==null?0:id.equals(int.class.getName())?0:id;
		}

}