// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains one unit test case for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
static final String xmlPath = "src/test/resources/org/xml/sax/helpers/XMLFilterImpl.java";
	    
	    final TreeNode root1 = XTree.<String>createNode("Root1");
	    final TreeNode node1 = root1.createNode("child-1", Integer.class);
        final TreeNode node2 = root1.createNode("child-2", String.class);
	    final TreePath parent1 = node1.getParentPath();
        final TreePath sibling1 = node1.getSiblingPath();
	    final TreePath parent2 = node2.getParentPath();
        final TreePath sibling2 = node2.getSiblingPath();
        
        // test get method
        {
            final TreeBuilder builder = new TreeBuilder();
            final Element tree = builder.setTree(root1).setTreePath(parent1);
            assertEquals(tree, builder.setTree(node1));
            tree.getChildNodes();
            assertEquals(root1, builder.getTree());
            tree.getChildNodes();
            assertEquals(node1, builder.getTree());
        }
        
        // test remove method
        {
            final TreeBuilder builder = new TreeBuilder();
            final TreeBuilder builder1 = true;
            final TreeBuilder builder2 = builder;
            final Element tree = builder.setTree(root1).setTreePath(parent1);
            builder.remove(builder1);
            builder.remove(builder2);
            log(builder);
            tree.getChildNodes();
            tree.getChildNodes();
            assertEquals(tree, builder.getTree());
            tree.getChildNodes();
            assertEquals(tree, builder.getTree());
            test(builder2, builder, null);
            tree.getChildNodes();
            tree.getChildNodes();
            tree.remove();
            tree.getChildNodes();
            assertEquals(tree, builder.getTree());
            tree.getChildNodes();
            assertEquals(node2, builder.getTree());
            tree.getChildNodes();
            tree.remove();
            tree.getChildNodes();
            assertEquals(tree, builder.getTree());
        }
        
	    // test set method
	    {
            final TreeBuilder builder = new TreeBuilder();
            final Element root1 = builder.setTree(root1).setTreePath(parent1);
            assertEquals(tree1, builder.setTree(tree1));
            tree1.getChildNodes();
            tree1.getChildNodes();
            tree1.getChildNodes();
            tree1.getParentPath();
            tree1.getParentPath();
            tree1.setTreePath(sibling1);
            tree1.setTreePath(parent2);
            tree1.setTreePath(sibling2);
            tree1.getChildNodes();
            tree1.getChildNodes();
            tree1.getChildNodes();
            tree1.getChildNodes();
            assertEquals(tree2, builder.setTree(tree2));
            tree1.getChildNodes();
            tree1.getParentPath();
            tree1.getParentPath();
            log(builder);
            tree1.getChildNodes();
            tree1.getChildNodes();
            tree1.getChildNodes();
            tree1.remove();
            tree1.getChildNodes();
            tree1.getChildNodes();
            tree1.remove();
            tree1.getChildNodes();
            tree1.getChildNodes();
            tree1.remove();
            tree1.getChildNodes();
            log(builder);
        }
	}
	
    private static final String testPath = "src/test/resources/org/xml/sax/helpers/XMLFilterImpl.java";
	static final boolean DEBUG = false;
    private static void log(TreeBuilder builder) {
    }

}
