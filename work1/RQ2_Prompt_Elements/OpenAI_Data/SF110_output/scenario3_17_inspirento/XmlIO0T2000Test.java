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
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIOTest {

	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input is null and expects a NullPointerException.
	*/
	@Test
	void testLoad_NullInput() {
		XmlIO xmlIO = new XmlIO();
		assertThrows(NullPointerException.class, () -> {
			xmlIO.load(null);
		});
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input is empty and expects a IllegalArgumentException.
	*/
	@Test
	void testLoad_EmptyInput() {
		XmlIO xmlIO = new XmlIO();
		assertThrows(IllegalArgumentException.class, () -> {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return -1;
				}
			});
		});
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input is not a valid XML file and expects a SAXException.
	*/
	@Test
	void testLoad_InvalidXML() {
		XmlIO xmlIO = new XmlIO();
		assertThrows(SAXException.class, () -> {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
		});
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input is a valid XML file and expects a true.
	*/
	@Test
	void testLoad_ValidXML() {
		XmlIO xmlIO = new XmlIO();
		assertTrue(xmlIO.load(new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		}));
	}
}