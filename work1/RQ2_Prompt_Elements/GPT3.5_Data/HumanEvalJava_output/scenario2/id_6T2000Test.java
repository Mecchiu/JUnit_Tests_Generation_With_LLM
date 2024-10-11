// Test case 1: Empty string
@Test
void testEmptyString() {
    List<Integer> expected = new ArrayList<Integer>();
    List<Integer> actual = ParseNestedParens.parseNestedParens("");
    assertEquals(expected, actual);
}

// Test case 2: Single group with no nesting
@Test
void testSingleGroupNoNesting() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(0);
    List<Integer> actual = ParseNestedParens.parseNestedParens("()");
    assertEquals(expected, actual);
}

// Test case 3: Single group with nesting
@Test
void testSingleGroupWithNesting() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    List<Integer> actual = ParseNestedParens.parseNestedParens("(())");
    assertEquals(expected, actual);
}

// Test case 4: Multiple groups with no nesting
@Test
void testMultipleGroupNoNesting() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(0);
    expected.add(0);
    expected.add(0);
    List<Integer> actual = ParseNestedParens.parseNestedParens("() () ()");
    assertEquals(expected, actual);
}

// Test case 5: Multiple groups with nesting
@Test
void testMultipleGroupWithNesting() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    expected.add(1);
    List<Integer> actual = ParseNestedParens.parseNestedParens("(()()) ((())) ()");
    assertEquals(expected, actual);
}

// Test case 6: Multiple groups with different nesting levels
@Test
void testMultipleGroupDifferentNesting() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    expected.add(1);
    expected.add(0);
    expected.add(3);
    List<Integer> actual = ParseNestedParens.parseNestedParens("(()()) ((())) () ()()()");
    assertEquals(expected, actual);
}

// Test case 7: Single group with only opening parenthesis
@Test
void testSingleGroupOnlyOpening() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(0);
    List<Integer> actual = ParseNestedParens.parseNestedParens("(");
    assertEquals(expected, actual);
}

// Test case 8: Single group with only closing parenthesis
@Test
void testSingleGroupOnlyClosing() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(0);
    List<Integer> actual = ParseNestedParens.parseNestedParens(")");
    assertEquals(expected, actual);
}

// Test case 9: Multiple groups with only opening parenthesis
@Test
void testMultipleGroupOnlyOpening() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(0);
    expected.add(0);
    expected.add(0);
    List<Integer> actual = ParseNestedParens.parseNestedParens("( ( (");
    assertEquals(expected, actual);
}

// Test case 10: Multiple groups with only closing parenthesis
@Test
void testMultipleGroupOnlyClosing() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(0);
    expected.add(0);
    expected.add(0);
    List<Integer> actual = ParseNestedParens.parseNestedParens(") ) )");
    assertEquals(expected, actual);
}
}