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
	     * constructor
	     */
	public ASTNode_2Test(){}
		/**
	     * test the createTree() method
	     */
	@Test
	void test_createTree(){
		String test = new String();
		String fileName = "ASTValue";
		try {
			ASTNode node;
			node = ASTNode.createTree();
			test = node.toString();
			System.out.println("test="+test);
		} catch (Throwable t) {
            fail(ErrorMsg.getMessage(t, ErrorMsg.CREATE_TAB, fileName, 
		    ""+test, "<empty>"));
		}
	}

		/**
		 * test the writeToFile() method
		 */
	@Test
	void test_writeToFile(){
		String test = new String();
		String fileName = "ASTValue";
		try {
			ASTNode node;
			node = ASTNode.createTree();
			node.setFileName(fileName);
			node.writeToFile();
		} catch (Throwable t) {
            fail(ErrorMsg.getMessage(t, ErrorMsg.WRITE_TO_FILE, fileName, 
		    ""+test, "<empty>"));
		}
	}

}