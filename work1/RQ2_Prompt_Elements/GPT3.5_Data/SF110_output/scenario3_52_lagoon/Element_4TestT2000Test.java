// Here's an implementation of the test class for the Element class:

package nu.staldal.xtree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Element_4Test {

    @Test
    void testGetAttributeType() {
        // Create an element with some attributes
        Element element = new Element("test");
        element.addAttribute("attr1", "value1", "CDATA");
        element.addAttribute("attr2", "value2", "IDREF");

        // Test getting the attribute type for each attribute
        assertEquals("CDATA", element.getAttributeType(0));
        assertEquals("IDREF", element.getAttributeType(1));

        // Test getting the attribute type for an invalid index
        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeType(-1);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeType(2);
        });
    }
}