// ASTNodeTest.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#createTree()} method.
*/
class ASTNodeTest {
		
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a null ASTNode.
	*/
	@Test
	void testCreateTree1() {
		ASTNode node = null;
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with no children.
	*/
	@Test
	void testCreateTree2() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with one child.
	*/
	@Test
	void testCreateTree3() {
		ASTNode node = new ASTNode();
		ASTNode child = new ASTNode();
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with two children.
	*/
	@Test
	void testCreateTree4() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with three children.
	*/
	@Test
	void testCreateTree5() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with four children.
	*/
	@Test
	void testCreateTree6() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with five children.
	*/
	@Test
	void testCreateTree7() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with six children.
	*/
	@Test
	void testCreateTree8() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with seven children.
	*/
	@Test
	void testCreateTree9() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		ASTNode child7 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with eight children.
	*/
	@Test
	void testCreateTree10() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		ASTNode child7 = new ASTNode();
		ASTNode child8 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		node.addChild(child8);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
}