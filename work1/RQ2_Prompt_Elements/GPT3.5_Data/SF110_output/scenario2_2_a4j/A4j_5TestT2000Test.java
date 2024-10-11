// Test case 1: Test adding a product with a valid ASIN and quantity
@Test
void testAddToCartValid() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart("B00EOE0WKQ", "2");
    assertNotNull(cart);
    assertEquals(1, cart.getItems().size());
    assertEquals("B00EOE0WKQ", cart.getItems().get(0).getAsin());
    assertEquals(2, cart.getItems().get(0).getQuantity());
}

// Test case 2: Test adding a product with an invalid ASIN
@Test
void testAddToCartInvalidASIN() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart("invalidASIN", "2");
    assertNull(cart);
}

// Test case 3: Test adding a product with a negative quantity
@Test
void testAddToCartNegativeQuantity() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart("B00EOE0WKQ", "-2");
    assertNull(cart);
}

// Test case 4: Test adding a product with a non-numeric quantity
@Test
void testAddToCartNonNumericQuantity() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart("B00EOE0WKQ", "invalidQuantity");
    assertNull(cart);
}

// Test case 5: Test adding a product with a quantity of zero
@Test
void testAddToCartZeroQuantity() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart("B00EOE0WKQ", "0");
    assertNull(cart);
}

// Test case 6: Test adding a product with a null ASIN
@Test
void testAddToCartNullASIN() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart(null, "2");
    assertNull(cart);
}

// Test case 7: Test adding a product with a null quantity
@Test
void testAddToCartNullQuantity() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart("B00EOE0WKQ", null);
    assertNull(cart);
}

// Test case 8: Test adding a product with both ASIN and quantity null
@Test
void testAddToCartNullASINAndQuantity() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart(null, null);
    assertNull(cart);
}

// Test case 9: Test adding a product with an ASIN that is already in the cart
@Test
void testAddToCartDuplicateASIN() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart("B00EOE0WKQ", "2");
    cart = a4j.AddtoCart("B00EOE0WKQ", "3");
    assertNotNull(cart);
    assertEquals(1, cart.getItems().size());
    assertEquals("B00EOE0WKQ", cart.getItems().get(0).getAsin());
    assertEquals(5, cart.getItems().get(0).getQuantity());
}

// Test case 10: Test adding a product with a quantity that exceeds the maximum allowed
@Test
void testAddToCartExceedMaxQuantity() {
    A4j a4j = new A4j();
    ShoppingCart cart = a4j.AddtoCart("B00EOE0WKQ", "1000");
    assertNull(cart);
}
}