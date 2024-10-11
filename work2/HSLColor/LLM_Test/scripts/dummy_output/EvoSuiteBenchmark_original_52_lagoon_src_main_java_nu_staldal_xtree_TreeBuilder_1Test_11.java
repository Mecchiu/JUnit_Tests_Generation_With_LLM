// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains one unit test case for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
		private final Element root;
		private final ElementBuilder builder;
		private final Element node;
		private final boolean validateDTD;

		/**
		 * Constructor.
		 */
		public TreeBuilder_1Test(){
			root = new Element("element", null);
			node = new Element("text", root);
			builder = new ElementBuilder(node);
			validateDTD = true;
		}

		/**
		 * Constructor.
		 * @param validationValidate determine if errors should be validated.
		 */
		public TreeBuilder_1Test(boolean validationValidation){
			root = new Element("element", null);
			node = new Element("text", root);
			builder = new ElementBuilder(node);
			validateDTD = validationValidation;
		}

		/**
		 * Test of parseXML method, of the class.
		 * @throws SAXException if any.
		 * @throws IOException if any.
		 */
		@Test
		public void testParseXML_1Exception(){
			try{
				reader = new BufferedReader(new InputStreamReader(new URL("file:///someFile").openStream()));
				element = parseXML(reader, validateDTD);
			}
			catch(java.io.IOException exc){
				failure("IOException thrown when parsing the file: "+exc, exc);
			}
			catch(NullPointerException exc){
				failure("NullPointerException thrown when parsing the file: "+exc, exc);
			}
		}

		/**
		 * Test of parseXML method without DTD validation.
		 * @throws SAXParseException if any.
		 * @throws IOException if any.
		 */
		@Test
		public void testParseXMLWithoutDTD(){
			try{
				reader = new BufferedReader(new InputStreamReader(new URL("file:///someFile").openStream()));
				error = new ArrayList<>();
				element = parseXML(reader, false);
			}
			catch(Exception exc){
				failure("Unable to build tree", exc);
			}
			assertTrue(error.isEmpty(), "Validating XML document without DTD should be silently ignored");
		}

		/**
		 * Test of parseXML method: validate DTD.
		 * @throws SAXParseException if any.
		 * @throws IOException if any.
		 */
		@Test
		public void testParseXMLValidateDTD(){
			validateDTD = true;
			try{
				reader = new BufferedReader(new InputStreamReader(new URL("file:///someFile").openStream()));
				element = parseXML(reader, validateDTD);
			}
			catch(Exception exc){
				failure("Unable to build tree", exc);
			}
			assertTrue(error.isEmpty(), "Validating XML document without DTD should be silently ignored");
		}

		@Test
		public void testParseXMLWithSchemaConstraint(){
			try{
				reader = new BufferedReader(new InputStreamReader(new URL("file:///someFile").openStream()));
				element = parseXML(reader, false);
			}
			catch(Exception exc){
				failure("Unable to build tree", exc);
			}
			assertTrue(error.isEmpty(), "Validating XML document with DTD should return tree with schema constraint");
			try{
				reader = new BufferedReader(new InputStreamReader(new URL("file:///someFile").openStream()));
				assertTrue(element!= null, "root element not returned by XML parser is null.");
				element.setAttribute("schema", new SchemaConstraint());
				element = parseXML(reader, validateDTD);
			}
			catch(Exception exc){
				failure("Unable to build tree", exc);
			}
			assertTrue(error.isEmpty(), "Validating XML document with DTD should return tree without schema constraint");
		}

		/**
		 * Check if the children of the element are not adjacent.
		 * @throws SAXException if there is an error.
		 */
		private void assertNoAdjacentChildren(){
			List<Element> tmp = new ArrayList<>(Arrays.asList(node.getChildElements())
					       .subList(0, node.getChildElements().size()));
			for (Element child : tmp){
				assertTrue("element " + child + " has an adjacent child, but should not have it.",
						((Collections.addAll(node.getChildElements(), Collections.singletonList(element))).
						 contains(child)));
			}
		}

		/**
		 * Generate test for the TreeBuilder.
		 */
		private static void doTest(){
			TreeBuilder_1Test testUtility = new TreeBuilder_1Test();
			assertTrue(testUtility.error.isEmpty(), "Build tree success.");
			assertTrue(testUtility.error.isEmpty(), "(1.01) build tree success.");
			try{
				testUtility.parseXML_1Exception();
				fail("Unable to build tree with errors.");
			}
			catch(Exception exc){
				assertTrue(testUtility.error.size() > 0, "All errors present: " + testUtility.error);
				for (String errorString : testUtility.error){
					assertTrue(true, errorString + ": " + node.getChildElements()[((TreeBuilder_1Test.Error) element).index() + 1] + " is one with exception " +
									 ((TreeBuilder_1Test.Error) element).type.name() + " and " +
									 ((TreeBuilder_1Test.Error) element).category.name());
				}
			}
			assertFalse(testUtility.error.isEmpty(), "(1.01) build tree success.");
			if (validateDTD){
				try{
					assertTrue(testUtility.parseXML_withoutDTD());
					fail("Unable to build tree with DTD not present.");
				}
				catch(Exception exc){
					assertTrue(testUtility.error.size() == 1, "Should have gotten 1 and 1 error on DTD present.");
				}
			}
			assertTrue(testUtility.error.isEmpty(), "build tree failure.");
			testUtility.assertNoAdjacentChildren();
		}

		private final List<Element> error = new ArrayList<>();
		private final List<Element> node = new ArrayList<>();
		private final TreeBuilder builder;
		private final String[] result;
		private final List<Element> resultResult = new ArrayList<>();
		private final Document doc;
		private final DocumentResult docResult = new DocumentResult();
}