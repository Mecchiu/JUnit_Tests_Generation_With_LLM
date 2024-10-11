// IFXDocumentHandlerTest.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandlerTest {

	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is null.
	*/
	@Test
	void testBuild_1() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, null, null);
		assertNotNull(doc);
		assertEquals("IFX", doc.getRootElement().getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null.
	*/
	@Test
	void testBuild_2() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is null.
	*/
	@Test
	void testBuild_3() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", null);
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is not null.
	*/
	@Test
	void testBuild_4() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is null and the namespace URI is not null.
	*/
	@Test
	void testBuild_5() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, null, "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("IFX", doc.getRootElement().getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is null.
	*/
	@Test
	void testBuild_6() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", null);
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is null and the namespace URI is null.
	*/
	@Test
	void testBuild_7() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, null, null);
		assertNotNull(doc);
		assertEquals("IFX", doc.getRootElement().getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is not null.
	*/
	@Test
	void testBuild_8() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is null and the namespace URI is not null.
	*/
	@Test
	void testBuild_9() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, null, "http://www.ifxforum.org/ifx/2.0/");
		assertNotNull(doc);
		assertEquals("IFX", doc.getRootElement().getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is null.
	*/
	@Test
	void testBuild_10() throws IFXException {
		IFXObject obj = new IFXObject();
		Document doc = IFXDocumentHandler.build(obj, "ifx", null);
		assertNotNull(doc);
		assertEquals("ifx:IFX", doc.getRootElement().getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", doc.getRootElement().getNamespaceURI());
	}
}

// IFXEncoder.java
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
 * The IFXEncoder class provides methods for encoding an IFXObject into
 * an XML Element.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.2 $
 */
public class IFXEncoder {

    private String namespacePrefix;
    private String namespaceURI;

    public IFXEncoder() {
        this.namespacePrefix = "";
        this.namespaceURI = "http://www.ifxforum.org/ifx/2.0/";
    }

    public IFXEncoder(String namespacePrefix, String namespaceURI) {
        this.namespacePrefix = namespacePrefix;
        this.namespaceURI = namespaceURI;
    }

    public Element encode(IFXObject obj) throws IFXException {
        Element element = new Element("IFX", namespacePrefix, namespaceURI);
        Map map = obj.getFieldMap();
        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            Object value = map.get(key);
            if (value instanceof IFXObject) {
                Element child = encode((IFXObject) value);
                element.addContent(child);
            } else if (value instanceof String) {
                Element child = new Element(key, namespacePrefix, namespaceURI);
                child.setText((String) value);
                element.addContent(child);
            }
        }
        return element;
    }
}

// IFXEncoderTest.java
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
* Test class of {@link IFXEncoder}.
* It contains ten unit test cases for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {
		
	/**
	* Test case for the {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the case when the namespace prefix is null.
	*/
	@Test
	void testEncode_1() throws IFXException {
		IFXObject obj = new IFXObject();
		IFXEncoder encoder = new IFXEncoder(null, null);
		Element element = encoder.encode(obj);
		assertNotNull(element);
		assertEquals("IFX", element.getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", element.getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the case when the namespace prefix is not null.
	*/
	@Test
	void testEncode_2() throws IFXException {
		IFXObject obj = new IFXObject();
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx/2.0/");
		Element element = encoder.encode(obj);
		assertNotNull(element);
		assertEquals("ifx:IFX", element.getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", element.getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is null.
	*/
	@Test
	void testEncode_3() throws IFXException {
		IFXObject obj = new IFXObject();
		IFXEncoder encoder = new IFXEncoder("ifx", null);
		Element element = encoder.encode(obj);
		assertNotNull(element);
		assertEquals("ifx:IFX", element.getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", element.getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is not null.
	*/
	@Test
	void testEncode_4() throws IFXException {
		IFXObject obj = new IFXObject();
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx/2.0/");
		Element element = encoder.encode(obj);
		assertNotNull(element);
		assertEquals("ifx:IFX", element.getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", element.getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the case when the namespace prefix is null and the namespace URI is not null.
	*/
	@Test
	void testEncode_5() throws IFXException {
		IFXObject obj = new IFXObject();
		IFXEncoder encoder = new IFXEncoder(null, "http://www.ifxforum.org/ifx/2.0/");
		Element element = encoder.encode(obj);
		assertNotNull(element);
		assertEquals("IFX", element.getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", element.getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is null.
	*/
	@Test
	void testEncode_6() throws IFXException {
		IFXObject obj = new IFXObject();
		IFXEncoder encoder = new IFXEncoder("ifx", null);
		Element element = encoder.encode(obj);
		assertNotNull(element);
		assertEquals("ifx:IFX", element.getQualifiedName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", element.getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the case when the namespace prefix is null and the namespace URI is null.
	*/
	@Test
	void testEncode_7() throws IFXException {
		IFXObject obj = new IFXObject();
		IFXEncoder encoder = new IFXEncoder(null, null);
		Element element = encoder.encode(obj);
		assertNotNull(element);
		assertEquals("IFX", element.getName());
		assertEquals("http://www.ifxforum.org/ifx/2.0/", element.getNamespaceURI());
	}
	
	/**
	* Test case for the {@link IFXEncoder#encode(IFXObject)} method.
	* It tests the case when the namespace prefix is not null and the namespace URI is not null.
	*/
	@Test
	void testEncode_8() throws IFXException {
		IFXObject obj = new IFXObject();
		IFXEncoder encoder = new IFXEncoder("ifx", "http://www.ifxforum.org/ifx/2.0/");
		Element element = encoder.en