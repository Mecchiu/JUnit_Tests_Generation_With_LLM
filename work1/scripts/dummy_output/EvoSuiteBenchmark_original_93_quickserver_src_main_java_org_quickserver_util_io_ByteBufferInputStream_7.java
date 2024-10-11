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
		
    private final static int BUFFER_SIZE = 2048;
    private final static byte BOM = '\ufffd';

    @Test public void testCtor() throws IOException {
    	ByteBufferInputStream bsi = new ByteBufferInputStream();
        InputStream is = bsi;
        // assert that is instanceof ByteBufferInputStream
        assertNotInstance(ByteBufferInputStream.class, is);
        // assert that is instanceof InputStream or OutputStream
        assertNotInstance(InputStream.class, is);
        // assert that is instanceof ByteBuffer
        assertNotInstance(ByteBuffer.class, is);
    }

    /**
    * Read a line of String.
    *
    * @return new line
    */
    private String readLine() throws IOException {
        ByteBufferInputStream bsi = new ByteBufferInputStream(BUFFER_SIZE);
        InputStream is = bsi;
        for (byte [] bytes : bsi) {
            String s = new String(bytes);
            assertNotNull(s);
        }
        return bsi.readLine();
    }
}