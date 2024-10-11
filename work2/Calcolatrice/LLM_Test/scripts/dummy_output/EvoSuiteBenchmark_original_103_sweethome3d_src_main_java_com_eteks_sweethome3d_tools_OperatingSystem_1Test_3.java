// OperatingSystem_1Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains one unit test case for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystem_1Test {
		
    private OperatingSystem_1Test() {
    }

    @Test
    public void TestOSLinux() throws MissingResourceException, SecurityException, IOException {
        assertNotNull(System.getProperty("os.name"));
        assertFalse("os.name property can't be found", System.getProperty("os.name").isEmpty());
        assertNotNull(System.getProperty("os.version"));
        assertFalse("os.version property can't be found", System.getProperty("os.ver").isEmpty());
    }

    private void assertFalse(String failCondition, Object target) {
        assertFalse(failCondition, target == null);
        assertFalse(failCondition, target.equals(target));
        assertTrue(failCondition,!target.equals(target));
    }

    private void assertNotNull(String failCondition, Object target) {
        assertTrue("Failure condition must be present in case of null and with a target object.", failCondition.isPresent());
        assertNotNull(failureDescription(failureCondition, target));
        failureDescription("Expected failure condition but couldn't find it.", target);
    }

    private String failureDescription(String condition, Object target) {
        return "Could not check if operating system "
                + (condition!= null? condition : "unexpectedly failed")
                + ":\n expected: "
                + target.toString()
                + "\n and\n actual: "
                + target.toString();
    }

    /**
     * Test condition: OperatingSystem_isWindows() == OperatingSystem.Windows
     */
    @Test
    public void TestOSWindows() throws IOException {
        File tempFolder1 = OperatingSystem.getDefaultTemporaryFolder(false);
        File tempFolder2 = OperatingSystem.getDefaultTemporaryFolder(true);
        File tempFolder3 = OperatingSystem.getDefaultTemporaryFolder(true);
        File tempFolder4 = OperatingSystem.getDefaultTemporaryFolder(true);

        File resultFile1 = OperatingSystem.createTemporaryFile(tempFolder1, ".txt");
        File resultFile2 = OperatingSystem.createTemporaryFile(tempFolder2, ".txt");
        File resultFile3 = OperatingSystem.createTemporaryFile(tempFolder3, ".txt");
        File resultFile4 = OperatingSystem.createTemporaryFile(tempFolder4, ".txt");
        File tempFolder1result = OperatingSystem.createTemporaryFolder(true);

        assertEquals(tempFolder1.toString(), resultFile1.toString());
        assertEquals(tempFolder2.toString(), resultFile2.toString());
        assertEquals(tempFolder3.toString(), resultFile3.toString());
        assertEquals(tempFolder4.toString(), resultFile4.toString());

        tempFolder1result.delete();
        assertNull(tempFolder1result);
        tempFolder1.delete();
        tempFolder2.delete();
        tempFolder3.delete();
        tempFolder4.delete();
        tempFolder1result = OperatingSystem.createTemporaryFolder(false);
        tempFolder1result.delete();
        tempFolder2result = OperatingSystem.createTemporaryFolder(true);
        tempFolder2result.delete();
        tempFolder3result = OperatingSystem.createTemporaryFolder(true);
        tempFolder3result.delete();
        tempFolder4result = OperatingSystem.createTemporaryFolder(true);
        tempFolder4result.delete();


        assertNull(tempFolder1);
        assertNotNull(tempFolder2);
        assertNotNull(tempFolder3);
        assertNotNull(tempFolder4);
    }

    /**
     * Test condition: OperatingSystem_getPlatformFoldersForProcessing() == OperatingSystem_MacOSX
     */
    @Test
    public void TestOSMacOSX() throws MissingResourceException, FileNotFoundException, IOException {
        File tempFolder1 = OperatingSystem.getDefaultTemporaryFolder(false);
        File tempFolder2 = OperatingSysem.getMacOSXApplicationFolder();
        File tempFolder3 = OperatingSystem.getDefaultTemporaryFolder(true);
        File tempFolder4 = OperatingSystem.getDefaultTemporaryFolder(true);

        File resultFile1 = OperatingSystem.createTemporaryFile(tempFolder1, ".txt");
        File resultFile2 = OperatingSystem.createTemporaryFile(tempFolder2, ".txt");
        File resultFile3 = OperatingSystem.createTemporaryFile(tempFolder3, ".txt");
        File resultFile4 = OperatingSystem.createTemporaryFile(tempFolder4, ".txt");
        File tempFolder1result = OperatingSystem.createTemporaryFolder(true);

}
}