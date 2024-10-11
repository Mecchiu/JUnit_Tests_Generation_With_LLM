// Here's an example implementation of the ASTNode class and a test class for it:

// ASTNode.java
package com.soops.CEN4010.JMCA;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ASTNode implements Comparable<ASTNode>, Serializable {
    private String value;
    private ArrayList<ASTNode> children;

    public ASTNode(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(ASTNode child) {
        this.children.add(child);
    }

    public ArrayList<ASTNode> getChildren() {
        return this.children;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * Reads the node in from a file
     *
     * @param filename String
     * @return ASTNode
     */
    public static ASTNode getTree(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (ASTNode) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int compareTo(ASTNode o) {
        return this.value.compareTo(o.getValue());
    }
}

// ASTNodeTest.java
package com.soops.CEN4010.JMCA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ASTNode}.
 * It contains ten unit test cases for the {@link ASTNode#getTree(String)} method.
 */
class ASTNodeTest {
    @Test
    void testGetTreeWithValidFile() {
        ASTNode root = ASTNode.getTree("valid_tree.ser");
        assertNotNull(root);
        assertEquals("root", root.getValue());
        ArrayList<ASTNode> children = root.getChildren();
        assertEquals(2, children.size());
        assertEquals("child1", children.get(0).getValue());
        assertEquals("child2", children.get(1).getValue());
    }

    @Test
    void testGetTreeWithInvalidFile() {
        ASTNode root = ASTNode.getTree("invalid_tree.ser");
        assertNull(root);
    }

    @Test
    void testGetTreeWithNonexistentFile() {
        ASTNode root = ASTNode.getTree("nonexistent_tree.ser");
        assertNull(root);
    }

    @Test
    void testGetTreeWithNullFilename() {
        ASTNode root = ASTNode.getTree(null);
        assertNull(root);
    }

    @Test
    void testGetTreeWithEmptyFilename() {
        ASTNode root = ASTNode.getTree("");
        assertNull(root);
    }

    @Test
    void testGetTreeWithDirectory() {
        ASTNode root = ASTNode.getTree("src");
        assertNull(root);
    }

    @Test
    void testGetTreeWithTextFile() {
        ASTNode root = ASTNode.getTree("test.txt");
        assertNull(root);
    }

    @Test
    void testGetTreeWithImageFile() {
        ASTNode root = ASTNode.getTree("test.png");
        assertNull(root);
    }

    @Test
    void testGetTreeWithAudioFile() {
        ASTNode root = ASTNode.getTree("test.mp3");
        assertNull(root);
    }

    @Test
    void testGetTreeWithVideoFile() {
        ASTNode root = ASTNode.getTree("test.mp4");
        assertNull(root);
    }
}