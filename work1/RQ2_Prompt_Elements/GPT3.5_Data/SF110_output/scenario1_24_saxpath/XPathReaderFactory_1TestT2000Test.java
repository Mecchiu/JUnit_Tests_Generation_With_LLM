// Here's an example of a unit test case for the createReader method in XPathReaderFactory class

@Test
void testCreateReader() throws SAXPathException {
    // Test case 1: create reader from system property
    System.setProperty("org.saxpath.driver", "org.saxpath.XPathReaderImpl");
    XPathReader reader = XPathReaderFactory.createReader(null);
    assertNotNull(reader);
    assertEquals("org.saxpath.XPathReaderImpl", reader.getClass().getName());

    // Test case 2: create reader from class name
    reader = XPathReaderFactory.createReader("org.saxpath.XPathReaderImpl");
    assertNotNull(reader);
    assertEquals("org.saxpath.XPathReaderImpl", reader.getClass().getName());

    // Test case 3: create reader from invalid class name
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("org.saxpath.InvalidXPathReaderImpl");
    });

    // Test case 4: create reader from class that doesn't implement XPathReader interface
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("java.lang.String");
    });

    // Test case 5: create reader from null class name
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader(null);
    });

    // Test case 6: create reader from empty class name
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("");
    });

    // Test case 7: create reader from whitespace class name
    assertThrows(SAXPathException.class, () -> {
        XPathReaderFactory.createReader("   ");
    });

    // Test case 8: create reader from class in different package
    reader = XPathReaderFactory.createReader("com.example.XPathReaderImpl");
    assertNotNull(reader);
    assertEquals("com.example.XPathReaderImpl", reader.getClass().getName());

    // Test case 9: create reader from class in same package
    reader = XPathReaderFactory.createReader("org.saxpath.helpers.XPathReaderImpl");
    assertNotNull(reader);
    assertEquals("org.saxpath.helpers.XPathReaderImpl", reader.getClass().getName());

    // Test case 10: create reader from class in parent package
    reader = XPathReaderFactory.createReader("org.XPathReaderImpl");
    assertNotNull(reader);
    assertEquals("org.XPathReaderImpl", reader.getClass().getName());
}