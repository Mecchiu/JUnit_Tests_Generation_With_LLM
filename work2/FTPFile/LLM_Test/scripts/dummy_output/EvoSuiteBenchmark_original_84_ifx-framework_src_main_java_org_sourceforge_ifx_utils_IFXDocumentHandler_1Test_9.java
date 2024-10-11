// IFXDocumentHandler_1Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains one unit test case for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_1Test {
		public IFXObject parse(Document doc) throws IFXException {
			IFXObject obj = new IFXObject();
			try {
				parse(doc, obj);
			} catch (IFXException e) {
				obj.setIFXException(e);
			}
			return obj;
		}

		public void parse(Document doc, IFXObject obj) throws IFXException {
			XMLCleanerImpl c = new XMLCleanerImpl(false);
			XMLOutputter o = new XMLOutputter();
			System.out.println("-- Parsing --");
			o.setFormat(XMLOutputter.FORMAT_LEFT_TEXT);
			obj.setIFXObject(doc);
			System.out.println("<" + document.getDocType() + ">");
			o.output(doc, System.out);
			o.output(doc.getRootElement(), System.out);
			o.output(doc.getRootElement().getDeclaredNamespaces(), System.out);
			System.out.println("<" + document.getDocType() + "/>" +
					"<" + document.getRootElement().getName() + " " +
					"xmlns=" + document.getRootElement().getNamespace() + ">" +
					c.clean(doc) + "</" + document.getRootElement().getName() + ">");
			c.close();
		}

		public Document parse(InputStream istream, Object obj) throws IFXException {
			Element doc;
			try {
				SAXBuilder builder = new SAXBuilder();
				doc = builder.build(istream);

				IFXObject result = parse(doc);
				return result.getIFXObject();
			} catch (IOException e) {
				throw new IFXException(e);
			}
		}

		public void parse(InputStream istream, Object obj, Map validationProperties) throws IFXException {
			Document doc = parse(istream, false, validationProperties);
			IFXObject result = parse(doc, obj);
			assertTrue(result.getIFXObject().getName().startsWith("IFXDocumentHandler_"));
		}
}