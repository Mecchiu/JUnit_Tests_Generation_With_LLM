// ASTNode_2Test.java
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
class ASTNode_2Test {

	/**
	* Test case 1 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree1() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 2 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree2() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 3 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree3() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 4 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree4() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 5 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree5() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 6 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree6() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 7 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree7() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 8 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree8() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 9 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree9() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 10 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree10() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
}

// ASTNode_3Test.java
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
class ASTNode_3Test {
		
	/**
	* Test case 1 for {@link ASTNode#compareTo(Object)}.
	*/
	@Test
	void testCompareTo1() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode node2 = new ASTNode();
		node2.setType("type");
		node2.setIdentity("identity");
		assertEquals(0, node.compareTo(node2));
	}
	
	/**
	* Test case 2 for {@link ASTNode#compareTo(Object)}.
	*/
	@Test
	void testCompareTo2() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode node2 = new ASTNode();
		node2.setType("type");
		node2.setIdentity("identity");
		assertEquals(0, node.compareTo(node2));
	}
	
	/**
	* Test case 3 for {@link ASTNode#compareTo(Object)}.
	*/
	@Test
	void testCompareTo3() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode node2 = new ASTNode();
		node2.setType("type");
		node2.setIdentity("identity");
		assertEquals(0, node.compareTo(node2));
	}
	
