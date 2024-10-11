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
        List<JniInchiAtom> atoms = new ArrayList<>();
        atoms.add(atom1);
        atoms.add(atom2);
        atoms.add(atom3);
        JniInchiStructure structure = new JniInchiStructure(atoms);
        
        assertEquals(atom1, structure.getAtom(0));
        assertEquals(atom2, structure.getAtom(1));
        assertEquals(atom3, structure.getAtom(2));
    }
    
    @Test
    void testGetAtomIndexOutOfBounds() {
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        List<JniInchiAtom> atoms = new ArrayList<>();
        atoms.add(atom1);
        atoms.add(atom2);
        JniInchiStructure structure = new JniInchiStructure(atoms);
        
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(2);
        });
    }
    
    @Test
    void testGetAtomNegativeIndex() {
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        List<JniInchiAtom> atoms = new ArrayList<>();
        atoms.add(atom1);
        atoms.add(atom2);
        JniInchiStructure structure = new JniInchiStructure(atoms);
        
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(-1);
        });
    }
    
    @Test
    void testGetAtomEmptyStructure() {
        List<JniInchiAtom> atoms = new ArrayList<>();
        JniInchiStructure structure = new JniInchiStructure(atoms);
        
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getAtom(0);
        });
    }
    
    @Test
    void testGetAtomNullStructure() {
        JniInchiStructure structure = new JniInchiStructure(null);
        
        assertThrows(NullPointerException.class, () -> {
            structure.getAtom(0);
        });
    }
    
    @Test
    void testGetAtomNullAtom() {
        List<JniInchiAtom> atoms = new ArrayList<>();
        atoms.add(null);
        JniInchiStructure structure = new JniInchiStructure(atoms);
        
        assertNull(structure.getAtom(0));
    }
    
    @Test
    void testGetAtomMultipleNullAtoms() {
        List<JniInchiAtom> atoms = new ArrayList<>();
        atoms.add(null);
        atoms.add(null);
        atoms.add(null);
        JniInchiStructure structure = new JniInchiStructure(atoms);
        
        assertNull(structure.getAtom(0));
        assertNull(structure.getAtom(1));
        assertNull(structure.getAtom(2));
    }
    
    @Test
    void testGetAtomMultipleNonNullAndNullAtoms() {
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        List<JniInchiAtom> atoms = new ArrayList<>();
        atoms.add(atom1);
        atoms.add(null);
        atoms.add(atom2);
        JniInchiStructure structure = new JniInchiStructure(atoms);
        
        assertEquals(atom1, structure.getAtom(0));
        assertNull(structure.getAtom(1));
        assertEquals(atom2, structure.getAtom(2));
    }
    
    @Test
    void testGetAtomMultipleNonNullAtoms() {
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        JniInchiAtom atom3 = new JniInchiAtom();
        List<JniInchiAtom> atoms = new ArrayList<>();
        atoms.add(atom1);
        atoms.add(atom2);
        atoms.add(atom3);
        JniInchiStructure structure = new JniInchiStructure(atoms);
        
        assertEquals(atom1, structure.getAtom(0));
        assertEquals(atom2, structure.getAtom(1));
        assertEquals(atom3, structure.getAtom(2));
    }
    
    @Test
    void testGetAtomMultipleNonNullAtomsWithSameIndex() {
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        JniInchiAtom atom3 = new JniInchiAtom();
        List<JniInchiAtom> atoms = new ArrayList<>();
        atoms.add(atom1);
        atoms.add(atom2);
        atoms.add(atom3);
        JniInchiStructure structure = new JniInchiStructure(atoms);
        
        assertEquals(atom1, structure.getAtom(0));
        assertEquals(atom1, structure.getAtom(0));
    }
}