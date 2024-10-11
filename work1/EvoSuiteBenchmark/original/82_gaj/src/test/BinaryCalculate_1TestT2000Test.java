```java
class BinaryCalculate_1Test {

    @Test
    void testSubBinary_case1() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("1010", "0011");
        assertEquals("0111", result);
    }

    @Test
    void testSubBinary_case2() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("1101", "0101");
        assertEquals("1000", result);
    }

    @Test
    void testSubBinary_case3() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("1111", "1111");
        assertEquals("0000", result);
    }

    @Test
    void testSubBinary_case4() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("10000", "00001");
        assertEquals("01111", result);
    }

    @Test
    void testSubBinary_case5() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("101010", "010101");
        assertEquals("010101", result);
    }

    @Test
    void testSubBinary_case6() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("111111", "000000");
        assertEquals("111111", result);
    }

    @Test
    void testSubBinary_case7() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("110110", "011011");
        assertEquals("011011", result);
    }

    @Test
    void testSubBinary_case8() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("1000000", "0000001");
        assertEquals("0111111", result);
    }

    @Test
    void testSubBinary_case9() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("1111111", "1111111");
        assertEquals("0000000", result);
    }

    @Test
    void testSubBinary_case10() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String result = binaryCalculate.subBinary("10101010", "01010101");
        assertEquals("01010101", result);
    }
}
```
```