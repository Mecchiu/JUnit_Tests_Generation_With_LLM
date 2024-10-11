import org.apache.axis.description.TypeDesc;

public class _CompleteResponseTest {

    /**
     * Test case for getTypeDesc method when TypeDesc object is not null
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = _CompleteResponse.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test case for getTypeDesc method when TypeDesc object is null
     */
    @Test
    public void testGetTypeDescNull() {
        TypeDesc typeDesc = null;
        _CompleteResponse completeResponse = new _CompleteResponse();
        assertEquals(typeDesc, completeResponse.getTypeDesc());
    }

    /**
     * Test case for getTypeDesc method when TypeDesc object has correct name
     */
    @Test
    public void testGetTypeDescName() {
        TypeDesc typeDesc = _CompleteResponse.getTypeDesc();
        assertEquals("_CompleteResponse", typeDesc.getName());
    }

    /**
     * Test case for getTypeDesc method when TypeDesc object has correct namespace
     */
    @Test
    public void testGetTypeDescNamespace() {
        TypeDesc typeDesc = _CompleteResponse.getTypeDesc();
        assertEquals("mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test case for getTypeDesc method when TypeDesc object has correct serializer
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = _CompleteResponse.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test case for getTypeDesc method when TypeDesc object has correct deserializer
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = _CompleteResponse.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }

    /**
     * Test case for getTypeDesc method when TypeDesc object has correct type
     */
    @Test
    public void testGetTypeDescType() {
        TypeDesc typeDesc = _CompleteResponse.getTypeDesc();
        assertEquals(_CompleteResponse.class, typeDesc.getTypeClass());
    }

    /**
     * Test case for getTypeDesc method when TypeDesc object has correct element name
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = _CompleteResponse.getTypeDesc();
        assertEquals("_CompleteResponse", typeDesc.getXmlType());
    }

    /**
     * Test case for getTypeDesc method when TypeDesc object has correct element namespace
     */
    @Test
    public void testGetTypeDescElementNamespace() {
        TypeDesc typeDesc = _CompleteResponse.getTypeDesc();
        assertEquals("mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }
}