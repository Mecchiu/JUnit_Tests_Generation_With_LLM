// ArrayOfString_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfString_2Test {
		static String testString = "{ \"string_valueList\" : [ \"string1\", \"string2\" ] }";

    /**
     * Test of getTypeDesc method, of class mygrid.web.ArrayOfString with member variable string.
     */
    @Test
    public void testGetTypeDesc() {
        ArrayOfString instance = new ArrayOfString();
        instance.setString(testString);
        String expected = "{\"type\":\"ArrayOfString\",\"value\":{\"stringValueList\":{\"type\":\"string\",\"value\":\"string1\",\"value\":\"string2\"}}}}";
        assertEquals(expected, instance.getTypeDesc().toString());
    }

}