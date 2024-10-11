import org.apache.axis.description.TypeDesc;

public class _CompleteTest {

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description object is of type TypeDesc.
     */
    @Test
    public void testGetTypeDescType() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertTrue(typeDesc instanceof TypeDesc);
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description object has the correct XML type name.
     */
    @Test
    public void testGetTypeDescXmlTypeName() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertEquals("_Complete", typeDesc.getXmlType());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertEquals("http://mygrid/web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description object has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description object has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description object has the correct type mapping.
     */
    @Test
    public void testGetTypeDescTypeMapping() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc.getTypeMapping());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertEquals("_Complete", typeDesc.getElementName());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description object has the correct element namespace URI.
     */
    @Test
    public void testGetTypeDescElementNamespaceURI() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertEquals("http://mygrid/web", typeDesc.getElementQName().getNamespaceURI());
    }
}