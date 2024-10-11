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
		
	@Test
	public void xmlload() throws IOException {
		//load XML stream from a file

        final URL resourcesURL = this.getClass().getClassLoader().getResource("MoodleMapper.xml");
		final FileOutputStream fos = new FileOutputStream("MoodleMapper.xml");
		final BufferedWriter bws = new BufferedWriter(new OutputStreamWriter(fos),"UTF-8");
		assertNotNull(resourcesURL);
		bws.write("<root xmlns=\"http://xm.org/\"/>", 0, 0, "UTF-8");
        char[] c = new char[300];
        bws.write("<root xmlns=\"mynamespace\">", 0, 0, "UTF-8");
        System.arraycopy(c, 0, bws.write(c,0, 300),0, 300);
        bws.write("</root>", 0, 0, "UTF-8");

		InputStream is = new URL(resourcesURL).openStream();
		Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		ReaderIterator it = new ReaderIterator(reader);
		it.fetchNextElement();
		while( it.hasNext() )
		{
			it.fetchNextElement();
			it.fetchNextElement();
			it.fetchNextElement();
			it.fetchNextElement();
			it.fetchNextElement();
			it.fetchNextElement();
			it.fetchNextElement();
		}
		it.fetchNextElement();
	}
	
	
	
	class ReaderIterator implements Iterator {
		StringBuffer sb = new StringBuffer(300);
		boolean next_ = false;
		boolean hasNext = false;
		Reader next_reader = null;
		
		public ReaderIterator(Reader in) {
			next_reader = in;
		}
		
		public boolean hasNext() {
			return hasNext;
		}
		
		public Object next() {
			next_reader = null;
			if (!hasNext) {
				sb.deleteCharAt(0);
				hasNext = true;
				next_reader = null;
			}
			if (next_reader == null) {
				String n = sb.toString();
				next_reader = new StringReader(n);
				sb.delete(0, sb.length());
				hasNext = false;
			}
			return sb.toString();  
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}
	
	class StringReader extends Reader {
		String str;

		public StringReader(String str) throws IOException {
			char ac[] = new char[str.length()];
			str.getChars(0, str.length(), ac, 0);
			str = new String(ac);
		}
		
		public void close() throws IOException { }
		
		public int read(char[] cbuf, int off, int len) throws IOException {
			return -1; 
		}
		
		public int read() throws IOException {
			boolean gotc = false;
			while(gotc == false) {
				gotc = next_reader.ready();
				if (gotc) {
					gotc = next_reader.ready();
				}
				if (gotc == true) {
					next_reader.close();
					gotc = next_reader.ready();
				}
			}
			if (gotc == false)
				gotc = next_reader.ready();
			return gotc?gotc:read();
		}

		private boolean read_startElement(String xmlns)
			throws SAXException {
			return next_reader.peek();
			next_reader.skip();
		}

		protected void characters(char[] ch, int off, int len)
				throws SAXException {
			next_reader.skip(len);
		}

		protected void endElement(String uri, String localName, String qName)
				throws SAXException {
			next_reader.skip();
			StringBuffer sb = new StringBuffer(localName);
			sb.append(next_reader.next());
			next_reader.skip(sb.length());
			sb.setLength(0);
			sb.setLength(localName.hashCode());
			next_reader.close();
			next_reader = null;
			sb.append(next_reader.next());
			next_reader.close();
			next_reader = null;
			sb.append(next_reader.next());
			next_reader.close();
		}

		public boolean hasNext_startElement(String prefix, String localPart,
			String qName, String uri, Attributes attrs) throws SAXException {
			// We don't want to close the stream, we want the next element
			return startElement(prefix, localPart, qName, uri, attrs);
		}

		public boolean hasNext_endElement(String prefix, String localPart,
			String qName, String uri) throws SAXException {
			// We don't want to close the stream, we want the next element
			return endElement(prefix, localPart, qName, uri);
		}
	}
	
	class PrintWriter extends Writer {
	}
	
	class BufferedWriter extends PrintWriter {
	}
	
	
	private static final Logger logger = Logger.getLogger(XmlIO_1Test.class.getCanonicalName());
	
	class XMLReader_1Test extends DefaultHandler {

		XMLReader xr = null;
		Vector xmlns = new Vector();

}
}