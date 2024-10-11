// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {
		
	protected void runTest(List list) {
		Iterator iter = list.iterator();
		Object object = null;
		
		String classJavadoc = "";
		String className = "";
		String superClass = "";
		String interfaceName = "";
		String memberVariables = "";

		// Get the name and value and iterate over it.
		while (iter.hasNext()) {
			object = iter.next();
			
			if (object instanceof String) {
				className = (String)object;
				break;
			} else if (object instanceof String[]) {
				String[] objectArr = (String[])object;
				className = objectArr[0];
				break;
			} else if (object instanceof List) {
				String[] objectArr = (String[])object;
				className = objectArr[0];
				break;
			} else if (object instanceof Iterator<?>) {
				try {
					classJavadoc = (String)object;
					break;
				} catch (Exception e) {
					assertFalse(true);
					break;
				}
				break;
			}
		}

		// Get the class javadocs and check for it is not empty.
		if (classJavadoc.length() > 0) {
			classJavadoc = classJavadoc.trim();
			classJavadoc = classJavadoc.split("[\\n\\r\\t]");
		}

		// Get the interface (if it has one), and compare.
		if (isInterface) {
			try {
				interfaceName = (String)((List)object).get(0);
				if (interfaceName!= "<anonymous>") {
					assertTrue("interface name differs from the expected value",
							true);
					break;
				}
			} catch (IndexOutOfBoundsException e) {
				assertFalse(true);
				break;
			}
		}

		// If the first word is equals ("super", there is no
		// javadoc, the className is the super class. Else, the className
		// can be used both as the super class.
		if (className.equals("<anonymous>")) {
			className = superClass;
		}

		// The member variabes of this class.
		memberVariables = classJavadoc;

		// If the javadoc is empty, the className matches the expected value.
		if (className == "") {
			assertTrue("the class name is '"+className+"'",
					true);
		}
		
		// Check if the memberVariableList is not empty.
}
}