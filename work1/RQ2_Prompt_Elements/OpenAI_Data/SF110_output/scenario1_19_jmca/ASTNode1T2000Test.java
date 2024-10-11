// ASTNodeTest.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#getTree(String)} method.
*/
class ASTNodeTest {

	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTreeValid() {
		ASTNode rootNode = ASTNode.getTree("test.txt");
		assertNotNull(rootNode);
	}
	
	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with an invalid file name.
	*/
	@Test
	void testGetTreeInvalid() {
		ASTNode rootNode = ASTNode.getTree("test.txt");
		assertNull(rootNode);
	}
	
	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with a null file name.
	*/
	@Test
	void testGetTreeNull() {
		ASTNode rootNode = ASTNode.getTree(null);
		assertNull(rootNode);
	}
	
	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with an empty file name.
	*/
	@Test
	void testGetTreeEmpty() {
		ASTNode rootNode = ASTNode.getTree("");
		assertNull(rootNode);
	}
	
	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with a file name that contains only spaces.
	*/
	@Test
	void testGetTreeSpaces() {
		ASTNode rootNode = ASTNode.getTree("   ");
		assertNull(rootNode);
	}
	
	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with a file name that contains only tabs.
	*/
	@Test
	void testGetTreeTabs() {
		ASTNode rootNode = ASTNode.getTree("\t\t\t");
		assertNull(rootNode);
	}
	
	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with a file name that contains only new lines.
	*/
	@Test
	void testGetTreeNewLines() {
		ASTNode rootNode = ASTNode.getTree("\n\n\n");
		assertNull(rootNode);
	}
	
	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with a file name that contains only carriage returns.
	*/
	@Test
	void testGetTreeCarriageReturns() {
		ASTNode rootNode = ASTNode.getTree("\r\r\r");
		assertNull(rootNode);
	}
	
	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with a file name that contains only backspaces.
	*/
	@Test
	void testGetTreeBackspaces() {
		ASTNode rootNode = ASTNode.getTree("\b\b\b");
		assertNull(rootNode);
	}
	
	/**
	* Test case for the {@link ASTNode#getTree(String)} method.
	* It tests the method with a file name that contains only form feeds.
	*/
	@Test
	void testGetTreeFormFeeds() {
		ASTNode rootNode = ASTNode.getTree("\f\f\f");
		assertNull(rootNode);
	}
}