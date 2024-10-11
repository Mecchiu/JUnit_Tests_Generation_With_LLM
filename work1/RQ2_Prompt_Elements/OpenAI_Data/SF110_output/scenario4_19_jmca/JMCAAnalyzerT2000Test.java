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
	* It tests the method with a simple class with a single method.
	*/
	@Test
	void testAnalyze1() {
		ASTNode root = new ASTNode(ASTNode.NodeType.CLASS, "TestClass");
		ASTNode method = new ASTNode(ASTNode.NodeType.METHOD, "testMethod");
		root.addChild(method);
		ASTNode statement = new ASTNode(ASTNode.NodeType.STATEMENT, "a = b + c");
		method.addChild(statement);
		JMCAAnalyzer analyzer = new JMCAAnalyzer();
		String result = analyzer.analyze(root);
		assertEquals("TestClass\n\ttestMethod\n\t\ta = b + c\n\t\t\ta is dependent on b, c\n", result);
	}
	
	/**
	* Test case 2 for {@link JMCAAnalyzer#analyze(ASTNode)}.
	* It tests the method with a simple class with a single method.
	*/
	@Test
	void testAnalyze2() {
		ASTNode root = new ASTNode(ASTNode.NodeType.CLASS, "TestClass");
		ASTNode method = new ASTNode(ASTNode.NodeType.METHOD, "testMethod");
		root.addChild(method);
		ASTNode statement = new ASTNode(ASTNode.NodeType.STATEMENT, "a = b + c");
		method.addChild(statement);
		ASTNode statement2 = new ASTNode(ASTNode.NodeType.STATEMENT, "d = a");
		method.addChild(statement2);
		ASTNode statement3 = new ASTNode(ASTNode.NodeType.STATEMENT, "e = d");
		method.addChild(statement3);
		JMCAAnalyzer analyzer = new JMCAAnalyzer();
		String result = analyzer.analyze(root);
		assertEquals("TestClass\n\ttestMethod\n\t\ta = b + c\n\t\t\ta is dependent on b, c\n\t\td = a\n\t\t\td is dependent on a\n\t\te = d\n\t\t\te is dependent on d, a\n", result);
	}
	
	/**
	* Test case 3 for {@link JMCAAnalyzer#analyze(ASTNode)}.
	* It tests the method with a simple class with a single method.
	*/
	@Test
	void testAnalyze3() {
		ASTNode root = new ASTNode(ASTNode.NodeType.CLASS, "TestClass");
		ASTNode method = new ASTNode(ASTNode.NodeType.METHOD, "testMethod");
		root.addChild(method);
		ASTNode statement = new ASTNode(ASTNode.NodeType.STATEMENT, "a = b + c");
		method.addChild(statement);
		ASTNode statement2 = new ASTNode(ASTNode.NodeType.STATEMENT, "d = a");
		method.addChild(statement2);
		ASTNode statement3 = new ASTNode(ASTNode.NodeType.STATEMENT, "e = d");
		method.addChild(statement3);
		ASTNode statement4 = new ASTNode(ASTNode.NodeType.STATEMENT, "f = e");
		method.addChild(statement4);
		ASTNode statement5 = new ASTNode(ASTNode.NodeType.STATEMENT, "g = f");
		method.addChild(statement5);
		ASTNode statement6 = new ASTNode(ASTNode.NodeType.STATEMENT, "h = g");
		method.addChild(statement6);
		ASTNode statement7 = new ASTNode(ASTNode.NodeType.STATEMENT, "i = h");
		method.addChild(statement7);
		ASTNode statement8 = new ASTNode(ASTNode.NodeType.STATEMENT, "j = i");
		method.addChild(statement8);
		ASTNode statement9 = new ASTNode(ASTNode.NodeType.STATEMENT, "k = j");
		method.addChild(statement9);
		ASTNode statement10 = new ASTNode(ASTNode.NodeType.STATEMENT, "l = k");
		method.addChild(statement10);
		ASTNode statement11 = new ASTNode(ASTNode.NodeType.STATEMENT, "m = l");
		method.addChild(statement11);
		ASTNode statement12 = new ASTNode(ASTNode.NodeType.STATEMENT, "n = m");
		method.addChild(statement12);
		ASTNode statement13 = new ASTNode(ASTNode.NodeType.STATEMENT, "o = n");
		method.addChild(statement13);
		ASTNode statement14 = new ASTNode(ASTNode.NodeType.STATEMENT, "p = o");
		method.addChild(statement14);
		ASTNode statement15 = new ASTNode(ASTNode.NodeType.STATEMENT, "q = p");
		method.addChild(statement15);
		ASTNode statement16 = new ASTNode(ASTNode.NodeType.STATEMENT, "r = q");
		method.addChild(statement16);
		ASTNode statement17 = new ASTNode(ASTNode.NodeType.STATEMENT, "s = r");
		method.addChild(statement17);
		ASTNode statement18 = new ASTNode(ASTNode.NodeType.STATEMENT, "t = s");
		method.addChild(statement18);
		ASTNode statement19 = new ASTNode(ASTNode.NodeType.STATEMENT, "u = t");
		method.addChild(statement19);
		ASTNode statement20 = new ASTNode(ASTNode.NodeType.STATEMENT, "v = u");
		method.addChild(statement20);
		ASTNode statement21 = new ASTNode(ASTNode.NodeType.STATEMENT, "w = v");
		method.addChild(statement21);
		ASTNode statement22 = new ASTNode(ASTNode.NodeType.STATEMENT, "x = w");
		method.addChild(statement22);
		ASTNode statement23 = new ASTNode(ASTNode.NodeType.STATEMENT, "y = x");
		method.addChild(statement23);
		ASTNode statement24 = new ASTNode(ASTNode.NodeType.STATEMENT, "z = y");
		method.addChild(statement24);
		JMCAAnalyzer analyzer = new JMCAAnalyzer();
		String result = analyzer.analyze(root);
		assertEquals("TestClass\n\ttestMethod\n\t\ta = b + c\n\t\t\ta is dependent on b, c\n\t\td = a\n\t\t\td is dependent on a\n\t\te = d\n\t\t\te is dependent on d, a\n\t\tf = e\n\t\t\tf is dependent on e, d, a\n\t\tg = f\n\t\t\tg is dependent on f, e, d, a\n\t\th = g\n\t\t\th is dependent on g, f, e, d, a\n\t\ti = h\n\t\t\ti is dependent on h, g, f, e, d, a\n\t\tj = i\n\t\t\tj is dependent on i, h, g, f, e, d, a\n\t\tk = j\n\t\t\tk is dependent on j, i, h, g, f, e, d, a\n\t\tl = k\n\t\t\tl is dependent on k, j, i, h, g, f, e, d, a\n\t\tm = l\n\t\t\tm is dependent on l, k, j, i, h, g, f, e, d, a\n\t\tn = m\n\t\t\tn is dependent on m, l, k, j, i, h, g, f, e, d, a\n\t\to = n\n\t\t\to is dependent on n, m, l