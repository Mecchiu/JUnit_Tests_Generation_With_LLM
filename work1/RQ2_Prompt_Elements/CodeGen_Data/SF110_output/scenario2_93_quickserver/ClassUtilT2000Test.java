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
* It contains one unit test case for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {

	ClassUtilTest() {}

	@Test
    public void testGetClassLoaderFromJar() throws Exception {
        try {
            ClassUtil.getClassLoaderFromJars("class://org.quickserver.util.ClassUtil.jar");
            fail("ClassUtil cannot load a jar from classpath as a parent jar.");
        } catch (URISyntaxException e) {
            testFailure("getClassLoaderFromJar");
        } catch (MalformedURLException e) {
            testFailure("getClassLoaderFromJar");
        }

		try {
            JarFile parentJar = new JarFile("class://org.quickserver.util.TestSuite.jar");
	        ClassLoader cl = ClassUtil.getClassLoaderFromJars(parentJar.getName());
	        assertEquals(cl, ClassUtil.getClassLoaderFromJars("class://org.quickserver.util.TestSuite.jar"));
	        logger.warning("Expecting same Clazzloader for jars, got " + cl);
        } catch (IOException e) {
            testFailure("getClassLoaderFromJar");
	    }
	}

    /**
     * Failure.
     * It cannot access the class from classloader.getClass(),
     * because it has been created by this classloader,
     * it does not contain the java.lang.ClassLoader
     */
    @Test
    public void testGetClassLoaderFromJars() throws IOException {
	File parentJar = File.createTempFile("jar", "txt");
	parentJar.delete();
	parentJar.getParentFile().delete();
	try {
	        ClassLoader cl = ClassUtil.getClassLoaderFromJars(parentJar.getName());
	        assertEquals(cl, ClassUtil.getClassLoaderFromJars("class://org.quickserver.util.TestSuite.jar"));
	        } catch(IOException e) {
	        logger.warning(e.getMessage());
            }
	} catch (IOException e) {
                error("Error while creating fake jar for getClassLoaderFromJars in testGetClassLoaderFromJars");
	}        }

    @Test
    public void testGetClassLoaderFromJarURL() throws Exception {
	ClassLoader cl = ClassUtil.getClassLoaderFromJars("class://org.quickserver.util.class/org.quickserver.util.URL.class");
		assertEquals(cl, ClassUtil.URLClassLoader.getSystemClassLoader());
			}

    private void error(String message) throws Exception {
        System.err.println("ERROR: " + message);
    }
}


/**
* This class is an implementation of a class to test the class loaders.
* Only the class should have to have a constructor, 
* since {@link ClassUtil#getClassLoaderFromJars()}
* will be used to call the method.
*
* @since 1.0
*/
class ClassUtilTest {

	private ArrayList classes;
	public ClassUtilTest() {
	classes = new ArrayList();
	}

	public void dumpClass(String classname, Class clazz, boolean skipSafepoints) throws IOException {
		if(skipSafepoints) {
			System.err.println("\n\n" + classname);
			return;
		}
        //dump the class to string.
		System.out.print("\n\n" + classname);
        if(clazz == null) {
            System.err.println("");
        } else {
            classes.add(clazz);
        }
	}

	public void dumpClassWithName(String classname, Class classForTest) throws IOException {
		//This should never happen.
		assertTrue( classname + " should be a class", classForTest!= null);
		DumpUtil.dumpFile("classpath", classForTest.getClassLoader().getParent()
					+ "/" + classForTest.getName());
	}

	private void dumpAllClasses(Boolean skipSafepoints) {
		for (int i = 0; i < classes.size(); i++) {
			Class aClass = classes.get(i);
      classes.remove(i);
			files.add("classpath" + File.pathSeparatorChar + aClass.getName());
			try {
				aClass.getClassLoader().loadClass(aClass.getName());
			} catch (ClassNotFoundException cnfe) {
			// Do nothing
			}
        if(!skipSafepoints) {

			}
			}
	}

	private void dumpFile(String file, String path, Boolean skipSafepoints) throws IOException {
		if(skipSafepoints) {
			System.err.println("");
			return;
		}
		files.add("file/path" + File.pathSeparatorChar + path + ";" + file.replaceFirst("file://", ""));
	}
	private void error(String message) throws IOException {
		System.err.println(message);
	}

	public void doGetClassLoaderFromJars(String files) throws Exception {
		classes = new ArrayList();
		classes.add(Files.class);
		classes.add(File.class);
		classes.add(URL.class);
		dumpAllClasses(true);
		dumpFile("classpath" + File.separatorChar + "org.quickserver.test.ClassUtilTest.jar", files.toString(), true);
		StringBuffer clsBuf = new StringBuffer();
//	        clsBuf.append("  classorg.quickserver.test.ClassUtilTest\n");
	        ClazzLoader loader = ClassUtil.getClassLoaderFromJars("classpath" + File.separatorChar
            		        + "org.quickserver.test.ClassUtilTest.jar");
	        classes.remove(loader);
	        classes.add(loader);
		dumpAllClasses(false);
		classes.add(ArrayList.class);
		classes.add(String.class);
		dumpAllClasses(false);
		classes.add(Array.class);
        classes.add(ClassWithException.class);
        classes.add(ClassWithoutThrowableElt.class);
        classes.add(FileTest.class);
		classes.add(ClassTestWithThrowable.class);
		classes.add(ClassWithoutThrowableEltTest.class);