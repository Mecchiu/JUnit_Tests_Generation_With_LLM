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
		/*
		* (non-Javadoc)
		* @see org.junit.jupiter.api.Test#test()
		*/
	@Test
	public void test() {
		
		log("Test of class " + this.getClass().getName());
		setHeader();
		
		// generate a valid fileName which does not end with ".html"
		String fileName = "TestFileName";
		System.out.println(fileName);
		fileName = fileName + ".html";
		System.out.println(fileName);
		// generate and store a fileName parsed for formatted display
		fileName = "TestingFileName.java";
		System.out.println(fileName);

		
		// test 1
		JMCAAnalyzerAnalysis analysis = new JMCAAnalyzerAnalysis();
		testCase(analysis, 3, true);

		// test 2
		ArrayList<Object> l = new ArrayList<>();
		// creates a new lVal with a value of 1
		l.add("1");

		analysis.addVariable(2, l);

		testCase(analysis, 7, true);
		
		// store an array so that it will be added as a new arrayLVal
		ArrayList<ASTNode> arrayArray1 = null;
		// an arrayLVal for the argument list (2) of the add method
		ArrayList<Object> arrayArray2 = new ArrayList<>();
		// create a child of the arrayArray2 for the statement
		arrayArray2.add(1,2,3);
		
		// the arrayArray1 will be a new arrayLVal with 2 elements
		arrayArray1 = new ArrayList<>();
		// add the value to it
		arrayArray1.add(arrayArray2);
		
		// test 3
		analysis.addArray(arrayArray1);
		
		testCase(analysis, 7, true);
		
		// test 4
		ArrayList<Object> l2 = new ArrayList<>();
		// creates a new lVal with a value of 1
		l2.add("One");

		analysis.addVariable(2, l2);

		testCase(analysis, 7, true);
		
		// test 5
		String lVal1 = null;
		// creates a new lVal of the 2 first objects and store it as the variable-value
		ArrayList<Object> list = new ArrayList<>();
		list.add(1);
		list.add(-1);
		list.add(1);
		analysis.addVariable(2, list);
		
		lVal1 = analysis.getVariable(2);
		System.out.println(lVal1);
		
		java.util.HashSet<String> hashSet = new java.util.HashSet<>();
		hashSet.add(lVal1.toString());
		hashSet.add(lVal1.toString());
		
		System.out.println("HashSet found : " + hashSet.toString());
		
		hashSet = new java.util.HashSet<String>(getLVal(1));
		System.out.println("HashSet size : " + hashSet.size());
		
		System.out.println(hashSet.toString());

		// test 6
		String lVal2 = null;
		// creates a new lVal of the 3 objects which are both the 2 variable-value and the 1 variable-value
		l2.add("Two");
		l2.add("One and Two");
		analysis.addVariable(2, l2);
		
		lVal2 = analysis.getVariable(2);
		System.out.println(lVal2);
		
		java.util.HashSet<String> hashSet2 = new java.util.HashSet<>();
		hashSet2.add(lVal2.toString());
		hashSet2.add(lVal1.toString());
		
		System.out.println("HashSet found : " + hashSet2.toString());
		

	
    }

     /**
     * @param analysis Analysis class object
     * @param ctr int
     * @param isInIteration boolean
     */
    private void testCase(Analysis analysis, int ctr, boolean isInIteration){
     
     
    
				if(!DEVELOPMENT){
					log("Testing test for each class");
				}
    		ArrayList<Object> lVal = new ArrayList<>();
    		// creates a new lVal for the add method that will
    		// be tested
    		lVal.add("AddedVal");

    		// add lVal to arrayList 1 of the variable ctr (2)
    		analysis.addVariable(2,lVal);
    		
    		String expected = "AddedVal";
    		String actual = isOperator(expected)? "NotOperated" : expected;
    		
}
}