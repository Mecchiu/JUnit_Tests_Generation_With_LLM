// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains ten unit test cases for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {

		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.size".
		*/
		@Test
		public void testGetProperty1() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.size");
				assertEquals("800,600", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.location".
		*/
		@Test
		public void testGetProperty2() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.location");
				assertEquals("0,0", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.title".
		*/
		@Test
		public void testGetProperty3() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.title");
				assertEquals("Inspirento", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.icon".
		*/
		@Test
		public void testGetProperty4() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.icon");
				assertEquals("icon.gif", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background".
		*/
		@Test
		public void testGetProperty5() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background");
				assertEquals("background.gif", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.color".
		*/
		@Test
		public void testGetProperty6() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.color");
				assertEquals("255,255,255", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.image".
		*/
		@Test
		public void testGetProperty7() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.image");
				assertEquals("background.gif", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.image.size".
		*/
		@Test
		public void testGetProperty8() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.image.size");
				assertEquals("800,600", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.image.location".
		*/
		@Test
		public void testGetProperty9() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.image.location");
				assertEquals("0,0", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.image.opacity".
		*/
		@Test
		public void testGetProperty10() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.image.opacity");
				assertEquals("0.5", result);
		}
}

// ConfigurationManager.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;

/**
 * Manages the configuration for Inspirento.<br>
 * This manager uses XML format to store information.
 * The configuration file is, by default, saved in the
 * "config" directory and named "config.xml". Clearly,
 * this class should be a singleton, so we use
 * {@link #getInstance()} to get an instance and call
 * other instance methods to get the settings needed
 * by Inspirento, such as "window.size", "window.location",
 * and etc.<br>
 * The program first tries to get the configuration from
 * this <code>ConfigurationManager</code>. If it fails to
 * get any key, it uses the default settings presetted in
 * the protected <code>default</code> field.
 *
 * @author Allen Chue
 */
public class ConfigurationManager extends Properties {

    public static final String CONFIG_DIRECTORY = "config";

    public static final String CONFIG_FILE = "config.xml";

    public static final String COMMON_PREFIX = "Inspirento.";

    private static ConfigurationManager instance = null;

    private XmlIO xmlIO;

    /**
     * Private constructor for singleton use.
     */
    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void readIn() {
        try {
            xmlIO = new XmlIO(CONFIG_DIRECTORY, CONFIG_FILE);
            xmlIO.readIn();
            this.putAll(xmlIO.getProperties());
        } catch (IOException e) {
            writeDefaultsToFile();
        }
    }

    public void writeBack() {
        try {
            xmlIO.writeBack();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Uses XML parser to get the specified property.
     * If there is no such a key, the method returns
     * <code>null</code>.
     * @param key the key of the property
     * @return the property value
     */
    @Override
    public synchronized String getProperty(String key) {
        String result = super.getProperty(key);
        if (result == null) {
            result = default.getProperty(key);
        }
        return result;
    }

    @Override
    public synchronized Object setProperty(String key, String value) {
        return super.setProperty(key, value);
    }

    /**
     * When the configuration file is lost, this method
     * is used to write the default settings stored in
     * the program itself to file.
     */
    private void writeDefaultsToFile() {
        try {
            xmlIO = new XmlIO(CONFIG_DIRECTORY, CONFIG_FILE);
            xmlIO.setProperties(default);
            xmlIO.writeBack();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns an string array of length 2.
     * The parameter <code>pathText</code> is supposed to
     * be a string separated with dots. For example,
     * "Inspirento.window.location" is a valid parameter.
     * This method puts the token after the last dot in
     * the second position of the result array, and the
     * remaining string(excluding the last dot) in the first
     * position of the result array. It is a rivate helping method.
     * <br>
     * Example: getPath("Inspirento.window.location") returns
     * the array {"Inspirento.window", "location"}.<br>
     * <em>No format checking is done in this method! <code>
     * ArrayOutOfBoundsException</code> will be thrown
     * when no dots are found in the string.</em>
     * @param pathText the path text to be processed
     * @return an array containing the result
     */
    private static String[] getPath(String pathText) {
        String[] result = new String[2];
        int lastDotIndex = pathText.lastIndexOf(".");
        result[0] = pathText.substring(0, lastDotIndex);
        result[1] = pathText.substring(lastDotIndex + 1);
        return result;
    }

    private void initDefaultSettings() {
        default.setProperty("window.size", "800,600");
        default.setProperty("window.location", "0,0");
        default.setProperty("window.title", "Inspirento");
        default.setProperty("window.icon", "icon.gif");
        default.setProperty("window.background", "background.gif");
        default.setProperty("window.background.color", "255,255,255");
        default.setProperty("window.background.image", "background.gif");
        default.setProperty("window.background.image.size", "800,600");
        default.setProperty("window.background.image.location", "0,0");
        default.setProperty("window.background.image.opacity", "0.5");
    }

    private Properties default = new Properties();

    {
        initDefaultSettings();
    }
}

// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains ten unit test cases for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.size".
		*/
		@Test
		public void testGetProperty1() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.size");
				assertEquals("800,600", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.location".
		*/
		@Test
		public void testGetProperty2() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.location");
				assertEquals("0,0", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.title".
		*/
		@Test
		public void testGetProperty3() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.title");
				assertEquals("Inspirento", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.icon".
		*/
		@Test
		public void testGetProperty4() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.icon");
				assertEquals("icon.gif", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background".
		*/
		@Test
		public void testGetProperty5() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background");
				assertEquals("background.gif", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.color".
		*/
		@Test
		public void testGetProperty6() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.color");
				assertEquals("255,255,255", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.image".
		*/
		@Test
		public void testGetProperty7() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.image");
				assertEquals("background.gif", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.image.size".
		*/
		@Test
		public void testGetProperty8() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.image.size");
				assertEquals("800,600", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.image.location".
		*/
		@Test
		public void testGetProperty9() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.image.location");
				assertEquals("0,0", result);
		}
		
		/**
		* Tests the {@link ConfigurationManager#getProperty(String)} method.
		* The test case is to get the property "window.background.image.opacity".
		*/
		@Test
		public void testGetProperty10() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String result = config.getProperty("window.background.image.opacity");
				assertEquals("0.5", result);
		}
}

// ConfigurationManager.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;

/**
 * Manages the configuration for Inspirento.<br>
 * This manager uses XML format to store information.
 * The configuration file is, by default, saved in the
 * "config" directory and named "config.xml". Clearly,
 * this class should be a singleton, so we use
 * {@link #getInstance()} to get an instance and call
 * other instance methods to get the settings needed
 * by Inspirento, such as "window.size", "window.location",
 * and etc.<br>
 * The program first tries to get the configuration from
 * this <code>ConfigurationManager</code>. If it fails to
 * get any key, it uses