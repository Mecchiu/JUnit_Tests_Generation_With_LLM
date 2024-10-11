```java
class Base64Coder_2Test {

    @Test
    void testEncodeWithEmptyArray() {
        byte[] input = new byte[0];
        char[] expected = new char[0];
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }

    @Test
    void testEncodeWithSingleByte() {
        byte[] input = {65}; // 'A'
        char[] expected = {'Q', 'Q', '=', '='};
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }

    @Test
    void testEncodeWithTwoBytes() {
        byte[] input = {65, 66}; // 'AB'
        char[] expected = {'Q', 'U', 'I', '='};
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }

    @Test
    void testEncodeWithThreeBytes() {
        byte[] input = {65, 66, 67}; // 'ABC'
        char[] expected = {'Q', 'U', 'J', 'A'};
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }

    @Test
    void testEncodeWithFourBytes() {
        byte[] input = {65, 66, 67, 68}; // 'ABCD'
        char[] expected = {'Q', 'U', 'J', 'B', 'A', '='};
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }

    @Test
    void testEncodeWithFiveBytes() {
        byte[] input = {65, 66, 67, 68, 69}; // 'ABCDE'
        char[] expected = {'Q', 'U', 'J', 'B', 'E', 'A', '='};
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }

    @Test
    void testEncodeWithSixBytes() {
        byte[] input = {65, 66, 67, 68, 69, 70}; // 'ABCDEF'
        char[] expected = {'Q', 'U', 'J', 'B', 'E', 'K'};
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }

    @Test
    void testEncodeWithSevenBytes() {
        byte[] input = {65, 66, 67, 68, 69, 70, 71}; // 'ABCDEFG'
        char[] expected = {'Q', 'U', 'J', 'B', 'E', 'K', 'F', 'w'};
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }

    @Test
    void testEncodeWithEightBytes() {
        byte[] input = {65, 66, 67, 68, 69, 70, 71, 72}; // 'ABCDEFGH'
        char[] expected = {'Q', 'U', 'J', 'B', 'E', 'K', 'F', 'I', 'A', '='};
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }

    @Test
    void testEncodeWithNineBytes() {
        byte[] input = {65, 66, 67, 68, 69, 70, 71, 72, 73}; // 'ABCDEFGHI'
        char[] expected = {'Q', 'U', 'J', 'B', 'E', 'K', 'F', 'I', 'G', 'A', '='};
        assertArrayEquals(expected, Base64Coder.encode(input, input.length));
    }
}
```
```