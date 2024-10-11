// Test case 1: Test if textAt() returns the correct text for a non-trivial VWordPosition
@Test
void testTextAtNonTrivial() {
    CharTable ct = new CharTable(3, 3);
    ct.setCharAt(0, 0, 'h');
    ct.setCharAt(0, 1, 'e');
    ct.setCharAt(0, 2, 'l');
    ct.setCharAt(1, 0, 'l');
    ct.setCharAt(1, 1, 'o');
    ct.setCharAt(1, 2, ' ');
    ct.setCharAt(2, 0, 'w');
    ct.setCharAt(2, 1, 'o');
    ct.setCharAt(2, 2, 'r');
    VWordPosition vwp = new VWordPosition(0, 0, 2);
    assertEquals("hel", vwp.textAt(ct));
}

// Test case 2: Test if textAt() returns the correct text for a trivial VWordPosition
@Test
void testTextAtTrivial() {
    CharTable ct = new CharTable(3, 3);
    ct.setCharAt(0, 0, 'h');
    ct.setCharAt(0, 1, 'e');
    ct.setCharAt(0, 2, 'l');
    ct.setCharAt(1, 0, 'l');
    ct.setCharAt(1, 1, 'o');
    ct.setCharAt(1, 2, ' ');
    ct.setCharAt(2, 0, 'w');
    ct.setCharAt(2, 1, 'o');
    ct.setCharAt(2, 2, 'r');
    VWordPosition vwp = new VWordPosition(new CharPosition(0, 0));
    assertEquals("h", vwp.textAt(ct));
}

// Test case 3: Test if textAt() returns an empty string for an empty VWordPosition
@Test
void testTextAtEmpty() {
    CharTable ct = new CharTable(3, 3);
    VWordPosition vwp = new VWordPosition(new CharPosition(0, 0));
    assertEquals("", vwp.textAt(ct));
}

// Test case 4: Test if textAt() returns the correct text for a VWordPosition that spans the entire CharTable
@Test
void testTextAtFull() {
    CharTable ct = new CharTable(3, 3);
    ct.setCharAt(0, 0, 'h');
    ct.setCharAt(0, 1, 'e');
    ct.setCharAt(0, 2, 'l');
    ct.setCharAt(1, 0, 'l');
    ct.setCharAt(1, 1, 'o');
    ct.setCharAt(1, 2, ' ');
    ct.setCharAt(2, 0, 'w');
    ct.setCharAt(2, 1, 'o');
    ct.setCharAt(2, 2, 'r');
    VWordPosition vwp = new VWordPosition(0, 0, 3);
    assertEquals("hello wor", vwp.textAt(ct));
}

// Test case 5: Test if textAt() returns the correct text for a VWordPosition that starts at the bottom of the CharTable
@Test
void testTextAtStartsAtBottom() {
    CharTable ct = new CharTable(3, 3);
    ct.setCharAt(0, 0, 'h');
    ct.setCharAt(0, 1, 'e');
    ct.setCharAt(0, 2, 'l');
    ct.setCharAt(1, 0, 'l');
    ct.setCharAt(1, 1, 'o');
    ct.setCharAt(1, 2, ' ');
    ct.setCharAt(2, 0, 'w');
    ct.setCharAt(2, 1, 'o');
    ct.setCharAt(2, 2, 'r');
    VWordPosition vwp = new VWordPosition(2, new CharPosition(0, 0));
    assertEquals("wo", vwp.textAt(ct));
}

// Test case 6: Test if textAt() returns the correct text for a VWordPosition that ends at the top of the CharTable
@Test
void testTextAtEndsAtTop() {
    CharTable ct = new CharTable(3, 3);
    ct.setCharAt(0, 0, 'h');
    ct.setCharAt(0, 1, 'e');
    ct.setCharAt(0, 2, 'l');
    ct.setCharAt(1, 0, 'l');
    ct.setCharAt(1, 1, 'o');
    ct.setCharAt(1, 2, ' ');
    ct.setCharAt(2, 0, 'w');
    ct.setCharAt(2, 1, 'o');
    ct.setCharAt(2, 2, 'r');
    VWordPosition vwp = new VWordPosition(0, new CharPosition(0, 2));
    assertEquals("hel", vwp.textAt(ct));
}

// Test case 7: Test if textAt() returns the correct text for a VWordPosition that starts and ends at the same position
@Test
void testTextAtSamePosition() {
    CharTable ct = new CharTable(3, 3);
    ct.setCharAt(0, 0, 'h');
    ct.setCharAt(0, 1, 'e');
    ct.setCharAt(0, 2, 'l');
    ct.setCharAt(1, 0, 'l');
    ct.setCharAt(1, 1, 'o');
    ct.setCharAt(1, 2, ' ');
    ct.setCharAt(2, 0, 'w');
    ct.setCharAt(2, 1, 'o');
    ct.setCharAt(2, 2, 'r');
    VWordPosition vwp = new VWordPosition(new CharPosition(0, 0));
    assertEquals("h", vwp.textAt(ct));
}

// Test case 8: Test if textAt() returns the correct text for a VWordPosition that starts and ends at the same position in an empty CharTable
@Test
void testTextAtSamePositionEmpty() {
    CharTable ct = new CharTable(3, 3);
    VWordPosition vwp = new VWordPosition(new CharPosition(0, 0));
    assertEquals("", vwp.textAt(ct));
}

// Test case 9: Test if textAt() returns the correct text for a VWordPosition that spans only one character
@Test
void testTextAtSingleChar() {
    CharTable ct = new CharTable(3, 3);
    ct.setCharAt(0, 0, 'h');
    ct.setCharAt(0, 1, 'e');
    ct.setCharAt(0, 2, 'l');
    ct.setCharAt(1, 0, 'l');
    ct.setCharAt(1, 1, 'o');
    ct.setCharAt(1, 2, ' ');
    ct.setCharAt(2, 0, 'w');
    ct.setCharAt(2, 1, 'o');
    ct.setCharAt(2, 2, 'r');
    VWordPosition vwp = new VWordPosition(new CharPosition(0, 1));
    assertEquals("e", vwp.textAt(ct));
}

// Test case 10: Test if textAt() returns an empty string for a VWordPosition that does not intersect with the CharTable
@Test
void testTextAtNoIntersection() {
    CharTable ct = new CharTable(3, 3);
    ct.setCharAt(0, 0, 'h');
    ct.setCharAt(0, 1, 'e');
    ct.setCharAt(0, 2, 'l');
    ct.setCharAt(1, 0, 'l');
    ct.setCharAt(1, 1, 'o');
    ct.setCharAt(1, 2, ' ');
    ct.setCharAt(2, 0, 'w');
    ct.setCharAt(2, 1, 'o');
    ct.setCharAt(2, 2, 'r');
    VWordPosition vwp = new VWordPosition(3, new CharPosition(0, 0));
    assertEquals("", vwp.textAt(ct));
}