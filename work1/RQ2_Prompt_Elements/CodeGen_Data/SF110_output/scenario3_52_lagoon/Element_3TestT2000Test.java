// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
 // test for an attribute with a null localName
	@Test
	public void testAttributeWithNullName() throws Exception {
		Element element = new Element();
		assertNotNull("The element should contain a null name", element.getAttributeLocalName("NoLocalName"));
		assertEquals("The name of the local name should be null", null, element.getName());
	}


		 // test for a no localname attribute
	@Test
	public void testAttributeWithNotANonLocalName() throws Exception {
		Element element = new Element();
		assertNull("The element should contain a null name", element.getAttributeLocalName("noLocalName"));
		element.setName("noLocalName");
		assertNotNull("Should contain a non-local name", element.getName());
	}


			 // test for a no localname attribute, with a singleton
	@Test
	public void testAttributeWithSingletonOne() throws Exception {
		Element element = new Element();
		assertNull("The element should contain a null name", element.getAttributeLocalName(""));
		element.setName("attribute");
		assertNotNull("Should contain a non-local name", element.getName());
	}


			 // test for a attribute with a multiple localname
	@Test
	public void testAttributeWithMultipleList() throws Exception {
		Element element = new Element();
		Vector<String> list = new Vector<String>();
		assertNull("The element should contain a null name", element.getAttributeLocalName(""));
		element.setName("attribute");
		element.lookupAttribute("name");
		assertEquals("The name attribute should contain the name value of the " +
			"first list member. The local name is not set.", element.getName(), "attribute");
		int size = list.size();
		assertEquals("The vector size should size 1", 1, size);
	}


		 // test for a attribute with a nested Attribute
	@Test
	public void testAttributeWithNestedAttribute() throws Exception {
		Element element = new Element();
		element.lookupAttribute("attribute");
		assertNotNull("The element should contain a null name", element.getName());
		assertEquals("The name attribute should contain the name value of the " +
			"nested attribute", "nestedName", element.getName());
	}

			 // test for a attribute with a nested Attribute, with a default
	@Test
	public void testAttributeWithNestedNestedAttribute() throws Exception {
		Element element = new Element();
		element.lookupAttribute("attribute");
		assertNotNull("The element should contain a null name", element.getName());
		assertNull("The name attribute should contain the name value of the " +
			"nested attribute", element.getName());
	}


		 // test for an element that's defined in another document
	@Test
	public void testDefinedElement() throws Exception {
		Element element = new Element();
		element.setName("attribute");
		element.lookupName("tag");
		assertEquals("The element's name attribute was not set correctly", "tag", element.getName());
	}


		 // test for an element to be defined in another document, but not the definition of an element
	@Test
	public void testDefinedElementToBeFound() throws Exception {

		Element element = new Element();
		element.lookupName("attribute");
		assertEquals("The element's name attribute was not set correctly", "attribute2", element.getName());

		element = new Element();
		element.setName("attribute2");
		assertNotNull("The element should still be defined if it's not a defined element", element.lookupName("attribute"));
	}


	// test for the definition of an element to be defined, but not the definition of an element
	@Test
	void testDefinedElementToBeFoundToBeDefined() throws Exception {
		Element element = new Element();
		element.setName("my element.");
		assertNotNull("An element's name attribute should have been set", element.lookupName("my element."));

		element = new Element();
		element.setName("my");
		assertNull("An element's name attribute should have been removed", element.lookupName("my element"));
	}


		 // test for a reference to a non-existent element
	@Test
	public void testReferencingNonExistentElement() throws Exception {
		try {
			Element element = new Element();
			element.setName("non-existent");
			assertThrows("Should throw an ElementNotFoundException for " +
				"the referenced element, if the referenced element does not exist ",
				ElementNotFoundException.class,
				() -> element.lookupAttribute("non-existent"));

		}
		catch (ElementNotFoundException e) {
			// expected behavior
		}
	}

		// test for a reference to an element defined in another document, to a duplicate
	@Test
	public void testReferencedDocument() throws Exception {

		Document newDoc = DocumentBuilder.createNewDocument();
		Element duplicate = new Element();
		duplicate.setDocument(newDoc);
		newDoc.appendChild(duplicate);
		Element element = duplicate;

		assertEquals("The referenced document should contain the same name as when this was generated",
			duplicate.getName(), element.getName());
	}


	// test for a reference to an element defined in more than one document, to a duplicate
	@Test
	public void testReferencedDocumentToBeCreated() throws Exception {

		Document newDoc1 = DocumentBuilder.createNewDocument();
		Document newDoc2 = DocumentBuilder.createNewDocument();
		Document newDoc3 = DocumentBuilder.createNewDocument();

		assertNonEquals("The references to different documents should not be equivalent", null, null);

		Element reference = newElement("reference");
		reference.setDocument(newDoc1);

		Element duplicate = new Element();
		duplicate.setDocument(newDoc2);

		duplicate.setDocument(newDoc3);

		assertNonEquals("Two references to the same document should not be equivalent", null, duplicate);
	}


	private static final String TEST_ELEMENT = "<elem>";
	private static final String TEST_ELEMENT_WITH_START_CHAR = "<elem2";
	private static final String TEST_ELEMENT_WITH_END_CHAR = "</elem>";
	private static final String TEST_ELEMENT_WITH_2_START_CHAR = 
		"<elem:start=";

	private static final String TEST_ELEMENT_WITH_2_END_CHAR = 
		"<elem:end=/></elem>";

	private static Element newElement(String name) throws Exception {
		return new Element(name);
	}


	private Element element(String name) throws Exception {
		return new Element(name);
	}


	private Namespace ns(String local, String prefix) throws Exception {
		Namespace ns = new Namespace();
		ns.setLocalName(local);
		ns.setPrefix(prefix);
		return ns;
	}


	private Element newElement(String name, Attributes attributes) throws Exception {
		Element element = newElement(name);

		for (String att