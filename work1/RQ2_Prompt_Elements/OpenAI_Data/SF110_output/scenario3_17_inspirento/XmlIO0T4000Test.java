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
	* It tests the case that the input stream is null and expects a NullPointerException.
	*/
	@Test
	public void testLoad_NullInputStream() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(null);
			fail("NullPointerException expected.");
		} catch (NullPointerException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is empty and expects a SAXException.
	*/
	@Test
	public void testLoad_EmptyInputStream() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return -1;
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return 'a';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream2() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream3() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream4() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream5() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream6() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream7() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream8() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream9() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
	
	/**
	* Test case for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	public void testLoad_NotEmptyInputStream10() {
		XmlIO xmlIO = new XmlIO();
		try {
			xmlIO.load(new InputStream() {
				@Override
				public int read() throws IOException {
					return '<';
				}
			});
			fail("SAXException expected.");
		} catch (SAXException e) {
			// As expected
		}
	}
}