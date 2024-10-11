// Here's an example of how you could write the test cases for the Program class:

    @Test
    void testCreateProgramMemory() {
        // Test case 1: Empty program code
        Program program = new Program(new short[]{});
        MemoryArray memory = program.createProgramMemory();
        assertEquals(0, memory.getSize());

        // Test case 2: Program code with one instruction
        program = new Program(new short[]{0x0001});
        memory = program.createProgramMemory();
        assertEquals(1, memory.getSize());
        assertEquals(0x0001, memory.read(0));

        // Test case 3: Program code with multiple instructions
        program = new Program(new short[]{0x0001, 0x0002, 0x0003});
        memory = program.createProgramMemory();
        assertEquals(3, memory.getSize());
        assertEquals(0x0001, memory.read(0));
        assertEquals(0x0002, memory.read(1));
        assertEquals(0x0003, memory.read(2));

        // Test case 4: Program code with negative instruction
        program = new Program(new short[]{-1});
        memory = program.createProgramMemory();
        assertEquals(1, memory.getSize());
        assertEquals(-1, memory.read(0));

        // Test case 5: Program code with maximum positive instruction
        program = new Program(new short[]{Short.MAX_VALUE});
        memory = program.createProgramMemory();
        assertEquals(1, memory.getSize());
        assertEquals(Short.MAX_VALUE, memory.read(0));

        // Test case 6: Program code with maximum negative instruction
        program = new Program(new short[]{Short.MIN_VALUE});
        memory = program.createProgramMemory();
        assertEquals(1, memory.getSize());
        assertEquals(Short.MIN_VALUE, memory.read(0));

        // Test case 7: Program code with mixed positive and negative instructions
        program = new Program(new short[]{1, -1, 2, -2, 3, -3});
        memory = program.createProgramMemory();
        assertEquals(6, memory.getSize());
        assertEquals(1, memory.read(0));
        assertEquals(-1, memory.read(1));
        assertEquals(2, memory.read(2));
        assertEquals(-2, memory.read(3));
        assertEquals(3, memory.read(4));
        assertEquals(-3, memory.read(5));

        // Test case 8: Program code with zero instruction
        program = new Program(new short[]{0});
        memory = program.createProgramMemory();
        assertEquals(1, memory.getSize());
        assertEquals(0, memory.read(0));

        // Test case 9: Program code with repeated instructions
        program = new Program(new short[]{1, 1, 1, 1});
        memory = program.createProgramMemory();
        assertEquals(4, memory.getSize());
        assertEquals(1, memory.read(0));
        assertEquals(1, memory.read(1));
        assertEquals(1, memory.read(2));
        assertEquals(1, memory.read(3));

        // Test case 10: Program code with null instruction
        assertThrows(NullPointerException.class, () -> new Program(null).createProgramMemory());
    }