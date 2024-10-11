// ArrayOfString_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfString_2Test {
		
    /**
     * Test the {@link ArrayOfString#getTypeDesc()} method.
     */
    @Test
    public void testGetTypeDesc() {
        final String[][] values = { {"a","b"},{"c","d"} };
        ArrayOfString _expected = new ArrayOfString();
        ArrayOfString _actual = _expected;
        assertTrue(ArrayOfString.getTypeDesc(values) == _actual.getTypeDesc());
    }
    
}