// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructureTest {

	/**
	 * Test case 1.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom1() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(0);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom2() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(1);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom3() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(2);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 4.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom4() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(3);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 5.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom5() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(4);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 6.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom6() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(5);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 7.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom7() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(6);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 8.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom8() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(7);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 9.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom9() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(8);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 10.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom10() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(9);
		assertNotNull(atom);
	}
}

// JniInchiStructure.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Adams
 */
public class JniInchiStructure {

    /**
     * Returns atom from structure.
     *
     * @param i Index of atom to return.
     * @return
     */
    public JniInchiAtom getAtom(final int i);
}

// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructureTest {
		
	/**
	 * Test case 1.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom1() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(0);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom2() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(1);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom3() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(2);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 4.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom4() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(3);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 5.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom5() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(4);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 6.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom6() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(5);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 7.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom7() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = structure.getAtom(6);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 8.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom8() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		