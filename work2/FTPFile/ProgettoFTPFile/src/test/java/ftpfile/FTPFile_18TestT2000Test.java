package ftpfile;
// FTPFile_18Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#getUser()} method.
*/
class FTPFile_18Test {
    /**
     * Test case for {@link FTPFile#getUser()} when the user is set to a non-empty string.
     */
    @Test
    void testGetUserWhenUserIsSet() {
        FTPFile file = new FTPFile();
        file.setUser("testUser");
        assertEquals("testUser", file.getUser());
    }

    /**
     * Test case for {@link FTPFile#getUser()} when the user is set to an empty string.
     */
    @Test
    void testGetUserWhenUserIsEmpty() {
        FTPFile file = new FTPFile();
        file.setUser("");
        assertEquals("", file.getUser());
    }

    /**
     * Test case for {@link FTPFile#getUser()} when the user is not set.
     */
    @Test
    void testGetUserWhenUserIsNotSet() {
        FTPFile file = new FTPFile();
        assertEquals("", file.getUser());
    }

    /**
     * Test case for {@link FTPFile#getUser()} when the user is set to null.
     */
    @Test
    void testGetUserWhenUserIsNull() {
        FTPFile file = new FTPFile();
        file.setUser(null);
        assertNull(file.getUser());
    }

    /**
     * Test case for {@link FTPFile#getUser()} when the user is set to a numeric string.
     */
    @Test
    void testGetUserWhenUserIsNumeric() {
        FTPFile file = new FTPFile();
        file.setUser("12345");
        assertEquals("12345", file.getUser());
    }

    /**
     * Test case for {@link FTPFile#getUser()} when the user is set to a special character string.
     */
    @Test
    void testGetUserWhenUserIsSpecialCharacters() {
        FTPFile file = new FTPFile();
        file.setUser("!@#$%");
        assertEquals("!@#$%", file.getUser());
    }

    /**
     * Test case for {@link FTPFile#getUser()} when the user is set to a long string.
     */
    @Test
    void testGetUserWhenUserIsLongString() {
        FTPFile file = new FTPFile();
        String longUser = "a".repeat(1000);
        file.setUser(longUser);
        assertEquals(longUser, file.getUser());
    }

    /**
     * Test case for {@link FTPFile#getUser()} when the user is set to a string with spaces.
     */
    @Test
    void testGetUserWhenUserHasSpaces() {
        FTPFile file = new FTPFile();
        file.setUser("user name");
        assertEquals("user name", file.getUser());
    }

    /**
     * Test case for {@link FTPFile#getUser()} when the user is set to a string with leading and trailing spaces.
     */
    @Test
    void testGetUserWhenUserHasLeadingAndTrailingSpaces() {
        FTPFile file = new FTPFile();
        file.setUser("  username  ");
        assertEquals("  username  ", file.getUser());
    }

    /**
     * Test case for {@link FTPFile#getUser()} when the user is set to a mixed alphanumeric string.
     */
    @Test
    void testGetUserWhenUserIsAlphanumeric() {
        FTPFile file = new FTPFile();
        file.setUser("user123");
        assertEquals("user123", file.getUser());
    }
}