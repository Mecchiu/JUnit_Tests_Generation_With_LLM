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
	 * Test method for {@link com.soops.CEN4010.JMCAUtils#parse(String)}.
	 */
	@Test
    public void testparseString() {
        //System.err.println("test parseString");
        // ParserTestUtil.testParse(string);
    }

    /**
	 * Test method for {@link com.soops.CEN4010.JMCAUtils#createArrayList()}.
	 */
	@Test
    public void testCreateArrayList() {
        //System.err.println("testCreateArrayList");
        // ParserTestUtil.testCreateArrayList(list);
    }

    /**
	 * Set the variable name for the lVal of an expression to the value set in the {@link #parseVar()} method.
	 * @param lVal int
	 * @test setHeader set lVal of expression to string
	 */
	@Test
    public void testSetVarName() {
        //System.err.println("testSetVarName");
        // ParserTestUtil.testSetVarName(lVal);
    }

    /**
	 * Test method for {@link com.soops.CEN4010.JMCAUtils#parseVar(String)}.
	 * @param lVal int
	 */
    @Test
    public void testParseVar() {
        //System.err.println("testParseVar");
        // ParserTestUtil.testParseVar(lVal);
    }

    /**
	 * Test method for {@link com.soops.CEN4010.JMCAUtils#createArrayListOfStrings()}.
	 * @param exprArray ArrayList of String
	 */
	@Test
    public void testCreateArrayListOfStrings() {
        //System.err.println("testCreateArrayListOfStrings");
        // ParserTestUtil.testCreateArrayListOfStrings(list);
    }

    /**
	 * Set the variable name for the LVal of an assignment statement to the value set in the {@link #parseLVal()} method.
	 * @param lVal int
	 * @test setHeader set variable name of lVal of statement to string
	 */
	@Test
    public void testSetLVal() {
        //System.err.println("testSetLVal");
        // ParserTestUtil.testSetLVal(lVal);
    }

    /**
	 * Set the variable name for the RVal of an assignment statement to the value set in the {@link #parseRVal()} method.
	 * @param rVal int
	 * @test setHeader set variable name of rVal of statement to string
	 */
    @Test @Testable
    public void testSetRVal() {
        //System.err.println("testSetRVal");
    }
}