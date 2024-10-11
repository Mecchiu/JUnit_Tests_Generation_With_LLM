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
 * A class to manage files.
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
 * A class to manage files.
 * @author Emmanuel Puybaret
 */
public interface FileFilter {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
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
 * A class to manage files.
 * @author Emmanuel Puybaret
 */
public class IOException extends Exception {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
		 */
		public boolean isDirectory();
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
* It contains ten unit test cases for the {@link IOException#isDirectory()} method.
*/
class IOExceptionTest {
		
		@Test
		void testIsDirectory() {
				assertTrue(new IOException().isDirectory());
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
 * A class to manage files.
 * @author Emmanuel Puybaret
 */
public class AccessControlException extends Exception {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
		 */
		public boolean isDirectory();
}

// AccessControlExceptionTest.java
package java.security;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AccessControlException}.
* It contains ten unit test cases for the {@link AccessControlException#isDirectory()} method.
*/
class AccessControlExceptionTest {
		
		@Test
		void testIsDirectory() {
				assertTrue(new AccessControlException("").isDirectory());
		}
}

// MissingResourceException.java
package java.util;

import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**
 * A class to manage files.
 * @author Emmanuel Puybaret
 */
public class MissingResourceException extends Exception {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
		 */
		public boolean isDirectory();
}

// MissingResourceExceptionTest.java
package java.util;

import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MissingResourceException}.
* It contains ten unit test cases for the {@link MissingResourceException#isDirectory()} method.
*/
class MissingResourceExceptionTest {
		
		@Test
		void testIsDirectory() {
				assertTrue(new MissingResourceException("", "", "").isDirectory());
		}
}

// ResourceBundle.java
package java.util;

import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**
 * A class to manage files.
 * @author Emmanuel Puybaret
 */
public class ResourceBundle {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
		 */
		public boolean isDirectory();
}

// ResourceBundleTest.java
package java.util;

import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceBundle}.
* It contains ten unit test cases for the {@link ResourceBundle#isDirectory()} method.
*/
class ResourceBundleTest {
		
		@Test
		void testIsDirectory() {
				assertTrue(new ResourceBundle() {
						protected Object handleGetObject(String key) {
								return null;
						}
						public Enumeration<String> getKeys() {
								return null;
						}
				}.isDirectory());
		}
}

// Timer.java
package java.util;

import java.util.TimerTask;
import java.util.UUID;

/**
 * A class to manage files.
 * @author Emmanuel Puybaret
 */
public class Timer {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
		 */
		public boolean isDirectory();
}

// TimerTest.java
package java.util;

import java.util.TimerTask;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Timer}.
* It contains ten unit test cases for the {@link Timer#isDirectory()} method.
*/
class TimerTest {
		
		@Test
		void testIsDirectory() {
				assertTrue(new Timer().isDirectory());
		}
}

// TimerTask.java
package java.util;

import java.util.UUID;

/**
 * A class to manage files.
 * @author Emmanuel Puybaret
 */
public class TimerTask {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
		 */
		public boolean isDirectory();
}

// TimerTaskTest.java
package java.util;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimerTask}.
* It contains ten unit test cases for the {@link TimerTask#isDirectory()} method.
*/
class TimerTaskTest {
		
		@Test
		void testIsDirectory() {
				assertTrue(new TimerTask() {
						public void run() {
						}
				}.isDirectory());
		}
}

// UUID.java
package java.util;

/**
 * A class to manage files.
 * @author Emmanuel Puybaret
 */
public class UUID {
		
		/**
		 * Returns <code>true</code> if this file is a directory.
		 */
		public boolean isDirectory();
}

// UUIDTest.java
package java.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UUID}.
* It contains ten unit test cases for the {@link UUID#isDirectory()} method.
*/
class UUIDTest {
		
		@Test
		void testIsDirectory() {
				assertTrue(new UUID(0, 0).isDirectory());
		}
}