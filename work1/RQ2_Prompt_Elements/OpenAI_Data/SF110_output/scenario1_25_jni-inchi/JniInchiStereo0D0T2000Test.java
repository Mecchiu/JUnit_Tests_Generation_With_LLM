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
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(null, null, null, null, null, null);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters2() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("C"), null, null, null, null, null);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters3() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("C"), new JniInchiAtom("C"), null, null, null, null);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters4() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), null, null, null);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters5() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), null, null);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters6() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), null);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters7() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(null, new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), INCHI_PARITY.EVEN);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters8() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("C"), null, new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), INCHI_PARITY.EVEN);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters9() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("C"), new JniInchiAtom("C"), null, new JniInchiAtom("C"), new JniInchiAtom("C"), INCHI_PARITY.EVEN);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
	 * with null parameters.
	 */
	@Test
	void testCreateNewTetrahedralStereo0D_NullParameters10() {
		assertThrows(NullPointerException.class, () -> {
			JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("C"), new JniInchiAtom("C"), new JniInchiAtom("C"), null, new JniInchiAtom("C"), INCHI_PARITY.EVEN);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStereo0D#