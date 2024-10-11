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
private static final Logger LOG = Logger.getLogger("com.allenstudio.ir.util.XmlIO_1");
		
		/**
		* Constructor.
		*/
		public XmlIO_1Test() {
		}
	
		/**
		* Test loading with an input stream to test {@link XmlIO#load(URL)} behaviour.
		*/
        @Test
     void testLoadingWithURL() throws IOException {
     	   load( new URL( "Test" ) );
     }
   	   
        /**
		* Test loading a file.
		*/
        @Test
     void testLoading() throws IOException {
     	   load( new File("Test" ) );
     }
   	   
        /**
		* Test parsing XML with an input stream to test {@link XmlReader#read(InputStream)}.
		*/
        @Test
     void testReading() throws IOException {
         FileInputStream fis = new FileInputStream( "Test" );
         InputStreamReader isr = new InputStreamReader(fis);
         XMLReader xr = XMLReaderFactory.createXMLReader();
         StreamPusher s = new StreamPusher(sink(xr.getXMLReader())).execute();
         s.addPusher(isr);
         try {
     	    xr.parse(new InputSource( isr));
     	} catch (SAXException e) {
     	    System.out.println("SAXException");
     	    e.printStackTrace();
     	} catch (ParserConfigurationException pce) {
     	    Logger.getLogger(XmlIO_1Test.class.getName()).log(pce.getMessage());
     	} catch (IOException ioe) {
     	    Logger.getLogger(XmlIO_1Test.class.getName()).log(ioe.getMessage());
     	}
     }
   	   
		/**
		* Test parsing XML with a string.
		*/
        @Test
     void testXMLString() throws IOException {
         load( "Test" );
     }
   	   
        /**
		* Test parsing XML with a string.
		*/
        @Test
     void testXMLStringWithEncoding() throws IOException {
         load( "Test", "UTF-8" );
     }
   	   
        /**
		* Test parsing XML with input stream to test {@link XmlReader#readAll(InputStream)}.
		*/
        @Test
     void testReadingAll() throws IOException {
         FileInputStream fis = new FileInputStream( "Test" );
         InputStreamReader isr = new InputStreamReader(fis);
         XMLReader xr = XMLReaderFactory.createXMLReader();
         StreamPusher s = new StreamPusher(sink(xr.getXMLReader())).execute();
         s.addPusher(isr);
         try {
     	    xr.parse(new InputSource( isr));
     	} catch (SAXException e) {
     	    System.out.println("SAXException");
     	    e.printStackTrace();
     	} catch (ParserConfigurationException pce) {
     	    Logger.getLogger(XmlIO_1Test.class.getName()).log(pce.getMessage());
     	} catch (IOException ioe) {
     	    Logger.getLogger(XmlIO_1Test.class.getName()).log(ioe.getMessage());
     	}
     }
   	   
        /**
		* Test reading a XML tree.
		*/
        @Test
     void xmltree() throws IOException {
         load( "Test" );
     }
   	   
        /**
		* Test saving a XML tree.
		*/
        @Test
     void xmltreeSave() throws IOException {
         save( new XmlElement( "Test" ));
     }
   	   
        /**
		* Test reading a new XML tree.
		*/
        @Test
     void treeCreate() throws IOException {
         save( new XmlElement( "Test" ));
     }
}
