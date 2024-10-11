package com.pmdesigns.jvc.tools;
java
class Base64Coder_0Test {

    @Test
    void testEncodeString() {
        assertEquals("SGVsbG8gV29ybGQ=", Base64Coder.encodeString("Hello World"));
        assertEquals("U29tZSBtZXNzYWdlIGJhc2U2NCBlbmNvZGluZw==", Base64Coder.encodeString("Some message base64 encoding"));
        assertEquals("VGhpcyBpcyBhIGJhc2U2NCBlbmNvZGluZw==", Base64Coder.encodeString("This is a base64 encoding"));
        assertEquals("QmFzZTY0IGVuY29kaW5nIGlzIGJpbmFyeQ==", Base64Coder.encodeString("Base64 encoding is binary"));
        assertEquals("U29tZSBtZXNzYWdlIGJhc2U2NCBlbmNvZGluZyBpcyBiaW5hcnk=", Base64Coder.encodeString("Some message base64 encoding is binary"));
        assertEquals("VGhpcyBpcyBhIGJhc2U2NCBlbmNvZGluZyBpcyBiaW5hcnk=", Base64Coder.encodeString("This is a base64 encoding is binary"));
        assertEquals("QmFzZTY0IGVuY29kaW5nIGlzIGJpbmFyeSBhbmQgaXMgYmluYXJ5", Base64Coder.encodeString("Base64 encoding is binary and is binary"));
        assertEquals("U29tZSBtZXNzYWdlIGJhc2U2NCBlbmNvZGluZyBpcyBiaW5hcnkgYW5kIGlzIGJpbmFyeQ==", Base64Coder.encodeString("Some message base64 encoding is binary and is binary"));
        assertEquals("VGhpcyBpcyBhIGJhc2U2NCBlbmNvZGluZyBpcyBiaW5hcnkgYW5kIGlzIGJpbmFyeQ==", Base64Coder.encodeString("This is a base64 encoding is binary and is binary"));
        assertEquals("QmFzZTY0IGVuY29kaW5nIGlzIGJpbmFyeSBhbmQgaXMgYmluYXJ5IGFuZCBpcyBiaW5hcnk=", Base64Coder.encodeString("Base64 encoding is binary and is binary and is binary"));
    }
}
