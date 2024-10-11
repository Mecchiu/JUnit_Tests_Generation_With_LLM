// XPathReaderFactory_0Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains one unit test case for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_0Test {
		
    /**
	 * Test case: create a XPathReader from a class name
	 * that uses the system property {@link XPathReaderFactory#DRIVER_PROPERTY}.
	 * It should create a reader using that system property.
	 * @throws SAXPathException
	 */
    @Test
    public void testGetReader() throws SAXPathException {
        DRIVER_PROPERTY.setProperty("com.werken.saxpath.XPathReader",String.format("\"%s.%s\"",XPathReaderFactory_0Test.class.getName(),DEFAULT_DRIVER));
        XPathReader xqr = XPathReaderFactory.createReader();
        assertNotNull("Creating another test driver failed",xqr);
        assertTrue("XPathReaderFactory.createReader() was not a valid class", xqr instanceof XPathReader);
    }

    /**
	 * Test case: create a XPathReader from a class
	 * name which exists in the current package.
	 * Now just the test case should succeed.
	 * The test case may need to be updated if the package
	 * changes or changes to the generated classes
	 * or if a change in the class name occurs.
	 * @throws SAXPathException
	 */
    @Test
    public void testGetReaderFromSystemPackage() throws SAXPathException {
        DRIVER_PROPERTY.setProperty("org.saxpath.driver", String.format("\"%s.%s\"",XPathReaderFactory_0Test.class.getName(),DEFAULT_DRIVER));
	    try {
			XPathReader xqr = XPathReaderFactory.createReader();
	    	xqr.setClassLoader(new ClassLoader() {
	    		@Override
	    		public Class<?> loadClass(String name)
	    			throws ClassNotFoundException {
	    			if (name == null) {
	    				return Class.forName(DEFAULT_DRIVER);
	    			} else {
	    				return super.loadClass(name);
	    			}
				}	    		
	    		@Override
	    		public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
	    			if (name == null) {
	    				return Class.forName(DEFAULT_DRIVER);
	    			} else {
	    				return super.loadClass(name, resolve);
	    			}
				}	    		
	    		@Override
	    		public void loadClass(Class<?> klazz)
	    			throws ClassNotFoundException {
	    			if (klazz == null) {
	    				return;
	    			} else {
	    				System.out.println("Loading class from system package " + klazz.getName() + "\n");
	    			}
	    			if (klazz.equals(Class.class)) {
	    				if (NAME.equals(DEFAULT_DRIVER)) {
	    					return Class.forName(""+DEFAULT_DRIVER);
	    				} else {
	    					throw new ClassNotFoundException(name);
	    				}
	    			} else {
	    				throw new ClassNotFoundException(name);
	    			}
				}	    		
	    		});

	    		assertNotNull("Failed to get XPathReader using system package", xqr);
	    		
	    	} catch (ClassNotFoundException e) {
	    		throw getClass().newError("Failed to get XPathReader from system package:" + e.getMessage(),"",e);
	    	}
	    	
	    	xqr.setClassLoader(new ClassLoader() {
	    		
	    		@Override
	    		public Class<?> loadClass(String name)
	    			throws ClassNotFoundException {
	    			if (name == null) {
	    				return Class.forName(DEFAULT_DRIVER);
	    			} else {
	    				return super.loadClass(name);
	    			}
				}	    		
	    		@Override
	    		public Class<?> loadClass(String name, boolean resolve)
	    			throws ClassNotFoundException {
	    			if (name == null) {
	    				return Class.forName(DEFAULT_DRIVER);
	    			} else {
	    				return super.loadClass(name, resolve);
	    			}
				}	    		
	    		@Override
	    		public void
	    			loadClass(Class<?> klazz)
	    			throws ClassNotFoundException {
	    			if (klazz == null) {
	    				return;
	    			} else {
	    				System.out.println("Loading class from system package " + klazz.getName() + "\n");
	    			}
	    			if (klazz.equals(Class.class)) {
	    				if (NAME.equals(DEFAULT_DRIVER)) {
	    					return Class.forName(""+DEFAULT_DRIVER);
	    				} else {
	    					throw new ClassNotFoundException(name);
	    				}
	    			} else {
	    				throw new ClassNotFoundException(name);
	    			}
				}	    		
	    		});

	    	}
	    }