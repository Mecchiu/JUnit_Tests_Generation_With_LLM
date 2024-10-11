import org.apache.axis.description.TypeDesc;

public class ArrayOfStringTest {

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     * Tests if the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     * Tests if the returned TypeDesc object has the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertEquals("ArrayOfString", typeDesc.getTypeName());
    }

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     * Tests if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertEquals("http://mygrid.org.uk/", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     * Tests if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    public void testGetTypeDescNamespacePrefix() {
        TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertEquals("mygrid", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     * Tests if the returned TypeDesc object has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     * Tests if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     * Tests if the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertEquals("ArrayOfString", typeDesc.getElementName());
    }

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     * Tests if the returned TypeDesc object has the correct type class.
     */
    @Test
    public void testGetTypeDescTypeClass() {
        TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertEquals(ArrayOfString.class, typeDesc.getTypeClass());
    }

    /**
     * Test method for {@link ArrayOfString#getTypeDesc()}.
     * Tests if the returned TypeDesc object has the correct flags.
     */
    @Test
    public void testGetTypeDescFlags() {
        TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertEquals(0, typeDesc.getFlags());
    }
}