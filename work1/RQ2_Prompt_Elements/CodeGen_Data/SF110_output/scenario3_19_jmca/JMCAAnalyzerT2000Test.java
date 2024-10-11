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
     * Test of analyze method, of the class.
     */

String test_Failed_String(ASTNode root) {
        Failed f = new Failed();
        f.setID(1111);
        int s[][] = new int[3][2];
        int d[][] = new int[1,1];
        return "Fail: " + f.getText();
      }
        
// JUnit for tests.
    
	// Test of Analyze method, of the class.
    
    public String test_String() {
        return "";
    }
    
}

