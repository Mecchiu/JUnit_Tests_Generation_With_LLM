// Here's an implementation of the JniInchiStructure_1Test class with ten unit test cases for the addBond method:

class JniInchiStructure_1Test {

    @Test
    void testAddBond() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond addedBond = structure.addBond(bond);
        assertEquals(bond, addedBond);
    }

    @Test
    void testAddMultipleBonds() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond bond2 = new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE);
        JniInchiBond bond3 = new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE);
        structure.addBond(bond1);
        structure.addBond(bond2);
        structure.addBond(bond3);
        List<JniInchiBond> expectedBonds = new ArrayList<>();
        expectedBonds.add(bond1);
        expectedBonds.add(bond2);
        expectedBonds.add(bond3);
        assertEquals(expectedBonds, structure.getBondList());
    }

    @Test
    void testAddNullBond() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(NullPointerException.class, () -> {
            structure.addBond(null);
        });
    }

    @Test
    void testAddDuplicateBond() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        structure.addBond(bond);
        assertThrows(IllegalArgumentException.class, () -> {
            structure.addBond(bond);
        });
    }

    @Test
    void testAddBondWithInvalidAtomIndex() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond(0, 1, JniInchiBond.BondType.SINGLE);
        assertThrows(IllegalArgumentException.class, () -> {
            structure.addBond(bond);
        });
    }

    @Test
    void testAddBondWithInvalidBondType() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond(1, 2, null);
        assertThrows(IllegalArgumentException.class, () -> {
            structure.addBond(bond);
        });
    }

    @Test
    void testGetBondList() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond bond2 = new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE);
        JniInchiBond bond3 = new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE);
        structure.addBond(bond1);
        structure.addBond(bond2);
        structure.addBond(bond3);
        List<JniInchiBond> expectedBonds = new ArrayList<>();
        expectedBonds.add(bond1);
        expectedBonds.add(bond2);
        expectedBonds.add(bond3);
        assertEquals(expectedBonds, structure.getBondList());
    }

    @Test
    void testGetBondListWithNoBonds() {
        JniInchiStructure structure = new JniInchiStructure();
        List<JniInchiBond> expectedBonds = new ArrayList<>();
        assertEquals(expectedBonds, structure.getBondList());
    }

    @Test
    void testGetBondListIsUnmodifiable() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        structure.addBond(bond);
        List<JniInchiBond> bondList = structure.getBondList();
        assertThrows(UnsupportedOperationException.class, () -> {
            bondList.add(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE));
        });
    }

    @Test
    void testAddBondAfterGettingBondList() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond bond2 = new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE);
        structure.addBond(bond1);
        List<JniInchiBond> bondList = structure.getBondList();
        structure.addBond(bond2);
        List<JniInchiBond> expectedBonds = new ArrayList<>();
        expectedBonds.add(bond1);
        assertEquals(expectedBonds, bondList);
    }

}