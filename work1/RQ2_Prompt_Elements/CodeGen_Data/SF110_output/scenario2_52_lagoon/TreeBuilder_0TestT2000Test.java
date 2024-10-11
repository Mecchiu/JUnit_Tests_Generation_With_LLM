// TreeBuilder_0Test.java
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
* It contains one unit test case for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {
// TreeBuilder.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;

/**
 * Build an XTree from a SAX2 event stream, or by parsing an XML document.
 *
 * The TreeBuilder ensures that the tree will not have two adjacent Text nodes.
 */
public class TreeBuilder implements ContentHandler, ErrorHandler {

    /**
     * Create an SAX InputSource from a File object.
     *
     * @param file the file
     * @return an InputSource
     * @throws FileNotFoundException if the file doesn't exist
     * @throws FileNotFoundException if some I/O error occurs
     */
    public static InputSource fileToInputSource(File file) throws FileNotFoundException, IOException {
        // we should use File.toURL() here, but it's Java2
        String absPath = file.getCanonicalPath().replace(File.separatorChar, '/');
        String systemId = "file:" + ((absPath.charAt(0) == '/')? "//" : "///") + absPath;
        if (!file.isFile())
            throw new FileNotFoundException(systemId);
        return new InputSource(systemId);
    }
}

// TreeBuilder_0Test.java
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
* It contains one unit test case for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {
		
	// Constructor
	// --------------------------------------------------------
	
	/**
	* Constructor.
	*/
	public TreeBuilder_0Test() {
	}
	
	// Class methods
	//-------------------------------------------------------
	
	/**
	* Test the fileToInputSource() method.
	* It contains one unit test case in which we use a SAX InputSource but the tree tree's root node.
	* Thus, the test checks the correct behaviour when building from InputSource.
	*/
	@Test
	public void testFileToInputSource(){
		// Given the name of a XML file
		String fileName = "testXML.xml";
		
		// When we build from a file
		InputSource inputSource = TreeBuilder_0Test.fileToInputSource(new File("testXML.xml"));
		
//		TreeBuilder_0Test.assertTreeHasNode(inputSource);
	}
	
	/**
	* Test the fileToInputSource() method.
	* It contains one unit test case in which we use a SAX InputSource but all the tree nodes.
	* Thus, the test checks the correct behaviour when building from inputSource.
	*/
	@Test
	public void testFileToInputSource_withTreeNodes(){
		
		// Given the name of a XML file
		String fileName = "testXML.xml";
		
		// We create an SAX InputSource that will contain only the root nodes, including the generated XML document.
		InputSource inputSource = TreeBuilder_0Test.fileToInputSource(new File(fileName));
		
		// When we build from a file
		inputSource = TreeBuilder_0Test.fileToInputSource(new File("testXML.xml"));
		
		// Then the input source must contains only the root nodes.
		assertEquals("Wrong tree number", Node.NTNodes, inputSource.getNodeType());
	}
	
	/**
	* Test the fileToInputSource() method.
	* It contains one unit test case in which we add a Text node, and all the tree nodes.
	* Thus, the test checks the correct behaviour when adding a Text node.
	*/
	@Test
	public void testFileToInputSource_withTreeNodesAndText(){
		
		// Given the name of a XML file
		String fileName = "testXML.xml";
		
		// Then the add child test is ignored.
		inputSource = TreeBuilder_0Test.fileToInputSource(new File(fileName));
		
		// When we build from a file
		String textContent = "The tree is not generated yet.";
		inputSource = TreeBuilder_0Test.fileToInputSource(new File("testXML.xml"));
		inputSource = TreeBuilder_0Test.fileToInputSource(new File("testXML.xml"));
		inputSource = TreeBuilder_0Test.fileToInputSource(new File("testXML.xml"));
		
		// Then the text node must already exist.
		String xmlStr = inputSource.getPublicId();
		assertNotNull(xmlStr);
		assertFalse(xmlStr.endsWith(textContent));
	}
	
	/**
	* Class constructor; it is a superclass of TreeBuilder.
	* It creates a new tree builder object, containing one element tree node from
	* a SAX event stream.
	* @param eventSource SAX2 event input source
	*/
	public TreeBuilder(InputSource eventSource) {
		if(eventSource == null) {
			throw new NullPointerException("SAX2 event source");
		}
		
		// the TreeBuilder object must contain one element tree
		assertEquals("Wrong number of children of the element tree", 1, this.tree.getChildCount());
	}
	
	public static String assertTreeHasNode(InputSource eventSource)
		throws IOException, ParserConfigurationException {
		
		// start a tree builder
		TreeBuilder builder = new TreeBuilder(eventSource);
		
		// verify that we have an element root node
		assertNotNull(builder.getRoot());
		
		// verify that we got back an element
		Element element = builder.getRoot().getElement();
		assertNotNull(element);
		
		// verify that name should be empty
		assertTrue("Tree node should have no name", element.getTagName().equals(""));
		
		// verify that children of root node should contain text, empty or not
		String content = eventSource.getCharacters();
		int textLen = eventSource.getPublicId().length();
		int contentLen = content.length();
		if(contentLen > textLen) {
			content = content.substring(0, textLen) + "...";
		}
		assertTrue("Text node not contained in element tree", textLen <= contentLen);
		
		// remove XML declaration
		content = content.substring(0, contentLen - contentLen.length("<!-- "));
		content = content.replaceAll("-->", "</");
		
		// return result
		return content;
	}
	
	// Class methods
	//-----------------------------------------------------------
	
	/**
	* Test getDocument() method.
	* It contains one unit test case in which we return the tree document.
	* Thus, the test checks the XML string without errors.
	*/
	@Test
	public void testGetDocument () {
			
		// When we receive the tree document
		String treeDocument = "<?xml version=\"1.0\"?>" + "<nt:nt xmlns:nt=\"http://www.kernel.org/vsn/1.4\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" version=\"3.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"nt:nt\">" + "<nt:nt:root xmlns:nt=\"http://www.kernel.org/vsn/1.4\">" + "<![CDATA[The tree is generated with the following code:" +
		"<![CDATA[--"+buildXMLString(treeDocument)+"--"+"]]]]>" + "</nt:nt:root>";
		
		// then the XML tree document should be returned
		String expected = "<?xml version=\"1.0\"?>\n" + "<nt:nt xmlns:nt=\"http://www.kernel.org/vsn/1.4\">\n" + "<![CDATA[The tree is generated with the following code:" +
		"<![CDATA[--" + buildXMLString(treeDocument) + "--" + "]]]]>\n