```java
import static org.junit.jupiter.api.Assertions.*;

class Base64Coder_3Test {

    @Test
    void testDecodeString() {
        assertEquals("Hello, World!", Base64Coder.decodeString("SGVsbG8sIFdvcmxkIQ=="));
        assertEquals("Java is fun", Base64Coder.decodeString("SmF2YSBpcyBmdW4="));
        assertEquals("Testing 123", Base64Coder.decodeString("VGVzdGluZyAxMjM="));
        assertEquals("Base64Coder", Base64Coder.decodeString("QmFzZTY0Q29kZXI="));
        assertEquals("JUnit 5", Base64Coder.decodeString("SlVJbnQgNQ=="));
        assertEquals("Coding Assistant", Base64Coder.decodeString("Q29kaW5nIEFzc2lzdGFudA=="));
        assertEquals("Unit Testing", Base64Coder.decodeString("VW5pdCBUZXN0aW5n"));
        assertEquals("Java Virtual Machine", Base64Coder.decodeString("SmF2YSBWaXJ0dWFsIE1hY2hpbmU="));
        assertEquals("Open Source", Base64Coder.decodeString("T3BlbiBTb3VyY2U="));
        assertEquals("Happy Coding!", Base64Coder.decodeString("SGFwcHkgQ29kaW5nIQ=="));
    }
}
```
