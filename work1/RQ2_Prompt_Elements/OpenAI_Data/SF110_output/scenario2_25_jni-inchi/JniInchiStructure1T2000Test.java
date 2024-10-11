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
	 * Test case 1 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond1() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
	
	/**
	 * Test case 2 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond2() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
	
	/**
	 * Test case 3 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond3() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
	
	/**
	 * Test case 4 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond4() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
	
	/**
	 * Test case 5 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond5() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
	
	/**
	 * Test case 6 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond6() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
	
	/**
	 * Test case 7 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond7() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
	
	/**
	 * Test case 8 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond8() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
	
	/**
	 * Test case 9 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond9() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
	
	/**
	 * Test case 10 for {@link JniInchiStructure#addBond(JniInchiBond)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddBond10() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAt