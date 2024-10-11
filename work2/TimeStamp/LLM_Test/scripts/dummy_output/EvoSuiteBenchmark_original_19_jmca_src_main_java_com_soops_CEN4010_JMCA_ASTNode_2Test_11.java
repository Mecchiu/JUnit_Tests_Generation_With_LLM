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
		* Tests the creation
		*/
	@Test
	public void test1() {
		//@todo
		
		// Create the node containing at least a String value
		ASTNode tree = ASTNode_2Test.getTree(File_0);
		assertNotNull(tree);

		assertNotNull(tree.getType());
		assertNotNull(tree.getIdentity());
		
    }



	/**
	 * Reads the node from a stream identified by {@link String#java.io.FileInputStream}
	 * and returns an ASTNode.
	 */
	private static ASTNode getTreeImpl(String filename) throws NoSuchFileException, FileNotFoundException, IOException {
		System.out.println("Opening the Input Files from the test set:");
		InputStream fis = null; 
		try {
			fis = new FileInputStream(filename);
		}
		catch (FileNotFoundException exception) {
			throw new NoSuchFileException("FileNotFoundException");
		}
		catch (IOException exception) {
			throw new FileNotFoundException("IOException");
		}
		
		if (fis == null) {
			System.out.println("No Input Files : No node added");
			fis = null;
			return null;
		}
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(fis));
		}
		catch (IOException exception) {
			throw new FileNotFoundException("IOException");
		}
		finally {
			if (br!= null) {
				try {
					br.close();
				} catch (IOException exception) {
					// Do nothing
				}
			}
		}
		
		
		try {
			br = new BufferedReader(new InputStreamReader(fis));
		}
		catch (IOException exception) {
			throw new FileNotFoundException("IOException");
		}
		finally {
			if (br!= null) {
				try {
					br.close();
				} catch (IOException exception) {
					// Do nothing
				}
			}
		}

		ASTNode tree = null;
		try {
			tree = ASTNode_2Test.createTree(br);
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			throw new RuntimeException("Array index out of bounds in the test file");
		}

		fis.close();
		return tree;
	}

		/**
		* Create the tree structure that will be used to generate a tree view
		*/
	private DefaultMutableTreeNode createTree(BufferedReader br) throws NoSuchFileException, IOException {
		System.out.println("Reading the tree structure.");
		ArrayList nodes = new ArrayList();
		String node_element;
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("root node");
		root.setUserObject(node=new String("root node"));
		ArrayList<ASTNode> list = new ArrayList();

		// This list keeps the items that can't be duplicated
		// The nodes in the list are separated by the string node_list separated by semicolons
		// Each item is a string separated by semicolons separated by spaces
		// The semicolon represents separator in the string and separated by an underscore symbol
		String node_list="";
		ArrayList<ASTNode> subtree = new ArrayList();

		br.readline();// This is an empty line that is necessary for the TreeNodeGenerator to read the data
		br.readline(); // This is an empty line that is necessary for the TreeNodeGenerator to read the data

		try {
			while ((node_element=br.readLine())!= null) {
				node_list = node_list + node_element.replace(":", "\\\\:");
			}
		}
		catch (IOException exception) {
			// Do nothing if readline doesn't throw exception
			// Print the message so the test can be aborted later
			throw new IllegalStateException();
			// System.out.println("Exception when reading the ASTNode from " + filename + " : " + exception.getMessage());
		}
		
		try {
			br.readline();// This is an empty line that is necessary for the TreeNodeGenerator to read the data
			while ((node_element=br.readLine())!= null) {
				nodes.add(new ASTNode(node_element, node_element.replace(":", "\\\\:"), new ArrayList<ASTNode>()));
			}
			
			String node = br.readLine();
			while ((node=br.readLine())!= null) {
				
			node=node.replace(":", "\\\\:");
				ASTNode nod_1 = new ASTNode(node_element, node_element.replace(":", "\\\\:"), new ArrayList<ASTNode>()); 
				nodes.add(nod_1);
				nod_1.parent = root;
			}
		}
		catch (IOException exception) {
			// DO NOTHING if the readline throws an IOException
		}
}
}