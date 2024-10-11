// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#getTestMolecule()} method.
*/
class MainTest {

    /**
     * Test method for {@link Main#getTestMolecule()}.
     */
    @Test
    void testGetTestMolecule() {
        JniInchiStructure struct = Main.getTestMolecule();
        assertNotNull(struct);
        assertEquals(6, struct.getNumAtoms());
        assertEquals(5, struct.getNumBonds());
        assertEquals("InChI=1S/C4H5NO/c1-2-4(6)5-3-1/h1-3H2,(H,5,6)", struct.getInchi());
        assertEquals("InChI=1/C4H5NO/c1-2-4(6)5-3-1/h1-3H2,(H,5,6)", struct.getInchi("InChI"));
        assertEquals("InChI=1/C4H5NO/c1-2-4(6)5-3-1/h1-3H2,(H,5,6)", struct.getInchi("InChI=1/"));
        assertEquals("InChI=1/C4H5NO/c1-2-4(6)5-3-1/h1-3H2,(H,5,6)/f/h5H,6H2", struct.getInchi("InChI=1/charge"));
        assertEquals("InChI=1/C4H5NO/c1-2-4(6)5-3-1/h1-3H2,(H,5,6)/f/h5H,6H2/i/hD3", struct.getInchi("InChI=1/ReconnectedXYZ"));
        assertEquals("InChI=1/C4H5NO/c1-2-4(6)5-3-1/h1-3H2,(H,5,6)/f/h5H,6H2/i/hD3", struct.getInchi("InChI=1/ReconnectedXYZ/SPXYZ"));
        assertEquals("InChI=1/C4H5NO/c1-2-4(6)5-3-1/h1-3H2,(H,5,6)/f/h5H,6H2/i/hD3", struct.getInchi("InChI=1/ReconnectedXYZ/SPXYZ/Options"));
        assertEquals("InChI=1/C4H5NO/c1-2-4(6)5-3-1/h1-3H2,(H,5,6)/f/h5H,6H2/i/hD3", struct.getInchi("InChI=1/ReconnectedXYZ/SPXYZ/Options/ChiralFlag"));
    }
}