// Test case 1: Valid date
@Test
void testValidDate() {
    assertTrue(ValidDate.validDate("01-01-2022"));
}

// Test case 2: Invalid date format
@Test
void testInvalidDateFormat() {
    assertFalse(ValidDate.validDate("01/01/2022"));
}

// Test case 3: Invalid month
@Test
void testInvalidMonth() {
    assertFalse(ValidDate.validDate("13-01-2022"));
}

// Test case 4: Invalid day for February
@Test
void testInvalidDayForFebruary() {
    assertFalse(ValidDate.validDate("02-30-2022"));
}

// Test case 5: Invalid day for April
@Test
void testInvalidDayForApril() {
    assertFalse(ValidDate.validDate("04-31-2022"));
}

// Test case 6: Invalid day for June
@Test
void testInvalidDayForJune() {
    assertFalse(ValidDate.validDate("06-31-2022"));
}

// Test case 7: Invalid day for September
@Test
void testInvalidDayForSeptember() {
    assertFalse(ValidDate.validDate("09-31-2022"));
}

// Test case 8: Invalid day for November
@Test
void testInvalidDayForNovember() {
    assertFalse(ValidDate.validDate("11-31-2022"));
}

// Test case 9: Invalid year
@Test
void testInvalidYear() {
    assertFalse(ValidDate.validDate("01-01-0000"));
}

// Test case 10: Empty date string
@Test
void testEmptyDateString() {
    assertFalse(ValidDate.validDate(""));
}
}