// Here's an example implementation of the ASTNode_1Test class with ten unit test cases for the getTree() method:

package com.soops.CEN4010.JMCA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ASTNode_1Test {

    @Test
    void testGetTreeWithValidFile() {
        ASTNode rootNode = ASTNode.getTree("valid_file.ast");
        assertNotNull(rootNode);
    }

    @Test
    void testGetTreeWithInvalidFile() {
        ASTNode rootNode = ASTNode.getTree("invalid_file.ast");
        assertNull(rootNode);
    }

    @Test
    void testGetTreeWithEmptyFile() {
        ASTNode rootNode = ASTNode.getTree("empty_file.ast");
        assertNull(rootNode);
    }

    @Test
    void testGetTreeWithNullFilename() {
        ASTNode rootNode = ASTNode.getTree(null);
        assertNull(rootNode);
    }

    @Test
    void testGetTreeWithNonexistentFile() {
        ASTNode rootNode = ASTNode.getTree("nonexistent_file.ast");
        assertNull(rootNode);
    }

    @Test
    void testGetTreeWithDirectory() {
        ASTNode rootNode = ASTNode.getTree("directory/");
        assertNull(rootNode);
    }

    @Test
    void testGetTreeWithNonASTFile() {
        ASTNode rootNode = ASTNode.getTree("non_ast_file.txt");
        assertNull(rootNode);
    }

    @Test
    void testGetTreeWithCorruptedFile() {
        ASTNode rootNode = ASTNode.getTree("corrupted_file.ast");
        assertNull(rootNode);
    }

    @Test
    void testGetTreeWithLargeFile() {
        ASTNode rootNode = ASTNode.getTree("large_file.ast");
        assertNotNull(rootNode);
    }

    @Test
    void testGetTreeWithSmallFile() {
        ASTNode rootNode = ASTNode.getTree("small_file.ast");
        assertNotNull(rootNode);
    }
}