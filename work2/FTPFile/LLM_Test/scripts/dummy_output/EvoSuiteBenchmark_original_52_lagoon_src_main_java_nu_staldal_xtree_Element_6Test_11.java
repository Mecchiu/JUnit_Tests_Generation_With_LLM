// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_6Test {
		/**
		 * Test method for {@link nu.staldal.xtree.Element#Element(java.lang.String)}.
		 */
	@org.junit.jupiter.api.Test
	void test_Constructor_1() {  
		// initialize local variables
		String name = "elem1"; //$NON-NLS-1$
		int numChildren = 2;
		Element tmp = new Element(name);
		assertNotNull(tmp);	
	}
	
	/**
	* Test method for {@link nu.staldal.xtree.Element#Element(java.lang.String)}.
	*/
	@org.junit.jupiter.api.Test
	void test_Constructor_2() {  
		// initialize local variables
		String name = "elem1"; //$NON-NLS-1$
		int numChildren = 0;
		try {
			numChildren = getNumberOfNamespaceMappings();
		}            
		catch(org.xml.sax.SAXException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}     
	    //System.out.println(getNodeAsString());
	}
	
	/**
	* Test method for {@link nu.staldal.xtree.Element#Element(java.lang.String)}.
	*/
	@org.junit.jupiter.api.Test
	void test_Constructor_3() {  
		// initialize local variables
		String name = "elem1"; //$NON-NLS-1$
		Element tmp = new Element("new_elem"); //$NON-NLS-1$
		assertNotNull(tmp);	
	}
	
	@org.junit.jupiter.api.Test
	void test_XMLName() {
		// System.out.println("*******Testing whether XMLName can be correctly retrieved.****");
	    StringBuffer result = new StringBuffer();
	    System.out.println("Getting XML Name for element (xmlns= "+NIS.XML_NAMESPACE+")");
	    // Get the XML name for the element.
	    String xmlName = getXMLName();
	    System.out.println("Get XML name for element: "+xmlName);
	    result.append(xmlName);
	    result.append(System.getProperty("line.separator"));
	    //System.out.println("Adding \""+xmlName+"\"");
	    String s =result.toString();
	    result = new StringBuffer();
	    System.out.println("Getting XML name for '"+s+"'.");
	    // Get the XML name for the '<''element''>.
	    xmlName = getXMLName(s);
	    System.out.println("Get XML name for '"+s+" / '"+xmlName+"'.");
	    result.append(xmlName);
	    result.append(System.getProperty("line.separator"));
	    s =result.toString();

	    //System.out.println("Checking if "+result+" is an XML Name");
	    assertTrue(xmlName.indexOf('_') >-1);
	}
	
	@org.junit.jupiter.api.Test
	void test_XMLNameFromString_0() {
		String xmlName = getXMLName();
		System.out.println("Get XML name from x-name: "+xmlName);
		StringBuffer sb = new StringBuffer();
		sb.append("http://").append(xmlName);
		assertFalse("xmlName is a normal XML Name! " + sb.toString().replace(',', ') + "<"+sb.toString()+"> </" + sb.toString() + "]", xmlName.equals(sb.toString()));

		System.out.println("Checking if "+xmlName+" is an URI!");
		try {
		    assertFalse("xmlName is an URI! " + sb.toString().replace(',', ') + "<"+sb.toString()+"> </" + sb.toString() + "]", xmlName.equals(getXMLUriFromString(sb.toString())));
    		}
		catch(org.xml.sax.SAXException e) {	
		    assertTrue("xmlName is not an URI! " + sb.toString().replace(',', ') + "<"+sb.toString()+"> </" + sb.toString() + "]", xmlName.equals(sb.toString()));
    		}
	}
}

/**
 * The Class Element_Test.
 *
 * @author Stefan Helfrich
 */
class Element_Test extends Element_6Test {
	
	// Get the XML Name from string
	private String getXMLName() {
		Vector namespace = NIS.getExpectedNamespaceMappings();
		String namespacePrefix = null;
		assertTrue(namespace.size()>1);
		System.out.println("namespaces["+namespace.size()+"].prefix");
		for(int ix=0; ix<namespace.size(); ix++) {
	    	String s = (String)namespace.elementAt(ix);
	    	// Namespace
	    	System.out.println("namespaces["+ix+"] = "+s);
	    	if (s.equals(getNSPrefix())) {
	    		namespacePrefix = s;
	    	}
	  }
		return getXMLName(namespacePrefix);
	}

	private String getXMLName(String namespace) {
		String name="__" + namespacePrefix + "__"+ namespace;
		return name;
	}
	
	@org.junit.jupiter.api.Test
	void test_XMLNameFromString_1() {
		System.out.println("Test: Test_XMLNameFromString_1");
		String xmlName = getXMLName();
		assertTrue("xmlName from string is not an XmlName!?" + xmlName.toString());
		try {
		// getXMLNamesFromString("my <element>text</element> </element>");
		// getXMLName("my <element>text</element></element> <!-- my comment <!-- -->");
		} catch (Exception e) {
			System.out.println("Get XML Name from null:"+e.getMessage());
		}
	}
}