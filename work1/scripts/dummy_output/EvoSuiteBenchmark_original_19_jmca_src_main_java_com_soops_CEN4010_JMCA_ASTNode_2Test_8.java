// ASTNode_2Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains one unit test case for the {@link ASTNode#createTree()} method.
*/
class ASTNode_2Test {
		
    /**
     * Tests the creation of the DefaultMutableTreeNode.
     */
/* 
 		// Unit test of {@link DefaultMutableTreeNode#createTree()}
        public DefaultMutableTreeNode createTree()
        {
                DefaultMutableTreeNode root = new DefaultMutableTreeNode("Tree");
                DefaultMutableTreeNode left = new DefaultMutableTreeNode("Left");
                DefaultMutableTreeNode right = new DefaultMutableTreeNode("Right");
                // left node 
                left.add(node1);
                root.add(left);
                // right node 
                right.add(node2);
                root.add(right);
                return root;
        }
*/
    @Test
    public void test_createTree() throws Exception {
        try (ASTFactory factory = new ASTFactory();
            ASTComponent root = factory.getComponent("/ASTC/ASTComponent.class")) {
//            // This is the default implementation to create the tree
//            DefaultMutableTreeNode tree = factory.createMutableNode("tree");
//            root.add(tree);
            // Add 1th level child
            DefaultMutableTreeNode r1 = factory.createMutableNode("r1");
            r1.add(factory.createMutableTreeNode("f1"));
            tree.add(r1);
            // Add 2nd level child
            DefaultMutableTreeNode t2 = factory.createMutableNode("t2");
            t2.add(factory.createMutableTreeNode("n1"));
            tree.add(t2);
            // Add third level child
            DefaultMutableTreeNode e = factory.createMutableNode("e");
            e.add(factory.createMutableTreeNode("n2"));
            tree.add(e);
        }
    }

    @Test
        public void test_tree_equality() throws Exception {
        try (ASTFactory factory = new ASTFactory()) {
            ASTComponent root = factory.getComponent("/ASTC/ASTComponent.class");
            DefaultMutableTreeNode l1 = factory.createMutableTreeNode("l1");
            DefaultMutableTreeNode e1 = factory.createMutableTreeNode("e1");
            l1.add(factory.createMutableTreeNode("l2"));
            DefaultMutableTreeNode c1 = factory.createMutableTreeNode("c1");
            c1.add(factory.createMutableTreeNode("n3"));
            pw.println(l1);
            pw.println(c1);
            l1.add(factory.createMutableTreeNode("n4"));
            c1.add(factory.createMutableTreeNode("s5"));
            pw.println(l1);
            pw.println(c1);
            DefaultMutableTreeNode cc1 = new DefaultMutableTreeNode("cc1");
            cc1.add(factory.createMutableTreeNode("s6"));
        }
    }

    @Test
    public void test_tree_getEquality() throws Exception {
        try (ASTFactory factory = new ASTFactory();
            ASTComponent root = factory.getComponent("/ASTC/ASTComponent.class")) {
        	root.add(factory.createMutableTreeNode("l1"));
            try {
                factory.createMutableTreeNode("b1");
                fail("can't create node");
            } catch (Exception ex) {

            }
        }
    }

    @Test
    public void test_tree_getHashcode() throws Exception {
        try (ASTFactory factory = new ASTFactory()) {
            ASTComponent root = factory.getComponent("/ASTC/ASTComponent.class");
            DefaultMutableTreeNode l1 = factory.createMutableTreeNode("l1");
            DefaultMutableTreeNode e1 = factory.createMutableTreeNode("e1");
            l1.add(factory.createMutableTreeNode("l2"));
            DefaultMutableTreeNode c1 = factory.createMutableTreeNode("c1");
            c1.add(factory.createMutableTreeNode("n3"));
        }
    }
}