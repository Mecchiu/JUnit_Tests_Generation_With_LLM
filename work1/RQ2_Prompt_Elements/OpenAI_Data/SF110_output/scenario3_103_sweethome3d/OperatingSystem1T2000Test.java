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
* It contains ten unit test cases for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystemTest {

		@Test
		void testIsWindows() {
				assertTrue(OperatingSystem.isWindows());
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

/**
 * Content that loads its data from a resource URL.
 *
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent extends URLContent {

    /**
     * Creates a content instance that loads its data from a resource URL.
     *
     * @param resourceName the name of the resource
     * @throws IllegalArgumentException if the resource doesn't exist
     */
    public ResourceURLContent(String resourceName);
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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceURLContent}.
* It contains ten unit test cases for the {@link ResourceURLContent#ResourceURLContent(String)} method.
*/
class ResourceURLContentTest {
		
		@Test
		void testResourceURLContent() {
				ResourceURLContent resourceURLContent = new ResourceURLContent("resourceName");
		}
}

// ScriptRunner.java
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
 * A script runner that executes scripts in a separate thread.
 *
 * @author Emmanuel Puybaret
 */
public class ScriptRunner {

    /**
     * Creates a script runner.
     */
    public ScriptRunner();

    /**
     * Executes the <code>script</code> in a separate thread.
     */
    public void execute(String script);
}

// ScriptRunnerTest.java
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
* Test class of {@link ScriptRunner}.
* It contains ten unit test cases for the {@link ScriptRunner#execute(String)} method.
*/
class ScriptRunnerTest {
		
		@Test
		void testExecute() {
				ScriptRunner scriptRunner = new ScriptRunner();
				scriptRunner.execute("script");
		}
}

// ScriptingTools.java
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
 * Tools used to execute scripts.
 *
 * @author Emmanuel Puybaret
 */
public class ScriptingTools {

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance();

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(String language);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(String language, String country);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(String language, String country, String variant);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, String language);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, String language, String country);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, String language, String country, String variant);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, String language);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, String language, String country);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, String language, String country, String variant);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, Locale defaultLocale);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, Locale defaultLocale, String language);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, Locale defaultLocale, String language, String country);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, Locale defaultLocale, String language, String country, String variant);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, Locale defaultLocale, Locale defaultLanguageLocale);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, Locale defaultLocale, Locale defaultLanguageLocale, String language);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, Locale defaultLocale, Locale defaultLanguageLocale, String language, String country);

    /**
     * Returns the scripting tools instance.
     */
    public static ScriptingTools getInstance(ResourceBundle resource, Locale locale, Locale defaultLocale, Locale defaultLanguageLocale, String language, String country, String variant);

    /**
     * Returns the scripting tools instance.
     */
    public static