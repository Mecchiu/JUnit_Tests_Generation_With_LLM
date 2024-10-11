// ASTNode_0Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains one unit test case for the {@link ASTNode#compareTo(Object)} method.
*/
class ASTNode_0Test {
/**
* Create the test case
* @param testName name of the test case
*/
    public ASTNode_0Test(String testName) {
		super(testName);
    }

    @Test
    public void testCompareTo() {
      //add your test code here
      
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(new ASTNode("Root"));
        ArrayList tNodes = new ArrayList();
        tNodes.add(new ASTNode("Node"));
        tNodes.add(new ASTNode("GrandChild"));
        ArrayList grandChildren = new ArrayList();
        grandChildren.add(new ASTNode("Grand Parent"));
        ArrayList grandParent = new ArrayList(grandChildren);
        grandParent.add(new ASTNode("Grand Parent"));
        ArrayList grandParentAndChild = new ArrayList(grandParent);
        ArrayList rootAndChildren = new ArrayList(tNodes);
        rootAndChildren.add(new DefaultMutableTreeNode(new ASTNode("New Tree")));
        rootAndChildren.add(new DefaultMutableTreeNode(new ASTNode("No Children")));
        rootAndChildren.add(new DefaultMutableTreeNode(new ASTNode("New Tree2")));
      // add your test code here
        //do nothing
    }
}