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
		* Test case 1:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty1() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.size");
				assertEquals("800,600", value);
		}
		
		/**
		* Test case 2:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty2() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.location");
				assertEquals("0,0", value);
		}
		
		/**
		* Test case 3:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty3() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.extendedState");
				assertEquals("0", value);
		}
		
		/**
		* Test case 4:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty4() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.dividerLocation");
				assertEquals("200", value);
		}
		
		/**
		* Test case 5:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty5() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.dividerSize");
				assertEquals("5", value);
		}
		
		/**
		* Test case 6:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty6() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isVisible");
				assertEquals("true", value);
		}
		
		/**
		* Test case 7:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty7() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isAlwaysOnTop");
				assertEquals("false", value);
		}
		
		/**
		* Test case 8:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty8() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isResizable");
				assertEquals("true", value);
		}
		
		/**
		* Test case 9:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty9() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isUndecorated");
				assertEquals("false", value);
		}
		
		/**
		* Test case 10:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty10() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isAlwaysOnTopSupported");
				assertEquals("true", value);
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

    @Override
    public synchronized String getProperty(String key) {
        String value = xmlIO.getRoot().getElement(Constants.PROJECT_NAME + "." + getPath(key)[0]).getAttribute(getPath(key)[1]);
        if (value == null) {
            //Perhaps some element is lost in the file
            value = defaults.getProperty(key);
            //null value has no side effect
            setProperty(key, value);
            new Thread() {

                @Override
                public void run() {
                    writeBack();
                }
            }.start();
        }
        return value;
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
		* Test case 1:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty1() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.size");
				assertEquals("800,600", value);
		}
		
		/**
		* Test case 2:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty2() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.location");
				assertEquals("0,0", value);
		}
		
		/**
		* Test case 3:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty3() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.extendedState");
				assertEquals("0", value);
		}
		
		/**
		* Test case 4:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty4() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.dividerLocation");
				assertEquals("200", value);
		}
		
		/**
		* Test case 5:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty5() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.dividerSize");
				assertEquals("5", value);
		}
		
		/**
		* Test case 6:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty6() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isVisible");
				assertEquals("true", value);
		}
		
		/**
		* Test case 7:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty7() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isAlwaysOnTop");
				assertEquals("false", value);
		}
		
		/**
		* Test case 8:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty8() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isResizable");
				assertEquals("true", value);
		}
		
		/**
		* Test case 9:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty9() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isUndecorated");
				assertEquals("false", value);
		}
		
		/**
		* Test case 10:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty10() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isAlwaysOnTopSupported");
				assertEquals("true", value);
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

    @Override
    public synchronized String getProperty(String key) {
        String value = xmlIO.getRoot().getElement(Constants.PROJECT_NAME + "." + getPath(key)[0]).getAttribute(getPath(key)[1]);
        if (value == null) {
            //Perhaps some element is lost in the file
            value = defaults.getProperty(key);
            //null value has no side effect
            setProperty(key, value);
            new Thread() {

                @Override
                public void run() {
                    writeBack();
                }
            }.start();
        }
        return value;
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
		* Test case 1:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty1() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.size");
				assertEquals("800,600", value);
		}
		
		/**
		* Test case 2:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty2() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.location");
				assertEquals("0,0", value);
		}
		
		/**
		* Test case 3:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty3() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.extendedState");
				assertEquals("0", value);
		}
		
		/**
		* Test case 4:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty4() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.dividerLocation");
				assertEquals("200", value);
		}
		
		/**
		* Test case 5:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty5() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.dividerSize");
				assertEquals("5", value);
		}
		
		/**
		* Test case 6:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty6() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isVisible");
				assertEquals("true", value);
		}
		
		/**
		* Test case 7:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty7() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isAlwaysOnTop");
				assertEquals("false", value);
		}
		
		/**
		* Test case 8:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty8() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isResizable");
				assertEquals("true", value);
		}
		
		/**
		* Test case 9:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty9() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isUndecorated");
				assertEquals("false", value);
		}
		
		/**
		* Test case 10: