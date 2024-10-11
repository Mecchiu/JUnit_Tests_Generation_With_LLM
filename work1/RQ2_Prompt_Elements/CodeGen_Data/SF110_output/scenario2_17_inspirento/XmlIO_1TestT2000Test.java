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
/* ***************************************************
		 * Static variables.
		 */

		@SuppressWarnings("unused")
        private final static Logger LOG = Logger.getLogger(XmlIO_1Test.class.getName());

		/* ***************************************************
		 * Instance variables.
		 */

		private final XmlElement rootElement;

		/* ***************************************************
		 * Constructors.
		 */

		/**
		* Default constructor.
		*/
		public XmlIO_1Test() {
			rootElement = new XmlElement(ROOT_XML_ELEMENT_NAME);
        }
		/* ***************************************************
		 * Accessors.
		 */

		/**
		* Accessor method for {@link XmlElement} with {@value #ROOT_XML_ELEMENT_NAME} name.
		* @return the root element.
		*/
		public final XPmlElement getRootElement() {
			return (rootElement);
		}

		/* ***************************************************
		 * Methods.
		 */

		/**
		* Load XML file using the specified URL.
		* If no <code>file</code> parameter was passed, a
		* default-created output file is used.
		*
		* @param file the URL to load the XML file from.
		* @param test the test to perform the test.
		*/
		public final void load_1(final String file, final boolean test) {
			final URL url;
			if (file == null) {
				url = Thread.currentThread().getContextClassLoader().getResource(".");
			} else {
				url = new URL(file);
			}
			boolean xml = true;
			try {
				XmlIO.load(url);
				xml = true;
				elements = getRootElement().getChildElements();
				List list = new Vector<XmlElement>();
				list.add(rootElement);
                for (String string : elements) {
                    list.add(new XmlElement(string));
                }
                if (xml) {
                    test_getRoot(list, xml);
                } else {
                    test_getText(list);
                }} catch (IOException ex) {
                    // Do nothing.
                }
				StringBuffer buffer = new StringBuffer();
				for (Iterator it = list.iterator(); it.hasNext(); ) {
					XmlElement element = (XmlElement) it.next();
					buffer.append(element.toString().toUpperCase());
					buffer.append('\n');
				}
				JOptionPane.showMessageDialog(null,
                        new CharArrayWriter(0),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
			}
			catch (SAXException ex) {
				// Do nothing.
			}
			finally {
				boolean deleteFile = true;
				if (xml) {
					try {
						FileOutputStream fos = new FileOutputStream(file);
						System.getSecurityManager().checkPermission(new FilePermission("wl.home", "rw"));
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
						bw.write(buffer.toString().toLowerCase());
						bw.close();
						bw = null;
						fos.close();
						fos = null;
						deleteFile = false;
					} catch (Throwable t) {
						LOG.severe("Error while saving XML file to \"" + file + "\"", t);
					}
				}
				if (deleteFile) {
					new File(file).delete();
				}
			}
		}
        /**
         * Do the test for the XML content.
         * @param list the list to check.
         * @param xml true if the XML content should be parsed.
         */
		private void test_getText(final List list) {
            test_getRootElements(list, false);
        }
        /**
         * Do the test for the XML content.
         * @param list the list to check.
         * @param xml true if the XML content should be parsed.
         */
        private void test_getRootElements(final List list, final boolean xml) {
            test_getText(list, xml);
			int count = 1;