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
		/**
		 * Test suite method for SAX2 parser.
		 * Uses JAXP to find a parser.
		 */
		@Test
	    public void testParseXMLSequential() throws Exception {
	    	String xml = "<root>1 <child1>1</child1></root>";
			SequentialTreeBuilder sequ = new SequentialTreeBuilder();
			List eList = new ArrayList();
			eList.addAll(sequ.buildFromXMLSequential(new StringReader(xml), true, null));	// Uses JAXP parser to find Xtree::Parser
			return;
	    }

	    /**
	     * Test suite method for JAXP parser.
	     * Uses the DTD generated content stream to find DTD for the parser.
	     */
		@Test
	    public void testParseXMLDTD() throws Exception {
	    	String dtdFile = "src/test/resources/dtd/mf.dtd";
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setValidating(false);
			SAXParser xmlParser = factory.newSAXParser();
			Reader reader = new FileReader(dtdFile);		// Uses DTD content stream to find DTD for parser
			StreamSource sSource = new StreamSource(reader, null);		// Uses SAX2 content stream to find XML content
			DocumentBuilder builder = xmlParser.getBuilder();		// Uses DTD content stream to find DTD for parser
			InputSource source = new InputSource(reader, reader);		// Uses SAX2 content stream to find XML content
			tree = (DefaultTreeModel) builder.newTreeModel(sSource);// Use tree to build a tree
			List eList = new ArrayList();
			List eListChild = new ArrayList();
			eListChild.add(new DefaultMutableTreeNode(new DefaultMutableTreeNode("Node1"))); // Using an empty node to build a tree
			eList.add(eListChild);		// Using an empty node to build a tree
			eList.add(new DefaultMutableTreeNode(new DefaultMutableTreeNode("Node1"))); // Using an empty node to build a tree
			eList.add(new DefaultMutableTreeNode(new DefaultMutableTreeNode("Child1")));	// Using an empty node to build a tree
			eList.add(eListChild);	// Using an empty node to build a tree
			eList.add(new DefaultMutableTreeNode(new DefaultMutableTreeNode("Node2"))); // Using an empty node to build a tree
			eList.add(new DefaultMutableTreeNode(new DefaultMutableTreeNode("Node2"))); // Using an empty node to build a tree
			tree.insertNodeInto(eList, eList.get(0), 0);	// Inserts an empty tree in the list.
			List result = sequ.buildFromXMLDTD(new InputSource(dtdFile), false, null);

	    	assertTrue(eList!= result);
	    	int num = 0;
	    	for (Iterator it = result.iterator() ; it.hasNext() ;) {
			    DefaultMutableTreeNode node = (DefaultMutableTreeNode) it.next();
			    assertTrue(node!= null);
			    assertTrue(node!= eList.get(num));
			    assertEquals("Parent of first Element must be the root", 0, node.getParent().getIndex());
			    if (num < result.size()) { // We don't need to find the next one with a specific value.
			    	assertTrue(node!= result.get(num));
			    	num++;
			    }
		    }
	    }
}