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
    void setFileName() {
	String testFileName = System.getProperty("user.dir") + "\\CEN4010Log.txt";
	UILayoutDisplayAnalyzer.setFileName("CEN4010Log.txt");
	assertNotNull("unable to read test file from system", System.getProperty("user.dir") + "\\CEN4010Log.txt");
    }
	
}