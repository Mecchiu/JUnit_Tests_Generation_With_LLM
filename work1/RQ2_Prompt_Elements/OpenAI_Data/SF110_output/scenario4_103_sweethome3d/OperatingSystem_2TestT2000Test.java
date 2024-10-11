// OperatingSystem_2Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSX()} method.
*/
class OperatingSystem_2Test {

		@Test
		void testIsMacOSX() {
				// Test case 1
				assertTrue(OperatingSystem.isMacOSX());
				// Test case 2
				assertTrue(OperatingSystem.isMacOSX());
				// Test case 3
				assertTrue(OperatingSystem.isMacOSX());
				// Test case 4
				assertTrue(OperatingSystem.isMacOSX());
				// Test case 5
				assertTrue(OperatingSystem.isMacOSX());
				// Test case 6
				assertTrue(OperatingSystem.isMacOSX());
				// Test case 7
				assertTrue(OperatingSystem.isMacOSX());
				// Test case 8
				assertTrue(OperatingSystem.isMacOSX());
				// Test case 9
				assertTrue(OperatingSystem.isMacOSX());
				// Test case 10
				assertTrue(OperatingSystem.isMacOSX());
		}
}

// OperatingSystem_3Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
*/
class OperatingSystem_3Test {
		
		@Test
		void testIsMacOSXLeopardOrSuperior() {
				// Test case 1
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
				// Test case 2
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
				// Test case 3
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
				// Test case 4
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
				// Test case 5
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
				// Test case 6
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
				// Test case 7
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
				// Test case 8
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
				// Test case 9
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
				// Test case 10
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
		}
}

// OperatingSystem_4Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#createTemporaryFile(String, String)} method.
*/
class OperatingSystem_4Test {
		
		@Test
		void testCreateTemporaryFile() {
				// Test case 1
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
				// Test case 2
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
				// Test case 3
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
				// Test case 4
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
				// Test case 5
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
				// Test case 6
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
				// Test case 7
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
				// Test case 8
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
				// Test case 9
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
				// Test case 10
				assertTrue(OperatingSystem.createTemporaryFile("prefix", "suffix") != null);
		}
}

// OperatingSystem_5Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#deleteTemporaryFiles()} method.
*/
class OperatingSystem_5Test {
		
		@Test
		void testDeleteTemporaryFiles() {
				// Test case 1
				OperatingSystem.deleteTemporaryFiles();
				// Test case 2
				OperatingSystem.deleteTemporaryFiles();
				// Test case 3
				OperatingSystem.deleteTemporaryFiles();
				// Test case 4
				OperatingSystem.deleteTemporaryFiles();
				// Test case 5
				OperatingSystem.deleteTemporaryFiles();
				// Test case 6
				OperatingSystem.deleteTemporaryFiles();
				// Test case 7
				OperatingSystem.deleteTemporaryFiles();
				// Test case 8
				OperatingSystem.deleteTemporaryFiles();
				// Test case 9
				OperatingSystem.deleteTemporaryFiles();
				// Test case 10
				OperatingSystem.deleteTemporaryFiles();
		}
}

// OperatingSystem_6Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer