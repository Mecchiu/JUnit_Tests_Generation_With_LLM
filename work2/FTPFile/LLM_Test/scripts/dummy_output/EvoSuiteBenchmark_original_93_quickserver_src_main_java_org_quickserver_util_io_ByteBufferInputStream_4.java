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
		/**
		* Logger.
		*/
		Logger logger = org.quickserver.util.Log;
	/**
	* System property used to specify an encoding
	*/
	String encoding = StandardCharsets.UTF_8;
	/* Set this to true to verify buffered streams
	** to see exact reading order */
	boolean repeat = true;

/**
* Constructor for ByteBufferInputStreamTest.java.
*/
ByteBufferInputStreamTest() {
}

/**
 * Asserts that buffer is ready.
* If not all of the buffer is ready then the assert will throw an
* IOException.
*/
public class ByteBufferInputStreamTest extends InputStream {
	volatile boolean ready = false;
	/**
	 * Reads the next line,
	 * It may not read anything. This is intended to be
	 * used through unit tests unless the file being read
	 * is not the same file as this.
	 *
	 * @return a line from the buffer. null if no more lines.
	 */
	public synchronized String readLine() throws IOException {
		char[] buffer = new char[10];
		if (!ready) {
			try {
				return readLine(buffer);
			} catch (FileNotFoundException e) {
				throw new IOException("File not found.");
			}
		}

		ready = false;
		int avail = 0;
		int bb_read = -1;
		int bb_put = -1;
		
		for (bb_read = 0; bb_read < 10; ++bb_read) {
			avail = buffer.length;

			try {
				bb_put = fs.read (new FileInputStream(new ByteBufferInputStream(buffer, bb_read) ), avail);
				ready = (bb_put > 0);
				return readLine(buffer);
			} catch (FileNotFoundException e) {
				if (bb_put < 0) {
					break;
				}
				bb_put = -1;
				logger.info(e.toString());
			} catch (IOException e) {
				throw new RuntimeException("Unexpected IOException");
			}
			
			bb_read = fs.read (new FileInputStream(new ByteBufferInputStream(buffer, bb_read) ), avail);
			if (bb_read <= 0 ||!ready) {
				break;
			}
		}

		return "";
	}
	/**
	 * Tests how many chars we get from the input stream. 
	 */
	public String readLine(char[] buffer) throws IOException {
		int avail = 0;
		int bb_put = -1;
		int buf_put = -1;
		byte[] bb_put_buf = null;

		avail = buffer.length;
		try {
			bb_put = fs.write (new FileOutputStream(new ByteBufferOutputStream(buffer)), avail);
		} catch (FileNotFoundException e1) {
		}
		if (bb_put < 0) {
			throw new IOException("Expected write");
		}
		int bb_put_len = fs.available();
		return "" + fs.getBytesRead(bb_put);
	}
	/**
	 * Returns the total number of bytes available to the buffer.
	 * It's a blocking operation. 
	 */
	public int available() throws IOException {
		return fs.available();
	}
	/**
	 * Returns the position of the next character in this buffer
	 * It's a blocking operation. 
	 */
	public synchronized int read() throws IOException {
		char[] buffer = new char[1];
		int chr = 0;

		chr = fs.read (new FileInputStream (new ByteBufferInputStream(buffer) ), 1);
		if (chr!= -1 && (buffer[0] & 0xff)!=0) {
			ready = true;
		}
		return chr;
	}
	/**
	 * Returns the position of the most recent character in this buffer
	 *
	* It's a blocking operation
	*/
	public synchronized int seek (long position) throws IOException {
		return fs.seek (position);
	}}
}