// JniInchiStructure_0Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructure_0Test {

	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_0() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		assertEquals(1, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_1() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		structure.addAtom(atom);
		assertEquals(2, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
		assertEquals(atom, structure.getAtom(1));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_2() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		assertEquals(3, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
		assertEquals(atom, structure.getAtom(1));
		assertEquals(atom, structure.getAtom(2));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_3() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		assertEquals(4, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
		assertEquals(atom, structure.getAtom(1));
		assertEquals(atom, structure.getAtom(2));
		assertEquals(atom, structure.getAtom(3));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_4() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		assertEquals(5, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
		assertEquals(atom, structure.getAtom(1));
		assertEquals(atom, structure.getAtom(2));
		assertEquals(atom, structure.getAtom(3));
		assertEquals(atom, structure.getAtom(4));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_5() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		assertEquals(6, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
		assertEquals(atom, structure.getAtom(1));
		assertEquals(atom, structure.getAtom(2));
		assertEquals(atom, structure.getAtom(3));
		assertEquals(atom, structure.getAtom(4));
		assertEquals(atom, structure.getAtom(5));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_6() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		assertEquals(7, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
		assertEquals(atom, structure.getAtom(1));
		assertEquals(atom, structure.getAtom(2));
		assertEquals(atom, structure.getAtom(3));
		assertEquals(atom, structure.getAtom(4));
		assertEquals(atom, structure.getAtom(5));
		assertEquals(atom, structure.getAtom(6));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_7() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		assertEquals(8, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
		assertEquals(atom, structure.getAtom(1));
		assertEquals(atom, structure.getAtom(2));
		assertEquals(atom, structure.getAtom(3));
		assertEquals(atom, structure.getAtom(4));
		assertEquals(atom, structure.getAtom(5));
		assertEquals(atom, structure.getAtom(6));
		assertEquals(atom, structure.getAtom(7));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_8() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		assertEquals(9, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
		assertEquals(atom, structure.getAtom(1));
		assertEquals(atom, structure.getAtom(2));
		assertEquals(atom, structure.getAtom(3));
		assertEquals(atom, structure.getAtom(4));
		assertEquals(atom, structure.getAtom(5));
		assertEquals(atom, structure.getAtom(6));
		assertEquals(atom, structure.getAtom(7));
		assertEquals(atom, structure.getAtom(8));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_9() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiStructure structure = new JniInchiStructure();
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		structure.addAtom(atom);
		assertEquals(10, structure.getNumAtoms());
		assertEquals(0, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(atom, structure.getAtom(0));
		assertEquals(atom, structure.getAtom(1));
		assertEquals(atom, structure.getAtom(2));
		assertEquals(atom, structure.getAtom(3));
		assertEquals(atom, structure.getAtom(4));
		assertEquals(atom, structure.getAtom(5));
		assertEquals(atom, structure.getAtom(6));
		assertEquals(atom, structure.getAtom(7));
		assertEquals(atom, structure.getAtom(8));
		assertEquals(atom, structure.getAtom(9));
	}
	
}

// JniInchiStructure_1Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructure_1Test {
		
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddBond_0() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiBond bond = new JniInchiBond(atom, atom, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addBond(bond);
		assertEquals(0, structure.getNumAtoms());
		assertEquals(1, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(bond, structure.getBond(0));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddBond_1() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiBond bond = new JniInchiBond(atom, atom, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addBond(bond);
		structure.addBond(bond);
		assertEquals(0, structure.getNumAtoms());
		assertEquals(2, structure.getNumBonds());
		assertEquals(0, structure.getNumStereo0D());
		assertEquals(bond, structure.getBond(0));
		assertEquals(bond, structure.getBond(1));
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddBond_2() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("N");
		JniInchiBond bond = new JniInchiBond(atom, atom, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		structure.addBond(bond);
		structure.addBond(bond);
		structure.addBond(bond);
		assertEquals(0, structure.getNumAtoms