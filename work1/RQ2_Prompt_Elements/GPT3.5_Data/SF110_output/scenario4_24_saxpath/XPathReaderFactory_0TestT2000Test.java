// Test case for createReader() using system property
class XPathReaderFactory_0Test {

    // Test case 1: Test createReader() with no system property set
    @Test
    void testCreateReaderNoPropertySet() {
        System.clearProperty(XPathReaderFactory.DRIVER_PROPERTY);
        assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
    }

    // Test case 2: Test createReader() with invalid class name in system property
    @Test
    void testCreateReaderInvalidClassName() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "invalid.class.name");
        assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
    }

    // Test case 3: Test createReader() with valid class name in system property
    @Test
    void testCreateReaderValidClassName() throws SAXPathException {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "com.example.XPathReaderImpl");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals("com.example.XPathReaderImpl", reader.getClass().getName());
    }

    // Test case 4: Test createReader() with default driver when system property is not set
    @Test
    void testCreateReaderDefaultDriverNoPropertySet() throws SAXPathException {
        System.clearProperty(XPathReaderFactory.DRIVER_PROPERTY);
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DEFAULT_DRIVER, reader.getClass().getName());
    }

    // Test case 5: Test createReader() with default driver when system property is set to empty string
    @Test
    void testCreateReaderDefaultDriverEmptyProperty() throws SAXPathException {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DEFAULT_DRIVER, reader.getClass().getName());
    }

    // Test case 6: Test createReader() with default driver when system property is set to whitespace
    @Test
    void testCreateReaderDefaultDriverWhitespaceProperty() throws SAXPathException {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "   ");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DEFAULT_DRIVER, reader.getClass().getName());
    }

    // Test case 7: Test createReader() with default driver when USE_DEFAULT is false
    @Test
    void testCreateReaderDefaultDriverUseDefaultFalse() throws SAXPathException {
        System.clearProperty(XPathReaderFactory.DRIVER_PROPERTY);
        XPathReaderFactory.USE_DEFAULT = false;
        assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader());
    }

    // Test case 8: Test createReader() with default driver when USE_DEFAULT is true
    @Test
    void testCreateReaderDefaultDriverUseDefaultTrue() throws SAXPathException {
        System.clearProperty(XPathReaderFactory.DRIVER_PROPERTY);
        XPathReaderFactory.USE_DEFAULT = true;
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DEFAULT_DRIVER, reader.getClass().getName());
    }

    // Test case 9: Test createReader() with invalid class name passed as argument
    @Test
    void testCreateReaderInvalidClassNameArgument() {
        assertThrows(SAXPathException.class, () -> XPathReaderFactory.createReader("invalid.class.name"));
    }

    // Test case 10: Test createReader() with valid class name passed as argument
    @Test
    void testCreateReaderValidClassNameArgument() throws SAXPathException {
        XPathReader reader = XPathReaderFactory.createReader("com.example.XPathReaderImpl");
        assertNotNull(reader);
        assertEquals("com.example.XPathReaderImpl", reader.getClass().getName());
    }
}