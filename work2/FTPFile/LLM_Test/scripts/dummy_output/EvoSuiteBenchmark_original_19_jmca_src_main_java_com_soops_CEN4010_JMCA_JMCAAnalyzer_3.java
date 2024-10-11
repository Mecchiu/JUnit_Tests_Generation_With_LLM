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
		ArrayList<String> _test_list;

    private String testList = "";

    /**
     * constructor that initialises the test
     */
    public JMCAAnalyzerTest()
    {
        testList = String.valueOf(getClass().getName());
    }

    /**
     * calls analyzeMethod for every method then prints the
     * report header and the output
     * @param parentNode ASTNode
     * @param testStr List of test strings separated by '|'
     */
    private void printStatement(ASTNode parentNode, ArrayList<Statement> testStr)
    {
        for (Statement s : testStr) {
            this.testList += "\n" +
                    parentNode.toString("");
            this.testList += s.getFullCode();
            this.testList += "";
        }
    }

    /**
     * helper function to return the list of "name:"
     * String of all test cases
     * @return List
     */
    private ArrayList<String> getTestList()
    {
        return testList.split("\\|");
    }

    /**
     * checks whether the method passed a String of test case
     * delimited by '|'
     * return false if the string is a delimiter, return true if it is not
     * @param s String
     * @return boolean
     */
    private boolean isTestCase(String s)
    {
        if (s.length() > 0)
            return s.charAt(0) == '|';
        else
            return true;
    }

    /**
     * this test method is run for every test case,
     * when the report starts, it starts printing the report footer
     * after the test
     * @param args String[]
     */

    @Test
    public void isTestCase(String[] args)
    {

        // set test parameter values with this testcase
        boolean inSel = DEVELOPMENT;
        int ctr = 0;
        boolean isInSelection = false;
        boolean isInIteration = false;

        if (args!= null)
        {
            // get test parameter values from array list,
            // with given testcase name(s)
            for (int zz = 0; zz < args.length && ctr < args.length; zz++, ctr++)
	    {
		String p = String.valueOf(args[ctr]);
		if (p.trim().equals("|") || p.trim().equals("&") || p.trim().equals("&|"))
		    continue;
	    	testCase(p);
			if (p.startsWith("|"))
			{
			    inSel =!inSel;
			}
			if (p.startsWith("&"))
			{
			    isInSelection =!isInSelection;
			}
			if (p.startsWith("&|"))
			{
			    isInIteration =!isInIteration;
			}
			if (isTestCase(p))
			{
			    isInIteration = isInIteration || isInSelection;
			}
	    }
        }

		// this is a case where we are not testing on a single line
        for (int i = 0; i < getTestList().size() && i < args.length; i++)
        {
            String inTestCase = getTestList().get(i);
            if (inTestCase.charAt(0) == '|')
        		continue;
            if (inTestCase.charAt(0) == '&' || inTestCase.charAt(0) == '&|')
        		continue;
            TestResult testResult = analyze(i);

            if (DEVELOPMENT)
            {
               // get the value of lVal after first test
               int lVal = getLVal(i, testResult);
               String value = "" + lVal;
               if (i == args.length-1)
            	{
                    // get the value of lVal after final test
                    int lVal1 = getLVal(i, testResult);
	        		String value1 = "" + lVal1;
	           		println(testResult.getMessage(value, value1));
            	}
            	else
            	{
	        		//print the value of last test step
	            	println(value);
            	}
            }
            // print the details of the current test
            printStatement(null, Collections.singletonList(testCase(inTestCase)));
        }
        String[] resultData = {this.getTestList().toString(), testResult.getMessage(false, false)};
        System.out.println(testResult.toString());
        System.out.println(testCaseInfo(testResult));
    }

}