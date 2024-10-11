// JniInchiStructure_0Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructure_0Test {
		JniInchiStructure_0Test() {
		}
	@Test
	public void testAddAtom() {
		List<JniInchiAtom> atoms = new ArrayList<JniInchiAtom>();
		JniInchiAtom atom1 = new JniInchiAtom("A");
		JniInchiAtom atom2 = new JniInchiAtom("B");

		if (atom1.equals(atom2)) {
			System.out.println("atom1 is equals to atom2 of list");
		}
		else {
			System.out.println("atom1 not equal");
			System.out.println("atom2 not equal");
		}

		atoms.add(atom1);
		atoms.add(atom2);

		atom1.setInchi(123);
		atom2.setInchi(234);

		assertTrue(atom1.equals(atom2));
		assertFalse(atom1.equals("A"));
		assertFalse(atom1.equals(new JniInchiAtom("B")));
		assertFalse(atom1.hashCode() == atom2.hashCode());
		assertFalse(atom1.toString() == atom2.toString());
	}
}