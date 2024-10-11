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
		
	@Test
	public void getAttributeLocalName_returns_attributes_nameOf_attribute() throws SAXException {
		final String attr1Name = "attr1";
		final int index1 = 1;
		
		Vector<String> attr1Names = new Vector<>();
		Vector<Object> attr1Data = new Vector<>();
		String attr1Value = null;
		
		attributes.addAttribute(
			new AttributesImpl() {{
				setLocalName("attr1");
				setURI("http://example.com");
				setValue("value of attr1");
			}},
			0,
			attr1Name
		);
		
		attributes.addAttributes(
			new AttributesImpl() {{
				setLocalName(attr1Name);
			}}
		);
		
		assertTrue("returns an attribute!", attributes.getAttribute(attr1Name, index1).getLocalName().equals(attr1Name));
		
		assertTrue("returns an attribute!", attr1Names.get(index1).equals(attr1Name));
		
		assertTrue("equals method returns false",!attr1Data.get(index1).equals(attr1Value));
	}
	
	@Test
	public void getAttributeNS_returns_valueIfNotFound() throws SAXException {
		final String attr1Name = "attr1";
		final int index1 = 1;
		
		Vector<String> attr1Names = new Vector<>();
		Vector<Object> attr1Data = new Vector<>();
		String attr1Value = null;
		
		attributes.addAttributes(
			new AttributesImpl() {{
				setLocalName("attr1");
				setURI("http://example.com");
				setValue("\"value of attribute\"");
			}},
			0,
			attr1Name
		);
		
		attributes.addAttributes(
			new AttributesImpl() {{
				setValue("value of attr1");
			}},
			index1
		);
		
		assertTrue("returns an attribute if not found", attributes.getAttributeNS(attr1Name, "http://example.com") == null);
		
		assertTrue("returns an attribute value", attr1Data.get(index1).equals("value of attribute"));
		
		assertTrue("equals method returns false", attr1Data.get(index1).equals(attr1Value));
	}
	
	@Test
	public void setElementText_addsText() throws SAXException {
		final String text = "test";
		final String newText = "new";
		final String newText2 = "new2";
		
		final Element docEl = new Element("test");
		Vector<String> textElNames = new Vector<>();
		Vector<Object> textElData = new Vector<>();
		String textElData1 = null;
		String textElData2 = null;
		String textElData3 = null;
		
		attributes.addAttributes(
			new AttributesImpl() {{
				setValue("text");
			}},
			1
	);
		textElNames.addAll(docEl.lookupNames());
		
		// Get the text to be added
		assertTrue("returns string value from attributes", docEl.getText().equals(text)); 
	
		// Add something else. Now textElNames contains the element
		docElText.setElementText(newElement(text));
		textElNames.addAll(docEl.lookupNames());
		
		// Get the text to be added
		assertTrue("returns text from the new node", docEl.getText().equals(newText)); 
		
		//Add attribute values
		attributes.addAttributes(
			new AttributesImpl() {{
				setValue("text");
				setValue("other value");
			}},
			2
		);
		
		// Get the text to be added
		assertTrue("returns text from attributes", docEl.getText().equals(newText2)); 
		
		// Create a new node
		Attributable newDocEl = new Element("new");
		Text newDocText2 =  new Element("text").addText(newText2).appendText(newText);
		newDocEl.setElementText(newDocText2);
		Vector<String> newDocElNames = new Vector<>();
		Vector<Object> newDocElData = new Vector<>();

		// Add text
		newDocElNames.addAll( docEl.lookupNames());
		newDocElData.addAll( docElData);
		newDocElData.addAll( textElData2);
		
		// Add element
		newDocEl.setElementText(newDocElData);
		newDocElNames.addAll( docEl.lookupNames());
		newDocElData.addAll( docElData2);
		
		// Make the element
		docEl.addNewChild(newDocElNames, newDocElData);
		
		// Check data
		assertTrue("returns string value from attributes", docEl.getText().equals(newText)); 
		assertTrue("equals() method returns false",!docEl.equals(docEl));
	}
	
	private Element newElement(String name) {
		Element newDocEl = new Element(null, name);
		return newDocEl;
	}
	
}