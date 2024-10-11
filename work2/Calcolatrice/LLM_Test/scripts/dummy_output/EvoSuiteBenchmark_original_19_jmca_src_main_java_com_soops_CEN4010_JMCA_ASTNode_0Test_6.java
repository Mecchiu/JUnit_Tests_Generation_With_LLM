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
		* create and display TestTree with the ASTNode
		* @throws Exception
		*/
        @Test
        public void test() throws Exception {
            ASTNode t = new ASTNode();
 
            assertEquals(null,t.getType());
            assertEquals(null,t.getIdentity());
 
            t.setType("root");
            t.addChild(new ASTNode("file1"));
 
            t.setType("file1");
            t.addChild(new ASTNode("file2"));

            assertEquals("file1",t.getType());
            assertEquals("file2",t.getType());
            t.setType(null);
            assertNull(t.getType());
            assertNull(t.getIdentity());
            t.setIdentity(new ASTNode("file3"));
            assertEquals("file3",t.getIdentity());
            ArrayList<ASTNode> tNodes = new ArrayList<ASTNode>();
            tNodes.add(0, new ASTNode("file3"));
            tNodes.add(1, new ASTNode("file4"));
            t.setIdentity(new ArrayList<ASTNode>(tNodes));
            assertEquals(new ArrayList<ASTNode>(),t.getIdentity());
            assertEquals("file3", t.getType());
            assertEquals(4,t.getChildren().size());
            t.setType("tree");
            assertNull(t.getType());
            t.addChild(new ASTNode("file2", null));
            assertEquals("file2",t.getType());
            assertNull(t.getIdentity());
            t.setIdentity(new ArrayList<ASTNode>());
            assertEquals(new ArrayList<ASTNode>(t.getChildren()),t.getIdentity());
            t.addChild(new ASTNode("file1", null));
            assertEquals("file1", t.getType());
            assertNull(t.getIdentity());
            t.setID("ID");
            assertEquals("ID", t.getID());
            assertNull(t.getType());
            assertEquals(0, t.getChildren().size());
            t.addChild(new ASTNode("file5", null));
            assertEquals("file5", t.getType());
            t.addChild(new ASTNode("file6", null));
            assertEquals("file6", t.getType());
            assertTrue(t.getChildren().equals(new ArrayList<ASTNode>(t.getChildren())));
            assertEquals(new ArrayList<ASTNode>(), t.getChildren());
            ArrayList<ASTNode> leftNodes = new ArrayList<ASTNode>();
            leftNodes.add(new ASTNode("file7"));
            ArrayList<ASTNode> rightNodes = new ArrayList<ASTNode>();
            t.setChildren(leftNodes);
            t.setChildren(rightNodes);
            ArrayList<ASTNode> tChildren = t.getChildren();
            assertEquals(3,tChildren.size());
            t.setChildren(tNodes.toArray(new ASTNode[tNodes.size()]));
            t.setChildren(new ArrayList<ASTNode>(tNodes));
            assertEquals(3, t.getChildren().size());
            ArrayList<ASTNode> tChildren2 = t.getChildren();
            assertEquals(3,tChildren2.size());
            t.setChildren(new ArrayList<ASTNode>());
            t.setChildren(new ArrayList<ASTNode>());
        }

        /**
         * create a tree with three ASTNode
         * @throws IOException
         */
        @Test
        public void testTree() throws IOException {
            Writer w = new OutputStreamWriter(System.out);
            File testTree = new File("TestTree.txt");
            PrintStream os = new PrintStream(w);
            OS.system("java -jar JMCA.jar -u com.soops.CEN4010.JMCA -p testTree &");
                try {
                    BufferedReader br = new BufferedReader (new InputStreamReader(new FileInputStream("TestTree.txt")));
                    String path = br.readLine();
                    while (true) {
                        ASTNode ast = ASTNode.getTree(path);
                        if(ast.toString().equals("")) {
                            break;
                        }
                        os.write(br.readLine());
                    }
                    if(path.charAt(path.length()-1) == '.') {
                        path = path.substring(0, ++path.length()-1);
                    }
                    br.close();
                    br = null;
                    os.close();
                    os = null;
                    w.close();
                    w = null;
                } catch(Exception ex) {
                    ex.printStackTrace();
                    w.close();
                    w = null;
                    throw ex;
                }
            w.close();
        }
}

// File_0Test.java