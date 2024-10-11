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

	@Test
	void testAddStereo0D() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiStereo0D parity = new JniInchiStereo0D();
		structure.addStereo0D(parity);
		assertEquals(1, structure.getStereo0D().size());
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

    @SuppressWarnings("unchecked")
    public JniInchiAtom addNeighbor(JniInchiAtom atom) {
        neighbors.add(atom);
        return atom;
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
* It contains ten unit test cases for the {@link JniInchiStereo0D#addNeighbor(JniInchiAtom)} method.
*/
class JniInchiStereo0DTest {
		
	@Test
	void testAddNeighbor() {
		JniInchiStereo0D stereo = new JniInchiStereo0D();
		JniInchiAtom atom = new JniInchiAtom();
		stereo.addNeighbor(atom);
		assertEquals(1, stereo.getNeighbors().size());
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

    @SuppressWarnings("unchecked")
    public JniInchiBond addBond(JniInchiBond bond) {
        bonds.add(bond);
        return bond;
    }
}

// JniInchiAtomTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiAtom}.
* It contains ten unit test cases for the {@link JniInchiAtom#addBond(JniInchiBond)} method.
*/
class JniInchiAtomTest {
		
	@Test
	void testAddBond() {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiBond bond = new JniInchiBond();
		atom.addBond(bond);
		assertEquals(1, atom.getBonds().size());
	}
}

// JniInchiBond.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Adams
 */
public class JniInchiBond {

    @SuppressWarnings("unchecked")
    public JniInchiAtom getNeighbor() {
        return neighbor;
    }
}

// JniInchiBondTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiBond}.
* It contains ten unit test cases for the {@link JniInchiBond#getNeighbor()} method.
*/
class JniInchiBondTest {
		
	@Test
	void testGetNeighbor() {
		JniInchiBond bond = new JniInchiBond();
		JniInchiAtom atom = new JniInchiAtom();
		bond.setNeighbor(atom);
		assertEquals(atom, bond.getNeighbor());
	}
}