import org.apache.axis.description.TypeDesc;

public class _LogonTest {

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertEquals("_Logon", typeDesc.getTypeName());
    }

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertEquals("http://mygrid/web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    public void testGetTypeDescNamespacePrefix() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertEquals("ns1", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertEquals("_Logon", typeDesc.getXmlType());
    }

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct type mapping.
     */
    @Test
    public void testGetTypeDescTypeMapping() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertNotNull(typeDesc.getTypeMapping());
    }

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct extended type metadata.
     */
    @Test
    public void testGetTypeDescExtendedTypeMetadata() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertNotNull(typeDesc.getExtends());
    }
}