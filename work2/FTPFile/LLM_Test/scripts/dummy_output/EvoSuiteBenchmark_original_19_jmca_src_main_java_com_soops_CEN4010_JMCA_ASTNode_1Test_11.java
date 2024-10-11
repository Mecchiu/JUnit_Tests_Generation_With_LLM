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
		@Test
		void test() {
			try {
				ASTNode node = ASTNode.getTree("/tmp/root1/test1.xml");
				System.out.println("the  test  node is");
				assertEquals("the", node.getParent().getType());
				System.out.println(node.getType());
				try {
					assertNotNull(ASTNode.getTree(new File(node.getType()).toURI()));
				} catch(Exception e){
					assertEquals(node.getType(), e.toString());
				}
				try {
					assertNotNull(ASTNode.getTree(new InputStream(node.getType().getBytes("UTF8"))));
				} catch(Exception e){
					assertEquals(node.getType(), e.toString());
				}
				String file = node.getType();
				for(int i=0;i<2;i++) {
					try {
						assertNotNull(getTree(file));
					} catch(Exception e){
						assertEquals(e.toString(), "[File not found] for file ("+file+")");
					}
					file = file.substring(0,file.length()-2);
				}	
			} catch(Exception e){
				fail(e.toString());
			}
		}

	static class File {
			File(String pathname) {
			}
	}

}