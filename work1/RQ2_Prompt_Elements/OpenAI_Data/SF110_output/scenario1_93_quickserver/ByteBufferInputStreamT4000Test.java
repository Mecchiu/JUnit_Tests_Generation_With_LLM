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
        } else if ((off < 0) || (off > b.length) || (len < 0) ||
                ((off + len) > b.length) || ((off + len) < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return;
        }
        ByteBuffer bb = ByteBuffer.wrap(b, off, len);
        addByteBuffer(bb);
    }

    public synchronized void write(int b) throws IOException {
        byte[] buf = new byte[1];
        buf[0] = (byte) (b & 0xff);
        ByteBuffer bb = ByteBuffer.wrap(buf);
        addByteBuffer(bb);
    }
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
* It contains ten unit test cases for the {@link ByteBufferOutputStream#write(byte[], int, int)} method.
*/
class ByteBufferOutputStreamTest {
		
	@Test
	void testWrite() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.write("Hello".getBytes(), 0, 5);
		bbos.write("\r\n".getBytes(), 0, 2);
		bbos.write("World".getBytes(), 0, 5);
		bbos.write("\r\n".getBytes(), 0, 2);
		bbos.write("!".getBytes(), 0, 1);
		bbos.write("\r\n".getBytes(), 0, 2);
		ByteBufferInputStream bbis = new ByteBufferInputStream(bbos.getByteBuffers());
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testWrite2() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.write("Hello\r\n".getBytes(), 0, 7);
		bbos.write("World\r\n".getBytes(), 0, 7);
		bbos.write("!".getBytes(), 0, 1);
		bbos.write("\r\n".getBytes(), 0, 2);
		ByteBufferInputStream bbis = new ByteBufferInputStream(bbos.getByteBuffers());
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testWrite3() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.write("Hello\r\n".getBytes(), 0, 7);
		bbos.write("World\r\n".getBytes(), 0, 7);
		bbos.write("!".getBytes(), 0, 1);
		bbos.write("\r\n".getBytes(), 0, 2);
		ByteBufferInputStream bbis = new ByteBufferInputStream(bbos.getByteBuffers());
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testWrite4() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.write("Hello\r\n".getBytes(), 0, 7);
		bbos.write("World\r\n".getBytes(), 0, 7);
		bbos.write("!".getBytes(), 0, 1);
		bbos.write("\r\n".getBytes(), 0, 2);
		ByteBufferInputStream bbis = new ByteBufferInputStream(bbos.getByteBuffers());
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testWrite5() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.write("Hello\r\n".getBytes(), 0, 7);
		bbos.write("World\r\n".getBytes(), 0, 7);
		bbos.write("!".getBytes(), 0, 1);
		bbos.write("\r\n".getBytes(), 0, 2);
		ByteBufferInputStream bbis = new ByteBufferInputStream(bbos.getByteBuffers());
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testWrite6() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.write("Hello\r\n".getBytes(), 0, 7);
		bbos.write("World\r\n".getBytes(), 0, 7);
		bbos.write("!".getBytes(), 0, 1);
		bbos.write("\r\n".getBytes(), 0, 2);
		ByteBufferInputStream bbis = new ByteBufferInputStream(bbos.getByteBuffers());
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testWrite7() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.write("Hello\r\n".getBytes(), 0, 7);
		bbos.write("World\r\n".getBytes(), 0, 7);
		bbos.write("!".getBytes(), 0, 1);
		bbos.write("\r\n".getBytes(), 0, 2);
		ByteBufferInputStream bbis = new ByteBufferInputStream(bbos.getByteBuffers());
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testWrite8() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.write("Hello\r\n".getBytes(), 0, 7);
		bbos.write("World\r\n".getBytes(), 0, 7);
		bbos.write("!".getBytes(), 0, 1);
		bbos.write("\r\n".getBytes(), 0, 2);
		ByteBufferInputStream bbis = new ByteBufferInputStream(bbos.getByteBuffers());
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis.readLine());
	}
	
	@Test
	void testWrite9() throws IOException {
		ByteBufferOutputStream bbos = new ByteBufferOutputStream();
		bbos.write("Hello\r\n".getBytes(), 0, 7);
		bbos.write("World\r\n".getBytes(), 0, 7);
		bbos.write("!".getBytes(), 0, 1);
		bbos.write("\r\n".getBytes(), 0, 2);
		ByteBufferInputStream bbis = new ByteBufferInputStream(bbos.getByteBuffers());
		assertEquals("Hello", bbis.readLine());
		assertEquals("World", bbis.readLine());
		assertEquals("!", bbis