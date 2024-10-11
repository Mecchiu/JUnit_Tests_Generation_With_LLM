// Test case 1: Test creating an XPathReader using a valid class name
@Test
void testCreateReaderWithValidClassName() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader("org.saxpath.helpers.TestXPathReader");
    assertNotNull(reader);
}

// Test case 2: Test creating an XPathReader using an invalid class name
@Test
void testCreateReaderWithInvalidClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("org.saxpath.helpers.InvalidXPathReader");
    });
}

// Test case 3: Test creating an XPathReader using a null class name
@Test
void testCreateReaderWithNullClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader(null);
    });
}

// Test case 4: Test creating an XPathReader using an empty class name
@Test
void testCreateReaderWithEmptyClassName() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("");
    });
}

// Test case 5: Test creating an XPathReader using a class name that does not implement XPathReader
@Test
void testCreateReaderWithNonXPathReaderClass() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("org.saxpath.helpers.NonXPathReader");
    });
}

// Test case 6: Test creating an XPathReader using a system property that specifies a valid class name
@Test
void testCreateReaderWithSystemProperty() throws SAXPathException {
    System.setProperty("org.saxpath.driver", "org.saxpath.helpers.TestXPathReader");
    XPathReader reader = XPathReaderFactory.createReader();
    assertNotNull(reader);
}

// Test case 7: Test creating an XPathReader using a system property that specifies an invalid class name
@Test
void testCreateReaderWithInvalidSystemProperty() {
    System.setProperty("org.saxpath.driver", "org.saxpath.helpers.InvalidXPathReader");
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}

// Test case 8: Test creating an XPathReader using a system property that does not specify a class name
@Test
void testCreateReaderWithEmptySystemProperty() {
    System.setProperty("org.saxpath.driver", "");
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}

// Test case 9: Test creating an XPathReader using a system property that specifies a class name that does not implement XPathReader
@Test
void testCreateReaderWithNonXPathReaderSystemProperty() {
    System.setProperty("org.saxpath.driver", "org.saxpath.helpers.NonXPathReader");
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}

// Test case 10: Test creating an XPathReader without specifying a class name or system property
@Test
void testCreateReaderWithoutSpecifyingClassOrSystemProperty() {
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader();
    });
}