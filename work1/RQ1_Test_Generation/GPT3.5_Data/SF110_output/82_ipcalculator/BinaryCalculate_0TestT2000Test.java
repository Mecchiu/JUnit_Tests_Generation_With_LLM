```java
class BinaryCalculate_0Test {

    @Test
    void testAddBinary() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();

        // Test case 1
        String result1 = binaryCalculate.addBinary("1010", "1100");
        assertEquals("10110", result1);

        // Test case 2
        String result2 = binaryCalculate.addBinary("1111", "1");
        assertEquals("10000", result2);

        // Test case 3
        String result3 = binaryCalculate.addBinary("110", "101");
        assertEquals("1011", result3);

        // Test case 4
        String result4 = binaryCalculate.addBinary("111", "111");
        assertEquals("1110", result4);

        // Test case 5
        String result5 = binaryCalculate.addBinary("1001", "11");
        assertEquals("1100", result5);

        // Test case 6
        String result6 = binaryCalculate.addBinary("0", "1");
        assertEquals("1", result6);

        // Test case 7
        String result7 = binaryCalculate.addBinary("111", "0");
        assertEquals("111", result7);

        // Test case 8
        String result8 = binaryCalculate.addBinary("101010", "11011");
        assertEquals("1000101", result8);

        // Test case 9
        String result9 = binaryCalculate.addBinary("100000", "100000");
        assertEquals("1000000", result9);

        // Test case 10
        String result10 = binaryCalculate.addBinary("111111", "1");
        assertEquals("1000000", result10);
    }
}
```
```