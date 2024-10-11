// Test case for creating an XPathReader using a valid class name
@Test
void testCreateReaderWithValidClassName() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
    assertNotNull(reader);
}

// Test case for creating an XPathReader using an invalid class name
@Test
void testCreateReaderWithInvalidClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("org.saxpath.InvalidXPathReaderImpl");
    });
}

// Test case for creating an XPathReader using a class that does not implement XPathReader interface
@Test
void testCreateReaderWithNonXPathReaderClass() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("java.lang.String");
    });
}

// Test case for creating an XPathReader using a null class name
@Test
void testCreateReaderWithNullClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader(null);
    });
}

// Test case for creating an XPathReader using an empty class name
@Test
void testCreateReaderWithEmptyClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("");
    });
}

// Test case for creating an XPathReader using a whitespace class name
@Test
void testCreateReaderWithWhitespaceClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("   ");
    });
}

// Test case for creating an XPathReader using a class name with leading and trailing whitespaces
@Test
void testCreateReaderWithClassNameWithLeadingAndTrailingWhitespaces() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader("  org.saxpath.XPathReaderImpl  ");
    assertNotNull(reader);
}

// Test case for creating an XPathReader using a system property
@Test
void testCreateReaderWithSystemProperty() throws SAXPathException {
    System.setProperty("org.saxpath.driver", "org.saxpath.XPathReaderImpl");
    XPathReader reader = XPathReaderFactory.createReader();
    assertNotNull(reader);
    System.clearProperty("org.saxpath.driver");
}

// Test case for creating an XPathReader using a system property that points to an invalid class name
@Test
void testCreateReaderWithInvalidSystemProperty() {
    assertThrows(SAXPathException.class, () -> {
        System.setProperty("org.saxpath.driver", "org.saxpath.InvalidXPathReaderImpl");
        XPathReaderFactory.createReader();
        System.clearProperty("org.saxpath.driver");
    });
}

// Test case for creating an XPathReader using a system property that points to a class that does not implement XPathReader interface
@Test
void testCreateReaderWithNonXPathReaderSystemProperty() {
    assertThrows(SAXPathException.class, () -> {
        System.setProperty("org.saxpath.driver", "java.lang.String");
        XPathReaderFactory.createReader();
        System.clearProperty("org.saxpath.driver");
    });
}

// Test case for creating an XPathReader using a system property that is not set
@Test
void testCreateReaderWithUnsetSystemProperty() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}