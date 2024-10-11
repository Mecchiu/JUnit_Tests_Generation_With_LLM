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
     * constructor.
     * @param t Test
     */	
    public ASTNode_1Test(String t) {
     }

	/**
	 * testing getTree() method
	 * 
	 * @see ASTNode#getTree(String)
	 */
	@Test
	public final void testGetTree1() {
		
        ArrayList<ASTNode> treeItems = new ArrayList();
        ASTNode p1 = new ASTNode();

        p1.addChild( new ASTNode("one"));
        p1.addChild( new ASTNode("two"));
          treeItems.add(p1);

	// test
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode(p1);
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode(p1);
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode(p1);

	//test if the returned object is empty
        ASTNode p4 = new ASTNode("four");
        DefaultMutableTreeNode pp = new DefaultMutableTreeNode(p4);

	//test if child3 is added
        pp.addChild( child3);

        treeItems.add(pp);

        treeItems.add(child2);
        treeItems.add(child1);

        treeItems.add(child1);
	//test if getTree() method returns correct values
        ArrayList<DefaultMutableTreeNode> n = new ArrayList();

        TreeMap<String, ASTNode> map = new TreeMap<String, ASTNode>();

	//concat the tree with the nodes in the arraylist
        n = treeItems.get(((ArrayList)n).indexOf(pp));

        Map<String, ASTNode> map1 = new Map<String, ASTNode>();
        n.get(0).getTree(map1);
	//test if the values  are identical
        if (map1!= map) {
            fail("treeItems.get()!= treeItems().");
        }


	//test if the two arrays are equal
        treeItems.get(0).getTree(map1);
        String[] strings1 = new String[] {"one", "two"};
        String[] strings2 = new String[] {(String) (Object)treeItems.get(0),
                (String) (Object)treeItems.get(1)};
        assertEquals(strings1.length, strings2.length);
	//remove the first element (the third)
        treeItems.get(0).getTree(map1);

    }

	/**
	 * testing getTree() method
	 * 
	 * @see ASTNode#getTree(String)
	 */
	@Test
	public final void testGetTree2() {

		ArrayList<ASTNode> treeItems = new ArrayList();
		ASTNode p1 = new ASTNode();

		p1.addChild( new ASTNode("one"));
		p1.addChild( new ASTNode("two"));
          treeItems.add(p1);

	//  test
        ArrayList<DefaultMutableTreeNode> n = new ArrayList();

        treeItems.add(n);

        ArrayList<String> strings = new ArrayList();

        TreeMap<String, ASTNode> map = new TreeMap<String, ASTNode>();

		TreeMap<String, ASTNode> map1 = new TreeMap<String, ASTNode>();

        String s = treeItems.get(((ArrayList)n ).indexOf(p1));

        map1.clear();
        strings = treeItems.get(0).getTree(map1);

        assertEquals(strings.size(), map1.size());

    }

	/**
	 * testing getTree() method
	 * 
	 * @see ASTNode#createTree()
	 */
	@Test
	public final void testCreateTree1() {

        ArrayList<ASTNode> treeItems = new ArrayList();
        ASTNode p1 = new ASTNode();

        p1.addChild( new ASTNode("one"));
        p1.addChild( new ASTNode("two"));
          treeItems.add(p1);

        ArrayList<ASTNode> treeItems2 = new ArrayList();
        treeItems2.add(new ASTNode("node"));
        treeItems2.add(new ASTNode("element1"));
        treeItems2.add(new ASTNode("element2"));

	//test
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode(p1);
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode(p1);
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode(p1);

        treeItems2.add(child2);
        treeItems2.add(child1);
        treeItems2.add(child3);
        

		DefaultMutableTreeNode p4 = new DefaultMutableTreeNode(p1);

	//test
        ArrayList<DefaultMutableTreeNode> n = new ArrayList();

        treeItems.add(n);
        n.add(p4);

	//test if getTree() returns correct values
        n.get(0).createTree();
}
}