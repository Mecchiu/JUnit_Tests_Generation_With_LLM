// A4j_0Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_0Test {
    
    /**
     * Test case to verify that the BlendedSearch method returns a non-null value.
     */
    @Test
    void testBlendedSearchNotNull() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertNotNull(blendedSearch);
    }
    
    /**
     * Test case to verify that the BlendedSearch method returns a valid value for the "type" parameter.
     */
    @Test
    void testBlendedSearchType() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertEquals("all", blendedSearch.getType());
    }
    
    /**
     * Test case to verify that the BlendedSearch method returns a valid value for the "searchTerm" parameter.
     */
    @Test
    void testBlendedSearchSearchTerm() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertEquals("test", blendedSearch.getSearchTerm());
    }
    
    /**
     * Test case to verify that the BlendedSearch method returns a non-null value for the "products" property.
     */
    @Test
    void testBlendedSearchProductsNotNull() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertNotNull(blendedSearch.getProducts());
    }
    
    /**
     * Test case to verify that the BlendedSearch method returns a non-null value for the "cart" property.
     */
    @Test
    void testBlendedSearchCartNotNull() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertNotNull(blendedSearch.getCart());
    }
    
    /**
     * Test case to verify that the BlendedSearch method returns a non-null value for the "suggestions" property.
     */
    @Test
    void testBlendedSearchSuggestionsNotNull() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertNotNull(blendedSearch.getSuggestions());
    }
    
    /**
     * Test case to verify that the BlendedSearch method returns a non-null value for the "relatedSearches" property.
     */
    @Test
    void testBlendedSearchRelatedSearchesNotNull() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertNotNull(blendedSearch.getRelatedSearches());
    }
    
    /**
     * Test case to verify that the BlendedSearch method returns a non-null value for the "pagination" property.
     */
    @Test
    void testBlendedSearchPaginationNotNull() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertNotNull(blendedSearch.getPagination());
    }
    
    /**
     * Test case to verify that the BlendedSearch method returns a non-null value for the "facets" property.
     */
    @Test
    void testBlendedSearchFacetsNotNull() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertNotNull(blendedSearch.getFacets());
    }
    
    /**
     * Test case to verify that the BlendedSearch method returns a non-null value for the "filters" property.
     */
    @Test
    void testBlendedSearchFiltersNotNull() {
        A4j a4j = new A4j();
        BlendedSearch blendedSearch = a4j.BlendedSearch("test", "all");
        assertNotNull(blendedSearch.getFilters());
    }
}