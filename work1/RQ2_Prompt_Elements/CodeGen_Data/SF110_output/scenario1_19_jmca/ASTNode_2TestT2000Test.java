// ASTNode_2Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains one unit test case for the {@link ASTNode#createTree()} method.
*/
class ASTNode_2Test {

	/**
	* Tests the equals method for the node-list, returning true if
	* they both have the same data.
	*/
    @Test
	public void testEqualsEquals(){
		ArrayList<Integer> list = new ArrayList<>();
		//Add first element from a list with size 1
		list.add(0, 1);
		list.add(0, 2);
		
		DefaultMutableTreeNode a = new DefaultMutableTreeNode(list.get(0));
		DefaultMutableTreeNode b = new DefaultMutableTreeNode(list.get(1));
		DefaultMutableTreeNode c = new DefaultMutableTreeNode(list.get(2));
		
		DefaultMutableTreeNode aNode = new DefaultMutableTreeNode(a);
		DefaultMutableTreeNode bNode = new DefaultMutableTreeNode(b);
		
		aNode.add(bNode);
		
		//Returns that a.equals(b to verify behavior of equals() method
		assertTrue(a.equals(b));
		
		//Returns that aNode.equals(c to verify behavior of equals() method
		assertTrue(a.equals(c));
		
		//Returns that aNode.equals(bNode) to verify behavior of equals() method
		assertTrue(a.equals(bNode));
	}
	
	/**
	* Test of list-equals method, of class ASTNode.
	*/
    @Test
	public void testListEquals() {
		javax.swing.tree.DefaultMutableTreeNode root = ASTNode.createTree();
		
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
		
		root.add(a);
        root.add(b);
		

		DefaultMutableTreeNode aNode1 = new DefaultMutableTreeNode(a);
		aNode1.add(b);
		
		DefaultMutableTreeNode bNode1 = new DefaultMutableTreeNode(b);
		bNode1.add(aNode1);
		
		
		ArrayList<DefaultMutableTreeNode> list = new ArrayList<>();
		list.add(bNode1);
		List<DefaultMutableTreeNode> aList = new ArrayList<>();
		aList.add(aNode1);
		
		List<DefaultMutableTreeNode> list1 = new ArrayList<>();
		list1.add(bNode1);
		
		ArrayList<DefaultMutableTreeNode> list2 = new ArrayList<>();
		list2.add(aNode1);
		ArrayList<DefaultMutableTreeNode> list3 = new ArrayList<>();
		list3.add(bNode1);

		assertTrue(list.equals(list1));
		assertTrue(list1.equals(list2));
		//TODO: fix test:list3!=list2
		//assertTrue(list2.equals(list1));
		//assertTrue(list1.equals(list1));
	}
	
	/**
	* Test of hashCode method, of class ASTNode.
	*/
    @Test
	public void testHashCode() {
		DefaultMutableTreeNode root = ASTNode.createTree();
		
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
		
		root.add(a);
        root.add(b);
		
		
		DefaultMutableTreeNode aNode = new DefaultMutableTreeNode(a);
		aNode.add(b);
		
		DefaultMutableTreeNode bNode = new DefaultMutableTreeNode(b);
		bNode.add(aNode);
		
		//HashCode of bNode =  aNode.hashCode()
		assertTrue(-1 == bNode.hashCode()); /*NullPointerException*/
		
		
		//HashCode of aNode.hashCode() =  0
		assertTrue(0 == aNode.hashCode()); /*NullPointerException*/
		
		
		//hashCode of aaNode.hashCode() =  0
		assertTrue(0 == aNode.hashCode(aNode)); /*NullPointerException*/
		
		
		assertTrue(-1 == bNode.hashCode(bNode));
	}

	/**
	* Test of toString method, of class ASTNode.
	*/
	@Test
	public void testToString() {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i < 5? i : i + 90);
		}
		
		assertEquals("[0,1,2,3,4,5,6,7,8,9]", list.toString());
		
	}
	
	/**
	* Test of equals method, of class ASTNode.
	*/
	@Test
	public void testEquals() {
		ArrayList<Integer> list = new ArrayList<>();
		//Add first element from a list with size 1
		list.add(0, 1);
		list.add(0, 2);
		
		//Returns false
		assertEquals(false, ASTNode.createTree().equals(list));
		assertEquals(false, ASTNode.createTree().equals(list.get(0)));
		
		//Returns true
		list = new ArrayList<>();
		assertEquals(true, ASTNode.createTree().equals(list));
		
		assertEquals(true, ASTNode.createList().equals(list));
	}

}
