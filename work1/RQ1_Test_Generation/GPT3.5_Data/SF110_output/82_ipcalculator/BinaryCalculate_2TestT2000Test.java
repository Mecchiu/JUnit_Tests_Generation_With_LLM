```java
class BinaryCalculate_2Test {

    @Test
    void testIPCalculate() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        
        // Test case 1
        String result1 = binaryCalculate.IPCalculate("11000000101010000000000100000000", "11111111111111111111111100000000");
        assertEquals("Total Range: 192.168.1.0 -- 192.168.1.255\n" +
                "Usable Range: 192.168.1.1 -- 192.168.1.254\n" +
                "\n" +
                "Total usable IP Addresses : 254\n" +
                "Subnet: 192.168.1.0\n" +
                "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
                "Broadcast Address: 192.168.1.255\n" +
                "Prefix: /24\n" +
                "Netmask: 255.255.255.0\n" +
                "Binary Netmask: 11111111.11111111.11111111.00000000", result1);

        // Test case 2
        String result2 = binaryCalculate.IPCalculate("11000000101010000000000100000000", "11111111111111111111111111111111");
        assertEquals("Total Range: 192.168.1.0 -- 192.168.1.255\n" +
                "Usable Range: 192.168.1.0 -- 192.168.1.255\n" +
                "\n" +
                "Total usable IP Addresses : 256\n" +
                "Subnet: 192.168.1.0\n" +
                "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
                "Broadcast Address: 192.168.1.255\n" +
                "Prefix: /24\n" +
                "Netmask: 255.255.255.0\n" +
                "Binary Netmask: 11111111.11111111.11111111.00000000", result2);

        // Add more test cases here
    }
}
```
```