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
	void testCreateTree_1() {
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
	void testCreateTree_2() {
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
	void testCreateTree_3() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		ASTNode child2 = new ASTNode(node);
		child2.setType("type");
		child2.setIdentity("identity");
		node.addChild(child2);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 4 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree_4() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		ASTNode child2 = new ASTNode(node);
		child2.setType("type");
		child2.setIdentity("identity");
		node.addChild(child2);
		ASTNode child3 = new ASTNode(node);
		child3.setType("type");
		child3.setIdentity("identity");
		node.addChild(child3);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 5 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree_5() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		ASTNode child2 = new ASTNode(node);
		child2.setType("type");
		child2.setIdentity("identity");
		node.addChild(child2);
		ASTNode child3 = new ASTNode(node);
		child3.setType("type");
		child3.setIdentity("identity");
		node.addChild(child3);
		ASTNode child4 = new ASTNode(node);
		child4.setType("type");
		child4.setIdentity("identity");
		node.addChild(child4);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 6 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree_6() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		ASTNode child2 = new ASTNode(node);
		child2.setType("type");
		child2.setIdentity("identity");
		node.addChild(child2);
		ASTNode child3 = new ASTNode(node);
		child3.setType("type");
		child3.setIdentity("identity");
		node.addChild(child3);
		ASTNode child4 = new ASTNode(node);
		child4.setType("type");
		child4.setIdentity("identity");
		node.addChild(child4);
		ASTNode child5 = new ASTNode(node);
		child5.setType("type");
		child5.setIdentity("identity");
		node.addChild(child5);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 7 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree_7() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		ASTNode child2 = new ASTNode(node);
		child2.setType("type");
		child2.setIdentity("identity");
		node.addChild(child2);
		ASTNode child3 = new ASTNode(node);
		child3.setType("type");
		child3.setIdentity("identity");
		node.addChild(child3);
		ASTNode child4 = new ASTNode(node);
		child4.setType("type");
		child4.setIdentity("identity");
		node.addChild(child4);
		ASTNode child5 = new ASTNode(node);
		child5.setType("type");
		child5.setIdentity("identity");
		node.addChild(child5);
		ASTNode child6 = new ASTNode(node);
		child6.setType("type");
		child6.setIdentity("identity");
		node.addChild(child6);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 8 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree_8() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		ASTNode child2 = new ASTNode(node);
		child2.setType("type");
		child2.setIdentity("identity");
		node.addChild(child2);
		ASTNode child3 = new ASTNode(node);
		child3.setType("type");
		child3.setIdentity("identity");
		node.addChild(child3);
		ASTNode child4 = new ASTNode(node);
		child4.setType("type");
		child4.setIdentity("identity");
		node.addChild(child4);
		ASTNode child5 = new ASTNode(node);
		child5.setType("type");
		child5.setIdentity("identity");
		node.addChild(child5);
		ASTNode child6 = new ASTNode(node);
		child6.setType("type");
		child6.setIdentity("identity");
		node.addChild(child6);
		ASTNode child7 = new ASTNode(node);
		child7.setType("type");
		child7.setIdentity("identity");
		node.addChild(child7);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 9 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree_9() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		ASTNode child2 = new ASTNode(node);
		child2.setType("type");
		child2.setIdentity("identity");
		node.addChild(child2);
		ASTNode child3 = new ASTNode(node);
		child3.setType("type");
		child3.setIdentity("identity");
		node.addChild(child3);
		ASTNode child4 = new ASTNode(node);
		child4.setType("type");
		child4.setIdentity("identity");
		node.addChild(child4);
		ASTNode child5 = new ASTNode(node);
		child5.setType("type");
		child5.setIdentity("identity");
		node.addChild(child5);
		ASTNode child6 = new ASTNode(node);
		child6.setType("type");
		child6.setIdentity("identity");
		node.addChild(child6);
		ASTNode child7 = new ASTNode(node);
		child7.setType("type");
		child7.setIdentity("identity");
		node.addChild(child7);
		ASTNode child8 = new ASTNode(node);
		child8.setType("type");
		child8.setIdentity("identity");
		node.addChild(child8);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type:identity", tree.toString());
	}
	
	/**
	* Test case 10 for {@link ASTNode#createTree()}.
	*/
	@Test
	void testCreateTree_10() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode(node);
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		ASTNode child2 = new ASTNode(node);
		child2.setType("type");
		child2.setIdentity("identity");
		node.addChild(child2);
		ASTNode child3 = new ASTNode(node);
		child3.setType("type");
		child3.setIdentity("identity");
		node.addChild(child3);
		ASTNode child4 = new ASTNode(node);
		child4.setType("type");
		child4.setIdentity("identity");
		node.addChild(child4);
		ASTNode child5 = new ASTNode(node);
		child5.setType("type");
		child5.setIdentity("identity");
		node.addChild(child5);
		ASTNode child6 = new ASTNode(node);
		child6.setType("type");
		child6.setIdentity("identity");
		node.addChild(child6);
		ASTNode child7 = new ASTNode(node);
		child7.setType("type");
		child7.setIdentity("identity");
		node.addChild(child7);
		ASTNode child8 = new ASTNode(node);
		child8.setType("type");
		child8.setIdentity("identity");
		node.addChild(child8);
		ASTNode child9 = new ASTNode(node);
		child9.setType("type");
		child9.setIdentity("identity");
		node.addChild(child9);
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
	void testCompareTo_1() {
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
	void testCompareTo_2() {
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
	void testCompareTo_3() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode node2 = new ASTNode();
		node2.setType("type");
		node2.setIdentity("identity");
		assertEquals(0, node.compareTo(node2));
	}
	
	/**
	* Test case 4 for {@link ASTNode#compareTo(Object)}.
	*/
	@Test
	void testCompareTo_4() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode node2 = new ASTNode();
		node2.setType("type");
		node2.setIdentity("identity");
		assertEquals(0, node.compareTo(node2));
	}
	
	/**
	* Test case 5 for {@link ASTNode#compareTo(Object)}.
	*/
	@Test
	void testCompareTo_5() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode node2 = new ASTNode();
		node2.set