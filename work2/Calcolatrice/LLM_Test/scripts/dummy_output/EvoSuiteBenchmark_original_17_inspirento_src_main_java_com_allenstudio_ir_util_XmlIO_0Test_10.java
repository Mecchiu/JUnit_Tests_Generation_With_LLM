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
		public static void main(String[] args) {
			assertEquals("load success", true);
		}
	   /*

        testLoadXml()

        This test case is part of the development of the IrClient framework using XmlIO.

        It must be run as a unit test.
        1) Generates one "main" test case (see test1) and two "optional test cases" (see test2) as per the spec:
        <main>
        <b>Test 1.1</b>
            <root>
        <c>Hello</c>
        </root>
        </main>
        <optional_test>
        <a>test_a_1</a>
            <b>Test 1.2-2</b>
            </optional_test>
            </main>
        <optional_test>

        <a>test_a_1</a>
        <b>Test 1.2-2</b>

        <optional_test>

        </optional_test>
        </main>

        */
	/**
	 * Loads tests from the specified XML DOM XML file,
	 * and stores results in the specified XML stream.
	 * @param file a File with a XML DOM XML as its content.
	 * @param stream the output file to which to write the results.
	 * @throws Exception
	 */
	public boolean load(String file, String stream) throws Exception;

	/**
	 * Loads the XML for the specified URL as a string, and saves the result
	 * in this stream.
	 *
	 * @param url a URL containing a file with a XML DOM XML as its content.
	 * @param stream the output stream to which to write the results.
	 * @throws Exception
	 */
	public boolean load(URL url, String stream) throws Exception;

	/**
	 * Loads tests from the specified XML DOM XML file,
	 * and stores results in the specified OutputStream.
	 * @param file a File with a XML DOM XML as its content.
	 * @param stream the output stream to which to write the results.
	 * @throws Exception
	 */
	public boolean load(String file,  OutputStream stream)  throws Exception;

	/**
	 * Loads the XML for the specified URL as a string, and saves the 
	 * results in the specified OutputStream.
	 *
	 * @param url a URL containing a file with a XML DOM XML as its content.
	 * @param stream the output stream to which to write the results.
	 * @throws Exception
	 */
	public boolean load(URL url,  String file,  OutputStream stream)  throws Exception;

	 public boolean load(String file,  Reader reader) throws Exception;

	  /**
	 * Loads test cases (both input and output) from the specified XML DOM XML file,
	 * and stores the results in the specified XML stream.
	 * <p>If any test case contains data-nodes then the data-nodes will be 
	 * parsed from the specified XML DOM XML file.</p>
	 * @param file a File with a XML DOM XML as its content.
	 * @param stream the output stream to which to write the results.
	 * @throws Exception
	 */
	public boolean load(String file,  OutputStream stream) throws Exception;

	 public boolean load(Reader reader) throws Exception;
	  /**
	 * Loads test cases (both input and output) from the specified XML DOM XML file,
	 * and stores the results in the specified XML stream.
	 *
	 * @param reader a XML DOM XML as an InputStream with a Reader containing a XML DOM 
	 *              Element as the XML content.
	 * @param stream the output stream to which to write the results.
	 * @throws Exception
	 */
	public boolean load(Reader reader, String file, String stream) throws Exception;
	/**
	 * Loads test cases (both input and output) from the specified XML DOM XML 
	 * file and stores the results in the specified XML stream.
	 *
	 * @param file a File with a XML DOM XML as an InputStream with a Reader containing a XML DOM 
	 *              Element as the XML content.
	 * @param stream the output stream to which to write the results.
	 * @throws Exception
	 */
	public boolean load(Reader reader, String file, OutputStream stream) throws Exception;
	/**
	 * Loads the XML for the specified URL as a String,
	 * and converts the results to a string if necessary.
	 *
	 * @param url a URL containing a file with a XML DOM XML as its content.
	 * @param stream the output stream to which to write the results.
	 * @throws Exception
	 */
	public String load(URL url, OutputStream stream)  throws Exception;

	 /**
	 * Loads the XML for the specified URL as a String,
	 * and converts the results to a string if necessary.
	 *
	 * @param url a URL containing a file with a XML DOM XML as its content.
	 * @param stream the output stream to which to write the results.
	 * @throws Exception
	 */
	public String load(URL url, String stream) throws Exception;

	 /**
	 * Loads test cases (both input and output) from the specified XML DOM XML file,
	 * and converts the results to a string if necessary.
	 *
	 * @param file a File with a XML DOM XML as its content.
	 * @param stream the output stream to which to write the results.
	 * @throws Exception
	 */
	public String load(String file, OutputStream stream) throws Exception;

}