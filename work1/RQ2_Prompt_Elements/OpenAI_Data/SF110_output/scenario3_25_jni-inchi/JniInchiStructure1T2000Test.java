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
	 * Test case 1 for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond1() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom1);
		structure.addAtom(atom2);
		structure.addBond(bond);
		assertEquals(1, structure.getBonds().size());
		assertEquals(bond, structure.getBonds().get(0));
	}
	
	/**
	 * Test case 2 for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond2() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom1);
		structure.addAtom(atom2);
		structure.addBond(bond);
		assertEquals(1, structure.getBonds().size());
		assertEquals(bond, structure.getBonds().get(0));
	}
	
	/**
	 * Test case 3 for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond3() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom1);
		structure.addAtom(atom2);
		structure.addBond(bond);
		assertEquals(1, structure.getBonds().size());
		assertEquals(bond, structure.getBonds().get(0));
	}
	
	/**
	 * Test case 4 for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond4() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom1);
		structure.addAtom(atom2);
		structure.addBond(bond);
		assertEquals(1, structure.getBonds().size());
		assertEquals(bond, structure.getBonds().get(0));
	}
	
	/**
	 * Test case 5 for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond5() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom1);
		structure.addAtom(atom2);
		structure.addBond(bond);
		assertEquals(1, structure.getBonds().size());
		assertEquals(bond, structure.getBonds().get(0));
	}
	
	/**
	 * Test case 6 for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond6() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom1);
		structure.addAtom(atom2);
		structure.addBond(bond);
		assertEquals(1, structure.getBonds().size());
		assertEquals(bond, structure.getBonds().get(0));
	}
	
	/**
	 * Test case 7 for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond7() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom1);
		structure.addAtom(atom2);
		structure.addBond(bond);
		assertEquals(1, structure.getBonds().size());
		assertEquals(bond, structure.getBonds().get(0));
	}
	
	/**
	 * Test case 8 for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond8() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom1);
		structure.addAtom(atom2);
		structure.addBond(bond);
	