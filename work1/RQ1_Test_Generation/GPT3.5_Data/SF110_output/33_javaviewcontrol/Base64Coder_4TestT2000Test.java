```java
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Base64Coder_4Test {

    @Test
    void testDecodeEmptyString() {
        String input = "";
        byte[] expected = new byte[0];
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeSingleCharacter() {
        String input = "Zg==";
        byte[] expected = {102};
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeMultipleCharacters() {
        String input = "SGVsbG8gV29ybGQ=";
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithPadding() {
        String input = "SGVsbG8gV29ybGQ=";
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithInvalidCharacter() {
        String input = "SGVsbG8gV29ybGQ=";
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input + "A"));
    }

    @Test
    void testDecodeWithInvalidPadding() {
        String input = "SGVsbG8gV29ybGQ";
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithInvalidLength() {
        String input = "SGVsbG8gV29ybGQ";
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input + "A"));
    }

    @Test
    void testDecodeWithSpecialCharacters() {
        String input = "U3VwZXIgQ2FzZQ==";
        byte[] expected = "Super Case".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithNumbers() {
        String input = "MTIzNDU2Nzg5MA==";
        byte[] expected = "1234567890".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }
}
```
