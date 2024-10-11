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
		JniInchiAtom atom = new JniInchiAtom("N");
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
		JniInchiAtom atom = new JniInchiAtom("N");
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
		JniInchiAtom atom = new JniInchiAtom("N");
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
		JniInchiAtom atom = new JniInchiAtom("N");
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
		JniInchiAtom atom = new JniInchiAtom("N");
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
		JniInchiAtom atom = new JniInchiAtom("N");
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
		JniInchiAtom atom = new JniInchiAtom("N");
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
		JniInchiAtom atom = new JniInchiAtom("N");
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
		JniInchiAtom atom = new JniInchiAtom("N");
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
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
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
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
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
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
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
	void testAddBond_3() throws Exception {
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
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
	void testAddBond_4() throws Exception {
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
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
	void testAddBond_5() throws Exception {
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
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
	void testAddBond_6() throws Exception {
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
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
	void testAddBond_7() throws Exception {
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
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
	void testAddBond_8() throws Exception {
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
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
	void testAddBond_9() throws Exception {
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
	}
	
}

// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_2Test {
		
	/**
	 * Test case for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testAddStereo0D_0() throws Exception {
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("N");
		JniInchiAtom atom3 = new JniInchiAtom("N");
		JniInchiAtom atom4 = new JniInchiAtom("N");
		JniInchiStereo0D stereo = new JniInchiStereo0D(atom1, atom2, atom3, atom4, JniInchiStereo0D.CompStereoType.TETRAHEDRAL);
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiStereo0D result = structure.addStereo0D(stereo);
		assertEquals(stereo, result);
	}
	
	/**
	 * Test case for {@link JniInchiStructure#addStereo0