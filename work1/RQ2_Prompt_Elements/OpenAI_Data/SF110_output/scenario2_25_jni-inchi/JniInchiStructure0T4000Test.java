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
	 * Test case 1 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 2 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 3 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 4 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 5 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 6 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 7 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 8 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 9 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 10 for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
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
	 * Test case 1 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom1() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 2 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom2() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 3 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom3() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 4 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom4() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 5 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom5() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 6 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom6() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 7 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom7() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 8 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom8() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 9 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom9() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
	
	/**
	 * Test case 10 for {@link JniInchiAtom#JniInchiAtom(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiAtom10() throws JniInchiException {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.elementSymbol);
	}
}

// JniInchiException.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiException extends Exception {

    /**
     * Creates new exception.
     *
     * @param message Exception message
     */
    public JniInchiException(String message) {
        super(message);
    }
}

// JniInchiExceptionTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiException}.
* It contains ten unit test cases for the {@link JniInchiException#JniInchiException(String)} constructor.
*/
class JniInchiExceptionTest {
		
	/**
	 * Test case 1 for {@link JniInchiException#JniInchiException(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiException1() throws JniInchiException {
		JniInchiException exception = new JniInchiException("Error");
		assertEquals("Error", exception.getMessage());
	}
	
	/**
	 * Test case 2 for {@link JniInchiException#JniInchiException(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiException2() throws JniInchiException {
		JniInchiException exception = new JniInchiException("Error");
		assertEquals("Error", exception.getMessage());
	}
	
	/**
	 * Test case 3 for {@link JniInchiException#JniInchiException(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiException3() throws JniInchiException {
		JniInchiException exception = new JniInchiException("Error");
		assertEquals("Error", exception.getMessage());
	}
	
	/**
	 * Test case 4 for {@link JniInchiException#JniInchiException(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiException4() throws JniInchiException {
		JniInchiException exception = new JniInchiException("Error");
		assertEquals("Error", exception.getMessage());
	}
	
	/**
	 * Test case 5 for {@link JniInchiException#JniInchiException(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiException5() throws JniInchiException {
		JniInchiException exception = new JniInchiException("Error");
		assertEquals("Error", exception.getMessage());
	}
	
	/**
	 * Test case 6 for {@link JniInchiException#JniInchiException(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiException6() throws JniInchiException {
		JniInchiException exception = new JniInchiException("Error");
		assertEquals("Error", exception.getMessage());
	}
	
	/**
	 * Test case 7 for {@link JniInchiException#JniInchiException(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiException7() throws JniInchiException {
		JniInchiException exception = new JniInchiException("Error");
		assertEquals("Error", exception.getMessage());
	}
	
	/**
	 * Test case 8 for {@link JniInchiException#JniInchiException(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiException8() throws JniInchiException {
		JniInchiException exception = new JniInchiException("Error");
		assertEquals("Error", exception.getMessage());
	}
	
	/**
	 * Test case 9 for {@link JniInchiException#JniInchiException(String)} constructor.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testJniInchiException9() throws JniInchiException {
		JniInchiException exception = new JniInchiException("Error");
		assertEquals("Error", exception.getMessage());
	}
	
	/**
	 * Test case 10 for {@link JniInchi