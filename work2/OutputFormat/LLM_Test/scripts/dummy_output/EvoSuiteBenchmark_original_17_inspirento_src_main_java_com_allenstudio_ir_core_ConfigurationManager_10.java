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
		
  @Test
  void testDefaultConfiguration() throws IOException {
		 
	File configFile = new File("./src/main/resources/conf.xml");
	
    String configHtmlText = readAndClose(configFile);
	assertEquals("expected content of config file", 
		    "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"
	            + "<html> <head> <title>Configuration (Test)</title> <meta http-equiv=\"Content-Type\" content=\"text/html;charset=CHARSET\"> </head>"
		                + "<body style=\"font-family:monospace\"> <h1 style=\"font-weight: bold\"> This is a test.</h1>"
		                + "</body> <p style=\" font-size: 16pt\"> </p>"
		                + configHtmlText, FileUtil.readAndClose(FileUtil.openOutputStream(configFile)));

    Properties props = ConfigurationManager.getInstance();
  		String[] keys = props.stringPropertyNames();
  		String config = props.getProperty(ConfigurationManager.ConfigManager.PROPERTY_CONFIG);
  		assertNotNull("config == null", config);
  		String[] expectedConfigs = {
                "-p_",
	          "-s_"
	        };
  		assertEquals("props.stringPropertyNames()", expectedConfigs.length, keys.length);
  		for (int i = 0; i < keys.length; i++) {
  			assertEquals("", keys[i], expectedConfigs[i]);
  		}
  		assertEquals("wrong config for "+ConfigurationManager.ConfigManager.ConfigManager.PROPERTY_CONFIG, config, props.getProperty(ConfigurationManager.ConfigManager.PROPERTY_CONFIG));
  	}
}