// FTPFile_1Test.java
package ftpfile;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#toFormattedString()} method.
*/
class FTPFile_1Test {

    @Test
    void testToFormattedStringWithGMT() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setName("fileName");
        file.setUser("user");
        file.setGroup("group");
        file.setSize(4096);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2024, Calendar.SEPTEMBER, 19, 15, 30, 45);
        file.setTimestamp(cal);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);

        String expected = "drwxr-xr-x   2 user     group        4096 2024-09-19 15:30:45 GMT fileName";
        assertEquals(expected, file.toFormattedString("GMT"));
    }

    @Test
    void testToFormattedStringWithPST() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setName("fileName");
        file.setUser("user");
        file.setGroup("group");
        file.setSize(4096);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2024, Calendar.SEPTEMBER, 19, 15, 30, 45);
        file.setTimestamp(cal);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);

        String expected = "drwxr-xr-x   2 user     group        4096 2024-09-19 08:30:45 PST fileName";
        assertEquals(expected, file.toFormattedString("PST"));
    }

    @Test
    void testToFormattedStringWithNullTimezone() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setName("fileName");
        file.setUser("user");
        file.setGroup("group");
        file.setSize(4096);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2024, Calendar.SEPTEMBER, 19, 15, 30, 45);
        file.setTimestamp(cal);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);

        String expected = "drwxr-xr-x   2 user     group        4096 2024-09-19 15:30:45 GMT fileName";
        assertEquals(expected, file.toFormattedString(null));
    }

    @Test
    void testToFormattedStringWithEST() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setName("fileName");
        file.setUser("user");
        file.setGroup("group");
        file.setSize(4096);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2024, Calendar.SEPTEMBER, 19, 15, 30, 45);
        file.setTimestamp(cal);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);

        String expected = "drwxr-xr-x   2 user     group        4096 2024-09-19 10:30:45 EST fileName";
        assertEquals(expected, file.toFormattedString("EST"));
    }

    @Test
    void testToFormattedStringWithUTC() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setName("fileName");
        file.setUser("user");
        file.setGroup("group");
        file.setSize(4096);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2024, Calendar.SEPTEMBER, 19, 15, 30, 45);
        file.setTimestamp(cal);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);

        String expected = "drwxr-xr-x   2 user     group        4096 2024-09-19 15:30:45 UTC fileName";
        assertEquals(expected, file.toFormattedString("UTC"));
    }

    @Test
    void testToFormattedStringWithInvalidTimezone() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setName("fileName");
        file.setUser("user");
        file.setGroup("group");
        file.setSize(4096);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2024, Calendar.SEPTEMBER, 19, 15, 30, 45);
        file.setTimestamp(cal);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);

        String expected = "drwxr-xr-x   2 user     group        4096 2024-09-19 15:30:45 GMT fileName";
        assertEquals(expected, file.toFormattedString("Invalid-Timezone"));
    }

    @Test
    void testToFormattedStringWithCET() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setName("fileName");
        file.setUser("user");
        file.setGroup("group");
        file.setSize(4096);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2024, Calendar.SEPTEMBER, 19, 15, 30, 45);
        file.setTimestamp(cal);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);

        String expected = "drwxr-xr-x   2 user     group        4096 2024-09-19 16:30:45 CET fileName";
        assertEquals(expected, file.toFormattedString("CET"));
    }

    @Test
    void testToFormattedStringWithAsiaTokyo() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setName("fileName");
        file.setUser("user");
        file.setGroup("group");
        file.setSize(4096);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2024, Calendar.SEPTEMBER, 19, 15, 30, 45);
        file.setTimestamp(cal);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);

        String expected = "drwxr-xr-x   2 user     group        4096 2024-09-19 00:30:45 JST fileName";
        assertEquals(expected, file.toFormattedString("Asia/Tokyo"));
    }

    @Test
    void testToFormattedStringWithInvalidFTPFile() {
        FTPFile file = new FTPFile("Invalid raw listing");
        String expected = "[Invalid: could not parse file entry]";
        assertEquals(expected, file.toFormattedString(null));
    }
}
