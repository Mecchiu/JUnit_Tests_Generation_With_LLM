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

// FileUtil.java
package org.quickserver.util.io;

import java.util.*;
import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * A utility class to handle files.
 *
 * @author Akshathkumar Shetty
 * @since 1.3.2
 */
public class FileUtil {

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            throw new FileNotFoundException("File not found : " + fileName);
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir, boolean createParentDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentDir == true) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir, boolean createParentDir, boolean createParentParentDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentParentDir == true) {
                    file.getParentFile().getParentFile().mkdirs();
                }
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir, boolean createParentDir, boolean createParentParentDir, boolean createParentParentParentDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentParentDir == true) {
                    file.getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().mkdirs();
                }
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir, boolean createParentDir, boolean createParentParentDir, boolean createParentParentParentDir, boolean createParentParentParentParentDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentParentDir == true) {
                    file.getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir, boolean createParentDir, boolean createParentParentDir, boolean createParentParentParentDir, boolean createParentParentParentParentDir, boolean createParentParentParentParentParentDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentParentDir == true) {
                    file.getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir, boolean createParentDir, boolean createParentParentDir, boolean createParentParentParentDir, boolean createParentParentParentParentDir, boolean createParentParentParentParentParentDir, boolean createParentParentParentParentParentParentDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentParentDir == true) {
                    file.getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir, boolean createParentDir, boolean createParentParentDir, boolean createParentParentParentDir, boolean createParentParentParentParentDir, boolean createParentParentParentParentParentDir, boolean createParentParentParentParentParentParentDir, boolean createParentParentParentParentParentParentParentDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentParentDir == true) {
                    file.getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir, boolean createParentDir, boolean createParentParentDir, boolean createParentParentParentDir, boolean createParentParentParentParentDir, boolean createParentParentParentParentParentDir, boolean createParentParentParentParentParentParentDir, boolean createParentParentParentParentParentParentParentDir, boolean createParentParentParentParentParentParentParentParentDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentDir == true) {
                    file.getParentFile().mkdirs();
                }
                if (createParentParentDir == true) {
                    file.getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                if (createParentParentParentParentParentParentParentParentDir == true) {
                    file.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().mkdirs();
                }
                file.createNewFile();
            } else {
                throw new FileNotFoundException("File not found : " + fileName);
            }
        }
        return file;
    }

    /**
     * Returns the File object for the file passed as parameter.
     *
     * @param fileName path to the file
     */
    public static File getFile(String fileName, boolean create, boolean createDir, boolean createParentDir, boolean createParentParentDir, boolean createParentParentParentDir, boolean createParentParentParentParentDir, boolean createParentParentParentParentParentDir, boolean createParentParentParentParentParentParentDir, boolean createParentParentParentParentParentParentParentDir, boolean createParentParentParentParentParentParentParentParentDir, boolean createParentParentParentParentParentParentParentParentParentDir) throws Exception {
        logger.fine("Getting File for " + fileName);
        File file = new File(fileName);
        if (file.exists() == false) {
            if (create == true) {
                if (createDir == true) {
                    file.