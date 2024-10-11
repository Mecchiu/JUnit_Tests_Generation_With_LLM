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
		
    @Test
    public void test() throws Exception {
    	
        // create structure
        final JniInchiStructure structure = new JniInchiStructure();
        
        // create a list of bonds to search in
        final List<JniInchiStructure.JniInchiBond> bonds = new ArrayList<JniInchiStructure.JniInchiBond>();
        bonds.add(structure.getBond(0));
        bonds.add(structure.getBond(1));
        
        // test searching
        assertEquals(structure.getBond(3), structure.getBond(bonds));
        
        assertNotNull(bonds.get(0).getChain());
        assertNotNull(bonds.get(1).getChain());
        
    }

}