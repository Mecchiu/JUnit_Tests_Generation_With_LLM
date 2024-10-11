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

// Constants.java
package com.allenstudio.ir.util;

/**
* This class contains all the constants used in Inspirento.
*
* @author Allen Chue
*/
public class Constants {
		
		/**
		* The name of the project.
		*/
		public static final String PROJECT_NAME = "Inspirento";
		
		/**
		* The version of the project.
		*/
		public static final String PROJECT_VERSION = "1.0";
		
		/**
		* The name of the author.
		*/
		public static final String PROJECT_AUTHOR = "Allen Chue";
		
		/**
		* The name of the company.
		*/
		public static final String PROJECT_COMPANY = "Allen Studio";
		
		/**
		* The copyright of the project.
		*/
		public static final String PROJECT_COPYRIGHT = "Copyright (c) Allen Studio";
		
		/**
		* The license of the project.
		*/
		public static final String PROJECT_LICENSE = "GNU General Public License";
		
		/**
		* The name of the configuration file.
		*/
		public static final String CONFIG_FILE_NAME = "config.xml";
		
		/**
		* The name of the configuration directory.
		*/
		public static final String CONFIG_DIR_NAME = "config";
		
		/**
		* The name of the log file.
		*/
		public static final String LOG_FILE_NAME = "log.txt";
		
		/**
		* The name of the log directory.
		*/
		public static final String LOG_DIR_NAME = "log";
		
		/**
		* The name of the plugin directory.
		*/
		public static final String PLUGIN_DIR_NAME = "plugins";
		
		/**
		* The name of the plugin configuration file.
		*/
		public static final String PLUGIN_CONFIG_FILE_NAME = "plugin.xml";
		
		/**
		* The name of the plugin configuration directory.
		*/
		public static final String PLUGIN_CONFIG_DIR_NAME = "config";
		
		/**
		* The name of the plugin log file.
		*/
		public static final String PLUGIN_LOG_FILE_NAME = "log.txt";
		
		/**
		* The name of the plugin log directory.
		*/
		public static final String PLUGIN_LOG_DIR_NAME = "log";
		
		/**
		* The name of the plugin class file.
		*/
		public static final String PLUGIN_CLASS_FILE_NAME = "Plugin.class";
		
		/**
		* The name of the plugin class directory.
		*/
		public static final String PLUGIN_CLASS_DIR_NAME = "classes";
		
		/**
		* The name of the plugin source file.
		*/
		public static final String PLUGIN_SOURCE_FILE_NAME = "Plugin.java";
		
		/**
		* The name of the plugin source directory.
		*/
		public static final String PLUGIN_SOURCE_DIR_NAME = "src";
		
		/**
		* The name of the plugin resource file.
		*/
		public static final String PLUGIN_RESOURCE_FILE_NAME = "resource.txt";
		
		/**
		* The name of the plugin resource directory.
		*/
		public static final String PLUGIN_RESOURCE_DIR_NAME = "resource";
		
		/**
		* The name of the plugin library file.
		*/
		public static final String PLUGIN_LIBRARY_FILE_NAME = "library.txt";
		
		/**
		* The name of the plugin library directory.
		*/
		public static final String PLUGIN_LIBRARY_DIR_NAME = "lib";
		
		/**
		* The name of the plugin manifest file.
		*/
		public static final String PLUGIN_MANIFEST_FILE_NAME = "manifest.txt";
		
		/**
		* The name of the plugin manifest directory.
		*/
		public static final String PLUGIN_MANIFEST_DIR_NAME = "META-INF";
		
		/**
		* The name of the plugin icon file.
		*/
		public static final String PLUGIN_ICON_FILE_NAME = "icon.png";
		
		/**
		* The name of the plugin icon directory.
		*/
		public static final String PLUGIN_ICON_DIR_NAME = "icon";
		
		/**
		* The name of the plugin description file.
		*/
		public static final String PLUGIN_DESCRIPTION_FILE_NAME = "description.txt";
		
		/**
		* The name of the plugin description directory.
		*/
		public static final String PLUGIN_DESCRIPTION_DIR_NAME = "description";
		
		/**
		* The name of the plugin help file.
		*/
		public static final String PLUGIN_HELP_FILE_NAME = "help.txt";
		
		/**
		* The name of the plugin help directory.
		*/
		public static final String PLUGIN_HELP_DIR_NAME = "help";
		
		/**
		* The name of the plugin license file.
		*/
		public static final String PLUGIN_LICENSE_FILE_NAME = "license.txt";
		
		/**
		* The name of the plugin license directory.
		*/
		public static final String PLUGIN_LICENSE_DIR_NAME = "license";
		
