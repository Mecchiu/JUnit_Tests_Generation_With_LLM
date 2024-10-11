// ClassUtilTest.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassUtil}.
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {

		private static final Logger logger = Logger.getLogger(ClassUtilTest.class.getName());
		
		@Test
		public void testGetClassLoaderFromJars() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				assertNotNull(classLoader);
				logger.fine("ClassLoader : "+classLoader);
		}
}

// JarFileList.java
package org.quickserver.util.io;

import java.io.*;
import java.util.logging.*;

/**
 * This class is used to filter jar files.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class JarFileList implements FilenameFilter {
    private static final Logger logger = Logger.getLogger(JarFileList.class.getName());

    public boolean accept(File dir, String name) {
        if (name.endsWith(".jar")) {
            return true;
        } else {
            return false;
        }
    }
}

// JarFileListTest.java
package org.quickserver.util.io;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JarFileList}.
* It contains ten unit test cases for the {@link JarFileList#accept(File, String)} method.
*/
class JarFileListTest {
		
		private static final Logger logger = Logger.getLogger(JarFileListTest.class.getName());
		
		@Test
		public void testAccept() throws Exception {
				JarFileList jarFileList = new JarFileList();
				assertTrue(jarFileList.accept(new File("lib"), "test.jar"));
				assertFalse(jarFileList.accept(new File("lib"), "test.txt"));
		}
}

// ClassUtilTest.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassUtil}.
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {
		
		private static final Logger logger = Logger.getLogger(ClassUtilTest.class.getName());
		
		@Test
		public void testGetClassLoaderFromJars() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				assertNotNull(classLoader);
				logger.fine("ClassLoader : "+classLoader);
		}
}

// JarFileList.java
package org.quickserver.util.io;

import java.io.*;
import java.util.logging.*;

/**
 * This class is used to filter jar files.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class JarFileList implements FilenameFilter {
    private static final Logger logger = Logger.getLogger(JarFileList.class.getName());

    public boolean accept(File dir, String name) {
        if (name.endsWith(".jar")) {
            return true;
        } else {
            return false;
        }
    }
}

// JarFileListTest.java
package org.quickserver.util.io;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JarFileList}.
* It contains ten unit test cases for the {@link JarFileList#accept(File, String)} method.
*/
class JarFileListTest {
		
		private static final Logger logger = Logger.getLogger(JarFileListTest.class.getName());
		
		@Test
		public void testAccept() throws Exception {
				JarFileList jarFileList = new JarFileList();
				assertTrue(jarFileList.accept(new File("lib"), "test.jar"));
				assertFalse(jarFileList.accept(new File("lib"), "test.txt"));
		}
}

// ClassUtilTest.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassUtil}.
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {
		
		private static final Logger logger = Logger.getLogger(ClassUtilTest.class.getName());
		
		@Test
		public void testGetClassLoaderFromJars() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				assertNotNull(classLoader);
				logger.fine("ClassLoader : "+classLoader);
		}
}

// JarFileList.java
package org.quickserver.util.io;

import java.io.*;
import java.util.logging.*;

/**
 * This class is used to filter jar files.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class JarFileList implements FilenameFilter {
    private static final Logger logger = Logger.getLogger(JarFileList.class.getName());

    public boolean accept(File dir, String name) {
        if (name.endsWith(".jar")) {
            return true;
        } else {
            return false;
        }
    }
}

// JarFileListTest.java
package org.quickserver.util.io;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JarFileList}.
* It contains ten unit test cases for the {@link JarFileList#accept(File, String)} method.
*/
class JarFileListTest {
		
		private static final Logger logger = Logger.getLogger(JarFileListTest.class.getName());
		
		@Test
		public void testAccept() throws Exception {
				JarFileList jarFileList = new JarFileList();
				assertTrue(jarFileList.accept(new File("lib"), "test.jar"));
				assertFalse(jarFileList.accept(new File("lib"), "test.txt"));
		}
}

