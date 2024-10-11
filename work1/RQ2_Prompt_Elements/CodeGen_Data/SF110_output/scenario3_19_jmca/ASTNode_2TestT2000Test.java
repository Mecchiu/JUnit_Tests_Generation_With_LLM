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

		static DefaultMutableTreeNode root;
		
		static JTree tree;
        
        private static String s = "A String that works.";
        private static String s2 = "A String with spaces.";
        
        /**
        * Create the JUnit test case for ASTNode_2Test method.
        *
                        s
		* @throws Exception
        */
        private ASTNode_2Test() throws Exception 
        {
         
          
            /*
            Create a tree node "A" for which a DefaultMutableTreeNode is constructed
	        
            */
            DefaultMutableTreeNode nodeA = new DefaultMutableTreeNode("A");
            root = nodeA;
            
            /*
            Create a tree node "B" for which a JTree is created  
            
            */    
            JTree nodeB = new JTree();
        
        //tree = new JTree(new DefaultMutableTreeNode("A"));
        tree = new JTree(new DefaultMutableTreeNode("A"), null);
        tree = new JTree(null, tree);
            
        /*
        Make the tree contain both the node A and node B
        
        */    
            tree.addTreeSelectionListener(new NodeTreeSelectionListener());  
           
        }
        
        /*
        
        */

        @Test
        public void test() throws Exception 
        {
           
         
        }
  
}