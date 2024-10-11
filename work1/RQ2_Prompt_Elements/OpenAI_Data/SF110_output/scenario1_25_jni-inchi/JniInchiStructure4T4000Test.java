// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructureTest {

	@Test
	void testGetBond_0() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(0));
	}
	
	@Test
	void testGetBond_1() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(1));
	}
	
	@Test
	void testGetBond_2() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(2));
	}
	
	@Test
	void testGetBond_3() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(3));
	}
	
	@Test
	void testGetBond_4() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(4));
	}
	
	@Test
	void testGetBond_5() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(5));
	}
	
	@Test
	void testGetBond_6() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(6));
	}
	
	@Test
	void testGetBond_7() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(7));
	}
	
	@Test
	void testGetBond_8() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(8));
	}
	
	@Test
	void testGetBond_9() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(9));
	}
}

// JniInchiAtom.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiAtom {

    public JniInchiAtom(final String p0, final double p1, final double p2, final double p3, final String p4, final int p5, final int p6) {
    }
}

// JniInchiAtomTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiAtom}.
* It contains one unit test case for the {@link JniInchiAtom#JniInchiAtom(String, double, double, double, String, int, int)} constructor.
*/
class JniInchiAtomTest {
		
	@Test
	void testJniInchiAtom_0() {
		JniInchiAtom atom = new JniInchiAtom("C", 0.0, 0.0, 0.0, "", 0, 0);
		assertEquals("C", atom.elementType);
		assertEquals(0.0, atom.x);
		assertEquals(0.0, atom.y);
		assertEquals(0.0, atom.z);
		assertEquals("", atom.p_parity);
		assertEquals(0, atom.p_atom_parity);
		assertEquals(0, atom.p_implicit_H);
	}
}

// JniInchiBond.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiBond {

    public JniInchiBond(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6) {
    }
}

// JniInchiBondTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiBond}.
* It contains one unit test case for the {@link JniInchiBond#JniInchiBond(int, int, int, int, int, int, int)} constructor.
*/
class JniInchiBondTest {
		
	@Test
	void testJniInchiBond_0() {
		JniInchiBond bond = new JniInchiBond(0, 0, 0, 0, 0, 0, 0);
		assertEquals(0, bond.atom1);
		assertEquals(0, bond.atom2);
		assertEquals(0, bond.bondType);
		assertEquals(0, bond.bondStereo);
		assertEquals(0, bond.bondTopology);
		assertEquals(0, bond.bondRingState);
		assertEquals(0, bond.bondIsAromatic);
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

    public JniInchiInput(final String p0, final JniInchiStructure p1) {
    }
}

// JniInchiInputTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiInput}.
* It contains one unit test case for the {@link JniInchiInput#JniInchiInput(String, JniInchiStructure)} constructor.
*/
class JniInchiInputTest {
		
	@Test
	void testJniInchiInput_0() {
		JniInchiInput input = new JniInchiInput("", new JniInchiStructure());
		assertEquals("", input.getKey());
		assertEquals(new JniInchiStructure(), input.getStructure());
	}
}

// JniInchiOutput.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiOutput {

    public JniInchiOutput(final String p0, final String p1, final String p2, final String p3, final String p4, final String p5, final String p6, final String p7, final String p8, final String p9, final String p10, final String p11, final String p12, final String p13, final String p14, final String p15, final String p16, final String p17, final String p18, final String p19, final String p20, final String p21, final String p22, final String p23, final String p24, final String p25, final