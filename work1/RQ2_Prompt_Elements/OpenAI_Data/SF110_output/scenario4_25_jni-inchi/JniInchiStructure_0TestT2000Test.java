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
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_1() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_2() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_3() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_4() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_5() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_6() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_7() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_8() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddAtom_9() throws Exception {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
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
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddBond_1() throws Exception {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addBond(JniInchiBond)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddBond_2() throws Exception {
		JniIn