// JniInchiStereo0DTest.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0DTest {

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = null</li>
	 * <li>at1 = null</li>
	 * <li>at2 = null</li>
	 * <li>at3 = null</li>
	 * <li>parity = INCHI_PARITY.ODD</li>
	 * </ul>
	 *
	 * @throws Exception
	 */
	@Test
	void testCreateNewDoublebondStereo0D_1() throws Exception {
		JniInchiAtom at0 = null;
		JniInchiAtom at1 = null;
		JniInchiAtom at2 = null;
		JniInchiAtom at3 = null;
		INCHI_PARITY parity = INCHI_PARITY.ODD;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = null</li>
	 * <li>at1 = null</li>
	 * <li>at2 = null</li>
	 * <li>at3 = null</li>
	 * <li>parity = INCHI_PARITY.EVEN</li>
	 * </ul>
	 *
	 * @throws Exception
	 */
	@Test
	void testCreateNewDoublebondStereo0D_2() throws Exception {
		JniInchiAtom at0 = null;
		JniInchiAtom at1 = null;
		JniInchiAtom at2 = null;
		JniInchiAtom at3 = null;
		INCHI_PARITY parity = INCHI_PARITY.EVEN;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = null</li>
	 * <li>at1 = null</li>
	 * <li>at2 = null</li>
	 * <li>at3 = null</li>
	 * <li>parity = INCHI_PARITY.UNKNOWN</li>
	 * </ul>
	 *
	 * @throws Exception
	 */
	@Test
	void testCreateNewDoublebondStereo0D_3() throws Exception {
		JniInchiAtom at0 = null;
		JniInchiAtom at1 = null;
		JniInchiAtom at2 = null;
		JniInchiAtom at3 = null;
		INCHI_PARITY parity = INCHI_PARITY.UNKNOWN;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = null</li>
	 * <li>at1 = null</li>
	 * <li>at2 = null</li>
	 * <li>at3 = null</li>
	 * <li>parity = INCHI_PARITY.NONE</li>
	 * </ul>
	 *
	 * @throws Exception
	 */
	@Test
	void testCreateNewDoublebondStereo0D_4() throws Exception {
		JniInchiAtom at0 = null;
		JniInchiAtom at1 = null;
		JniInchiAtom at2 = null;
		JniInchiAtom at3 = null;
		INCHI_PARITY parity = INCHI_PARITY.NONE;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = null</li>
	 * <li>at1 = null</li>
	 * <li>at2 = null</li>
	 * <li>at3 = null</li>
	 * <li>parity = null</li>
	 * </ul>
	 *
	 * @throws Exception
	 */
	@Test
	void testCreateNewDoublebondStereo0D_5() throws Exception {
		JniInchiAtom at0 = null;
		JniInchiAtom at1 = null;
		JniInchiAtom at2 = null;
		JniInchiAtom at3 = null;
		INCHI_PARITY parity = null;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = null</li>
	 * <li>at1 = null</li>
	 * <li>at2 = null</li>
	 * <li>at3 = null</li>
	 * <li>parity = INCHI_PARITY.ODD</li>
	 * </ul>
	 *
	 * @throws Exception
	 */
	@Test
	void testCreateNewDoublebondStereo0D_6() throws Exception {
		JniInchiAtom at0 = null;
		JniInchiAtom at1 = null;
		JniInchiAtom at2 = null;
		JniInchiAtom at3 = null;
		INCHI_PARITY parity = INCHI_PARITY.ODD;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAt