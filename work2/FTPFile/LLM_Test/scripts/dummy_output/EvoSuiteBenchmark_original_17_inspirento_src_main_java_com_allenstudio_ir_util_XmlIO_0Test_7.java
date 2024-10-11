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
		JOptionPane.setInitialPrompt("XML tests");

		String test_name;
		boolean test_result;
		boolean test_is_valid;

		public XmlIO_0Test(String test_n, boolean test_r) {
			test_name = test_n; test_result = test_r;
		}

		/**
		 * Sets the test result.
		 *
		 * @param test_result true if it's valid, false if not, null in case of error.
		 */
		public void test_result(boolean test_result) {
			this.test_result = test_result;
		}

        /**
         * @return the test result
         */
        public boolean is_valid() {
                return this.test_result;
        }

        /**
         * Sets the test name.
         *
         * @param test_name the test name.
         * @throws IOException in case of an error.
         */
        public void test_name(String test_name) throws IOException {
                this.test_name = test_name;
        }

        public String get_test_name() {
                return this.test_name;
        }

		/**
		 * Returns the XML document as a BufferedWriter.
		 *
		 * @return the XML document as a BufferedWriter.
		 */
		public Writer getXml(boolean to_be_written, String encoding) {
                CharArrayWriter result = new CharArrayWriter();

                try {
                        if (to_be_written) {
                                Writer writer = new BufferedWriter(
                                        new OutputStreamWriter(new FileOutputStream(result), encoding));
                                writer.write(XMLReader.getCharacterEntity(this.test_name, encoding));
                                writer.close();
                        }

                } catch (IOException ioe) {
                        JOptionPane.showMessageDialog(null,
                                "Error encoding the test xml documents.", "Error encoding test xml", JOptionPane.ERROR_MESSAGE);
                        ioe.printStackTrace();
                        return new BufferedWriter(new OutputStreamWriter(System.out, "UTF8"));
                }

                return new CharArrayReader(result.toByteArray());
		}

		public Writer getText(boolean to_be_written, String encoding) { return getXml(to_be_written, null); }
} // end new XmlIO_0Test

public static void main(String args[]) {
        // get the output of this file in UTF8-encoding
        InputStream output = XmlIO_0Test.class.getResourceAsStream("UTF8_UTF8_XML_Test.xml");

        // create an output of the test text
        Writer text = XmlIO_0Test.getText(false, "UTF8");

        // create the test XML
        FileWriter tmp = new FileWriter("UTF8_UTF8_XML_Test.xml");

        // write the text to the test XML
        try {
				text.write(tmp);
			} catch (Exception e) {
				e.printStackTrace();
			}
        tmp.flush();
        tmp.close();

        // read from the test text
        String source = tmp.readLine();
        System.out.println("source = " + source);

        // close the tmp file and write the test text
        tmp.flush();
        tmp.close();

		// read from the test XML
        Reader stream_reader = XmlIO_0Test.getXml("false", "UTF8");

        // read from the test XML
        String output = stream_reader.read();
        System.out.println("read from the test XML");

        // close the stream_reader
        stream_reader.close();

		// close the output
        stream_reader.close();

		// close the test file
		tmp.flush();
		tmp.close();
}