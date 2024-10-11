package mygrid.web;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Engine_1Test {

    @Test
    void testGetTypeDesc() {
        // Test case 1
        assertNotNull(Engine.getTypeDesc());

        // Test case 2
        assertEquals("http://tempuri.org/", Engine.getTypeDesc().getXmlType().getNamespaceURI());

        // Test case 3
        assertEquals("Engine", Engine.getTypeDesc().getXmlType().getLocalPart());

        // Test case 4
        assertNotNull(Engine.getTypeDesc().getFieldDesc("id"));

        // Test case 5
        assertNotNull(Engine.getTypeDesc().getFieldDesc("name"));

        // Test case 6
        assertNotNull(Engine.getTypeDesc().getFieldDesc("RAM"));

        // Test case 7
        assertNotNull(Engine.getTypeDesc().getFieldDesc("CPU"));

        // Test case 8
        assertNotNull(Engine.getTypeDesc().getFieldDesc("OS"));

        // Test case 9
        assertEquals(0, Engine.getTypeDesc().getFieldDesc("id").getMinOccurs());

        // Test case 10
        assertEquals(0, Engine.getTypeDesc().getFieldDesc("OS").getMinOccurs());
    }
}
