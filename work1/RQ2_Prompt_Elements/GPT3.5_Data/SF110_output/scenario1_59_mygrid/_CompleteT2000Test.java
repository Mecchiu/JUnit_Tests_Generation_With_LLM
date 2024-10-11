import org.apache.axis.description.TypeDesc;

public class _CompleteTest {

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description is of type TypeDesc.
     */
    @Test
    public void testGetTypeDescType() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertTrue(typeDesc instanceof TypeDesc);
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description has the correct name.
     */
    @Test
    public void testGetTypeDescName() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertEquals("_Complete", typeDesc.getName());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description has the correct namespace.
     */
    @Test
    public void testGetTypeDescNamespace() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertEquals("mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description has the correct type mapping.
     */
    @Test
    public void testGetTypeDescTypeMapping() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertNotNull(typeDesc.getTypeMapping());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertEquals("_Complete", typeDesc.getXmlType());
    }

    /**
     * Test method for {@link _Complete#getTypeDesc()}.
     * Test case when the type description has the correct element namespace.
     */
    @Test
    public void testGetTypeDescElementNamespace() {
        TypeDesc typeDesc = _Complete.getTypeDesc();
        assertEquals("mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }
}