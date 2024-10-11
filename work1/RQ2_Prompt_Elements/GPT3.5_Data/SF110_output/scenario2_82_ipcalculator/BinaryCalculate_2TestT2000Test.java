// Test case 1: Test with valid IP and IPPrefix values
@Test
void testIPCalculateValid() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Total Range: 192.168.0.0 - 192.168.3.255\n" +
                            "Usable Range: 192.168.0.1 - 192.168.3.254\n" +
                            "\n" +
                            "Total usable IP Addresses : 1,022\n" +
                            "Subnet: 192.168.0.0/22\n" +
                            "Binary Subnet: 11000000101010000000000000000000\n" +
                            "Broadcast Address: 192.168.3.255\n" +
                            "Prefix: 22\n" +
                            "Class: C\n" +
                            "Netmask: 255.255.252.0\n" +
                            "Binary Netmask: 11111111.11111111.11111100.00000000";
    String actualOutput = bc.IPCalculate("11000000101010000000000000000000", "22");
    assertEquals(expectedOutput, actualOutput);
}

// Test case 2: Test with invalid IP value
@Test
void testIPCalculateInvalidIP() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Invalid IP address";
    String actualOutput = bc.IPCalculate("1100000010101000000000000000000", "22");
    assertEquals(expectedOutput, actualOutput);
}

// Test case 3: Test with invalid IPPrefix value
@Test
void testIPCalculateInvalidIPPrefix() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Invalid IP prefix";
    String actualOutput = bc.IPCalculate("11000000101010000000000000000000", "33");
    assertEquals(expectedOutput, actualOutput);
}

// Test case 4: Test with IP value of length less than 32 bits
@Test
void testIPCalculateShortIP() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Invalid IP address";
    String actualOutput = bc.IPCalculate("110000001010100000000000000000", "22");
    assertEquals(expectedOutput, actualOutput);
}

// Test case 5: Test with IPPrefix value of length less than 1 bit
@Test
void testIPCalculateShortIPPrefix() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Invalid IP prefix";
    String actualOutput = bc.IPCalculate("11000000101010000000000000000000", "");
    assertEquals(expectedOutput, actualOutput);
}

// Test case 6: Test with IP value containing non-binary characters
@Test
void testIPCalculateNonBinaryIP() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Invalid IP address";
    String actualOutput = bc.IPCalculate("1100000010101000000000000000g000", "22");
    assertEquals(expectedOutput, actualOutput);
}

// Test case 7: Test with IPPrefix value containing non-binary characters
@Test
void testIPCalculateNonBinaryIPPrefix() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Invalid IP prefix";
    String actualOutput = bc.IPCalculate("11000000101010000000000000000000", "2g");
    assertEquals(expectedOutput, actualOutput);
}

// Test case 8: Test with IP value containing spaces
@Test
void testIPCalculateIPWithSpaces() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Invalid IP address";
    String actualOutput = bc.IPCalculate("1100000010101000000000000 0000000", "22");
    assertEquals(expectedOutput, actualOutput);
}

// Test case 9: Test with IPPrefix value containing spaces
@Test
void testIPCalculateIPPrefixWithSpaces() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Invalid IP prefix";
    String actualOutput = bc.IPCalculate("11000000101010000000000000000000", " 22");
    assertEquals(expectedOutput, actualOutput);
}

// Test case 10: Test with IP value and IPPrefix value both empty
@Test
void testIPCalculateEmptyValues() {
    BinaryCalculate bc = new BinaryCalculate();
    String expectedOutput = "Invalid IP address";
    String actualOutput = bc.IPCalculate("", "");
    assertEquals(expectedOutput, actualOutput);
}