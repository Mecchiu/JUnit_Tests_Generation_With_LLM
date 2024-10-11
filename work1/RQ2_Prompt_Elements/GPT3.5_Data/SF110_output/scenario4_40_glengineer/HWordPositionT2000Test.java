// Test case 1: Test if textAt() returns the correct text for a trivial word position
@Test
void testTextAtTrivial() {
    CharTable ct = new CharTable(new Block[][]{{new Block('a')}}); // create a char table with a single block containing 'a'
    HWordPosition wp = new HWordPosition(new CharPosition(0, 0)); // create a trivial word position at (0,0)
    assertEquals("a", wp.textAt(ct)); // expect the text "a"
}

// Test case 2: Test if textAt() returns the correct text for a non-trivial word position
@Test
void testTextAtNonTrivial() {
    CharTable ct = new CharTable(new Block[][]{{new Block('a'), new Block('b')}}); // create a char table with two blocks containing 'a' and 'b'
    HWordPosition wp = new HWordPosition(0, 2, 0); // create a word position spanning from (0,0) to (2,0)
    assertEquals("ab", wp.textAt(ct)); // expect the text "ab"
}

// Test case 3: Test if textAt() returns an empty string for an empty char table
@Test
void testTextAtEmptyTable() {
    CharTable ct = new CharTable(new Block[][]{}); // create an empty char table
    HWordPosition wp = new HWordPosition(new CharPosition(0, 0)); // create a trivial word position at (0,0)
    assertEquals("", wp.textAt(ct)); // expect an empty string
}

// Test case 4: Test if textAt() returns an empty string for a word position outside the char table
@Test
void testTextAtOutsideTable() {
    CharTable ct = new CharTable(new Block[][]{{new Block('a')}}); // create a char table with a single block containing 'a'
    HWordPosition wp = new HWordPosition(1, 2, 0); // create a word position outside the char table
    assertEquals("", wp.textAt(ct)); // expect an empty string
}

// Test case 5: Test if textAt() returns the correct text for a word position spanning multiple rows
@Test
void testTextAtMultipleRows() {
    CharTable ct = new CharTable(new Block[][]{{new Block('a'), new Block('b')}, {new Block('c'), new Block('d')}}); // create a char table with four blocks containing 'a', 'b', 'c', and 'd'
    HWordPosition wp = new HWordPosition(0, 4, 0); // create a word position spanning from (0,0) to (4,0)
    assertEquals("abcd", wp.textAt(ct)); // expect the text "abcd"
}

// Test case 6: Test if textAt() returns the correct text for a word position spanning only one block
@Test
void testTextAtSingleBlock() {
    CharTable ct = new CharTable(new Block[][]{{new Block('a'), new Block('b')}, {new Block('c'), new Block('d')}}); // create a char table with four blocks containing 'a', 'b', 'c', and 'd'
    HWordPosition wp = new HWordPosition(1, 2, 0); // create a word position spanning from (1,0) to (2,0)
    assertEquals("b", wp.textAt(ct)); // expect the text "b"
}

// Test case 7: Test if textAt() returns the correct text for a word position spanning only one character
@Test
void testTextAtSingleChar() {
    CharTable ct = new CharTable(new Block[][]{{new Block('a'), new Block('b')}, {new Block('c'), new Block('d')}}); // create a char table with four blocks containing 'a', 'b', 'c', and 'd'
    HWordPosition wp = new HWordPosition(new CharPosition(1, 0)); // create a trivial word position at (1,0)
    assertEquals("b", wp.textAt(ct)); // expect the text "b"
}

// Test case 8: Test if textAt() returns the correct text for a word position spanning only one row
@Test
void testTextAtSingleRow() {
    CharTable ct = new CharTable(new Block[][]{{new Block('a'), new Block('b')}, {new Block('c'), new Block('d')}}); // create a char table with four blocks containing 'a', 'b', 'c', and 'd'
    HWordPosition wp = new HWordPosition(0, 2, 1); // create a word position spanning from (0,1) to (2,1)
    assertEquals("cd", wp.textAt(ct)); // expect the text "cd"
}

// Test case 9: Test if textAt() returns the correct text for a word position spanning the entire char table
@Test
void testTextAtEntireTable() {
    CharTable ct = new CharTable(new Block[][]{{new Block('a'), new Block('b')}, {new Block('c'), new Block('d')}}); // create a char table with four blocks containing 'a', 'b', 'c', and 'd'
    HWordPosition wp = new HWordPosition(0, 4, 0); // create a word position spanning from (0,0) to (4,0)
    assertEquals("abcd", wp.textAt(ct)); // expect the text "abcd"
}

// Test case 10: Test if textAt() returns the correct text for a word position spanning only one column
@Test
void testTextAtSingleColumn() {
    CharTable ct = new CharTable(new Block[][]{{new Block('a'), new Block('b')}, {new Block('c'), new Block('d')}}); // create a char table with four blocks containing 'a', 'b', 'c', and 'd'
    HWordPosition wp = new HWordPosition(new CharPosition(0, 1)); // create a trivial word position at (0,1)
    assertEquals("b\nd", wp.textAt(ct)); // expect the text "b\nd"
}
}