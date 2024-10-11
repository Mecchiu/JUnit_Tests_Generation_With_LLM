// Here's an implementation of the HTMLOutputStreamTest class with ten unit test cases for the reset() method:

package bible.servlet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HTMLOutputStreamTest {

    @Test
    void testResetEmptyBuffer() {
        HTMLOutputStream stream = new HTMLOutputStream();
        String contents = stream.reset();
        assertEquals("", contents);
    }

    @Test
    void testResetNonEmptyBuffer() {
        HTMLOutputStream stream = new HTMLOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        writer.print("Hello, world!");
        writer.flush();
        String contents = stream.reset();
        assertEquals("Hello, world!", contents);
    }

    @Test
    void testResetTwice() {
        HTMLOutputStream stream = new HTMLOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        writer.print("Hello, world!");
        writer.flush();
        String contents1 = stream.reset();
        assertEquals("Hello, world!", contents1);
        writer.print("Goodbye, world!");
        writer.flush();
        String contents2 = stream.reset();
        assertEquals("Goodbye, world!", contents2);
    }

    @Test
    void testResetWithUnicode() {
        HTMLOutputStream stream = new HTMLOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        writer.print("こんにちは世界");
        writer.flush();
        String contents = stream.reset();
        assertEquals("こんにちは世界", contents);
    }

    @Test
    void testResetWithNewlines() {
        HTMLOutputStream stream = new HTMLOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        writer.println("Hello,");
        writer.println("world!");
        writer.flush();
        String contents = stream.reset();
        assertEquals("Hello,\nworld!\n", contents);
    }

    @Test
    void testResetWithFlush() {
        HTMLOutputStream stream = new HTMLOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        writer.print("Hello, world!");
        writer.flush();
        String contents1 = stream.reset();
        assertEquals("Hello, world!", contents1);
        writer.print("Goodbye, world!");
        writer.flush();
        String contents2 = stream.reset();
        assertEquals("Goodbye, world!", contents2);
        writer.print("Hello again, world!");
        String contents3 = stream.reset();
        assertEquals("", contents3);
    }

    @Test
    void testResetWithClose() {
        HTMLOutputStream stream = new HTMLOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        writer.print("Hello, world!");
        writer.close();
        String contents = stream.reset();
        assertEquals("Hello, world!", contents);
    }

    @Test
    void testResetWithNullByte() {
        HTMLOutputStream stream = new HTMLOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        writer.print("Hello,\0world!");
        writer.flush();
        String contents = stream.reset();
        assertEquals("Hello,\0world!", contents);
    }

    @Test
    void testResetWithException() {
        HTMLOutputStream stream = new HTMLOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        writer.print("Hello, world!");
        writer.flush();
        stream.close();
        assertThrows(IOException.class, () -> stream.reset());
    }

    @Test
    void testResetWithLargeBuffer() {
        HTMLOutputStream stream = new HTMLOutputStream();
        PrintWriter writer = new PrintWriter(stream);
        for (int i = 0; i < 1000000; i++) {
            writer.print("x");
        }
        writer.flush();
        String contents = stream.reset();
        assertEquals(1000000, contents.length());
    }

}