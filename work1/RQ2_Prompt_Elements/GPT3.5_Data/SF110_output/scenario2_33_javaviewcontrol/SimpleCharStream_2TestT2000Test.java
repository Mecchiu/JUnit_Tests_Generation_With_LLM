// Test case 1: Test when buffer is empty
@Test
void testGetImageEmptyBuffer() {
    SimpleCharStream stream = new SimpleCharStream();
    assertEquals("", stream.GetImage());
}

// Test case 2: Test when tokenBegin is greater than bufpos
@Test
void testGetImageTokenBeginGreaterThanBufpos() {
    SimpleCharStream stream = new SimpleCharStream();
    stream.bufpos = 5;
    stream.tokenBegin = 10;
    stream.buffer = new char[20];
    assertEquals("          ", stream.GetImage());
}

// Test case 3: Test when tokenBegin is equal to bufpos
@Test
void testGetImageTokenBeginEqualsBufpos() {
    SimpleCharStream stream = new SimpleCharStream();
    stream.bufpos = 5;
    stream.tokenBegin = 5;
    stream.buffer = new char[20];
    stream.buffer[5] = 'a';
    assertEquals("a", stream.GetImage());
}

// Test case 4: Test when tokenBegin is less than bufpos and there is no wraparound
@Test
void testGetImageTokenBeginLessThanBufposNoWraparound() {
    SimpleCharStream stream = new SimpleCharStream();
    stream.bufpos = 5;
    stream.tokenBegin = 2;
    stream.buffer = new char[20];
    stream.buffer[2] = 'a';
    stream.buffer[3] = 'b';
    stream.buffer[4] = 'c';
    stream.buffer[5] = 'd';
    assertEquals("abcd", stream.GetImage());
}

// Test case 5: Test when tokenBegin is less than bufpos and there is wraparound
@Test
void testGetImageTokenBeginLessThanBufposWithWraparound() {
    SimpleCharStream stream = new SimpleCharStream();
    stream.bufpos = 2;
    stream.tokenBegin = 18;
    stream.buffer = new char[20];
    stream.buffer[18] = 'a';
    stream.buffer[19] = 'b';
    stream.buffer[0] = 'c';
    stream.buffer[1] = 'd';
    stream.buffer[2] = 'e';
    assertEquals("abcde", stream.GetImage());
}

// Test case 6: Test when tokenBegin is equal to bufsize
@Test
void testGetImageTokenBeginEqualsBufsize() {
    SimpleCharStream stream = new SimpleCharStream();
    stream.bufpos = 5;
    stream.tokenBegin = 20;
    stream.buffer = new char[20];
    stream.buffer[0] = 'a';
    stream.buffer[1] = 'b';
    stream.buffer[2] = 'c';
    stream.buffer[3] = 'd';
    stream.buffer[4] = 'e';
    assertEquals("abcde", stream.GetImage());
}

// Test case 7: Test when tokenBegin is greater than bufsize
@Test
void testGetImageTokenBeginGreaterThanBufsize() {
    SimpleCharStream stream = new SimpleCharStream();
    stream.bufpos = 5;
    stream.tokenBegin = 25;
    stream.buffer = new char[20];
    assertEquals("", stream.GetImage());
}

// Test case 8: Test when tokenBegin is negative
@Test
void testGetImageTokenBeginNegative() {
    SimpleCharStream stream = new SimpleCharStream();
    stream.bufpos = 5;
    stream.tokenBegin = -1;
    stream.buffer = new char[20];
    assertEquals("", stream.GetImage());
}

// Test case 9: Test when buffer contains null characters
@Test
void testGetImageNullCharacters() {
    SimpleCharStream stream = new SimpleCharStream();
    stream.bufpos = 5;
    stream.tokenBegin = 2;
    stream.buffer = new char[20];
    stream.buffer[2] = 'a';
    stream.buffer[3] = '\0';
    stream.buffer[4] = 'c';
    stream.buffer[5] = 'd';
    assertEquals("a\0cd", stream.GetImage());
}

// Test case 10: Test when buffer contains non-ASCII characters
@Test
void testGetImageNonAsciiCharacters() {
    SimpleCharStream stream = new SimpleCharStream();
    stream.bufpos = 5;
    stream.tokenBegin = 2;
    stream.buffer = new char[20];
    stream.buffer[2] = 'a';
    stream.buffer[3] = '€';
    stream.buffer[4] = 'c';
    stream.buffer[5] = 'd';
    assertEquals("a€cd", stream.GetImage());
}
}