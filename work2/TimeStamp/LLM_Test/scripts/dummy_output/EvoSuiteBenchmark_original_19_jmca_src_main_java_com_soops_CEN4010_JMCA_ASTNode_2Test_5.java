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
	 * Constructor.
	 * @throws FileNotFoundException 
	 * @throws IOException
	 */
	public ASTNode_2Test()throws FileNotFoundException, IOException {
		String filename = "test_dump.dat";  
		InputData inp = new InputData("/Users/Keshi/Downloads/data/test_dump.dat"); //$NON-NLS-1$
		BufferedWriter  out = new BufferedWriter(new FileWriter(filename));
		TreeViewer t = new TreeViewer(inp, out, filename);
	}

	/**
	 *  Read the node in from a file
	 * @throws FileNotFoundException 
	 * @throws IOException
	 */
	@Test
	public void test() throws FileNotFoundException, IOException{
		// String filename = "test_dump.dat";  
		// InputData inp = new InputData("/Users/Keshi/Downloads/data/test_dump.dat"); //$NON-NLS-1$
		// BufferedReader  in = new BufferedReader(new FileReader("/Users/Keshi/Downloads/data/tree.dat"));
		// BufferedWriter  out = new BufferedWriter(new GZIPOutputStream("/Users/Keshi/Downloads/data/tree.dat.gz"));
		// BufferedReader  inbuf = new BufferedReader(new FileReader("/Users/Keshi/Downloads/data/tree.dat"));
		// TreeViewer t = new TreeViewer(inbuf, out,filename);
		// String tfilename="test_dump.dat";  
		TreeViewer t = new TreeViewer();  
		t.setInputData(new InputData("/Users/Keshi/Downloads/data/test_dump.dat"));   
		try {
			DefaultMutableTreeNode c = t.createTree();
			try {
				c.add(createTree());
				fail("Invalid node was returned");
			} catch (JDOMException e) {
				assertEquals("Naming of element name must be compliant with Element Name Conventions in 1.3 and newer", e.getMessage());
			}
		} catch (JDOMException e) {
			String s = e.getMessage();
			System.err.println(s); 
			System.exit(0);
		}  
	}
}

/**
 * Created on May 30, 2006.
 * 
 * @author nelson
 *
 */
class InputData {

    public InputData() {
    }

    public InputData(String input) {
        this.input = input;
    }
    


    String input;
    /**
     * String representation  of the object.
     * @return the output String
     */
    public String toString(){
         return input;
     }
     
}

/**
 * Default implementation of Comparable
 * @param node ast node
 * @return int values 0 for same and 1 for different
 */
public int compare(ASTNode node) {
    return 0;
}

class TreeViewer {

    private FileTreeViewer tree;
    
    public synchronized void setInputData(InputData inp) {
            tree = new FileTreeViewer(inp);
            tree.setDefaultTraits(DefaultMutableTreeNode.TRAIT_TREE_VALIDATION
                    | DefaultMutableTreeNode.TRAIT_ROOT | DefaultMutableTreeNode.TRAIT_TREATIN_INVALID  
                    | DefaultMutableTreeNode.TRAIT_TREATIN_MISSABLE 
                    | DefaultMutableTreeNode.TRAIT_EXPANDED);
            tree.addTabComponent(
                    new DefaultMutableTreeNode(new ASTNode("root", "identity"))); 
    }

    /**
     * displays its children in a JTree
     * @throws FileNotFoundException
     */
    public synchronized void displayTree(){
         tree.display(new File("tree.dat"));
      
    }

  
}