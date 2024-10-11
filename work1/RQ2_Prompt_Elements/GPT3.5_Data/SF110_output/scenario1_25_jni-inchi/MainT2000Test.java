// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#getTestMolecule()} method.
*/
class MainTest {

    @Test
    void testAtomCount() {
        JniInchiStructure struct = Main.getTestMolecule();
        assertEquals(6, struct.getNumAtoms());
    }

    @Test
    void testBondCount() {
        JniInchiStructure struct = Main.getTestMolecule();
        assertEquals(5, struct.getNumBonds());
    }

    @Test
    void testAtomCoordinates() {
        JniInchiStructure struct = Main.getTestMolecule();
        JniInchiAtom atom = struct.getAtom(0);
        assertEquals(264.0, atom.getX(), 0.001);
        assertEquals(968.0, atom.getY(), 0.001);
        assertEquals(0.0, atom.getZ(), 0.001);
    }

    @Test
    void testAtomElement() {
        JniInchiStructure struct = Main.getTestMolecule();
        JniInchiAtom atom = struct.getAtom(2);
        assertEquals("N", atom.getElement());
    }

    @Test
    void testBondType() {
        JniInchiStructure struct = Main.getTestMolecule();
        JniInchiBond bond = struct.getBond(1);
        assertEquals(INCHI_BOND_TYPE.SINGLE, bond.getBondType());
    }

    @Test
    void testBondStereo() {
        JniInchiStructure struct = Main.getTestMolecule();
        JniInchiBond bond = struct.getBond(1);
        assertEquals(INCHI_BOND_STEREO.SINGLE_1DOWN, bond.getStereoDefinition());
    }

    @Test
    void testImplicitH() {
        JniInchiStructure struct = Main.getTestMolecule();
        JniInchiAtom atom = struct.getAtom(3);
        assertEquals(3, atom.getImplicitH());
    }

    @Test
    void testExplicitH() {
        JniInchiStructure struct = Main.getTestMolecule();
        JniInchiAtom atom = struct.getAtom(0);
        assertEquals(1, atom.getExplicitH());
    }

    @Test
    void testCharge() {
        JniInchiStructure struct = Main.getTestMolecule();
        JniInchiAtom atom = struct.getAtom(4);
        assertEquals(0, atom.getCharge());
    }

    @Test
    void testRadical() {
        JniInchiStructure struct = Main.getTestMolecule();
        JniInchiAtom atom = struct.getAtom(5);
        assertEquals(0, atom.getRadical());
    }
}