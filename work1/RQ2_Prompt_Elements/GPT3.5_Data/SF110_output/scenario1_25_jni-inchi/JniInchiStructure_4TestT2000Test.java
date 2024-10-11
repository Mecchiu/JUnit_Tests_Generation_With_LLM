// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {

    @Test
    void testGetBondWithValidIndex() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        structure.bondList.add(bond);
        assertEquals(bond, structure.getBond(0));
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
            structure.getBond(1);
        });
    }

    @Test
    void testGetBondWithEmptyList() {
        JniInchiStructure structure = new JniInchiStructure();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithNullList() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.bondList = null;
        assertThrows(NullPointerException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithInvalidType() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.bondList.add(new Object());
        assertThrows(ClassCastException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithNullElement() {
        JniInchiStructure structure = new JniInchiStructure();
        structure.bondList.add(null);
        assertThrows(NullPointerException.class, () -> {
            structure.getBond(0);
        });
    }

    @Test
    void testGetBondWithMultipleElements() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond();
        JniInchiBond bond2 = new JniInchiBond();
        structure.bondList.add(bond1);
        structure.bondList.add(bond2);
        assertEquals(bond1, structure.getBond(0));
        assertEquals(bond2, structure.getBond(1));
    }

    @Test
    void testGetBondWithSameElementMultipleTimes() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        structure.bondList.add(bond);
        assertEquals(bond, structure.getBond(0));
        assertEquals(bond, structure.getBond(0));
    }

    @Test
    void testGetBondWithDifferentElements() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiBond bond1 = new JniInchiBond();
        JniInchiBond bond2 = new JniInchiBond();
        structure.bondList.add(bond1);
        structure.bondList.add(bond2);
        assertNotEquals(bond1, structure.getBond(1));
    }
}