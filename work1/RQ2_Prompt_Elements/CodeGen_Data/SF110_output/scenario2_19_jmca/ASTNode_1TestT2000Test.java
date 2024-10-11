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
	* Test method for {@link ASTNode#getTree(String)}.
	*/
	@Test
	public void getTreeTest() {
	ASTNode rootNode = null;
	ObjectInputStream oisr;
	FileInputStream fisr;
	try {
	  FileInputStream frstrm = new FileInputStream("testCaseName.txt");
        oisr = new ObjectInputStream(frstrm);
        rootNode = (ASTNode) oisr.readObject();
        oisr.close();
	} catch(IOException ie) {
        System.out.println("Error: " + ie.getMessage());
    }
	assertTrue(rootNode.getClass().equals(DefaultMutableTreeNode.class));
	}
}

