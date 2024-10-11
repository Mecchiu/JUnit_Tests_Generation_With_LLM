// Here's an implementation of the JniInchiStructure_4Test class with ten unit test cases for the getBond() method.

class JniInchiStructure_4Test {

    @Test
    void testGetBondWithValidIndex() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = structure.getBond(0);
        assertNotNull(bond);
    }

    @Test
    void testGetBondWithNegativeIndex() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getBond(-1);
        });
    }

    @Test
    void testGetBondWithIndexGreaterThanSize() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getBond(100);
        });
    }

    @Test
    void testGetBondWithEmptyStructure() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithNullStructure() {
        JniInchiStructure structure = null;
        assertThrows(NullPointerException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithMultipleBonds() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.addBond(new JniInchiBond());
        structure.addBond(new JniInchiBond());
        JniInchiBond bond = structure.getBond(1);
        assertNotNull(bond);
    }

    @Test
    void testGetBondWithDifferentBondTypes() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.addBond(new JniInchiBond(JniInchiBond.BondType.SINGLE));
        structure.addBond(new JniInchiBond(JniInchiBond.BondType.DOUBLE));
        JniInchiBond bond = structure.getBond(1);
        assertEquals(JniInchiBond.BondType.DOUBLE, bond.getBondType());
    }

    @Test
    void testGetBondWithDifferentStereochemistry() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.addBond(new JniInchiBond(JniInchiBond.Stereo.NONE));
        structure.addBond(new JniInchiBond(JniInchiBond.Stereo.UP));
        JniInchiBond bond = structure.getBond(1);
        assertEquals(JniInchiBond.Stereo.UP, bond.getStereo());
    }

    @Test
    void testGetBondWithDifferentTopology() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.addBond(new JniInchiBond(JniInchiBond.Topology.EITHER));
        structure.addBond(new JniInchiBond(JniInchiBond.Topology.HATCH));
        JniInchiBond bond = structure.getBond(1);
        assertEquals(JniInchiBond.Topology.HATCH, bond.getTopology());
    }

    @Test
    void testGetBondWithDifferentLength() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.addBond(new JniInchiBond());
        structure.addBond(new JniInchiBond());
        JniInchiBond bond = structure.getBond(1);
        assertEquals(2, structure.getBondCount());
    }
}