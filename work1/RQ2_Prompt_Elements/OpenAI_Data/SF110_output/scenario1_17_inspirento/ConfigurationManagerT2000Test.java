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
				String value = config.getProperty("window.state");
				assertEquals("0", value);
		}
		
		/**
		* Test case 4:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty4() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider");
				assertEquals("0.5", value);
		}
		
		/**
		* Test case 5:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty5() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.orientation");
				assertEquals("1", value);
		}
		
		/**
		* Test case 6:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty6() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.location");
				assertEquals("0", value);
		}
		
		/**
		* Test case 7:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty7() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.lastLocation");
				assertEquals("0", value);
		}
		
		/**
		* Test case 8:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty8() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.lastOrientation");
				assertEquals("1", value);
		}
		
		/**
		* Test case 9:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty9() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.lastDividerLocation");
				assertEquals("0", value);
		}
		
		/**
		* Test case 10:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty10() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.lastDividerLocation");
				assertEquals("0", value);
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
				String value = config.getProperty("window.state");
				assertEquals("0", value);
		}
		
		/**
		* Test case 4:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty4() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider");
				assertEquals("0.5", value);
		}
		
		/**
		* Test case 5:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty5() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.orientation");
				assertEquals("1", value);
		}
		
		/**
		* Test case 6:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty6() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.location");
				assertEquals("0", value);
		}
		
		/**
		* Test case 7:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty7() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.lastLocation");
				assertEquals("0", value);
		}
		
		/**
		* Test case 8:
		* Test if the method can get the value of a key.
		*/
		@Test
		void testGetProperty8() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.divider.lastOrientation");
				assertEquals("1", value);
		}
		
		/**
		* Test case 9:
		* Test if the method can get the value of a key.
