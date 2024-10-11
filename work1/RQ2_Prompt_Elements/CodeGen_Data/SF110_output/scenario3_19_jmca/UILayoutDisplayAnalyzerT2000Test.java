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
         * test method for {@link com.soops.CEN4010.JMCA.UILayoutDisplayAnalyzer#analyze(ASTNode)}.
         */
        @Test
        public void testAnalyze() {
        
            assertEquals("invalid expression", "", 
                        null,   "invalid expression");
        
            assertEquals("invalid expression", "", 
                    "    <display-item ui-name=\"foo\" 
                            layout=\"simple\" layout-item-name=\"bar\"
                            width=\"100%\" height=\"100%\">
                        </display-item>",   "");
        
        }
}
