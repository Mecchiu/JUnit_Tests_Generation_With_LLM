// Here's an example of how you could test the Program class:

@Test
void testCreateProgramMemory() {
    // Create a sample program code
    int[] programCode = {0x01, 0x02, 0x03, 0x04, 0x05};

    // Create a new Program object with the sample program code
    Program program = new Program(programCode);

    // Call the createProgramMemory method to create a MemoryArray object
    MemoryArray memoryArray = program.createProgramMemory();

    // Check that the MemoryArray object was created successfully
    assertNotNull(memoryArray);

    // Check that the MemoryArray object has the correct length
    assertEquals(programCode.length, memoryArray.getLength());

    // Check that the MemoryArray object contains the correct data
    for (int i = 0; i < programCode.length; i++) {
        assertEquals(programCode[i], memoryArray.read(i));
    }
}
}