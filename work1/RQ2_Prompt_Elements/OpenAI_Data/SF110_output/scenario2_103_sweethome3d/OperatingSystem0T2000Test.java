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
* It contains ten unit test cases for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystemTest {

	@Test
	void testIsLinux() {
		assertTrue(OperatingSystem.isLinux());
	}
}

// ResourceURLContent.java
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
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * A resource content that loads its content from a URL.
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent extends URLContent {

    /**
     * Creates a resource content that loads its content from a URL.
     */
    public ResourceURLContent(URL url) {
        super(url);
    }

    /**
     * Returns the resource bundle matching the given <code>locale</code>
     * and the resource name of this content.
     */
    public ResourceBundle getResourceBundle(Locale locale) throws IOException {
        try {
            // Open a connection to the resource
            URLConnection connection = getURL().openConnection();
            // Set the default locale to the given one
            connection.setRequestProperty("Accept-Language", locale.toString());
            // Read the resource bundle
            return new PropertyResourceBundle(connection.getInputStream());
        } catch (MissingResourceException ex) {
            return null;
        }
    }
}

// ResourceURLContentTest.java
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
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceURLContent}.
* It contains ten unit test cases for the {@link ResourceURLContent#getResourceBundle(Locale)} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testGetResourceBundle() {
		assertTrue(ResourceURLContent.getResourceBundle(Locale.getDefault()));
	}
}

// SweetHome3D.java
package com.eteks.sweethome3d;

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
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.eteks.sweethome3d.io.DefaultHomeInputStream;
import com.eteks.sweethome3d.io.DefaultHomeOutputStream;
import com.eteks.sweethome3d.io.HomeFileRecorder;
import com.eteks.sweethome3d.io.HomeInputStream;
import com.eteks.sweethome3d.io.HomeOutputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomeApplication;
import com.eteks.sweethome3d.model.HomeRecorder;
import com.eteks.sweethome3d.model.RecorderException;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.swing.HomePane;
import com.eteks.sweethome3d.swing.SwingViewFactory;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.viewcontroller.HomeController;
import com.eteks.sweethome3d.viewcontroller.HomeView;
import com.eteks.sweethome3d.viewcontroller.View;
import com.eteks.sweethome3d.viewcontroller.ViewFactory;

/**
 * Sweet Home 3D main class.
 * @author Emmanuel Puybaret
 */
public class SweetHome3D implements HomeApplication {

    private static final String SWEET_HOME_3D_PROPERTIES = "com.eteks.sweethome3d.SweetHome3D";

    private static final String SWEET_HOME_3D_PREFERENCES = "com.eteks.sweethome3d.SweetHome3DPreferences";

    private static final String SWEET_HOME_3D_VERSION = "com.eteks.sweethome3d.SweetHome3DVersion";

    private static final String SWEET_HOME_3D_WEBSITE = "http://www.sweethome3d.com/";

    private static final String SWEET_HOME_3D_FORUM = "http://www.sweethome3d.com/forum/";

    private static final String SWEET_HOME_3D_BUGS_REPORT = "http://www.sweethome3d.com/bugsReport.php";

    private static final String SWEET_HOME_3D_FEATURES_REQUEST = "http://www.sweethome3d.com/featuresRequest.php";

    private static final String SWEET_HOME_3D_USER_GUIDE = "http://www.sweethome3d.com/userGuide.php";

    private static final String SWEET_HOME_3D_VIDEO_TUTORIALS = "http://www.sweethome3d.com/videoTutorials.php";

    private static final String SWEET_HOME_3D_LICENSE = "http://www.sweethome3d.com/license.php";

    private static final String SWEET_HOME_3D_CREDITS = "http://www.sweethome3d.com/credits.php";

    private static final String SWEET_HOME_3D_CHANGELOG = "http://www.sweethome3d.com/changelog.php";

    private static final String SWEET_HOME_3D_DONATE =