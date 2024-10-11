// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains ten unit test cases for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {

	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a null ASTNode.
	*/
	@Test
	void testAnalyzeNull() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		assertEquals("", analyzer.analyze(null));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with no children.
	*/
	@Test
	void testAnalyzeNoChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		assertEquals("PROGRAM", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with one child.
	*/
	@Test
	void testAnalyzeOneChild() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT");
		node.addChild(child);
		assertEquals("PROGRAM\nSTATEMENT", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with two children.
	*/
	@Test
	void testAnalyzeTwoChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child1 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT1");
		ASTNode child2 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT2");
		node.addChild(child1);
		node.addChild(child2);
		assertEquals("PROGRAM\nSTATEMENT1\nSTATEMENT2", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with three children.
	*/
	@Test
	void testAnalyzeThreeChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child1 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT1");
		ASTNode child2 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT2");
		ASTNode child3 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT3");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		assertEquals("PROGRAM\nSTATEMENT1\nSTATEMENT2\nSTATEMENT3", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with four children.
	*/
	@Test
	void testAnalyzeFourChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child1 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT1");
		ASTNode child2 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT2");
		ASTNode child3 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT3");
		ASTNode child4 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT4");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		assertEquals("PROGRAM\nSTATEMENT1\nSTATEMENT2\nSTATEMENT3\nSTATEMENT4", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with five children.
	*/
	@Test
	void testAnalyzeFiveChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child1 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT1");
		ASTNode child2 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT2");
		ASTNode child3 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT3");
		ASTNode child4 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT4");
		ASTNode child5 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT5");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		assertEquals("PROGRAM\nSTATEMENT1\nSTATEMENT2\nSTATEMENT3\nSTATEMENT4\nSTATEMENT5", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with six children.
	*/
	@Test
	void testAnalyzeSixChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child1 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT1");
		ASTNode child2 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT2");
		ASTNode child3 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT3");
		ASTNode child4 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT4");
		ASTNode child5 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT5");
		ASTNode child6 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT6");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		assertEquals("PROGRAM\nSTATEMENT1\nSTATEMENT2\nSTATEMENT3\nSTATEMENT4\nSTATEMENT5\nSTATEMENT6", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with seven children.
	*/
	@Test
	void testAnalyzeSevenChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child1 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT1");
		ASTNode child2 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT2");
		ASTNode child3 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT3");
		ASTNode child4 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT4");
		ASTNode child5 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT5");
		ASTNode child6 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT6");
		ASTNode child7 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT7");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		assertEquals("PROGRAM\nSTATEMENT1\nSTATEMENT2\nSTATEMENT3\nSTATEMENT4\nSTATEMENT5\nSTATEMENT6\nSTATEMENT7", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with eight children.
	*/
	@Test
	void testAnalyzeEightChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child1 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT1");
		ASTNode child2 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT2");
		ASTNode child3 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT3");
		ASTNode child4 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT4");
		ASTNode child5 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT5");
		ASTNode child6 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT6");
		ASTNode child7 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT7");
		ASTNode child8 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT8");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		node.addChild(child8);
		assertEquals("PROGRAM\nSTATEMENT1\nSTATEMENT2\nSTATEMENT3\nSTATEMENT4\nSTATEMENT5\nSTATEMENT6\nSTATEMENT7\nSTATEMENT8", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with nine children.
	*/
	@Test
	void testAnalyzeNineChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child1 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT1");
		ASTNode child2 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT2");
		ASTNode child3 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT3");
		ASTNode child4 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT4");
		ASTNode child5 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT5");
		ASTNode child6 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT6");
		ASTNode child7 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT7");
		ASTNode child8 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT8");
		ASTNode child9 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT9");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		node.addChild(child8);
		node.addChild(child9);
		assertEquals("PROGRAM\nSTATEMENT1\nSTATEMENT2\nSTATEMENT3\nSTATEMENT4\nSTATEMENT5\nSTATEMENT6\nSTATEMENT7\nSTATEMENT8\nSTATEMENT9", analyzer.analyze(node));
	}
	
	/**
	* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
	* It tests the method with a ASTNode with ten children.
	*/
	@Test
	void testAnalyzeTenChildren() {
		UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
		ASTNode node = new ASTNode(ASTNode.NodeType.PROGRAM, "PROGRAM");
		ASTNode child1 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT1");
		ASTNode child2 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT2");
		ASTNode child3 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT3");
		ASTNode child4 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT4");
		ASTNode child5 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT5");
		ASTNode child6 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT6");
		ASTNode child7 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT7");
		ASTNode child8 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT8");
		ASTNode child9 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT9");
		ASTNode child10 = new ASTNode(ASTNode.NodeType.STATEMENT, "STATEMENT10");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		node.addChild(child8);
		node.addChild(child9);
		node.addChild(child10);
		assertEquals("PROGRAM\nSTATEMENT1\nSTATEMENT2\nSTATEMENT3\nSTATEMENT4\nSTATEMENT5\nSTATEMENT6\nSTATEMENT7\nSTATEMENT8\nSTATEMENT9\nSTATEMENT10", analyzer.analyze(node));
	}
}

// UILayoutDisplayAnalyzer.java
package com.soops.CEN4010.JMCA;

/**
 * <p>Title: Group 2 Project </p>
 *
 * <p>Class: CEN4010 Fall 2005</p>
 *
 * <p>Description: Description: UILayoutDisplayAnalyzer implements a dummy Analyzer
 *    use for UI layout  </p>
 *
 * <p>Instructor Dr. Stoeklin</p>
 *
 * @author Group 2
 */
public class UILayoutDisplayAnalyzer implements Analyzer {

    /**
     *