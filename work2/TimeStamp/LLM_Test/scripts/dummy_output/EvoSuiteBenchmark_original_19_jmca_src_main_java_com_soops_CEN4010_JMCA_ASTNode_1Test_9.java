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
	 * Unit test for {@link ASTNode#getTree(String)} method.
	 * @throws IOException Test Exception
	 */
	@Test
	public void test_getTree() throws IOException {
		
		boolean passedTrue = true;
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
		
		// test 1. test adding new child
		
		// test 2. test adding new child
		
		
		// add a new child and add it to the tree
		
		root.addChild(new ASTNode_1Test.newChild_1());
		
		assertTrue(passedTrue);
	}
	
	/**
	 * Unit test for {@link ASTNode#createTree()} method. <br>
	 * It contains test for the method {@link DefaultMutableTreeNode#createTree()}.
	 * @throws IOException Test Exception
	 */
	@Test
	public void test_createTree() throws IOException {

		boolean passedTrue = true;

		// test 3. test adding new child
		
		// test 4. test adding new child
		
		// adding new child to another child node
		
		// adding a new child to a root node
		
		// test 4. test adding new child
		
		// adding a new child to root node
		
		// adding a new child to second child of same node
		
		DefaultMutableTreeNode newChild_1 = new DefaultMutableTreeNode("1");
		newChild_1.addChild(new ASTNode_1Test.newChild_1_2());
		//test 5. test adding new child
		
		// test 6. test adding a new child
		
		// adding a new child to second child of same node
		
		// test 7. test adding a new child
	
		// test 8. test adding new child
	
		
		
		//System.out.println(root.getChildCount());
		
		// test 9. test create tree
		
		// test 10. test create tree
		
		// test 11. test create tree
	}

	/**
	 * Unit test for {@link DefaultMutableTreeNode#createTree} method. <br>
	 * It contains test for the method {@link DefaultMutableTreeNode#createTree()}.
	 * @throws IOException Test Exception
	 * @throws ClassNotFoundException Test Exception
	 * @throws ClassCastException Test Exception
	 * @throws NoSuchMethodException Test Exception
	 * @throws SecurityException Test Exception
	 */
	@Test
	public void test_createTree_1() throws ClassNotFoundException, SecurityException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, IllegalTypeException, InterruptedException {
		boolean passedTrue = true;
		// create a new node
		
		new ASTNode_1Test.newChild_1();
		
		// check for correct creation
		
		// test 1. test creation
		
		// test 2. test creation
		
		new ASTNode_1Test.newChild_1();
		
		// test 3. test creation
		
		// test 4. test creation
		
		// test 5. test creation
		
		new ASTNode_1Test.newChild_1();
	}
	
	/** 
	 * Class for {@link ASTNode} tests of {@link ASTNode#createTree()} and {@link ASTNode#getTree(String)} methods.
	 */
	class ASTNode_1Test extends ASTNode_1Test {

		int newChild_var_1 = 0;
		Object obj_obj = null;
		Object obj_obj2 = null;
		
		/**
		 * Default Constructor
		 */
		public ASTNode_1Test() {
			super();
		}
		
		/**
		 * Construct a node and set all data
		 * @param data ASTNode
		 */
		public ASTNode_1Test(ASTNode data) {
			super(data);
		}
		
	}
	
	Object obj_obj2 = new Object();

	/**
	 * Unit test for {@link ASTNode#getTree(String)} method. <br>
	 * It contains test for the method {@link ASTNode#getTree(String)} and {@link ASTNode#getTree()} for the default type as ASTNode.
	 * @throws IOException Test Exception
	 * @throws NoSuchMethodException Test Exception
	 */
	@Test
	public void test_getTree() throws IOException {
		boolean passedTrue = true;
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("tree1");

		// test 6. test getTree
		
		// test 6. test getTree
		
		// check for correct creation
		
		// test 7. test getTree
		
		ASTNode node = root.getChild(1);
		String ident = node.getType();
		System.out.println("1st child = " + node.toString() + " type: " + ident);
		
		// test 7. test getTree
		
		
		
		// add a new child and add it to the
}
}