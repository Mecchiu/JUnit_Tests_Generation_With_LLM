import org.apache.axis.description.TypeDesc;

public class _AvailableJobsTest {

    /**
     * Test method for {@link _AvailableJobs#getTypeDesc()}.
     * Verifies that the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link _AvailableJobs#getTypeDesc()}.
     * Verifies that the returned TypeDesc object is of type TypeDesc.
     */
    @Test
    public void testGetTypeDescType() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertTrue(typeDesc instanceof TypeDesc);
    }

    /**
     * Test method for {@link _AvailableJobs#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct QName.
     */
    @Test
    public void testGetTypeDescQName() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals("mygrid.web._AvailableJobs", typeDesc.getXmlType().getLocalPart());
    }

    /**
     * Test method for {@link _AvailableJobs#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct namespace.
     */
    @Test
    public void testGetTypeDescNamespace() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals("http://mygrid.org.uk/", typeDesc.getXmlType().getNamespaceURI());
    }

    /**
     * Test method for {@link _AvailableJobs#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals("availableJobs", typeDesc.getXmlType().getLocalPart());
    }

    /**
     * Test method for {@link _AvailableJobs#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct element namespace.
     */
    @Test
    public void testGetTypeDescElementNamespace() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals("http://mygrid.org.uk/", typeDesc.getXmlType().getNamespaceURI());
    }

    /**
     * Test method for {@link _AvailableJobs#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct element type.
     */
    @Test
    public void testGetTypeDescElementType() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals(org.apache.axis.encoding.ser.BeanSerializerFactory.class, typeDesc.getSerializerClass());
        assertEquals(org.apache.axis.encoding.ser.BeanDeserializerFactory.class, typeDesc.getDeserializerClass());
    }

    /**
     * Test method for {@link _AvailableJobs#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals("availableJobs", typeDesc.getTypeName());
    }

    /**
     * Test method for {@link _AvailableJobs#getTypeDesc()}.
     * Verifies that the returned TypeDesc object has the correct type namespace.
     */
    @Test
    public void testGetTypeDescTypeNamespace() {
        TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertEquals("http://mygrid.org.uk/", typeDesc.getXmlType().getNamespaceURI());
    }
}