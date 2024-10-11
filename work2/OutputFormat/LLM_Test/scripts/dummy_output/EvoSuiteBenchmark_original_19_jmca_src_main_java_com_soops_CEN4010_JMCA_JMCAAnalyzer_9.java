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
		    * This unit test tests the {@link JMCAAnalyzer#analyze(ASTNode)} method
		    */
	@Test
		public void testAnalyze() {
		if (DEVELOPMENT) System.out.println("\n--------------------------------------------------------------------------------------------" + new java.util.Date());

		String input = "J = 2";
		
		JCALexModel obj = null;
		JCAModel.JCAModelParameters parms;
		parms = new JCAModel.JCAModelParameters();
		obj = JCALexParser.parse(input, parms);
		if (DEVELOPMENT) System.out.println(obj.toStringTree());
		
	        List<StatementElement> statements = obj.statements;
	        Iterator<StatementElement> it = statements.iterator();
	        StatementElem statement;
	        StringBuilder output = new StringBuilder();
	        int count = 0;
	        //System.out.println("\ntotal: " + statements.size());
}
}