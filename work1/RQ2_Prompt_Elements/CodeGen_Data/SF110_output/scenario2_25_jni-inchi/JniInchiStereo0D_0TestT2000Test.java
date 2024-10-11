// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {

	/**
	 * Test method for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}.
	 */
	@Test void test_JniInchiStereo0D_0() {
		
		// create the stereo for testing
		JniInchiStereo0D stereo = new JniInchiStereo0D(JniInchiAtom.XY, JniInchiAtom.YZ, JniInchiAtom.ZW, JniInchiAtom.XZ, JniInchiAtom.YX, INCHI_STEREOTYP_TRAPEZOIDAL, INCHI_PARITY.EVEN);
		stereo.createNewTetrahedralStereo0D();
		
		// check output parities
		assertEquals(INCHI_PARITY_EVEN, stereo.getParity());
	}
	
}