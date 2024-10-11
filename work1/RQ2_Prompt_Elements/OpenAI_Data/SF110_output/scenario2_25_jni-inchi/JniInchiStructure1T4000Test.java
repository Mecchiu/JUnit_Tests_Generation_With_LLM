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
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		structure.addBond(bond);
		assertEquals(1, structure.getBondList().size());
	}
}

// JniInchiAtom.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiAtom {

    /**
     * Creates new JniInchiAtom
     *
     * @param elementType Element type
     */
    public JniInchiAtom(String elementType) {
        this.elementType = elementType;
    }
}

// JniInchiAtomTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiAtom}.
* It contains ten unit test cases for the {@link JniInchiAtom#JniInchiAtom(String)} method.
*/
class JniInchiAtomTest {
		
	/**
	 * Test case 1 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom1() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 2 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom2() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 3 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom3() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 4 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom4() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 5 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom5() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 6 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom6() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 7 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom7() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 8 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom8() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 9 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom9() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 10 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom10() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
}

// JniInchiBond.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiBond {

    /**
     * Creates new JniInchiBond
     *
     * @param atom1 First atom
     * @param atom2 Second atom
     * @param bondType Bond type
     */
    public JniInchiBond(JniInchiAtom atom1, JniInchiAtom atom2, BondType bondType) {
        this.atom1 = atom1;
        this.atom2 = atom2;
        this.bondType = bondType;
    }
}

// JniInchiBondTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiBond}.
* It contains ten unit test cases for the {@link JniInchiBond#JniInchiBond(JniInchiAtom, JniInchiAtom, JniInchiBond.BondType)} method.
*/
class JniInchiBondTest {
		
	/**
	 * Test case 1 for {@link JniInchiBond#JniInchiBond(JniInchiAtom, JniInchiAtom, JniInchiBond.BondType)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiBond1() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		assertEquals(atom1, bond.getAtom1());
		assertEquals(atom2, bond.getAtom2());
		assertEquals(JniInchiBond.BondType.SINGLE, bond.getBondType());
	}
	
	/**
	 * Test case 2 for {@link JniInchiBond#JniInchiBond(JniInchiAtom, JniInchi