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
	 * Test case 1: reads until write-complete
	 * Verifies that the write is successful or not.
	 * Verifies that there is no additional write-incoming before read-event occurs.
	 * @throws Exception
	 */
	@Test
	public final void test1_readReadWrite() throws Exception {
		
		final ByteBuffer src = ByteBuffer.allocate(500);
		final ByteBuffer dst = ByteBuffer.allocate(10);
		long endtime = 0;
		do {
			src.clear();
			src.put(new byte[dst.capacity()]);
			dst.get(new byte[10]);
			assertTrue(src.hasRemaining());
			assertTrue(dst.hasRemaining());
			assertEquals(dst.position(),src.position());
			assertEquals(dst.put(new byte[10]),dst.position());
			endtime = System.currentTimeMillis() + 100;
		}
		while (System.currentTimeMillis() < endtime);
	}
}