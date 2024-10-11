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

    /** Test if a correct xml file exists.
     * @throws IOException if something goes wrong.
     * @throws SAXException if something goes wrong.
     */
    @Test
    public void loadTest() throws IOException,SAXException {
        System.out.println("loadTest()");

        FileInputStream fis = null;
        try {
            InputStream xslis = getClass().getResourceAsStream("XmlIO.xsl");
            xslis = new BufferedInputStream(xslis);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setValidating(true);
            factory.setExpandEntityReferences(false);
            SAXParser parser = factory.newSAXParser();
             
            parser.parse(xslis, new XmlIO());
        }
        finally {
            if (null!= xslis) {
                xslis.close();
            }
        }
    }
}
