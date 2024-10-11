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
		* This testcase is executed when the test case is run.
		*/
		@Test
		public void test() throws Exception {
		
			String[] strings;
			ArrayList<String> list;
			
			list = new ArrayList<>();
			for (int num = 0; num < 10; ++num) {
				
				list.add(_("string.1"));
				list.add(_("string.1"));
				list.add(_("string.2"));
				list.add(_("string.2"));
				list.add(_("string.3"));
				list.add(_("string.3"));
				list.add(_("string.4"));
				list.add(_("string.4"));
				list.add(_("string.5"));
				list.add(_("string.5"));
				list.add(_("string.6"));
				list.add(_("string.6"));
				list.add(_("string.7"));
				list.add(_("string.7"));
				list.add(_("string.8"));
				list.add(_("string.8"));
				list.add(_("string.9"));
			}
			strings = list.toArray(new String[list.size()]);
			int[] array;
			array = list.toArray(new int[num]);
			DefaultMutableTreeNode node = createTree();
			for(int i = 0; i< 10; i++) {
			if(i >= 0)
				node.add(i, new ASTNode());
			}
		}
}