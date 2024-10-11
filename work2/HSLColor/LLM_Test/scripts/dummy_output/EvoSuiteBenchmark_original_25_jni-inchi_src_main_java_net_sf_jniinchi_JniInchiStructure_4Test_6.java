// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {
		
	/**
	 * Tests getBond(int) method.
	 */
	@Test
	void testGet() throws Exception {
		JniInchiStructure structure = JniInchiStructure.generateTestBondStruct();
		List<JniInchiAtom> bonds = structure.getBonds();
		assertNotNull(bonds);
		assertEquals(1, bonds.size());
		assertTrue(bonds.get(0) instanceof JniInchiBond);
	}

	/**
	 * Tests getBonds() method.
	 */
	@Test
	void testGetBonds() throws Exception {
		JniInchiStructure structure = JniInchiStructure.generateTestBondStruct();
		List<JniInchiAtom> bonds1 = structure.getBonds();
		List<JniInchiAtom> bonds2 = structure.getBonds();
		assertEquals(bonds1.size(), bonds2.size());
		assertEquals(1, bonds1.size());
		assertFalse(bonds1.contains(bonds2.get(0)));
	}

	/**
	 * Tests empty bond structure.
	 */
	@Test
	void testEmptyBondStructure() throws Exception {
		assertNotNull(JniInchiStructure.generateTestBondStruct());
		List<JniInchiBond> bodies = new ArrayList<JniInchiBond>(0);
		assertDefaultEquals(bodies);
	}

	/**
	 * Tests copy constructor.
	 */
	@Test
	void testCopyConstructor() throws Exception {
		JniInchiBond bond1 = JniInchiStructure.generateTestBondStruct().getBond(0);
		JniInchiBond bond2 =
			JniInchiStructure.generateTestBondStruct().getBond(0);
		assertNotSame(bond1, bond2);
		assertTrue(bond1 == bond2);
	}

	/**
	 * Tests default equals method.
	 */
	@Test
	void testEquals() throws Exception {
		JniInchiStructure struct1 =
			JniInchiStructure.generateTestBondStruct();
		JniInchiStructure struct2 =
			JniInchiStructure.generateTestBondStruct();
		assertDefaultEquals(struct1, struct2);
	}

	/**
	 * Tests default hashCode method.
	 */
	@Test
	void testHashCode() throws Exception {
		JniInchiStructure struct1 =
			JniInchiStructure.generateTestBondStruct();
		JniInchiStructure struct2 =
			JniInchiStructure.generateTestBondStruct();
		assertDefaultHashCodes(struct1, struct2);
	}
}