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
	 * Test case 1 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom1() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(0));
	}
	
	/**
	 * Test case 2 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom2() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(1));
	}
	
	/**
	 * Test case 3 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom3() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(2));
	}
	
	/**
	 * Test case 4 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom4() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(3));
	}
	
	/**
	 * Test case 5 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom5() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(4));
	}
	
	/**
	 * Test case 6 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom6() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(5));
	}
	
	/**
	 * Test case 7 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom7() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(6));
	}
	
	/**
	 * Test case 8 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom8() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(7));
	}
	
	/**
	 * Test case 9 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom9() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(8));
	}
	
	/**
	 * Test case 10 for {@link JniInchiStructure#getAtom(int)}
	 */
	@Test
	void testGetAtom10() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(9));
	}
}

// JniInchiAtom.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiAtom {

    /**
     * Returns element type of atom.
     *
     * @return
     */
    public String getElementType() {
        return elementType;
    }
}

// JniInchiAtomTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiAtom}.
* It contains ten unit test cases for the {@link JniInchiAtom#getElementType()} method.
*/
class JniInchiAtomTest {
		
	/**
	 * Test case 1 for {@link JniInchiAtom#getElementType()}
	 */
	@Test
	void testGetElementType1() {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 2 for {@link JniInchiAtom#getElementType()}
	 */
	@Test
	void testGetElementType2() {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 3 for {@link JniInchiAtom#getElementType()}
	 */
	@Test
	void testGetElementType3() {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 4 for {@link JniInchiAtom#getElementType()}
	 */
	@Test
	void testGetElementType4() {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 5 for {@link JniInchiAtom#getElementType()}
	 */
	@Test
	void testGetElementType5() {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 6 for {@link JniInchiAtom#getElementType()}
	 */
	@Test
	void testGetElementType6() {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test case 7 for {@link JniInchiAtom#getElementType()}
	 */
	@Test
	void testGetElementType7() {
		JniInchiAtom atom = new JniInchiAtom("C");
		assertEquals("C", atom.getElementType());
	}
	
	/**
	 * Test