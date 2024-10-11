// Source code for ByteBufferInputStreamTest.java

package org.quickserver.util.io;

import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ByteBufferInputStream}.
 * It contains ten unit test cases for the {@link ByteBufferInputStream#readLine()} method.
 */
class ByteBufferInputStreamTest {

    @Test
    void testReadLineSingleBuffer() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello World\n".getBytes());
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line = stream.readLine();
        assertEquals("Hello World", line);
    }

    @Test
    void testReadLineMultipleBuffers() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello ".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap("World\n".getBytes());
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer1);
        bufferList.add(buffer2);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line = stream.readLine();
        assertEquals("Hello World", line);
    }

    @Test
    void testReadLineEmptyBuffer() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello ".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer3 = ByteBuffer.wrap("World\n".getBytes());
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer1);
        bufferList.add(buffer2);
        bufferList.add(buffer3);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line = stream.readLine();
        assertEquals("Hello World", line);
    }

    @Test
    void testReadLineEmptyBufferAtEnd() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello ".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap("World".getBytes());
        ByteBuffer buffer3 = ByteBuffer.wrap(new byte[0]);
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer1);
        bufferList.add(buffer2);
        bufferList.add(buffer3);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line = stream.readLine();
        assertEquals("Hello World", line);
    }

    @Test
    void testReadLineEmptyBufferInMiddle() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello ".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer3 = ByteBuffer.wrap("World\n".getBytes());
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer1);
        bufferList.add(buffer2);
        bufferList.add(buffer3);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line = stream.readLine();
        assertEquals("Hello World", line);
    }

    @Test
    void testReadLineEmptyBufferInMiddle2() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer3 = ByteBuffer.wrap(" World\n".getBytes());
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer1);
        bufferList.add(buffer2);
        bufferList.add(buffer3);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line = stream.readLine();
        assertEquals("Hello World", line);
    }

    @Test
    void testReadLineEmptyBufferInMiddle3() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello ".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer3 = ByteBuffer.wrap("World".getBytes());
        ByteBuffer buffer4 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer5 = ByteBuffer.wrap("\n".getBytes());
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer1);
        bufferList.add(buffer2);
        bufferList.add(buffer3);
        bufferList.add(buffer4);
        bufferList.add(buffer5);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line = stream.readLine();
        assertEquals("Hello World", line);
    }

    @Test
    void testReadLineEmptyBufferInMiddle4() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello ".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer3 = ByteBuffer.wrap("World".getBytes());
        ByteBuffer buffer4 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer5 = ByteBuffer.wrap("\n".getBytes());
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer1);
        bufferList.add(buffer2);
        bufferList.add(buffer3);
        bufferList.add(buffer4);
        bufferList.add(buffer5);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line1 = stream.readLine();
        String line2 = stream.readLine();
        assertEquals("Hello World", line1);
        assertEquals(null, line2);
    }

    @Test
    void testReadLineEmptyBufferInMiddle5() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello ".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer3 = ByteBuffer.wrap("World".getBytes());
        ByteBuffer buffer4 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer5 = ByteBuffer.wrap("\n".getBytes());
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer1);
        bufferList.add(buffer2);
        bufferList.add(buffer3);
        bufferList.add(buffer4);
        bufferList.add(buffer5);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line1 = stream.readLine();
        String line2 = stream.readLine();
        String line3 = stream.readLine();
        assertEquals("Hello World", line1);
        assertEquals(null, line2);
        assertEquals(null, line3);
    }

    @Test
    void testReadLineEmptyBufferInMiddle6() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello ".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer3 = ByteBuffer.wrap("World".getBytes());
        ByteBuffer buffer4 = ByteBuffer.wrap(new byte[0]);
        ByteBuffer buffer5 = ByteBuffer.wrap("\n".getBytes());
        ArrayList<ByteBuffer> bufferList = new ArrayList<>();
        bufferList.add(buffer1);
        bufferList.add(buffer2);
        bufferList.add(buffer3);
        bufferList.add(buffer4);
        bufferList.add(buffer5);
        ByteBufferInputStream stream = new ByteBufferInputStream(bufferList, null, "UTF-8");
        String line1 = stream.readLine();
        String line2 = stream.readLine();
        String line3 = stream.readLine();
        String line4 = stream.readLine();
        assertEquals("Hello World", line1);
        assertEquals(null, line2);
        assertEquals(null, line3);
        assertEquals(null, line4);
    }
}