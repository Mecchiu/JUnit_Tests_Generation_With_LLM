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
		int i;
public test() {
		jniTest();
}
final void jniTest() {
        assertNull(getAtom(0));
	assertEquals(123034, getAtom(1).getValue());
	for (int i = 2; i < 5; i++) {
            setAtom(i, getAtom(i).copy());
        };
}

        void setAtom(final int atomIndex, final JniInchiAtom atom) {
            assertNull(getAtom(atomIndex));
            for (int i = 0; i < i; i++) {
                    setAtom(i, atom);
            };
            addAtom(atom);
        };

        void addAtom(final JniInchiAtom atom) {
		assertTrue(getAtomIndex() - 1 == atom.getIndex());
		assertEquals(atom.getValue(), atom.getValue());
		assertEquals(((JniInchiAtom) getAtom(getAtomIndex()).clone()).getValue(), atom.getValue());
		assertEquals(((JniInchiAtom) getAtom(getAtomIndex()).clone()).getIndex(), atom.getIndex());
		assertTrue(atomIndex == getAtomIndex() - 1);
		setAtom(atomIndex, atom);
        };

        void addAtoms(final int index, final int value) {
                assertEquals(index, getAtomIndex());
		for (int i = 0; i < i; i++) {
					setAtom(i, new JniInchiAtom(getAtom(i).clone(), value));
                };
		assertTrue(getAtoms(index).size() == value);
        };

        JniInchiStructure[] getAtoms(final int index) {
            ArrayList<JniInchiStructure> allAtoms = new ArrayList<JniInchiStructure>();
            int j = index;
            for (int i = 0; i < allAtoms.size(); ++i) {
                    j = getAtomIndex(j, i);
                    JniInchiStructure atom = getAtom(j);
                    List<String> l = atom.getAtoms(i);
                    allAtoms.add(atom);
            };
            return allAtoms.toArray(new JniInchiStructure[allAtoms.size()]);
        };

        int getAtomIndex(final int index, final int i) {
            return jniGetAtomIndex(index, i);
        };

        List<String> getAtoms(final int index) {
            if (0 == index) {
                return new ArrayList<String>();
            } else {
                return ((JniInchiStructure) getAtom(index).clone()).getAtoms(index);
            }
        };

	int jniGetAtomIndex(int index, int i) {
	if (index <= 2 || index > i) {
                throw new IllegalArgumentException("invalid index");
            };
            return i;
        };

        int addAtom(final JniInchiAtom atom) {
                int j = getAtomIndex(0, atom.getIndex());
                addAtoms(j, 1);
		return j;
        };

        List<JniInchiAtom> getAtoms() { return getAtoms(0); };

        int getAtomIndex() { return 0; }
        void addAtom() {};

        List<String> getAtomsString(int atomIndex) { return getAtomsString(getAtomIndex(atomIndex)); }

        int getAtomIndex(JniInchiAtom... atomArray);

        void setAtomIndex(int index, JniInchiAtom atom);
}