// IFXDocumentHandler_2Test.java
package org.sourceforge.ifx.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.jdom.Document;
import org.junit.jupiter.api.Test;
import org.sourceforge.ifx.basetypes.IFXObject;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IFXDocumentHandler}.
 * It contains ten unit test cases for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
 */
class IFXDocumentHandler_2Test {

    /**
     * Test case for reading a valid IFX document.
     */
    @Test
    void testReadValidIFXDocument() throws IFXException {
        String xml = "<IFX><SignonRq><RqUID>1234567890</RqUID></SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schemaLocation", "http://www.example.com/schema/IFX.xsd");
        Document doc = IFXDocumentHandler.read(is, true, validationProperties);
        assertNotNull(doc);
    }

    /**
     * Test case for reading an invalid IFX document.
     */
    @Test
    void testReadInvalidIFXDocument() {
        String xml = "<IFX><SignonRq><RqUID>1234567890</RqUID></SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schemaLocation", "http://www.example.com/schema/IFX.xsd");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, true, validationProperties));
    }

    /**
     * Test case for reading an IFX document with no validation.
     */
    @Test
    void testReadIFXDocumentNoValidation() throws IFXException {
        String xml = "<IFX><SignonRq><RqUID>1234567890</RqUID></SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Document doc = IFXDocumentHandler.read(is, false, null);
        assertNotNull(doc);
    }

    /**
     * Test case for reading an IFX document with no validation and no namespaces.
     */
    @Test
    void testReadIFXDocumentNoValidationNoNamespaces() throws IFXException {
        String xml = "<IFX><SignonRq><RqUID>1234567890</RqUID></SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Document doc = IFXDocumentHandler.read(is, false, new HashMap<>());
        assertNotNull(doc);
    }

    /**
     * Test case for reading an IFX document with validation and no namespaces.
     */
    @Test
    void testReadIFXDocumentValidationNoNamespaces() throws IFXException {
        String xml = "<IFX><SignonRq><RqUID>1234567890</RqUID></SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schemaLocation", "http://www.example.com/schema/IFX.xsd");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, true, validationProperties));
    }

    /**
     * Test case for reading an IFX document with validation and invalid schema location.
     */
    @Test
    void testReadIFXDocumentValidationInvalidSchemaLocation() {
        String xml = "<IFX><SignonRq><RqUID>1234567890</RqUID></SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schemaLocation", "http://www.example.com/schema/invalid.xsd");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, true, validationProperties));
    }

    /**
     * Test case for reading an IFX document with validation and invalid namespace.
     */
    @Test
    void testReadIFXDocumentValidationInvalidNamespace() {
        String xml = "<IFX><SignonRq><RqUID>1234567890</RqUID></SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schemaLocation", "http://www.example.com/schema/IFX.xsd");
        validationProperties.put("namespace", "http://www.example.com/schema/invalid");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, true, validationProperties));
    }

    /**
     * Test case for reading an IFX document with validation and valid namespace.
     */
    @Test
    void testReadIFXDocumentValidationValidNamespace() throws IFXException {
        String xml = "<IFX xmlns=\"http://www.example.com/schema/IFX\"><SignonRq><RqUID>1234567890</RqUID></SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schemaLocation", "http://www.example.com/schema/IFX.xsd");
        validationProperties.put("namespace", "http://www.example.com/schema/IFX");
        Document doc = IFXDocumentHandler.read(is, true, validationProperties);
        assertNotNull(doc);
    }

    /**
     * Test case for reading an IFX document with validation and multiple namespaces.
     */
    @Test
    void testReadIFXDocumentValidationMultipleNamespaces() throws IFXException {
        String xml = "<IFX xmlns:ifx=\"http://www.example.com/schema/IFX\" xmlns:ext=\"http://www.example.com/schema/ext\"><ifx:SignonRq><ifx:RqUID>1234567890</ifx:RqUID></ifx:SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schemaLocation", "http://www.example.com/schema/IFX.xsd");
        validationProperties.put("namespace", "http://www.example.com/schema/IFX");
        Document doc = IFXDocumentHandler.read(is, true, validationProperties);
        assertNotNull(doc);
    }

    /**
     * Test case for reading an IFX document with validation and invalid multiple namespaces.
     */
    @Test
    void testReadIFXDocumentValidationInvalidMultipleNamespaces() {
        String xml = "<IFX xmlns:ifx=\"http://www.example.com/schema/IFX\" xmlns:ext=\"http://www.example.com/schema/ext\"><ifx:SignonRq><ifx:RqUID>1234567890</ifx:RqUID></ifx:SignonRq></IFX>";
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schemaLocation", "http://www.example.com/schema/IFX.xsd");
        validationProperties.put("namespace", "http://www.example.com/schema/invalid");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(is, true, validationProperties));
    }
}