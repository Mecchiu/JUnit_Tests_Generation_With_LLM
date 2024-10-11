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
* It contains ten unit test cases for the {@link ByteBufferInputStream#readLine()} method.
*/
class ByteBufferInputStreamTest {

	@Test
	void testReadLine() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
	}
	
	@Test
	void testReadLine2() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
	}
	
	@Test
	void testReadLine3() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
	}
	
	@Test
	void testReadLine4() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
	}
	
	@Test
	void testReadLine5() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
	}
	
	@Test
	void testReadLine6() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
	}
	
	@Test
	void testReadLine7() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
	}
	
	@Test
	void testReadLine8() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
	}
	
	@Test
	void testReadLine9() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
	}
	
	@Test
	void testReadLine10() throws IOException {
		ArrayList bufferList = new ArrayList();
		ByteBuffer byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		ByteBufferInputStream in = new ByteBufferInputStream(bufferList, null, "UTF-8");
		String line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
		line = in.readLine();
		assertNull(line);
		byteBuffer = ByteBuffer.wrap("Hello World\r\n".getBytes());
		bufferList.add(byteBuffer);
		line = in.readLine();
		assertEquals("Hello World", line);
	}
}

// ByteBufferOutputStream.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.util.*;
import org.quickserver.net.server.ClientHandler;
import java.util.logging.*;
import org.quickserver.util.*;

/**
 * This is an OutputStream constructed from list of ByteBuffers. This is
 * used in non-blocking mode.
 *
 * @since 1.4.5
 * @author Akshathkumar Shetty
 */
public class ByteBufferOutputStream extends OutputStream {

    private static final Logger logger = Logger.getLogger(ByteBufferOutputStream.class.getName());

    static {
    }

    /**
     * Sets the debug flag.
     */
    public static void setDebug(boolean flag);

    /**
     * @since 1.4.7
     */
    public static boolean isLoggable(