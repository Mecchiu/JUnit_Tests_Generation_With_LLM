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
		public void testGetProperty(){
			final String testValue = "my_value";
	    	final String result = PropertyManager.getProperty("test.value");
	    	boolean result1 = PropertyManager.getInstance().getProperty("test.value").equals(testValue);
	    	assertTrue(result1);
	    	
	    	final String testKey = "unused_key";
	    	String result2 = PropertyManager.getProperty(testKey);
	    	assertTrue("should return '"+testValue+"' but returned '"+result2+"', not '"+result+"'.",');
	    }
}