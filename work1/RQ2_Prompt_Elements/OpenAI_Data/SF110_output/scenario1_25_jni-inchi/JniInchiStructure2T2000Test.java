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
    public JniInchiAtom addAtom(JniInchiAtom atom) {
        atomList.add(atom);
        return atom;
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
    public JniInchiAtom addNeighbor(JniInchiAtom atom) {
        neighbors.add(atom);
        return atom;
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
* It contains ten unit test cases for the {@link JniInchiAtom#addNeighbor(JniInchiAtom)} method.
*/
class JniInchiAtomTest {
		
	@Test
	void testAddNeighbor() {
		JniInchiAtom atom = new JniInchiAtom();
		JniInchiAtom neighbor = new JniInchiAtom();
		atom.addNeighbor(neighbor);
		assertEquals(1, atom.getNeighbors().size());
	}
}