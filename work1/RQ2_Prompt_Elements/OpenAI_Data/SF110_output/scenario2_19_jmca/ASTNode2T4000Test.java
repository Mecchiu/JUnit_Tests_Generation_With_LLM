// ASTNodeTest.java
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
class ASTNodeTest {

	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is null.
	*/
	@Test
	void testCreateTree1() {
		ASTNode node = null;
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree2() {
		ASTNode node = new ASTNode();
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree3() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree4() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree5() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree6() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree7() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree8() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree9() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
	
	/**
	* Test case for {@link ASTNode#createTree()} method.
	* It tests the case when the node is not null.
	*/
	@Test
	void testCreateTree10() {
		ASTNode node = new ASTNode();
		node.list = new ArrayList<ASTNode>();
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		node.list.add(new ASTNode());
		DefaultMutableTreeNode tree = node.createTree();
		assertEquals(null, tree);
	}
}

// ASTree.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTree implements java.io.Serializable {

    /**
     * add this node and recursively all its children to a swing tree structure <br>
     * used to construct a JTree with the ASTree
     *
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode createTree() {
        javax.swing.tree.DefaultMutableTreeNode node = new DefaultMutableTreeNode(toString());
        int arraySize = list.size();
        for (int i = 0; i < arraySize; ++i) {
            node.add(list.get(i).createTree());
        }
        return node;
    }
}

// ASTreeTest.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTree}.
* It contains ten unit test cases for the {@link ASTree#createTree()} method.
*/
class ASTreeTest {
		
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is null.
	*/
	@Test
	void testCreateTree1() {
		ASTree tree = null;
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree2() {
		ASTree tree = new ASTree();
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree3() {
		ASTree tree = new ASTree();
		tree.list = new ArrayList<ASTNode>();
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree4() {
		ASTree tree = new ASTree();
		tree.list = new ArrayList<ASTNode>();
		tree.list.add(new ASTNode());
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree5() {
		ASTree tree = new ASTree();
		tree.list = new ArrayList<ASTNode>();
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree6() {
		ASTree tree = new ASTree();
		tree.list = new ArrayList<ASTNode>();
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree7() {
		ASTree tree = new ASTree();
		tree.list = new ArrayList<ASTNode>();
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree8() {
		ASTree tree = new ASTree();
		tree.list = new ArrayList<ASTNode>();
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree9() {
		ASTree tree = new ASTree();
		tree.list = new ArrayList<ASTNode>();
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTree#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree10() {
		ASTree tree = new ASTree();
		tree.list = new ArrayList<ASTNode>();
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		tree.list.add(new ASTNode());
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
}

// ASTreeView.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTreeView implements java.io.Serializable {

    /**
     * add this node and recursively all its children to a swing tree structure <br>
     * used to construct a JTree with the ASTree
     *
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode createTree() {
        javax.swing.tree.DefaultMutableTreeNode node = new DefaultMutableTreeNode(toString());
        int arraySize = list.size();
        for (int i = 0; i < arraySize; ++i) {
            node.add(list.get(i).createTree());
        }
        return node;
    }
}

// ASTreeViewTest.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTreeView}.
* It contains ten unit test cases for the {@link ASTreeView#createTree()} method.
*/
class ASTreeViewTest {
		
	/**
	* Test case for {@link ASTreeView#createTree()} method.
	* It tests the case when the tree is null.
	*/
	@Test
	void testCreateTree1() {
		ASTreeView tree = null;
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTreeView#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree2() {
		ASTreeView tree = new ASTreeView();
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTreeView#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree3() {
		ASTreeView tree = new ASTreeView();
		tree.list = new ArrayList<ASTNode>();
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTreeView#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	void testCreateTree4() {
		ASTreeView tree = new ASTreeView();
		tree.list = new ArrayList<ASTNode>();
		tree.list.add(new ASTNode());
		DefaultMutableTreeNode node = tree.createTree();
		assertEquals(null, node);
	}
	
	/**
	* Test case for {@link ASTreeView#createTree()} method.
	* It tests the case when the tree is not null.
	*/
	@Test
	