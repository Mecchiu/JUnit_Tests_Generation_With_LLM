// Test case 1: Test reading from a valid address
@Test
void testGetValidAddress() {
    Memory memory = new Memory();
    MemoryArray array = new MemoryArray(0, 10);
    for (int i = 0; i < 10; i++) {
        array.set(i, (short) (i + 1));
    }
    memory.addMemoryArray(array);
    assertEquals(1, memory.get(0));
    assertEquals(5, memory.get(4));
    assertEquals(10, memory.get(9));
}

// Test case 2: Test reading from an invalid address (negative)
@Test
void testGetNegativeAddress() {
    Memory memory = new Memory();
    assertEquals(0, memory.get(-1));
}

// Test case 3: Test reading from an invalid address (too large)
@Test
void testGetTooLargeAddress() {
    Memory memory = new Memory();
    MemoryArray array = new MemoryArray(0, 10);
    memory.addMemoryArray(array);
    assertEquals(0, memory.get(10));
}

// Test case 4: Test reading from an empty memory
@Test
void testGetEmptyMemory() {
    Memory memory = new Memory();
    assertEquals(0, memory.get(0));
}

// Test case 5: Test reading from a memory with multiple arrays
@Test
void testGetMultipleArrays() {
    Memory memory = new Memory();
    MemoryArray array1 = new MemoryArray(0, 5);
    MemoryArray array2 = new MemoryArray(10, 5);
    for (int i = 0; i < 5; i++) {
        array1.set(i, (short) (i + 1));
        array2.set(i, (short) (i + 6));
    }
    memory.addMemoryArray(array1);
    memory.addMemoryArray(array2);
    assertEquals(1, memory.get(0));
    assertEquals(6, memory.get(10));
    assertEquals(9, memory.get(14));
}

// Test case 6: Test reading from a memory with overlapping arrays
@Test
void testGetOverlappingArrays() {
    Memory memory = new Memory();
    MemoryArray array1 = new MemoryArray(0, 5);
    MemoryArray array2 = new MemoryArray(3, 5);
    for (int i = 0; i < 5; i++) {
        array1.set(i, (short) (i + 1));
        array2.set(i, (short) (i + 6));
    }
    memory.addMemoryArray(array1);
    memory.addMemoryArray(array2);
    assertEquals(1, memory.get(0));
    assertEquals(4, memory.get(3));
    assertEquals(10, memory.get(7));
}

// Test case 7: Test reading from a memory with non-contiguous arrays
@Test
void testGetNonContiguousArrays() {
    Memory memory = new Memory();
    MemoryArray array1 = new MemoryArray(0, 5);
    MemoryArray array2 = new MemoryArray(10, 5);
    for (int i = 0; i < 5; i++) {
        array1.set(i, (short) (i + 1));
        array2.set(i, (short) (i + 6));
    }
    memory.addMemoryArray(array2);
    memory.addMemoryArray(array1);
    assertEquals(1, memory.get(0));
    assertEquals(6, memory.get(10));
    assertEquals(9, memory.get(14));
}

// Test case 8: Test reading from a memory with a null array
@Test
void testGetNullArray() {
    Memory memory = new Memory();
    MemoryArray array = new MemoryArray(0, 5);
    memory.addMemoryArray(array);
    memory.addMemoryArray(null);
    assertEquals(0, memory.get(5));
}

// Test case 9: Test reading from a memory with a partially null array
@Test
void testGetPartiallyNullArray() {
    Memory memory = new Memory();
    MemoryArray array1 = new MemoryArray(0, 5);
    MemoryArray array2 = new MemoryArray(10, 5);
    for (int i = 0; i < 5; i++) {
        array1.set(i, (short) (i + 1));
        array2.set(i, (short) (i + 6));
    }
    memory.addMemoryArray(array1);
    memory.addMemoryArray(null);
    memory.addMemoryArray(array2);
    assertEquals(1, memory.get(0));
    assertEquals(6, memory.get(10));
    assertEquals(9, memory.get(14));
}

// Test case 10: Test reading from a memory with a negative array index
@Test
void testGetNegativeArrayIndex() {
    Memory memory = new Memory();
    MemoryArray array = new MemoryArray(-5, 5);
    for (int i = 0; i < 5; i++) {
        array.set(i, (short) (i + 1));
    }
    memory.addMemoryArray(array);
    assertEquals(1, memory.get(-5));
    assertEquals(5, memory.get(-1));
}
}