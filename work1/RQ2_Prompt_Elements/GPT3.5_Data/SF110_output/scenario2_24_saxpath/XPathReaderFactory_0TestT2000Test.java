// Test case 1: Test createReader() with a valid driver class name
@Test
void testCreateReaderWithValidDriverClassName() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader("org.saxpath.xpath.XPathReaderImpl");
    assertNotNull(reader);
}

// Test case 2: Test createReader() with an invalid driver class name
@Test
void testCreateReaderWithInvalidDriverClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("org.saxpath.xpath.InvalidXPathReaderImpl");
    });
}

// Test case 3: Test createReader() with a null driver class name
@Test
void testCreateReaderWithNullDriverClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader(null);
    });
}

// Test case 4: Test createReader() with an empty driver class name
@Test
void testCreateReaderWithEmptyDriverClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("");
    });
}

// Test case 5: Test createReader() with a valid system property
@Test
void testCreateReaderWithValidSystemProperty() throws SAXPathException {
    System.setProperty("org.saxpath.driver", "org.saxpath.xpath.XPathReaderImpl");
    XPathReader reader = XPathReaderFactory.createReader();
    assertNotNull(reader);
}

// Test case 6: Test createReader() with an invalid system property
@Test
void testCreateReaderWithInvalidSystemProperty() {
    System.setProperty("org.saxpath.driver", "org.saxpath.xpath.InvalidXPathReaderImpl");
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}

// Test case 7: Test createReader() with an unset system property and USE_DEFAULT set to true
@Test
void testCreateReaderWithUnsetSystemPropertyAndUseDefaultTrue() throws SAXPathException {
    System.clearProperty("org.saxpath.driver");
    XPathReaderFactory.USE_DEFAULT = true;
    XPathReader reader = XPathReaderFactory.createReader();
    assertNotNull(reader);
}

// Test case 8: Test createReader() with an unset system property and USE_DEFAULT set to false
@Test
void testCreateReaderWithUnsetSystemPropertyAndUseDefaultFalse() {
    System.clearProperty("org.saxpath.driver");
    XPathReaderFactory.USE_DEFAULT = false;
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}

// Test case 9: Test createReader() with a security exception when accessing system property
@Test
void testCreateReaderWithSecurityException() {
    System.setSecurityManager(new SecurityManager());
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
    System.setSecurityManager(null);
}

// Test case 10: Test createReader() with a driver class that does not implement XPathReader
@Test
void testCreateReaderWithDriverClassNotImplementingXPathReader() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("java.lang.String");
    });
}