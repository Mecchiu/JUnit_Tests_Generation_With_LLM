// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructureTest {

	/**
	 * Test case 1 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D1() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 2 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D2() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 3 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D3() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 4 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D4() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 5 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D5() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 6 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D6() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 7 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D7() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 8 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D8() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 9 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D9() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 10 for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D10() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
}

// JniInchiStereo0D.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Adams
 */
public class JniInchiStereo0D {

    /**
     * Adds 0D stereo parity to inchi molecule.
     *
     * @param parity Parity to add
     * @return Added parity
     */
    @SuppressWarnings("unchecked")
    public JniInchiStereo0D addStereo0D(JniInchiStereo0D parity) {
        stereoList.add(parity);
        return parity;
    }
}

// JniInchiStereo0DTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStereo0DTest {
		
	/**
	 * Test case 1 for {@link JniInchiStereo0D#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D1() throws JniInchiException {
		JniInchiStereo0D structure = new JniInchiStereo0D();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 2 for {@link JniInchiStereo0D#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D2() throws JniInchiException {
		JniInchiStereo0D structure = new JniInchiStereo0D();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 3 for {@link JniInchiStereo0D#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D3() throws JniInchiException {
		JniInchiStereo0D structure = new JniInchiStereo0D();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 4 for {@link JniInchiStereo0D#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D4() throws JniInchiException {
		JniInchiStereo0D structure = new JniInchiStereo0D();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom[] atoms = new JniInchiAtom[] { atom };
		JniInchiStereo0D stereo = new JniInchiStereo0D(atoms, JniInchiStereo0D.INCHI_PARITY_EVEN, JniInchiStereo0D.INCHI_STEREOTYPE_TETRAHEDRAL);
		structure.addStereo0D(stereo);
		assertEquals(structure.getStereo0D().get(0), stereo);
	}
	
	/**
	 * Test case 5 for {@link JniInchiStereo0D#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D5() throws JniInchiException {
		JniInchiStereo0D structure = new JniInchiStereo0D();
		JniInchiAtom atom = new JniInchiAt