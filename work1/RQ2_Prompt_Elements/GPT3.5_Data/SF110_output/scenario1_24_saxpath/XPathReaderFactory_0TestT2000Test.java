// Test case for when system property is set
@Test
void testCreateReaderWithSystemProperty() throws SAXPathException {
    System.setProperty("org.saxpath.driver", "org.saxpath.helpers.MockXPathReader");
    XPathReader reader = XPathReaderFactory.createReader();
    assertTrue(reader instanceof MockXPathReader);
}

// Test case for when system property is not set and default driver is used
@Test
void testCreateReaderWithDefaultDriver() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader();
    assertTrue(reader instanceof DefaultXPathReader);
}

// Test case for when system property is not set and default driver is not used
@Test
void testCreateReaderWithoutDefaultDriver() throws SAXPathException {
    XPathReaderFactory.USE_DEFAULT = false;
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case for when system property is not set and security exception is thrown
@Test
void testCreateReaderWithSecurityException() {
    SecurityManager originalSecurityManager = System.getSecurityManager();
    try {
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPropertyAccess(String key) {
                if (key.equals("org.saxpath.driver")) {
                    throw new SecurityException("Reading of property disallowed.");
                }
            }
        });
        assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
    } finally {
        System.setSecurityManager(originalSecurityManager);
    }
}

// Test case for when system property is set to an invalid class name
@Test
void testCreateReaderWithInvalidClassName() {
    System.setProperty("org.saxpath.driver", "invalid.class.name");
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case for when system property is set to a class that does not implement XPathReader
@Test
void testCreateReaderWithNonXPathReaderClass() {
    System.setProperty("org.saxpath.driver", "java.lang.String");
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case for when class name is passed in directly
@Test
void testCreateReaderWithClassName() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader("org.saxpath.helpers.MockXPathReader");
    assertTrue(reader instanceof MockXPathReader);
}

// Test case for when class name is invalid
@Test
void testCreateReaderWithInvalidClassNamePassedIn() {
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader("invalid.class.name"));
}

// Test case for when class name does not implement XPathReader
@Test
void testCreateReaderWithNonXPathReaderClassPassedIn() {
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader("java.lang.String"));
}

// Test case for when class name is null
@Test
void testCreateReaderWithNullClassName() {
    assertThrows(IllegalArgumentException.class, () -> XPathReaderFactory.createReader(null));
}
}