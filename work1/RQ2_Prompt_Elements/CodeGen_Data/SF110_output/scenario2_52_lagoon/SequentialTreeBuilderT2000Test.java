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
/** Test data for the same case as {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}. */
    private final static String testdata = 
		"<root>\n"
		"<a>A</a>\n"
		"<b>B</b>\n"
		"<c>C</c>\n"
		"</root>";
		private static final String XMLNS = "http://test1.nu.staldal.nu/elements/a";
		private static final String ELEMENT = "a";
		private static final String NAMESPACE = "http://test2.nu.staldal.nu/elements/b";
		private static final String NAMESPACENS = "http://test2.nu.staldal.nu/elements/c";
		private static final String DTD = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + testdata;
		private static final String ENCODING = "UTF-8";
		private static final String ENCODING_XML = "UTF-8";
		private static final String ENCODING_NAMESPACE = "UTF-8";
		private static final String ENCODING_NAMESPACE_XML = "UTF-8";
		private static final String ENCODING_DTD = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>" + testdata;
		private static final String ENCODING_ENCODING = "UTF-8";
		private static final Set<String> expectedNamespaces = new HashSet<>(Arrays.asList(
				"http://test1.nu.staldal.nu/elements/a",
				"http://test2.nu.staldal.nu/elements/b",
				"http://test2.nu.staldal.nu/elements/c"));
		private static final Set<String> expectedElementNames = new HashSet<>(Arrays.asList("a", "b", "c"));
		private static final URL URL = new URL("http://test1.nu.staldal.nu/elements/a");
		private static final URL DTD_URL = new URL("http://test2.nu.staldal.nu/elements/b");
		private static final URL ENCODING_URL = new URL("http://test2.nu.staldal.nu/elements/c");
		private static final URL NAMESPACE_URL = new URL("http://test1.nu.staldal.nu/elements/c");
		private static final URL NAMESPACE_DTD_URL = new URL("http://test1.nu.staldal.nu/elements/c");
		private static final URL NAMESPACE_XML_URL = new URL("http://test1.nu.staldal.nu/elements/c");
		private static final URL DTD_NAMESPACE_URL = new URL("http://test1.nu.staldal.nu/elements/c");
		private DocumentBuilder docBuilder;

		private void test(String xmlElement, String element) throws Exception {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			factory.setValidating(false);
			factory.setFeature("http://xml.org/sax/features/validation", false);
			factory.setFeature("http://xml.org/sax/features/namespaces", false);
			factory.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
			factory.setFeature(DocumentBuilder.FEATURE_SECURE_PROCESSING, false);

			docBuilder = factory.newDocumentBuilder();

			InputSource source = new InputSource(new StringReader(xmlElement));

			Element rootElement = parseXMLSequential(source, false, SequentialTreeBuilderTest::testNamespaces);
			assertEquals("Test data", rootElement, SequentialTreeBuilderTest.getRootElement(ELEMENT, false));

			SequentialTreeBuilder.setElementNames(element, Sequence.ZERO_OR_ONE);
			SequentialTreeBuilder.setElementNames(element, Sequence.ZERO_OR_MORE);

			DocumentBuilder parser = docBuilder.newDocumentBuilder();
            rootElement = parseXMLSequential(source, false, SequentialTreeBuilderTest::testElementNames);
            assertEquals("Test data", rootElement, SequentialTreeBuilderTest.getRootElement(element, false));

			SequentialTreeBuilder.setElementNames(element, Sequence.ZERO_OR_MORE);

			parser = docBuilder.newDocumentBuilder();
			rootElement = parseXMLSequential(source, false, SequentialTreeBuilderTest::testElementNames);
			String expectedXML = rootElement.toString();
			String actualXML = rootElement.getTextContent();
			assertEquals(expectedXML, actualXML);

			rootElement = parseXMLSequential(source, false, SequentialTreeBuilderTest::testNamespaces);
			expectedXML = rootElement.toString();
			actualXML = rootElement.getTextContent();
			assertEquals(expectedXML, actualXML);
		}

		private Element getRootElement(String element, boolean skip) {
			Element element1 =