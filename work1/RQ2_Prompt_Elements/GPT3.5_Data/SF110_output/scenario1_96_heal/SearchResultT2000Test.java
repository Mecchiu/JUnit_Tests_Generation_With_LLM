import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {

    @Test
    void getTypeDesc_returnsTypeDesc() {
        assertNotNull(SearchResult.getTypeDesc());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectName() {
        assertEquals("SearchResult", SearchResult.getTypeDesc().getXmlName().getLocalPart());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectNamespace() {
        assertEquals("http://org.merlot.fedsearch/type", SearchResult.getTypeDesc().getXmlType().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectType() {
        assertEquals(javax.xml.namespace.QName.class, SearchResult.getTypeDesc().getXmlType().getClass());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectTypeNamespace() {
        assertEquals("http://www.w3.org/2001/XMLSchema", SearchResult.getTypeDesc().getXmlType().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectTypeLocalPart() {
        assertEquals("QName", SearchResult.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectElementName() {
        assertEquals("SearchResult", SearchResult.getTypeDesc().getElementName().getLocalPart());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectElementNamespace() {
        assertEquals("http://org.merlot.fedsearch/type", SearchResult.getTypeDesc().getElementName().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlType() {
        assertEquals(javax.xml.namespace.QName.class, SearchResult.getTypeDesc().getXmlType().getClass());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeNamespace() {
        assertEquals("http://www.w3.org/2001/XMLSchema", SearchResult.getTypeDesc().getXmlType().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeLocalPart() {
        assertEquals("QName", SearchResult.getTypeDesc().getXmlType().getLocalPart());
    }
}