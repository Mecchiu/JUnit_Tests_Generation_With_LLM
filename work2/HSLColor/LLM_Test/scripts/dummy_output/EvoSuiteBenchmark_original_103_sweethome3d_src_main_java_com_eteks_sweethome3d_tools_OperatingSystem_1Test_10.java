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
		
	
	/**
	 * This instance of the test contains two tests, one which execute a JUnit test, and the other a unit test
	 */

  @Test
  public void testIsMacOSXLeopardOrSuperiorThanSofaLeopard() throws IOException {
    File defaultTemplateFile = null, defaultSubFile = null, defaultSubSubFile = null;

    defaultTemplateFile = new File("templates/templatedelet.txt");
    assertTrue(defaultTemplateFile.exists(), "Missing template file: templates/templatedelet.txt");
    defaultSubFile = new File("templates/subfolder");
    assertTrue(defaultSubFile.exists(), "Missing template file: templates/subfolder");
    defaultSubSubFile = new File("templates/subfolder/subfolder");
    assertTrue(defaultSubSubFile.exists(), "Missing template file: templates/subfolder/subfolder");
    assertFalse(isMacOSXLeopardOrSuperior());

    // Test isWindows
    defaultTemplateFile = null;
    defaultSubFile = null;
    defaultSubSubFile = null;
    isWindows(); 

    defaultTemplateFile = new File("templates/templatedelet.txt");
    defaultSubFile = new File("templates/subfolder/subfolder");
    defaultSubSubFile = new File("templates/subfolder/subfolder/subfolder");
    assertFalse(isMacOSXLeopardOrSuperior());
	}
}