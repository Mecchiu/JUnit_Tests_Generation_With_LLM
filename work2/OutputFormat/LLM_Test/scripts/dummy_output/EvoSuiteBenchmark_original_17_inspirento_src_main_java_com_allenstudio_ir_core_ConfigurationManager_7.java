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
		/**
         * Test of getProperty method, with no key.
         */
		@Test
		void getProperty_NoKey() {
            System.err.println("getProperty(KEY=null)");
			assertEquals("", ConfigurationManagerManager.getProperty(""));
		}

        /**
         * test of getProperty method, with key.
         */
        @Test
        void getProperty_Key() {
            System.err.println("getProperty(KEY=config.key)");
            ConfigurationManagerManager.setInstance("config.key");
            assertEquals("config.key", ConfigurationManagerManager.getProperty("KEY"));
        }

        /**
         * test of getProperty method, with key and default.
         */
        @Test
        void getProperty_KeyAndDefault() {
            ConfigurationManager.setInstance("config.key");
            assertEquals("config.key", ConfigurationManager.getProperty("KEY"));
            assertEquals("", ConfigurationManager.getProperty("KEY", null));
        }

        /**
         * test of getProperty method, with key, default and new.
         */
        @Test
        void getProperty_KeyAndDefault_new() {
            ConfigurationManager.setInstance("config.key");
            ConfigurationManager.setInstance("config.key.default");
            ConfigurationManager.setInstance("config.key.new");
            ConfigurationManager.getInstance("KEY");
            ConfigurationManager.getInstance("key");
            ConfigurationManager.getInstance("key.default");
            assertEquals("config.key", ConfigurationManager.getProperty("KEY", "DEFAULT"));
        }
}