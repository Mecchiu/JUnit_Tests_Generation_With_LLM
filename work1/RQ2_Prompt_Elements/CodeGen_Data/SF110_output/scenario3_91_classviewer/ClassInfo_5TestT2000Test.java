// ClassInfo_5Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_5Test {
/**
		 * A string array of names that each element of the array
        * corresponds to.
		 * <p>
		 * It always returns immediately.
		 *
		 * @return string array of names
		 */
        public static String[] getData() {
            return new String[] {"one", "two", "three"};
        }
	
	/**
	 * Runs the suite of tests in this method.
	 */
        @Test
        public void runTest() {
            // This is the actual run of the test, but it uses a Method on the class (jstevh.tools::TestRunInfo)
            // to determine the exact outcome of each test.
			
            // Note that we just want to verify that the various cases it accepts.
            assertSame("same size", getData(), getData());
			assertSame("same number of strings", getData(), getData());
		}
}