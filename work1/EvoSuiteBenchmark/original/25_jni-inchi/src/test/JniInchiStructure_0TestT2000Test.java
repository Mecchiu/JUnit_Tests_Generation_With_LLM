```java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JniInchiStructure_0Test {

    @Test
    void testAddAtom() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        
        assertEquals(0, structure.getNumAtoms());
        
        structure.addAtom(atom1);
        assertEquals(1, structure.getNumAtoms());
        assertEquals(atom1, structure.getAtom(0));
        
        structure.addAtom(atom2);
        assertEquals(2, structure.getNumAtoms());
        assertEquals(atom2, structure.getAtom(1));
    }

    @Test
    void testAddAtoms() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        
        assertEquals(0, structure.getNumAtoms());
        
        structure.addAtoms(atom1, atom2);
        assertEquals(2, structure.getNumAtoms());
        assertEquals(atom1, structure.getAtom(0));
        assertEquals(atom2, structure.getAtom(1));
    }

}
```
