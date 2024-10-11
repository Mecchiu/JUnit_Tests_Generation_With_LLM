// XTreeUtil_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_0Test {
		
	private final String input;
	
	/**
	 * Create an instance by reading an XML file by its name.
	 * @param name name of the XML file to read.
	 * @return an XML document with the specified name.
	 */
	public static Element parseXML(String name) throws IOException {
		return parseXML(new File(name), false);
	}

	/**
	 * Create an instance by reading an XML file by its name.
	 * Use {@link #parseXML(InputSource)} when running inside an XML test harness.
	 * @param name name of the XML file to read.
	 * @param validateDTD validates using DTD
	 * @return an XML document with the specified name.
	 */
	public static Element parseXML(String name, boolean validateDTD) throws IOException {
		InputStream is = XTreeUtil_0Test.class.getResourceAsStream(name);
		if(is == null) {
			throw  new IOException("Could not find resource " + name);
		}
		is = new BufferedInputStream(is);
		try {
			return parseXML(is, validateDTD);
		} finally {
			is.close();
		}
	}

	/**
	 * Create an instance by reading an XML file by its name.
	 * @param is an input stream containing an XML document
	 * @return an XML document with the specified name.
	 */
	public static Element parseXML(InputStream is) throws IOException {
		return parseXML(is, false);
	}
	/**
	 * Create an instance by reading an XML file by its name.
	 * Use {@link #parseXML(InputSource)} when running inside an XML test harness.
	 * @param is an input stream containing an XML document
	 * @param validateDTD validates using DTD
	 * @return an XML document with the specified name.
	 */
	public static Element parseXML(InputStream is, boolean validateDTD) throws IOException {
		if(!(is instanceof DOMInputSource)) {
			return parseXML(new InputSource(is), false);
		}
		DOMInputSource is_ = (DOMInputSource) is;
		return parseXML(is_.getInputSource(), validateDTD);
	}

	/**
	 * Create an instance by reading an XML document by its name at the specified URL.
	 * Use {@link #parseXML(URL)} when running inside an XML test harness.
	 * @param url URL of the XML document
	 * @param validateDTD validates using DTD
	 * @return an XML document with the specified name.
	 * @throws IOException if there was any I/O error
	 */
	public static Element parseXML(URL url, boolean validateDTD) throws IOException {
		URLInputSource is_ = new URLInputSource(url);
		return parseXML(is_, validateDTD);
	}
	/**
	 * Create an instance by reading an XML document by its name at this URL.
	 * Use {@link #parseXML(URL)} when running inside an XML test harness.
	 * @param urlURL url of the XML document
	 * @return an XML document with the specified name.
	 * @throws IOException if there was any I/O error
	 */
	public static Element parseXML(String urlURL) throws IOException {
		return parseXML(new URL(urlURL), false);
	}
	/**
	 * Create an instance by reading an XML document by its name at this URL.
	 * Use {@link #parseXML(URL)} when running inside an XML test harness.
	 * @param urlURL URL of the XML document
	 * @param validateDTD validates using DTD
	 * @return an XML document with the specified name.
	 * @throws IOException if there was any I/O error
	 */
	public static Element parseXML(URL url, boolean validateDTD)
	throws IOException
	{
		InputStream is = XTreeUtil_0Test.class.getResourceAsStream(url.getFile());
		if(is == null) {
			throw  new IOException("Could not find resource " + url);
		}
		is = new BufferedInputStream(is);
		try {
			return parseXML(is, validateDTD);
		} finally {
			is.close();
		}
	}
	/**
	 * Create an instance by reading an XML Document from the specified InputSource.
	 * Use {@link #parseXML(InputSource)} when running inside an XML test harness.
	 * @param is the input stream containing an XML document.
	 * @return an XML document.
	 * @throws IOException if there was any I/O error.
	 */
	public static Element parseXML(InputSource is) throws IOException {
		return parseXML(is, false);
	}
}