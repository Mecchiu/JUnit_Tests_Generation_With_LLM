import org.apache.axis.description.TypeDesc;

public class _GetEngineTest {

    /**
     * Test method for {@link _GetEngine#getTypeDesc()}.
     * It tests if the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link _GetEngine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("_GetEngine", typeDesc.getTypeName());
    }

    /**
     * Test method for {@link _GetEngine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("http://mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link _GetEngine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    public void testGetTypeDescNamespacePrefix() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("ns1", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link _GetEngine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("_getEngine", typeDesc.getXmlTypeLocalPart());
    }

    /**
     * Test method for {@link _GetEngine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element namespace URI.
     */
    @Test
    public void testGetTypeDescElementNamespaceURI() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("http://mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link _GetEngine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element namespace prefix.
     */
    @Test
    public void testGetTypeDescElementNamespacePrefix() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("ns1", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link _GetEngine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link _GetEngine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }
}