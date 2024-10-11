// JMCAAnalyzerTest.java
package com.soops.CEN4010.JMCA;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAAnalyzer}.
* It contains one unit test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
*/
class JMCAAnalyzerTest {
/**
		* Constructor
		* Use {@link JUnitTestCase#suite()}.
		*/
		public JMCAAnalyzerTest() {
        }

		/**
		* Prints the header of the JUnit test class
		*
		* @see JUnitTestCase#suite()
		*/
		private void setHeader() {
			output = new StringBuffer();
			output.append("File: ")
			.append(testName())
           .append(" - An example to analyze class ");
		}

		/**
		* Prints the output of the execution of the tests
		*
		* @see org.junit.jupiter.api.Test#execure()
		*/
		@Test
		public void test() {
			setHeader();

			System.out.println(output);
		}

}

