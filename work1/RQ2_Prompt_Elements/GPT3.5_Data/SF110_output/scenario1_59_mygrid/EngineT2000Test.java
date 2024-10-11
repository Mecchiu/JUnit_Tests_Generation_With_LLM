import org.apache.axis.description.TypeDesc;

public class EngineTest {

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object is an instance of org.apache.axis.description.TypeDesc.
     */
    @Test
    public void testGetTypeDescInstanceOf() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertTrue(typeDesc instanceof org.apache.axis.description.TypeDesc);
    }

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertEquals("Engine", typeDesc.getTypeName());
    }

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertEquals("http://mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    public void testGetTypeDescNamespacePrefix() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertEquals("mygrid", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertEquals("engine", typeDesc.getXmlType());
    }

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element namespace URI.
     */
    @Test
    public void testGetTypeDescElementNamespaceURI() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertEquals("http://mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element namespace prefix.
     */
    @Test
    public void testGetTypeDescElementNamespacePrefix() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertEquals("mygrid", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link Engine#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = Engine.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }
}