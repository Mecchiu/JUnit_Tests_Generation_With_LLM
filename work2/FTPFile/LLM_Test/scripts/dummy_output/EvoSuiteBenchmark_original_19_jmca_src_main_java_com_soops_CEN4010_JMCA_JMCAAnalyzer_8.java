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
		 * Test method for {@link com.soops.CEN4010.JMCA#analyze(ASTNode)}.
		 * @throws Exception Exception from executing method
		 */
		@Test
        public void testAnalyze() throws Exception {
			if (DEVELOPMENT) {
                   this.executeTestMethodOnDefaultClasses();
		    } else
		    	this.executeTestMethodDependentCases();

		}

		/**
		 * Utility method for testing a child class.
		 */
		private void executeTestMethodOnDefaultClasses() throws Exception {
			// 1. set up
			// jt and dv are strings
			// a1 is a parent class
			// a = parent class
			// class list in a1 for testing
			String string1 = "a";
			String classString1 = string1 + ".A";
			String var1 = "dv";
			String varString1 = this.stringVar2Var(classString1, var1);
			string1 = string1 + " - dv - a";
			string1 = string1 + " - dv - " + varString1;

			String class1 = classString1;

			// 2. setup
			// v1,v are children
			String stringVar1 = "v1";
			String string1 = "v1";
			String stringVar2 = this.stringVar2Var(".A", string1);
			stringVar1 = stringVar1 + " - " + string1;
			stringVar1 = stringVar1 + " - " + stringVar2;

			String string2 = "var";
			String variable1 = "v";
			String variable2 = ".A";
			String string3 = ".A";
			String string4 = ".A" + class1 + "." + variable1 + " - " + variable2;

			classString1 = classString1 + ".A";
			class1 = classString1;
			string1 = string1 + " - " + string2;

			// 3. call
			// dv = a
			String outputStr = "";
			outputStr = outputStr + string1;
			outputStr = outputStr + ( string1 + ".A" );
			outputStr = outputStr + " - " + stringVar1 + " - " + string2;

			// jt = jv = var
			// jdVV = a = dv + a + v
			// var = "dv + " + v + a
			// a = dv + a + v;
			// a = dv + a + v;
			// var = "dv + " + v + a
			// a = dv + a + v;
			String statement1 = "( " +
					"( a b c )" +
					"()" +
					")" +
					" + v'";
			String statementStr1 = outputStr + statement1;

			// jt + jv = jdVV = var
			// var = "dv + " + v + a = dv + a + v;
			String statementString1 = outputStr + statement1;
			// jv + var = jv   	var = v
			String jv = outputStr + ".A";
			String statementStringVar1 = outputStr + ".A";
			String statement1 = "( " +
					"(   " + jv + " + var" + ")" +
					")" +
					"()" +
					")";


			// test code:  jtdv = jv
			// jtdv = jtdv + jv; // this is a bit confusing
			// var = "d + d + '" + jv + " + jv";
			String var = outputStr + ".A";
			String testString = outputStr + "(" + var + ")";
			// test: var = "d + d + '" + jv + " + jv";
			String result = outputStr + "(" + var + ");" + var +"";
			assertTrue(testString.equals(result) );
		}

		/**
		 * Utility method for testing dependent classes.
		 */
		private void executeTestMethodDependentCases() throws Exception {
			// 1. set up
			// c is parent class
			String string = "d";
			String classString = string  + ".A";
			String var = "cv";
			String classVar = classString + "." + var ;

			String string1 = "v";
			String classString1 = classString + ".A";
			String variable1 = classVar + "." + var + " - " + string;

			String classString2 = classString1 + "." + var + " - " + string;
			String classVar2 = classString2 + ".A";
			String v1 = ".A" + classVar2 + "." + classVar + " - " + v;

			// 2. setup
			// v is parent child class
			String string2 = "v";
}
}