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
	* It tests the case when the node is null.
	*/
	@Test
	void testCreateTree1() {
		ASTNode node = null;
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree2() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree3() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree4() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree5() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree6() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree7() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree8() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree9() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree10() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
}