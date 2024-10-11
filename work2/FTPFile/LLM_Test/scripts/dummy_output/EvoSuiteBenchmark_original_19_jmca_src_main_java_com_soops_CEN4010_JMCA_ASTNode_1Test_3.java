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
		
    private static final int NODE_COUNT = 1024;
    private static final int TEST_NODE_COUNT = NODE_COUNT * 2;
    private static final String TMP_PATH_PREFIX = "./tmp";
    private static final InputStream IS_INPUT = ASTNode_1Test.class.getClassLoader().getResourceAsStream(TMP_PATH_PREFIX + ".txt");
    private static final OutputStream OS_OUTPUT = new FileOutputStream(TMP_PATH_PREFIX + ".txt");

    /**
     * Constructor of {@link ASTNode}
     */
    ASTNode_1Test() {
    }

    /**
     * Add to String field
     * @param n String
     */
    public void setP(String n) {
    }

    /**
     * Add to String field and copy it to another string.
     * Copy the content of the String into the String variable
     * @param s String
     */
    public void pCopy(String s) {
    }

    /**
     * Add the data of the tree node.
     * @param n Object
     * @return the value of the tree node (Object, int).
     */
    public ASTNode addChild(ASTNode n) {
        DefaultMutableTreeNode tmp = new DefaultMutableTreeNode(n);
        return (ASTNode)tmp.getUserObject();
    }

    /**
     * Get a child for the specific tree node.
     * @param node ASTNode
     * @return ASTNode
     */
    public ASTNode getChild(ASTNode node) {
        return node.getData();
    }

    /**
     * Add an item to the ASTNode
     * @param node AstNode
     */
    public void addChild(ASTNode node) {
        node.list = new ArrayList<ASTNode>();
    }

    /**
     * Add the data of the tree node.
     * @param node ASTNode
     * @return the value of the tree node (Object, int).
     */
    public ASTNode addTail(ASTNode node) {
        DefaultMutableTreeNode tmp = new DefaultMutableTreeNode(node);
        return (ASTNode)tmp.getUserObject();
    }
}