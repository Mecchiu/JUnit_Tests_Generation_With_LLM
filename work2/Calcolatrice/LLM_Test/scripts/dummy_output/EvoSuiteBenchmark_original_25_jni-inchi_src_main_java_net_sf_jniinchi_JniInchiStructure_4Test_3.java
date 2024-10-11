// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {
		
	private final List<JniInchiBond> bonds;
	
	/** Creates an atom containing two residues. */
	public JniInchiStructure_4Test(final JniInchiStructureJni mol) {
		bonds = new ArrayList<>(2);
		bonds.add(JniInchiStructure.getBond(1));
		bonds.add(JniInchiStructure.getBond(2));
	}

	/** Returns the bond of atom containing second residue. */
	public JniInchiBond getBond(final int resid) {
		if (bonds.size()!= 2) throw new IllegalArgumentException("No bonds given!");
		return bonds.get(1);
	}

	@Test
	public void getBondIntInt_ReturnsBond() throws Exception {
		assertSame(JniInchiStructure.getBond(0), getBond(0));
		assertSame(JniInchiStructure.getBond(1), getBond(1));
		assertSame(JniInchiStructure.getBond(2), getBond(2));
	}

	@Test
	public void hasBondAtomAtomDifferentResidue_ReturnsFalse() throws Exception {
		assertFalse(getBond(0).hasAtom(2));
		assertFalse(getBond(2).hasAtom(0));
		assertFalse(getBond(0).hasAtom(1));
		assertFalse(getBond(2).hasAtom(1));
		assertFalse(getBond(2).hasAtom(2));
	}
}