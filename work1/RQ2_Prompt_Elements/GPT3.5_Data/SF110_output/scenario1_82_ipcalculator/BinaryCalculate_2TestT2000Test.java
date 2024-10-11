// Here's an example of how you can write unit tests for the BinaryCalculate class:

@Test
void testIPCalculate() {
    BinaryCalculate bc = new BinaryCalculate();
    String IP = "192.168.1.1";
    String IPPrefix = "24";
    String expectedOutput = "Total Range: 192.168.1.0 - 192.168.1.255\n" +
                            "Usable Range: 192.168.1.1 - 192.168.1.254\n" +
                            "\n" +
                            "Total usable IP Addresses : 254\n" +
                            "Subnet: 192.168.1.0\n" +
                            "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
                            "Broadcast Address: 192.168.1.255\n" +
                            "Prefix: 24\n" +
                            "Netmask: 255.255.255.0\n" +
                            "Binary Netmask: 11111111.11111111.11111111.00000000";
    String actualOutput = bc.IPCalculate(IP, IPPrefix);
    assertEquals(expectedOutput, actualOutput);
}

@Test
void testIPCalculateInvalidIP() {
    BinaryCalculate bc = new BinaryCalculate();
    String IP = "192.168.1.256"; // invalid IP address
    String IPPrefix = "24";
    assertThrows(IllegalArgumentException.class, () -> {
        bc.IPCalculate(IP, IPPrefix);
    });
}

@Test
void testIPCalculateInvalidPrefix() {
    BinaryCalculate bc = new BinaryCalculate();
    String IP = "192.168.1.1";
    String IPPrefix = "33"; // invalid prefix
    assertThrows(IllegalArgumentException.class, () -> {
        bc.IPCalculate(IP, IPPrefix);
    });
}

// Add more test cases as needed.