// ClassUtilTest.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassUtil}.
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {
		
		private static final Logger logger = Logger.getLogger(ClassUtilTest.class.getName());
		
		@Test
		public void testGetClassLoaderFromJars() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				assertNotNull(classLoader);
				logger.fine("ClassLoader : "+classLoader);
		}
}

// JarFileList.java
package org.quickserver.util.io;

import java.io.*;
import java.util.logging.*;

/**
 * This class is used to filter jar files.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class JarFileList implements FilenameFilter {
    private static final Logger logger = Logger.getLogger(JarFileList.class.getName());

    public boolean accept(File dir, String name) {
        if (name.endsWith(".jar")) {
            return true;
        } else {
            return false;
        }
    }
}

// JarFileListTest.java
package org.quickserver.util.io;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JarFileList}.
* It contains ten unit test cases for the {@link JarFileList#accept(File, String)} method.
*/
class JarFileListTest {
		
		private static final Logger logger = Logger.getLogger(JarFileListTest.class.getName());
		
		@Test
		public void testAccept() throws Exception {
				JarFileList jarFileList = new JarFileList();
				assertTrue(jarFileList.accept(new File("lib"), "test.jar"));
				assertFalse(jarFileList.accept(new File("lib"), "test.txt"));
		}
}

// ClassUtilTest.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassUtil}.
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {
		
		private static final Logger logger = Logger.getLogger(ClassUtilTest.class.getName());
		
		@Test
		public void testGetClassLoaderFromJars() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				assertNotNull(classLoader);
				logger.fine("ClassLoader : "+classLoader);
		}
}

// JarFileList.java
package org.quickserver.util.io;

import java.io.*;
import java.util.logging.*;

/**
 * This class is used to filter jar files.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class JarFileList implements FilenameFilter {
    private static final Logger logger = Logger.getLogger(JarFileList.class.getName());

    public boolean accept(File dir, String name) {
        if (name.endsWith(".jar")) {
            return true;
        } else {
            return false;
        }
    }
}

// JarFileListTest.java
package org.quickserver.util.io;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JarFileList}.
* It contains ten unit test cases for the {@link JarFileList#accept(File, String)} method.
*/
class JarFileListTest {
		
		private static final Logger logger = Logger.getLogger(JarFileListTest.class.getName());
		
		@Test
		public void testAccept() throws Exception {
				JarFileList jarFileList = new JarFileList();
				assertTrue(jarFileList.accept(new File("lib"), "test.jar"));
				assertFalse(jarFileList.accept(new File("lib"), "test.txt"));
		}
}

// ClassUtilTest.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassUtil}.
* It contains ten unit test cases for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {
		
		private static final Logger logger = Logger.getLogger(ClassUtilTest.class.getName());
		
		@Test
		public void testGetClassLoaderFromJars() throws Exception {
				ClassLoader classLoader = ClassUtil.getClassLoaderFromJars("lib");
				assertNotNull(classLoader);
				logger.fine("ClassLoader : "+classLoader);
		}
}

// JarFileList.java
package org.quickserver.util.io;

import java.io.*;
import java.util.logging.*;

/**
 * This class is used to filter jar files.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class JarFileList implements FilenameFilter {
    private static final Logger logger = Logger.getLogger(JarFileList.class.getName());

    public boolean accept(File dir, String name) {
        if (name.endsWith(".jar")) {
            return true;
        } else {
            return false;
        }
    }
}

// JarFileListTest.java
package org.quickserver.util.io;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JarFileList}.
* It contains ten unit test cases for the {@link JarFileList#accept(File, String)} method.
*/
class JarFileListTest {
		
		private static final Logger logger = Logger.getLogger(JarFileListTest.class.getName());
		
		@Test
		public void testAccept() throws Exception {
				JarFileList jarFileList = new JarFileList();
				assertTrue(jarFileList.accept(new File("lib"), "test.jar"));
				assertFalse(jarFileList.accept(new File("lib"), "test.txt"));
		}
}

// ClassUtilTest.java
package