// ClassInfo_1Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {
// ClassInfo.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;

/**
 * Obtains the interfaces as well as the public constructors, methods
 * and fields from a Class object.
 * <p>
 * This class is for obtaining data and handling.
 *
 * @author James Harris
 * @version 2.0a
 */
public class ClassInfo {

    /**
     * Returns an array of strings that contain the public methods for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method always returns immediately.
     *
     * @return string array of public methods
     */
    public String[] printMethods() {
        if (debug)
            System.out.println("****************************************");
        String[] tempArray = null;
        if (cMethods!= null) {
            tempArray = new String[cMethods.length];
            System.arraycopy(cMethods, 0, tempArray, 0, cMethods.length);
        }
        if (debug && tempArray == null)
            System.out.println("No public methods.");
        else {
            printArray(tempArray);
        }
        return tempArray;
    }
}

// ClassInfo_1Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {
		
	/**
	 * Sets up a ClassInfo object.
	 * <p>
	 * First it creates a class with the <code>public int</code> methods.
	 * This is necessary to satisfy the {@link Set} interface.
	 * The returned <code>cMethods</code> and <code>cMethods</code> array contain
	 * methods that are not <code>public</code>.
	 */
	public static void setupClassInfo() {
		cMethods = new char[0x40];
		System.arraycopy(publicMethods(), 0, cMethods, 0, cMethods.length);
		System.arraycopy(publicMethods(), 0x40, cMethods, cMethods.length, 40);

		/* Create the class object.
		 * 				   System.arraycopy(
		 */
				Class c = null;
				try {
					c = Class.forName("java.util.HashSet");
					System.arraycopy(publicMethods(), 0, cMethods, 0, cMethods.length);
					cMethods = cMethods.clone();
				}
				catch (Exception e) {
					fail("ClassInfo_1Test.setupClassInfo() failed: " + e.getMessage());
				}
	}

	/**
	 * Prints the array returned by {@link ClassInfo#printMethods()}.
	 */
	public static void printArray(String[] a) {
		Object o;
		System.out.println("cMethods array is " + a.length);
		System.out.println("cMethods is ");
		System.arraycopy(a, 0, cMethods, 0, a.length);
		if (debug) {
			System.out.println("cMethods is " + new String(cMethods));
		}
		for (int i = 0; i < cMethods.length; ++i) {
			o = cMethods[i];
			if (debug)
				System.out.println("cMethods[i]=" + o);
			if (o!= cMethods[i])
				fail("cMethods[i] not equal to cMethods[i]");
		}
		System.out.println("");
	}

	/**
	 * Sets up the various static and non-static constructors.
	 */
	public static void setupStatic() {
		int a2;
		Object o;
		Constructor c;
		Constructor[] tempArray;
		String[][] tempArray2;
		staticConstructor();
		staticConstructor2();

		for (int i = 0; i < test2.length; ++i) {
			a2 = test2[i][0]; // first element is the constructor
			c = test2[i][1]; // second element is the static constructor
			testConstructor3(a2, c);
			if (isFieldInit(c)) {
				tempArray = (Constructor[]) c.getDeclaredConstructors()[0]; // the "c" constructor has a public constructor,
				// because the c field will always be initialized.

				for (int j = 0; j < test2.length; ++j) {
					o = test2[j][0]; // get the constructor
					java.util.Arrays.fill(cMethods, 0x20);
					java.util.Arrays.fill(cMethods, 0x40);
					if (!(o instanceof Constructor))
						fail("testConstructor3() failed: the nonStatic constructor is not a constructor");
					c = (Constructor) o;
					cMethods[test2[i][2]++] = c.newInstance();
				}
				tempArray2 = (Constructor[]) CtClass.make(c, c.getDeclaringClass());
				c.newInstance().apply(tempArray, tempArray2);
				if (!isFieldInit(tempArray2[2][2]))
					fail("testConstructor3() failed: " + o);
			}
		}
	}

	private static boolean isFieldInit(Object o) {
		Field f;
		Class o1;
		try {
			f = o.getClass().getDeclaredField("init"); // first
			return (o1 = f.get(o)).equals(new Object()); // second
		}
		catch (Exception ee) {
			return false;
		}
	}

	/**
	 * Runs a constructors with the specified number of private methods and assert that the results are the same.
	 */
	void testedConstructor3(int a, Constructor c) {
		if (debug)
			System.out.println("Testing constructor " + c.toString());
		c.setAccessible(true);
		try {
			if (!c.newInstance().equals(c.newInstance()))
				fail("TestConstructor3() failed: " + c.toString());
			c.setAccessible(false);
		}
		catch (Exception ee) {
			fail("TestConstructor3() failed: " + c.toString());
		}
	}

	public static void staticConstInit() {
		//	Object o = null;
		//	try
		//	{
		//		staticConstInit(o);
		//	}
		//	catch (Exception ee)
		//	{
		//		// TODO Auto-generated catch block
		//		fail("static const init failed");
		//	}
	}

	private static void staticConstInit(Object o) {
		if (o == null) {
			Class temp = null;
			try {
				temp = Class.forName("java.util.HashMap");

				if (temp.isArray()) {
					if (temp.getComponentType().isArray()) {
						if (temp.getComponentType().getComponentType().isInterface()) {
							if (temp.getComponentType().getComponentType() == Object.class)
								return null;
							temp = temp.getComponentType().getComponentType();
						}
						else
							return null;
					}
					if (temp.getComponentType().isInterface())
						return null;
					temp = temp.getComponentType();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			if (debug)
				System.out.println("Initializing " + o.getClass().getName() + " with " + Arrays.toString(temp.getClass().getComponentType().getComponentType()));
			cMethods = (char[]) Arrays.deepCopyOf(cMethods, temp.getClass().getComponentType().getComponentType());
			debug =