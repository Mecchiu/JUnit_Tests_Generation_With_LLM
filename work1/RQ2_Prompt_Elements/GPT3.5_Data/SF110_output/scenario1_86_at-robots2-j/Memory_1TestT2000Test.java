// Here's an example implementation of the Memory_1Test class with ten unit test cases for the get() method:

class Memory_1Test {

    @Test
    void testGetFirstAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{1, 2, 3}));
        assertEquals(1, memory.get(0));
    }

    @Test
    void testGetLastAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{1, 2, 3}));
        assertEquals(3, memory.get(2));
    }

    @Test
    void testGetOutOfBounds() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{1, 2, 3}));
        assertThrows(MemoryBoundsException.class, () -> memory.get(3));
    }

    @Test
    void testGetNegativeAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{1, 2, 3}));
        assertThrows(MemoryBoundsException.class, () -> memory.get(-1));
    }

    @Test
    void testGetMultipleArrays() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{1, 2}));
        memory.arrays.add(new MemoryArray(new short[]{3, 4}));
        assertEquals(3, memory.get(2));
    }

    @Test
    void testGetMultipleArraysOutOfBounds() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{1, 2}));
        memory.arrays.add(new MemoryArray(new short[]{3, 4}));
        assertThrows(MemoryBoundsException.class, () -> memory.get(4));
    }

    @Test
    void testGetMultipleArraysNegativeAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{1, 2}));
        memory.arrays.add(new MemoryArray(new short[]{3, 4}));
        assertThrows(MemoryBoundsException.class, () -> memory.get(-1));
    }

    @Test
    void testGetEmptyArray() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{}));
        assertThrows(MemoryBoundsException.class, () -> memory.get(0));
    }

    @Test
    void testGetMultipleEmptyArrays() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{}));
        memory.arrays.add(new MemoryArray(new short[]{}));
        assertThrows(MemoryBoundsException.class, () -> memory.get(0));
    }

    @Test
    void testGetMultipleEmptyArraysOutOfBounds() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[]{}));
        memory.arrays.add(new MemoryArray(new short[]{}));
        assertThrows(MemoryBoundsException.class, () -> memory.get(1));
    }
}