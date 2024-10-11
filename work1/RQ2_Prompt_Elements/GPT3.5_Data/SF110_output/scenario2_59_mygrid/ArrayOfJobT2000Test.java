import org.apache.axis.description.TypeDesc;

public class ArrayOfJobTest {

    /**
     * Test method for {@link ArrayOfJob#getTypeDesc()}.
     * It tests if the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = ArrayOfJob.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link ArrayOfJob#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = ArrayOfJob.getTypeDesc();
        assertEquals("ArrayOfJob", typeDesc.getTypeName());
    }

    /**
     * Test method for {@link ArrayOfJob#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = ArrayOfJob.getTypeDesc();
        assertEquals("http://mygrid/web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link ArrayOfJob#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    public void testGetTypeDescNamespacePrefix() {
        TypeDesc typeDesc = ArrayOfJob.getTypeDesc();
        assertEquals("ns1", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link ArrayOfJob#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = ArrayOfJob.getTypeDesc();
        assertEquals("ArrayOfJob", typeDesc.getXmlType());
    }

    /**
     * Test method for {@link ArrayOfJob#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element namespace URI.
     */
    @Test
    public void testGetTypeDescElementNamespaceURI() {
        TypeDesc typeDesc = ArrayOfJob.getTypeDesc();
        assertEquals("http://mygrid/web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link ArrayOfJob#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element namespace prefix.
     */
    @Test
    public void testGetTypeDescElementNamespacePrefix() {
        TypeDesc typeDesc = ArrayOfJob.getTypeDesc();
        assertEquals("ns1", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link ArrayOfJob#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = ArrayOfJob.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link ArrayOfJob#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = ArrayOfJob.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }
}