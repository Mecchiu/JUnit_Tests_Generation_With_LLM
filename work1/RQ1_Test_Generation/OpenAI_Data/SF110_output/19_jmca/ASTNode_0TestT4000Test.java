// ASTNode_0Test.java
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
class ASTNode_0Test {

	/**
	* Test case 1 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity.
	*/
	@Test
	void testCompareTo_1() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case 2 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type but different identity.
	*/
	@Test
	void testCompareTo_2() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity2");
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 3 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same identity but different type.
	*/
	@Test
	void testCompareTo_3() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type2");
		node2.setIdentity("identity");
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 4 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have different type and identity.
	*/
	@Test
	void testCompareTo_4() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type2");
		node2.setIdentity("identity2");
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 5 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child.
	*/
	@Test
	void testCompareTo_5() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type");
		node3.setIdentity("identity");
		node1.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 6 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the second node has a child.
	*/
	@Test
	void testCompareTo_6() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type");
		node3.setIdentity("identity");
		node2.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 7 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child with different type and identity.
	*/
	@Test
	void testCompareTo_7() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type2");
		node3.setIdentity("identity2");
		node1.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 8 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the second node has a child with different type and identity.
	*/
	@Test
	void testCompareTo_8() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type2");
		node3.setIdentity("identity2");
		node2.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 9 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child with different type and the second node has a child with different identity.
	*/
	@Test
	void testCompareTo_9() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		ASTNode node4 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type2");
		node3.setIdentity("identity");
		node4.setType("type");
		node4.setIdentity("identity2");
		node1.addChild(node3);
		node2.addChild(node4);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 10 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the second node has a child with different type and the first node has a child with different identity.
	*/
	@Test
	void testCompareTo_10() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		ASTNode node4 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type2");
		node3.setIdentity("identity");
		node4.setType("type");
		node4.setIdentity("identity2");
		node1.addChild(node4);
		node2.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
}

// ASTNode_1Test.java
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
class ASTNode_1Test {
		
	/**
	* Test case 1 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity.
	*/
	@Test
	void testCompareTo_1() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		assertEquals(0, node1.compareTo(node2));
	}
	
	/**
	* Test case 2 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type but different identity.
	*/
	@Test
	void testCompareTo_2() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity2");
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 3 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same identity but different type.
	*/
	@Test
	void testCompareTo_3() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type2");
		node2.setIdentity("identity");
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 4 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have different type and identity.
	*/
	@Test
	void testCompareTo_4() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type2");
		node2.setIdentity("identity2");
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 5 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child.
	*/
	@Test
	void testCompareTo_5() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type");
		node3.setIdentity("identity");
		node1.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 6 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the second node has a child.
	*/
	@Test
	void testCompareTo_6() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type");
		node3.setIdentity("identity");
		node2.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 7 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child with different type and identity.
	*/
	@Test
	void testCompareTo_7() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type2");
		node3.setIdentity("identity2");
		node1.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 8 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the second node has a child with different type and identity.
	*/
	@Test
	void testCompareTo_8() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type2");
		node3.setIdentity("identity2");
		node2.addChild(node3);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 9 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the first node has a child with different type and the second node has a child with different identity.
	*/
	@Test
	void testCompareTo_9() {
		ASTNode node1 = new ASTNode();
		ASTNode node2 = new ASTNode();
		ASTNode node3 = new ASTNode();
		ASTNode node4 = new ASTNode();
		node1.setType("type");
		node1.setIdentity("identity");
		node2.setType("type");
		node2.setIdentity("identity");
		node3.setType("type2");
		node3.setIdentity("identity");
		node4.setType("type");
		node4.setIdentity("identity2");
		node1.addChild(node3);
		node2.addChild(node4);
		assertEquals(1, node1.compareTo(node2));
	}
	
	/**
	* Test case 10 for {@link ASTNode#compareTo(Object)}.
	* It tests the method with two nodes that have the same type and identity, but the second node has a child with different type and the first node has a child with different identity.
	*/
	@Test
	void testCompareTo_10() {
		ASTNode node1 = new ASTNode