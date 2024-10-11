// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains one unit test case for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {
		/**
		 * Unit test for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
		 */
	@Test
	  void testAnalyze() {
				// execute test case
	//		String fileName = null; 
			String expectedDisplayString = "displayed text =   ";
			ASTNode dummy = null;
			assertEquals(expectedDisplayString, ui_printing.analyze(dummy));
	  }
}