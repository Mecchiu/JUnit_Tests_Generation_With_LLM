// ASTNodeTest.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#compareTo(Object)} method.
*/
class ASTNodeTest {

	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are equal.
	*/
	@Test
	void testCompareTo_Equal() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo_NotEqual() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		node2.getList().add(new ASTNode());
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are equal.
	*/
	@Test
	void testCompareTo_Equal2() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo_NotEqual2() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are equal.
	*/
	@Test
	void testCompareTo_Equal3() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo_NotEqual3() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are equal.
	*/
	@Test
	void testCompareTo_Equal4() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo_NotEqual4() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		node1.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		node2.getList().add(new ASTNode());
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are equal.
	*/
	@Test
	void testCompareTo_Equal5() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.