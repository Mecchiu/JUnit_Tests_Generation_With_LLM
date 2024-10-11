// FTPFile_27Test.java
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
 * It contains ten unit test cases for the {@link FTPFile#toFormattedString(String)} method.
 */
class FTPFile_27Test {

    @Test
    void testToFormattedStringWithGMT() {
        FTPFile file = createSampleFTPFile();
        String formattedString = file.toFormattedString("GMT");
        assertTrue(formattedString.contains("GMT"));
    }

    @Test
    void testToFormattedStringWithPST() {
        FTPFile file = createSampleFTPFile();
        String formattedString = file.toFormattedString("PST");
        assertTrue(formattedString.contains("PST"));
    }

    @Test
    void testToFormattedStringWithNullTimezone() {
        FTPFile file = createSampleFTPFile();
        String formattedString = file.toFormattedString(null);
        assertTrue(formattedString.contains("CEST"));
    }

    @Test
    void testToFormattedStringWithEST() {
        FTPFile file = createSampleFTPFile();
        String formattedString = file.toFormattedString("EST");
        assertTrue(formattedString.contains("EST"));
    }

    @Test
    void testToFormattedStringWithUTC() {
        FTPFile file = createSampleFTPFile();
        String formattedString = file.toFormattedString("UTC");
        assertTrue(formattedString.contains("UTC"));
    }

    @Test
    void testToFormattedStringWithInvalidTimezone() {
        FTPFile file = createSampleFTPFile();
        String formattedString = file.toFormattedString("Invalid-Timezone");
        assertTrue(formattedString.contains("GMT"));
    }

    @Test
    void testToFormattedStringWithCET() {
        FTPFile file = createSampleFTPFile();
        String formattedString = file.toFormattedString("CET");
        assertTrue(formattedString.contains("CET"));
    }

    @Test
    void testToFormattedStringWithAsiaTokyo() {
        FTPFile file = createSampleFTPFile();
        String formattedString = file.toFormattedString("Asia/Tokyo");
        assertTrue(formattedString.contains("JST"));
    }

    @Test
    void testToFormattedStringWithInvalidFTPFile() {
        FTPFile file = new FTPFile("Invalid raw listing");
        String formattedString = file.toFormattedString(null);
        assertEquals("[Invalid: could not parse file entry]", formattedString);
    }

    @Test
    void testToFormattedStringWithLocalTimezone() {
        FTPFile file = createSampleFTPFile();
        String formattedString = file.toFormattedString(null);
        assertTrue(formattedString.contains("localTZ"));
    }

    private FTPFile createSampleFTPFile() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setName("fileName");
        file.setUser("user");
        file.setGroup("group");
        file.setSize(4096);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("CEST"));
        calendar.set(2024, Calendar.SEPTEMBER, 19, 15, 30, 45);
        file.setTimestamp(calendar);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
        file.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.READ_PERMISSION, true);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.GROUP_ACCESS, FTPFile.EXECUTE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION, false);
        file.setPermission(FTPFile.WORLD_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
        return file;
    }
}
