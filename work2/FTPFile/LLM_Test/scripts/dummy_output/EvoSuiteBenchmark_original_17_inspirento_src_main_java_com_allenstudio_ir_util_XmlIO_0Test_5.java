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
		private static final String URL_ENQUEUE = "/XMLIO_0Test.xsd";
        private XmlIO io;
		private final static Logger logger = Logger.getLogger("META I/O");
        
        /**
         * Initialize the XmlIO with the path to the XML file.
         *
         * @param path the absolute path to the XML file.
         * @throws XmlIOException if the file is not found.
         */
        XmlIO_0Test(String path) throws XmlIOException {
            io = new XmlIO(path);
        }

        /**
         * Test of {@link XmlIO#load(InputStream)} method, of class
         * {@link XmlIO}.
         */
        @Test
        public void testLoad_inputstream() throws XmlIOException {
            assertEquals(io.load("InputStream"), true);
	}

        /**
         * Test of {@link XmlIO#load(URL)} method, of class
         * {@link XmlIO}.
         *
         * @throws java.io.IOException if an I/O error occured.
         */
        @Test
        public void testLoad_url() throws IOException {
            assertEquals(io.load(URL_ENQUEUE), true);
        }

        /**
         * Test of {@link XmlIO#load(InputStream)} method, of class
         * {@link XmlIO}.
         *
         * @throws java.io.IOException if an I/O error occured.
         */
        @Test
        public void testLoad_outputstream() throws IOException {
paint:
            {
                try {
                    final Writer outw = new BufferedWriter(
                        new OutputStreamWriter(
                            new FileOutputStream(PathToFile), "UTF-8"));
                    final Writer errout = new CharArrayWriter();

                    final XmlParser p = new XmlParser(outw, errout);
                    final InputStream inp = Thread.currentThread().getContextClassLoader()
                       .getResourceAsStream(URL_ENQUEUE);

                    final Reader r = new BufferedReader(new InputStreamReader(
                        inp));

                    p.parse(null, r);

                    boolean result = false;

                    try {
                        result =
                            io.load(p, inp).isEmpty();
                        assertTrue("load failed", result);
                    }
                    finally {
                        try {
                            if (errout.toString().isEmpty()) {
                                p.parse(null, r);
                            }
                        } catch (SAXException se) {
                            logger.severe(se.getMessage());
                        } catch (IOException ioe) {
                            assertTrue(ioe.getMessage(), false);
                        }

                    }
                }
                catch(XMLParseException ex)
                {
                    logger.severe(ex);
                    throw new FileNotFoundException(ex.getMessage());
                }
            }
        }

		/**
		* @throws XmlIOException if an I/O error occured.
		*/
        @Test
        public void testLoad_error() throws XMLIOException {
            try
            {
                Thread.currentThread().getContextClassLoader()
               .getResourceAsStream(URL_ENQUEUE);
                assertEquals(io.load("InputStream"), false);
                assertEquals(xmlload("/XMLIO_0Test.xml"), false);
            }
            catch(XMLParseException ex)
            {
                throw new XMLIOException(ex.getMessage());
            }
        }

		/**
    * @throws XmlIOException if an unkown I/O error occured.
    */
        @Test
        public void testLoad_noIo() throws XMLIOException {
        try
        {
            Thread.currentThread().getContextClassLoader()
           .getResourceAsStream("/does/not/exist");
            assertEquals(io.load("InputStream"), false);
        }
        catch(XMLParseException ex)
        {
            throw new XMLIOException("I/O error");
        }
        assertEquals(io.load("InputStream"), false);
        if(xmlload("/does/not/exist").length()!=0) throw new XMLIOException("Not found");
        }

        /**
         * @throws XMLIOException if an unkown I/O error occured.
         */
        @Test
        public void testGetAll() throws XMLIOException {
            final Vector<String> result = new Vector<>(1);
            XmlIO.getAll(result);

            assertEquals(new Vector<String>(1), new Vector<String>(result));
        }

        private static String xmlload(String path) {
            try {
                Enumeration<URL> enumeration =
                    URL_ENQUEUE.
                    toExternalForm().
                    enumerate();
                while(enumeration.hasMoreElements()) {
                    URL url = enumeration.nextElement();
                    String path = url.getFile();
                    if(path.startsWith(path)) {
                        return path;
                    }
                }
            } catch (IOException ioe) {
                return ioe.getMessage();
            }
            return "";
        }
        
}