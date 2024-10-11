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
		* Test for parsing a file containing a sequence of XML documents.
		* The test creates a new XML document at the same location and sets the elementHandler for later operations.
		* Since the document are in an array, the whole test fails - since the elements have not been seen before.
		*/
	@org.junit.jupiter.api.Test
    void test() throws Exception {
        // generate some XML documents.
        Random r = new Random();
		int l = 250;
		byte[] bytes = new byte[l*1024];
		for ( int i=0 ; i<l; i++ ) {
			int len = Math.abs(r.nextInt());
			bytes[i*1024+ r.nextInt() ] = (byte)( len&0xff );
			len = Math.abs(r.nextInt());
			bytes[i*1024+( r.nextInt()>>>4)+r.nextInt() ] = (byte)( len&0xff );
			len = Math.abs(r.nextInt());
			bytes[i*1024+ r.nextInt()+( r.nextInt()>>>4)] = (byte)( len&0xff );
		}

		// create the document and handler class
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		URI uriSrc = java.net.URL.class.getProtectionDomain().getCodeSource().getLocation().toURI();
		System.out.println("uri in " + uriSrc);
		DocumentBuilder builderSrc = null;
		DocumentBuilderParams paramsSrc = DocumentBuilderParams.create();
		String xml = new String(bytes);
		System.out.println("content of original document " + xml);
		builderSrc = docFactory.newDocumentBuilder();
		DocumentBuilderParams paramSrc = DocumentBuilderParams.create(builderSrc);
		xmlSrcDocument = builderSrc.newDocument();
		xmlSrcDocument.adoptNode( xmlSrcDocument.getDocumentElement() );
		// check the handler
		System.out.println("Checking a node for more information");
		SequentialTreeBuilder treeBuilder = new SequentialTreeBuilder( xml, null, System.out);

		// check a node and its children
		TreeNode node = treeBuilder.parseXMLSequential(uriSrc, true, nodeHandler);

		// check the count
		System.out.println("Checking node" + nf.saxToString((node)));
		assertEquals(l, treeBuilder.getNodeCount(node));

		// check for the same elements
		// check children, their nodes, children, etc.
		Iterator iter = treeBuilder.iterator(node, null, false);
		int i=0;
		while ( iter.hasNext() ) {
			i++;
			System.out.println("Adding this element: "+node.getAttributes().getNamedItem("uri").getNodeValue()+" "+node.getAttributes().getNamedItem("type").getNodeValue()+" "+node.getAttributes().getNamedItem("count").getNodeValue()+" "+node.getChildNodes().item(0).getAttributes().getNamedItem("uri").getNodeValue()+" "+node.getChildNodes().item(0).getAttributes().getNamedItem("type").getNodeValue()+" "+node.getChildNodes().item(0).getAttributes().getNamedItem("count").getNodeValue()+" "+node.getChildNodes().item(0).getAttributes().getNamedItem("type").getNodeValue()+" "+i);
			treeBuilder.parseXMLSequential(uriSrc, true, treeBuilder.nodeHandler(i, node, 2, paramsSrc));
		}

	}

    private static final String nf = "\n";

    private static final String nodeHandler = "node_handler";

    /**
     * The {@link ElementHandler} implementation.
     */
	private static class nodeHandler implements ElementHandler {
		/** The count of nodes.
		 */
		int count;

		/** Create a new instance.
		 * @see ElementHandler#handleElement(int, java.lang.String)
		 */
		public void handleElement(int index, String uri) {
			count++;
		}

		/** Set the count.
		 * @see ElementHandler#handleError(java.lang.String)
		 */
		public void handleError(String uri) {
			count--;
		}
	}

	/**
	 * XML serialization to string, without parsing this tree.
	 * @param outStream the stream to write to
	 * @param encoding the encoding of the output stream
	 * @param prefix the prefix of the XML to parse
	 * @return the output from the stream
	 * @throws IOException if there was an I/O problem writing the stream
	 */
	public static String serializeToStringNoParsing(OutputStream outStream, Charset encoding, String prefix) throws IOException {
		JAXBContext context = JAXBContext.newInstance(Tree.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		String outString = prefix + xmlSrcDocument.getDocumentElement();
		Document root = xmlSrcDocument.getDocumentElement();
		// generate the XML (without parsing)
		ElementSerializer elSerializer = new ElementSerializer();
		elSerializer.write(unmarshaller.createUnmarshaller(context).unmarshal(new DOMSource(root)), outString, encoding);
		outString += nf;

		return outString;

	}

}
