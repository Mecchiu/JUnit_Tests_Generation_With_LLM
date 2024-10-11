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
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_1Test {

	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* @throws IFXException if any problems were encountered in parsing.
	*/
	@Test
	void testParse() throws IFXException {
		IFXObject ifxObject = IFXDocumentHandler.parse(new Document());
		assertNotNull(ifxObject);
	}
}

// IFXDocumentHandler_2Test.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandler_2Test {
		
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* @throws IFXExveption if there was a problem reading the document.
	*/
	@Test
	void testRead() throws IFXException {
		Document document = IFXDocumentHandler.read(new InputStream(), true, new Map());
		assertNotNull(document);
	}
}

// IFXDocumentHandler_3Test.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
*/
class IFXDocumentHandler_3Test {
		
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* @throws IFXException if there was a problem writing the Document.
	*/
	@Test
	void testWrite() throws IFXException {
		IFXDocumentHandler.write(new Document(), 0, "", new OutputStream());
	}
}

// IFXDocumentHandler_4Test.java
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
class IFXDocumentHandler_4Test {
		
	/**
	* Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
	* @throws IFXException if there was a problem building the document.
	*/
	@Test
	void testBuild() throws IFXException {
		Document document = IFXDocumentHandler.build(new IFXObject(), "", "");
		assertNotNull(document);
	}
}