// Test case 1: Test that an empty memory has size 0.
@Test
void testEmptyMemorySize() {
    Memory memory = new Memory();
    assertEquals(0, memory.size());
}

// Test case 2: Test that a memory with one memory array has the size of that array.
@Test
void testSingleMemoryArraySize() {
    MemoryArray array = new MemoryArray(100);
    Memory memory = new Memory();
    memory.addMemoryArray(array);
    assertEquals(100, memory.size());
}

// Test case 3: Test that a memory with multiple memory arrays has the sum of their sizes.
@Test
void testMultipleMemoryArraysSize() {
    MemoryArray array1 = new MemoryArray(100);
    MemoryArray array2 = new MemoryArray(50);
    MemoryArray array3 = new MemoryArray(200);
    Memory memory = new Memory();
    memory.addMemoryArray(array1);
    memory.addMemoryArray(array2);
    memory.addMemoryArray(array3);
    assertEquals(350, memory.size());
}

// Test case 4: Test that adding a memory array increases the size of the memory.
@Test
void testAddMemoryArrayIncreasesSize() {
    MemoryArray array = new MemoryArray(100);
    Memory memory = new Memory();
    int initialSize = memory.size();
    memory.addMemoryArray(array);
    assertEquals(initialSize + 100, memory.size());
}

// Test case 5: Test that setting a value at an address outside of the memory does not increase the size.
@Test
void testSetOutsideMemoryDoesNotIncreaseSize() {
    Memory memory = new Memory();
    int initialSize = memory.size();
    memory.set(1000, (short) 5);
    assertEquals(initialSize, memory.size());
}

// Test case 6: Test that getting a value at an address outside of the memory returns 0.
@Test
void testGetOutsideMemoryReturnsZero() {
    Memory memory = new Memory();
    assertEquals(0, memory.get(1000));
}

// Test case 7: Test that setting a value at an address outside of the memory does not affect other values.
@Test
void testSetOutsideMemoryDoesNotAffectOtherValues() {
    MemoryArray array = new MemoryArray(100);
    Memory memory = new Memory();
    memory.addMemoryArray(array);
    memory.set(1000, (short) 5);
    assertEquals(0, memory.get(0));
}

// Test case 8: Test that setting a value at an address within the memory affects that value.
@Test
void testSetWithinMemoryAffectsValue() {
    MemoryArray array = new MemoryArray(100);
    Memory memory = new Memory();
    memory.addMemoryArray(array);
    memory.set(50, (short) 5);
    assertEquals(5, memory.get(50));
}

// Test case 9: Test that setting a value at an address within the memory does not affect other values.
@Test
void testSetWithinMemoryDoesNotAffectOtherValues() {
    MemoryArray array = new MemoryArray(100);
    Memory memory = new Memory();
    memory.addMemoryArray(array);
    memory.set(50, (short) 5);
    assertEquals(0, memory.get(0));
}

// Test case 10: Test that getting a value at an address within the memory returns the correct value.
@Test
void testGetWithinMemoryReturnsCorrectValue() {
    MemoryArray array = new MemoryArray(100);
    Memory memory = new Memory();
    memory.addMemoryArray(array);
    memory.set(50, (short) 5);
    assertEquals(5, memory.get(50));
}