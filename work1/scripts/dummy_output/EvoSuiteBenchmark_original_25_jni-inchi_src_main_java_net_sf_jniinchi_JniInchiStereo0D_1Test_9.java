// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
		ArrayList<JniInchiAtom> atoms;
		ArrayList<JniInchiAtom> atoms_1;

	/**
	* @throws java.lang.AssertionError
	* If failed.
	*/
	@Test
	void testCreateNewDoublebondStereo0D() {
			// Check that the result, which we construct via
			// {@link #createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
			assertNotNull(createNewDoublebondStereo0D(atoms_1.get(0), at2, at1, null, INCHI_PARITY_EVEN));

			assertNotNull(createNewDoublebondStereo0D(atoms_1.get(1), at3, at2, null, INCHI_PARITY_ODD));

			assertNotNull(createNewDoublebondStereo0D(atoms.get(0), at3, at1, at2, INCHI_PARITY_ODD));

			assertNull(createNewDoublebondStereo0D(atoms.get(2), at3, at1, at2, null));

			// Check that it is NULL with 'null' neighbour
			assertNull(createNewDoublebondStereo0D(atoms.get(4), at3, at1, at2, null));
	}

	/**
	* @throws java.lang.AssertionError
	* If failed.
	*/
	@Test
	void testParize() {
			// Check that the result, which we construct via
			// {@link #parity(JniInchiStereoParity)}
			assertEquals(INCHI_PARITY_EVEN, parity(JniInchiStereoParity.EVEN));

			assertEquals(INCHI_PARITY_ODD,  parity(JniInchiStereoParity.ODD));

			// Check that it is NULL with 'null' neighbour
			assertNull(parity(JniInchiStereoParity.NULL));
	}

	/**
	* @throws java.lang.AssertionError
	* If failed.
	*/
	@Test
	void testUnrecognizeParity() {
			// Check that it is NULL with 'null' neighbour
			assertNull(parity(JniInchiStereoParity.NULL));
	}

	/**
	* @throws java.lang.AssertionError
	* If failed.
	*/
	@Test
	void testToString() {
		// Check that the result, which we construct via
		// {@link #toString()}
		assertEquals("double bond stereo Parity X (4)",JniInchiStereo0D.createNewDoublebondStereo0D(atoms_1.get(1), at2, atoms_1.get(3), null, INCHI_PARITY_ODD).toString());
	}
}