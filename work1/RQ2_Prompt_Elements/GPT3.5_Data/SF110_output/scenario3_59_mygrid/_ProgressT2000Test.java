import org.apache.axis.description.TypeDesc;

public class _ProgressTest {

    /**
     * Test method for {@link _Progress#getTypeDesc()}.
     * Verifies that the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = _Progress.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link _Progress#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = _Progress.getTypeDesc();
        assertEquals("_Progress", typeDesc.getTypeName());
    }

    /**
     * Test method for {@link _Progress#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = _Progress.getTypeDesc();
        assertEquals("http://mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link _Progress#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    public void testGetTypeDescNamespacePrefix() {
        TypeDesc typeDesc = _Progress.getTypeDesc();
        assertEquals("mygrid", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link _Progress#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = _Progress.getTypeDesc();
        assertEquals("_Progress", typeDesc.getXmlTypeLocalPart());
    }

    /**
     * Test method for {@link _Progress#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = _Progress.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link _Progress#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = _Progress.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }

    /**
     * Test method for {@link _Progress#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct type mapping.
     */
    @Test
    public void testGetTypeDescTypeMapping() {
        TypeDesc typeDesc = _Progress.getTypeDesc();
        assertNotNull(typeDesc.getTypeMapping());
    }

    /**
     * Test method for {@link _Progress#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct type class.
     */
    @Test
    public void testGetTypeDescTypeClass() {
        TypeDesc typeDesc = _Progress.getTypeDesc();
        assertEquals(_Progress.class, typeDesc.getTypeClass());
    }
}