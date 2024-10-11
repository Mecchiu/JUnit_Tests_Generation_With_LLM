import org.apache.axis.description.TypeDesc;

public class JobTest {

    /**
     * Test case for checking if getTypeDesc() returns a non-null TypeDesc object.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test case for checking if getTypeDesc() returns a TypeDesc object with the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertEquals("Job", typeDesc.getXmlType());
    }

    /**
     * Test case for checking if getTypeDesc() returns a TypeDesc object with the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertEquals("http://mygrid/web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test case for checking if getTypeDesc() returns a TypeDesc object with the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertEquals("job", typeDesc.getXmlType());
    }

    /**
     * Test case for checking if getTypeDesc() returns a TypeDesc object with the correct element namespace URI.
     */
    @Test
    public void testGetTypeDescElementNamespaceURI() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertEquals("http://mygrid/web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test case for checking if getTypeDesc() returns a TypeDesc object with the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test case for checking if getTypeDesc() returns a TypeDesc object with the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }

    /**
     * Test case for checking if getTypeDesc() returns a TypeDesc object with the correct type mapping.
     */
    @Test
    public void testGetTypeDescTypeMapping() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc.getTypeMapping());
    }

    /**
     * Test case for checking if getTypeDesc() returns the same TypeDesc object every time it is called.
     */
    @Test
    public void testGetTypeDescSameObject() {
        TypeDesc typeDesc1 = Job.getTypeDesc();
        TypeDesc typeDesc2 = Job.getTypeDesc();
        assertSame(typeDesc1, typeDesc2);
    }
}