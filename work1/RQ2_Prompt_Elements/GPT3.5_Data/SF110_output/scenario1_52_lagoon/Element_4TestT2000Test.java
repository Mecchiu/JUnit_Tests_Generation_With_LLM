// Here's an example implementation of the Element_4Test class with ten unit test cases for the getAttributeType method:

package nu.staldal.xtree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Element_4Test {

    @Test
    void testGetAttributeTypeWithValidIndex() {
        Element element = new Element();
        element.addAttribute("name", "value", "type");
        assertEquals("type", element.getAttributeType(0));
    }

    @Test
    void testGetAttributeTypeWithNegativeIndex() {
        Element element = new Element();
        assertNull(element.getAttributeType(-1));
    }

    @Test
    void testGetAttributeTypeWithIndexOutOfBounds() {
        Element element = new Element();
        assertNull(element.getAttributeType(0));
    }

    @Test
    void testGetAttributeTypeWithNoAttributes() {
        Element element = new Element();
        assertNull(element.getAttributeType(0));
    }

    @Test
    void testGetAttributeTypeWithMultipleAttributes() {
        Element element = new Element();
        element.addAttribute("name1", "value1", "type1");
        element.addAttribute("name2", "value2", "type2");
        assertEquals("type1", element.getAttributeType(0));
        assertEquals("type2", element.getAttributeType(1));
    }

    @Test
    void testGetAttributeTypeWithNullAttributeType() {
        Element element = new Element();
        element.addAttribute("name", "value", null);
        assertNull(element.getAttributeType(0));
    }

    @Test
    void testGetAttributeTypeWithEmptyAttributeType() {
        Element element = new Element();
        element.addAttribute("name", "value", "");
        assertEquals("", element.getAttributeType(0));
    }

    @Test
    void testGetAttributeTypeWithNonStringAttributeType() {
        Element element = new Element();
        element.addAttribute("name", "value", new Integer(123));
        assertNull(element.getAttributeType(0));
    }

    @Test
    void testGetAttributeTypeWithNonexistentAttribute() {
        Element element = new Element();
        assertNull(element.getAttributeType(0));
    }

    @Test
    void testGetAttributeTypeWithMixedAttributeTypes() {
        Element element = new Element();
        element.addAttribute("name1", "value1", "type1");
        element.addAttribute("name2", "value2", null);
        element.addAttribute("name3", "value3", "");
        element.addAttribute("name4", "value4", new Integer(123));
        assertEquals("type1", element.getAttributeType(0));
        assertNull(element.getAttributeType(1));
        assertEquals("", element.getAttributeType(2));
        assertNull(element.getAttributeType(3));
    }
}