// OperatingSystem_3Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
*/
class OperatingSystem_3Test {
		
    @Test
    public void test() throws IOException, MissingResourceException
    {
        // Assertions in this file
        assertTrue(isMacOSXLeopardOrSuperior());
    }

    /**
     * Returns the default folder used to store temporary files created in the program (OS X only).
     */
    public static File getDefaultTemporaryFolder(boolean create) throws IOException {
        // Try to find default template in system folder
        return FileManager.findFolder((short) -32763, 0x61737570);
    }

    /**
	 * The default template used as default folder for created files.
	 */
	public static final File TEMP_DEFAULT_FOLDER;

	public static void setTEMP_DEFAULT_FOLDER(File tempFile) {
		TEMP_DEFAULT_FOLDER = tempFile;
	}

    /**
     * Returns default folder that should be used for temp files created in the program.
     */
    public static File getDefaultApplicationFolder() throws IOException {
        // Try to find default template in system folder
        File tempDefaultFolder = FileManager.findFolder((short) -32763, 0x61737570);
        assertNotNull(tempDefaultFolder);
        return tempDefaultFolder;
    }
}