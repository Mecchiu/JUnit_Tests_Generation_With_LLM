import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContextElementTest {

    @Test
    void getTypeDesc_returnsTypeDescObject() {
        assertNotNull(ContextElement.getTypeDesc());
        assertTrue(ContextElement.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
    }

    @Test
    void getTypeDesc_returnsSameObject() {
        org.apache.axis.description.TypeDesc typeDesc1 = ContextElement.getTypeDesc();
        org.apache.axis.description.TypeDesc typeDesc2 = ContextElement.getTypeDesc();
        assertSame(typeDesc1, typeDesc2);
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlType() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        assertEquals(new javax.xml.namespace.QName("http://web.mygrid", "ContextElement"), typeDesc.getXmlType());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectElementName() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        assertEquals("ContextElement", typeDesc.getElementName());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectNamespaceURI() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        assertEquals("http://web.mygrid", typeDesc.getXmlType().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectFields() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        assertEquals(2, typeDesc.getFieldCount());
        assertEquals("name", typeDesc.getFieldDesc(0).getFieldName());
        assertEquals(java.lang.String.class, typeDesc.getFieldDesc(0).getFieldType());
        assertEquals("content", typeDesc.getFieldDesc(1).getFieldName());
        assertEquals(java.lang.String.class, typeDesc.getFieldDesc(1).getFieldType());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeNamespacePrefix() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        assertEquals("ns1", typeDesc.getXmlType().getPrefix());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeNamespacePrefixWhenPrefixIsSpecified() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.mygrid", "ContextElement", "myPrefix"));
        assertEquals("myPrefix", typeDesc.getXmlType().getPrefix());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeNamespacePrefixWhenNamespaceURIIsDefault() {
        org.apache.axis.description.TypeDesc typeDesc = ContextElement.getTypeDesc();
        typeDesc.setXmlType(new javax.xml.namespace.QName("ContextElement"));
        assertEquals("", typeDesc.getXmlType().getPrefix());
    }
}