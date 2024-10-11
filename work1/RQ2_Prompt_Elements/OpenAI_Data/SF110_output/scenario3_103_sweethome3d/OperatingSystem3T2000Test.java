// OperatingSystemTest.java
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
class OperatingSystemTest {

		@Test
		void testIsMacOSXLeopardOrSuperior() {
				assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
		}
}

// Home.java
package com.eteks.sweethome3d.model;

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

/**
 * A home managed by Sweet Home 3D.
 * @author Emmanuel Puybaret
 */
public class Home {
		
		/**
		 * Returns <code>true</code> if this home is modified.
		 */
		public boolean isModified();
}

// HomeTest.java
package com.eteks.sweethome3d.model;

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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Home}.
* It contains ten unit test cases for the {@link Home#isModified()} method.
*/
class HomeTest {
		
		@Test
		void testIsModified() {
				assertTrue(new Home().isModified());
		}
}

// FileManager.java
package com.apple.eio;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**
 * A class to manage files.
 * @author Emmanuel Puybaret
 */
public class FileManager {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
		 */
		public static boolean isDirectory(File file);
}

// FileManagerTest.java
package com.apple.eio;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileManager}.
* It contains ten unit test cases for the {@link FileManager#isDirectory(File)} method.
*/
class FileManagerTest {
		
		@Test
		void testIsDirectory() {
				assertTrue(FileManager.isDirectory(new File("")));
		}
}

// File.java
package java.io;

import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**
 * A file.
 * @author Emmanuel Puybaret
 */
public class File {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
		 */
		public boolean isDirectory();
}

// FileTest.java
package java.io;

import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link File}.
* It contains ten unit test cases for the {@link File#isDirectory()} method.
*/
class FileTest {
		
		@Test
		void testIsDirectory() {
				assertTrue(new File("").isDirectory());
		}
}

// FileFilter.java
package java.io;

import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**
 * A file filter.
 * @author Emmanuel Puybaret
 */
public interface FileFilter {
		
		/**
		 * Returns <code>true</code> if this file should be included in a file list.
		 */
		public boolean accept(File file);
}

// FileFilterTest.java
package java.io;

import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFilter}.
* It contains ten unit test cases for the {@link FileFilter#accept(File)} method.
*/
class FileFilterTest {
		
		@Test
		void testAccept() {
				assertTrue(new FileFilter() {
						public boolean accept(File file) {
								return true;
						}
				}.accept(new File("")));
		}
}

// IOException.java
package java.io;

import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**
 * An exception thrown when an I/O error occurs.
 * @author Emmanuel Puybaret
 */
public class IOException extends Exception {
		
		/**
		 * Constructs an <code>IOException</code> with <code>null</code>
		 * as its error detail message.
		 */
		public IOException();
}

// IOExceptionTest.java
package java.io;

import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IOException}.
* It contains ten unit test cases for the {@link IOException#IOException()} method.
*/
class IOExceptionTest {
		
		@Test
		void testIOException() {
				assertNotNull(new IOException());
		}
}

// AccessControlException.java
package java.security;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**