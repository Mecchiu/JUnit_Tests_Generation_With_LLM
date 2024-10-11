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
// ASTNode.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTNode implements Comparable, java.io.Serializable {

    /**
     * implements Comparable
     *
     * @param node Object
     * @return int values 0 for same and 1 for different
     */
    public int compareTo(Object node) {
        if (!type.equals(((ASTNode) node).getType()) ||!identity.equals(((ASTNode) node).getIdentity())) {
            return 1;
        }
        for (int i = 0; i < list.size(); ++i) {
            try {
                if (list.get(i).compareTo(((ASTNode) node).list.get(i)) == 1) {
                    return 1;
                }
            } catch (IndexOutOfBoundsException ne) {
                return 1;
            } catch (NullPointerException np) {
                return 1;
            }
        }
        return 0;
    }
}

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
     * This is a test of the {@link ASTNode#compareTo(Object)} method.
     * The test contains one test case for each {@link ASTNode#compareTo(Object) compareTo(Object)} method.
     */
    @Test
    public void testCompareTo() {
        for (int i = 0; i < 2; ++i) {
            ASTNode node1 = null;
            ASTNode node2 = null;
            final ArrayList<ASTNode> list1 = new ArrayList();
            final ArrayList<Integer> list2 = new ArrayList();
            for (int j = 0; j < 10; ++j) {
                try {
                    node1 = new ASTNode() {
                        public void write(DataOutput dataOutput) throws IOException {
                            dataOutput.write("test" + j);

                        }
                    };
                    int n = Integer.parseInt(node1.identity);
                    node2 = new ASTNode() {
                        public void write(DataOutput dataOutput) throws IOException {
                            dataOutput.writeInt(n);

                        }
                    };
                    list1.add(node1);
                    list2.add(node2);
                } catch (NumberFormatException e) {
                    continue;
                }
            }
            TreePath path = new TreePath((TreeNode) node1, (TreeNode) node2);
            assertEquals(list1.size(), list2.size());
            assertTrue(list1.equals(list2));
            for (int j = 0; j < list1.size(); ++j) {
                assertTrue(path.equals(list1.get(j).path));
            }
        }
    }
}