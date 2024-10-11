// Here's an example of how you could write the unit tests for the Program class:

    class ProgramTest {
        @Test
        void testCreateProgramMemory() {
            // Test case 1: Empty program
            Program program = new Program(new byte[]{});
            MemoryArray memoryArray = program.createProgramMemory();
            assertEquals(0, memoryArray.getSize());

            // Test case 2: Program with one instruction
            program = new Program(new byte[]{0x01});
            memoryArray = program.createProgramMemory();
            assertEquals(1, memoryArray.getSize());
            assertEquals(0x01, memoryArray.read(0));

            // Test case 3: Program with multiple instructions
            program = new Program(new byte[]{0x01, 0x02, 0x03});
            memoryArray = program.createProgramMemory();
            assertEquals(3, memoryArray.getSize());
            assertEquals(0x01, memoryArray.read(0));
            assertEquals(0x02, memoryArray.read(1));
            assertEquals(0x03, memoryArray.read(2));

            // Test case 4: Program with maximum size
            byte[] programCode = new byte[MemoryArray.MAX_SIZE];
            for (int i = 0; i < programCode.length; i++) {
                programCode[i] = (byte) i;
            }
            program = new Program(programCode);
            memoryArray = program.createProgramMemory();
            assertEquals(MemoryArray.MAX_SIZE, memoryArray.getSize());
            for (int i = 0; i < programCode.length; i++) {
                assertEquals(programCode[i], memoryArray.read(i));
            }

            // Test case 5: Program with more than maximum size
            programCode = new byte[MemoryArray.MAX_SIZE + 1];
            for (int i = 0; i < programCode.length; i++) {
                programCode[i] = (byte) i;
            }
            program = new Program(programCode);
            assertThrows(IllegalArgumentException.class, program::createProgramMemory);

            // Test case 6: Program with negative size
            program = new Program(new byte[]{-1, -2, -3});
            assertThrows(IllegalArgumentException.class, program::createProgramMemory);

            // Test case 7: Program with null code
            program = new Program(null);
            assertThrows(NullPointerException.class, program::createProgramMemory);

            // Test case 8: Program with empty code array
            program = new Program(new byte[]{});
            memoryArray = program.createProgramMemory();
            assertEquals(0, memoryArray.getSize());

            // Test case 9: Program with code array containing null bytes
            program = new Program(new byte[]{0x01, 0x00, 0x02, 0x00, 0x03});
            memoryArray = program.createProgramMemory();
            assertEquals(5, memoryArray.getSize());
            assertEquals(0x01, memoryArray.read(0));
            assertEquals(0x00, memoryArray.read(1));
            assertEquals(0x02, memoryArray.read(2));
            assertEquals(0x00, memoryArray.read(3));
            assertEquals(0x03, memoryArray.read(4));

            // Test case 10: Program with code array containing negative bytes
            program = new Program(new byte[]{0x01, -2, 0x03});
            assertThrows(IllegalArgumentException.class, program::createProgramMemory);
        }
    }