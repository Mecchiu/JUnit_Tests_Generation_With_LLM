// A4j_2Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_2Test {
    
    /**
     * Test case for searching an actor with valid parameters.
     */
    @Test
    void testActorSearchValid() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
        assertNotNull(productInfo);
    }
    
    /**
     * Test case for searching an actor with invalid actor name.
     */
    @Test
    void testActorSearchInvalidActorName() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("", "dvd", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an actor with invalid mode.
     */
    @Test
    void testActorSearchInvalidMode() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "invalid", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an actor with invalid page number.
     */
    @Test
    void testActorSearchInvalidPageNumber() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "invalid");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an actor with null parameters.
     */
    @Test
    void testActorSearchNullParameters() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch(null, null, null);
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an actor with empty parameters.
     */
    @Test
    void testActorSearchEmptyParameters() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("", "", "");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an actor with whitespace parameters.
     */
    @Test
    void testActorSearchWhitespaceParameters() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("   ", "   ", "   ");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an actor with non-existent actor name.
     */
    @Test
    void testActorSearchNonExistentActorName() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("Non Existent Actor", "dvd", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an actor with non-existent mode.
     */
    @Test
    void testActorSearchNonExistentMode() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "nonexistent", "1");
        assertNull(productInfo);
    }
    
    /**
     * Test case for searching an actor with non-existent page number.
     */
    @Test
    void testActorSearchNonExistentPageNumber() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1000");
        assertNull(productInfo);
    }
}