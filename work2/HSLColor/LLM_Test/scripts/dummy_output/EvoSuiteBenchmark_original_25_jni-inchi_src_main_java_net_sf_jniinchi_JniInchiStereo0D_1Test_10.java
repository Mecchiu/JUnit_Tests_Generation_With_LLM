// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
		/**
		 * Tests creation of a DoubleBond stereo 0D with a central atom.
		 * The stereo is used at both sides of each bond and the
		 * stereo does not form a circular bond.
		 */
    @Test
    void stereo0DTest() {
        assertFalse(JniInchiStereo0D.createNewDoublebondStereo0D(null, null, null, null, INCHI_PARITY_MASS));
    }
}