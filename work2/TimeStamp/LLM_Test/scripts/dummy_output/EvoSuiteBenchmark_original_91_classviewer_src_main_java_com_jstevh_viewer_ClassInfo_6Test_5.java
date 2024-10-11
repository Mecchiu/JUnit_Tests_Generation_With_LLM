// ClassInfo_6Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {
		
	// Initialization of variables
	/**
	 * An array for the public constructor, this should have all public methods.
	 * This is for the case where the parameter type is not an Object.
	 */
	public static Object[] cMethods;

	/**
	 * The Class to be used as a private cClass
	 */
	static Class cClass = Class.class;

	// Returns an array of objects containing the information returned by ClassInfo.getData
	{
		Object[] cl = ClassInfo.class.getData();

        cMethods = cl;
		assertNotNull(cl);

		boolean first = true;
		for (Object member: cl)
		{
			if ((member) instanceof Constructor)
				first = false;
		}

}
}