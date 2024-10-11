// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructureTest {

	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is null.
	 */
	@Test
	void testAddBond_NullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiBond bond = null;
		assertThrows(NullPointerException.class, () -> {
			structure.addBond(bond);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
}

// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructureTest {
		
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is null.
	 */
	@Test
	void testAddBond_NullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiBond bond = null;
		assertThrows(NullPointerException.class, () -> {
			structure.addBond(bond);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
}

// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructureTest {
		
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is null.
	 */
	@Test
	void testAddBond_NullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiBond bond = null;
		assertThrows(NullPointerException.class, () -> {
			structure.addBond(bond);
		});
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * It tests the case when the bond is not null.
	 */
	@Test
	void testAddBond_NotNullBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
