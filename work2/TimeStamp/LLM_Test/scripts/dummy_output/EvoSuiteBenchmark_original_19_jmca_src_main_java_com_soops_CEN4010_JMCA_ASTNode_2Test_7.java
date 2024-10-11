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
     * test method getTree with root node
     */
    @Test
    void testGetRootNode() {
        
        ASTNode node;
        // create a node and set its data type and parent
        node = new ASTNode(0);
        // set the data type
        node.setType("Integer");
		// set the data parent
		node.setParent(null);
      
        String s = node.toString();
        // check if the root node was set
        assertEquals("Number of nodes in the root node ", 1, s.length());
    }

    /**
     * test method createTree with null list
     */
    @Test
    void testCreateTree() {
        
        ArrayList<ASTNode> list = null;
        System.out.println("List " + list);
        // create a node and set its data type and parent
        ASTNode node = new ASTNode(1);
        // set the data type
        node.setType("Integer");
		// set the data parent
		node.setParent(null);
      
        String s = node.toString();
        // check if the root node was set
        assertEquals("Number of nodes in the root node ", 2, s.length());
    }
}