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
		private final XMLReader theXMLReader = (XMLReader) SAXParserFactory.newInstance().newSAXParser().getXMLReader();
		private final int bufferSize = 4096;
        private final Logger logger = Logger.getLogger(getClass().getName());
	@org.junit.jupiter.api.Test
	public void testLoad() throws Exception {
		// we read from a local xml input source
		final String xmlDoc = "<document>\n" + "<foo>1</foo>\n" + "</document>";
		// we load the XML into a real writer
		final Writer output = new BufferedWriter(new FileOutputStream("xmlout.xml"));
		// read the input XML to the output
        theXMLReader.parse(new InputSource(xmlDoc.getBytes()));
		theXMLReader.save(output);
			
        // we have loaded the input XML into a real writer
		final BufferedWriter outputWd = new BufferedWriter(new FileOutputStream("xmlout.xml"));
        // read the output XML to the output
        final Writer outputW = new BufferedWriter(outputWd);
        // do the reading of the XML while reading input XML to the output
        theXMLReader.skipExternalEntities();
		int count = 0;
}
}