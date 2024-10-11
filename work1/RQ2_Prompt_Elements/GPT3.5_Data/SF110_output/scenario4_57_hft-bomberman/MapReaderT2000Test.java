// Here is an example of how you can test the MapReader class using JUnit 5:

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapReaderTest {

    @Test
    void testGetXMLValue() throws Exception {
        // Create a sample XML file
        File xmlFile = File.createTempFile("test", ".xml");
        xmlFile.deleteOnExit();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        Element rootElement = doc.createElement("root");
        doc.appendChild(rootElement);
        Element childElement = doc.createElement("child");
        childElement.setTextContent("value");
        rootElement.appendChild(childElement);
        NodeList nodeList = doc.getElementsByTagName("child");

        // Test the getXMLValue method
        MapReader mapReader = new MapReader(xmlFile.getAbsolutePath());
        String value = mapReader.getXMLValue(nodeList.item(0), "text()");
        assertEquals("value", value);
    }
}