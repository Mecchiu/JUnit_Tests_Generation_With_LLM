import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {
    
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(SearchResult.getTypeDesc());
    }
    
    @Test
    void testGetTypeDescIsTypeDesc() {
        assertTrue(SearchResult.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
    }
    
    @Test
    void testGetTypeDescHasXmlType() {
        assertNotNull(SearchResult.getTypeDesc().getXmlType());
    }
    
    @Test
    void testGetTypeDescHasElementQName() {
        assertNotNull(SearchResult.getTypeDesc().getElementQName());
    }
    
    @Test
    void testGetTypeDescHasFields() {
        assertFalse(SearchResult.getTypeDesc().getFields().isEmpty());
    }
    
    @Test
    void testGetTypeDescHasFieldWithName() {
        assertNotNull(SearchResult.getTypeDesc().getField("name"));
    }
    
    @Test
    void testGetTypeDescHasFieldWithDescription() {
        assertNotNull(SearchResult.getTypeDesc().getField("description"));
    }
    
    @Test
    void testGetTypeDescHasFieldWithUrl() {
        assertNotNull(SearchResult.getTypeDesc().getField("url"));
    }
    
    @Test
    void testGetTypeDescHasFieldWithScore() {
        assertNotNull(SearchResult.getTypeDesc().getField("score"));
    }
    
    @Test
    void testGetTypeDescHasFieldWithMetadata() {
        assertNotNull(SearchResult.getTypeDesc().getField("metadata"));
    }
}