// Here's an example implementation of the ASTNode_2Test class with ten unit test cases for the createTree() method:

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

    @Test
    void testCreateTreeWithEmptyList() {
        ASTNode node = new ASTNode();
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals(node.toString(), tree.getUserObject());
        assertEquals(0, tree.getChildCount());
    }

    @Test
    void testCreateTreeWithOneChild() {
        ASTNode child = new ASTNode();
        child.setValue("child");
        ASTNode node = new ASTNode();
        node.addChild(child);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals(node.toString(), tree.getUserObject());
        assertEquals(1, tree.getChildCount());
        DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) tree.getChildAt(0);
        assertEquals(child.toString(), childNode.getUserObject());
        assertEquals(0, childNode.getChildCount());
    }

    @Test
    void testCreateTreeWithMultipleChildren() {
        ASTNode child1 = new ASTNode();
        child1.setValue("child1");
        ASTNode child2 = new ASTNode();
        child2.setValue("child2");
        ASTNode node = new ASTNode();
        node.addChild(child1);
        node.addChild(child2);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals(node.toString(), tree.getUserObject());
        assertEquals(2, tree.getChildCount());
        DefaultMutableTreeNode child1Node = (DefaultMutableTreeNode) tree.getChildAt(0);
        assertEquals(child1.toString(), child1Node.getUserObject());
        assertEquals(0, child1Node.getChildCount());
        DefaultMutableTreeNode child2Node = (DefaultMutableTreeNode) tree.getChildAt(1);
        assertEquals(child2.toString(), child2Node.getUserObject());
        assertEquals(0, child2Node.getChildCount());
    }

    @Test
    void testCreateTreeWithNestedChildren() {
        ASTNode child1 = new ASTNode();
        child1.setValue("child1");
        ASTNode child2 = new ASTNode();
        child2.setValue("child2");
        ASTNode grandchild1 = new ASTNode();
        grandchild1.setValue("grandchild1");
        child2.addChild(grandchild1);
        ASTNode node = new ASTNode();
        node.addChild(child1);
        node.addChild(child2);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals(node.toString(), tree.getUserObject());
        assertEquals(2, tree.getChildCount());
        DefaultMutableTreeNode child1Node = (DefaultMutableTreeNode) tree.getChildAt(0);
        assertEquals(child1.toString(), child1Node.getUserObject());
        assertEquals(0, child1Node.getChildCount());
        DefaultMutableTreeNode child2Node = (DefaultMutableTreeNode) tree.getChildAt(1);
        assertEquals(child2.toString(), child2Node.getUserObject());
        assertEquals(1, child2Node.getChildCount());
        DefaultMutableTreeNode grandchild1Node = (DefaultMutableTreeNode) child2Node.getChildAt(0);
        assertEquals(grandchild1.toString(), grandchild1Node.getUserObject());
        assertEquals(0, grandchild1Node.getChildCount());
    }

    @Test
    void testCreateTreeWithNullValue() {
        ASTNode node = new ASTNode();
        node.setValue(null);
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("null", tree.getUserObject());
        assertEquals(0, tree.getChildCount());
    }

    @Test
    void testCreateTreeWithEmptyValue() {
        ASTNode node = new ASTNode();
        node.setValue("");
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("", tree.getUserObject());
        assertEquals(0, tree.getChildCount());
    }

    @Test
    void testCreateTreeWithWhitespaceValue() {
        ASTNode node = new ASTNode();
        node.setValue("   ");
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("   ", tree.getUserObject());
        assertEquals(0, tree.getChildCount());
    }

    @Test
    void testCreateTreeWithSpecialCharactersValue() {
        ASTNode node = new ASTNode();
        node.setValue("!@#$%^&*()_+-=[]{}|;':\",./<>?");
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("!@#$%^&*()_+-=[]{}|;':\",./<>?", tree.getUserObject());
        assertEquals(0, tree.getChildCount());
    }

    @Test
    void testCreateTreeWithUnicodeValue() {
        ASTNode node = new ASTNode();
        node.setValue("こんにちは");
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals("こんにちは", tree.getUserObject());
        assertEquals(0, tree.getChildCount());
    }

    @Test
    void testCreateTreeWithMaxChildren() {
        ASTNode node = new ASTNode();
        for (int i = 0; i < ASTNode.MAX_CHILDREN; i++) {
            ASTNode child = new ASTNode();
            child.setValue("child" + i);
            node.addChild(child);
        }
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals(node.toString(), tree.getUserObject());
        assertEquals(ASTNode.MAX_CHILDREN, tree.getChildCount());
        for (int i = 0; i < ASTNode.MAX_CHILDREN; i++) {
            DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) tree.getChildAt(i);
            assertEquals("child" + i, childNode.getUserObject());
            assertEquals(0, childNode.getChildCount());
        }
    }

    @Test
    void testCreateTreeWithMoreThanMaxChildren() {
        ASTNode node = new ASTNode();
        for (int i = 0; i < ASTNode.MAX_CHILDREN + 1; i++) {
            ASTNode child = new ASTNode();
            child.setValue("child" + i);
            node.addChild(child);
        }
        DefaultMutableTreeNode tree = node.createTree();
        assertEquals(node.toString(), tree.getUserObject());
        assertEquals(ASTNode.MAX_CHILDREN + 1, tree.getChildCount());
        for (int i = 0; i < ASTNode.MAX_CHILDREN; i++) {
            DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) tree.getChildAt(i);
            assertEquals("child" + i, childNode.getUserObject());
            assertEquals(0, childNode.getChildCount());
        }
        DefaultMutableTreeNode overflowNode = (DefaultMutableTreeNode) tree.getChildAt(ASTNode.MAX_CHILDREN);
        assertEquals("...", overflowNode.getUserObject());
        assertEquals(0, overflowNode.getChildCount());
    }
}