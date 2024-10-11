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
     * It tests if the returned TypeDesc object is an instance of TypeDesc class.
     */
    @Test
    public void testGetTypeDescInstanceOfTypeDesc() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertTrue(typeDesc instanceof TypeDesc);
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
        assertEquals("http://mygrid.org.uk/", typeDesc.getXmlTypeNamespaceURI());
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
     * It tests if the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertEquals("_Logon", typeDesc.getElementName());
    }

    /**
     * Test method for {@link mygrid.web._Logon#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct xml name.
     */
    @Test
    public void testGetTypeDescXmlName() {
        TypeDesc typeDesc = _Logon.getTypeDesc();
        assertEquals("_Logon", typeDesc.getXmlName());
    }
}