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
		@Test
		public void test() throws IOException, SAXException, XMLReadException {
			//test the parsing
			File file = new File(this.getClass().getResource("TreeBuilder_1Test.xml").toURI());
			System.out.println("Read file : " + file);
			StreamSource xmlRoot =  new StreamSource(new FileInputStream(file));
			Element e = null;
			try {
				e = parseXML(xmlRoot, true);
			} catch (SAXParseException | SAXException | IOException | XMLReadException | XMLSyntaxException | NullPointerException ex) {
				throw new RuntimeException("XDOM Parsing error : " + ex.getMessage() + "\nLine " + ex.getLineNumber());
			}
			assertNotNull(e);
			assertNotNull(e.getChildNodes());
			List<Token> tokens = getTokenList();
			Iterator<Token> it = tokens.iterator();
			it.next();
			it.next();
			it.remove();
			assertTrue(it.hasNext());
			assertEquals(e.getAttribute(new QName("xml:root")), e.getFirstChild().getNextSibling().getText());
			LinkedList<Token> n = new LinkedList<Token>();
			it = tokens.iterator();
			n.addFirst(it.next());
			it.next();
			LinkedList<Token> z = (LinkedList<Token>) n.clone();
			assertEquals(z.size(), n.size());
			it--;
			LinkList<Token> j = (LinkList<Token>) it.next();
			assertEquals(j.getFirstChild(), z.get(0));
			LinkedList<Token> k = (LinkedList<Token>) it.next();
			LinkedList<Token> s = (LinkedList<Token>) k.clone();
			LinkedList<Token> e = null;
			for (int i = 0; i < s.size(); i++) {
				e = (LinkedList<Token>) s.get(i);
			}
			assertEquals(k.getFirstChild(), e.getFirstChild());
			assertEquals(hierarchyNode(j.getFirstChild().getNextSibling().getNextSibling().getNextSibling()), HierarchyNode.SEARCH_NODE);
			assertEquals(hierarchyNode(e.getFirstChild()), HierarchyNode.SEARCH_NODE);
		}
}