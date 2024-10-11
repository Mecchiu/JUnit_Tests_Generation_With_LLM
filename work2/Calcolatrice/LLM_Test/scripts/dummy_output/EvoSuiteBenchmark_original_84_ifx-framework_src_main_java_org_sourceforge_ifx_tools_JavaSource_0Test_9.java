// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {
		/**
		 * This unit test case validates the ability of the JavaSource object to
		 * implement a superclass. It uses a Java source which has a class named
		 * <code>testJavaSource</code> but no {@link java.util.List} object
		 * with its members.
		 */
		@Test
		public void testHasInterface() {
				listOfClassNames.clear();
				listOfClassNameList.clear();
				className = null;
				packageName = null;
				superClass = null;
				isInterface = false;
				memberVariables = new ArrayList();
		}

		/**
		 * This unit test case validates the ability of the JavaSource object
		 * to implement a superclass in a conditional form.
		 */
		@Test
		public void testHasSuperClass() {
				superClass = null;
				listOfClassNames.clear();
				listOfClassNameList.clear();
				listOfClassNames.addLast("testJavaSource");
				listOfClassNameList.addLast("testJavaSource1");
				listOfClassNameList.addLast("testJavaSource2");
		}

		/**
		 * This unit test case validates the ability of the JavaSource object
		 * to implement a superclass in a unconditional form.
		 */
		@Test
		public void testHasSuperClassNotInConditionalForm() {
				superClass = null;
				listOfClassNames.clear();
				listOfClassNameList.clear();
				listOfClassNames.addLast("testJavaSource");
				listOfClassNameList.addLast("testJavaSource1");
				listOfClassNames.addLast("testJavaSource2");
				listOfClassNameList.addLast("testJavaSource2");

				// now try using the conditional form
				listOfClassNames.addLast("testJavaSource2");
				List superClassList = new ArrayList();
				superClassList.addAll(listOfClassNames);
				String superClassString = null;
				Iterator cfi = superClassList.iterator();
				while (cfi.hasNext()) {
					String superClassName = (String) cfi.next();
					if (listOfClassNameList.contains(superClassName)) {
						superClassString = superClassName;
						break;
					}
				}
				System.out.println("\n\n*** Checking conditional form of `testHasSuperClass` ***");
				System.out.println("==================================================");
				System.out.println();
				System.out.println(superClassString);
				Iterator isci = superClassList.iterator();
				while (isci.hasNext()) {
					System.out.println("\t" + isci.next().toString());
				}
		}

		/**
		 * This unit test case validates the ability of the JavaSource object
		 * to implement a super class in a conditional form.
		 */
		@Test
		public void testHasSuperClassInConditionalForm() {
				listOfClassNames.clear();
				listOfClassNameList.clear();
				listOfClassNames.addLast("testJavaSource");
				listOfClassNameList.addLast("testJavaSource1");
				listOfClassNames.addLast("testJavaSource2");
				listOfClassNameList.addLast("testJavaSource2");

				// now try using the unconditional form
				listOfClassNames.addLast("testJavaSource2");
				superClassString = null;
				Iterator scfi = superClassList.iterator();
}
}