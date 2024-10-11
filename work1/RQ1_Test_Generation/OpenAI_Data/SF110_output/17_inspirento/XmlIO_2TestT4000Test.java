// XmlIO_2Test.java
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
class XmlIO_2Test {

		/**
		* Test case 1 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is null.
		*/
		@Test
		void testLoad_1() {
				XmlIO fixture = new XmlIO();
				URL inputURL = null;
				boolean result = fixture.load(inputURL);
				assertFalse(result);
		}
		
		/**
		* Test case 2 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_2() {
				XmlIO fixture = new XmlIO();
				URL inputURL = new URL("http://www.google.com");
				boolean result = fixture.load(inputURL);
				assertTrue(result);
		}
		
		/**
		* Test case 3 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_3() {
				XmlIO fixture = new XmlIO();
				URL inputURL = new URL("http://www.google.com");
				boolean result = fixture.load(inputURL);
				assertTrue(result);
		}
		
		/**
		* Test case 4 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_4() {
				XmlIO fixture = new XmlIO();
				URL inputURL = new URL("http://www.google.com");
				boolean result = fixture.load(inputURL);
				assertTrue(result);
		}
		
		/**
		* Test case 5 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_5() {
				XmlIO fixture = new XmlIO();
				URL inputURL = new URL("http://www.google.com");
				boolean result = fixture.load(inputURL);
				assertTrue(result);
		}
		
		/**
		* Test case 6 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_6() {
				XmlIO fixture = new XmlIO();
				URL inputURL = new URL("http://www.google.com");
				boolean result = fixture.load(inputURL);
				assertTrue(result);
		}
		
		/**
		* Test case 7 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_7() {
				XmlIO fixture = new XmlIO();
				URL inputURL = new URL("http://www.google.com");
				boolean result = fixture.load(inputURL);
				assertTrue(result);
		}
		
		/**
		* Test case 8 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_8() {
				XmlIO fixture = new XmlIO();
				URL inputURL = new URL("http://www.google.com");
				boolean result = fixture.load(inputURL);
				assertTrue(result);
		}
		
		/**
		* Test case 9 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_9() {
				XmlIO fixture = new XmlIO();
				URL inputURL = new URL("http://www.google.com");
				boolean result = fixture.load(inputURL);
				assertTrue(result);
		}
		
		/**
		* Test case 10 for {@link XmlIO#load(URL)}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_10() {
				XmlIO fixture = new XmlIO();
				URL inputURL = new URL("http://www.google.com");
				boolean result = fixture.load(inputURL);
				assertTrue(result);
		}
}
//End class XmlIO_2Test

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
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_1Test {
		
		/**
		* Test case 1 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is null.
		*/
		@Test
		void testLoad_1() {
				XmlIO fixture = new XmlIO();
				InputStream input = null;
				boolean result = fixture.load(input);
				assertFalse(result);
		}
		
		/**
		* Test case 2 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is not null.
		*/
		@Test
		void testLoad_2() {
				XmlIO fixture = new XmlIO();
				InputStream input = new InputStream();
				boolean result = fixture.load(input);
				assertTrue(result);
		}
		
		/**
		* Test case 3 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is not null.
		*/
		@Test
		void testLoad_3() {
				XmlIO fixture = new XmlIO();
				InputStream input = new InputStream();
				boolean result = fixture.load(input);
				assertTrue(result);
		}
		
		/**
		* Test case 4 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is not null.
		*/
		@Test
		void testLoad_4() {
				XmlIO fixture = new XmlIO();
				InputStream input = new InputStream();
				boolean result = fixture.load(input);
				assertTrue(result);
		}
		
		/**
		* Test case 5 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is not null.
		*/
		@Test
		void testLoad_5() {
				XmlIO fixture = new XmlIO();
				InputStream input = new InputStream();
				boolean result = fixture.load(input);
				assertTrue(result);
		}
		
		/**
		* Test case 6 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is not null.
		*/
		@Test
		void testLoad_6() {
				XmlIO fixture = new XmlIO();
				InputStream input = new InputStream();
				boolean result = fixture.load(input);
				assertTrue(result);
		}
		
		/**
		* Test case 7 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is not null.
		*/
		@Test
		void testLoad_7() {
				XmlIO fixture = new XmlIO();
				InputStream input = new InputStream();
				boolean result = fixture.load(input);
				assertTrue(result);
		}
		
		/**
		* Test case 8 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is not null.
		*/
		@Test
		void testLoad_8() {
				XmlIO fixture = new XmlIO();
				InputStream input = new InputStream();
				boolean result = fixture.load(input);
				assertTrue(result);
		}
		
		/**
		* Test case 9 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is not null.
		*/
		@Test
		void testLoad_9() {
				XmlIO fixture = new XmlIO();
				InputStream input = new InputStream();
				boolean result = fixture.load(input);
				assertTrue(result);
		}
		
		/**
		* Test case 10 for {@link XmlIO#load(InputStream)}.
		* It tests the case that the InputStream is not null.
		*/
		@Test
		void testLoad_10() {
				XmlIO fixture = new XmlIO();
				InputStream input = new InputStream();
				boolean result = fixture.load(input);
				assertTrue(result);
		}
}
//End class XmlIO_1Test

// XmlIO_3Test.java
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
* It contains ten unit test cases for the {@link XmlIO#load()} method.
*/
class XmlIO_3Test {
		
		/**
		* Test case 1 for {@link XmlIO#load()}.
		* It tests the case that the URL is null.
		*/
		@Test
		void testLoad_1() {
				XmlIO fixture = new XmlIO();
				boolean result = fixture.load();
				assertFalse(result);
		}
		
		/**
		* Test case 2 for {@link XmlIO#load()}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_2() {
				XmlIO fixture = new XmlIO();
				boolean result = fixture.load();
				assertTrue(result);
		}
		
		/**
		* Test case 3 for {@link XmlIO#load()}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_3() {
				XmlIO fixture = new XmlIO();
				boolean result = fixture.load();
				assertTrue(result);
		}
		
		/**
		* Test case 4 for {@link XmlIO#load()}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_4() {
				XmlIO fixture = new XmlIO();
				boolean result = fixture.load();
				assertTrue(result);
		}
		
		/**
		* Test case 5 for {@link XmlIO#load()}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_5() {
				XmlIO fixture = new XmlIO();
				boolean result = fixture.load();
				assertTrue(result);
		}
		
		/**
		* Test case 6 for {@link XmlIO#load()}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_6() {
				XmlIO fixture = new XmlIO();
				boolean result = fixture.load();
				assertTrue(result);
		}
		
		/**
		* Test case 7 for {@link XmlIO#load()}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_7() {
				XmlIO fixture = new XmlIO();
				boolean result = fixture.load();
				assertTrue(result);
		}
		
		/**
		* Test case 8 for {@link XmlIO#load()}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_8() {
				XmlIO fixture = new XmlIO();
				boolean result = fixture.load();
				assertTrue(result);
		}
		
		/**
		* Test case 9 for {@link XmlIO#load()}.
		* It tests the case that the URL is not null.
		*/
		@Test
		void testLoad_9() {