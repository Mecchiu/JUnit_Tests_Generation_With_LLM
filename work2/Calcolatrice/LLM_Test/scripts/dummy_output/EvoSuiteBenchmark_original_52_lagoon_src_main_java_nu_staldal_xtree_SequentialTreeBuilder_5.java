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
    public void parseXMLSimple() throws Exception {
        SequentialTreeBuilder builder = SequentialTreeBuilder.create(null);
        InputStream is = SequentialTreeBuilderTest.class.getResourceAsStream("/simple.xml");
        assertNotNull(is);
        Element element = builder.parse(is);
        assertNotNull("tree with non-dTD root element", element);
    }
    
    @Test
    public void parseXMLWithEmptyXMLDocument() throws Exception {
        SequentialTreeBuilder builder = SequentialTreeBuilder.create(null);
        InputStream is = SequentialTreeBuilderTest.class.getResourceAsStream("/empty_xml_document.xml");
        assertNotNull(is);
        Element element = builder.parse(is);
        assertNull("tree with empty XML document", element);
    }
	
    @Test
    public void parseXMLWithoutParseError() throws Exception {
        URL resourceURL = SequentialTreeBuilderTest.class.getResource("/without_error.xml");
		assertNotNull(resourceURL);
		InputStream is = new FileInputStream(resourceURL.getFile());
		assertNotNull("resource file is empty", is);
		SequentialTreeBuilder builder = SequentialTreeBuilder.create(is);
		assertNotNull("No error report", builder.getErrorReport());
		
        String message = builder.getErrorReport().getMessage();
        assertEquals("XTree XML report is empty",
                     "(no XML report present)",
                     message);
        
        Map<String, Object> results = builder.getElementResults();
        assertEquals("XTree Element report is empty (result map)",
                     0,
                     results.size());

        // validate the DOM tree to make sure the element results are correct
        Element expectedElement = XMLUtils.findOrCreateElement(builder, "e1");
        validateTree(expectedElement, results);
    }
	
	private void validateTree(Element element, Map<String, Object> results) {
		assertNotNull("No results for element:", results);
		List<Element> resultsList = (List<Element>)results.get("result");
		if (resultsList == null)
			resultsList = new ArrayList<Element>();
		resultsList.add(element);
		StringBuilder builder = new StringBuilder();
		builder.append("\nbrief info: ");
		if (!results.get("brief").equals(""))
			builder.append(results.get("brief"));
		else
			builder.append("ERROR");
		builder.append("; results: ");
		builder.append(resultsList);
		if (!results.get("error").equals(""))
			builder.append(results.get("error"));
		else
			builder.append("DTD error: ");
		if (!results.get("error_text").equals(""))
			builder.append(results.get("error_text"));
		else
			builder.append("ERROR"); 
		ValidateErrorTreeUtils.validateTree(builder.toString(), results);
	}
	
}