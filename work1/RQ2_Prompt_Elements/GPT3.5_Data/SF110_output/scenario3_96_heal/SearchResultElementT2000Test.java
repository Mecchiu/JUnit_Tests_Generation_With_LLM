import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains ten unit test cases for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {
    
    /**
     * Test case for getTypeDesc method when the type description is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(SearchResultElement.getTypeDesc());
    }
    
    /**
     * Test case for getTypeDesc method when the type description is null.
     */
    @Test
    void testGetTypeDescNull() {
        assertNull(SearchResultElement.getTypeDesc());
    }
    
    /**
     * Test case for getTypeDesc method when the type description is an instance of TypeDesc.
     */
    @Test
    void testGetTypeDescInstanceOfTypeDesc() {
        assertTrue(SearchResultElement.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
    }
    
    /**
     * Test case for getTypeDesc method when the type description has the correct namespace.
     */
    @Test
    void testGetTypeDescNamespace() {
        assertEquals("http://merlot.org/fedsearch/type", SearchResultElement.getTypeDesc().getXmlTypeNamespace());
    }
    
    /**
     * Test case for getTypeDesc method when the type description has the correct name.
     */
    @Test
    void testGetTypeDescName() {
        assertEquals("SearchResultElement", SearchResultElement.getTypeDesc().getXmlTypeName());
    }
    
    /**
     * Test case for getTypeDesc method when the type description has the correct element name.
     */
    @Test
    void testGetTypeDescElementName() {
        assertEquals("searchResultElement", SearchResultElement.getTypeDesc().getElementName());
    }
    
    /**
     * Test case for getTypeDesc method when the type description has the correct fields.
     */
    @Test
    void testGetTypeDescFields() {
        assertEquals(0, SearchResultElement.getTypeDesc().getFields().length);
    }
    
    /**
     * Test case for getTypeDesc method when the type description has the correct xml type.
     */
    @Test
    void testGetTypeDescXmlType() {
        assertEquals(org.apache.axis.encoding.XMLType.AXIS_VOID, SearchResultElement.getTypeDesc().getXmlType());
    }
    
    /**
     * Test case for getTypeDesc method when the type description has the correct serializer.
     */
    @Test
    void testGetTypeDescSerializer() {
        assertNotNull(SearchResultElement.getTypeDesc().getSerializer(null, null));
    }
    
    /**
     * Test case for getTypeDesc method when the type description has the correct deserializer.
     */
    @Test
    void testGetTypeDescDeserializer() {
        assertNotNull(SearchResultElement.getTypeDesc().getDeserializer(null, null));
    }
}