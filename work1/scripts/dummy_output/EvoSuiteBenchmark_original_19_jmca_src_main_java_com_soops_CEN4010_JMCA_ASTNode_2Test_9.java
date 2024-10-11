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
		public ASTNode_2Test() {
		}

		@Test
		public void test1AddChildNode(){
			ASTNode n = new ASTNode("test1AddChildNode");
			ASTNode tn = new ASTNode("test1AddChildNode");
			assert(tn.getType().equals( "com.soops.CEN4010.JMCA.test1AddChildNode" ));
			ASTNode t = new ASTNode(tn);
			assert(tn.getType().equals( "test1AddChildNode" ));
			assert(t.getType().equals("test1AddChildNode"));
			assert(getTree(null).toString().equals( " " ));
			assert(getTree(t).toString().equals( " " ));
			assert(getTree(null).toString().equals( " " ));
			assert(getTree(null).getIdentity().equals( tn.getIdentity() ));
			assert(getTree(tn).getIdentity().equals( tn.getIdentity() ));
			assert(getTree("").getIdentity().equals(" "));
			assert(getTree(t).getIdentity().equals( tn.getIdentity() ));
			System.out.println(tn.getData().toString());
			System.out.println(t.getData().toString());
		}

		@Test
		public void test2ListChildren(){
			ASTNode n = new ASTNode("test2ListChildren");
			n.addChild("A");
			n.addChild("C");
			n.addChild("B");
			System.out.println(getTree(null).toString());
			System.out.println(getTree(n).toString());
			System.out.println(" ");
			System.out.println(getTree(n).getData().toString());

			n = null;
			System.out.println(getTree(null).toString());
			System.out.println(getTree(n).toString());
		}

		@Test
		public void test3TreeSize(){
			Object l = new ArrayList();
			l.add(new Object());
			l.add(new Object());
			l.setSize(2);
			assert(getTree("").getData().toString().equals(" "));
			assert(getTree(null).getData().toString().equals(" "));
			assert(l.getClass().getName().equals(getTree(new ASTNode()).getData().toString().
					concat("class_test2TreeNode_0")));
			assert(getTree(new ASTNode("")).getData().toString().equals(" "));
		}


		@Test
		public void test4LoadTree(){
			// load a null data
			assert(getTree(new ASTNode()).isEmpty());
			// load an empty tree
			assert(getTree("").isEmpty());
			assert(!getTree("").isEmpty());
			assert(!getTree("").isEmpty());
		}

		@Test
		public void test5GetValue(){
		 assert(getTree(new ASTNode()).isEmpty());
		 assert((getTree(new ASTNode()).getData()).equals(""));
		 assert((getTree(new ASTNode("")).getData()).equals(""));
		}

		@Test
		public void test6Display(){
			ArrayList<Object> al = new ArrayList<Object>();
			// get a null data
			assert((getTree(new ASTNode(null)).getData()).equals(""));
			// add a parent data to it
			ASTNode n1 = new ASTNode("n1");
			n1.addChild(new ASTNode("n1"));
			al.add(n1);
			arrayList();
			ArrayList<Object> al2 = new ArrayList<Object>();
			// add a null data to it
			assert(getTree(n1).getData().equals(""));
			// add it to the list
			al2.add(n1);
			// get the node
			assert(getTree(new ASTNode("n1")).getData().equals("n1"));
			// get the parent
			assert(getTree(new ASTNode("n1")).getData().equals( getTree(new ASTNode(null)).getIdentity() ));
			// add another
			assert(getTree(new ASTNode(null)).getData().equals( " " ));
			assert(getTree(new ASTNode("")).isEmpty());
			// add another with children
			assert(!getTree(new ASTNode("")).isEmpty());
			// change identity using "A"
			assert(getTree(new ASTNode("")).getData().equals("A"));
			
		}
}