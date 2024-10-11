// ApplicationPreferencesTest.java
package de.huxhorn.lilith.swing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Test class of {@link ApplicationPreferences}.
 * It contains ten unit test cases for the {@link ApplicationPreferences#getMD5(InputStream)} method.
 */
class ApplicationPreferencesTest {

    @Test
    void testNullInputStream() {
        assertNull(ApplicationPreferences.getMD5(null));
    }

    @Test
    void testEmptyInputStream() {
        byte[] expected = new byte[]{(byte) 0xd4, (byte) 0x1d, (byte) 0x8c, (byte) 0xd9, (byte) 0x8f, (byte) 0x00, (byte) 0xb2, (byte) 0x04, (byte) 0xe9, (byte) 0x80, (byte) 0x09, (byte) 0x98, (byte) 0xec, (byte) 0xf8, (byte) 0x42, (byte) 0x7e};
        assertArrayEquals(expected, ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[0])));
    }

    @Test
    void testSingleByteInputStream() {
        byte[] expected = new byte[]{(byte) 0x24, (byte) 0x13, (byte) 0x6b, (byte) 0x6e, (byte) 0x2f, (byte) 0x3d, (byte) 0x4f, (byte) 0x64, (byte) 0x5d, (byte) 0x8f, (byte) 0x46, (byte) 0x1e, (byte) 0x16, (byte) 0x7a, (byte) 0x3b, (byte) 0x52};
        assertArrayEquals(expected, ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[]{42})));
    }

    @Test
    void testMultipleByteInputStream() {
        byte[] expected = new byte[]{(byte) 0x9e, (byte) 0x10, (byte) 0x7d, (byte) 0x9d, (byte) 0x37, (byte) 0x3f, (byte) 0x6f, (byte) 0x3c, (byte) 0x5d, (byte) 0x3c, (byte) 0x5d, (byte) 0x3c, (byte) 0x5d, (byte) 0x3c, (byte) 0x5d, (byte) 0x3c};
        assertArrayEquals(expected, ApplicationPreferences.getMD5(new ByteArrayInputStream("This is a test string".getBytes())));
    }

    @Test
    void testLargeInputStream() {
        byte[] data = new byte[1024 * 1024];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        byte[] expected = new byte[]{(byte) 0x8d, (byte) 0x8e, (byte) 0x9e, (byte) 0x1f, (byte) 0x5f, (byte) 0x5c, (byte) 0x9d, (byte) 0x9e, (byte) 0x5c, (byte) 0x5f, (byte) 0x5c, (byte) 0x5f, (byte) 0x5c, (byte) 0x5f, (byte) 0x5c, (byte) 0x5f};
        assertArrayEquals(expected, ApplicationPreferences.getMD5(new ByteArrayInputStream(data)));
    }

    @Test
    void testIOException() {
        InputStream input = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Test exception");
            }
        };
        assertNull(ApplicationPreferences.getMD5(input));
    }

    @Test
    void testNoSuchAlgorithmException() {
        InputStream input = new ByteArrayInputStream(new byte[0]);
        assertNull(ApplicationPreferences.getMD5(input));
    }

    @Test
    void testCloseException() {
        InputStream input = new InputStream() {
            @Override
            public void close() throws IOException {
                throw new IOException("Test exception");
            }

            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        assertNull(ApplicationPreferences.getMD5(input));
    }

    @Test
    void testNullByteArray() {
        assertNull(ApplicationPreferences.getMD5((byte[]) null));
    }

    @Test
    void testEmptyByteArray() {
        byte[] expected = new byte[]{(byte) 0xd4, (byte) 0x1d, (byte) 0x8c, (byte) 0xd9, (byte) 0x8f, (byte) 0x00, (byte) 0xb2, (byte) 0x04, (byte) 0xe9, (byte) 0x80, (byte) 0x09, (byte) 0x98, (byte) 0xec, (byte) 0xf8, (byte) 0x42, (byte) 0x7e};
        assertArrayEquals(expected, ApplicationPreferences.getMD5(new byte[0]));
    }

    @Test
    void testMultipleByteByteArray() {
        byte[] expected = new byte[]{(byte) 0x9e, (byte) 0x10, (byte) 0x7d, (byte) 0x9d, (byte) 0x37, (byte) 0x3f, (byte) 0x6f, (byte) 0x3c, (byte) 0x5d, (byte) 0x3c, (byte) 0x5d, (byte) 0x3c, (byte) 0x5d, (byte) 0x3c, (byte) 0x5d, (byte) 0x3c};
        assertArrayEquals(expected, ApplicationPreferences.getMD5("This is a test string".getBytes()));
    }
}