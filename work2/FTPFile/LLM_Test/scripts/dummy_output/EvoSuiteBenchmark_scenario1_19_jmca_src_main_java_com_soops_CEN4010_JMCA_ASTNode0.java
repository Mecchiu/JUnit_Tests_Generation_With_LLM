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
	* Test case 1 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are equal.
	*/
	@Test
	void testCompareTo1() {
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
	* Test case 2 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo2() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		ASTNode node3 = new ASTNode();
		node3.setType("type");
		node3.setIdentity("identity");
		node3.setList(new ArrayList<ASTNode>());
		node1.getList().add(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 3 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo3() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		ASTNode node3 = new ASTNode();
		node3.setType("type");
		node3.setIdentity("identity");
		node3.setList(new ArrayList<ASTNode>());
		node2.getList().add(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 4 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo4() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		ASTNode node3 = new ASTNode();
		node3.setType("type");
		node3.setIdentity("identity");
		node3.setList(new ArrayList<ASTNode>());
		node1.getList().add(node3);
		node2.getList().add(node3);
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case 5 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo5() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		ASTNode node3 = new ASTNode();
		node3.setType("type");
		node3.setIdentity("identity");
		node3.setList(new ArrayList<ASTNode>());
		ASTNode node4 = new ASTNode();
		node4.setType("type");
		node4.setIdentity("identity");
		node4.setList(new ArrayList<ASTNode>());
		node1.getList().add(node3);
		node2.getList().add(node4);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 6 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo6() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		ASTNode node3 = new ASTNode();
		node3.setType("type");
		node3.setIdentity("identity");
		node3.setList(new ArrayList<ASTNode>());
		ASTNode node4 = new ASTNode();
		node4.setType("type");
		node4.setIdentity("identity");
		node4.setList(new ArrayList<ASTNode>());
		node1.getList().add(node3);
		node1.getList().add(node4);
		node2.getList().add(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 7 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo7() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		ASTNode node3 = new ASTNode();
		node3.setType("type");
		node3.setIdentity("identity");
		node3.setList(new ArrayList<ASTNode>());
		ASTNode node4 = new ASTNode();
		node4.setType("type");
		node4.setIdentity("identity");
		node4.setList(new ArrayList<ASTNode>());
		node1.getList().add(node3);
		node2.getList().add(node3);
		node2.getList().add(node4);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 8 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo8() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		ASTNode node3 = new ASTNode();
		node3.setType("type");
		node3.setIdentity("identity");
		node3.setList(new ArrayList<ASTNode>());
		ASTNode node4 = new ASTNode();
		node4.setType("type");
		node4.setIdentity("identity");
		node4.setList(new ArrayList<ASTNode>());
		node1.getList().add(node3);
		node1.getList().add(node4);
		node2.getList().add(node3);
		node2.getList().add(node4);
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case 9 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo9() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		ASTNode node3 = new ASTNode();
		node3.setType("type");
		node3.setIdentity("identity");
		node3.setList(new ArrayList<ASTNode>());
		ASTNode node4 = new ASTNode();
		node4.setType("type");
		node4.setIdentity("identity");
		node4.setList(new ArrayList<ASTNode>());
		ASTNode node5 = new ASTNode();
		node5.setType("type");
		node5.setIdentity("identity");
		node5.setList(new ArrayList<ASTNode>());
		node1.getList().add(node3);
		node1.getList().add(node4);
		node2.getList().add(node3);
		node2.getList().add(node5);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 10 for {@link ASTNode#compareTo(Object)}.
	* It tests the case when the two nodes are not equal.
	*/
	@Test
	void testCompareTo10() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node2.setType("type");
		node1.setIdentity("identity");
		node2.setIdentity("identity");
		node1.setList(new ArrayList<ASTNode>());
		node2.setList(new ArrayList<ASTNode>());
		ASTNode node3 = new ASTNode();
		node3.setType("type");
		node3.setIdentity("identity");
		node3.setList(new ArrayList<ASTNode>());
		ASTNode node4 = new ASTNode();
		node4.setType("type");
		node4.setIdentity("identity");
		node4.setList(new ArrayList<ASTNode>());
		ASTNode node5 = new ASTNode();
		node5.setType("type");
		node5.setIdentity("identity");
		node5.setList(new ArrayList<ASTNode>());
		node1.getList().add(node3);
		node1.getList().add(node4);
		node2.getList().add(node3);
		node2.getList().add(node4);
		node2.getList().add(node5);
		assertEquals(1, node1.compareTo(node2));
	}
}