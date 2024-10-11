// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {
		TestJniInchiStereo0DOfNonInchiquant_0_0Stereo1D_0Tetrahedral1D1_0

		{
			/**
	 * A non-Inchiquant atom of type tetrahedral.
	 */
			final JniInchiAtom testATC = new JniInchiAtom("1.5");
			/**
	 * A Tetrahedral atom of type tetrahedral.
	 */
			final JniInchiAtom testAT0 = new JniInchiAtom("2.5");
			/**
	 * A Tetrahedral atom of type tetrahedral.
	 */
			final JniInchiAtom testAT1 = new JniInchiAtom("1.75");
			/**
	 * A Tetrahedral atom of type tetrahedral.
	 */
			final JniInchiAtom testAT2 = new JniInchiAtom("2.75");

			/**
	 * An INCHIStereo0D instance.
	 */
			final JniInchiStereo0D ofNonInchiquant = new JniInchiStereo0DOfNonInchiquant_0_0Stereo1D_0Tetrahedral1D1_0(testATC, testAT0, testAT1, testAT2, INCHI_PARITY);

	}
}