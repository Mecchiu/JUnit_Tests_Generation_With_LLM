// Here's an example implementation of the ByteBufferInputStream and its test class:

// ByteBufferInputStream.java
package org.quickserver.util.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * This is an InputStream constructed from a list of ByteBuffers. This is used in non-blocking mode.
 *
 * @since 1.4.5
 * @author Akshathkumar Shetty
 */
public class ByteBufferInputStream extends InputStream {

    private final List<ByteBuffer> buffers;
    private int currentBufferIndex;
    private int markBufferIndex;
    private int markBufferPosition;
    private int readLimit;

    public ByteBufferInputStream(List<ByteBuffer> buffers) {
        this.buffers = new ArrayList<>(buffers);
        this.currentBufferIndex = 0;
        this.markBufferIndex = 0;
        this.markBufferPosition = 0;
        this.readLimit = -1;
    }

    @Override
    public int read() throws IOException {
        if (!buffers.isEmpty()) {
            ByteBuffer currentBuffer = buffers.get(currentBufferIndex);
            if (currentBuffer.hasRemaining()) {
                return currentBuffer.get() & 0xFF;
            } else if (currentBufferIndex < buffers.size() - 1) {
                currentBufferIndex++;
                return read();
            }
        }
        return -1;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        if (!buffers.isEmpty()) {
            ByteBuffer currentBuffer = buffers.get(currentBufferIndex);
            int remaining = currentBuffer.remaining();
            if (remaining > 0) {
                int bytesToRead = Math.min(len, remaining);
                currentBuffer.get(b, off, bytesToRead);
                return bytesToRead;
            } else if (currentBufferIndex < buffers.size() - 1) {
                currentBufferIndex++;
                return read(b, off, len);
            }
        }
        return -1;
    }

    @Override
    public long skip(long n) throws IOException {
        long skipped = 0;
        while (n > 0 && !buffers.isEmpty()) {
            ByteBuffer currentBuffer = buffers.get(currentBufferIndex);
            int remaining = currentBuffer.remaining();
            if (remaining > 0) {
                int bytesToSkip = (int) Math.min(n, remaining);
                currentBuffer.position(currentBuffer.position() + bytesToSkip);
                skipped += bytesToSkip;
                n -= bytesToSkip;
            } else if (currentBufferIndex < buffers.size() - 1) {
                currentBufferIndex++;
            } else {
                break;
            }
        }
        return skipped;
    }

    @Override
    public int available() throws IOException {
        int available = 0;
        for (int i = currentBufferIndex; i < buffers.size(); i++) {
            available += buffers.get(i).remaining();
        }
        return available;
    }

    @Override
    public synchronized void mark(int readLimit) {
        this.readLimit = readLimit;
        this.markBufferIndex = currentBufferIndex;
        this.markBufferPosition = buffers.get(currentBufferIndex).position();
    }

    @Override
    public synchronized void reset() throws IOException {
        if (readLimit == -1 || currentBufferIndex - markBufferIndex > readLimit) {
            throw new IOException("Resetting to previous mark is not possible");
        }
        currentBufferIndex = markBufferIndex;
        buffers.get(currentBufferIndex).position(markBufferPosition);
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    /**
     * Reads a line of String if ready. If line is not yet ready this will block.
     * To find out if the line is ready use <code>isLineReady()</code>
     *
     * @see #isLineReady()
     */
    public synchronized String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean foundLine = false;
        while (!foundLine) {
            if (!buffers.isEmpty()) {
                ByteBuffer currentBuffer = buffers.get(currentBufferIndex);
                while (currentBuffer.hasRemaining()) {
                    byte b = currentBuffer.get();
                    if (b == '\n') {
                        foundLine = true;
                        break;
                    } else if (b != '\r') {
                        sb.append((char) b);
                    }
                }
                if (!foundLine && currentBufferIndex < buffers.size() - 1) {
                    currentBufferIndex++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return sb.toString();
    }
}

// ByteBufferInputStreamTest.java
package org.quickserver.util.io;

import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ByteBufferInputStream}.
 * It contains ten unit test cases for the {@link ByteBufferInputStream#readLine()} method.
 */
class ByteBufferInputStreamTest {

    @Test
    void testReadLineEmptyBuffer() throws Exception {
        ByteBufferInputStream stream = new ByteBufferInputStream(Collections.emptyList());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineSingleBuffer() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello\nWorld\n".getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(Collections.singletonList(buffer));
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineMultipleBuffers() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello\n".getBytes(StandardCharsets.UTF_8));
        ByteBuffer buffer2 = ByteBuffer.wrap("World\n".getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(Arrays.asList(buffer1, buffer2));
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineEmptyLine() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("\nHello\n\nWorld\n\n".getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(Collections.singletonList(buffer));
        assertEquals("", stream.readLine());
        assertEquals("Hello", stream.readLine());
        assertEquals("", stream.readLine());
        assertEquals("World", stream.readLine());
        assertEquals("", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineCRLF() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello\r\nWorld\r\n".getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(Collections.singletonList(buffer));
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineCR() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello\rWorld\r".getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(Collections.singletonList(buffer));
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineLF() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello\nWorld\n".getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(Collections.singletonList(buffer));
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineLongLine() throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        sb.append("\n");
        ByteBuffer buffer = ByteBuffer.wrap(sb.toString().getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(Collections.singletonList(buffer));
        assertEquals(sb.toString().trim(), stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineMarkReset() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello\n".getBytes(StandardCharsets.UTF_8));
        ByteBuffer buffer2 = ByteBuffer.wrap("World\n".getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(Arrays.asList(buffer1, buffer2));
        stream.mark(10);
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        stream.reset();
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineMarkResetLimit() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello\n".getBytes(StandardCharsets.UTF_8));
        ByteBuffer buffer2 = ByteBuffer.wrap("World\n".getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(Arrays.asList(buffer1, buffer2));
        stream.mark(1);
        assertEquals("H", stream.readLine());
        assertEquals("ello", stream.readLine());
        assertEquals("W", stream.readLine());
        stream.reset();
        assertEquals("H", stream.readLine());
        assertEquals("ello", stream.readLine());
        assertEquals("W", stream.readLine());
        assertNull(stream.readLine());
    }
}