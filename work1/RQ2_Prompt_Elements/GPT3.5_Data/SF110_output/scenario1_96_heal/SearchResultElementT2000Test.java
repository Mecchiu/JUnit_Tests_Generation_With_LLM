import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains ten unit test cases for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {

    @Test
    void getTypeDesc_returnsTypeDesc() {
        assertNotNull(SearchResultElement.getTypeDesc());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlType() {
        assertEquals("SearchResultElement", SearchResultElement.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectNamespace() {
        assertEquals("http://org.merlot.fedsearch/type", SearchResultElement.getTypeDesc().getXmlType().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectElementQName() {
        assertEquals(new javax.xml.namespace.QName("http://org.merlot.fedsearch/type", "SearchResultElement"), SearchResultElement.getTypeDesc().getElementQName());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectSerializerFactory() {
        assertNotNull(SearchResultElement.getTypeDesc().getSerializerFactory());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectDeserializerFactory() {
        assertNotNull(SearchResultElement.getTypeDesc().getDeserializerFactory());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectType() {
        assertEquals(SearchResultElement.class, SearchResultElement.getTypeDesc().getTypeClass());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeNamespace() {
        assertEquals("http://org.merlot.fedsearch/type", SearchResultElement.getTypeDesc().getXmlTypeNamespace());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypePrefix() {
        assertEquals("", SearchResultElement.getTypeDesc().getXmlTypePrefix());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectExtensibilityElements() {
        assertEquals(0, SearchResultElement.getTypeDesc().getExtensibilityElements().length);
    }
}