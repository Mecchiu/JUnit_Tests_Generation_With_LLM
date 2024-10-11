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
		private ASTNode node = new ASTNode();
		private DefaultMutableTreeNode tree = node.createTree();
		private String filename = "tree.txt";

		@Test
		void  testWrite() throws IOException {
				node.toString();
				FileOutputStream fo = new FileOutputStream(filename);
				node.dump(fo);
				fo.close();
		}

		@Test
		void testRead() throws IOException, ClassNotFoundException {
			String text = "<tree>\n" + "0123456789012345678901234567\n</tree>";
			PrintWriter writer = new PrintWriter(new FileWriter(filename, false));
			node.newLine();
			while(true) {
				int i = 0;
				ASTNode newnode = node.read(writer);
				while(newnode instanceof ASTNode) {
						newnode = node.read(writer);
				}
				assertTrue("Tree root",  tree instanceof DefaultMutableTreeNode);
				if (newnode == null) {
					break;
				}
				i++;
			}
			writer.close();
		}
	}