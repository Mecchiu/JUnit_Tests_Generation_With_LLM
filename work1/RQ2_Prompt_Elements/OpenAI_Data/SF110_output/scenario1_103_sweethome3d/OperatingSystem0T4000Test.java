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
* It contains ten unit test cases for the {@link ResourceURLContent#getURL()} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testGetURL() {
		assertEquals(ResourceURLContent.getURL("com/eteks/sweethome3d/resources/resources.properties"), ResourceURLContent.class.getResource("resources.properties"));
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

/**
 * The main class of Sweet Home 3D.
 * @author Emmanuel Puybaret
 */
public class SweetHome3D {
    /**
     * The name of the folder that stores user preferences.
     */
    public static final String SWEET_HOME_3D_FOLDER = ".sweethome3d";

    /**
     * The name of the folder that stores temporary files.
     */
    public static final String TEMP_FOLDER = "tmp";

    /**
     * The name of the folder that stores Sweet Home 3D libraries.
     */
    public static final String LIB_FOLDER = "lib";

    /**
     * The name of the folder that stores Sweet Home 3D plugins.
     */
    public static final String PLUGINS_FOLDER = "plugins";

    /**
     * The name of the folder that stores Sweet Home 3D preferences.
     */
    public static final String PREFERENCES_FOLDER = "preferences";

    /**
     * The name of the folder that stores Sweet Home 3D languages.
     */
    public static final String LANGUAGES_FOLDER = "languages";

    /**
     * The name of the folder that stores Sweet Home 3D help.
     */
    public static final String HELP_FOLDER = "help";

    /**
     * The name of the folder that stores Sweet Home 3D examples.
     */
    public static final String EXAMPLES_FOLDER = "examples";

    /**
     * The name of the folder that stores Sweet Home 3D furniture.
     */
    public static final String FURNITURE_FOLDER = "furniture";

    /**
     * The name of the folder that stores Sweet Home 3D textures.
     */
    public static final String TEXTURES_FOLDER = "textures";

    /**
     * The name of the folder that stores Sweet Home 3D templates.
     */
    public static final String TEMPLATES_FOLDER = "templates";

    /**
     * The name of the folder that stores Sweet Home 3D import filters.
     */
    public static final String IMPORT_FOLDER = "import";

    /**
     * The name of the folder that stores Sweet Home 3D export filters.
     */
    public static final String EXPORT_FOLDER = "export";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String RESOURCES_FOLDER = "resources";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_FOLDER = "java3d";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_WINDOWS_FOLDER = "windows";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_MACOSX_FOLDER = "macosx";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_FOLDER = "linux";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_AMD64_FOLDER = "linux-amd64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_I586_FOLDER = "linux-i586";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_I686_FOLDER = "linux-i686";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_I586_64_FOLDER = "linux-i586-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_I686_64_FOLDER = "linux-i686-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_X86_64_FOLDER = "linux-x86-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_AMD64_64_FOLDER = "linux-amd64-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_X86_64_64_FOLDER = "linux-x86-64-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_IA64_FOLDER = "linux-ia64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_IA64_64_FOLDER = "linux-ia64-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_PPC_FOLDER = "linux-ppc";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_PPC_64_FOLDER = "linux-ppc-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_PPC64_FOLDER = "linux-ppc64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_PPC64_64_FOLDER = "linux-ppc64-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_S390_FOLDER = "linux-s390";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_S390_64_FOLDER = "linux-s390-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_S390X_FOLDER = "linux-s390x";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_S390X_64_FOLDER = "linux-s390x-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_SPARC_FOLDER = "linux-sparc";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_SPARC_64_FOLDER = "linux-sparc-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_SPARCV9_FOLDER = "linux-sparcv9";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_LINUX_SPARCV9_64_FOLDER = "linux-sparcv9-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_FOLDER = "solaris";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_AMD64_FOLDER = "solaris-amd64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_I586_FOLDER = "solaris-i586";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_I686_FOLDER = "solaris-i686";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_I586_64_FOLDER = "solaris-i586-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_I686_64_FOLDER = "solaris-i686-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_X86_64_FOLDER = "solaris-x86-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_AMD64_64_FOLDER = "solaris-amd64-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_X86_64_64_FOLDER = "solaris-x86-64-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_IA64_FOLDER = "solaris-ia64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_IA64_64_FOLDER = "solaris-ia64-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_PPC_FOLDER = "solaris-ppc";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_PPC_64_FOLDER = "solaris-ppc-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_PPC64_FOLDER = "solaris-ppc64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_PPC64_64_FOLDER = "solaris-ppc64-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_S390_FOLDER = "solaris-s390";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_S390_64_FOLDER = "solaris-s390-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_S390X_FOLDER = "solaris-s390x";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_S390X_64_FOLDER = "solaris-s390x-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_SPARC_FOLDER = "solaris-sparc";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_SPARC_64_FOLDER = "solaris-sparc-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_SPARCV9_FOLDER = "solaris-sparcv9";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_SOLARIS_SPARCV9_64_FOLDER = "solaris-sparcv9-64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_WINDOWS_FOLDER = "windows";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_WINDOWS_AMD64_FOLDER = "windows-amd64";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_WINDOWS_I586_FOLDER = "windows-i586";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_WINDOWS_I686_FOLDER = "windows-i686";

    /**
     * The name of the folder that stores Sweet Home 3D application resources.
     */
    public static final String JAVA3D_WINDOWS_I586_64_FOLDER = "windows-i586-64";

    /**
     * The name of the folder that stores Sweet Home