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
		* It tests the analyze method with a null ASTNode.
		*/
		@Test
		void testAnalyze1() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				assertEquals("File did not parse correctly", analyzer.analyze(null));
		}
		
		/**
		* Test case 2 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has no children.
		*/
		@Test
		void testAnalyze2() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 3 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has one child.
		*/
		@Test
		void testAnalyze3() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child = new ASTNode("child", null);
				root.list.add(child);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 4 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has two children.
		*/
		@Test
		void testAnalyze4() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				root.list.add(child1);
				root.list.add(child2);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 5 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has three children.
		*/
		@Test
		void testAnalyze5() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				ASTNode child3 = new ASTNode("child3", null);
				root.list.add(child1);
				root.list.add(child2);
				root.list.add(child3);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 6 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has four children.
		*/
		@Test
		void testAnalyze6() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				ASTNode child3 = new ASTNode("child3", null);
				ASTNode child4 = new ASTNode("child4", null);
				root.list.add(child1);
				root.list.add(child2);
				root.list.add(child3);
				root.list.add(child4);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 7 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has five children.
		*/
		@Test
		void testAnalyze7() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				ASTNode child3 = new ASTNode("child3", null);
				ASTNode child4 = new ASTNode("child4", null);
				ASTNode child5 = new ASTNode("child5", null);
				root.list.add(child1);
				root.list.add(child2);
				root.list.add(child3);
				root.list.add(child4);
				root.list.add(child5);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 8 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has six children.
		*/
		@Test
		void testAnalyze8() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				ASTNode child3 = new ASTNode("child3", null);
				ASTNode child4 = new ASTNode("child4", null);
				ASTNode child5 = new ASTNode("child5", null);
				ASTNode child6 = new ASTNode("child6", null);
				root.list.add(child1);
				root.list.add(child2);
				root.list.add(child3);
				root.list.add(child4);
				root.list.add(child5);
				root.list.add(child6);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 9 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has seven children.
		*/
		@Test
		void testAnalyze9() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				ASTNode child3 = new ASTNode("child3", null);
				ASTNode child4 = new ASTNode("child4", null);
				ASTNode child5 = new ASTNode("child5", null);
				ASTNode child6 = new ASTNode("child6", null);
				ASTNode child7 = new ASTNode("child7", null);
				root.list.add(child1);
				root.list.add(child2);
				root.list.add(child3);
				root.list.add(child4);
				root.list.add(child5);
				root.list.add(child6);
				root.list.add(child7);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 10 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has eight children.
		*/
		@Test
		void testAnalyze10() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				ASTNode child3 = new ASTNode("child3", null);
				ASTNode child4 = new ASTNode("child4", null);
				ASTNode child5 = new ASTNode("child5", null);
				ASTNode child6 = new ASTNode("child6", null);
				ASTNode child7 = new ASTNode("child7", null);
				ASTNode child8 = new ASTNode("child8", null);
				root.list.add(child1);
				root.list.add(child2);
				root.list.add(child3);
				root.list.add(child4);
				root.list.add(child5);
				root.list.add(child6);
				root.list.add(child7);
				root.list.add(child8);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
}

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
		* It tests the analyze method with a null ASTNode.
		*/
		@Test
		void testAnalyze1() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				assertEquals("File did not parse correctly", analyzer.analyze(null));
		}
		
		/**
		* Test case 2 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has no children.
		*/
		@Test
		void testAnalyze2() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 3 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has one child.
		*/
		@Test
		void testAnalyze3() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child = new ASTNode("child", null);
				root.list.add(child);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 4 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has two children.
		*/
		@Test
		void testAnalyze4() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				root.list.add(child1);
				root.list.add(child2);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 5 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has three children.
		*/
		@Test
		void testAnalyze5() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				ASTNode child3 = new ASTNode("child3", null);
				root.list.add(child1);
				root.list.add(child2);
				root.list.add(child3);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 6 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has four children.
		*/
		@Test
		void testAnalyze6() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				ASTNode child3 = new ASTNode("child3", null);
				ASTNode child4 = new ASTNode("child4", null);
				root.list.add(child1);
				root.list.add(child2);
				root.list.add(child3);
				root.list.add(child4);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 7 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has five children.
		*/
		@Test
		void testAnalyze7() {
				JMCAAnalyzer analyzer = new JMCAAnalyzer();
				ASTNode root = new ASTNode("root", null);
				ASTNode child1 = new ASTNode("child1", null);
				ASTNode child2 = new ASTNode("child2", null);
				ASTNode child3 = new ASTNode("child3", null);
				ASTNode child4 = new ASTNode("child4", null);
				ASTNode child5 = new ASTNode("child5", null);
				root.list.add(child1);
				root.list.add(child2);
				root.list.add(child3);
				root.list.add(child4);
				root.list.add(child5);
				assertEquals("File did not parse correctly", analyzer.analyze(root));
		}
		
		/**
		* Test case 8 for {@link JMCAAnalyzer#analyze(ASTNode)}.
		* It tests the analyze method with an ASTNode that has six children.
		*/
	