package net.virtualinfinity.atrobots.computer;
java
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void testCreateProgramMemory_emptyProgram() {
        Program program = new Program(new short[0]);
        MemoryArray memoryArray = program.createProgramMemory();
        assertEquals(0, memoryArray.size());
    }

    @Test
    void testCreateProgramMemory_singleInstruction() {
        short[] programCode = {1234};
        Program program = new Program(programCode);
        MemoryArray memoryArray = program.createProgramMemory();
        assertEquals(1, memoryArray.size());
        assertEquals(1234, memoryArray.read(0));
    }

    @Test
    void testCreateProgramMemory_multipleInstructions() {
        short[] programCode = {100, 200, 300};
        Program program = new Program(programCode);
        MemoryArray memoryArray = program.createProgramMemory();
        assertEquals(3, memoryArray.size());
        assertArrayEquals(programCode, memoryArray.toArray());
    }

    // Add more test cases as needed
}
