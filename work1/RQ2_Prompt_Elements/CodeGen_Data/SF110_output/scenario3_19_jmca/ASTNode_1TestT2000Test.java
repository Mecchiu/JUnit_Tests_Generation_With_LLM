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
		 * Creates a new test case for the {@link ASTNode#getTree} method.
		 */
		public ASTNode_1Test() {
		}

		/**
		 * Tests the return value of the {@link ASTNode#getTree} method which
		 * returns the root of a {@link DefaultMutableTreeNode}, which is an instance of the
		 * {@link DefaultMutableTreeNode}, which is a {@link ASTNode}.
		 */
		@Test
        public void getTreeTest() {
            String pathname = "../TestData/test_resources/test";
            ASTNode root = new ASTNode(
                                   new File(pathname),
                                   pathname);
            System.out.println(root);
            DefaultMutableTreeNode node = getTree(root);
            assertNotNull(node);
        }
}