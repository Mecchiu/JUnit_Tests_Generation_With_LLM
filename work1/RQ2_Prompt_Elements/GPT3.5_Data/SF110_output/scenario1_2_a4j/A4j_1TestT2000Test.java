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
    
    @Test
    void testKeywordSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "electronics", "all", "1");
        assertNotNull(productInfo);
    }
    
    @Test
    void testKeywordSearchWithNullSearchTerm() {
        A4j a4j = new A4j();
        assertThrows(IllegalArgumentException.class, () -> {
            a4j.KeywordSearch(null, "electronics", "all", "1");
        });
    }
    
    @Test
    void testKeywordSearchWithEmptySearchTerm() {
        A4j a4j = new A4j();
        assertThrows(IllegalArgumentException.class, () -> {
            a4j.KeywordSearch("", "electronics", "all", "1");
        });
    }
    
    @Test
    void testKeywordSearchWithNullProductLine() {
        A4j a4j = new A4j();
        assertThrows(IllegalArgumentException.class, () -> {
            a4j.KeywordSearch("laptop", null, "all", "1");
        });
    }
    
    @Test
    void testKeywordSearchWithEmptyProductLine() {
        A4j a4j = new A4j();
        assertThrows(IllegalArgumentException.class, () -> {
            a4j.KeywordSearch("laptop", "", "all", "1");
        });
    }
    
    @Test
    void testKeywordSearchWithNullType() {
        A4j a4j = new A4j();
        assertThrows(IllegalArgumentException.class, () -> {
            a4j.KeywordSearch("laptop", "electronics", null, "1");
        });
    }
    
    @Test
    void testKeywordSearchWithEmptyType() {
        A4j a4j = new A4j();
        assertThrows(IllegalArgumentException.class, () -> {
            a4j.KeywordSearch("laptop", "electronics", "", "1");
        });
    }
    
    @Test
    void testKeywordSearchWithNullPage() {
        A4j a4j = new A4j();
        assertThrows(IllegalArgumentException.class, () -> {
            a4j.KeywordSearch("laptop", "electronics", "all", null);
        });
    }
    
    @Test
    void testKeywordSearchWithEmptyPage() {
        A4j a4j = new A4j();
        assertThrows(IllegalArgumentException.class, () -> {
            a4j.KeywordSearch("laptop", "electronics", "all", "");
        });
    }
    
    @Test
    void testKeywordSearchWithInvalidPage() {
        A4j a4j = new A4j();
        assertThrows(IllegalArgumentException.class, () -> {
            a4j.KeywordSearch("laptop", "electronics", "all", "invalid");
        });
    }
}