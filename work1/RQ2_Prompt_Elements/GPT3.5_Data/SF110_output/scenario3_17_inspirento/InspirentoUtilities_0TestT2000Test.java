// Test case 1: Test with a simple input string
@Test
void testTokenize1() {
    String input = "Hello World";
    String[] expectedOutput = {"Hello", "World"};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}

// Test case 2: Test with an input string containing multiple spaces
@Test
void testTokenize2() {
    String input = "   This is a   test   ";
    String[] expectedOutput = {"This", "is", "a", "test"};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}

// Test case 3: Test with an input string containing tabs
@Test
void testTokenize3() {
    String input = "Tab\tSeparated\tValues";
    String[] expectedOutput = {"Tab", "Separated", "Values"};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}

// Test case 4: Test with an input string containing new lines
@Test
void testTokenize4() {
    String input = "New\nLine\nSeparated\nValues";
    String[] expectedOutput = {"New", "Line", "Separated", "Values"};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}

// Test case 5: Test with an input string containing a mix of spaces, tabs and new lines
@Test
void testTokenize5() {
    String input = "Mix\tOf\nSpaces\tTabs\nAnd\nNew\nLines";
    String[] expectedOutput = {"Mix", "Of", "Spaces", "Tabs", "And", "New", "Lines"};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}

// Test case 6: Test with an input string containing only one token
@Test
void testTokenize6() {
    String input = "Token";
    String[] expectedOutput = {"Token"};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}

// Test case 7: Test with an input string containing only spaces
@Test
void testTokenize7() {
    String input = "   ";
    String[] expectedOutput = {};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}

// Test case 8: Test with an input string containing only tabs
@Test
void testTokenize8() {
    String input = "\t\t\t";
    String[] expectedOutput = {};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}

// Test case 9: Test with an input string containing only new lines
@Test
void testTokenize9() {
    String input = "\n\n\n";
    String[] expectedOutput = {};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}

// Test case 10: Test with an empty input string
@Test
void testTokenize10() {
    String input = "";
    String[] expectedOutput = {};
    assertArrayEquals(expectedOutput, InspirentoUtilities.tokenize(input));
}