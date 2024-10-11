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
	* It tests the method with a null ASTNode.
	*/
	@Test
	void testCreateTree1() {
		ASTNode node = null;
		DefaultMutableTreeNode tree = node.createTree();
		assertNull(tree);
	}
	
	/**
	* Test case 2 for {@link ASTNode#createTree()}.
	* It tests the method with an ASTNode with no children.
	*/
	@Test
	void testCreateTree2() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type :: identity", tree.toString());
	}
	
	/**
	* Test case 3 for {@link ASTNode#createTree()}.
	* It tests the method with an ASTNode with one child.
	*/
	@Test
	void testCreateTree3() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child = new ASTNode();
		child.setType("type");
		child.setIdentity("identity");
		node.addChild(child);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type :: identity", tree.toString());
		assertEquals("type :: identity", tree.getChildAt(0).toString());
	}
	
	/**
	* Test case 4 for {@link ASTNode#createTree()}.
	* It tests the method with an ASTNode with two children.
	*/
	@Test
	void testCreateTree4() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child1 = new ASTNode();
		child1.setType("type");
		child1.setIdentity("identity");
		ASTNode child2 = new ASTNode();
		child2.setType("type");
		child2.setIdentity("identity");
		node.addChild(child1);
		node.addChild(child2);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type :: identity", tree.toString());
		assertEquals("type :: identity", tree.getChildAt(0).toString());
		assertEquals("type :: identity", tree.getChildAt(1).toString());
	}
	
	/**
	* Test case 5 for {@link ASTNode#createTree()}.
	* It tests the method with an ASTNode with three children.
	*/
	@Test
	void testCreateTree5() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child1 = new ASTNode();
		child1.setType("type");
		child1.setIdentity("identity");
		ASTNode child2 = new ASTNode();
		child2.setType("type");
		child2.setIdentity("identity");
		ASTNode child3 = new ASTNode();
		child3.setType("type");
		child3.setIdentity("identity");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type :: identity", tree.toString());
		assertEquals("type :: identity", tree.getChildAt(0).toString());
		assertEquals("type :: identity", tree.getChildAt(1).toString());
		assertEquals("type :: identity", tree.getChildAt(2).toString());
	}
	
	/**
	* Test case 6 for {@link ASTNode#createTree()}.
	* It tests the method with an ASTNode with four children.
	*/
	@Test
	void testCreateTree6() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child1 = new ASTNode();
		child1.setType("type");
		child1.setIdentity("identity");
		ASTNode child2 = new ASTNode();
		child2.setType("type");
		child2.setIdentity("identity");
		ASTNode child3 = new ASTNode();
		child3.setType("type");
		child3.setIdentity("identity");
		ASTNode child4 = new ASTNode();
		child4.setType("type");
		child4.setIdentity("identity");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type :: identity", tree.toString());
		assertEquals("type :: identity", tree.getChildAt(0).toString());
		assertEquals("type :: identity", tree.getChildAt(1).toString());
		assertEquals("type :: identity", tree.getChildAt(2).toString());
		assertEquals("type :: identity", tree.getChildAt(3).toString());
	}
	
	/**
	* Test case 7 for {@link ASTNode#createTree()}.
	* It tests the method with an ASTNode with five children.
	*/
	@Test
	void testCreateTree7() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child1 = new ASTNode();
		child1.setType("type");
		child1.setIdentity("identity");
		ASTNode child2 = new ASTNode();
		child2.setType("type");
		child2.setIdentity("identity");
		ASTNode child3 = new ASTNode();
		child3.setType("type");
		child3.setIdentity("identity");
		ASTNode child4 = new ASTNode();
		child4.setType("type");
		child4.setIdentity("identity");
		ASTNode child5 = new ASTNode();
		child5.setType("type");
		child5.setIdentity("identity");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type :: identity", tree.toString());
		assertEquals("type :: identity", tree.getChildAt(0).toString());
		assertEquals("type :: identity", tree.getChildAt(1).toString());
		assertEquals("type :: identity", tree.getChildAt(2).toString());
		assertEquals("type :: identity", tree.getChildAt(3).toString());
		assertEquals("type :: identity", tree.getChildAt(4).toString());
	}
	
	/**
	* Test case 8 for {@link ASTNode#createTree()}.
	* It tests the method with an ASTNode with six children.
	*/
	@Test
	void testCreateTree8() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child1 = new ASTNode();
		child1.setType("type");
		child1.setIdentity("identity");
		ASTNode child2 = new ASTNode();
		child2.setType("type");
		child2.setIdentity("identity");
		ASTNode child3 = new ASTNode();
		child3.setType("type");
		child3.setIdentity("identity");
		ASTNode child4 = new ASTNode();
		child4.setType("type");
		child4.setIdentity("identity");
		ASTNode child5 = new ASTNode();
		child5.setType("type");
		child5.setIdentity("identity");
		ASTNode child6 = new ASTNode();
		child6.setType("type");
		child6.setIdentity("identity");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type :: identity", tree.toString());
		assertEquals("type :: identity", tree.getChildAt(0).toString());
		assertEquals("type :: identity", tree.getChildAt(1).toString());
		assertEquals("type :: identity", tree.getChildAt(2).toString());
		assertEquals("type :: identity", tree.getChildAt(3).toString());
		assertEquals("type :: identity", tree.getChildAt(4).toString());
		assertEquals("type :: identity", tree.getChildAt(5).toString());
	}
	
	/**
	* Test case 9 for {@link ASTNode#createTree()}.
	* It tests the method with an ASTNode with seven children.
	*/
	@Test
	void testCreateTree9() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child1 = new ASTNode();
		child1.setType("type");
		child1.setIdentity("identity");
		ASTNode child2 = new ASTNode();
		child2.setType("type");
		child2.setIdentity("identity");
		ASTNode child3 = new ASTNode();
		child3.setType("type");
		child3.setIdentity("identity");
		ASTNode child4 = new ASTNode();
		child4.setType("type");
		child4.setIdentity("identity");
		ASTNode child5 = new ASTNode();
		child5.setType("type");
		child5.setIdentity("identity");
		ASTNode child6 = new ASTNode();
		child6.setType("type");
		child6.setIdentity("identity");
		ASTNode child7 = new ASTNode();
		child7.setType("type");
		child7.setIdentity("identity");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type :: identity", tree.toString());
		assertEquals("type :: identity", tree.getChildAt(0).toString());
		assertEquals("type :: identity", tree.getChildAt(1).toString());
		assertEquals("type :: identity", tree.getChildAt(2).toString());
		assertEquals("type :: identity", tree.getChildAt(3).toString());
		assertEquals("type :: identity", tree.getChildAt(4).toString());
		assertEquals("type :: identity", tree.getChildAt(5).toString());
		assertEquals("type :: identity", tree.getChildAt(6).toString());
	}
	
	/**
	* Test case 10 for {@link ASTNode#createTree()}.
	* It tests the method with an ASTNode with eight children.
	*/
	@Test
	void testCreateTree10() {
		ASTNode node = new ASTNode();
		node.setType("type");
		node.setIdentity("identity");
		ASTNode child1 = new ASTNode();
		child1.setType("type");
		child1.setIdentity("identity");
		ASTNode child2 = new ASTNode();
		child2.setType("type");
		child2.setIdentity("identity");
		ASTNode child3 = new ASTNode();
		child3.setType("type");
		child3.setIdentity("identity");
		ASTNode child4 = new ASTNode();
		child4.setType("type");
		child4.setIdentity("identity");
		ASTNode child5 = new ASTNode();
		child5.setType("type");
		child5.setIdentity("identity");
		ASTNode child6 = new ASTNode();
		child6.setType("type");
		child6.setIdentity("identity");
		ASTNode child7 = new ASTNode();
		child7.setType("type");
		child7.setIdentity("identity");
		ASTNode child8 = new ASTNode();
		child8.setType("type");
		child8.setIdentity("identity");
		node.addChild(child1);
		node.addChild(child2);
		node.addChild(child3);
		node.addChild(child4);
		node.addChild(child5);
		node.addChild(child6);
		node.addChild(child7);
		node.addChild(child8);
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals("type :: identity", tree.toString());
		assertEquals("type :: identity", tree.getChildAt(0).toString());
		assertEquals("type :: identity", tree.getChildAt(1).toString());
		assertEquals("type :: identity", tree.getChildAt(2).toString());
		assertEquals("type :: identity", tree.getChildAt(3).toString());
		assertEquals("type :: identity", tree.getChildAt(4).toString());
		assertEquals("type :: identity", tree.getChildAt(5).toString());
		assertEquals("type :: identity", tree.getChildAt(6).toString());
		assertEquals("type :: identity", tree.getChildAt(7).toString());
	}
}

// ASTree.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * <p>Title: Group 2 Project </p>
 *
 * <p>Class: CEN4010 Fall 2005</p>
 *
 * <p>Description: Abstract Syntax Tree</p>
 *
 * <p>Instructor Dr. Stoeklin</p>
 *
 * @author Group 2
 */
public class ASTree {

    /**
     * root node of the tree
     */
    ASTNode root = null;

    /**
     * default constructor
     */
    public ASTree() {
    }

    /**
     * construct a tree with a root node
     * @param r ASTNode
     */
    public ASTree(ASTNode r) {
        root = r;
    }

    /**
     * get the root node
     * @return ASTNode
     */
    public ASTNode getRoot() {
        return root;
    }

    /**
     * set the root node
     * @param r ASTNode
     */
    public void setRoot(ASTNode r) {
        root = r;
    }

    /**
     * display the tree
     * @param wtr Writer
     */
    public void display(Writer wtr) {
        root.display(wtr);
    }

    /**
     * read