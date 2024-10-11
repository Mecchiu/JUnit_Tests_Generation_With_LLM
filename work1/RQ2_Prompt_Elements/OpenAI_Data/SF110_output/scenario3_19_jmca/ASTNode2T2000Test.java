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
	void testCreateTreeNull() {
		ASTNode node = null;
		assertNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with no children.
	*/
	@Test
	void testCreateTreeNoChildren() {
		ASTNode node = new ASTNode();
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with one child.
	*/
	@Test
	void testCreateTreeOneChild() {
		ASTNode node = new ASTNode();
		ASTNode child = new ASTNode();
		node.addChild(child);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with two children.
	*/
	@Test
	void testCreateTreeTwoChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with three children.
	*/
	@Test
	void testCreateTreeThreeChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with four children.
	*/
	@Test
	void testCreateTreeFourChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with five children.
	*/
	@Test
	void testCreateTreeFiveChildren() {
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
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with six children.
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
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with seven children.
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
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with eight children.
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
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		node.addChild(child8);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with nine children.
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
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		node.addChild(child8);
		node.addChild(child9);
		assertNotNull(node.createTree());
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with ten children.
	*/
	@Test
	void testCreateTreeTenChildren() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child