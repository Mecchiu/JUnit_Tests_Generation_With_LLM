// OperatingSystem.java
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

/**
 * Tools used to test current user operating system.
 *
 * @author Emmanuel Puybaret
 */
public class OperatingSystem {

    private static final String EDITOR_SUB_FOLDER = "editor";

    private static final String APPLICATION_SUB_FOLDER = "Sweet Home 3D";

    private static final String TEMPORARY_SUB_FOLDER = "sweethome3d";

    private static final String TEMPORARY_SESSION_SUB_FOLDER = UUID.randomUUID().toString();

    static {
    }

    // This class contains only static methods
    private OperatingSystem() {
    }

    /**
     * Returns <code>true</code> if current operating is Linux.
     */
    public static boolean isLinux() {
        String osName = System.getProperty("os.name");
        return osName != null && osName.toLowerCase().contains("linux");
    }

    /**
     * Returns <code>true</code> if current operating is Windows.
     */
    public static boolean isWindows() {
        String osName = System.getProperty("os.name");
        return osName != null && osName.toLowerCase().contains("windows");
    }

    /**
     * Returns <code>true</code> if current operating is Mac OS X.
     */
    public static boolean isMacOSX() {
        String osName = System.getProperty("os.name");
        return osName != null && osName.toLowerCase().contains("mac");
    }

    /**
     * Returns <code>true</code> if current operating is Mac OS X 10.5
     * or superior.
     */
    public static boolean isMacOSXLeopardOrSuperior() {
        String osVersion = System.getProperty("os.version");
        if (osVersion != null) {
            String[] versionParts = osVersion.split("\\.");
            if (versionParts.length >= 2) {
                try {
                    int majorVersion = Integer.parseInt(versionParts[0]);
                    int minorVersion = Integer.parseInt(versionParts[1]);
                    return majorVersion > 10 || (majorVersion == 10 && minorVersion >= 5);
                } catch (NumberFormatException ex) {
                    // Ignore
                }
            }
        }
        return false;
    }

    /**
     * Returns a temporary file that will be deleted when JVM will exit.
     * @throws IOException if the file couldn't be created
     */
    public static File createTemporaryFile(String prefix, String suffix) throws IOException {
        File temporaryFolder = getDefaultTemporaryFolder(true);
        File temporaryFile = File.createTempFile(prefix, suffix, temporaryFolder);
        temporaryFile.deleteOnExit();
        return temporaryFile;
    }

    /**
     * Deletes all the temporary files created with {@link #createTemporaryFile(String, String) createTemporaryFile}.
     */
    public static void deleteTemporaryFiles() {
        File temporaryFolder = getDefaultTemporaryFolder(false);
        if (temporaryFolder != null && temporaryFolder.exists()) {
            File[] temporaryFiles = temporaryFolder.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isFile();
                }
            });
            if (temporaryFiles != null) {
                for (File temporaryFile : temporaryFiles) {
                    temporaryFile.delete();
                }
            }
        }
    }

    /**
     * Returns the default folder used to store temporary files created in the program.
     */
    private synchronized static File getDefaultTemporaryFolder(boolean create) throws IOException {
        String userHome = System.getProperty("user.home");
        if (userHome == null) {
            throw new IOException("User home directory not found");
        }
        File temporaryFolder = new File(userHome, TEMPORARY_SUB_FOLDER);
        if (create && !temporaryFolder.exists()) {
            temporaryFolder.mkdirs();
        }
        return temporaryFolder;
    }

    /**
     * Returns default application folder.
     */
    public static File getDefaultApplicationFolder() throws IOException {
        String userHome = System.getProperty("user.home");
        if (userHome == null) {
            throw new IOException("User home directory not found");
        }
        File applicationFolder;
        if (isMacOSX()) {
            try {
                applicationFolder = new File(MacOSXFileManager.getApplicationSupportFolder(), APPLICATION_SUB_FOLDER);
            } catch (IOException ex) {
                throw new IOException("Can't find application support folder", ex);
            }
        } else {
            applicationFolder = new File(userHome, "." + APPLICATION_SUB_FOLDER.toLowerCase());
        }
        if (!applicationFolder.exists()) {
            applicationFolder.mkdirs();
        }
        return applicationFolder;
    }

    /**
     * File manager class that accesses to Mac OS X specifics.
     * Do not invoke methods of this class without checking first if
     * <code>os.name</code> System property is <code>Mac OS X</code>.
     * This class requires some classes of <code>com.apple.eio</code> package
     * to compile.
     */
    private static class MacOSXFileManager {

        public static String getApplicationSupportFolder() throws IOException {
            // Find application support folder (0x61737570) for user domain (-32763)
            return FileManager.findFolder((short) -32763, 0x61737570);
        }
    }
}

// OperatingSystem_0Test.java
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
* It contains ten unit test cases for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystem_0Test {
    @Test
    void testIsLinux() {
        // Test with Linux OS
        System.setProperty("os.name", "Linux");
        assertTrue(OperatingSystem.isLinux());

        // Test with Windows OS
        System.setProperty("os.name", "Windows");
        assertFalse(OperatingSystem.isLinux());

        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        assertFalse(OperatingSystem.isLinux());

        // Test with null OS name
        System.clearProperty("os.name");
        assertFalse(OperatingSystem.isLinux());

        // Test with empty OS name
        System.setProperty("os.name", "");
        assertFalse(OperatingSystem.isLinux());

        // Test with unknown OS name
        System.setProperty("os.name", "Unknown");
        assertFalse(OperatingSystem.isLinux());
    }
}