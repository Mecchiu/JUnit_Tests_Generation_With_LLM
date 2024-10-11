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
    void testGetMD5WithNullInput() {
        assertNull(ApplicationPreferences.getMD5(null));
    }

    @Test
    void testGetMD5WithEmptyInput() {
        byte[] expected = new byte[]{-84, -19, 0, 5, 115, 114, 0, 19, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 65, 114, 114, 97, 121, 76, 105, 115, 116, 0, 0, 0, 0, 0, 0, 0, 0};
        InputStream input = new ByteArrayInputStream(new byte[0]);
        assertArrayEquals(expected, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testGetMD5WithSmallInput() {
        byte[] expected = new byte[]{87, -38, -98, -91, -47, -98, 56, -91, -47, -98, 56, -91, -47, -98, 56, -91};
        InputStream input = new ByteArrayInputStream("Hello, world!".getBytes());
        assertArrayEquals(expected, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testGetMD5WithLargeInput() {
        byte[] expected = new byte[]{-47, -98, 56, -91, -47, -98, 56, -91, -47, -98, 56, -91, -47, -98, 56, -91};
        byte[] data = new byte[1024 * 1024];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        InputStream input = new ByteArrayInputStream(data);
        assertArrayEquals(expected, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testGetMD5WithException() {
        InputStream input = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Test exception");
            }
        };
        assertNull(ApplicationPreferences.getMD5(input));
    }

    @Test
    void testGetMD5WithReset() throws Exception {
        byte[] expected = new byte[]{87, -38, -98, -91, -47, -98, 56, -91, -47, -98, 56, -91, -47, -98, 56, -91};
        InputStream input = new ByteArrayInputStream("Hello, world!".getBytes());
        input.mark(0);
        byte[] result1 = ApplicationPreferences.getMD5(input);
        input.reset();
        byte[] result2 = ApplicationPreferences.getMD5(input);
        assertArrayEquals(expected, result1);
        assertArrayEquals(expected, result2);
    }

    @Test
    void testGetMD5WithMultipleReads() throws Exception {
        byte[] expected = new byte[]{87, -38, -98, -91, -47, -98, 56, -91, -47, -98, 56, -91, -47, -98, 56, -91};
        InputStream input = new ByteArrayInputStream("Hello, world!".getBytes());
        byte[] buffer = new byte[5];
        input.read(buffer);
        input.read(buffer);
        input.read(buffer);
        byte[] result = ApplicationPreferences.getMD5(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetMD5WithSkip() throws Exception {
        byte[] expected = new byte[]{87, -38, -98, -91, -47, -98, 56, -91, -47, -98, 56, -91, -47, -98, 56, -91};
        InputStream input = new ByteArrayInputStream("Hello, world!".getBytes());
        input.skip(7);
        byte[] result = ApplicationPreferences.getMD5(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetMD5WithClose() throws Exception {
        byte[] expected = new byte[]{87, -38, -98, -91, -47, -98, 56, -91, -47, -98, 56, -91, -47, -98, 56, -91};
        InputStream input = new ByteArrayInputStream("Hello, world!".getBytes());
        input.close();
        assertNull(ApplicationPreferences.getMD5(input));
    }

    @Test
    void testGetMD5WithResetAfterClose() throws Exception {
        byte[] expected = new byte[]{87, -38, -98, -91, -47, -98, 56, -91, -47, -98, 56, -91, -47, -98, 56, -91};
        InputStream input = new ByteArrayInputStream("Hello, world!".getBytes());
        input.close();
        input.reset();
        assertNull(ApplicationPreferences.getMD5(input));
    }
}