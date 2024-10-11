// SearchResultElementTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains one unit test case for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {

    /**
     * Verify null. It throws NullPointerException when set this method as value.
     */
    @Test
    public void nullTest() {
        String x00 = null;
        assertNull(x00);
    }

    /**
     * Verify not null. It throws NullPointerException when set it as value.
     */
    @Test
    public void notNullTest() {
        String x = "ABC";
        String expected = "N/A";
        assertNotNull(expected);
    }

    /**
     * Verify no arguments for this class.
     */
    @Test
    public void hasNoArgNull() {
        String x = null;
        assertFalse(x.equals(null));
    }

    /**
     * Verify no arguments for this class.
     */
    @Test
    public void hasNoArgNotNull() {
        String x = "ABC";
        assertEquals(x, null);
    }

    /**
     * Verify two arguments for this class.
     */
    @Test
    public void hasTwoArgsNotNull() {
        String x = "ABC";
        String x2 = "ABC";
        assertEquals(x, x2);
    }

    /**
     * Verify arguments for this class.
     */
    @Test
    public void hasTwoArgsNull() {
        String x = "ABC";
        assertEquals(x, null);
    }


    TypeDesc typeDesc;

    public void setTypeDesc(TypeDesc typeDesc) {
        this.typeDesc= typeDesc;

    }

    public TypeDesc basicGetTypeDesc() {
        return typeDesc;
    }

}
