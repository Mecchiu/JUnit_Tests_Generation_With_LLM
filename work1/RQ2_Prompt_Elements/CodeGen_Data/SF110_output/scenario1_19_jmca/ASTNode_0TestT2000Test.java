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
		ArrayList<ArrayList<String>> lista = new ArrayList<ArrayList<String>>();
	
	/**
	 * Test method for {@link com.soops.CEN4010.JMCA.ASTPNode#ASTPNode(java.lang.String[], int)}.
	 */
	@Test
	public void testASTPNode_1() {
		byte[][] b = new byte[][] {
				{(byte) 0x09, (byte) 0xC0},
				{(byte) 0x09, (byte) 0xD0},
				{(byte) 0x09, (byte) 0xE0},
				{(byte) 0x09, (byte) 0xF0},
				{(byte) 0x09, (byte) 0x0F}
		};		

		String[] e = new String[]{"Hello World", "Hello World"};

		String r = "Hello World";
		ArrayList<String> l = new ArrayList<String>();
		
		for (int i = 0; i < e.length; ++i) {
			l.add(e[i]);
		}
		
        // Create an actual node for the test.
        ASTPNode a = new ASTPFNTestNode(b, l.size());

        // Compare the actual AST node.
        assertEquals(r, a.compareTo(r));
	}

	/**
	 * Test method for {@link com.soops.CEN4010.JMCA.ASTPNode#ASTPNode(java.lang.String[], int, java.util.List)}.
	 */
	@Test
	public void testASTPNode_2() throws IOException {
		byte[] b = new byte[][] {
				{(byte) 0x09, (byte) 0xC0},
				{(byte) 0x09, (byte) 0xD0},
				{(byte) 0x09, (byte) 0xE0},
				{(byte) 0x09, (byte) 0xF0},
				{(byte) 0x09, (byte) 0x0F}
		};

		String[] e = new String[]{"Hello World", "Hello World"};
		ArrayList<String> l = new ArrayList<String>();

		for (int i = 0; i < e.length; ++i) {
			l.add(e[i]);
		}

        // Create an actual node for the test.
        ASTPNode a = new ASTPFNTestNode(b, l.size(), new ArrayList<String>(), null);
        
        // Compare the actual AST node.
        assertEquals(e[0], a.compareTo(e[0]));

	}
	
	@Test
	public void testASTPNode_3() throws IOException {
		String[] e = new String[]{"Hello World", "Hello World"};

		// Create an actual node for the test.
		ASTPNode a = new ASTPFNTestNode(new byte[][]{new byte[] { 0x09, (byte) 0xC0 }}, 1);

        // Compare the actual AST node.
        assertEquals(e[0], a.compareTo(e[0]));

    }

	@Test
	public void testCompareTo() throws Exception {
//		InputStream in = new ByteArrayInputStream(lista.get(0));
//		Document d = JDOMUtil.parse(in);
//		System.out.println(d);
		
		
		
		try {
			ASTPNode a = new ASTFNTestNode();
			ASTPNode b = new ASTFNTestNode("list1.txt", new ArrayList<String>(), new ArrayList<String>());
		} catch (Exception e) {
			System.err.println(e);
			fail("cannot convert to ASTP");
		}
	}
	
	@Test
	public void testASTPNode() throws IOException {
		String[] e = new String[]{"Hello World", "Hello World"};
		
		// Create an actual node for the test.
		ASTPNode a = new ASTFNTestNode(new byte[][]{new byte[] { 0x09, (byte) 0xC0 }}, 1);
		
        // Compare the actual AST node.
        assertEquals(e[0], a.compareTo(e[0]));
		
	}
}
