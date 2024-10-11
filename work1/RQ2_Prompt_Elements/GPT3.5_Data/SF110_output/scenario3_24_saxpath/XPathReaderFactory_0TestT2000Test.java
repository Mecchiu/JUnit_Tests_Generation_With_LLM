// Test case 1: Test if createReader() returns an instance of XPathReader
@Test
public void testCreateReaderReturnsXPathReader() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader();
    assertTrue(reader instanceof XPathReader);
}

// Test case 2: Test if createReader() returns a non-null instance
@Test
public void testCreateReaderReturnsNonNull() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader();
    assertNotNull(reader);
}

// Test case 3: Test if createReader() throws SAXPathException when org.saxpath.driver system property is not set
@Test
public void testCreateReaderThrowsExceptionWhenSystemPropertyNotSet() {
    System.clearProperty("org.saxpath.driver");
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case 4: Test if createReader() throws SAXPathException when org.saxpath.driver system property is set to an invalid class name
@Test
public void testCreateReaderThrowsExceptionWhenSystemPropertySetToInvalidClassName() {
    System.setProperty("org.saxpath.driver", "invalid.class.name");
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case 5: Test if createReader() throws SAXPathException when org.saxpath.driver system property is set to a class that does not implement XPathReader interface
@Test
public void testCreateReaderThrowsExceptionWhenSystemPropertySetToClassNotImplementingXPathReader() {
    System.setProperty("org.saxpath.driver", "java.lang.String");
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
}

// Test case 6: Test if createReader() returns an instance of a custom XPathReader implementation when org.saxpath.driver system property is set to a valid class name
@Test
public void testCreateReaderReturnsCustomXPathReader() throws SAXPathException {
    System.setProperty("org.saxpath.driver", "com.example.CustomXPathReader");
    XPathReader reader = XPathReaderFactory.createReader();
    assertTrue(reader instanceof com.example.CustomXPathReader);
}

// Test case 7: Test if createReader() returns an instance of the default XPathReader implementation when org.saxpath.driver system property is set to "default"
@Test
public void testCreateReaderReturnsDefaultXPathReader() throws SAXPathException {
    System.setProperty("org.saxpath.driver", "default");
    XPathReader reader = XPathReaderFactory.createReader();
    assertTrue(reader instanceof org.saxpath.helpers.DefaultXPathReader);
}

// Test case 8: Test if createReader() returns an instance of a named XPathReader implementation when passed a valid class name
@Test
public void testCreateReaderReturnsNamedXPathReader() throws SAXPathException {
    XPathReader reader = XPathReaderFactory.createReader("com.example.CustomXPathReader");
    assertTrue(reader instanceof com.example.CustomXPathReader);
}

// Test case 9: Test if createReader() throws SAXPathException when passed an invalid class name
@Test
public void testCreateReaderThrowsExceptionWhenPassedInvalidClassName() {
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader("invalid.class.name"));
}

// Test case 10: Test if createReader() throws SAXPathException when passed a class name that does not implement XPathReader interface
@Test
public void testCreateReaderThrowsExceptionWhenPassedClassNotImplementingXPathReader() {
    assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader("java.lang.String"));
}