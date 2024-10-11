// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {

    @Test
    void testGetAtom() {
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        JniInchiAtom atom3 = new JniInchiAtom();
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        atomList.add(atom2);
        atomList.add(atom3);
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = atomList;

        assertEquals(atom1, structure.getAtom(0));
        assertEquals(atom2, structure.getAtom(1));
        assertEquals(atom3, structure.getAtom(2));
    }

    @Test
    void testGetAtomIndexOutOfBounds() {
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        atomList.add(atom2);
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = atomList;

        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(2);
        });
    }

    @Test
    void testGetAtomNegativeIndex() {
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        atomList.add(atom2);
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = atomList;

        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(-1);
        });
    }

    @Test
    void testGetAtomEmptyList() {
        List<JniInchiAtom> atomList = new ArrayList<>();
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = atomList;

        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(0);
        });
    }

    @Test
    void testGetAtomNullList() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = null;

        assertThrows(NullPointerException.class, () -> {
            structure.getAtom(0);
        });
    }

    @Test
    void testGetAtomType() {
        JniInchiAtom atom1 = new JniInchiAtom();
        atom1.atomType = "C";
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.atomType = "O";
        JniInchiAtom atom3 = new JniInchiAtom();
        atom3.atomType = "N";
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        atomList.add(atom2);
        atomList.add(atom3);
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = atomList;

        assertEquals("C", structure.getAtom(0).atomType);
        assertEquals("O", structure.getAtom(1).atomType);
        assertEquals("N", structure.getAtom(2).atomType);
    }

    @Test
    void testGetAtomCharge() {
        JniInchiAtom atom1 = new JniInchiAtom();
        atom1.charge = 1;
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.charge = -1;
        JniInchiAtom atom3 = new JniInchiAtom();
        atom3.charge = 0;
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        atomList.add(atom2);
        atomList.add(atom3);
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = atomList;

        assertEquals(1, structure.getAtom(0).charge);
        assertEquals(-1, structure.getAtom(1).charge);
        assertEquals(0, structure.getAtom(2).charge);
    }

    @Test
    void testGetAtomImplicitH() {
        JniInchiAtom atom1 = new JniInchiAtom();
        atom1.implicitH = 1;
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.implicitH = 2;
        JniInchiAtom atom3 = new JniInchiAtom();
        atom3.implicitH = 0;
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        atomList.add(atom2);
        atomList.add(atom3);
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = atomList;

        assertEquals(1, structure.getAtom(0).implicitH);
        assertEquals(2, structure.getAtom(1).implicitH);
        assertEquals(0, structure.getAtom(2).implicitH);
    }

    @Test
    void testGetAtomExplicitH() {
        JniInchiAtom atom1 = new JniInchiAtom();
        atom1.explicitH = 1;
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.explicitH = 2;
        JniInchiAtom atom3 = new JniInchiAtom();
        atom3.explicitH = 0;
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        atomList.add(atom2);
        atomList.add(atom3);
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = atomList;

        assertEquals(1, structure.getAtom(0).explicitH);
        assertEquals(2, structure.getAtom(1).explicitH);
        assertEquals(0, structure.getAtom(2).explicitH);
    }

    @Test
    void testGetAtomMass() {
        JniInchiAtom atom1 = new JniInchiAtom();
        atom1.mass = 12.01;
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.mass = 15.99;
        JniInchiAtom atom3 = new JniInchiAtom();
        atom3.mass = 14.01;
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        atomList.add(atom2);
        atomList.add(atom3);
        JniInchiStructure structure = new JniInchiStructure();
        structure.atomList = atomList;

        assertEquals(12.01, structure.getAtom(0).mass);
        assertEquals(15.99, structure.getAtom(1).mass);
        assertEquals(14.01, structure.getAtom(2).mass);
    }

}