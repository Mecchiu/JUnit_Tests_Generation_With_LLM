import org.apache.axis.description.TypeDesc;

public class SearchResultElementTest {

    /**
     * Test method for {@link SearchResultElement#getTypeDesc()}.
     * Test that the returned TypeDesc object is not null.
     */
    @Test
    public void testGetTypeDescNotNull() {
        TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertNotNull(typeDesc);
    }

    /**
     * Test method for {@link SearchResultElement#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct type name.
     */
    @Test
    public void testGetTypeDescTypeName() {
        TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertEquals("SearchResultElement", typeDesc.getXmlType().getLocalPart());
    }

    /**
     * Test method for {@link SearchResultElement#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct namespace URI.
     */
    @Test
    public void testGetTypeDescNamespaceURI() {
        TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertEquals("http://org.merlot.fedsearch/type", typeDesc.getXmlType().getNamespaceURI());
    }

    /**
     * Test method for {@link SearchResultElement#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct element name.
     */
    @Test
    public void testGetTypeDescElementName() {
        TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertEquals("searchResultElement", typeDesc.getXmlType().getLocalPart());
    }

    /**
     * Test method for {@link SearchResultElement#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct element namespace URI.
     */
    @Test
    public void testGetTypeDescElementNamespaceURI() {
        TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertEquals("http://org.merlot.fedsearch/type", typeDesc.getXmlType().getNamespaceURI());
    }

    /**
     * Test method for {@link SearchResultElement#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct serializer.
     */
    @Test
    public void testGetTypeDescSerializer() {
        TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertNotNull(typeDesc.getSerializer());
    }

    /**
     * Test method for {@link SearchResultElement#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct deserializer.
     */
    @Test
    public void testGetTypeDescDeserializer() {
        TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertNotNull(typeDesc.getDeserializer());
    }

    /**
     * Test method for {@link SearchResultElement#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct type mapping.
     */
    @Test
    public void testGetTypeDescTypeMapping() {
        TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertNotNull(typeDesc.getTypeMapping());
    }

    /**
     * Test method for {@link SearchResultElement#getTypeDesc()}.
     * Test that the returned TypeDesc object has the correct type class.
     */
    @Test
    public void testGetTypeDescTypeClass() {
        TypeDesc typeDesc = SearchResultElement.getTypeDesc();
        assertEquals(SearchResultElement.class, typeDesc.getTypeClass());
    }
}