// A4j_1Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4j_1Test {
    
    /**
     * Test case for searching a keyword with valid parameters.
     */
    @Test
    void testKeywordSearchValid() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "books", "heavy", "1");
        assertNotNull(productInfo);
    }
    
    /**
     * Test case for searching a keyword with invalid product line.
     */
    @Test
    void testKeywordSearchInvalidProductLine() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "invalid", "heavy", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching a keyword with invalid type.
     */
    @Test
    void testKeywordSearchInvalidType() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "books", "invalid", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching a keyword with invalid page.
     */
    @Test
    void testKeywordSearchInvalidPage() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "books", "heavy", "invalid");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching a keyword with null parameters.
     */
    @Test
    void testKeywordSearchNullParameters() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch(null, null, null, null);
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching a keyword with empty parameters.
     */
    @Test
    void testKeywordSearchEmptyParameters() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("", "", "", "");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching a keyword with whitespace parameters.
     */
    @Test
    void testKeywordSearchWhitespaceParameters() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("   ", "   ", "   ", "   ");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching a keyword with invalid product line and valid type.
     */
    @Test
    void testKeywordSearchInvalidProductLineValidType() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "invalid", "lite", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching a keyword with valid product line and invalid type.
     */
    @Test
    void testKeywordSearchValidProductLineInvalidType() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "books", "invalid", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching a keyword with valid product line and valid type, but invalid page.
     */
    @Test
    void testKeywordSearchValidProductLineValidTypeInvalidPage() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "books", "heavy", "invalid");
        assertNull(productInfo);
    }
}