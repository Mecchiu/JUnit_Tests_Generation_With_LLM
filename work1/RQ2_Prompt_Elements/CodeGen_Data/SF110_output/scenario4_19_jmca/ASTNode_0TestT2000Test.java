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
     * constructor
     */
    public ASTNode_0Test() {
    }

    /**
     * Default Constructor
     * @param p ArrayList
     */
    public ASTNode_0Test(ArrayList p) {

    }

    /**
     * Compare two nodes using a comparator.
     * @param node1 Object
     * @param node2 Object
     * @return int values 0 for same and 1 for different
     */
    @Test
    public int compareTo(Object node1, Object node2) {

        ASTNode a1 = (ASTNode) node1, a2 = (ASTNode) node2;
        int result = (int) (type.compareTo(a1.getType().toString()));
        if (result==0) {
            result = (parent.getIdentity().compareTo(a1.getIdentity().toString()));
        }
        return result;
    }

    /**
     * Test that the default constructor exists
     */
    @Test
    public void defaultConstructorExists() {

        assertNotNull("type must not be null", type);
    }

    /**
     * check the data
     */
    @Test
    public void checkTree() throws Exception{
            assertNotNull("the input to the test is null", getTree());
    }

    /**
     * check the data with a tree structure
     * @param testFile String
     */
    public void checkTree(String testFile) throws Exception {
            int result = 0;
            BufferedReader buff = new BufferedReader(new InputStreamReader(
                                new FileInputStream(testFile), 
                                "UTF-8"));
            String line="";
            // create a new tree
            Tree st = new Tree(buff);
            String[] data = {"TestData"};
            String rootName = new String();
            st.addChild(new ASTNode(new ASTNode(data), rootName));
            String child;
            while ((line = buff.readLine())!= null) {
                if (line.startsWith("The data ")) {
                    continue;
                }
                child = line.substring("The data ".length() - 1);
                try {
                    result = Integer.parseInt(child);
                } catch (Exception ignored) {
                }
                assertEquals("Tree should be an equal object", data.length, result);
                st.addChild(new ASTNode(data, line.substring(0, line.length() - 1)));
            }
            // test
            ((DefaultMutableTreeNode) getTree().getRoot()).expandAll();
            buff.close();
            test(testFile);
            buff.close();
    }

    /**
     * Check the data
     * @param testFile String
     */
    public void test(String fileName) throws Exception{
            loadData(fileName);
        // check
        checkTree();
        // and test
        try {
            test(fileName);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    /**
     * loads the tree data from the file
     * @param testFile String
     */
    private void loadData(String testFile){
            BufferedReader buff = new BufferedReader(new InputStreamReader(
                                new FileInputStream(testFile), 
                                "UTF-8"));
            String line="";
            StringBuilder file = new StringBuilder();
            while ((line = buff.readLine())!= null) {
                 file.append(line);
                 file.append("\n");
            }
            buff.close();

            String[] data = file.toString().split("\n");
            DefaultMutableTreeNode firstRoot = null;

            for (int l = 0; l < data.length; l++) {
                ArrayList list = new ArrayList();
                StringTokenizer st = new StringTokenizer(data[l], "-");
                while (st.hasMoreTokens()) {
                    st.nextToken().trim();
                    list.add(st.nextToken());
                }
                DefaultMutableTreeNode root = (DefaultMutableTreeNode) createTree().getRoot();
                root.add(new ASTNode(list, data[l]));
                if (firstRoot == null) {
                    firstRoot = root;
                } else {
                    DefaultMutableTreeNode parent = firstRoot;
                    while (parent.getChildCount() > 0) {
                        parent = (DefaultMutableTreeNode) parent.getChildAt(0);
                    }
                    parent.add(new DefaultMutableTreeNode(new ASTNode(list, data[l])));
                    firstRoot = parent;
                }
            }
            // and test
            test(testFile);
    } 
}
