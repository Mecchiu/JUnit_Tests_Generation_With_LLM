// Test case for sorting numbers in ascending order
@Test
void testSortNumbersAscending() {
    String input = "one five two nine eight";
    String expectedOutput = "one two five eight nine";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}

// Test case for sorting numbers in descending order
@Test
void testSortNumbersDescending() {
    String input = "six three zero four seven";
    String expectedOutput = "seven six four three zero";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}

// Test case for sorting numbers with duplicates
@Test
void testSortNumbersWithDuplicates() {
    String input = "eight two five two nine eight";
    String expectedOutput = "two two five eight eight nine";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}

// Test case for sorting single number
@Test
void testSortSingleNumber() {
    String input = "three";
    String expectedOutput = "three";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}

// Test case for sorting empty string
@Test
void testSortEmptyString() {
    String input = "";
    String expectedOutput = "";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}

// Test case for sorting invalid input
@Test
void testSortInvalidInput() {
    String input = "one two three four five six seven eight nine ten";
    String expectedOutput = "-1 -1 -1 -1 -1 -1 -1 -1 -1 -1";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}

// Test case for sorting input with leading/trailing spaces
@Test
void testSortNumbersWithSpaces() {
    String input = "  one  five  two  nine  eight  ";
    String expectedOutput = "one two five eight nine";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}

// Test case for sorting input with mixed case
@Test
void testSortNumbersWithMixedCase() {
    String input = "One fIve TwO nIne EIGHT";
    String expectedOutput = "one two five eight nine";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}

// Test case for sorting input with non-alphabetic characters
@Test
void testSortNumbersWithNonAlphabeticCharacters() {
    String input = "one 5 two 9 eight";
    String expectedOutput = "one two eight 5 9";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}

// Test case for sorting input with non-space delimiter
@Test
void testSortNumbersWithNonSpaceDelimiter() {
    String input = "one,five,two,nine,eight";
    String expectedOutput = "-1 -1 -1 -1 -1";
    String actualOutput = SortNumbers.sortNumbers(input);
    assertEquals(expectedOutput, actualOutput);
}
}