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
* It contains one unit test case for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandler_2Test {

	/**
	 * Test method for
	 * {@link org.sourceforge.ifx.utils.IFXDocumentHandler#build(org.jdom.Document, java.lang.String, java.lang.String)}.
	 * Check that the result of the build process properly handles ifXNm.
	 * @see org.jdom.Element#getQName()
	 */
    @Test
    public void testBuild() {

		Document doc = null;
		Element root = null;
		try {
			doc = build(null, null, null);
		} catch (Throwable t) {
			t.printStackTrace();
			assertTrue(t instanceof IOException);
		}
		

        root = doc.getRootElement();
        assertNotNull(root);
	}

	

    
}


