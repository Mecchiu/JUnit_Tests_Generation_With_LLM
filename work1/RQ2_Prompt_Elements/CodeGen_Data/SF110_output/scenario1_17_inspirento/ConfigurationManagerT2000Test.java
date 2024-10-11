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
private ConfigurationManager manager;
		private String newPath;
		private String newPath2;
		private String fileName = "config.json";
		private String configPath = "config/";

		/**
		* Creates an instance of {@link ConfigurationManagerTest}.
		* This constructor is static, so this class implements the test cases of
		* this test class.<br>
		* To be used by the unit tests.<br><br>
		* @see org.jmock.common.Mock#someMethod()
		*/
		public ConfigurationManagerTest() {
			try {
				InputStream in = this.getClass().getResourceAsStream("/" + fileName);
				this.manager = new ConfigurationManager(in);
			} catch (IOException e) {
				fail("ConfigurationManagerTest.noTestCaseException");
			}
		}

		@Test
		public void testCreation() {
			//Test the properties that can be set to any key
			assertEquals(File.separator, File.pathSeparator);
			assertEquals(this.configPath, this.manager.getPath(ConfigurationManager.PROP_CONFIG_PATH));
			String path = this.configPath + ConfigurationManager.PROP_CONFIG_PATH;

			assertEquals(String.valueOf(this.manager.getProperty(ConfigurationManager.PROP_SRC)), path);
			//This will assert that the properties that will be saved to the file
			assertEquals(String.valueOf(this.newPath), path);
			//The final test
			assertNotSame(String.valueOf(this.newPath), this.manager.getProperty(ConfigurationManager.PROP_FILEPATH));
			assertNotSame(this.newPath, path);
		}

		public String getFileName() {
			return this.fileName;
		}

		public String getPath() {
			return this.newPath;
		}

		public String getNewPath() {
			return this.newPath2;
		}

		public void setNewPath(String newPath) {
			this.newPath2 = newPath;
		}

		public File getFile() {
			return this.file;
		}

		public void setFile(File file) throws IOException {
			this.file = file;
		}

		public File getFile2() {
			return this.file2;
		}

		public void setFile2(File file2) {
			this.file2 = file2;
		}

	}
