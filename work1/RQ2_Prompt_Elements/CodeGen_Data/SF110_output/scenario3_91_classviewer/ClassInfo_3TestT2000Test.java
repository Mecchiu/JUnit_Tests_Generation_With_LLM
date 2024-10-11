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
// Class Info
    private final ClassInfo classInfo = new ClassInfo();

    /**
     * Tests printing methods.
     *
     * @throws MethodNotFoundException
     */
	@Test
	public void testPrintConstructors_1() throws MethodNotFoundException {

		// Call methods
		classInfo.printConstructors();

		// Check methods
		List methodsCreated = (List) ((Class) ClassInfo.class.getDeclaredConstructors()[0]).newInstance();
		assertNotNull("The List that was created is null", methodsCreated);
		assertTrue("List created is empty", methodsCreated.size() > 0);
		Iterator methodIt = methodsCreated.iterator();
		while (methodIt.hasNext()) {
			Object method = methodIt.next();
			System.out.println("Test passed: " + method.toString());
		}
	}
	
	/**
	 * Tests printing methods.
	 *
	 * @throws MethodNotFoundException
	 */
	@Test
	public void testPrintConstructors_2() throws MethodNotFoundException {
	
	
		// Call methods
		classInfo.printConstructors();
	}

	/**
	 * Tests printing methods.
	 *
	 * @throws MethodNotFoundException
	 */
	@Test
	public void testPrintMethods_1() throws MethodNotFoundException {
		
		// Initialise test with null (classInfo.printConstructors() was not called)
		assertTrue("constructors should have been made and not a null value", classInfo.printConstructors()!=null);
		assertTrue("constructors should not have been made and a null value", classInfo.printConstructors() ==null);
	}
		
	/**
	 * Tests printing methods.
	 *
	 * @throws MethodNotFoundException
	 */
	@Test
	public void testPrintMethods_2() throws MethodNotFoundException {
	
		// Set print data to false
		classInfo.printConstructors(System.out);

		// Call methods
		classInfo.printConstructors();
	}
	
	/**
	 * Tests printing methods.
	 *
	 * @throws MethodNotFoundException
	 */
	@Test
	public void testPrintMethods_3() throws MethodNotFoundException {
	
		// Set print data to false
		classInfo.printConstructors(null);

		// Call methods
		classInfo.printConstructors();
	}
	
	/**
	 * Tests that all non null fields and methods are printed to the output.
	 *
	 * @throws MethodNotFoundException
	 */
	@Test
	public void testPrintData_1() throws MethodNotFoundException {
		
		// Set print data to false
		classInfo.printConstructors(new String[]{null});

		// Create null fields
		classInfo.printConstructors(new String[]{null,null});
		classInfo.printConstructors(new String[]{null,null,null});
		classInfo.printConstructors(new String[]{null,null,null,null});

		// Call methods
		classInfo.printConstructors();
	}

	/**
	 * Tests printing methods.
	 *
	 * @throws MethodNotFoundException
	 */
	@Test
	public void testPrintData_2() throws MethodNotFoundException {
	
		// Set print data to false
		classInfo.printConstructors(new String[]{new Integer(1)});

		// Set print data to false
		classInfo.printConstructors(new String[]{new Boolean(true)});
		
		// Call methods
		classInfo.printConstructors();
	}

	/**
	 * Setup a new test class by passing one of the parameters.
	 *
	 * @param data	class information object, as set by test constructors
	 * @throws MethodNotFoundException if any method was not found
	 */
	void setUp(ClassInfo data) throws MethodNotFoundException {
		classInfo.setData(data);
	}
	
	private ClassInfo setData(ClassInfo data) {
		classInfo.setData(data);
		return classInfo;
	}

}
