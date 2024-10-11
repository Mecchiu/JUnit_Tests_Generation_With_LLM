Here's an example of how you can write unit tests for the `Base64Coder` class:

```
@Test
void testDecodeString() {
    // Test case 1: empty string
    assertEquals("", Base64Coder.decodeString(""));

    // Test case 2: single character
    assertEquals("A", Base64Coder.decodeString("QQ=="));

    // Test case 3: multiple characters
    assertEquals("Hello, world!", Base64Coder.decodeString("SGVsbG8sIHdvcmxkIQ=="));

    // Test case 4: invalid base64 string
    assertThrows(IllegalArgumentException.class, () -> Base64Coder.decodeString("not a base64 string"));

    // Test case 5: padding character at the end
    assertEquals("test", Base64Coder.decodeString("dGVzdA=="));

    // Test case 6: padding characters at the end
    assertEquals("test", Base64Coder.decodeString("dGVzdA=="));

    // Test case 7: padding characters in the middle
    assertEquals("test", Base64Coder.decodeString("dGVzdA=="));

    // Test case 8: padding characters at the beginning
    assertEquals("test", Base64Coder.decodeString("dGVzdA=="));

    // Test case 9: special characters
    assertEquals("+/=", Base64Coder.decodeString("Ky8="));

    // Test case 10: long string
    String longString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.";
    String longStringBase64 = "TG9yZW0gaXBzdW0gZG9sb3Igc2l0IGFtZXQsIGNvbnNlY3RldHVyIGFkaXBpc2NpbmcgZWxpdC4gU2VkIG5vbiByaXN1cy4gU3VwcG9ydCBsaWN0dXMgdG9ydG9yLCBkaWduaXNzaW0gc2l0IGFtZXQsIGFwcGNlcHRpbmcgbmVjLCB1bHRyaWNpZXMgc2VkLCBkb2xvci4=";
    assertEquals(longString, Base64Coder.decodeString(longStringBase64));
}
```