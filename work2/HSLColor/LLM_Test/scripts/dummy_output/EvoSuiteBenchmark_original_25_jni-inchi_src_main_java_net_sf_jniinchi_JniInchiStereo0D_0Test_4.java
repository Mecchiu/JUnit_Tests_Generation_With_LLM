// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {
		
	private final JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(JniInchiAtom.createNewTetrahedral(), JniInchiAtom.createNewTetrahedral(), JniInchiAtom.createNewTetrahedral(), JniInchiAtom.createNewTetrahedral(), parity);

	@Test
	void testParityFromTetrahedral() {
		assertEquals("Stereo type should be tetrahedral", JniInchiStereo0D.INCHI_STEROTYPES["tetrahedral"], stereo0D.type);
		assertEquals(JniInchiStereo0D.INCHI_PARITYEVEN, stereo0D.polarity);
	}

	@Test
	void testParityFromEvenTetrahedral() {
		assertEquals("Stereo type should be even", JniInchiStereo0D.INCHI_STEROTYPES["even"], stereo0D.type);
		assertEquals(JniInchiStereo0D.INCHI_PARITYODD, stereo0D.polarity);
	}

	@Test
	void testParityFromOddTetrahedral() {
		assertEquals("Stereo type should be odd", JniInchiStereo0D.INCHI_STEROTYPES["odd"], stereo0D.type);
		assertEquals(JniInchiStereo0D.INCHI_PARITYEVEN, stereo0D.polarity);
	}
}