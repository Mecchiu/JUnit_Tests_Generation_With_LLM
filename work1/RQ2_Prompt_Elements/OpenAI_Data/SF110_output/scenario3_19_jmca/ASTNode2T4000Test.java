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
	void testCreateTree1() {
		ASTNode node = null;
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with no children.
	*/
	@Test
	void testCreateTree2() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with one child.
	*/
	@Test
	void testCreateTree3() {
		ASTNode node = new ASTNode();
		ASTNode child = new ASTNode();
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with two children.
	*/
	@Test
	void testCreateTree4() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with three children.
	*/
	@Test
	void testCreateTree5() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with four children.
	*/
	@Test
	void testCreateTree6() {
		ASTNode node = new ASTNode();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with five children.
	*/
	@Test
	void testCreateTree7() {
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
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with six children.
	*/
	@Test
	void testCreateTree8() {
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
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with seven children.
	*/
	@Test
	void testCreateTree9() {
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
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the method with an ASTNode with eight children.
	*/
	@Test
	void testCreateTree10() {
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
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
}

// ASTree.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTree implements java.io.Serializable {

    /**
     * add this node and recursively all its children to a swing tree structure <br>
     * used to construct a JTree with the ASTree
     *
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode createTree();
}

// ASTreeTest.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTree}.
* It contains ten unit test cases for the {@link ASTree#createTree()} method.
*/
class ASTreeTest {
		
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with a null ASTree.
	*/
	@Test
	void testCreateTree1() {
		ASTree tree = null;
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with an ASTree with no children.
	*/
	@Test
	void testCreateTree2() {
		ASTree tree = new ASTree();
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with an ASTree with one child.
	*/
	@Test
	void testCreateTree3() {
		ASTree tree = new ASTree();
		ASTNode child = new ASTNode();
		tree.addChild(child);
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with an ASTree with two children.
	*/
	@Test
	void testCreateTree4() {
		ASTree tree = new ASTree();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		tree.addChild(child1);
		tree.addChild(child2);
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with an ASTree with three children.
	*/
	@Test
	void testCreateTree5() {
		ASTree tree = new ASTree();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		tree.addChild(child1);
		tree.addChild(child2);
		tree.addChild(child3);
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with an ASTree with four children.
	*/
	@Test
	void testCreateTree6() {
		ASTree tree = new ASTree();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		tree.addChild(child1);
		tree.addChild(child2);
		tree.addChild(child3);
		tree.addChild(child4);
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with an ASTree with five children.
	*/
	@Test
	void testCreateTree7() {
		ASTree tree = new ASTree();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		tree.addChild(child1);
		tree.addChild(child2);
		tree.addChild(child3);
		tree.addChild(child4);
		tree.addChild(child5);
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with an ASTree with six children.
	*/
	@Test
	void testCreateTree8() {
		ASTree tree = new ASTree();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		tree.addChild(child1);
		tree.addChild(child2);
		tree.addChild(child3);
		tree.addChild(child4);
		tree.addChild(child5);
		tree.addChild(child6);
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with an ASTree with seven children.
	*/
	@Test
	void testCreateTree9() {
		ASTree tree = new ASTree();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		ASTNode child7 = new ASTNode();
		tree.addChild(child1);
		tree.addChild(child2);
		tree.addChild(child3);
		tree.addChild(child4);
		tree.addChild(child5);
		tree.addChild(child6);
		tree.addChild(child7);
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the method with an ASTree with eight children.
	*/
	@Test
	void testCreateTree10() {
		ASTree tree = new ASTree();
		ASTNode child1 = new ASTNode();
		ASTNode child2 = new ASTNode();
		ASTNode child3 = new ASTNode();
		ASTNode child4 = new ASTNode();
		ASTNode child5 = new ASTNode();
		ASTNode child6 = new ASTNode();
		ASTNode child7 = new ASTNode();
		ASTNode child8 = new ASTNode();
		tree.addChild(child1);
		tree.addChild(child2);
		tree.addChild(child3);
		tree.addChild(child4);
		tree.addChild(child5);
		tree.addChild(child6);
		tree.addChild(child7);
		tree.addChild(child8);
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
}

// ASTreeView.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTreeView implements java.io.Serializable {

    /**
     * add this node and recursively all its children to a swing tree structure <br>
     * used to construct a JTree with the ASTree
     *
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode createTree();
}

// ASTreeViewTest.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.