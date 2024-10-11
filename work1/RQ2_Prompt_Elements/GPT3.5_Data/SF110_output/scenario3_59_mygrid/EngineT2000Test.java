import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains ten unit test cases for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {

    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(Engine.getTypeDesc());
    }

    @Test
    void testGetTypeDescInstanceOfTypeDesc() {
        assertTrue(Engine.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
    }

    @Test
    void testGetTypeDescHasCorrectXmlType() {
        assertEquals("urn:mygrid-web", Engine.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals("Engine", Engine.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void testGetTypeDescHasCorrectElementQName() {
        assertEquals(new javax.xml.namespace.QName("urn:mygrid-web", "Engine"), Engine.getTypeDesc().getElementQName());
    }

    @Test
    void testGetTypeDescHasCorrectTypeQName() {
        assertEquals(new javax.xml.namespace.QName("urn:mygrid-web", "Engine"), Engine.getTypeDesc().getTypeQName());
    }

    @Test
    void testGetTypeDescHasCorrectSerializer() {
        assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, Engine.getTypeDesc().getSerializerClass());
    }

    @Test
    void testGetTypeDescHasCorrectDeserializer() {
        assertEquals(org.apache.axis.encoding.ser.BeanDeserializer.class, Engine.getTypeDesc().getDeserializerClass());
    }

    @Test
    void testGetTypeDescHasCorrectFields() {
        assertEquals(0, Engine.getTypeDesc().getFields().length);
    }

    @Test
    void testGetTypeDescHasCorrectXmlTypeString() {
        assertEquals("{" + "urn:mygrid-web" + "}Engine", Engine.getTypeDesc().getXmlTypeString());
    }

    @Test
    void testGetTypeDescHasCorrectXmlTypeStringWithPrefix() {
        assertEquals("mygrid-web:Engine", Engine.getTypeDesc().getXmlTypeString("mygrid-web"));
    }
}