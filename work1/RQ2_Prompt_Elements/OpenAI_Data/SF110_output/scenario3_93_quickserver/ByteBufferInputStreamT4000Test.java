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
	public void testReadLine() throws IOException {
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
		assertNull(bbis.readLine());
	}
	
	@Test
	public void testReadLine2() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
		assertNull(bbis.readLine());
	}
	
	@Test
	public void testReadLine3() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
		assertNull(bbis.readLine());
	}
	
	@Test
	public void testReadLine4() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
		assertNull(bbis.readLine());
	}
	
	@Test
	public void testReadLine5() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
		assertNull(bbis.readLine());
	}
	
	@Test
	public void testReadLine6() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
		assertNull(bbis.readLine());
	}
	
	@Test
	public void testReadLine7() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
		assertNull(bbis.readLine());
	}
	
	@Test
	public void testReadLine8() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
		assertNull(bbis.readLine());
	}
	
	@Test
	public void testReadLine9() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
		assertNull(bbis.readLine());
	}
	
	@Test
	public void testReadLine10() throws IOException {
		ByteBufferInputStream bbis = new ByteBufferInputStream();
		bbis.addByteBuffer(ByteBuffer.wrap("Hello\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("World\r\n".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("!".getBytes()));
		bbis.addByteBuffer(ByteBuffer.wrap("\r\n".getBytes()));
		
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
		assertNull(bbis.readLine());
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

    /**
     * Writes a line of String.
     */
    public synchronized void writeLine(String line) throws IOException;
}

// ByteBufferOutputStreamTest.java
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
* Test class of {@link ByteBufferOutputStream}.
* It contains ten unit test cases for the {@link ByteBufferOutputStream#writeLine(String)} method.
*/
class ByteBufferOutputStreamTest {
		
	@Test
	public void testWriteLine() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[0].array()));
		assertEquals("World\r\n", new String(bb[1].array()));
		assertEquals("!\r\n", new String(bb[2].array()));
	}
	
	@Test
	public void testWriteLine2() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[0].array()));
		assertEquals("World\r\n", new String(bb[1].array()));
		assertEquals("!\r\n", new String(bb[2].array()));
	}
	
	@Test
	public void testWriteLine3() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[0].array()));
		assertEquals("World\r\n", new String(bb[1].array()));
		assertEquals("!\r\n", new String(bb[2].array()));
	}
	
	@Test
	public void testWriteLine4() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[0].array()));
		assertEquals("World\r\n", new String(bb[1].array()));
		assertEquals("!\r\n", new String(bb[2].array()));
	}
	
	@Test
	public void testWriteLine5() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[0].array()));
		assertEquals("World\r\n", new String(bb[1].array()));
		assertEquals("!\r\n", new String(bb[2].array()));
	}
	
	@Test
	public void testWriteLine6() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[0].array()));
		assertEquals("World\r\n", new String(bb[1].array()));
		assertEquals("!\r\n", new String(bb[2].array()));
	}
	
	@Test
	public void testWriteLine7() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[0].array()));
		assertEquals("World\r\n", new String(bb[1].array()));
		assertEquals("!\r\n", new String(bb[2].array()));
	}
	
	@Test
	public void testWriteLine8() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[0].array()));
		assertEquals("World\r\n", new String(bb[1].array()));
		assertEquals("!\r\n", new String(bb[2].array()));
	}
	
	@Test
	public void testWriteLine9() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[0].array()));
		assertEquals("World\r\n", new String(bb[1].array()));
		assertEquals("!\r\n", new String(bb[2].array()));
	}
	
	@Test
	public void testWriteLine10() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.writeLine("Hello");
		bbos.writeLine("World");
		bbos.writeLine("!");
		
		ByteBuffer[] bb = bbos.getByteBuffers();
		assertEquals(3, bb.length);
		assertEquals("Hello\r\n", new String(bb[