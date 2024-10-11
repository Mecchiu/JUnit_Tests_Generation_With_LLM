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
		JniInchiStructure instance;

		@Test
		void testAddAtom() {
				instance = new JniInchiStructure();
				instance.addAtom(new JniInchiAtom("GlyC", "CH"));
				assertEquals("Wrong inchi atom count in JniInchiStructure_0", 1, (int) instance.getAtomCount());
		}

		@Test
		void testGetAtomCount() {
				instance = new JniInchiStructure();
				assertEquals("Wrong inchi atom count in JniInchiStructure_0", 1, (int) instance.getAtomCount());
		}

		@Test
		void testDeleteAtom() {
				instance = new JniInchiStructure();
				List<JniInchiAtom> inchiAtoms = new ArrayList<>(Arrays.asList(
						new JniInchiAtom("GlyC", "CH"),
						new JniInchiAtom("GlyC", "CH")
						));
				newJniInchiAtomListAddRemove(instance, inchiAtoms);
				assertTrue("No atoms found in JniInchiStructure", inchiAtoms.size() > 0);
		}
		@Test
		void testDeleteAtomWithNull() {
				instance = new JniInchiStructure();
				List<JniInchiAtom> inchiAtoms = new ArrayList<>(Arrays.asList(
						new JniInchiAtom("", ""), // no atom
						new JniInchiAtom("", "CH")) // atom with a CH
						);
				newJniInchiAtomListAddRemove(instance, inchiAtoms);
				assertTrue("No after removal of null atoms", 
						instance.getAtoms().size() > 0);
		}
}