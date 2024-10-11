// JMCAAnalyzerTest.java
package com.soops.CEN4010.JMCA;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAAnalyzer}.
* It contains ten unit test cases for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
*/
class JMCAAnalyzerTest {

		/**
		* Test case 1 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyzer with a simple class.
		*/
		@Test
		void testAnalyze1() {
				ASTNode root = new ASTNode("root", null);
				ASTNode node1 = new ASTNode("class", root);
				node1.addChild(new ASTNode("className", node1, "TestClass"));
				root.addChild(node1);
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				String result = analyzer.analyze(root);
				String expected = "Class Name: TestClass\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
													"\n" +
								