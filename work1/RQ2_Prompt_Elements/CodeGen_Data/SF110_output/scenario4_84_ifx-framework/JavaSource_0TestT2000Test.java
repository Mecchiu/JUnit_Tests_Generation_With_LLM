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
private final String TEST_CLASS_NAME = "javaclassesrc.TestSuperclass";

        /**
         * @return the String package name to be used to initialize this class.
         */
        String getPackageName() {
            return packageName;
        }

        /**
         * Sets the String package name to initialize this class.
         * @param packageName the String package name to set.
         */
        void setPackageName(String packageName) {
            this.packageName = packageName;
        }

		/**
		 * Tests whether the JavaSource class has the proper
		 * signature for an interface.
		 */
        @Test
        void hasInterface_01() {
			JavaSource source = new JavaSource();
			assertArrayEquals(new String[] {
					TEST_CLASS_NAME
			}, source.extractClassName(source.getClassSource()));
		}

		/**
		 * Unit test of {@link JavaSource#hasInterface()}.
		 * @throws InitializationException is thrown if test is not
		 *     implemented correctly.
		 */
        @Test
        void hasInterface_02() {
			String classname = getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1);
		}

		/**
		 * Unit test of {@link JavaSource#extractClassName()}.
		 * @throws InitializationException is thrown if test is not
		 *     implemented correctly.
		 */
        @Test
        void extractClassName_01() {
			ArrayList<String> list = new ArrayList();
			list.add(TEST_CLASS_NAME);
		}

		/**
		 * Unit test of {@link JavaSource#extractClassName()}.
		 * @throws InitializationException is thrown if test is not
		 *     implemented correctly.
		 */
        @Test
        void extractClassName_02() {
			@SuppressWarnings("unused")
			ArrayList<String> list = new ArrayList();
		}

		/**
		 * Unit test of {@link JavaSource#extractMemberVariableNames()}.
		 * @throws InitializationException is thrown if test is not
		 *     implemented correctly.
		 */
        @Test
        void extractMemberVariableNames_01() {
			ArrayList<String> list = new ArrayList();
			list.add("a");
		}

		/**
		 * Unit test of {@link JavaSource#extractMemberVariableNames()}.
		 * @throws InitializationException is thrown if test is not
		 *     implemented correctly.
		 */
        @Test
        void extractMemberVariableNames_02() {
			ArrayList<String> list = new ArrayList();
			list.add("a");
		}

		/**
		 * Unit test of {@link JavaSource#extractMemberVariableNames()}.
		 * @throws InitializationException is thrown if test is not
		 *     implemented correctly.
		 */
        @Test
        void extractMemberVariableNames_03() {
			ArrayList<String> list = new ArrayList();

			// adds a new member variable with type String because it is the superclass name
			list.add("stringarray");
			list.add("stringArray");
			list.add("a");
		}

		private JavaSource() {
		}

		private String getClassName() {
			return TEST_CLASS_NAME;
		}
		
		private String getMemberVariableNames() {
			String stringlist = "stringarray", stringarray = "stringArray";
			return new StringBuilder().append(stringarray).append(", ").append(stringlist).append("Array").toString();
		}

		private String getNumberOfMemberVariableNames() {
			return Integer