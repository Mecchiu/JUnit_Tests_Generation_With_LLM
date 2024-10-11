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
  Test of generating 0D stereo parities for DoubleBonds at both A=B and A=C.
  */
	@Test
	void generateNewDoublebondStereo0DNoAtom() {
		/* create new stereo 0D stereo 1 bonded to A=B */
		JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(JniInchiAtom.A, JniInchiAtom.A, JniInchiAtom.B, JniInchiAtom.B, INCHI_PARITY_EVEN);
		assertEquals(JniInchiStereo0D.A.getName(), stereo.A.getName());
		assertEquals(JniInchiStereo0D.B.getName(), stereo.B.getName());
		assertEquals(JniInchiStereo0D.A.getName(), stereo.C.getName());
		assertEquals(JniInchiStereo0D.B.getName(), stereo.A.getEndAtom().getAtomName());
		assertEquals(JniInchiStereo0D.A.getEndAtom().getAtomName(), stereo.B.getEndAtom().getAtomName());
		assertEquals(0, stereo.A.getEndAtom().getAtomCount());
		assertEquals(1, stereo.C.getEndAtom().getAtomCount());
		assertEquals("A=B", stereo.A.getStringAtom());
		assertEquals("C=A", stereo.C.getStringAtom());
	}
}