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

	@Test
	public void testGetClassLoaderFromJars() throws Exception {
		ClassLoader cl = ClassUtil.getClassLoaderFromJars("/home/akshath/lib");
		assertNotNull(cl);
	}
}

// ClassUtil.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to load class.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class ClassUtil {

    /**
     * Returns the ClassLoader to all the jars present in the
     * dir passed has first parameter.
     *
     * @param jarDir path to the directory containing the jars
     */
    public static ClassLoader getClassLoaderFromJars(String jarDir) throws Exception {
        File dir = new File(jarDir);
        if(dir.isDirectory()==false) {
            throw new Exception("Not a directory : "+jarDir);
        }

        File[] files = dir.listFiles();
        if(files==null) {
            throw new Exception("No files in directory : "+jarDir);
        }

        URL[] urls = new URL[files.length];
        for(int i=0;i<files.length;i++) {
            urls[i] = files[i].toURL();
        }
        return new URLClassLoader(urls);
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
		
	@Test
	public void testGetClassLoaderFromJars() throws Exception {
		ClassLoader cl = ClassUtil.getClassLoaderFromJars("/home/akshath/lib");
		assertNotNull(cl);
	}
}

// ClassUtil.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to load class.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class ClassUtil {

    /**
     * Returns the ClassLoader to all the jars present in the
     * dir passed has first parameter.
     *
     * @param jarDir path to the directory containing the jars
     */
    public static ClassLoader getClassLoaderFromJars(String jarDir) throws Exception {
        File dir = new File(jarDir);
        if(dir.isDirectory()==false) {
            throw new Exception("Not a directory : "+jarDir);
        }

        File[] files = dir.listFiles();
        if(files==null) {
            throw new Exception("No files in directory : "+jarDir);
        }

        URL[] urls = new URL[files.length];
        for(int i=0;i<files.length;i++) {
            urls[i] = files[i].toURL();
        }
        return new URLClassLoader(urls);
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
		
	@Test
	public void testGetClassLoaderFromJars() throws Exception {
		ClassLoader cl = ClassUtil.getClassLoaderFromJars("/home/akshath/lib");
		assertNotNull(cl);
	}
}

// ClassUtil.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to load class.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class ClassUtil {

    /**
     * Returns the ClassLoader to all the jars present in the
     * dir passed has first parameter.
     *
     * @param jarDir path to the directory containing the jars
     */
    public static ClassLoader getClassLoaderFromJars(String jarDir) throws Exception {
        File dir = new File(jarDir);
        if(dir.isDirectory()==false) {
            throw new Exception("Not a directory : "+jarDir);
        }

        File[] files = dir.listFiles();
        if(files==null) {
            throw new Exception("No files in directory : "+jarDir);
        }

        URL[] urls = new URL[files.length];
        for(int i=0;i<files.length;i++) {
            urls[i] = files[i].toURL();
        }
        return new URLClassLoader(urls);
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
		
	@Test
	public void testGetClassLoaderFromJars() throws Exception {
		ClassLoader cl = ClassUtil.getClassLoaderFromJars("/home/akshath/lib");
		assertNotNull(cl);
	}
}

// ClassUtil.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to load class.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class ClassUtil {

    /**
     * Returns the ClassLoader to all the jars present in the
     * dir passed has first parameter.
     *
     * @param jarDir path to the directory containing the jars
     */
    public static ClassLoader getClassLoaderFromJars(String jarDir) throws Exception {
        File dir = new File(jarDir);
        if(dir.isDirectory()==false) {
            throw new Exception("Not a directory : "+jarDir);
        }

        File[] files = dir.listFiles();
        if(files==null) {
            throw new Exception("No files in directory : "+jarDir);
        }

        URL[] urls = new URL[files.length];
        for(int i=0;i<files.length;i++) {
            urls[i] = files[i].toURL();
        }
        return new URLClassLoader(urls);
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
		
	@Test
	public void testGetClassLoaderFromJars() throws Exception {
		ClassLoader cl = ClassUtil.getClassLoaderFromJars("/home/akshath/lib");
		assertNotNull(cl);
	}
}

// ClassUtil.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to load class.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class ClassUtil {

    /**
     * Returns the ClassLoader to all the jars present in the
     * dir passed has first parameter.
     *
     * @param jarDir path to the directory containing the jars
     */
    public static ClassLoader getClassLoaderFromJars(String jarDir) throws Exception {
        File dir = new File(jarDir);
        if(dir.isDirectory()==false) {
            throw new Exception("Not a directory : "+jarDir);
        }

        File[] files = dir.listFiles();
        if(files==null) {
            throw new Exception("No files in directory : "+jarDir);
        }

        URL[] urls = new URL[files.length];
        for(int i=0;i<files.length;i++) {
            urls[i] = files[i].toURL();
        }
        return new URLClassLoader(urls);
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
		
	@Test
	public void testGetClassLoaderFromJars() throws Exception {
		ClassLoader cl = ClassUtil.getClassLoaderFromJars("/home/akshath/lib");
		assertNotNull(cl);
	}
}

// ClassUtil.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to load class.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class ClassUtil {

    /**
     * Returns the ClassLoader to all the jars present in the
     * dir passed has first parameter.
     *
     * @param jarDir path to the directory containing the jars
     */
    public static ClassLoader getClassLoaderFromJars(String jarDir) throws Exception {
        File dir = new File(jarDir);
        if(dir.isDirectory()==false) {
            throw new Exception("Not a directory : "+jarDir);
        }

        File[] files = dir.listFiles();
        if(files==null) {
            throw new Exception("No files in directory : "+jarDir);
        }

        URL[] urls = new URL[files.length];
        for(int i=0;i<files.length;i++) {
            urls[i] = files[i].toURL();
        }
        return new URLClassLoader(urls);
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
		
	@Test
	public void testGetClassLoaderFromJars() throws Exception {
		ClassLoader cl = ClassUtil.getClassLoaderFromJars("/home/akshath/lib");
		assertNotNull(cl);
	}
}

// ClassUtil.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to load class.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class ClassUtil {

    /**
     * Returns the ClassLoader to all the jars present in the
     * dir passed has first parameter.
     *
     * @param jarDir path to the directory containing the jars
     */
    public static ClassLoader getClassLoaderFromJars(String jarDir) throws Exception {
        File dir = new File(jarDir);
        if(dir.isDirectory()==false) {
            throw new Exception("Not a directory : "+jarDir);
        }

        File[] files = dir.listFiles();
        if(files==null) {
            throw new Exception("No files in directory : "+jarDir);
        }

        URL[] urls = new URL[files.length];
        for(int i=0;i<files.length;i++) {
            urls[i] = files[i].toURL();
        }
        return new URLClassLoader(urls);
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
		
	@Test
	public void testGetClassLoaderFromJars() throws Exception {
		ClassLoader cl = ClassUtil.getClassLoaderFromJars("/home/akshath/lib");
		assertNotNull(cl);
	}
}

// ClassUtil.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;

/**
 * A utility class to load class.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class ClassUtil {

    /**
     * Returns the ClassLoader to all the jars present in the
     * dir passed has first parameter.
     *
     * @param jarDir path to the directory containing the jars
     */
    public static ClassLoader getClassLoaderFromJars(String jarDir) throws Exception {
        File dir = new File(jarDir);
        if(dir.isDirectory()==false) {
            throw new Exception("Not a directory : "+jarDir);
        }

        File[] files = dir.listFiles();
        if(files==null) {
            throw new Exception("No files in directory :