import org.apache.axis.description.TypeDesc;

public class _AvailableJobsTest {

    /**
     * Test case for getTypeDesc() method when TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object is null.
     */
    @Test
    public void testGetTypeDescNull() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertNull(typeDesc);
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct name.
     */
    @Test
    public void testGetTypeDescName() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals("_AvailableJobs", typeDesc.getName());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct namespace.
     */
    @Test
    public void testGetTypeDescNamespace() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals("mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct fields.
     */
    @Test
    public void testGetTypeDescFields() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals(0, typeDesc.getFields().length);
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct xml type.
     */
    @Test
    public void testGetTypeDescXmlType() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals("{mygrid.web}_AvailableJobs", typeDesc.getXmlType());
    }

    /**
     * Test case for getTypeDesc() method when TypeDesc object has correct base type.
     */
    @Test
    public void testGetTypeDescBaseType() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertNull(typeDesc.getBaseType());
    }
}