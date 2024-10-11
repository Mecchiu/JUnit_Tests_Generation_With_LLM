// XTreeUtil_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtil_1Test {
		private static final ContentHandler CH = ContentHandlerFixer.fix("<a><b/><c/><d/><e/><f/><g/><h/>");
		private static final String CONTENT1 = "<?xml version=\"1.0\"?><a><b><c /></b><d>";
		private static final String CONTENT2 = "<?xml version=\"1.0\"?>\n<a><b><c /></b></a>\n";
		public String data = "<b>\n1\n<b/>\n</b>\n";

	public XTreeUtil_1Test() throws Exception {
	}

	@Test
	public void testParseXMLSequential() throws SAXException, IOException, IOException {
		String schemaType = null;
		String schema = null;
		InputSource input1 = null;
		String result = "";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;

		ContentHandlerCH.addHandler(new DocumentHandler() {
			public void startElement(Element e, Attributes atts) throws SAXException {
				result += e.toString();
			}
		});
		if (schemaType!= null) {
			Iterator it = XTreeUtil.SCHEMA_TYPES.keySet().iterator();
			while (it.hasNext()) {
				String schemaTypeName = it.next();
				if (schemaTypeName.indexOf("xsd:")!= -1) {
					schemaType = schemaTypeName;
				}
				if (schemaTypeName.equals("http://www.ics.uci.edu/xfire/xml")) {
					XTreeUtil.SCHEMA_TYPES.put(schemaTypeName, schemaType);
				}

			}
		}

		factory.setLocation(System.getProperty("test.base"));
		builder = factory.newDocumentBuilder();
		input1 = new InputSource(new StringReader(data));
		Document doc = builder.parse(input1);

		XTreeUtil.parseXMLSequential(input1, true, schemaType, schema, CH);

		System.err.println(result);
	}
}