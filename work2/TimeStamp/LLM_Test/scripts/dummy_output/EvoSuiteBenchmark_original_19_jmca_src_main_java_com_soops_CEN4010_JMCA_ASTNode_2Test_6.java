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
		
	//Test constructor
	public ASTNode_2Test() {
	}
	
	//Test methods
	@Test
    public void test() {
        //Create Node a parent
        ASTNode tmp = new ASTNode(null, null, null);
        assertTrue(tmp.getClass() == ASTNode.class);
        assertNotNull(tmp);
        assertFalse(tmp.toString().equals(""));
        
        //Get data
        ASTNode node1 = null;
        ASTNode node2 = null;
        ASTNode node3 = null;
        ASTVar node4 = new ASTVar(null, null, null);
        ASTVar node5 = new ASTVar(null, null, null);
        ASTVar node6 = new ASTVar(null, null, null);
        ASTVar node7 = new ASTVar(null, null, null);
        ASTVar node8 = new ASTVar(null, null, null);
        ASTVar node9 = new ASTVar(null, null, null);
        ASTVar node10 = new ASTVar(null, null, null);
        ASTVar node11 = new ASTVar(null, null, null);
        ASTVar node12 = new ASTVar(null, null, null);
        ASTVar node13 = new ASTVar(null, null, null);
        ASTVar node14 = new ASTVar(null, null, null);
        ASTVar node15 = new ASTVar(null, null, null);
        ASTVar node16 = new ASTVar(null, null, null);
        ASTVar node17 = new ASTVar(null, null, null);
        ASTVar node18 = new ASTVar(null, null, null);
        ASTVar node19 = new ASTVar(null, null, null);
        ASTVar node20 = new ASTVar(null, null, null);
        ASTVar node21 = new ASTVar(null, null, null);
        ASTVar node22 = new ASTVar(null, null, null);
        ASTVar node23 = new ASTVar(null, null, null);
        ASTVar node24 = new ASTVar(null, null, null);
        ASTVar node25 = new ASTVar(null, null, null);
        ASTVar node26 = new ASTVar(null, null, null);
        ASTVar node27 = new ASTVar(null, null, null);
        ASTVar node28 = new ASTVar(null, null, null);
        ASTVar node29 = new ASTVar(null, null, null);
        ASTVar node30 = new ASTVar(null, null, null);
        
        //Creat and set child nodes
        tmp = null;
        ASTVar tmp0 = null;
        ASTVar tmp1 = null;
        ASTVar tmp2 = null;
        ASTVar tmp3 = null;
        ASTVar tmp4 = null;
        ASTVar tmp5 = null;
        ASTVar tmp6 = null;
        ASTVar tmp7 = null;
        ASTVar tmp8 = null;
        ASTVar tmp9 = null;
        ASTVar tmp10 = null;
        ASTVar tmp11 = null;
        ASTVar tmp12 = null;
        ASTVar tmp13 = null;
        ASTVar tmp14 = null;
        ASTVar tmp15 = null;
        ASTVar tmp16 = null;
        ASTVar tmp17 = null;
        ASTVar tmp18 = null;
        ASTVar tmp19 = null;
        ASTVar tmp20 = null;
        ASTVar tmp21 = null;
        ASTVar tmp22 = null;
        ASTVar tmp23 = null;
        ASTVar tmp24 = null;
        ASTVar tmp25 = null;
        ASTVar tmp26 = null;
        ASTVar tmp27 = null;
        ASTVar tmp28 = null;
        ASTVar tmp29 = null;
        ASTVar tmp30 = null;
        ASTNode tmp_t;
        
        //Create children
        tmp_t = new ASTVar(null, null, new ASTVar(null, null, null));
        tmp0 = new ASTVar(null, null);
        tmp1 = new ASTVar(null, 0);
        tmp2 = new ASTVar(null, 0);
        tmp3 = new ASTVar(null, 0);
        tmp4 = new ASTVar(null, 0);
        tmp5 = new ASTVar(null, 0);
        tmp6 = new ASTVar(null, 0);
        tmp7 = new ASTVar(null, 0);
        tmp8 = new ASTVar(null, 0);
        tmp9 = new ASTVar(null, 0);
        tmp10 = new ASTVar(null, 0);
        tmp11 = new ASTVar(null, 0);
        tmp12 = new ASTVar(null, 0);
        tmp13 = new ASTVar(null, 0);
        tmp14 = new ASTVar(null, 0);
        tmp15 = new ASTVar(null, 0);
        tmp16 = new ASTVar(null, 0);
        tmp17 = new ASTVar(null, 0);
}
}