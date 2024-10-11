// A4j_3Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_3Test {
    
    /**
     * Test case for searching an artist with valid parameters.
     */
    @Test
    void testArtistSearchValid() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("John Lennon", "music", "1");
        assertNotNull(productInfo);
    }
    
    /**
     * Test case for searching an artist with invalid mode parameter.
     */
    @Test
    void testArtistSearchInvalidMode() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("John Lennon", "invalid", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an artist with invalid page parameter.
     */
    @Test
    void testArtistSearchInvalidPage() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("John Lennon", "music", "invalid");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an artist with null artist name parameter.
     */
    @Test
    void testArtistSearchNullArtistName() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch(null, "music", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an artist with null mode parameter.
     */
    @Test
    void testArtistSearchNullMode() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("John Lennon", null, "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an artist with null page parameter.
     */
    @Test
    void testArtistSearchNullPage() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("John Lennon", "music", null);
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an artist with empty artist name parameter.
     */
    @Test
    void testArtistSearchEmptyArtistName() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("", "music", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an artist with empty mode parameter.
     */
    @Test
    void testArtistSearchEmptyMode() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("John Lennon", "", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an artist with empty page parameter.
     */
    @Test
    void testArtistSearchEmptyPage() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("John Lennon", "music", "");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an artist with invalid artist name parameter.
     */
    @Test
    void testArtistSearchInvalidArtistName() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("1234", "music", "1");
        assertNull(productInfo);
    }
}