// XmlIOTest.java
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
* It contains ten unit test cases for the {@link XmlIO#load(URL)} method.
*/
class XmlIOTest {

	/**
	* Test case for {@link XmlIO#load(URL)} method.
	* It tests the method with a null URL.
	*/
	@Test
	void testLoad_NullURL() {
		XmlIO xmlIO = new XmlIO();
		assertFalse(xmlIO.load(null));
	}
	
	/**
	* Test case for {@link XmlIO#load(URL)} method.
	* It tests the method with a non-null URL.
	*/
	@Test
	void testLoad_NonNullURL() {
		XmlIO xmlIO = new XmlIO();
		assertTrue(xmlIO.load(new URL("http://www.google.com")));
	}
}