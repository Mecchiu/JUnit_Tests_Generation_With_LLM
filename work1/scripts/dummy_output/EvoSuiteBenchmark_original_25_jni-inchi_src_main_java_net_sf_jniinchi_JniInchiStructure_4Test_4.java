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
		
 //------------------------------------------------------------------------------
//  Test cases 
//------------------------------------------------------------------------------
    /**
     * Test method for {@link JniInchiStructure#getBond(int)}.
     */
    @Test
        public void testGetBond() {
        assertEquals(null, getBond(null));
        assertEquals(null, getBond(1));
        assertEquals(null, getBond(2));
    }

    /**
     * Test method for {@link JniInchiStructure#getBonds()}.
     */
    @Test
        public void testGetBonds() {
        final List<JniInchiBond> bonds = new ArrayList<JniInchiBond>();
        bonds.add(new JniInchiBond("R3"));
        bonds.add(new JniInchiBond("R2"));
        bonds.add(new JniInchiBond("N3"));
        bonds.add(new JniInchiBond("H4"));
        bonds.add(new JniInchiBond("O3"));
        bonds.add(new JniInchiBond("O2"));
        final List<JniInchiBond> res = getBonds(bonds);
        assertEquals("[]", res.toString());
        System.out.println(res);
	}
}