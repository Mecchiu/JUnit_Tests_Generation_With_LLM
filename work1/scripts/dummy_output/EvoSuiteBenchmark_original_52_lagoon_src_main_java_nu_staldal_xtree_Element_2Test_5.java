// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_2Test {
		private Vector<String> testData = new Vector<>();
	public static String getTestData(String name) {
    return "|"+(name!=null? name+"-Case1" : null)+";|";
}

	private String getContent(String name) {
    return "<"+getTestData(name)+">\n"+"\n"+"    <node id=\"X\">\n"+
                                "      <element id=\"Y\"></element>\n"+
                                "    </node>\n"+"</"+getTestData(name)+">\n";
}

	private String getStringContent(String content, int firstChar) {
    return content.charAt(firstChar) + content.substring(firstChar+1, content.length()-1);
}
	@Test public void shouldConstruct() {
		Element el = new Element();
		assertNull(el.getAttribute("tag_name"));
		assertEquals(0, el.getContentLength());
	}
    @Test public void shouldHaveContent() {
    	String content = getContent("X");
    	String text = getContent("tag_name");
    	assertTrue(text.indexOf("<\n")!=-1);
    	assertTrue(text.indexOf('\"')!=-1);
    	assertTrue(text.indexOf('\"')!=-1);
    	String expected = "<";
    	String actual = el.toString();
    	assertEquals(expected, actual);
    	assertTrue(System.getProperty("org.junit.Test.suiteName").endsWith("Nodes"));
		assertEquals(getContent("X"), getContent("Y"));
    }

	@Test public void shouldHaveContentAfter() {
    	String content = getContent("X");
    	String expected = "<";
    	String actual = el.toString();
    	assertEquals(expected, actual);
    	assertTrue(System.getProperty("org.junit.Test.suiteName").endsWith("Nodes"));
		assertEquals(getContent("Y"), getContent("X"));
    }

    @Test public void shouldHaveContentAfterElement() {
    	String content = getContent("X");
    	String expected = "<";
    	String actual = el.toString();
    	assertEquals(expected, actual);
    	String actualContent = getContent("y");
    	assertEquals(expected, "\"y\"");
    	assertEquals(actualContent, getContent("y"));
    	assertTrue(System.getProperty("org.junit.Test.suiteName").endsWith("Nodes"));
		assertEquals(getContent("Y"), getContent("X"));
    }

    @Test public void shouldHaveContentAfterAttribute() {
    	String content = getContent("tag_name");
    	String expected = "<";
    	String actual = el.toString();
    	assertEquals(expected, actual);
    	String actualContent = getContent("Y");
    	assertEquals(expected, "\"Y\"");
    	assertEquals(actualContent, getContent("Y"));
    	assertTrue(System.getProperty("org.junit.Test.suiteName").endsWith("Nodes"));
		assertEquals(getContent("Y"), getContent("tag_name"));
    }

    @Test public void shouldGetDocument() throws SAXException {
    	String content = getContent("X");
		Document mocked = ElementTest.testElement(new MockDocument(getXML(content)));
		assertNull(mocked.getDocument().getParentElement());
		assertEquals(mocked, ElementTest.testElement(new MockDocument(getXML(content))).getDocument());
	}

    Document getXML(String content) {
		return new Document();
    }

    @Test public void shouldGetXpath() {
}
}