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
		
	@Test public void isWindows() throws IOException {
		
        // Mac OS X 10.4 or superior
        assertNotNull(OperatingSystem.isWindows());
        // Mac OS X 10.3
        assertNotNull(OperatingSystem.isWindowsLeopardOrSuperior());
        // Mac OS X 10.2
        assertNull(OperatingSystem.isWindowsLeopardOrSuperior());
        // Mac OS X 10.1
        assertNull(OperatingSystem.isWindowsLeopardOrSuperior());
        // Mac OS X 10.0
        assertNotNull(OperatingSystem.isWindowsLeopardOrSuperior());
        // Mac OS X 10.1
        assertNotNull(OperatingSystem.isMacOSXLeopardOrSuperior());
        
    }
}