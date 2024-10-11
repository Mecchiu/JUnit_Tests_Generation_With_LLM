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
		
    private void test(boolean isDev, String fileName, String ct, String cs) {
        try {
            setFileName(fileName);
        } catch (Exception e) {
            System.out.println("Error setting file name : " + fileName);
        }
        Analyzer an = new JMCAAnalyzer();            
        try {
            an.setFileName(fileName);
        } catch (Exception e) {
            System.out.println("Error setting file name : " + fileName);
        }
        an.analyze(createTestTree(isDev, cs, ct));
        assertEquals("", output.toString());
        return;
    }

    private String createTestTree(boolean isDev, String cs, String ct) {
        if (DEVELOPMENT) {
            return "[" + ct + "d" + cs + "c " + isDev + "]";
        }
        return "[[[d c" + cs + "c " + isDev + "]]";

    }

    @Test
    public void test() {                

        test(false, fileName, "+", "(a - b)*(c+d+e)");

    }
}