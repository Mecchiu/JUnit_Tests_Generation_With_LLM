// DefaultFSPathTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import net.sf.sugar.fspath.xpath.RegexFunctionResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultFSPath}.
* It contains one unit test case for the {@link DefaultFSPath#query(String)} method.
*/
class DefaultFSPathTest {
/**
		* Instance of Class to test.
		*/ 
		private DefaultFSPath defaultFS;


// Instance of class to test.
	/** Constructor that instantiates a default FSPath that will
	 *  execute an XPath expression based on the input String for that
	 *  FSPath instance.
	 */ public DefaultFSPathTest() {
		defaultFS = new DefaultFSPath();
	}
	
	/**
	 * Test for the query method.
	 * 
	 * @throws IOException  If the test fails
	 * @throws ParseException If the test fails
	 */
	@Test
	public void testQuery() throws IOException, ParseException {
		// String to use
		final String input = "/home";

		// This file will be modified only if test fails
		final File testFile = new File("testFile");
		
		// Create a XML document
		final Document testDoc = createDocument("testFile/testFile.xml");

		// Set XPath to evaluate the document 
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xp = xpf.newXPath(); // XPath instance which will be used 

		// Query the document using XPath
		XPathExpression xpce = xp.compile("//text()");
		NodeList nodeset = (NodeList) xpce.evaluate(testDoc, XPathConstants.NODESET);
		
		// Build a variable map to use for the XPath expressions.
		Map map = new HashMap();

		// Loop over this document node set and test for each XPath expression
		for (int i = 0; i < nodeset.getLength(); i++) {
			
			// Get element text
            String text = nodeset.item(i).getTextContent();
			TextResult textResult = testDoc.createTextNode(text); 
			
			// Build our XPath expression for this element.
			XPathExpression xre = xp.compile("/");
			NodeResult node = xre.evaluate(testDoc, XPathConstants.NODE); //This nodeResult is a Node object returned in the NodeResult object of xres.
			Node nodeResult = node;
			

		    // Execute the XPath expression using this XPathResult object.
			NodeList childResults = (NodeList) xre.evaluate(nodeResult, XPathConstants.NODESET);
					
			// First thing we need to check is that there are no child node results
			if(childResults!=null && childResults.getLength() > 0) {
				
				String nodeName = null;
				
				Node currentNode = null;
	            // Loop over the child node objects
				for(int j=0;j<childResults.getLength();j++) {
					
					currentNode = childResults.item(j);

					switch(currentNode.getNodeType()) {
						case Node.ELEMENT_NODE :
							{
								String nodeName = currentNode.getNodeName();
								NodeValue nodeValue = (NodeValue)currentNode;
								String nodeValueText = nodeValue.getNodeValueAsText();
	                       if(nodeValueText.length()>0) {
	         						String nodeValueId = null;
	           					String nodeValueType = null;
	           					try{
	           						nodeValueId = nodeValue.getNodeValueId();
	           					}
	           					catch(NullPointerException n){

						             // If the nodeValueId is null return the defaultFSPathResult value rather than
						             // returning null as there is no defaultFSPathResult value
							             return defaultFS.query(input, map);
						           }

	           					String result = defaultFS.query(input, map); //This is the XPath variable map to check results by name

	           					assertNull("Expected Null for nodeResult.getNodeName() but got node: " + nodeName + " with value: " + result,nodeName);

	           					if(result.equals("true") || result.equals(nodeValue.getNodeValueAsText())) {
	             						if(nodeValueId.equals("String") && nodeValue.getNodeValueAsText().length()>