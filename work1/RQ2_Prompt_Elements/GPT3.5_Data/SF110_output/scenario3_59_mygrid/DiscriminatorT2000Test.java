import org.apache.axis.description.TypeDesc;

public class DiscriminatorTest {

    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     * It tests if the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = Discriminator.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = Discriminator.getTypeDesc();
        assertEquals("Discriminator", typeDesc.getTypeName());
    }

    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = Discriminator.getTypeDesc();
        assertEquals("http://mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct namespace prefix.
     */
    @Test
    public void testGetTypeDescNamespacePrefix() {
        TypeDesc typeDesc = Discriminator.getTypeDesc();
        assertEquals("mygrid", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = Discriminator.getTypeDesc();
        assertEquals("discriminator", typeDesc.getXmlType());
    }

    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element namespace URI.
     */
    @Test
    public void testGetTypeDescElementNamespaceURI() {
        TypeDesc typeDesc = Discriminator.getTypeDesc();
        assertEquals("http://mygrid.web", typeDesc.getXmlTypeNamespaceURI());
    }

    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct element namespace prefix.
     */
    @Test
    public void testGetTypeDescElementNamespacePrefix() {
        TypeDesc typeDesc = Discriminator.getTypeDesc();
        assertEquals("mygrid", typeDesc.getXmlTypeNamespacePrefix());
    }

    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = Discriminator.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     * It tests if the returned TypeDesc object has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = Discriminator.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }
}