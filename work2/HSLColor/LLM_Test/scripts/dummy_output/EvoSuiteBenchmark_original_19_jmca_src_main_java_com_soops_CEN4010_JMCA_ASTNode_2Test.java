package com.soops.CEN4010.JMCA;
java
import static org.junit.jupiter.api.Assertions.assertEquals;

class ASTNode_2Test {

    @Test
    void testCreateTreeSingleNode() {
        ASTNode node = new ASTNode("Type", "Identity", null);
        DefaultMutableTreeNode treeNode = node.createTree();
        assertEquals("Type :: Identity", treeNode.getUserObject().toString());
    }

    @Test
    void testCreateTreeMultipleNodes() {
        ASTNode parent = new ASTNode("Parent", "ParentIdentity", null);
        ASTNode child1 = new ASTNode("Child1", "ChildIdentity1", parent);
        ASTNode child2 = new ASTNode("Child2", "ChildIdentity2", parent);
        parent.addChild(child1);
        parent.addChild(child2);

        DefaultMutableTreeNode parentNode = parent.createTree();
        assertEquals("Parent :: ParentIdentity", parentNode.getUserObject().toString());
        assertEquals(2, parentNode.getChildCount());

        DefaultMutableTreeNode childNode1 = (DefaultMutableTreeNode) parentNode.getChildAt(0);
        assertEquals("Child1 :: ChildIdentity1", childNode1.getUserObject().toString());

        DefaultMutableTreeNode childNode2 = (DefaultMutableTreeNode) parentNode.getChildAt(1);
        assertEquals("Child2 :: ChildIdentity2", childNode2.getUserObject().toString());
    }

    // Add more test cases as needed
}
