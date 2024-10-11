// ASTNode.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTNode implements Comparable, java.io.Serializable {

    /**
     * add this node and recursively all its children to a swing tree structure <br>
     * used to construct a JTree with the ASTree
     *
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode createTree() {
        // implementation of createTree method
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(this);
        for (ASTNode child : children) {
            node.add(child.createTree());
        }
        return node;
    }
}

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
    @Test
    void testCreateTree() {
        // test cases for createTree method
        ASTNode node1 = new ASTNode();
        ASTNode node2 = new ASTNode();
        ASTNode node3 = new ASTNode();
        node1.addChild(node2);
        node2.addChild(node3);
        DefaultMutableTreeNode treeNode = node1.createTree();
        assertEquals(treeNode.getUserObject(), node1);
        assertEquals(treeNode.getChildAt(0).getUserObject(), node2);
        assertEquals(treeNode.getChildAt(0).getChildAt(0).getUserObject(), node3);
    }
}