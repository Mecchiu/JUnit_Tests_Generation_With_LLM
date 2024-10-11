// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {

    /**
     * Test of getTypeDesc method, of class ArrayOfString.
     */
    @Test
    public void testGetTypeDesc_E() {
        System.out.println("getTypeDesc");
        ArrayOfString instance;
        instance = new ArrayOfString();
        String expResult = "";
        String result = instance.getTypeDesc();
        assertEquals(expResult, result);
    }
}
