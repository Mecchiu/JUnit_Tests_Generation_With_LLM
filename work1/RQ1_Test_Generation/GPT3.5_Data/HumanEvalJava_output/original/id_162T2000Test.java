```java
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToMd5Test {

    @Test
    void testStringToMd5NotEmpty() {
        String input = "Hello world";
        String expected = "3e25960a79dbc69b674cd4ec67a72c62";
        assertEquals(expected, StringToMd5.stringToMd5(input));
    }

    @Test
    void testStringToMd5Empty() {
        String input = "";
        assertEquals(null, StringToMd5.stringToMd5(input));
    }

    @Test
    void testStringToMd5ABC() {
        String input = "A B C";
        String expected = "0ef78513b0cb8cef12743f5aeb35f888";
        assertEquals(expected, StringToMd5.stringToMd5(input));
    }

    @Test
    void testStringToMd5Password() {
        String input = "password";
        String expected = "5f4dcc3b5aa765d61d8327deb882cf99";
        assertEquals(expected, StringToMd5.stringToMd5(input));
    }

    // Add more test cases as needed
}
```
```