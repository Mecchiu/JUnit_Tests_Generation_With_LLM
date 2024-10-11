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
	 * Test case 1 for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * 
	 * <p>Test case 1 tests the method with the following parameters:
	 * <ul>
	 * <li>atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);</li>
	 * <li>at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);</li>
	 * <li>at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);</li>
	 * <li>at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);</li>
	 * <li>at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);</li>
	 * <li>parity = INCHI_PARITY.EVEN;</li>
	 * </ul>
	 * </p>
	 * 
	 * <p>The expected result is that the method returns a new JniInchiStereo0D object with the following properties:
	 * <ul>
	 * <li>central_atom = atC;</li>
	 * <li>neighbor[0] = at0;</li>
	 * <li>neighbor[1] = at1;</li>
	 * <li>neighbor[2] = at2;</li>
	 * <li>neighbor[3] = at3;</li>
	 * <li>type = INCHI_STEREOTYPE.TETRAHEDRAL;</li>
	 * <li>parity = INCHI_PARITY.EVEN;</li>
	 * </ul>
	 * </p>
	 */
	@Test
	void testCase1() {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);
		JniInchiAtom at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);
		JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);
		JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);
		JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);
		INCHI_PARITY parity = INCHI_PARITY.EVEN;
		JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, parity);
		assertEquals(atC, stereo.central_atom);
		assertEquals(at0, stereo.neighbor[0]);
		assertEquals(at1, stereo.neighbor[1]);
		assertEquals(at2, stereo.neighbor[2]);
		assertEquals(at3, stereo.neighbor[3]);
		assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.type);
		assertEquals(INCHI_PARITY.EVEN, stereo.parity);
	}
	
	/**
	 * Test case 2 for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * 
	 * <p>Test case 2 tests the method with the following parameters:
	 * <ul>
	 * <li>atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);</li>
	 * <li>at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);</li>
	 * <li>at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);</li>
	 * <li>at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);</li>
	 * <li>at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);</li>
	 * <li>parity = INCHI_PARITY.ODD;</li>
	 * </ul>
	 * </p>
	 * 
	 * <p>The expected result is that the method returns a new JniInchiStereo0D object with the following properties:
	 * <ul>
	 * <li>central_atom = atC;</li>
	 * <li>neighbor[0] = at0;</li>
	 * <li>neighbor[1] = at1;</li>
	 * <li>neighbor[2] = at2;</li>
	 * <li>neighbor[3] = at3;</li>
	 * <li>type = INCHI_STEREOTYPE.TETRAHEDRAL;</li>
	 * <li>parity = INCHI_PARITY.ODD;</li>
	 * </ul>
	 * </p>
	 */
	@Test
	void testCase2() {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);
		JniInchiAtom at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);
		JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);
		JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);
		JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);
		INCHI_PARITY parity = INCHI_PARITY.ODD;
		JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, parity);
		assertEquals(atC, stereo.central_atom);
		assertEquals(at0, stereo.neighbor[0]);
		assertEquals(at1, stereo.neighbor[1]);
		assertEquals(at2, stereo.neighbor[2]);
		assertEquals(at3, stereo.neighbor[3]);
		assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.type);
		assertEquals(INCHI_PARITY.ODD, stereo.parity);
	}
	
	/**
	 * Test case 3 for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * 
	 * <p>Test case 3 tests the method with the following parameters:
	 * <ul>
	 * <li>atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);</li>
	 * <li>at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);</li>
	 * <li>at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);</li>
	 * <li>at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);</li>
	 * <li>at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);</li>
	 * <li>parity = INCHI_PARITY.UNKNOWN;</li>
	 * </ul>
	 * </p>
	 * 
	 * <p>The expected result is that the method returns a new JniInchiStereo0D object with the following properties:
	 * <ul>
	 * <li>central_atom = atC;</li>
	 * <li>neighbor[0] = at0;</li>
	 * <li>neighbor[1] = at1;</li>
	 * <li>neighbor[2] = at2;</li>
	 * <li>neighbor[3] = at3;</li>
	 * <li>type = INCHI_STEREOTYPE.TETRAHEDRAL;</li>
	 * <li>parity = INCHI_PARITY.UNKNOWN;</li>
	 * </ul>
	 * </p>
	 */
	@Test
	void testCase3() {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);
		JniInchiAtom at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);
		JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);
		JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);
		JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);
		INCHI_PARITY parity = INCHI_PARITY.UNKNOWN;
		JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, parity);
		assertEquals(atC, stereo.central_atom);
		assertEquals(at0, stereo.neighbor[0]);
		assertEquals(at1, stereo.neighbor[1]);
		assertEquals(at2, stereo.neighbor[2]);
		assertEquals(at3, stereo.neighbor[3]);
		assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.type);
		assertEquals(INCHI_PARITY.UNKNOWN, stereo.parity);
	}
	
	/**
	 * Test case 4 for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * 
	 * <p>Test case 4 tests the method with the following parameters:
	 * <ul>
	 * <li>atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);</li>
	 * <li>at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);</li>
	 * <li>at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);</li>
	 * <li>at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);</li>
	 * <li>at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);</li>
	 * <li>parity = INCHI_PARITY.NONE;</li>
	 * </ul>
	 * </p>
	 * 
	 * <p>The expected result is that the method returns a new JniInchiStereo0D object with the following properties:
	 * <ul>
	 * <li>central_atom = atC;</li>
	 * <li>neighbor[0] = at0;</li>
	 * <li>neighbor[1] = at1;</li>
	 * <li>neighbor[2] = at2;</li>
	 * <li>neighbor[3] = at3;</li>
	 * <li>type = INCHI_STEREOTYPE.TETRAHEDRAL;</li>
	 * <li>parity = INCHI_PARITY.NONE;</li>
	 * </ul>
	 * </p>
	 */
	@Test
	void testCase4() {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);
		JniInchiAtom at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);
		JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);
		JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 1.0, 0.0);
		JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, 1.0);
		INCHI_PARITY parity = INCHI_PARITY.NONE;
		JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, parity);
		assertEquals(atC, stereo.central_atom);
		assertEquals(at0, stereo.neighbor[0]);
		assertEquals(at1, stereo.neighbor[1]);
		assertEquals(at2, stereo.neighbor[2]);
		assertEquals(at3, stereo.neighbor[3]);
		assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.type);
		assertEquals(INCHI_PARITY.NONE, stereo.parity);
	}
	
	/**
	 * Test case 5 for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * 
	 * <p>Test case 5 tests the method with the following parameters:
	 * <ul>
	 * <li>atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, 0.0);</li>
	 * <li>at0 = new JniInchiAtom("H", 1.0, 0.0, 0.0, 0.0);</li>
	 * <li>at1 = new JniInchiAtom("H", 0.0, 1.0, 0.0, 0.0);</li>
	 * <li>at2 = new JniInchiAtom("H", 0.0, 0.0, 1