// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {
		
    /**
     * Unit tests for {@link JniInchiStructure#getBond().
     */
    @Test
    public void getBond() {
    	List<Integer> list = new ArrayList<Integer>();
    	
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	
    	assertEquals(1, JniInchiStructure.getBond(list).getBond0().getA());
    	assertEquals(2, JniInchiStructure.getBond(list).getBond0().getA());
    	assertEquals(3, JniInchiStructure.getBond(list).getBond0().getA());
    	assertEquals(4, JniInchiStructure.getBond(list).getBond0().getA());

    	list.add(5);
    	list.add(6);
    	list.add(7);
    	list.add(8);
    	
    	assertEquals(1, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(2, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(3, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(4, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(5, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(6, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(7, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(8, JniInchiStructure.getBond(list).getBond2().getA());
    	
    	list.add(9);
    	list.add(10);
    	list.add(11);
    	list.add(12);
    	
    	assertEquals(1, JniInchiStructure.getBond(list).getBond21().getA());
    	assertEquals(2, JniInchiStructure.getBond(list).getBond21().getA());
    	assertEquals(3, JniInchiStructure.getBond(list).getBond21().getA());
    	assertEquals(4, JniInchiStructure.getBond(list).getBond21().getA());
    	assertEquals(5, JniInchiStructure.getBond(list).getBond21().getA());
    	assertEquals(6, JniInchiStructure.getBond(list).getBond21().getA());
    	assertEquals(7, JniInchiStructure.getBond(list).getBond21().getA());
    	assertEquals(8, JniInchiStructure.getBond(list).getBond21().getA());
    	
    	
    	JniInchiStructure.addBond(list, 2, 10, "AA", 3);
    	
    	assertNotNull(list);
    	assertEquals(2, list.size());
    	assertEquals(10, JniInchiStructure.getBond(list).getBond0().getBond1().getA());
    	assertEquals(2, JniInchiStructure.getBond(list).getBond0().getA());
    	assertEquals(3, JniInchiStructure.getBond(list).getBond0().getBond2().getA());
    	
    	list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(8);
    	
    	list.add(9);
    	
    	assertEquals(1, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(2, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(3, JniInchiStructure.getBond(list).getBond2().getBond1().getA());
    	
    	list = new ArrayList<Integer>();
    	list.add(2);
    	list.add(10);
    	
    	list.add(3);
    	
    	assertNotNull(list);
    	list.add(5);
    	
    	assertEquals(2, JniInchiStructure.getBond(list).getBond2().getA());
    	assertEquals(3, JniInchiStructure.getBond(list).getBond2().getBond1().getA());
    };
}
