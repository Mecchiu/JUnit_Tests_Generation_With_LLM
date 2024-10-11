package mygrid.web;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContextElement_1Test {

    @Test
    void testGetTypeDesc() {
        // Test case 1
        assertNotNull(ContextElement.getTypeDesc());

        // Test case 2
        assertEquals("http://tempuri.org/", ContextElement.getTypeDesc().getXmlType().getNamespaceURI());

        // Test case 3
        assertEquals("ContextElement", ContextElement.getTypeDesc().getXmlType().getLocalPart());

        // Test case 4
        assertNotNull(ContextElement.getTypeDesc().getFieldDesc("name"));

        // Test case 5
        assertEquals("http://tempuri.org/", ContextElement.getTypeDesc().getFieldDesc("name").getXmlName().getNamespaceURI());

        // Test case 6
        assertEquals("Name", ContextElement.getTypeDesc().getFieldDesc("name").getXmlName().getLocalPart());

        // Test case 7
        assertNotNull(ContextElement.getTypeDesc().getFieldDesc("content"));

        // Test case 8
        assertEquals("http://tempuri.org/", ContextElement.getTypeDesc().getFieldDesc("content").getXmlName().getNamespaceURI());

        // Test case 9
        assertEquals("Content", ContextElement.getTypeDesc().getFieldDesc("content").getXmlName().getLocalPart());

        // Test case 10
        assertEquals(0, ContextElement.getTypeDesc().getFieldDesc("content").getMinOccurs());
    }
}
