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
double f = 7.3;
		
    /**
     * {@link #f} test. 
     * Sets the JNI f field of a JniInchiStructure instance to the passed value.
     */
    private void fTest () {
        JniInchiStructure structure = new JniInchiStructure();
        structure.setF(5.75);
        assertEquals(5.75, structure.f, 0.0);
    }
    
    /**
     * Test {@link #addAtom(JniInchiAtom)}.
     */
    @Test
    public void addAtom1 () {
        fTest();
    }

    /**
     * Test {@link #retainAtoms().
     */
    @Test
    public void retainAtoms () {
        fTest();
    }

    /**
     * Test {@link #setF(double)}.
     */
    @Test
    public void setF () {
        fTest();
    }
    
    /**
     * Tests {@link #getF()}.
     */
    @Test
    public void getF () {
        assertNotNull(f);
    }

    /**
     * Test {@link #getAtoms()}.
     *
     * @throws Exception if something goes wrong
     */
    @Test
    public void getAtoms () {
        assertNotNull(f.a);
        assertNotNull(f.b);
        assertNotNull(f.c);
        assertNotNull(f.d);
        List<JniInchiAtom> atoms = f.a.getAtoms();
        assertNotNull(atoms);
        assertEquals(3, atoms.size());
        for (JniInchiAtom atom : atoms) {
            assertEquals(0, atom.order);
            assertTrue(atom.structure.f > 0);
            List<String> names = atom.name.toStringArray();
            assertEquals(3, names.size());
            assertEquals(atom.a.getName(), names.get(0));
            assertEquals(atom.b.getName(), names.get(1));
            assertEquals(atom.c.getName(), names.get(2));
        }
    }

    /**
     * Test {@link #getF()} is readonly.
     */
    @Test
    public void getFIsReadonly () {
        assertFalse(f.getF()!= f);
    }

    /**
     * Test {@link #getAtoms()} is readonly.
     */
    @Test
    public void getAtomsIsReadonly () {
        assertFalse(f.getAtoms()!= f.a);
    }
    
    /**
     * Tests {@link #removeAtoms(List)}
     * 
     * @throws Exception if something goes wrong
     */
    @Test
    public void removeAtoms (List<JniInchiAtom> atomsRemaining) {
        List<JniInchiAtom> atomsToRemove = new ArrayList<JniInchiAtom>();
        assertNotNull(f.a);
        assertNotNull(f.b);
        assertNotNull(f.c);
        
        f.a.removeAtoms(atomsRemoved);
        
        for (JniInchiAtom atom : f.a.getAtoms()) {
            if (!atomsToRemove.contains(atom)) {
                assertTrue(f.a.removeAtom(atom));
            } else {
                throw new IllegalStateException("AtomsToRemove contains one atom that is not in atomsToRemove.");
            }
        }
        
        acquireLock(f);
        f.a.removeAtoms(atomsToRemove);
        f.a.removeAtoms(new ArrayList<JniInchiAtom>(atomsToRemove));
        f.releaseLock();

        acquireLock(f);
        for (JniInchiAtom atom : f.a.getAtoms()) {
            fail("Cannot remove atom from non atom list.");
        }
        f.b.removeAtoms(f.a.getAtoms());
        acquireLock(f);
        f.b.removeAtoms(f.a.getAtoms());
        acquireLock(f);
    } 
    
    /**
     * Adds one atom to the end of the list, and then tests that it
     * actually removes it.
     * 
     * @throws Exception if something goes wrong
     */
    @Test
    public void addAtomList_RemoveNotInAtoms (void) throws Exception {
        List<JniInchiAtom> atoms = new ArrayList<JniInchiAtom>();
        f.retainAtoms(atoms);
        assertFalse("AtomsToRemove contains one atom that is not in atomsToRemove.", f.a.getAtoms().contains(atoms.get(0)));
        f.addAtom(new JniInchiAtom("New Atom"));
        acquireLock(f);
        f.addAtom(new JniInchiAtom("New Atom"));
        acquireLock(f);
        listToRemove.add(listToRemove.size() - 1);
        acquireLock(f);
        listToRemove.remove(listToRemove.size() - 1);
        acquireLock(f);
        assertTrue("AtomsToRemove contains one atom that is not in atomsToRemove.", f.a.getAtoms().contains(f.a.getAtoms().get(0)));
        f.a.removeAtoms(f.a.getAtoms());
        f.releaseLock();        
    }

    public JniInchiStructure() {
        acquireLock(f);
        listToRemove = new ArrayList<JniInchiAtom>();
        f.addAtomList_RemoveNotInAtoms();
        acquireLock(f);
        listToRemove.add(f.a.getAtoms().get(0));
        acquireLock(f);
    }
    
    public static void test (String testName) {
        JniInchiStructure structure = new JniInchiStructure();
        structure.f = 5.75;
        assertEquals(5.75, structure.f, 0);   
        assertNotNull(f.retainAtoms());
        assertNotNull(f.a);
        assertNotNull(f.b);
        assertNotNull(f.c);
        
        structure.setF(5.75);
        assertEquals(5.75, structure.f, 0);   
        assertNotNull(structure.retainAtoms());
        assertNotNull(structure.a);
        assertNotNull(structure.b);
        assertNotNull(structure.c);
        
        structure.setF(f);
        assertEquals(f, structure.f);   
        assertNotNull(structure.retainAtoms());
        assertNotNull(structure.a);
        assertNotNull(structure.b);
        assertNotNull(structure.c);
        
        structure.setF(f.a);
        assertEquals(f, structure.f);   
        assertNotNull(structure.retainAtoms());
        assertNotNull(f);
        