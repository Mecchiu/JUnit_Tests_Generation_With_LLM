// JniInchiStereo0DTest.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0DTest {

	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with a tetrahedral atom with four neighbours.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_FourNeighbours() {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);
		JniInchiAtom at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);
		JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);
		JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);
		JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);
		JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
		assertEquals(INCHI_PARITY.INCHI_PARITY_EVEN, stereo0D.getParity());
		assertEquals(INCHI_STEREOTYPE.INCHI_STEREOTYPE_TETRAHEDRAL, stereo0D.getStereoType());
		assertEquals(atC, stereo0D.getCentralAtom());
		assertEquals(at0, stereo0D.getNeighborAtom(0));
		assertEquals(at1, stereo0D.getNeighborAtom(1));
		assertEquals(at2, stereo0D.getNeighborAtom(2));
		assertEquals(at3, stereo0D.getNeighborAtom(3));
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with a tetrahedral atom with three neighbours.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_ThreeNeighbours() {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);
		JniInchiAtom at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);
		JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);
		JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);
		JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, null, INCHI_PARITY.INCHI_PARITY_EVEN);
		assertEquals(INCHI_PARITY.INCHI_PARITY_EVEN, stereo0D.getParity());
		assertEquals(INCHI_STEREOTYPE.INCHI_STEREOTYPE_TETRAHEDRAL, stereo0D.getStereoType());
		assertEquals(atC, stereo0D.getCentralAtom());
		assertEquals(at0, stereo0D.getNeighborAtom(0));
		assertEquals(at1, stereo0D.getNeighborAtom(1));
		assertEquals(at2, stereo0D.getNeighborAtom(2));
		assertNull(stereo0D.getNeighborAtom(3));
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with a tetrahedral atom with four neighbours and an odd parity.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_FourNeighbours_OddParity() {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);
		JniInchiAtom at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);
		JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);
		JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);
		JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);
		JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_ODD);
		assertEquals(INCHI_PARITY.INCHI_PARITY_ODD, stereo0D.getParity());
		assertEquals(INCHI_STEREOTYPE.INCHI_STEREOTYPE_TETRAHEDRAL, stereo0D.getStereoType());
		assertEquals(atC, stereo0D.getCentralAtom());
		assertEquals(at0, stereo0D.getNeighborAtom(0));
		assertEquals(at1, stereo0D.getNeighborAtom(1));
		assertEquals(at2, stereo0D.getNeighborAtom(2));
		assertEquals(at3, stereo0D.getNeighborAtom(3));
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with a tetrahedral atom with three neighbours and an odd parity.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_ThreeNeighbours_OddParity() {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);
		JniInchiAtom at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);
		JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);
		JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);
		JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, null, INCHI_PARITY.INCHI_PARITY_ODD);
		assertEquals(INCHI_PARITY.