// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_0Test {
		static HTMLDocument htmlDoc = null;
		static final int length = 5;

		@Test
		void testLookupAttributeNS() throws Exception {
			XMLReader reader = XMLReaderFactory.createXMLReader();
            reader.setFeature("http://xml.org/sax/features/namespaces", true);
			reader.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
			reader.setFeature("http://xml.org/sax/features/external-general-entities", true);
			reader.setFeature("http://xml.org/sax/features/external-parameter-entities", true);

            reader.parse(new AttributesImpl(), htmlDoc, length);

			Vector<String> attributes = htmlDoc.getElementsByTagNameNS(null, "tag1");
			if(attributes!= null) {
				assertEquals("tag1", attributes.elementAt(0).toString());
			}
		}

	@Test
	class Document_0Test {
		String tagText;
		AttributesImpl attributes;
		int position;

		public Document_0Test(int position, AttributesImpl attribute, String tagText) {
			this.position = position;
			attributes = attribute;
			tagText = tagText;
		}
	}
	
	@Test
	public void testElementValue_01() throws Exception {
					XMLReader reader = XMLReaderFactory.createXMLReader();

			int index = 0;
			Vector<Document_0Test> tests = new Vector<Document_0Test>();
			TestDocument testDoc = new TestDocument(htmlDoc);

			reader.setContentHandler(testDoc);

			reader.setDocumentLocator(new LocatorImpl(htmlDoc, position + 1));

			reader.parse(new AttributesImpl(), htmlDoc,length);

			// The first line is always the element
			String firstTag = testDoc.getElementsByTagNameNS(null, "tag1").elementAt(0).getText();
			reader.nextContent();
			reader.previousContent();

			// This test is for the tag element which has the attribute value
			tests.add(new Document_0Test(position + 1, htmlDoc.getElementsByTagNameNS(null, "tag1"), firstTag.substring(0, position + 1)));

			// And the content of the first element
			AttributeValue firstAttr = (AttributeValue) testDoc.getElementsByTagNameNS(null, "tag1").elementAt(0).getAttributes().getNamedItem("text").getNodeValue();

			// Each test has an attribute value that is not the same as the element's
			tests.add(new Document_0Test(position + 1, testDoc.getElementsByTagNameNS(null, "tag1").elementAt(0), firstAttr.getNodeValue()));

			System.out.println("Testing element with value " + firstAttr.getNodeValue());

			assertEquals("value " + index, firstAttr.getNodeValue(), tests.elementAt(index).tags.elementAt(0).attributes.getNamedItem("value").getNodeValue());
			assertEquals("position " + index, index, tests.elementAt(index).tags.elementAt(1).position);
			index++;

	}

	@Test
	public void testElementsByTagNameNS_01() throws Exception {
		XMLReader reader = XMLReaderFactory.createXMLReader();
		reader.setFeature("http://xmlpull.org/v1/fmt/pretty", true);
		reader.setFeature("http://xml.org/sax/features/namespaces", true);
		reader.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
		//reader.setFeature("http://xmlpull.org/v1/fmt/pretty", false);
		//reader.setFeature("http://xmlpull.org/v1/fmt/xml", false);

		reader.parse(new AttributesImpl(), htmlDoc, length);
		//reader.nextContent();
		//System.out.println("Number of elements in document " + htmlDoc.getElementsByTagNameNS(null, "tag1").size());
	}

	@Test
	public void testElementWithAttributeValue_01() throws Exception {
		XMLReader reader = XMLReaderFactory.createXMLReader();

			int index = 0;
			Vector<TestDocument_0Test> tests = new Vector<TestDocument_0Test>();
			TestDocument_0Test testDoc = new TestDocument_0Test(htmlDoc, index, "tag1", "value", index);
			index++;

			reader.setContentHandler(testDoc);

			reader.setDocumentLocator(new LocatorImpl(htmlDoc, position + 1));

			testDoc.position = 2;
			reader.nextContent();

			reader.previousContent();
			
			// Both elements have the same name and value
			assertEquals("tag1 value", testDoc.tags.elementAt(0).attributes.getNamedItem("text").getNodeValue());
			assertEquals("tag1 position",  index, testDoc.tags.elementAt(1).position);
			index++;
//			assertEquals("tag1 position",  index, testDoc.tags.get(1).position);

			// The first attribute element
			AttributeValue firstAttr = (AttributeValue) testDoc.tags.elementAt(0).attributes.getNamedItem("text").getNodeValue();

			// Each test has an attribute value that is different of the first
			assertNotEquals("tag1 value", firstAttr.getNodeValue());
			// Each test has an attribute value that is different of the second
			String secondAttr = (String) testDoc.tags.elementAt(1).attributes.getNamedItem("text").getNodeValue();
			assertNotEquals("tag1 position", index, secondAttr.toString().equals(firstAttr.getNodeValue()));
			index++;

	}

	public static class TestDocument {
		private final HTMLDocument htmlDoc;

		TestDocument(HTMLDocument htmlDoc) {
			this.htmlDoc = htmlDoc;
		}

	}

	private int position;

	public static class LocatorImpl extends DefaultHandler {
		HTMLDocument htmlDoc;
		int position;

		private ArrayList<Tag> tags = null;

		public LocatorImpl(HTMLDocument htmlDoc, int position) {
			this(htmlDoc, position, position);
		}

		public LocatorImpl(HTMLDocument htmlDoc, int position, boolean endTag) {
			this.position = position;
			this.htmlDoc = htmlDoc;
			if (endTag)
				this.tags = new ArrayList<Tag>();
		}

		public LocatorImpl(HTMLDocument htmlDoc, int position, ArrayList<Tag> tags) {
			this.position = position;
			this.htmlDoc = htmlDoc;
			this.tags = tags;
		}

		public ArrayList<Tag> getTags() {
			return tags;
		}

}
}