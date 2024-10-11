// ASTNode_0Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains one unit test case for the {@link ASTNode#compareTo(Object)} method.
*/
class ASTNode_0Test {
		/**
		* constructor for the class
		*/
		public ASTNode_0Test() {
		}

		/**
		* Tests the <code>compareTo(Object)</code> method.
		*/
		@Test
		public void compareTo() {
				/**
		* for each different ASTNode
		*/

		ArrayList<ASTNode> list = new ArrayList<ASTNode>();

		/**
		* set the list of childrens recursively
		*/
		ASTNode temp;
		for (int listIndex = 0; listIndex < 10; listIndex++) {
			temp = new ASTNode(list.get(listIndex), "testName" + listIndex, null);
			list.add(temp);
		}
			for (int listIndex = 0; listIndex < list.size(); listIndex++) {
					/**
		* get the data of child
		*/
			ASTNode temp1 = list.get(listIndex);
			assertEquals(temp.compareTo(temp1.getData()), 0);

			/**
		* get the data of parent
		*/
			ASTNode temp2 = list.get(
                        listIndex - 1);
			assertEquals(temp.compareTo(temp2.getData()), 0);
		}

		/**
		* Test of {@link ASTNode#compareTo(Object)}.
		*/
}
}