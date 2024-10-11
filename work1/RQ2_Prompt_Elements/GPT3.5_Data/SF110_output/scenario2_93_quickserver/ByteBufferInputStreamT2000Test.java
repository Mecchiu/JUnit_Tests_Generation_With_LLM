// Here's an implementation of the test class for ByteBufferInputStream

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ByteBufferInputStreamTest {

    @Test
    void testReadLineEmpty() throws Exception {
        ByteBufferInputStream stream = new ByteBufferInputStream();
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineSingleBuffer() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello\nWorld\n".getBytes());
        ByteBufferInputStream stream = new ByteBufferInputStream(buffer);
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineMultipleBuffers() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello\n".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap("World\n".getBytes());
        ByteBufferInputStream stream = new ByteBufferInputStream(buffer1, buffer2);
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLinePartialLine() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello\nWorld".getBytes());
        ByteBufferInputStream stream = new ByteBufferInputStream(buffer);
        assertEquals("Hello", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineEmptyBuffer() throws Exception {
        ByteBuffer buffer1 = ByteBuffer.wrap("Hello\n".getBytes());
        ByteBuffer buffer2 = ByteBuffer.allocate(0);
        ByteBuffer buffer3 = ByteBuffer.wrap("World\n".getBytes());
        ByteBufferInputStream stream = new ByteBufferInputStream(buffer1, buffer2, buffer3);
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineEmptyLine() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("\n".getBytes());
        ByteBufferInputStream stream = new ByteBufferInputStream(buffer);
        assertEquals("", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineMultipleLines() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello\n\nWorld\n".getBytes());
        ByteBufferInputStream stream = new ByteBufferInputStream(buffer);
        assertEquals("Hello", stream.readLine());
        assertEquals("", stream.readLine());
        assertEquals("World", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineUnicode() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("こんにちは\n世界\n".getBytes(StandardCharsets.UTF_8));
        ByteBufferInputStream stream = new ByteBufferInputStream(buffer);
        assertEquals("こんにちは", stream.readLine());
        assertEquals("世界", stream.readLine());
        assertNull(stream.readLine());
    }

    @Test
    void testReadLineInterrupted() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello\nWorld\n".getBytes());
        ByteBufferInputStream stream = new ByteBufferInputStream(buffer);
        Thread.currentThread().interrupt();
        assertThrows(InterruptedException.class, () -> stream.readLine());
    }

    @Test
    void testReadLineConcurrent() throws Exception {
        ByteBuffer buffer = ByteBuffer.wrap("Hello\nWorld\n".getBytes());
        ByteBufferInputStream stream = new ByteBufferInputStream(buffer);
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                stream.write(ByteBuffer.wrap("Goodbye\n".getBytes()));
            } catch (Exception e) {
                fail(e);
            }
        });
        thread.start();
        assertEquals("Hello", stream.readLine());
        assertEquals("World", stream.readLine());
        assertEquals("Goodbye", stream.readLine());
        assertNull(stream.readLine());
    }
}