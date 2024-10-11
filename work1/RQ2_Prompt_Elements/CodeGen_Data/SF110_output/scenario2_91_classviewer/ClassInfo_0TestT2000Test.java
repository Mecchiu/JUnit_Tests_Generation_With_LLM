// ClassInfo_0Test.java
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
* It contains one unit test case for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_0Test {
// ----------------------------------------------------------- Constructor

		/**
		 * Build the test.
		 */
		public ClassInfo_0Test() {
			className = "ClassInfo_0Test$ClassInfo_0Test";
		}

		// --------------------------------------------------------- Public Methods

		/**
		 * Construct the test.
		 */
		public Test suite() {
			TestSuite test = new TestSuite("Test Class Info for class " + className);
			test.addTest(new TestInstance(c.staticFieldTest(JUNCTION), new junctionInfo(c)));
			return test;
		}

		/**
		 * Construct the test environment in debug mode.
		 */
		public static junctionInfo junctionInfo(JUNCTION junctionClass) {
			return new junctionInfo(junctionClass);
		}

		// --------------------------------------------------------- Private Methods

		/**
		 * Tests the {@link ClassInfo#printFields()} methods.
		 */
		private static junctionInfo junctionInfo(JUNCTION junctionClass) {
			TestSuite junctions = junctionClass.testSuites();
			ClassInfo junctyClass = junctions.get(0).getTestClass();
			ClassInfo junctyInfo = junctyClass.classInfo();
			Field[] f = junctyClass.fields();
			StringBuilder out = new StringBuilder();

			// Print the fields
			for (int count = 0; count < len(f); count++) {
				Field fD = f[count];
				out.append(fD.getName()).append(", ");
				FieldInfo fiD = junctyClass.classInfo().field(fD.getName());
				if (fiD.isPublic())
					continue;

				out.append(fiD.toString());
				if (fiD.isPublic())
					out.append(", ");
				else
					out.append(" ");

				if (fiD.isPrivate())
					continue;

				if (fD.getType().isArray()) {
					out.append("is array");
					Class k = (Class) Array.newInstance(fD.getType(), 1);
					if (count > 0)
						out.append(", ");
					out.append(fiD.toString());
					String[] data = junctyInfo.printMethods(new Object[1], new Object());
					for (int dataCount = 0; dataCount < data.length; dataCount++)
						out.append(", \"");
					out.append(fiD.toString());
					out.append("\"");
				} else 
					out.append(fiD.toString());
			}

			return new junctionInfo(out.toString());
		}

		/**
		 * Returns the name of the test class.
		 */
		private static String className = "ClassInfo_0Test";

		/**
		 * Returns the class that is tested.
		 */
		private JUNCTION junctureClass = null;

		/**
		 * Returns the c private Class object.
		 */
		private Class c = null;

		/**
		 * Returns the c private Class object.
		 */
		private Field[] fields = null;

		/**
		 * Returns the c private Class object, null if no junctions class.
		 */
		private ClassInfo junctyClass = null;

		/**
		 * Returns the c private Class object, null if no juncty class.
		 */
		private Field[] fields_ = null;

	}

// End ClassInfo_0Test.java
