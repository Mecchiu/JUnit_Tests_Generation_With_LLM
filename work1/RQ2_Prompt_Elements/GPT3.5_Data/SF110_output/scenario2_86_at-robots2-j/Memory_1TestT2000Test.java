// Here's an example implementation of the Memory_1Test class with ten unit test cases for the get() method:

class Memory_1Test {

    @Test
    void testGetValidAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        short expected = 42;
        memory.arrays.get(2).set(512, expected);
        assertEquals(expected, memory.get(2560));
    }

    @Test
    void testGetInvalidAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        assertThrows(MemoryBoundsException.class, () -> memory.get(1024));
    }

    @Test
    void testGetNegativeAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        assertThrows(MemoryBoundsException.class, () -> memory.get(-1));
    }

    @Test
    void testGetZeroAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        assertEquals(0, memory.get(0));
    }

    @Test
    void testGetFirstAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        short expected = 42;
        memory.arrays.get(0).set(0, expected);
        assertEquals(expected, memory.get(0));
    }

    @Test
    void testGetLastAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        short expected = 42;
        memory.arrays.get(0).set(1023, expected);
        assertEquals(expected, memory.get(1023));
    }

    @Test
    void testGetSecondArrayAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        short expected = 42;
        memory.arrays.get(1).set(512, expected);
        assertEquals(expected, memory.get(1536));
    }

    @Test
    void testGetThirdArrayAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        short expected = 42;
        memory.arrays.get(2).set(512, expected);
        assertEquals(expected, memory.get(2560));
    }

    @Test
    void testGetFourthArrayAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        short expected = 42;
        memory.arrays.get(3).set(512, expected);
        assertEquals(expected, memory.get(3584));
    }

    @Test
    void testGetFifthArrayAddress() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        memory.arrays.add(new MemoryArray(1024));
        short expected = 42;
        memory.arrays.get(4).set(512, expected);
        assertEquals(expected, memory.get(4608));
    }
}