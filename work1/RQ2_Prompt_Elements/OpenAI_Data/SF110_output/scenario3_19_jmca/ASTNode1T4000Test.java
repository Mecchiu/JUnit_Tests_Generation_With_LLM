// ASTNodeTest.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#getTree(String)} method.
*/
class ASTNodeTest {

	/**
	* Test case 1 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree1() {
		ASTNode node = ASTNode.getTree("test1.txt");
		assertEquals(node.getName(), "test1.txt");
	}
	
	/**
	* Test case 2 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree2() {
		ASTNode node = ASTNode.getTree("test2.txt");
		assertEquals(node.getName(), "test2.txt");
	}
	
	/**
	* Test case 3 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree3() {
		ASTNode node = ASTNode.getTree("test3.txt");
		assertEquals(node.getName(), "test3.txt");
	}
	
	/**
	* Test case 4 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree4() {
		ASTNode node = ASTNode.getTree("test4.txt");
		assertEquals(node.getName(), "test4.txt");
	}
	
	/**
	* Test case 5 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree5() {
		ASTNode node = ASTNode.getTree("test5.txt");
		assertEquals(node.getName(), "test5.txt");
	}
	
	/**
	* Test case 6 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree6() {
		ASTNode node = ASTNode.getTree("test6.txt");
		assertEquals(node.getName(), "test6.txt");
	}
	
	/**
	* Test case 7 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree7() {
		ASTNode node = ASTNode.getTree("test7.txt");
		assertEquals(node.getName(), "test7.txt");
	}
	
	/**
	* Test case 8 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree8() {
		ASTNode node = ASTNode.getTree("test8.txt");
		assertEquals(node.getName(), "test8.txt");
	}
	
	/**
	* Test case 9 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree9() {
		ASTNode node = ASTNode.getTree("test9.txt");
		assertEquals(node.getName(), "test9.txt");
	}
	
	/**
	* Test case 10 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree10() {
		ASTNode node = ASTNode.getTree("test10.txt");
		assertEquals(node.getName(), "test10.txt");
	}
}