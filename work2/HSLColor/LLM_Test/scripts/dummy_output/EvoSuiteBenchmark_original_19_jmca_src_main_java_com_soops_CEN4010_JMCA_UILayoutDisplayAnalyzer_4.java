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
		 * Test method for {@link com.soops.CEN4010.JMCA.UILayoutDisplayAnalyzer#analyze(ASTNode)}
		 */
		@Test
		public void testAnalyze() {
			ASTNode dummy = new ASTNode.Text();
			UILayoutDisplayAnalyzer instance = new UILayoutDisplayAnalyzer();
			instance.analyze(dummy);
		}

}//UILayoutDisplayAnalyzerTest.java