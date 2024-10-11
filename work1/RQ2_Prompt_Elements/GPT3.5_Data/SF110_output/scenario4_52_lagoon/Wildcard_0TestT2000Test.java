// Test case 1: Test if a simple pattern without wildcard is not a wildcard
@Test
void testIsWildcard_simplePatternWithoutWildcard() {
    String pattern = "file.txt";
    assertFalse(Wildcard.isWildcard(pattern));
}

// Test case 2: Test if a simple pattern with wildcard is a wildcard
@Test
void testIsWildcard_simplePatternWithWildcard() {
    String pattern = "file*.txt";
    assertTrue(Wildcard.isWildcard(pattern));
}

// Test case 3: Test if a pattern with multiple simple patterns separated by ';' is a wildcard
@Test
void testIsWildcard_multipleSimplePatterns() {
    String pattern = "file*.txt;*.xml";
    assertTrue(Wildcard.isWildcard(pattern));
}

// Test case 4: Test if a pattern with only wildcard is a wildcard
@Test
void testIsWildcard_onlyWildcard() {
    String pattern = "*";
    assertTrue(Wildcard.isWildcard(pattern));
}

// Test case 5: Test if an empty pattern is not a wildcard
@Test
void testIsWildcard_emptyPattern() {
    String pattern = "";
    assertFalse(Wildcard.isWildcard(pattern));
}

// Test case 6: Test if a pattern with only ';' is not a wildcard
@Test
void testIsWildcard_onlySeparator() {
    String pattern = ";";
    assertFalse(Wildcard.isWildcard(pattern));
}

// Test case 7: Test if a pattern with multiple wildcards is a wildcard
@Test
void testIsWildcard_multipleWildcards() {
    String pattern = "*file*.*txt*";
    assertTrue(Wildcard.isWildcard(pattern));
}

// Test case 8: Test if a pattern with wildcard at the beginning is a wildcard
@Test
void testIsWildcard_wildcardAtBeginning() {
    String pattern = "*.txt";
    assertTrue(Wildcard.isWildcard(pattern));
}

// Test case 9: Test if a pattern with wildcard at the end is a wildcard
@Test
void testIsWildcard_wildcardAtEnd() {
    String pattern = "file*";
    assertTrue(Wildcard.isWildcard(pattern));
}

// Test case 10: Test if a pattern with only '*' and ';' is not a wildcard
@Test
void testIsWildcard_onlyWildcardsAndSeparator() {
    String pattern = "*;*;*";
    assertFalse(Wildcard.isWildcard(pattern));
} 
}