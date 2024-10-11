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
		* Test method for {@link net.sf.jniinchi.JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}.
		*/
    @Test
    void testCreateNewDoublebondStereo0D() {
        final JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(
                JniInchiAtom.getFromChaine(1),
                JniInchiAtom.getFromChaine(1),
                JniInchiAtom.getFromChaine(1),
                JniInchiAtom.getFromChaine(1),
                JniInchiStereoType_DoubleBond
        );

        assertTrue("Incorrect number of stereo", stereo0D.getParity() == JniInchiStereoType_DoubleBond);
        assertTrue("Incorrect parity", stereo0D.getCoefficients().size() == 4);
    }
}