// Here's an example of how you could write unit tests for the A4j class:

@Test
void testActorSearchReturnsProductInfo() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Tom Hanks";
    String mode = "movies";
    String page = "1";

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNotNull(result);
    assertEquals("Tom Hanks", result.getActorName());
    assertEquals("movies", result.getMode());
    assertEquals("1", result.getPage());
}

@Test
void testActorSearchReturnsNullForInvalidActorName() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Invalid Actor";
    String mode = "movies";
    String page = "1";

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNull(result);
}

@Test
void testActorSearchReturnsNullForInvalidMode() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Tom Hanks";
    String mode = "invalid mode";
    String page = "1";

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNull(result);
}

@Test
void testActorSearchReturnsNullForInvalidPage() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Tom Hanks";
    String mode = "movies";
    String page = "invalid page";

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNull(result);
}

@Test
void testActorSearchReturnsEmptyProductListForNoResults() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Tom Hanks";
    String mode = "movies";
    String page = "1000"; // unlikely to have any results

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNotNull(result);
    assertEquals(0, result.getProducts().size());
}

@Test
void testActorSearchReturnsProductsForValidInput() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Tom Hanks";
    String mode = "movies";
    String page = "1";

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNotNull(result);
    assertTrue(result.getProducts().size() > 0);
}

@Test
void testActorSearchReturnsUniqueProducts() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Tom Hanks";
    String mode = "movies";
    String page = "1";

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNotNull(result);
    assertEquals(result.getProducts().size(), result.getProducts().stream().distinct().count());
}

@Test
void testActorSearchReturnsProductsInDescendingOrderOfRating() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Tom Hanks";
    String mode = "movies";
    String page = "1";

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNotNull(result);
    assertTrue(result.getProducts().size() > 1);
    for (int i = 0; i < result.getProducts().size() - 1; i++) {
        assertTrue(result.getProducts().get(i).getRating() >= result.getProducts().get(i + 1).getRating());
    }
}

@Test
void testActorSearchReturnsProductsInDescendingOrderOfReleaseYear() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Tom Hanks";
    String mode = "movies";
    String page = "1";

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNotNull(result);
    assertTrue(result.getProducts().size() > 1);
    for (int i = 0; i < result.getProducts().size() - 1; i++) {
        assertTrue(result.getProducts().get(i).getReleaseYear() >= result.getProducts().get(i + 1).getReleaseYear());
    }
}

@Test
void testActorSearchReturnsProductsInDescendingOrderOfPrice() {
    // Arrange
    A4j a4j = new A4j();
    String actorName = "Tom Hanks";
    String mode = "movies";
    String page = "1";

    // Act
    ProductInfo result = a4j.ActorSearch(actorName, mode, page);

    // Assert
    assertNotNull(result);
    assertTrue(result.getProducts().size() > 1);
    for (int i = 0; i < result.getProducts().size() - 1; i++) {
        assertTrue(result.getProducts().get(i).getPrice() >= result.getProducts().get(i + 1).getPrice());
    }
}