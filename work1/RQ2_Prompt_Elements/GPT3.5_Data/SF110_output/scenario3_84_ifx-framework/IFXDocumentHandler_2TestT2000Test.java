// IFXDocumentHandler_2Test.java
package org.sourceforge.ifx.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.jdom.Document;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IFXDocumentHandler}.
 * It contains ten unit test cases for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
 */
class IFXDocumentHandler_2Test {

    @Test
    void testReadValidXML() throws IFXException {
        String xml = "<root><child>test</child></root>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Document document = IFXDocumentHandler.read(inputStream, false, null);
        assertNotNull(document);
    }

    @Test
    void testReadInvalidXML() {
        String xml = "<root><child>test</child>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(inputStream, false, null));
    }

    @Test
    void testReadValidXMLWithValidation() throws IFXException {
        String xml = "<root><child>test</child></root>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schema", "schema.xsd");
        validationProperties.put("namespace", "http://example.com");
        Document document = IFXDocumentHandler.read(inputStream, true, validationProperties);
        assertNotNull(document);
    }

    @Test
    void testReadInvalidXMLWithValidation() {
        String xml = "<root><child>test</child>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schema", "schema.xsd");
        validationProperties.put("namespace", "http://example.com");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(inputStream, true, validationProperties));
    }

    @Test
    void testReadValidXMLWithInvalidValidationProperties() {
        String xml = "<root><child>test</child></root>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schema", "schema.xsd");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(inputStream, true, validationProperties));
    }

    @Test
    void testReadValidXMLWithNullValidationProperties() throws IFXException {
        String xml = "<root><child>test</child></root>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Document document = IFXDocumentHandler.read(inputStream, true, null);
        assertNotNull(document);
    }

    @Test
    void testReadValidXMLWithEmptyValidationProperties() throws IFXException {
        String xml = "<root><child>test</child></root>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        Document document = IFXDocumentHandler.read(inputStream, true, validationProperties);
        assertNotNull(document);
    }

    @Test
    void testReadValidXMLWithNamespace() throws IFXException {
        String xml = "<root xmlns=\"http://example.com\"><child>test</child></root>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Document document = IFXDocumentHandler.read(inputStream, false, null);
        assertNotNull(document);
    }

    @Test
    void testReadValidXMLWithNamespaceAndValidation() throws IFXException {
        String xml = "<root xmlns=\"http://example.com\"><child>test</child></root>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schema", "schema.xsd");
        validationProperties.put("namespace", "http://example.com");
        Document document = IFXDocumentHandler.read(inputStream, true, validationProperties);
        assertNotNull(document);
    }

    @Test
    void testReadInvalidXMLWithNamespaceAndValidation() {
        String xml = "<root xmlns=\"http://example.com\"><child>test</child>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schema", "schema.xsd");
        validationProperties.put("namespace", "http://example.com");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(inputStream, true, validationProperties));
    }

    @Test
    void testReadValidXMLWithNamespaceAndInvalidValidationProperties() {
        String xml = "<root xmlns=\"http://example.com\"><child>test</child></root>";
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes());
        Map<String, String> validationProperties = new HashMap<>();
        validationProperties.put("schema", "schema.xsd");
        assertThrows(IFXException.class, () -> IFXDocumentHandler.read(inputStream, true, validationProperties));
    }
}