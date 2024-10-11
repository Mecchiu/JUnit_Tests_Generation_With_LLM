```java
class JniInchiStructure_1Test {

    @Test
    void testAddBond() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        JniInchiBond bond = new JniInchiBond(atom1, atom2, 1);
        
        assertEquals(0, structure.getNumBonds());
        
        structure.addBond(bond);
        
        assertEquals(1, structure.getNumBonds());
        assertEquals(bond, structure.getBond(0));
    }

    @Test
    void testAddMultipleBonds() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        JniInchiAtom atom3 = new JniInchiAtom();
        JniInchiBond bond1 = new JniInchiBond(atom1, atom2, 1);
        JniInchiBond bond2 = new JniInchiBond(atom2, atom3, 2);
        
        assertEquals(0, structure.getNumBonds());
        
        structure.addBonds(bond1, bond2);
        
        assertEquals(2, structure.getNumBonds());
        assertEquals(bond1, structure.getBond(0));
        assertEquals(bond2, structure.getBond(1));
    }

}
```
