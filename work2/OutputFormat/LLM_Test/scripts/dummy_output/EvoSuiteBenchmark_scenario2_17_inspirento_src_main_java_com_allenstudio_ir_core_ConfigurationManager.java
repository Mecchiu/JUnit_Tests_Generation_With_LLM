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
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty1() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.size");
				assertEquals("800,600", value);
		}
		
		/**
		* Test case 2:
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty2() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.location");
				assertEquals("0,0", value);
		}
		
		/**
		* Test case 3:
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty3() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.extendedState");
				assertEquals("0", value);
		}
		
		/**
		* Test case 4:
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty4() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.dividerLocation");
				assertEquals("200", value);
		}
		
		/**
		* Test case 5:
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty5() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.lookAndFeel");
				assertEquals("com.sun.java.swing.plaf.windows.WindowsLookAndFeel", value);
		}
		
		/**
		* Test case 6:
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty6() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isMaximized");
				assertEquals("false", value);
		}
		
		/**
		* Test case 7:
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty7() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isIcon");
				assertEquals("false", value);
		}
		
		/**
		* Test case 8:
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty8() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isAlwaysOnTop");
				assertEquals("false", value);
		}
		
		/**
		* Test case 9:
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty9() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isResizable");
				assertEquals("true", value);
		}
		
		/**
		* Test case 10:
		* Test if the method returns the correct value for a key.
		*/
		@Test
		void testGetProperty10() {
				ConfigurationManager config = ConfigurationManager.getInstance();
				String value = config.getProperty("window.isVisible");
				assertEquals("true", value);
		}
}