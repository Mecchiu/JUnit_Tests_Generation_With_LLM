// Here's an example of how you could test the printInterfaces() method of ClassInfo using JUnit 5:

@Test
void testPrintInterfaces() {
    // Create a test class that implements two interfaces
    class TestClass implements Serializable, Cloneable {
        // Class body
    }
    
    // Create a ClassInfo object for the test class
    ClassInfo classInfo = new ClassInfo(TestClass.class);
    
    // Call the printInterfaces() method and capture the output
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    classInfo.printInterfaces();
    String output = outContent.toString().trim();
    
    // Verify that the output contains the expected interface names
    assertTrue(output.contains("java.io.Serializable"));
    assertTrue(output.contains("java.lang.Cloneable"));
}