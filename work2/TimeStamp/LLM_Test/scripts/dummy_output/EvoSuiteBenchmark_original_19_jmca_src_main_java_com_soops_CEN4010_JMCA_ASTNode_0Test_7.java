// ASTNode_0Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains one unit test case for the {@link ASTNode#compareTo(Object)} method.
*/
class ASTNode_0Test {
		
	/**
	 * Unit test for {@link ASTNode#compareTo(Object)} method.
	 */
	@Test
	public void testCompareTo() {
		
		//System.out.println("testCompareTo");
		
		DefaultMutableTreeNode root1 = new DefaultMutableTreeNode("root1");
				
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("node1");
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("node2");
		
		DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("node 3");		
		node3.setChild("child 3");
		
		root1.add(node1);
		root1.add(node2);
		
		node1.add(node3);
		
		ArrayList<ASTNode> list1 = new ArrayList<ASTNode>();

		list1.add(root1);
		
		if(compareTo(list1)!= 1) {
			fail();// test 1st case
		}
		
		DefaultMutableTreeNode root2 = new DefaultMutableTreeNode("root2");
		ArrayList<ASTNode> list2 = new ArrayList<ASTNode>();

		list2.add(root2);

		if(compareTo(list2)!= 1) {
			fail();// test 2nd case
		}
		
		return;
	}
	
}

// Unit test for the node type