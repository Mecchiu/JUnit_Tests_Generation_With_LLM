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
	* It tests the case when the two nodes are the same.
	*/
	@Test
	void testCompareTo_Same() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.addChild(node2);
		node2.addChild(node1);
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are different.
	*/
	@Test
	void testCompareTo_Different() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.addChild(node2);
		node2.addChild(node1);
		node2.setType("type2");
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are the same.
	*/
	@Test
	void testCompareTo_Same2() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.addChild(node2);
		node2.addChild(node1);
		node2.setType("type2");
		node2.setIdentity("identity2");
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are the same.
	*/
	@Test
	void testCompareTo_Same3() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.addChild(node2);
		node2.addChild(node1);
		node2.setType("type2");
		node2.setIdentity("identity2");
		node2.addChild(node1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are the same.
	*/
	@Test
	void testCompareTo_Same4() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.addChild(node2);
		node2.addChild(node1);
		node2.setType("type2");
		node2.setIdentity("identity2");
		node2.addChild(node1);
		node2.addChild(node1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are the same.
	*/
	@Test
	void testCompareTo_Same5() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.addChild(node2);
		node2.addChild(node1);
		node2.setType("type2");
		node2.setIdentity("identity2");
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(node1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are the same.
	*/
	@Test
	void testCompareTo_Same6() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.addChild(node2);
		node2.addChild(node1);
		node2.setType("type2");
		node2.setIdentity("identity2");
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(node1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are the same.
	*/
	@Test
	void testCompareTo_Same7() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.addChild(node2);
		node2.addChild(node1);
		node2.setType("type2");
		node2.setIdentity("identity2");
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(node1);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case for {@link ASTNode#compareTo(Object)} method.
	* It tests the case when the two nodes are the same.
	*/
	@Test
	void testCompareTo_Same8() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.addChild(node2);
		node2.addChild(node1);
		node2.setType("type2");
		node2.setIdentity("identity2");
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(node1);
		node2.addChild(