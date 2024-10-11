// XmlIO_0Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains one unit test case for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_0Test {
		
    @Test
    public void testLoadSuccess() {
		List s = new Vector();
        Enumeration enumeration = null;
		try {
			enumeration = load("org/hibernate/util/sortedSet.xml");
            s.addAll((List) enumeration.nextElement());
		} catch (Exception e) {
			JOptionPane.showMessageDialog
                      (
			      null,
			      "Error while reading data." +
			      "\nReason: " +
			      e.getMessage(),
			      "Error",
			      JOptionPane.ERROR_MESSAGE
                      );	
		}		
        assertEquals("s",s,s);
    }


	@SuppressWarnings("resource")
	public static void load(String filePath) {
		System.setProperty("generate",
			"org.hibernate.generator.j.xml.jaxp.FileSystemGenerator");

		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		try {
            SAXParser saxParser = saxParserFactory.newSAXParser();

            InputStream input = new FileInputStream(filePath);

            // Get an InputStreamReader from the InputStream
            try {
                Reader reader = new
                    InputStreamReader(input, "ISO-8859-1");
                // Create a SAX parser and add it to its own root
                XMLReader xmlReader = saxParser.getXMLReader();
                xmlReader.setContentHandler(new DefaultHandler());

                // Parse the XML
                saxParser.parse(new
                        InputSource(reader), xmlReader);
            } finally {
                // Close the reader and the InputStream in the finally block
                try {
                    reader.close();
                    input.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            };
		} catch (IOException e) {
			JOptionPane.showMessageDialog
                      (
			      null,
			      "Error while reading data." +
			      "\nReason: " +
			      e.getMessage(),
			      "Error",
			      JOptionPane.ERROR_MESSAGE
                      );	
		} catch (SAXException sa) {
			JOptionPane.showMessageDialog
                      (
			      null,
			      "Error while reading data.",
			      "Error",
			      JOptionPane.ERROR_MESSAGE
                      );	
		} catch (Exception e) {
			JOptionPane.showMessageDialog
                      (
			      null,
			      "Failed to load data.",
			      "Error",
			      JOptionPane.ERROR_MESSAGE
                      );	
		}
	}

	/**
	 * The XML Parser.
	*/
    private static class LoadHandler extends DefaultHandler {
        @Override
        public void startElement(
                String uri,
                String localName,
                String qName,
                Attributes atts) throws SAXException {
//            String att=atts.getValue();
        }
        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
        }
        @Override
        public void startPrefixMapping(String prefix, String uri) throws SAXException {
        }
        @Override
        public void endPrefixMapping(String prefix) throws SAXException {        }
        @Override
        public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        }
        @Override
        public void processingInstruction(String piTarget, String piArgs) throws SAXException {
        }
        @Override
        public void setDocumentLocator(org.jdom.DocumentLocator arg0) {
        }
        @Override
        public void startDocument() throws SAXException {
        }
        @Override
        public void endDocument() throws SAXException {
        }
        @Override
        public void startPrefixMapping(String prefix, String uri, String s) throws SAXException {
        }
        @Override
        public void endPrefixMapping(String prefix) throws SAXException {
        }
        @Override
        public void startDocument("") throws SAXException {
        }
        @Override
        public void endDocument() throws SAXException {
        }
        @Override
        public void startElement(String uri, String localName, String qName, short code) throws SAXException {
        }
        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
        }
        @Override
        public void emptyElement(String text) throws SAXException {
        }
        @Override
        public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        }
    }
	
    private static final Logger LOG = Logger.getLogger(XmlIO.class.getName());

    private static void log(String msg) {
        LOG.info(msg);
    }
}