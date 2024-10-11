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
		
	private static JniInchiAtom a;
    private static JniInchiStructure s;

    {
            List jniAtoms = new ArrayList();
            List jni = new ArrayList();
            a = new JniInchiAtom("ATOM");
            a.setProtein(new JniInchiAtom(1L));
            a.setStoichiometry(1L);
            jniAtoms.add(a);
            s = new JniInchiStructure(jniAtoms, jni);
    }
		
	@Test
	void addAtomAddsAtom_0() {
            JniInchiAtom atom1 = s.addAtom(a);
            assertSame(atom1, a);
    }
		
	@Test
	void addAtomAddsInChi_0() {
        double expected = 3.5;
        a.addInChi( expected );
        assertEquals( expected, a.getInChi(),.000001);
    }
}