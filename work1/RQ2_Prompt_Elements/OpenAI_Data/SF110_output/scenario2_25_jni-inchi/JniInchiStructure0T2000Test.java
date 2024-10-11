// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructureTest {

	/**
	 * Test case 1 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom1() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case 2 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom2() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case 3 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom3() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case 4 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom4() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case 5 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom5() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case 6 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom6() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case 7 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom7() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case 8 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom8() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case 9 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom9() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
	
	/**
	 * Test case 10 for {@link JniInchiStructure#addAtom(JniInchiAtom)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddAtom10() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
}

// JniInchiAtom.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiAtom {

    /**
     * Creates new atom.
     *
     * @param elementSymbol Element symbol
     */
    public JniInchiAtom(String elementSymbol) {
        this.elementSymbol = elementSymbol;
    }
}

// JniInchiAtomTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiAtom}.
* It contains ten unit test cases for the {@link JniInchiAtom#JniInchiAtom(String)} constructor.
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
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 2 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom2() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 3 for {@link JniInchiAtom#JniInchiAtom(String)}
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom3() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
