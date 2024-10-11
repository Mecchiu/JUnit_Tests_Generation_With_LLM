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
		
    // constructor
    public XmlElement_2Test() {
    }
    
    /**
     * Test of the addSubElement method, of class XmlElement.
     */
	@Test
    public void testAddSubElement() {
        Vector<String> path = new Vector<String>(0, 1);

        //
        // Adding sub Element
        //
        XmlElement sub = new XmlElement("foo", null, null);
        sub.addSubElement("s");

        //
        // Get Sub elements at different paths
        //
        for (Enumeration enm = path.elements(); enm.hasMoreElements();) {
            String pathName = (String)enm.nextElement();
            List<String> s = new Vector<String>();

            //pathName is the path
            //pathName.getName() can be empty string if the path does
            //not contain a dot but the first element is mandatory
            String sPathname = pathName.substring(0, pathName.length() - 1);

            //create a list of children
            Enumeration sEnu = sub.getSubElements(sPathname);

            assertTrue(sEnu.hasMoreElements());
            assertTrue(sEnu.hasMoreElements());

            //iterate over list
            while (sEnu.hasMoreElements()) {

                // get list of child
                s = (List<String>)sEnu.nextElement();

                // get next child from new child list
                Iterator it = s.iterator();

                // add it to path
                it = s.iterator();

                // create a new element which equals s

                String sChild = (String)it.next();

                // test addElement method
                XmlElement.addSubElement(sub, pathName, sChild);

                // check a child exists
                assertNotNull(path.elementAt(path.size() - 1));

            }

            if (pathName.endsWith(".")) {
                // not added in this test case
                // so only one child
                break;
            }
            else {
                // it added in this test case
                // so the same size child element in path
                assertFalse(path.contains("."));
            }
        } // end of for enm:
        // get a vector and check length
        assertEquals(1, path.size());

        // remove last item
        path.remove(path.size() - 1);

        // check item in path is element
        assertTrue(path.contains("foo"));

    } // ends of test addSubElement()

    /**
     * Test of the addSubElement method, of class XmlElement.
     */
	@Test
    public void testAddSubElementWithPath2() {
        Vector<String> path = new Vector<String>(0, 1);
        path.addElement("foo");

        // add subElement
        XmlElement.addSubElement(path.elementAt(path.size() - 1), path);

        // check if size is correct
        assertEquals(2, path.size());

        List<String> list = new Vector<String>();
        list.addElement("b");
        assertTrue(XmlElement.addSubElement(path, path.elementAt(path.size() - 1), list));

        Hashtable parent;

        // test a parent that is also an element
        parent = new Hashtable();
        parent.put(path.elementAt(path.size() - 1), "e");

        XmlElement result;

        // test method is not added
}
}