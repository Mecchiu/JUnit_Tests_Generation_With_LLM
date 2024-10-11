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
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testReadLine2() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testReadLine3() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testReadLine4() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testReadLine5() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testReadLine6() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testReadLine7() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testReadLine8() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testReadLine9() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testReadLine10() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
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

    public synchronized void write(byte[] b, int off, int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if ((off < 0) || (off > b.