// XmlElement_2Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addSubElement(String)} method.
*/
class XmlElement_2Test {
// XmlElement.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;

/**
 * The XmlElement is a generic containment class for elements within an XML
 * file.
 * <p>
 *
 * It extends Observable which should be used for gui elements which are
 * interested in configuration changes.
 * <p>
 *
 * Show interested in:
 *
 * <pre>
 * xmlElement.addObserver(yourObserver);
 * </pre>
 *
 * <p>
 * When making bigger changes on XmlElement and probably its subnodes and/or a
 * greater number of attributes at once, you should just change XmlElement
 * directly and manually notify the Observers by calling:
 * <p>
 *
 * <pre>
 * xmlElement.setChanged();
 * xmlElement.notifyObservers();
 * </pre>
 *
 * <p>
 * There a good introduction for the Observable/Observer pattern in
 * Model/View/Controller based applications at www.javaworld.com: -
 * {@link http://www.javaworld.com/javaworld/jw-10-1996/jw-10-howto.html}
 *
 * @author fdietz
 */
public class XmlElement extends Observable implements Cloneable {

    /**
     * Adds a sub element to this one. The path
     * is separated with dots(".").
     *
     * @return the <code>XmlElement</code> added
     * @param path The subpath of the sub element to add
     */
    public XmlElement addSubElement(String path) {
        XmlElement parent = this;
        XmlElement child;
        String name;
        while (path.indexOf('.')!= -1) {
            name = path.substring(0, path.indexOf('.'));
            path = path.substring(path.indexOf('.') + 1);
            // if path startsWith "/" -> skip
            if (name.length() == 0)
                continue;
            if (parent.getElement(name)!= null) {
                parent = parent.getElement(name);
            } else {
                child = new XmlElement(name);
                parent.addElement(child);
                parent = child;
            }
        }
        child = new XmlElement(path);
        parent.addElement(child);
        return child;
    }
}

// XmlElement_2Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addSubElement(String)} method.
*/
class XmlElement_2Test {
		private final static String PARENT_DOCUMENT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
		 + "<a href=\"/xml/1.0\" target=\"_blank\">\n"
		 +            "\t<tag>\n"
		 +            "<sub>Test</sub>\n" +               "\t</tag>\n"
		 + "</a>"
		;
		private final static int PARENT_DOCUMENT_MAX_LEN = 500;
		private final static String PARENT_CHILD_DOCUMENT = "";
		private final static String PARENT_CHILD_CHILD_DOCUMENT = "*";

		private final static String CHILD_DOCUMENT = "<A ID=\"1\" href=\"/xml/1.0\" target=\"_blank\">\n"
				+            "\t<tag>\ncurrent child: <sub>Test</sub></tag>\n"
				+ "</A>";

	@Test
	public void testAddSubElement_01() throws Throwable {
	        String path = PARENT_CHILD_DOCUMENT;
		this.addSubElement(path);
	}

	@Test
	public void testAddSubElement_02() throws Throwable {
		assertNotNull("The document shouldn't be <null>.", PARENT_CHILD_DOCUMENT);
		String path = PARENT_CHILD_DOCUMENT;
		XmlElement.addSubElement(path);
	}

	@Test
	public void testAddSubElement_03() throws Throwable {
		this.addSubElement(PARENT_CHILD_DOCUMENT);
	}
}
// XmlElement_2Test.java