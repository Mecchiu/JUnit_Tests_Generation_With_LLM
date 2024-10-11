// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains one unit test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {
		@Test
		public void testSequentialParsing() throws SAXException {
				assertNotNull("root not created", SequentialTreeBuilder.parseXMLSequential(null, false, null));
		}
}
class Handler implements ContentHandler {
		public final XMLFilter filter = new XMLFilter(this);
		public final ElementHandler handler = new ElementHandler();

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//				System.out.println("start element. localName = "+localName+"; uri = "+uri);
			int i=0;
			for (Map.Entry<String, String> entry : attributes.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				filter.insertString(value, key, i);
				i++;
			}
			handler.startElement(uri, localName, qName, attributes);
			String tag = filter.getLastTag();
            try {
				if (!tag.equals("root")) {
					handler.endElement(uri, localName, tag);
				}
			}
            catch (XMLStreamException e) {
                throw new Error("Unexpected SAXException during parsing.", e);
            }
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
//				System.out.println("end element. localName = "+localName+"; URI = "+uri);
//				System.out.println("tag name = "+qName);
			String tag = filter.getLastTag();
			if (!tag.equals("root")) {
				handler.endElement(uri, localName, tag);
			}
			filter.insertString(null, "", 0);
		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
//			System.out.println("character event (c): "+new String(ch,start,length));
			filter.insertCharacters(new String(ch, start, length), 0);
		}

		public void characters(char[] ch, int start, int length, long currentTime) throws SAXException {
			filter.insertCharacters(new String(ch, start, length), currentTime);
		}

		public void additionalCharacter(char ch) throws SAXException {
//			System.out.println("character event (e): "+new String(ch));
			filter.insertCharacter(new String(ch), 0);
		}

		@Override
		public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
//			System.out.println("character event (i): "+new String(ch,start,length));
			filter.insertCharacters(new String(ch, start, length), 0);
		}

		@Override
		public void processingInstruction(String target, String data) throws SAXException {
//			System.out.println("processingInstruction ("+target+": "+data+")");
			filter.insertString(data, null, 0);
		}

		@Override
		public void skippedEntity(String name) throws SAXException {
			filter.insertString(name, null, 0);
		}

		@Override
		public void endDocument() throws SAXException {
//			System.out.println("endDoc");
		}
}