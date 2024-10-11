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
	* It tests the case when the {@code obj} parameter is {@code null}.
	* Expected result: {@code IllegalArgumentException} is thrown.
	*/
	@Test
	void testBuild_objIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			IFXDocumentHandler.build(null, "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code namespacePrefix} parameter is {@code null}.
	* Expected result: {@code IllegalArgumentException} is thrown.
	*/
	@Test
	void testBuild_namespacePrefixIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), null, "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code namespaceURI} parameter is {@code null}.
	* Expected result: {@code IllegalArgumentException} is thrown.
	*/
	@Test
	void testBuild_namespaceURIIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", null);
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespacePrefixIsEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespaceURIIsEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespacePrefixIsEmpty_namespaceURIIsEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespacePrefixIsNotEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "prefix", "");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespaceURIIsNotEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "", "uri");
		});
	}
	
	/**
	* Test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* It tests the case when the {@code obj} parameter is an instance of {@code IFXObject} class.
	* Expected result: {@code IFXException} is thrown.
	*/
	@Test
	void testBuild_objIsIFXObject_namespacePrefixIsNotEmpty_namespaceURIIsNotEmpty() {
		assertThrows(IFXException.class, () -> {
			IFXDocumentHandler.build(new IFXObject(), "prefix", "uri");
		});
	}
}

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

    /**
     * Builds a JDOM Document object from an IFXObject.
     *
     * @param obj the IFXObject object to format.
     * @param namespacePrefix the namespace prefix to use in the output. A
     * value of null implies no prefix. If the namespaceURI is specified it
     * will be treated as the default namespace.
     * @param namespaceURI the namespace URI to use in the output. If specified
     * an xmlns declaration will be prepended to the output.
     * @return a JDOM Document object.
     * @exception IFXException if there was a problem building the document.
     */
    public static Document build(IFXObject obj, String namespacePrefix, String namespaceURI) throws IFXException {
        if (obj == null) {
            throw new IllegalArgumentException("obj cannot be null.");
        }
        if (namespacePrefix == null) {
            throw new IllegalArgumentException("namespacePrefix cannot be null.");
        }
        if (namespaceURI == null) {
            throw new IllegalArgumentException("namespaceURI cannot be null.");
        }
        if (obj instanceof IFXObject) {
            throw new IFXException("Cannot build a document from an IFXObject.");
        }
        Element root = new Element(obj.getObjectName());
        if (namespacePrefix.length() > 0) {
            root.setNamespace(Namespace.getNamespace(namespacePrefix, namespace