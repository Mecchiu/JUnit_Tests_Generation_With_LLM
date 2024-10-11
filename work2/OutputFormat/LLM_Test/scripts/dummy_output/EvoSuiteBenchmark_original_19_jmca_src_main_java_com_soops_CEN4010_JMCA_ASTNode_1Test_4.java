// ASTNode_1Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains one unit test case for the {@link ASTNode#getTree(String)} method.
*/
class ASTNode_1Test {
		
    @Test
    public void testGetTree() {
        // arrange
        final String TEST = "Test";
        ArrayList<ASTNode> list = new ArrayList<ASTNode>(1);
        ASTNode childNode = null;
        ASTNode newNode;
        childNode = new ASTNode(TEST, null, null);
        childNode.addChildren(list);  // call getChildren()
           
        // act
        newNode = ASTNode.getTree(TEST);
           
        // assert
        assertEquals(TEST, newNode.type);
        assertEquals(newNode.parent, null);       
        list.add(newNode);  
        
        newNode = ASTNode.getTree(TEST);
           
        // assert
        assertEquals(TEST, newNode.type);
        assertEquals(childNode.getParent(), newNode);
        assertEquals(childNode.getParent(), childNode.getParent());
    }

}