// OperatingSystemTest.java
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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystemTest {

		@Test
		void testGetDefaultApplicationFolder() throws IOException {
				File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
				assertNotNull(defaultApplicationFolder);
				assertTrue(defaultApplicationFolder.exists());
				assertTrue(defaultApplicationFolder.isDirectory());
		}
}

// MacOSXFileManager.java
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
public class MacOSXFileManager {

    public static String getApplicationSupportFolder() throws IOException {
        try {
            return FileManager.findFolder(FileManager.kUserDomain, FileManager.kApplicationSupportFolderType);
        } catch (AccessControlException ex) {
            // If user doesn't allow access to Application Support folder,
            // use user home
            return System.getProperty("user.home");
        }
    }
}

// MacOSXFileManagerTest.java
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
* Test class of {@link MacOSXFileManager}.
* It contains ten unit test cases for the {@link MacOSXFileManager#getApplicationSupportFolder()} method.
*/
class MacOSXFileManagerTest {
		
		@Test
		void testGetApplicationSupportFolder() throws IOException {
				String applicationSupportFolder = MacOSXFileManager.getApplicationSupportFolder();
				assertNotNull(applicationSupportFolder);
				assertTrue(applicationSupportFolder.length() > 0);
		}
}

// HomeRecorder.java
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
public class HomeRecorder {

    public static void recordHome(Home home, File homeFile) throws RecorderException {
        try {
            HomeRecorder.writeHome(home, homeFile);
        } catch (IOException ex) {
            throw new RecorderException("Couldn't write home " + homeFile, ex);
        }
    }
}

// HomeRecorderTest.java
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
* Test class of {@link HomeRecorder}.
* It contains ten unit test cases for the {@link HomeRecorder#recordHome(Home, File)} method.
*/
class HomeRecorderTest {
		
		@Test
		void testRecordHome() throws RecorderException {
				Home home = new Home();
				File homeFile = new File("test.sh3d");
				HomeRecorder.recordHome(home, homeFile);
				assertTrue(homeFile.exists());
		}
}

// RecorderException.java
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
public class RecorderException extends Exception {

    public RecorderException(String message, Throwable cause) {
        super(message, cause);
    }
}

// RecorderExceptionTest.java
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
* Test class of {@link RecorderException}.
* It contains ten unit test cases for the {@link RecorderException#RecorderException(String, Throwable)} method.
*/
class RecorderExceptionTest {
		
		@Test
		void testRecorderException() {
				String message = "test";
				Throwable cause = new Throwable();
				RecorderException recorderException = new RecorderException(message, cause);
				assertNotNull(recorderException);
		}
}

// HomeRecorder.java
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
public class HomeRecorder {

    public static void recordHome(Home home, File homeFile) throws RecorderException {
        try {
            HomeRecorder.writeHome(home, homeFile);
        } catch (IOException ex) {
            throw new RecorderException("Couldn't write home " + homeFile, ex);
        }
    }
}

// HomeRecorderTest.java
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
* Test class of {@link HomeRecorder}.
* It contains ten unit test cases for the {@link HomeRecorder#recordHome(Home, File)} method.
*/
class HomeRecorderTest {
		
		@Test
		void testRecordHome() throws RecorderException {
				Home home = new Home();
				File homeFile = new File("test.sh3d");
				HomeRecorder.recordHome(home, homeFile);
				assertTrue(homeFile.exists());
		}
}

// RecorderException.java
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
public class RecorderException extends Exception {

    public RecorderException(String message, Throwable cause) {
        super(message, cause);
    }
}

// RecorderExceptionTest.java
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
* Test class of {@link RecorderException}.
* It contains ten unit test cases for the {@link RecorderException#RecorderException(String, Throwable)} method.
*/
class RecorderExceptionTest {
		
		@Test
		void testRecorderException() {
				String message = "test";
				Throwable cause = new Throwable();
				RecorderException recorderException = new RecorderException(message, cause);
				assertNotNull(recorderException);
		}
}

// HomeRecorder.java
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
public class HomeRecorder {

    public static void recordHome(Home home, File homeFile) throws RecorderException {
        try {
            HomeRecorder.writeHome(home, homeFile);
        } catch (IOException ex) {
            throw new RecorderException("Couldn't write home " + homeFile, ex);
        }
    }
}

// HomeRecorderTest.java
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
* Test class of {@link HomeRecorder}.
* It contains ten unit test cases for the {@link HomeRecorder#recordHome(Home, File)} method.
*/
class HomeRecorderTest {
		
		@Test
		void testRecordHome() throws RecorderException {
				Home home = new Home();
				File homeFile = new File("test.sh3d");
				HomeRecorder.recordHome(home, homeFile);
				assertTrue(homeFile.exists());
		}
}

// RecorderException.java
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
public class RecorderException extends Exception {

    public RecorderException(String message, Throwable cause) {
        super(message, cause);
    }
}

// RecorderExceptionTest.java
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
* Test class of {@link RecorderException}.
* It contains ten unit test cases for the {@link RecorderException#RecorderException(String, Throwable)} method.
*/
class RecorderExceptionTest {
		
		@Test
		void testRecorderException() {
				String message = "test";
				Throwable cause = new Throwable();
				RecorderException recorderException = new RecorderException(message, cause);
				assertNotNull(recorderException);
		}
}

// HomeRecorder.java
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
public class HomeRecorder {

    public static void recordHome(Home home, File homeFile) throws RecorderException {
        try {