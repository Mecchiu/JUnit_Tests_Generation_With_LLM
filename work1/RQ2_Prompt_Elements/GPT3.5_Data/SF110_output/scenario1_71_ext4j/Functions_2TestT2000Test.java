// Here's an example of how you could write unit tests for the Functions class:

@Test
void testDateToMilliseconds_NullDate_ReturnsZero() {
    // Arrange
    Date date = null;

    // Act
    long result = Functions.dateToMilliseconds(date);

    // Assert
    assertEquals(0, result);
}

@Test
void testDateToMilliseconds_ValidDate_ReturnsMilliseconds() {
    // Arrange
    Calendar calendar = Calendar.getInstance();
    calendar.set(2021, Calendar.JANUARY, 1, 0, 0, 0);
    Date date = calendar.getTime();

    // Act
    long result = Functions.dateToMilliseconds(date);

    // Assert
    assertEquals(1609459200000L, result);
}

@Test
void testDateToMilliseconds_DateWithTimezone_ReturnsMilliseconds() {
    // Arrange
    Calendar calendar = Calendar.getInstance();
    calendar.set(2021, Calendar.JANUARY, 1, 0, 0, 0);
    calendar.setTimeZone(TimeZone.getTimeZone("GMT+2"));
    Date date = calendar.getTime();

    // Act
    long result = Functions.dateToMilliseconds(date);

    // Assert
    assertEquals(1609444800000L, result);
}

// Add more test cases as needed. Remember to test edge cases and invalid input.