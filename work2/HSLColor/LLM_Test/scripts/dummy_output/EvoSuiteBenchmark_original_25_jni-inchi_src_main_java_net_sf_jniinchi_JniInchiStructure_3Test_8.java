// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {
		private final static List<String> VOWEL = asList("a", "e", "i", "o", "u");

		private void runTests() {
			ArrayList<JniInchiAtom> atoms = new ArrayList<>();
		}

		private String[] asList(final String s) {
			return s.isEmpty()? new String[] {} : s.split("\\s+");
		}

		private JniInchiAtom getAtom(final int i) {
    		JniInchiAtom atom = JniInchiStructure.addAtom(i);
			return atom;
    	}

		private List<JniInchiAtom> addAtoms(final List<String> strings) {
			return JniInchiStructure.addAtoms(strings.size(), strings);
	    }

		private boolean isVowel(final String n) {
			return VOWEL.contains(n);
		}

		private JniInchiAtom addAtom(final int i) {
			JniInchiAtom atom = JniInchiStructure.addAtom(i);
			return atom;
	    }

		@Test
		void test() {
    		runTests();
    		String[] strings = asList("Tiger", "Zug", "O'O", "Lore", "Kneis");
    		String expected = "Tiger,ZugO,LoreO,KneisLore";
    		List<JniInchiAtom> atoms1 = addAtoms(strings);
    		assertEquals(expected, asString(atoms1));
		}
}