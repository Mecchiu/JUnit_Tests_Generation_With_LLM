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
	 * <li>at0 = {@link JniInchiAtom}</li>
	 * <li>at1 = {@link JniInchiAtom}</li>
	 * <li>at2 = {@link JniInchiAtom}</li>
	 * <li>at3 = {@link JniInchiAtom}</li>
	 * <li>parity = {@link INCHI_PARITY#EVEN}</li>
	 * </ul>
	 */
	@Test
	void testCreateNewDoublebondStereo0D_1() {
		JniInchiAtom at0 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.EVEN;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = {@link JniInchiAtom}</li>
	 * <li>at1 = {@link JniInchiAtom}</li>
	 * <li>at2 = {@link JniInchiAtom}</li>
	 * <li>at3 = {@link JniInchiAtom}</li>
	 * <li>parity = {@link INCHI_PARITY#ODD}</li>
	 * </ul>
	 */
	@Test
	void testCreateNewDoublebondStereo0D_2() {
		JniInchiAtom at0 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.ODD;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = {@link JniInchiAtom}</li>
	 * <li>at1 = {@link JniInchiAtom}</li>
	 * <li>at2 = {@link JniInchiAtom}</li>
	 * <li>at3 = {@link JniInchiAtom}</li>
	 * <li>parity = {@link INCHI_PARITY#UNKNOWN}</li>
	 * </ul>
	 */
	@Test
	void testCreateNewDoublebondStereo0D_3() {
		JniInchiAtom at0 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.UNKNOWN;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = {@link JniInchiAtom}</li>
	 * <li>at1 = {@link JniInchiAtom}</li>
	 * <li>at2 = {@link JniInchiAtom}</li>
	 * <li>at3 = {@link JniInchiAtom}</li>
	 * <li>parity = {@link INCHI_PARITY#NONE}</li>
	 * </ul>
	 */
	@Test
	void testCreateNewDoublebondStereo0D_4() {
		JniInchiAtom at0 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.NONE;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = {@link JniInchiAtom}</li>
	 * <li>at1 = {@link JniInchiAtom}</li>
	 * <li>at2 = {@link JniInchiAtom}</li>
	 * <li>at3 = {@link JniInchiAtom}</li>
	 * <li>parity = {@link INCHI_PARITY#UNDEFINED}</li>
	 * </ul>
	 */
	@Test
	void testCreateNewDoublebondStereo0D_5() {
		JniInchiAtom at0 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.UNDEFINED;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = {@link JniInchiAtom}</li>
	 * <li>at1 = {@link JniInchiAtom}</li>
	 * <li>at2 = {@link JniInchiAtom}</li>
	 * <li>at3 = {@link JniInchiAtom}</li>
	 * <li>parity = {@link INCHI_PARITY#UNDEFINED}</li>
	 * </ul>
	 */
	@Test
	void testCreateNewDoublebondStereo0D_6() {
		JniInchiAtom at0 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.UNDEFINED;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = {@link JniInchiAtom}</li>
	 * <li>at1 = {@link JniInchiAtom}</li>
	 * <li>at2 = {@link JniInchiAtom}</li>
	 * <li>at3 = {@link JniInchiAtom}</li>
	 * <li>parity = {@link INCHI_PARITY#UNDEFINED}</li>
	 * </ul>
	 */
	@Test
	void testCreateNewDoublebondStereo0D_7() {
		JniInchiAtom at0 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.UNDEFINED;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = {@link JniInchiAtom}</li>
	 * <li>at1 = {@link JniInchiAtom}</li>
	 * <li>at2 = {@link JniInchiAtom}</li>
	 * <li>at3 = {@link JniInchiAtom}</li>
	 * <li>parity = {@link INCHI_PARITY#UNDEFINED}</li>
	 * </ul>
	 */
	@Test
	void testCreateNewDoublebondStereo0D_8() {
		JniInchiAtom at0 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.UNDEFINED;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	/**
	 * Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with the following parameters:
	 * <ul>
	 * <li>at0 = {@link JniInchiAtom}</li>
	 * <li>at1 = {@link JniInchiAtom}</li>
	 * <li>at2 = {@link JniInchiAtom}</li>
	 * <li>at3 = {@link JniInchiAtom}</li>
	 * <li>parity = {@link INCHI_PARITY#UNDEFINED}</li>
	 * </ul>
	 */
	@Test
	void testCreateNewDoublebondStereo0D_9() {
		JniInchiAtom at0 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.UNDEFINED;
		JniInchiStereo0D result = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, parity);
		assertNotNull(result);
	}

	