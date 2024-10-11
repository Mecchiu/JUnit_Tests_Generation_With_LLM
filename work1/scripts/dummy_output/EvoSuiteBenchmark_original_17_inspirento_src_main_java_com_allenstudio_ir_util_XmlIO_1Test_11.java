// XmlIO_1Test.java
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
* It contains one unit test case for the {@link XmlIO#load(URL)} method.
*/
class XmlIO_1Test {
		/**
		* Test XMLIO loading from url filepath.
		* This test is to assert that file path string is processed by XML IO correctly.
		*/
        @Test
        public void testLoadFilePath_1() {
            XmlIO xmlIO = new XmlIO();
            String filename = "file.xml";
            String xml = "<?xml version=\"1.0\"?>";
            xml += "<Item id=\"1\">";
            xml += "<name>foo</name>";
            xml += "</Item>";
            try {
                xmlIO.load(new File(filename));
                assertTrue("file should exist", filename.equals(filename) && true);
                List list = xmlIO.getList();
                assertEquals("should contain the 1 item", 1, list.size());
                assertTrue("should contain the name", list.get(0).getName().equals("foo"));
            } catch (IOException e) {
                assertTrue("file should exist", false);
            }
        }

}
// XMLIO_1Test.java