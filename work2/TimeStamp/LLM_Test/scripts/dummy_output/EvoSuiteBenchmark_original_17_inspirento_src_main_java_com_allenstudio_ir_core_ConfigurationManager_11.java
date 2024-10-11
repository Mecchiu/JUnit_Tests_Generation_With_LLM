// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains one unit test case for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {
		
	static void test() throws Exception {
		
		// Make it working...
		PropertiesManager pm = new PropertiesManager();
		Settings settings = pm.settings();
		
		// Test getting the default configuration
		pm.settings();
		
		// Add a null setting
		String prop = pm.getProperty("Null");
		assertNull(prop);
		
		// Set the default value
		settings.set("Default", settings.get("Default")+"2");
		
		// Default value should survive after the setting is lost
		assertTrue(settings.get("Default")==settings.get("Null"));
		
		// Add the new setting
		prop = pm.getProperty("New property");
		settings.set("Setting key with a leading underscore", prop+"_"+settings.get("Setting key with a leading underscore"));
		
		// Make sure the new value is saved
		assertEquals("New value with a leading underscore", pm.getProperty("New property"), prop+"_"+settings.get("Setting key with a leading underscore"));
		
		// Set a value
		pm.setProperty(properties.get("Test.Setting.KeySetting"),"New setting with a leading underscore");
		
		// Make sure the new value is saved
		assertEquals("New value with a leading underscore", pm.getProperty("New setting with a leading underscore"), settings.get("Setting key key with a leading underscore"));
		
		// Set a value
		newConfigLocation();
		
		// Make sure the new value is saved
		assertEquals("New value with a leading underscore", settings.get("Setting key key with a leading underscore"), pm.getProperty("Setting key with a leading underscore"));
		
	}
	public static void newConfigLocation() throws FileNotFoundException, IOException
		{
		Settings settings = new Settings();

		settings.set("Test.Location.Default","Test.Location.Default is different");
		testLocation(settings);

		settings.set("Test.Location.Default","Test.Location.Default = $default");

		testLocation(settings);
		}
	public static void testLocation(Settings settings) throws IOException, FileNotFoundException{
		InputStream settingsStream = ConfigurationManagerTest.class.getResourceAsStream("/config.xml");

		Properties properties = new Properties();
		properties.load(settingsStream);
		String locationName = properties.getProperty("Test.Location.Default");

		File newLocation = new File(locationName);
		newLocation = newLocation.getParentFile();

		assertNotNull(locationName);

		settings.set("Test.Location",newLocation);
		properties.load(settingsStream);

		String newLocationName = properties.getProperty("Test.Location.Default");
		assertNotNull(newLocationName);
		assertEquals(newLocationName,newLocation);
	}
	@Test
	public void test() throws Exception {
		test();
	}

}