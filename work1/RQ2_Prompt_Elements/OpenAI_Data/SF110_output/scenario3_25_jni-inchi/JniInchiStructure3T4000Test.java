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

// JniInchiAtom.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Adams
 */
public class JniInchiAtom {

    /**
     * Returns atom from structure.
     *
     * @param i Index of atom to return.
     * @return
     */
    public JniInchiAtom getAtom(final int i);
}

// JniInchiAtomTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiAtom}.
* It contains ten unit test cases for the {@link JniInchiAtom#getAtom(int)} method.
*/
class JniInchiAtomTest {
		
	/**
	 * Test case 1.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom1() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(0);
		assertNotNull(atom2);
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom2() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(1);
		assertNotNull(atom2);
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom3() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(2);
		assertNotNull(atom2);
	}
	
	/**
	 * Test case 4.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom4() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(3);
		assertNotNull(atom2);
	}
	
	/**
	 * Test case 5.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom5() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(4);
		assertNotNull(atom2);
	}
	
	/**
	 * Test case 6.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom6() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(5);
		assertNotNull(atom2);
	}
	
	/**
	 * Test case 7.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom7() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(6);
		assertNotNull(atom2);
	}
	
	/**
	 * Test case 8.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom8() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(7);
		assertNotNull(atom2);
	}
	
	/**
	 * Test case 9.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom9() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(8);
		assertNotNull(atom2);
	}
	
	/**
	 * Test case 10.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom10() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom atom2 = atom.getAtom(9);
		assertNotNull(atom2);
	}
}

// JniInchiInput.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Adams
 */
public class JniInchiInput {

    /**
     * Returns atom from structure.
     *
     * @param i Index of atom to return.
     * @return
     */
    public JniInchiAtom getAtom(final int i);
}

// JniInchiInputTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiInput}.
* It contains ten unit test cases for the {@link JniInchiInput#getAtom(int)} method.
*/
class JniInchiInputTest {
		
	/**
	 * Test case 1.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom1() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(0);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom2() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(1);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom3() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(2);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 4.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom4() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(3);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 5.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom5() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(4);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 6.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom6() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(5);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 7.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom7() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(6);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 8.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom8() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(7);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 9.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom9() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(8);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 10.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom10() throws JniInchiException {
		JniInchiInput input = new JniInchiInput();
		JniInchiAtom atom = input.getAtom(9);
		assertNotNull(atom);
	}
}

// JniInchiOutput.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Adams
 */
public class JniInchiOutput {

    /**
     * Returns atom from structure.
     *
     * @param i Index of atom to return.
     * @return
     */
    public JniInchiAtom getAtom(final int i);
}

// JniInchiOutputTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiOutput}.
* It contains ten unit test cases for the {@link JniInchiOutput#getAtom(int)} method.
*/
class JniInchiOutputTest {
		
	/**
	 * Test case 1.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom1() throws JniInchiException {
		JniInchiOutput output = new JniInchiOutput();
		JniInchiAtom atom = output.getAtom(0);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom2() throws JniInchiException {
		JniInchiOutput output = new JniInchiOutput();
		JniInchiAtom atom = output.getAtom(1);
		assertNotNull(atom);
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetAtom3() throws JniInchiException {
		JniInchiOutput output = new JniInchiOutput();
		JniInchiAtom atom = output.getAtom(2);
		assertNotNull(atom);
	}
	
	/**
	 * Test