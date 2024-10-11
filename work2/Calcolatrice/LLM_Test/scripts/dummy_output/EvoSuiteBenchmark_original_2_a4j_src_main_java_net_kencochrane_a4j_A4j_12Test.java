package net.kencochrane.a4j;
java
public class A4j_12Test {

    @Test
    void testAddtoCart() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("B01M8L5Z3Y", "1");
        assertNotNull(shoppingCart);
        assertEquals("B01M8L5Z3Y", shoppingCart.getAsin());
        assertEquals(1, shoppingCart.getQuantity());
    }

    @Test
    void testAddtoCart_InvalidQuantity() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("B01M8L5Z3Y", "-1");
        assertNull(shoppingCart);
    }

    @Test
    void testAddtoCart_NullASIN() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart(null, "1");
        assertNull(shoppingCart);
    }

    @Test
    void testAddtoCart_NullQuantity() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("B01M8L5Z3Y", null);
        assertNull(shoppingCart);
    }

    @Test
    void testAddtoCart_InvalidASIN() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("INVALID_ASIN", "1");
        assertNull(shoppingCart);
    }

    @Test
    void testAddtoCart_ZeroQuantity() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("B01M8L5Z3Y", "0");
        assertNull(shoppingCart);
    }

    @Test
    void testAddtoCart_EmptyASIN() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("", "1");
        assertNull(shoppingCart);
    }

    @Test
    void testAddtoCart_EmptyQuantity() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("B01M8L5Z3Y", "");
        assertNull(shoppingCart);
    }

    @Test
    void testAddtoCart_InvalidASIN_InvalidQuantity() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("INVALID_ASIN", "-1");
        assertNull(shoppingCart);
    }

    @Test
    void testAddtoCart_InvalidASIN_ZeroQuantity() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("INVALID_ASIN", "0");
        assertNull(shoppingCart);
    }
}
