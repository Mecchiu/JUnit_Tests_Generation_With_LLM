// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains one unit test case for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {
		@Test
         public void test() {

            //String dummy = "dummy";

            //String dummy = null;

            //String dummy = ASTNode.NO_AST;

            //String dummy = ASTNode.NO_AST;

            assertNotNull(UILayoutDisplayAnalyzer.analyze(null));
            assertNull(UILayoutDisplayAnalyzer.analyze(ASTNode.NO_AST));
        }

}