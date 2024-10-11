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

    // ====================================================
    // Test Methods
    // ====================================================

    /**
    * Class test case for {@link ASTNode#getTree(String)}.
    * Tests case where only the input string name is known.
    * In such case it calls the method {@link ASTNode#getTree(String)}
    * which throws exception.
    */
    @Test(expected=IllegalArgumentException.class)
    public void testGetTree_1() {
        ArrayList<String> strList;
                strList = new ArrayList<>();
        ASTNode testNode1 = new ASTNode_1();// Create an instance of the test Node.
        ASTNode testNode2 = new ASTNode_1();

        try {
            testNode1.getTree("name");
        }
        catch (IllegalArgumentException iae) {
            fail("Illegal Argument exception has occured");
        }
    }

    // ====================================================================================
    // Test Methods
    // ====================================================================================
    // ====================================================================================
}
 //==============================================================================
