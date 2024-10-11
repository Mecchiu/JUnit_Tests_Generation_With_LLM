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
		private static final String[] TESTDATA = {
		"def c:\n 1\n 2\n def\nc:\n\n 2\n c:\n 3\n\n 5\n\n [def c:\n 6\n]\n", // 0
		"(1, \"\")\n"        // 1
		"(2, \"\")\n"        // 2
		"(3, \"\")\n"        // 3
		"(4, \"\")\n"        // 4
		"(5, \"\")\n"        // 5
		"(6, \"c:\n 7\n\")\n" // 6
		"(7, \"c:))\n"      // 7
		"(8, \"\")\n"        // 8
		"(9, \"c:))\n"      // 9
		"((10, \"\"),\"x\")\n" // 10
		"((11, \"\"),\"x\")\n" // 11
		"((12, \"\"),'c:\n \"d\n x\",\'y\')\n" // 12
		"((13, \"\"),\'d\')\n"   // 13
		"((14, \"\"),'c:)\n \"d;\' y\"\n" // 14
		"((15, \"\"),\'a\'c\')\n \"d\n \"y;\' \"\n" // 15
		};

		@Test
        public void test01() {
				System.out.println("=== TEST: JMCAAnalyzer.test01");
				for (int i = 0; i < TESTDATA.length; i++) {
							String test = readFile(i);
					java.util.Arrays.sort(test);		// sort the string array (expects the case of the same name in case of the same string array
					System.out.println(test + "\n");
				}
        }	// end test01


}	// end class  JMCAAnalyzerTest