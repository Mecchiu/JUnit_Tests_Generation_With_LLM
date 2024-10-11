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
		
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////
       @Test
      public void testClasses() throws Exception {
    	   
	   String inputFile = "tests/data/nodes/data.tree";
	   //Test
	   System.out.println("The input file " + inputFile + " was succesful");
	 //run
       ArrayList<ASTNode> ast = new ArrayList<ASTNode>();
       String content = loadFileAndProcess(inputFile,ast);
       ASTNode node = new ASTNode(content);
	   //validate
       DefaultMutableTreeNode node1 = new DefaultMutableTreeNode(node);
	   //run
        String expectedContent = 
			"<ASTNode\n"
			            + "\ttype=\"NODE\">\n"
			                + "  <Child></Child>\n"
			                + "\t<Child></Child>\n"
			                + "</ASTNode>\n"
			            + "The string \"NODE\" was succesful\n"
			            + "The string \"NODE\" was succesful\n"
			            + "The string \"NODE\" was succesful\n"
			            + "The string \"NODE\" was succesful\n"
			            + "The string \"NODE\" was succesful\n"
			            + "The string \"NODE\" was succesful\n"
			            + "The string \"NODE\" was succesful\n"
			            + "The string \"NODE\" was succesful\n"
			            + "The string \"NODE\" was succesful\n"
			           //
			           + "</ASTNode>";
	   String output = saveFileAndProcess(inputFile,node1);
	   //Test
	   System.out.println(output);
	  
        assertEquals("the string of the node \"NODE\" was succesful", expectedContent,output);
	}

    @Test
    public void testArray() throws Exception {
		String input = "tests/data/nodes/data.tree";
		ArrayList<ASTNode> ast = new ArrayList<ASTNode>();
		try {
		InputStream in = new FileInputStream(input);
		String content = readInputFile(in);
		String str1 = saveFileAndProcess(input, ast);
		String output = str1;

		assertEquals("the string of the node \"NODE\" was succesful", expectedContent, output);

		String content1 = str1.substring(str1.lastIndexOf("NODE"));
		str1 = "";
		in.close();
		String str2 = readInputFile(in);
		assertEquals("the string of the node \"NODE\" was succesful", expectedContent, output);

		assertEquals("the string of the node \"NODE\" was succesful\n", expectedContent,str2);

		String content2 = str2.replace("NODE","");
		String str3 = readInputFile(in);
		assertEquals("the string of the node \"NODE\" was succesful\n", expectedContent, output);

		assertEquals("the string of the node \"NODE\" was succesful\n", expectedContent,str3);

		str1 = str3.substring(0,str3.indexOf("NODE"));
		str2 = str3.substring(str3.indexOf("NODE"));
		assertEquals("the string of the node \"NODE\" was succesful\n", str1.replace("NODE",""), str2.replace("NODE",""));
		} catch (FileNotFoundException e) {
			throw new AssertionError();
		}
	}

    @Test
    public void testTree_childs() throws Exception {
		String input = "tests/data/nodes/data.tree";
		ArrayList<ASTNode> ast = new ArrayList<ASTNode>();
		String content = "tests/data/nodes/data.tree";
		String str1 = saveFileAndProcess(input, ast);
		String output = str1;

		assertEquals("the string of the node \"NODE\" was succesful", expectedContent, output);

		String content1 = str1.replace("NODE","");
		String str2 = readInputFile(new File(input));
		assertEquals("the string of the node \"NODE\" was succesful\n", expectedContent, output);

		assertEquals("the string of the node \"NODE\" was succesful\n", expectedContent, str2);

		String str3 = readInputFile(new File(input));
		assertEquals("the string of the node \"NODE\" was succesful\n", expectedContent, output);

		assertEquals("the string of the node \"NODE\" was succesful\n", expectedContent, str3.replace("NODE",""));

	}
	
	


	/**
	 * @param content
	 * @return boolean
	 */
	private boolean saveFileAndProcess(String content) {

	    OutputStream out = null;
}
}