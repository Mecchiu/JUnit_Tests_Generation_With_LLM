// Test case 1: Test with empty string
@Test
void testEmptyString() {
    List<String> expected = new ArrayList<String>();
    List<String> result = SeparateParenGroups.separateParenGroups("");
    assertEquals(expected, result);
}

// Test case 2: Test with single pair of parentheses
@Test
void testSinglePair() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("()");
    assertEquals(expected, result);
}

// Test case 3: Test with multiple pairs of parentheses
@Test
void testMultiplePairs() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    expected.add("()");
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("()()()");
    assertEquals(expected, result);
}

// Test case 4: Test with nested parentheses
@Test
void testNestedParentheses() {
    List<String> expected = new ArrayList<String>();
    expected.add("(())");
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("(())()");
    assertEquals(expected, result);
}

// Test case 5: Test with unbalanced parentheses
@Test
void testUnbalancedParentheses() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("()(");
    assertEquals(expected, result);
}

// Test case 6: Test with only opening parentheses
@Test
void testOnlyOpeningParentheses() {
    List<String> expected = new ArrayList<String>();
    List<String> result = SeparateParenGroups.separateParenGroups("(((");
    assertEquals(expected, result);
}

// Test case 7: Test with only closing parentheses
@Test
void testOnlyClosingParentheses() {
    List<String> expected = new ArrayList<String>();
    List<String> result = SeparateParenGroups.separateParenGroups(")))");
    assertEquals(expected, result);
}

// Test case 8: Test with mixed characters
@Test
void testMixedCharacters() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    expected.add("()");
    List<String> result = SeparateParenGroups.separateParenGroups("a()b()c");
    assertEquals(expected, result);
}

// Test case 9: Test with multiple levels of nesting
@Test
void testMultipleLevelsOfNesting() {
    List<String> expected = new ArrayList<String>();
    expected.add("((()))");
    expected.add("()");
    expected.add("((()))");
    List<String> result = SeparateParenGroups.separateParenGroups("((()))()((()))");
    assertEquals(expected, result);
}

// Test case 10: Test with complex string
@Test
void testComplexString() {
    List<String> expected = new ArrayList<String>();
    expected.add("()");
    expected.add("((()))");
    expected.add("()");
    expected.add("()");
    expected.add("((()))");
    List<String> result = SeparateParenGroups.separateParenGroups("()((()))()()((()))");
    assertEquals(expected, result);
}
}