import org.apache.axis.description.TypeDesc;

public class JobTest {

    /**
     * Test method for {@link Job#getTypeDesc()}.
     * Test that the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link Job#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertEquals("http://mygrid/web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link Job#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct local name.
     */
    @Test
    public void testGetTypeDescLocalName() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertEquals("Job", typeDesc.getXmlTypeLocalName());
    }

    /**
     * Test method for {@link Job#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct QName.
     */
    @Test
    public void testGetTypeDescQName() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertEquals(new javax.xml.namespace.QName("http://mygrid/web", "Job"), typeDesc.getXmlType());
    }

    /**
     * Test method for {@link Job#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertEquals(new javax.xml.namespace.QName("http://mygrid/web", "Job"), typeDesc.getElementName());
    }

    /**
     * Test method for {@link Job#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct type mapping.
     */
    @Test
    public void testGetTypeDescTypeMapping() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertEquals(org.apache.axis.encoding.ser.BeanSerializerFactory.class, typeDesc.getSerializerClass());
        assertEquals(org.apache.axis.encoding.ser.BeanDeserializerFactory.class, typeDesc.getDeserializerClass());
    }

    /**
     * Test method for {@link Job#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct property descriptors.
     */
    @Test
    public void testGetTypeDescPropertyDescriptors() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc.getPropertyDescriptors());
        assertEquals(0, typeDesc.getPropertyDescriptors().length);
    }

    /**
     * Test method for {@link Job#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct metadata.
     */
    @Test
    public void testGetTypeDescMetadata() {
        TypeDesc typeDesc = Job.getTypeDesc();
        assertNotNull(typeDesc.getXmlType());
        assertNotNull(typeDesc.getElementName());
        assertNotNull(typeDesc.getSerializerClass());
        assertNotNull(typeDesc.getDeserializerClass());
        assertNotNull(typeDesc.getPropertyDescriptors());
    }

    /**
     * Test method for {@link Job#getTypeDesc()}.
     * Test that the returned TypeDesc object is the same instance every time.
     */
    @Test
    public void testGetTypeDescSameInstance() {
        TypeDesc typeDesc1 = Job.getTypeDesc();
        TypeDesc typeDesc2 = Job.getTypeDesc();
        assertSame(typeDesc1, typeDesc2);
    }
}