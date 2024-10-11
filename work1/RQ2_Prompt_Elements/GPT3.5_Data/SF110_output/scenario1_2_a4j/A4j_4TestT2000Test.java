// Here's an example of how you could write unit tests for the A4j class:

@Test
void testAuthorSearchReturnsProductInfo() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "J.K. Rowling";
    String page = "1";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNotNull(result);
    assertEquals("Harry Potter and the Philosopher's Stone", result.getTitle());
    assertEquals("J.K. Rowling", result.getAuthor());
    assertEquals("9780747532743", result.getIsbn());
}

@Test
void testAuthorSearchReturnsNullWhenAuthorNotFound() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "John Doe";
    String page = "1";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}

@Test
void testAuthorSearchReturnsNullWhenPageNotFound() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "J.K. Rowling";
    String page = "999";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}

@Test
void testAuthorSearchReturnsNullWhenAuthorNameIsNull() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = null;
    String page = "1";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}

@Test
void testAuthorSearchReturnsNullWhenPageIsNull() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "J.K. Rowling";
    String page = null;

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}

@Test
void testAuthorSearchReturnsNullWhenAuthorNameIsEmpty() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "";
    String page = "1";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}

@Test
void testAuthorSearchReturnsNullWhenPageIsEmpty() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "J.K. Rowling";
    String page = "";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}

@Test
void testAuthorSearchReturnsNullWhenAuthorNameContainsOnlyWhitespace() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "   ";
    String page = "1";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}

@Test
void testAuthorSearchReturnsNullWhenPageContainsOnlyWhitespace() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "J.K. Rowling";
    String page = "   ";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}

@Test
void testAuthorSearchReturnsNullWhenAuthorNameContainsSpecialCharacters() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "J.K. Rowl!ng";
    String page = "1";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}

@Test
void testAuthorSearchReturnsNullWhenPageContainsSpecialCharacters() {
    // Arrange
    A4j a4j = new A4j();
    String authorName = "J.K. Rowling";
    String page = "1!";

    // Act
    ProductInfo result = a4j.AuthorSearch(authorName, page);

    // Assert
    assertNull(result);
}