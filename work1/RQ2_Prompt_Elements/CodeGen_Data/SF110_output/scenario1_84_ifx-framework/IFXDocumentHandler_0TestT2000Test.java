// IFXDocumentHandler_0Test.java
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
* It contains one unit test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_0Test {
// IFXDocumentHandler.java
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

/**
 * The IFXDocumentHandler provides methods for formatting and validating
 * IFX XML Documents.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.2 $
 */
public class IFXDocumentHandler {

    public static Document build(IFXObject obj, String namespacePrefix, String namespaceURI) throws IFXException {
        IFXEncoder encoder = null;
        if (namespaceURI!= null) {
            encoder = new IFXEncoder(namespacePrefix, namespaceURI);
        } else {
            encoder = new IFXEncoder();
        }
        Element element = encoder.encode(obj);
        Document doc = new Document(element);
        return doc;
    }
}

// IFXDocumentHandler_0Test.java
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
* It contains one unit test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_0Test {
		
	/**
	 * This is a dummy test case that simply calls build(Element, String, String) that
	 * returns a Document.
	 */
	@Test
	public void test_0() throws IOException, IllegalArgumentException {
		IFXDocumentHandler.build(Document.class, (String) null, (String) null);
		if (IFXDocumentWriter_0.IFXDOCUMENT_PREFIX.equals("doc")) {
		    fail("Should not initialize an IFXDocumentWriter while a Document is not created");
		}
	}
}

// IFXDocumentHandler.java

class IFXEncoder implements IFXObject
{
	IFXEncoder(String prefix, String uri) {
		this.prefix = prefix;
		this.uri = uri;
	}

	private String prefix;
	private String uri;

	/**
	 * @see IFXObject#toXML()
	 * @return XML representation of the object.
	 */
	public String toXML() {
		return XMLOutputter.toString(this);
	}

	/**
	 * Convert the XML representation of the object into an IFXObject.
	 * If the object has an XML representation, the corresponding IFXObject will
	 * be returned, otherwise just the string representation will be returned.
	 * @return
	 */
	public IFXObject toIFXObject() {
		SAXBuilder parser = new SAXBuilder();
		parser.setValidation(false);
		parser.build(new InputStream(IFXEncoder_0.IFXDOCUMENT_URI_1), IFXEncoder_0.IFXDOCUMENT_PREFIX_1, IFXEncoder_0.IFXDOCUMENT_URI_0);
		return parser.getDocument();
	}

	/**
	 * Convert the object into a IFXObject representation.
	 * This is not a complete test method.
	 * @return
	 */
	public IFXObject toIFXObject(Map<String, String> prefixes, Map<String, String> uriPatterns) {
		SAXBuilder parser = new SAXBuilder();
		parser.setProperty(Namespace.ALIAS_RESOLVER, IFXNAMESPACE_ALIASRESOLVER);
		parser.setProperty(IFXMarshallingUtils.PRESERVE_VALUES, "true");
		parser.setProperty(IFXMarshallingUtils.NAMESPACE_PREFIXES, prefixes);
		parser.setProperty(IFXMarshallingUtils.NAMESPACE_NAMESPACES, uriPatterns);
		Document document = parser.build(new InputStream(IFXEncoder_0.IFXDOCUMENT_URI_1), IFXEncoder_0.IFXDOCUMENT_PREFIX_1,
				IFXEncoder_0.IFXDOCUMENT_URI_0);

		Element element = document.getRootElement();
		assertNotNull(element);
		assertEquals(IFXEncoder.IFXDOCUMENT_PREFIX_0, element.getNamespaceURI().toString());
		assertEquals("ifxDocument", element.getName());
		Namespace elementNS = element.getNamespace();
		assertEquals("ifxDocument", elementNS.getURI());

		Element containerTypeElement = document.getRootElement().getChild(Namespace.DEFAULT_PREFIX, Namespace.CONTENT_MODEL);
		assertNotNull(containerTypeElement);
		assertEquals(Namespace.DEFAULT_PREFIX, containerTypeElement.getNamespaceURI().toString());
		assertEquals("containerType", XMLUtil.getChildText(containerTypeElement, Namespace.CONTENT_MODEL));
		return document.getRootElement();
	}

	@Override
	public boolean getIsCompressedOutput() {
		return true;
	}
	
	@Override
	public void unset() {
		
	}

	@Override
	public String getName() {
		return "IFXEncoder";
	}

	private final String prefix;
	private final String uri;
	
	private IFXEncoder(String prefix, String uri) {
		this.prefix = prefix;
		this.uri = uri;
	}
}

// IFilterDocumentHandler.java

