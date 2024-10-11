// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
		
	/** Test for INCHI_PARITY_ODD
	 *
	 * Created:    4.12.2016
	 * Last modification: 2.1.2020
	 * @throws java.lang.RuntimeException 
	 */
	@Test
	public void case1_1_ParityE() throws RuntimeException {
	
		JniInchiStereo0D stereo0D = createNewDoublebondStereo0D(JniInchiAtom.X, JniInchiAtom.Q, JniInchiAtom.Z, JniInchiAtom.A, INCHI_PARITY_ODD);
		assertEquals(stereo0D.getInchiAtoms()[3], JniInchiUtils.getX(stereo0D.getInchiAtoms()[0]));
		assertEquals(stereo0D.getInchiAtoms()[4], JniInchiUtils.getY(stereo0D.getInchiAtoms()[0]));
		
	}
	
	/**
	 * Test for INCHI_PARITY_ODD
	 *
	 * Created:    4.12.2016
	 * Last modification: 2.1.2020
	 * @throws java.lang.RuntimeException 
	 */
	@Test
	public void case1_1_ParityO() throws RuntimeException {
	
		JniInchiStereo0D stereo0D = createNewDoublebondStereo0D(JniInchiAtom.Q, JniInchiAtom.O,  JniInchiAtom.T, JniInchiAtom.A, INCHI_PARITY_ODD);
		assertEquals(stereo0D.getInchiAtoms()[3], JniInchiUtils.getX(stereo0D.getInchiAtoms()[0]));
		assertEquals(stereo0D.getInchiAtoms()[4], JniInchiUtils.getY(stereo0D.getInchiAtoms()[0]));
		
	}
	
	/**
	 * Test for INCHI_PARITY_EVEN
	 *
	 * Created:    4.12.2016
	 * Last modification: 2.1.2020
	 * @throws java.lang.RuntimeException 
	 */
	@Test
	public void case1_1_ParityE() throws RuntimeException {
	
		JniInchiStereo0D stereo0D = createNewDoublebondStereo0D(JniInchiAtom.X, JniInchiAtom.X,  JniInchiAtom.Q, JniInchiAtom.A, INCHI_PARITY_EVEN);
		assertEquals(stereo0D.getInchiAtoms()[3], JniInchiUtils.getX(stereo0D.getInchiAtoms()[0]));
		assertEquals(stereo0D.getInchiAtoms()[4], JniInchiUtils.getY(stereo0D.getInchiAtoms()[0]));
		
	}
	
	/**
	 * Test for UNKNOWN parity
	 *
	 * Created:    4.12.2016
	 * Last modification: 2.1.2020
	 * @throws java.lang.RuntimeException 
	 */
	@Test
	public void case1_1_ParityUI() throws RuntimeException {
	
		JniInchiStereo0D stereo0D = createNewDoublebondStereo0D(JniInchiAtom.X, JniInchiAtom.T,  JniInchiAtom.T, JniInchiAtom.Q, INCHI_PARITY_EVEN);
		assertNull(stereo0D.getInchiAtoms()[3]);
		assertNull(stereo0D.getInchiAtoms()[4]);
		
	}

	/* End of test cases */
}