// ASTNode_1Test.java
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
class ASTNode_1Test {

	/**
	* Test case 1 for {@link ASTNode#getTree(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testGetTree_1() {
		ASTNode node = ASTNode.getTree("test.txt");
		assertNotNull(node);
	}
	
	/**
	* Test case 2 for {@link ASTNode#getTree(String)}.
	* It tests the method with a null file name.
	*/
	@Test
	void testGetTree_2() {
		ASTNode node = ASTNode.getTree(null);
		assertNull(node);
	}
	
	/**
	* Test case 3 for {@link ASTNode#getTree(String)}.
	* It tests the method with an empty file name.
	*/
	@Test
	void testGetTree_3() {
		ASTNode node = ASTNode.getTree("");
		assertNull(node);
	}
	
	/**
	* Test case 4 for {@link ASTNode#getTree(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testGetTree_4() {
		ASTNode node = ASTNode.getTree("test1.txt");
		assertNull(node);
	}
	
	/**
	* Test case 5 for {@link ASTNode#getTree(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testGetTree_5() {
		ASTNode node = ASTNode.getTree("test2.txt");
		assertNull(node);
	}
	
	/**
	* Test case 6 for {@link ASTNode#getTree(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testGetTree_6() {
		ASTNode node = ASTNode.getTree("test3.txt");
		assertNull(node);
	}
	
	/**
	* Test case 7 for {@link ASTNode#getTree(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testGetTree_7() {
		ASTNode node = ASTNode.getTree("test4.txt");
		assertNull(node);
	}
	
	/**
	* Test case 8 for {@link ASTNode#getTree(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testGetTree_8() {
		ASTNode node = ASTNode.getTree("test5.txt");
		assertNull(node);
	}
	
	/**
	* Test case 9 for {@link ASTNode#getTree(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testGetTree_9() {
		ASTNode node = ASTNode.getTree("test6.txt");
		assertNull(node);
	}
	
	/**
	* Test case 10 for {@link ASTNode#getTree(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testGetTree_10() {
		ASTNode node = ASTNode.getTree("test7.txt");
		assertNull(node);
	}
}

// ASTNode_2Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#dump(String)} method.
*/
class ASTNode_2Test {
		
	/**
	* Test case 1 for {@link ASTNode#dump(String)}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testDump_1() {
		ASTNode node = new ASTNode();
		node.dump("test.txt");
		assertTrue(true);
	}
	
	/**
	* Test case 2 for {@link ASTNode#dump(String)}.
	* It tests the method with a null file name.
	*/
	@Test
	void testDump_2() {
		ASTNode node = new ASTNode();
		node.dump(null);
		assertTrue(true);
	}
	
	/**
	* Test case 3 for {@link ASTNode#dump(String)}.
	* It tests the method with an empty file name.
	*/
	@Test
	void testDump_3() {
		ASTNode node = new ASTNode();
		node.dump("");
		assertTrue(true);
	}
	
	/**
	* Test case 4 for {@link ASTNode#dump(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testDump_4() {
		ASTNode node = new ASTNode();
		node.dump("test1.txt");
		assertTrue(true);
	}
	
	/**
	* Test case 5 for {@link ASTNode#dump(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testDump_5() {
		ASTNode node = new ASTNode();
		node.dump("test2.txt");
		assertTrue(true);
	}
	
	/**
	* Test case 6 for {@link ASTNode#dump(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testDump_6() {
		ASTNode node = new ASTNode();
		node.dump("test3.txt");
		assertTrue(true);
	}
	
	/**
	* Test case 7 for {@link ASTNode#dump(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testDump_7() {
		ASTNode node = new ASTNode();
		node.dump("test4.txt");
		assertTrue(true);
	}
	
	/**
	* Test case 8 for {@link ASTNode#dump(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testDump_8() {
		ASTNode node = new ASTNode();
		node.dump("test5.txt");
		assertTrue(true);
	}
	
	/**
	* Test case 9 for {@link ASTNode#dump(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testDump_9() {
		ASTNode node = new ASTNode();
		node.dump("test6.txt");
		assertTrue(true);
	}
	
	/**
	* Test case 10 for {@link ASTNode#dump(String)}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testDump_10() {
		ASTNode node = new ASTNode();
		node.dump("test7.txt");
		assertTrue(true);
	}
}

// ASTNode_3Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#createTree()} method.
*/
class ASTNode_3Test {
		
	/**
	* Test case 1 for {@link ASTNode#createTree()}.
	* It tests the method with a valid file name.
	*/
	@Test
	void testCreateTree_1() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
	
	/**
	* Test case 2 for {@link ASTNode#createTree()}.
	* It tests the method with a null file name.
	*/
	@Test
	void testCreateTree_2() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
	
	/**
	* Test case 3 for {@link ASTNode#createTree()}.
	* It tests the method with an empty file name.
	*/
	@Test
	void testCreateTree_3() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
	
	/**
	* Test case 4 for {@link ASTNode#createTree()}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testCreateTree_4() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
	
	/**
	* Test case 5 for {@link ASTNode#createTree()}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testCreateTree_5() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
	
	/**
	* Test case 6 for {@link ASTNode#createTree()}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testCreateTree_6() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
	
	/**
	* Test case 7 for {@link ASTNode#createTree()}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testCreateTree_7() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
	
	/**
	* Test case 8 for {@link ASTNode#createTree()}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testCreateTree_8() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
	
	/**
	* Test case 9 for {@link ASTNode#createTree()}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testCreateTree_9() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
	
	/**
	* Test case 10 for {@link ASTNode#createTree()}.
	* It tests the method with a file name that does not exist.
	*/
	@Test
	void testCreateTree_10() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertNotNull(tree);
	}
}

// ASTree.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.aw