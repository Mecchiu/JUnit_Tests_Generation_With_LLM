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
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
*/
class OperatingSystemTest {

	@Test
	void testIsMacOSXLeopardOrSuperior() {
		assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
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
 * Content read from a resource URL.
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent extends URLContent {

    /**
     * Creates a content from a resource URL.
     */
    public ResourceURLContent(String resourceName) {
        super(ResourceURLContent.class.getResource(resourceName));
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
* It contains ten unit test cases for the {@link ResourceURLContent#ResourceURLContent(String)} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testResourceURLContent() {
		ResourceURLContent resourceURLContent = new ResourceURLContent("/com/eteks/sweethome3d/tools/resources/test.txt");
		assertEquals("test", resourceURLContent.getInputStream());
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
 * Sweet Home 3D main class.
 * @author Emmanuel Puybaret
 */
public class SweetHome3D {

    /**
     * Sweet Home 3D version.
     */
    public final static String SWEET_HOME_3D_VERSION = "6.4";

    /**
     * Sweet Home 3D version date.
     */
    public final static String SWEET_HOME_3D_VERSION_DATE = "2020-01-01";

    /**
     * Sweet Home 3D application name.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in English.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_ENGLISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in French.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_FRENCH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in German.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_GERMAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Italian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_ITALIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Spanish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SPANISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Brazilian Portuguese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_BRAZILIAN_PORTUGUESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Russian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_RUSSIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Japanese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_JAPANESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Chinese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_CHINESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Chinese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SIMPLIFIED_CHINESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Chinese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_TRADITIONAL_CHINESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Korean.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_KOREAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Polish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_POLISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Turkish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_TURKISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Czech.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_CZECH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Hungarian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_HUNGARIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Dutch.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_DUTCH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Danish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_DANISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Finnish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_FINNISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Norwegian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_NORWEGIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Swedish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SWEDISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Greek.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_GREEK = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Catalan.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_CATALAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Ukrainian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_UKRAINIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Romanian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_ROMANIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Bulgarian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_BULGARIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Croatian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_CROATIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Serbian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SERBIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Slovak.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SLOVAK = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Slovenian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SLOVENIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Arabic.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_ARABIC = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Hebrew.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_HEBREW = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Thai.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_THAI = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Vietnamese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_VIETNAMESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Indonesian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_INDONESIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Malay.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_MALAY = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Persian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_PERSIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Hindi.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_HINDI = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Bengali.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_BENGALI = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Tamil.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_TAMIL = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Telugu.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_TELUGU = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Kannada.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_KANNADA = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Marathi.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_MARATHI = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Punjabi.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_PUNJABI = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Gujarati.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_GUJARATI = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Urdu.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_URDU = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Nepali.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_NEPALI = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Sinhala.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SINHALA = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Tagalog.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_TAGALOG = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Esperanto.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_ESPERANTO = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Galician.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_GALICIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Basque.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_BASQUE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Occitan.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_OCCITAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Breton.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_BRETON = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Frisian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_FRISIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Luxembourgish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_LUXEMBOURGISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Icelandic.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_ICELANDIC = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Irish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_IRISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Scots Gaelic.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SCOTS_GAELIC = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Albanian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_ALBANIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Latvian.
     */
    public final static String S