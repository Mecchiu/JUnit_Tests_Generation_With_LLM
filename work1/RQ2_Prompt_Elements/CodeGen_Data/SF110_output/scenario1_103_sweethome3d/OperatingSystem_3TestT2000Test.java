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

    public static boolean isMacOSXLeopardOrSuperior() {
        // Just need to test is OS version is different of 10.4 because Sweet Home 3D
        // isn't supported under Mac OS X versions previous to 10.4
        return isMacOSX() &&!System.getProperty("os.version").startsWith("10.4");
    }
}

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
		
//---------------------------------------------------------------------------------------------------------------------

/**
* @author Emmanuel Puybaret
* This test is related to ISample.java which is tested under TestOS class.
*/
class TestOS {

    @Test
    void isMacOSX() {
        assertFalse("Invalid test", OperatingSystem_3Test.isMacOSX() && OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    @Test
    void macOSXTestCase() throws FileAccessException, MissingResourceException, AccessControlException, IOException {
        FileManager.setUp();
        
        // Check for existance
        assertNotNull("FileManager should not be null", FileManager.hasFile("data/toucher/sample.sh"));

        // Create a home with an empty file and file manager.
        Home home = Home.withHome(UUID.randomUUID().toString())
               .withDescription("test case with 1 file")
               .withFileManager(createBundlePath("FileManager"))
               .createHome();

        assertEquals("No home created", 1, home.getHomeCount());

        // Write a file with a value
        File file = new File("data/toucher/sample.sh");
        String contents = "This is a test";
        FileWriter.create(file.getAbsolutePath() + "/" + UUID.randomUUID().toString(), contents.length(), false);
        
        // Remove the file with the file manager and verify contents are equal
        FileManager.removeFile(true, home.getHome(1).getHomeUuid());
        assertEquals("Contents after remove", contents.length(), file.length());

        // Write a second file with the same contents and verify that it is the same
        file.delete();
        FileWriter.create(file.getAbsolutePath() + "/" + UUID.randomUUID().toString(), contents.length(), false);
        assertEquals("Contents after rename", contents.length(), file.length());

        String result = FileManager.writeAll(home.getHome(1));
        assertEquals("Wrong file content", contents, result);
    }


    private static FileFilter createBundlePath(String moduleName) {
        File file = File.createTempFile("test", ".txt");
        file.deleteOnExit();
        
        file.delete();
//        System.setProperty("java.library.path", "$JAVA_LIBRARY_PATH$/../../../../" + moduleName);
        return new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().startsWith(moduleName);
            }
        };
    }


}

// ---------------------------------------------------------------------------------------------------------------------

/**
* A base class that all the test cases should extend from with an assertEquals() method for testing.
*/
abstract class TestCase extends AbstractTestOS {

    @Override
    public final String getInfo() {
        // This method is never called from the test class.
        return "";
    }

}


//---------------------------------------------------------------------------------------------------------------------


}

// ---------------------------------------------------------------------------------------------------------------------


