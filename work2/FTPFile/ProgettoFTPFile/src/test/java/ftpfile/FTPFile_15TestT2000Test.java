package ftpfile;
// FTPFile_15Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#setGroup(String)} method.
*/
class FTPFile_15Test {
    /**
     * Test case for setting and getting the group name.
     */
    @Test
    void testSetAndGetGroup() {
        FTPFile file = new FTPFile();
        String groupName = "developers";
        file.setGroup(groupName);
        assertEquals(groupName, file.getGroup(), "The group name should be 'developers'");
    }

    /**
     * Test case for setting an empty group name.
     */
    @Test
    void testSetEmptyGroup() {
        FTPFile file = new FTPFile();
        file.setGroup("");
        assertEquals("", file.getGroup(), "The group name should be an empty string");
    }

    /**
     * Test case for setting a null group name.
     */
    @Test
    void testSetNullGroup() {
        FTPFile file = new FTPFile();
        file.setGroup(null);
        assertNull(file.getGroup(), "The group name should be null");
    }

    /**
     * Test case for setting a group name with special characters.
     */
    @Test
    void testSetSpecialCharacterGroup() {
        FTPFile file = new FTPFile();
        String groupName = "dev@123";
        file.setGroup(groupName);
        assertEquals(groupName, file.getGroup(), "The group name should be 'dev@123'");
    }

    /**
     * Test case for setting a group name with spaces.
     */
    @Test
    void testSetGroupWithSpaces() {
        FTPFile file = new FTPFile();
        String groupName = "dev team";
        file.setGroup(groupName);
        assertEquals(groupName, file.getGroup(), "The group name should be 'dev team'");
    }

    /**
     * Test case for setting a group name with numbers.
     */
    @Test
    void testSetGroupWithNumbers() {
        FTPFile file = new FTPFile();
        String groupName = "group123";
        file.setGroup(groupName);
        assertEquals(groupName, file.getGroup(), "The group name should be 'group123'");
    }

    /**
     * Test case for setting a very long group name.
     */
    @Test
    void testSetLongGroupName() {
        FTPFile file = new FTPFile();
        String groupName = "a".repeat(1000);
        file.setGroup(groupName);
        assertEquals(groupName, file.getGroup(), "The group name should be a string of 1000 'a' characters");
    }

    /**
     * Test case for setting a group name and checking if it affects other properties.
     */
    @Test
    void testSetGroupDoesNotAffectOtherProperties() {
        FTPFile file = new FTPFile();
        file.setName("testFile");
        file.setSize(1024);
        file.setGroup("devs");
        assertEquals("testFile", file.getName(), "The file name should remain 'testFile'");
        assertEquals(1024, file.getSize(), "The file size should remain 1024");
    }

    /**
     * Test case for setting a group name after setting other properties.
     */
    @Test
    void testSetGroupAfterOtherProperties() {
        FTPFile file = new FTPFile();
        file.setName("testFile");
        file.setSize(1024);
        file.setGroup("devs");
        assertEquals("devs", file.getGroup(), "The group name should be 'devs'");
    }

    /**
     * Test case for setting a group name and checking if it is stored correctly.
     */
    @Test
    void testSetGroupStoredCorrectly() {
        FTPFile file = new FTPFile();
        String groupName = "admins";
        file.setGroup(groupName);
        assertEquals(groupName, file.getGroup(), "The group name should be 'admins'");
    }
}