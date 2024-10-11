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
	* It tests the case when the ASTNode is empty.
	*/
	@Test
	void testCreateTreeEmpty() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 0);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has one child.
	*/
	@Test
	void testCreateTreeOneChild() {
		ASTNode node = new ASTNode();
		ASTNode child = new ASTNode();
		node.list.add(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 1);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has two children.
	*/
	@Test
	void testCreateTreeTwoChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 2);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has three children.
	*/
	@Test
	void testCreateTreeThreeChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		node.list.add(child3);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 3);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has four children.
	*/
	@Test
	void testCreateTreeFourChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		node.list.add(child3);
		node.list.add(child4);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 4);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has five children.
	*/
	@Test
	void testCreateTreeFiveChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		node.list.add(child3);
		node.list.add(child4);
		node.list.add(child5);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 5);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has six children.
	*/
	@Test
	void testCreateTreeSixChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		node.list.add(child3);
		node.list.add(child4);
		node.list.add(child5);
		node.list.add(child6);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 6);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has seven children.
	*/
	@Test
	void testCreateTreeSevenChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		ASTNode child7 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		node.list.add(child3);
		node.list.add(child4);
		node.list.add(child5);
		node.list.add(child6);
		node.list.add(child7);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 7);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has eight children.
	*/
	@Test
	void testCreateTreeEightChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		ASTNode child7 = new ASTNode();
		ASTNode child8 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		node.list.add(child3);
		node.list.add(child4);
		node.list.add(child5);
		node.list.add(child6);
		node.list.add(child7);
		node.list.add(child8);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 8);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has nine children.
	*/
	@Test
	void testCreateTreeNineChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		ASTNode child7 = new ASTNode();
		ASTNode child8 = new ASTNode();
		ASTNode child9 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		node.list.add(child3);
		node.list.add(child4);
		node.list.add(child5);
		node.list.add(child6);
		node.list.add(child7);
		node.list.add(child8);
		node.list.add(child9);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 9);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the ASTNode has ten children.
	*/
	@Test
	void testCreateTreeTenChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		ASTNode child7 = new ASTNode();
		ASTNode child8 = new ASTNode();
		ASTNode child9 = new ASTNode();
		ASTNode child10 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		node.list.add(child3);
		node.list.add(child4);
		node.list.add(child5);
		node.list.add(child6);
		node.list.add(child7);
		node.list.add(child8);
		node.list.add(child9);
		node.list.add(child10);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(tree.getChildCount(), 10);
	}
}