		/**
		* The name of the plugin readme file.
		*/
		public static final String PLUGIN_README_FILE_NAME = "readme.txt";
		
		/**
		* The name of the plugin readme directory.
		*/
		public static final String PLUGIN_README_DIR_NAME = "readme";
		
		/**
		* The name of the plugin changelog file.
		*/
		public static final String PLUGIN_CHANGELOG_FILE_NAME = "changelog.txt";
		
		/**
		* The name of the plugin changelog directory.
		*/
		public static final String PLUGIN_CHANGELOG_DIR_NAME = "changelog";
		
		/**
		* The name of the plugin todo file.
		*/
		public static final String PLUGIN_TODO_FILE_NAME = "todo.txt";
		
		/**
		* The name of the plugin todo directory.
		*/
		public static final String PLUGIN_TODO_DIR_NAME = "todo";
		
		/**
		* The name of the plugin history file.
		*/
		public static final String PLUGIN_HISTORY_FILE_NAME = "history.txt";
		
		/**
		* The name of the plugin history directory.
		*/
		public static final String PLUGIN_HISTORY_DIR_NAME = "history";
		
		/**
		* The name of the plugin index file.
		*/
		public static final String PLUGIN_INDEX_FILE_NAME = "index.txt";
		
		/**
		* The name of the plugin index directory.
		*/
		public static final String PLUGIN_INDEX_DIR_NAME = "index";
		
		/**
		* The name of the plugin example file.
		*/
		public static final String PLUGIN_EXAMPLE_FILE_NAME = "example.txt";
		
		/**
		* The name of the plugin example directory.
		*/
		public static final String PLUGIN_EXAMPLE_DIR_NAME = "example";
		
		/**
		* The name of the plugin test file.
		*/
		public static final String PLUGIN_TEST_FILE_NAME = "test.txt";
		
		/**
		* The name of the plugin test directory.
		*/
		public static final String PLUGIN_TEST_DIR_NAME = "test";
		
		/**
		* The name of the plugin tutorial file.
		*/
		public static final String PLUGIN_TUTORIAL_FILE_NAME = "tutorial.txt";
		
		/**
		* The name of the plugin tutorial directory.
		*/
		public static final String PLUGIN_TUTORIAL_DIR_NAME = "tutorial";
		
		/**
		* The name of the plugin faq file.
		*/
		public static final String PLUGIN_FAQ_FILE_NAME = "faq.txt";
		
		/**
		* The name of the plugin faq directory.
		*/
		public static final String PLUGIN_FAQ_DIR_NAME = "faq";
		
		/**
		* The name of the plugin bug file.
		*/
		public static final String PLUGIN_BUG_FILE_NAME = "bug.txt";
		
		/**
		* The name of the plugin bug directory.
		*/
		public static final String PLUGIN_BUG_DIR_NAME = "bug";
		
		/**
		* The name of the plugin issue file.
		*/
		public static final String PLUGIN_ISSUE_FILE_NAME = "issue.txt";
		
		/**
		* The name of the plugin issue directory.
		*/
		public static final String PLUGIN_ISSUE_DIR_NAME = "issue";
		
		/**
		* The name of the plugin contact file.
		*/
		public static final String PLUGIN_CONTACT_FILE_NAME = "contact.txt";
		
		/**
		* The name of the plugin contact directory.
		*/
		public static final String PLUGIN_CONTACT_DIR_NAME = "contact";
		
		/**
		* The name of the plugin website file.
		*/
		public static final String PLUGIN_WEBSITE_FILE_NAME = "website.txt";
		
		/**
		* The name of the plugin website directory.
		*/
		public static final String PLUGIN_WEBSITE_DIR_NAME = "website";
		
		/**
		* The name of the plugin forum file.
		*/
		public static final String PLUGIN_FORUM_FILE_NAME = "forum.txt";
		
		/**
		* The name of the plugin forum directory.
		*/
		public static final String PLUGIN_FORUM_DIR_NAME = "forum";
		
		/**
		* The name of the plugin wiki file.
		*/
		public static final String PLUGIN_WIKI_FILE_NAME = "wiki.txt";
		
		/**
		* The name of the plugin wiki directory.
		*/
		public static final String PLUGIN_WIKI_DIR_NAME = "wiki";
		
		/**
		* The name of the plugin blog file.
		*/
		public static final String PLUGIN_BLOG_FILE_NAME = "blog.txt";
		
		/**
		* The name of the plugin blog directory.
		*/
		public static final String PLUGIN_BLOG_DIR_NAME = "blog";
		
		/**
