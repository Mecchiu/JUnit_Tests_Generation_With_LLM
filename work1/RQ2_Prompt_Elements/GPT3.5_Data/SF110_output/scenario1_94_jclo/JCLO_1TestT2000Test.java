// Here's an example of how you can test the JCLO class's usage() method using JUnit 5:

@Test
void testUsage() {
    JCLO jclo = new JCLO();
    String expected = "--debug[boolean]\n--file[string]\n--help[boolean]\n--output[string]\n--verbose[int]\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
} 

// You can add more test cases to cover different scenarios and edge cases.