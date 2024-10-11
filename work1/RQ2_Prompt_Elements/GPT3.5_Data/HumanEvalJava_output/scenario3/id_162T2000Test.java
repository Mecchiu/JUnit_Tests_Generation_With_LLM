import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class StringToMd5 {

    /**
     * Given a string 'text', return its md5 hash equivalent string.
     * If 'text' is an empty string, return null.
     *
     * >>> stringToMd5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
     *
     * > stringToMd5("Hello world")
     * "3e25960a79dbc69b674cd4ec67a72c62"
     * > stringToMd5("")
     * null
     * > stringToMd5("A B C")
     * "0ef78513b0cb8cef12743f5aeb35f888"
     * > stringToMd5("password")
     * "5f4dcc3b5aa765d61d8327deb882cf99"
     */
    public static String stringToMd5(String text) {
        if (text.isEmpty()) {
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(text.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}

// StringToMd5Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {
    @Test
    void testStringToMd5() {
        assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("Hello world"));
        assertNull(StringToMd5.stringToMd5(""));
        assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B C"));
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", StringToMd5.stringToMd5(""));
        assertEquals("9e107d9d372bb6826bd81d3542a419d6", StringToMd5.stringToMd5("The quick brown fox jumps over the lazy dog"));
        assertEquals("c4ca4238a0b923820dcc509a6f75849b", StringToMd5.stringToMd5("1"));
        assertEquals("c81e728d9d4c2f636f067f89cc14862c", StringToMd5.stringToMd5("2"));
        assertEquals("eccbc87e4b5ce2fe28308fd9f2a7baf3", StringToMd5.stringToMd5("3"));
        assertEquals("a87ff679a2f3e71d9181a67b7542122c", StringToMd5.stringToMd5("4"));
    }
}