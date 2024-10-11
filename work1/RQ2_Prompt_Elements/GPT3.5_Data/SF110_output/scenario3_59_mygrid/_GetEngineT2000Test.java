import org.apache.axis.description.TypeDesc;

public class _GetEngineTest {

    /**
     * Test case for getTypeDesc() method when TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object is null.
     */
    @Test
    public void testGetTypeDescNull() {
        TypeDesc typeDesc = null;
        assertNull(typeDesc);
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object is of type TypeDesc.
     */
    @Test
    public void testGetTypeDescType() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertTrue(typeDesc instanceof TypeDesc);
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct namespace.
     */
    @Test
    public void testGetTypeDescNamespace() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("http://mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct name.
     */
    @Test
    public void testGetTypeDescName() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("_GetEngine", typeDesc.getXmlTypeName());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("getEngine", typeDesc.getElementName());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct element namespace.
     */
    @Test
    public void testGetTypeDescElementNamespace() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("http://mygrid.web", typeDesc.getElementQName().getNamespaceURI());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct element local name.
     */
    @Test
    public void testGetTypeDescElementLocalName() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals("getEngine", typeDesc.getElementQName().getLocalPart());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct element type.
     */
    @Test
    public void testGetTypeDescElementType() {
        TypeDesc typeDesc = _GetEngine.getTypeDesc();
        assertEquals(org.apache.axis.encoding.ser.BeanSerializerFactory.class, typeDesc.getSerializerClass());
    }
}