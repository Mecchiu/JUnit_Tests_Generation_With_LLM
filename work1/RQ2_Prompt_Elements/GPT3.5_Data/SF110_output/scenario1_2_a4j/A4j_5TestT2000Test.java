// Here's an example of how you could implement the A4j_5Test class:

package net.kencochrane.a4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class A4j_5Test {
    
    @Test
    void testAddToCart() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("B00X4WHP5E", "2");
        assertNotNull(cart);
        assertEquals(1, cart.getItems().size());
        assertEquals("B00X4WHP5E", cart.getItems().get(0).getAsin());
        assertEquals(2, cart.getItems().get(0).getQuantity());
    }
    
    @Test
    void testAddToCartInvalidAsin() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("invalid_asin", "2");
        assertNull(cart);
    }
    
    @Test
    void testAddToCartInvalidQuantity() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("B00X4WHP5E", "invalid_quantity");
        assertNull(cart);
    }
    
    @Test
    void testAddToCartNegativeQuantity() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("B00X4WHP5E", "-1");
        assertNull(cart);
    }
    
    @Test
    void testAddToCartZeroQuantity() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("B00X4WHP5E", "0");
        assertNull(cart);
    }
    
    @Test
    void testAddToCartMaxQuantity() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("B00X4WHP5E", "999");
        assertNotNull(cart);
        assertEquals(1, cart.getItems().size());
        assertEquals("B00X4WHP5E", cart.getItems().get(0).getAsin());
        assertEquals(999, cart.getItems().get(0).getQuantity());
    }
    
    @Test
    void testAddToCartExceedMaxQuantity() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("B00X4WHP5E", "1000");
        assertNull(cart);
    }
    
    @Test
    void testAddToCartEmptyAsin() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("", "2");
        assertNull(cart);
    }
    
    @Test
    void testAddToCartNullAsin() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart(null, "2");
        assertNull(cart);
    }
    
    @Test
    void testAddToCartEmptyQuantity() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("B00X4WHP5E", "");
        assertNull(cart);
    }
    
    @Test
    void testAddToCartNullQuantity() {
        A4j a4j = new A4j();
        ShoppingCart cart = a4j.AddtoCart("B00X4WHP5E", null);
        assertNull(cart);
    }
}