java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JniInchiStructure_3Test {

    @Test
    void testGetAtom() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        structure.addAtom(atom1);
        structure.addAtom(atom2);

        assertEquals(atom1, structure.getAtom(0));
        assertEquals(atom2, structure.getAtom(1));
    }

    @Test
    void testGetAtom_IndexOutOfBounds() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        structure.addAtom(atom1);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(1);
        });
    }

    @Test
    void testGetAtom_NullAtom() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        structure.addAtom(atom1);

        assertNull(structure.getAtom(1));
    }

    @Test
    void testGetAtom_EmptyStructure() {
        JniInchiStructure structure = new JniInchiStructure();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(0);
        });
    }

    @Test
    void testGetAtom_NegativeIndex() {
        JniInchiStructure structure = new JniInchiStructure();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(-1);
        });
    }

    @Test
    void testGetAtom_MultipleAtoms() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        JniInchiAtom atom3 = new JniInchiAtom();
        structure.addAtom(atom1);
        structure.addAtom(atom2);
        structure.addAtom(atom3);

        assertEquals(atom2, structure.getAtom(1));
    }

    @Test
    void testGetAtom_SameAtom() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        structure.addAtom(atom1);

        assertEquals(atom1, structure.getAtom(0));
    }

    @Test
    void testGetAtom_NullStructure() {
        JniInchiStructure structure = null;

        assertThrows(NullPointerException.class, () -> {
            structure.getAtom(0);
        });
    }

    @Test
    void testGetAtom_IndexGreaterThanSize() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        structure.addAtom(atom1);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(2);
        });
    }

    @Test
    void testGetAtom_IndexEqualToSize() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        structure.addAtom(atom1);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(1);
        });
    }
}
