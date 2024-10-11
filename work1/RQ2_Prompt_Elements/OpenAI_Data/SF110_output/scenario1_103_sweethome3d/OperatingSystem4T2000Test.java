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
 * Tools used to access Mac OS X specific features.
 *
 * @author Emmanuel Puybaret
 */
public class MacOSXFileManager {

    /**
     * Returns the path of the folder where application support files are stored.
     */
    public static String getApplicationSupportFolder() {
        try {
            return FileManager.findFolder(FileManager.kUserDomain, FileManager.kApplicationSupportFolderType);
        } catch (IOException ex) {
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
		void testGetApplicationSupportFolder() {
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
 * A recorder able to record home modifications.
 *
 * @author Emmanuel Puybaret
 */
public class HomeRecorder {

    /**
     * The default delay in milliseconds between two home modifications.
     */
    public static final long DEFAULT_DELAY = 1000;

    private final Home home;

    private final File homeFile;

    private final long delay;

    private Timer timer;

    private TimerTask timerTask;

    private boolean recording;

    /**
     * Creates a home recorder.
     *
     * @param home the home to record
     * @param homeFile the file where home will be saved
     * @param delay the delay in milliseconds between two home modifications
     */
    public HomeRecorder(Home home, File homeFile, long delay) {
        this.home = home;
        this.homeFile = homeFile;
        this.delay = delay;
    }

    /**
     * Creates a home recorder with a default delay between two home modifications.
     *
     * @param home the home to record
     * @param homeFile the file where home will be saved
     */
    public HomeRecorder(Home home, File homeFile) {
        this(home, homeFile, DEFAULT_DELAY);
    }

    /**
     * Returns <code>true</code> if this recorder is recording.
     */
    public boolean isRecording() {
        return this.recording;
    }

    /**
     * Starts recording home modifications.
     */
    public void start() {
        if (!this.recording) {
            this.recording = true;
            this.timer = new Timer("Home recorder", true);
            this.timerTask = new TimerTask() {

                @Override
                public void run() {
                    try {
                        HomeRecorder.this.home.write(HomeRecorder.this.homeFile);
                    } catch (RecorderException ex) {
                        HomeRecorder.this.stop();
                    }
                }
            };
            this.timer.schedule(this.timerTask, this.delay, this.delay);
        }
    }

    /**
     * Stops recording home modifications.
     */
    public void stop() {
        if (this.recording) {
            this.recording = false;
            this.timerTask.cancel();
            this.timer.cancel();
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
* It contains ten unit test cases for the {@link HomeRecorder#start()} method.
*/
class HomeRecorderTest {
		
		@Test
		void testStart() {
				HomeRecorder homeRecorder = new HomeRecorder(new Home(), new File("test.sh3d"));
				homeRecorder.start();
				assertTrue(homeRecorder.isRecording());
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
 * Exception thrown when a home recorder can't save a home.
 *
 * @author Emmanuel Puybaret
 */
public class RecorderException extends Exception {

    public RecorderException(String message) {
        super(message);
    }

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
import com.eteks.