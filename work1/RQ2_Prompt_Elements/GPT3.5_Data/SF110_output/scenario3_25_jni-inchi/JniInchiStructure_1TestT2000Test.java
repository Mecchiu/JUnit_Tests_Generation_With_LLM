// JniInchiStructure_1Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructure_1Test {

    /**
     * Test case for adding a bond to an empty structure.
     */
    @Test
    void testAddBondToEmptyStructure() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond addedBond = structure.addBond(bond);
        assertNotNull(addedBond);
        assertEquals(bond, addedBond);
    }

    /**
     * Test case for adding a bond to a structure with existing bonds.
     */
    @Test
    void testAddBondToNonEmptyStructure() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond bond2 = new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE);
        structure.addBond(bond1);
        JniInchiBond addedBond = structure.addBond(bond2);
        assertNotNull(addedBond);
        assertEquals(bond2, addedBond);
    }

    /**
     * Test case for adding a null bond to a structure.
     */
    @Test
    void testAddNullBond() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond addedBond = structure.addBond(null);
        assertNull(addedBond);
    }

    /**
     * Test case for adding a bond with invalid atom indices to a structure.
     */
    @Test
    void testAddBondWithInvalidAtomIndices() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond(0, 1, JniInchiBond.BondType.SINGLE);
        JniInchiBond addedBond = structure.addBond(bond);
        assertNull(addedBond);
    }

    /**
     * Test case for adding a bond with invalid bond type to a structure.
     */
    @Test
    void testAddBondWithInvalidBondType() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond(1, 2, null);
        JniInchiBond addedBond = structure.addBond(bond);
        assertNull(addedBond);
    }

    /**
     * Test case for adding a duplicate bond to a structure.
     */
    @Test
    void testAddDuplicateBond() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        structure.addBond(bond);
        JniInchiBond addedBond = structure.addBond(bond);
        assertNull(addedBond);
    }

    /**
     * Test case for adding multiple bonds to a structure.
     */
    @Test
    void testAddMultipleBonds() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond bond2 = new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE);
        JniInchiBond bond3 = new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE);
        structure.addBond(bond1);
        structure.addBond(bond2);
        JniInchiBond addedBond = structure.addBond(bond3);
        assertNotNull(addedBond);
        assertEquals(bond3, addedBond);
    }

    /**
     * Test case for adding bonds to a structure in reverse order.
     */
    @Test
    void testAddBondsInReverseOrder() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond bond2 = new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE);
        JniInchiBond bond3 = new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE);
        structure.addBond(bond3);
        structure.addBond(bond2);
        JniInchiBond addedBond = structure.addBond(bond1);
        assertNotNull(addedBond);
        assertEquals(bond1, addedBond);
    }

    /**
     * Test case for adding bonds to a structure with invalid order.
     */
    @Test
    void testAddBondsInInvalidOrder() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond bond2 = new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE);
        JniInchiBond bond3 = new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE);
        structure.addBond(bond1);
        JniInchiBond addedBond = structure.addBond(bond3);
        assertNull(addedBond);
    }

    /**
     * Test case for adding bonds to a structure with invalid bond types.
     */
    @Test
    void testAddBondsWithInvalidBondTypes() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE);
        JniInchiBond bond2 = new JniInchiBond(2, 3, null);
        JniInchiBond bond3 = new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE);
        structure.addBond(bond1);
        JniInchiBond addedBond = structure.addBond(bond2);
        assertNull(addedBond);
    }

}