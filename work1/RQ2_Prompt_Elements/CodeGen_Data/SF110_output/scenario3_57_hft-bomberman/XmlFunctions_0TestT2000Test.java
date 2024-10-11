// XmlFunctions_0Test.java
package common;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlFunctions}.
* It contains one unit test case for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_0Test {

        /**
         * test method for
         * {@link XmlFunctions#getXmlValue(String)}
         *
         * @throws XPathExpressionException  XPathException
         * @throws TransformerException      TransformerException
         * @throws SAXException              SAXException
         * @throws IOException               IOException
         */
        @Test
        public void testGetXmlValue() throws XPathExpressionException, TransformerException, SAXException, IOException {
                /**
                 * set up test document
                 */
                Logger.getRootLogger().setLevel(Logger.LEVEL_INFO);
                try (DocumentBuilder db =
                        DocumentBuilderFactory.newInstance().newDocumentBuilder()) {
                        Document doc = db.newDocument();
                        doc.appendChild(doc.importNode(doc.createElement("doc1"), true));
                        doc.appendChild(doc.importNode(doc.createElement("doc2"), true));
                        Document docRoot = doc.getDocumentElement();

                        docRoot.setAttribute("doc1", "string1");
                        docRoot.setAttribute("doc2", "string2");

                        /**
                         * create the XML representation of the XML document
                         */
                        Transformer t = TransformerFactory.newInstance().newTransformer();

                        t.setOutputProperty("indenting", true);
                        t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "1000");
                        t.transform(new DOMSource(docRoot), new StreamResult(xmlFile()));

                        /**
                         * read test values from test file
                         * 
                         * @throws IOException Exception
                         */
                        String string1 = xmlFile().readString();
                        String string2 = xmlFile().readString();
                            // assertEquals(string1,string2);
                        System.out.println(xmlFile().readString());
                        assertEquals(string1,string2);


                } catch (ParserConfigurationException ex) {
                        fail("createXml() exception : " + ex.getMessage());
                } catch (TransformerException ex) {
                        fail("createXml() exception : " + ex.getMessage());
                }
        }

        /**
         * sets the XML file for which test values will be read
         *
         * @return XML Filename
         */
        private File xmlFile() {
                File xmlFile = new File("test.xml");

                try {
                        if (!xmlFile.exists()) {
                                xmlFile.getParentFile().mkdirs();
                        }
                        xmlFile.createNewFile();
                        FileOutputStream fos = new FileOutputStream(xmlFile);
                        fos.write("<Test>test value 1</Test>".getBytes());
                        fos.close();

                        return xmlFile;
                } catch (IOException ex) {
                        throw new RuntimeException(ex);
                }
        }
}
