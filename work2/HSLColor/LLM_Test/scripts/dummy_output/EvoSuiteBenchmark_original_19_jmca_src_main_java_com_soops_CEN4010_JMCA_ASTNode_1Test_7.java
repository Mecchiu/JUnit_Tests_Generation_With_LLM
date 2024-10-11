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
		
    /**
     * Set up test variables.
     */
    @Test
    public void testConstructor1() {
        // set up unit test variables
        String identity = "Root";
        ASTNode node = null;
        node = new ASTNode("Root");

        // compare the two objects
        if (!node.getType().equals(identity)) {
            fail("Identity and tree element are different");
        }
        assertEquals(identity, node.getIdentity());

        // and make a copy
        ArrayList<ASTNode> child = node.getChild();
        assertEquals(1, child.size());
        node = new ASTNode(child.get(0));
        if (!node.getIdentity().equals(identity)) {
            fail("Identity and tree element are different");
        }
        assertEquals(identity, node.getIdentity());
    }


}