// ClassInfo_3Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains one unit test case for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_3Test {

	/**
	 * Set up the test so that the constructor exists
	 */
	static {
		try {
			ClassInfo.staticConstructors();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	/**
	 * Tests constructor of class {@code java.beans.Introspector} by instantiating the constructor
	 * and passing some instances of an interface to instantiate the constructor for its methods.
	 */
	static void testConstructors() {
		System.out.println("*** ClassInfo_3Test.testConstructors() ***");
		ClassInfoInfo ci = new ClassInfoInfo();
		ci.printConstructors();
		java.beans.Introspector intr = c.getBeanInfo().getBeanDescriptor().getIntrospector();
		Set interfaces = intr.getAllInterfaces();
		Iterator interfacesIter = interfaces.iterator();
		interfaceToClassObject = new HashMap<String,String>();
		while (interfacesIter.hasNext()) {
			String iface = (String) interfacesIter.next();
			System.out.println("Testing interfaces for '" + iface + "' interface");
			interfaceToClassObject.put(iface, introspectionClass(forInterface(iface)));
		}
		Iterator interfacesIter2 = interfaces.iterator();
		interfaceToClassObject2 = new HashMap<String,String>();
		while (interfacesIter2.hasNext()) {
			String iface = (String) interfacesIter2.next();
			System.out.println("Testing interfaces for '" + iface + "' interface2");
			interfaceToClassObject2.put(iface, introspectionClass(forInterface(iface)));
		}
	}

	/**
	 * The {@code public} constructor {@code introspectionClass(String)} is
	 * used to do a reflective class construction.
	 */
	static class ClassInfoInfo {

		public int constructor(String[] arg) {
			return 111;
		}

		public String forInterface(String iface) {
			return "public"+iface+"Interfaces"+iface;
		}
	}

	/**
	 * The {@code public} constructor {@code introspectionClass} is used to do a reflective class construction.
	 */
	static abstract class ClassInfoInfo_3Test_1 implements ClassInfoIntrospector {
			public String forInterface(String iface) {
				return "public"+iface+"Interfaces"+iface;
			}
	}

	/**
	 * The {@code public} constructor of {@code JSTestBeanInfo} is used as a reflection
	 * constructor for JSTestBean.
	 */
		static class ClassInfoInfo_3Test_2 implements ClassInfoIntrospector {
			static {
				try {
					ClassInfoInfo_3Test_2 ci = new ClassInfoInfo_3Test_2();
					ci.printConstructors();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

					public int forInterface(final String iface) {
				return 111;
				}
			
	}

	/**
	 * Test for method {@link ClassInfo#ClassInfo_3Test_2#ClassInfo_3Test_2()}
	 * Assert that the interface is as expected.
	 */
	@Test
	public void test() {
		System.out.println("*** classinfo_3Test_2.test() ***");
	}

	/**
	 * Test for method {@link ClassInfo#ClassInfo_3Test_2#forInterface(String)}
	 * Assert that the interface is as expected.
	 */
		public void testForInterface(final String iface) {
			System.out.println("Testing iface for ClassInfo_3Test_2.forInterface(iface): " + iface);
		}

		
	@Test
	public void test2() {
		System.out.println("*** classinfo_3Test_2.test2() ***");
		try {
			ClassInfo_3Test_2 ci = new ClassInfo_3Test_2();
			TestUtils.methodFor(ClassInfo_3Test_2.class, "testForInterface", String.class, ci);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			fail();
		}
	}

}

// ClassInfo_3Test.java
