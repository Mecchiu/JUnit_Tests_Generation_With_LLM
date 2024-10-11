java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JniInchiStructure_2Test {

    @Test
    void testAddStereo0D() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiStereo0D stereo1 = new JniInchiStereo0D();
        JniInchiStereo0D stereo2 = new JniInchiStereo0D();

        assertEquals(0, structure.getNumStereo0D());

        structure.addStereo0D(stereo1);
        assertEquals(1, structure.getNumStereo0D());
        assertEquals(stereo1, structure.getStereo0D(0));

        structure.addStereo0D(stereo2);
        assertEquals(2, structure.getNumStereo0D());
        assertEquals(stereo2, structure.getStereo0D(1));
    }

    // Add more test cases here

}
