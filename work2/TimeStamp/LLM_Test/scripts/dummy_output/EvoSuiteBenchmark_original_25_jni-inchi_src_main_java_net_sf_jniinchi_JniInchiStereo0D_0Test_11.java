// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {
		
	@Test
	void shouldCreateTetrahedralStereo0D() {
		
		// when
		final JniInchiStereo0D input0 =
				JniInchiStereo0D.createNewTetrahedralStereo0D(JniInchiAtom.ATOM_A, JniInchiAtom.ATOM_O, JniInchiAtom.ATOM_O, JniInchiAtom.ATOM_O, JniInchiAtom.ATOM_O, INCHI_PARITY.INCHI_PARITY_EVEN);
		
		// then
		assertEquals(input0.atomParity, INCHI_PARITY.INCHI_PARITY_EVEN);
	}



	/**
	* Test case with a unit test.
	* @param atC Central atom
	* @param at2 Neighbor atom 2
	* @param at3 Neighbor atom 3
	* @param parity Parity
	*/
	public void shouldCreateTetrahedralStereo0D(final JniInchiAtom atC, final JniInchiAtom at2,
				                                final JniInchiAtom at3, final INCHI_PARITY parity) {
				
		// given
		final JniInchiStereo0D input0 =
				JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at2, at3, at2, at3, parity);

		// when
		final JniInchiStereo0D result =
				JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at2, at2, atC, at2, parity);

		// then
		assertEquals(result.atomParity, parity);
		assertEquals(result.atomParity, input0.atomParity);
	}

}