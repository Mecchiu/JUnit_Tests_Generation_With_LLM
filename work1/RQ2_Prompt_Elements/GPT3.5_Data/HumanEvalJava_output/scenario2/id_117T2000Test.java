// Test case 1: Test with empty string
@Test
void testSelectWordsWithEmptyString() {
    List<Object> expected = new ArrayList<>();
    List<Object> actual = SelectWords.selectWords("", 2);
    assertEquals(expected, actual);
}

// Test case 2: Test with n = 0
@Test
void testSelectWordsWithNZero() {
    List<Object> expected = new ArrayList<>();
    expected.add("hello");
    expected.add("world");
    List<Object> actual = SelectWords.selectWords("hello world", 0);
    assertEquals(expected, actual);
}

// Test case 3: Test with n = 1
@Test
void testSelectWordsWithNOne() {
    List<Object> expected = new ArrayList<>();
    expected.add("hello");
    expected.add("world");
    List<Object> actual = SelectWords.selectWords("hello world", 1);
    assertEquals(expected, actual);
}

// Test case 4: Test with n = 2
@Test
void testSelectWordsWithNTwo() {
    List<Object> expected = new ArrayList<>();
    expected.add("hello");
    List<Object> actual = SelectWords.selectWords("hello world", 2);
    assertEquals(expected, actual);
}

// Test case 5: Test with n = 3
@Test
void testSelectWordsWithNThree() {
    List<Object> expected = new ArrayList<>();
    expected.add("world");
    List<Object> actual = SelectWords.selectWords("hello world", 3);
    assertEquals(expected, actual);
}

// Test case 6: Test with n = 4
@Test
void testSelectWordsWithNFour() {
    List<Object> expected = new ArrayList<>();
    List<Object> actual = SelectWords.selectWords("hello world", 4);
    assertEquals(expected, actual);
}

// Test case 7: Test with n = 5
@Test
void testSelectWordsWithNFive() {
    List<Object> expected = new ArrayList<>();
    List<Object> actual = SelectWords.selectWords("hello world", 5);
    assertEquals(expected, actual);
}

// Test case 8: Test with n = 6
@Test
void testSelectWordsWithNSix() {
    List<Object> expected = new ArrayList<>();
    List<Object> actual = SelectWords.selectWords("hello world", 6);
    assertEquals(expected, actual);
}

// Test case 9: Test with n = 7
@Test
void testSelectWordsWithNSeven() {
    List<Object> expected = new ArrayList<>();
    List<Object> actual = SelectWords.selectWords("hello world", 7);
    assertEquals(expected, actual);
}

// Test case 10: Test with n = 8
@Test
void testSelectWordsWithNEight() {
    List<Object> expected = new ArrayList<>();
    List<Object> actual = SelectWords.selectWords("hello world", 8);
    assertEquals(expected, actual);
}
}