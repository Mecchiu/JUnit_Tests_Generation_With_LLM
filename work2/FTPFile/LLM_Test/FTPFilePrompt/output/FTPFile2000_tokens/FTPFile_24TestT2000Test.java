// FTPFile_24Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#hasPermission(int, int)} method.
*/
class FTPFile_24Test {
```java
    /**
     * Test case for checking user read permission.
     */
    @Test
    void testUserReadPermission() {
        FTPFile file = new FTPFile();
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        assertTrue(file.hasPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION));
    }

    /**
     * Test case for checking user write permission.
     */
    @Test
    void testUserWritePermission() {
        FTPFile file = new FTPFile();
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        assertTrue(file.hasPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION));
    }

    /**
     * Test case for checking user execute permission.
     */
    @Test
    void testUserExecutePermission() {
        FTPFile file = new FTPFile();
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        assertTrue(file.hasPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION));
    }

    /**
     * Test case for checking group read permission.
     */
    @Test
    void testGroupReadPermission() {
        FTPFile file = new FTPFile();
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        assertTrue(file.hasPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION));
    }

    /**
     * Test case for checking group write permission.
     */
    @Test
    void testGroupWritePermission() {
        FTPFile file = new FTPFile();
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, true);
        assertTrue(file.hasPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION));
    }

    /**
     * Test case for checking group execute permission.
     */
    @Test
    void testGroupExecutePermission() {
        FTPFile file = new FTPFile();
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        assertTrue(file.hasPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION));
    }

    /**
     * Test case for checking world read permission.
     */
    @Test
    void testWorldReadPermission() {
        FTPFile file = new FTPFile();
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, true);
        assertTrue(file.hasPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION));
    }

    /**
     * Test case for checking world write permission.
     */
    @Test
    void testWorldWritePermission() {
        FTPFile file = new FTPFile();
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, true);
        assertTrue(file.hasPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION));
    }

    /**
     * Test case for checking world execute permission.
     */
    @Test
    void testWorldExecutePermission() {
        FTPFile file = new FTPFile();
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        assertTrue(file.hasPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION));
    }

    /**
     * Test case for invalid permission access.
     */
    @Test
    void testInvalidPermissionAccess() {
        FTPFile file = new FTPFile();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            file.hasPermission(FTPFile.USER_ACCESS, 10);
        });
    }
}
```

This test class `FTPFile_24Test` contains ten unit test cases for the `hasPermission` method of the `FTPFile` class. Each test case checks a specific permission (read, write, execute) for user, group, and world access. Additionally, there is a test case to check for invalid permission access, which should throw an `ArrayIndexOutOfBoundsException`.