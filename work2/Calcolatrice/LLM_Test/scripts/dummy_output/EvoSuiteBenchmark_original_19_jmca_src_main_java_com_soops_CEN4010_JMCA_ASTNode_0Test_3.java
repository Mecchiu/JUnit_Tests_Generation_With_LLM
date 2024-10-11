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
		private ASTNode current;
			private ASTNode parent;

		/**
		* test method for {@link ASTNode#compareTo(Object)}
		*/
    @Test
    public void compareTo () {
        current = new ASTNode(0);
        current.setType("");
        current.setType(null);
        current.setIdentity("I");
        parent = new ASTNode();
        parent.addChild(current);
        current.display(System.out);

        System.out.println("");
        parent.display(System.out);
        if (!current.compareTo(parent)) {
            throw new Exception("I: "+current.toString()+" :I " + parent.toString());
        }
        System.out.println("");

        ASTNode node3 = new ASTNode("3");
		node3.addChild(new ASTNode("4"));
		node3.addChild(new ASTNode("5"));
		node3.addChild(new ASTNode("6"));
		assertEquals(1, current.getChildCount());
		System.out.println("");
        parent.addChild(node3);
        System.out.println("");
        if (current.getChildCount()!= 2) {
            throw new Exception("Child count does not correct");
        }
        node3.display(System.out);
        try {
            System.out.println("");
            parent.display(System.out);

            if (!current.compareTo(parent)) {
                throw new Exception("I: "+current.toString()+" :I " + parent.toString());
            }
        } catch (IOException e ) {
            fail("IOException thrown from a child node");
        }
        System.out.println("");

        parent.display(System.out);
        if (current.getChildCount()!= 2) {
            throw new Exception("Child count does not correct");
        }
        node3.display(System.out);
        try {
            System.out.println("");
            parent.display(System.out);

            if (!current.compareTo(parent)) {
                throw new Exception("I: "+current.toString()+" :I " + parent.toString());
            }
        } catch (IOException e ) {
            fail("IOException thrown from a child node");
        }

        System.out.println("");
    }
}