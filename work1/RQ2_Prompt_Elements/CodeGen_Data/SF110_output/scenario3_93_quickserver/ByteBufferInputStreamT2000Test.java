// ByteBufferInputStreamTest.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.util.*;
import org.quickserver.net.server.ClientHandler;
import java.util.logging.*;
import org.quickserver.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferInputStream}.
* It contains one unit test case for the {@link ByteBufferInputStream#readLine()} method.
*/
class ByteBufferInputStreamTest {
private static final Logger log = LogManager.getLogger(
			"com.jtransc.javanet.Transcoder");
			private static final Logger errorLog =
				LogManager.getLogger("com.jtransc.javanet.errorlog");

	// test cases
	private StringBuffer bb;
		private ClientHandler ch;
	private InputStream is;
	// constructor
		
	// constructor
		
	// instance methods
	@Test
	public void testReadLine() throws IOException {
		bb = new StringBuffer();
        // start by writing a newline character
        bb.append('\n').append(0);
		ch.sendString(bb.toString());
        // wait for connection to be up
        int count = 10;
        while (is.available() > 0 && count > 0) {
            count--;
            Thread.sleep(30);
		}
		// assert number of bytes read (including newline) is the expected read
        assertTrue(is.available() == 0);
		assertEquals(bb.toString(), readLine());
    }

	@Test
	public void testReadLine_Non_blocking() throws IOException {
		is = new ByteBufferInputStream();
		is.start();
		assertFalse(is.isConnectionLost());
		assertTrue(bb.length() > 0);
		String s = readLine();
    }
	

	@Test
	public void testReadLine_Unbuffered() throws IOException {
		is = new ByteBufferInputStream();
		log.info("Unbuffered case.");
		bb = new StringBuffer();
		ch.sendString(bb.toString());
		is.close();
		assertTrue(bb.length() == 0);
		String s = readLine();
    }
	/**
	* test of the constructor.
	*/
	@Test
	public void testConstructor() throws IOException {
		ch = new ClientHandler("localhost", 80, true, "0", null);
		ch.setSocketTimeout(3 * 1000);
	// test constructor
	}
    

	@Test
	public void testStopRead() throws IOException {
		ch.sendString("test");
		is.join(5000);
		String s = readLine(); assertEquals("test", s);
		ch.close();
		// wait for close
		Thread.sleep(100);
	}

	/*
	 * test of <code>read(ByteBuffer)</code> method in blocking mode.
	*/
	@Test
	public void testReadWithByteBuffer() throws IOException {

		is = new ByteBufferInputStream();
        // send string to server
        bb = new StringBuffer(12);
		bb.append((char) 'A');
		bb.append((char) 'B');
		bb.append((char) 'C');
		bb.append((char) 'D');
		bb.append((char) 'E');
		bb.append((char) 'F');
		bb.append((char) 'G');
		ch.sendString(bb.toString());
        // send ack with bytes
		is.start();
		ch.sendString(ByteBuffer.wrap(1));
        // wait for connection to be ready
	  int count = 10;
	  int bytes = 0;
	  while (is.available() > 0 && bytes < 12) {
	    bytes += 10;
	    Thread.sleep(30);
	    count--;
	  }


	  if (is.isConnectionLost()) {
	    throw new IllegalStateException("Server did not send bytes in time");
	  }
	  assertTrue("Number of bytes read is not equal to 12", count == 12);
	  assertEquals(12, bytes);

		// make sure read method works by getting the byte buffer as a result
		byte[] b = new byte[12];
		is.read(b);
		is.close();
		ch.close();
	}
}
