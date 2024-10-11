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
	* It tests the method with a null node.
	*/
	@Test
	void testCreateTreeNull() {
		ASTNode node = null;
		assertNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with no children.
	*/
	@Test
	void testCreateTreeNoChildren() {
		ASTNode node = new ASTNode();
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with one child.
	*/
	@Test
	void testCreateTreeOneChild() {
		ASTNode node = new ASTNode();
		ASTNode child = new ASTNode();
		node.list.add(child);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with two children.
	*/
	@Test
	void testCreateTreeTwoChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		node.list.add(child1);
		node.list.add(child2);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with three children.
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
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with four children.
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
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with five children.
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
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with six children.
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
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with seven children.
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
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with eight children.
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
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with nine children.
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
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with a node with ten children.
	*/
	@Test
	void testCreateTree