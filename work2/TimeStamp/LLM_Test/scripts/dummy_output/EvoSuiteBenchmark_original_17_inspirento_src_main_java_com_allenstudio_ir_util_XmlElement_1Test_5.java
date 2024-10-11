// XmlElement_1Test.java
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
* It contains one unit test case for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_1Test {
		
    /**
     * Test the first method. Tests that it returns the first element whose path equals <code>path</code> 
     * which is a single character sequence.
     *
     * @throws ElementNotFoundException if the first element not found.
     */
    @Test
	public void testGetElement_with_a_path_that_is_in_a_single_character_sequence() throws ElementNotFoundException {
        Elements elts = new Elements();
        list = new Vector();
        list.add(elts);
        pathList = new Hashtable();
        XmlElement_1Test.pathList.put('/', elts);
        pathList.put('/', elts);
        String path = "hello";
        XmlElement.getElement("/hello");
        return;
    }

    /**
     * Test the getElements method
     *
     * @throws NotAnXmlDocumentException 
     */
    @Test
	public void testGetElements() throws NotAnXmlDocumentException {
        String xml = "<?xml version=\"1.0\"?>\n"
            + "<ElementCount>1</ElementCount>\n"
            + "<Element1>\n"
            + "<Name>hello</Name>\n"
            + "</Element1>\n"
            + "<Element2></Element2>\n"
            + "<Element1>\n"
            + "<Name>world</Name>\n"
            + "</Element1>\n"
            + "</Element1>\n";
        Elements elements = new Elements(xml);
        List result = XmlElement.getElements(elements);
        return;
    }
	
	  /**
     * Unit Tests that to be sure that getElements and getElement can return the same object
     * or throw a NotAnXmlDocumentException.
     */
    @Test
	public void testGetElements_with_different_elements_of_same_path() throws NotAnXmlDocumentException {
        String xml = "<?xml version=\"1.0\"?>\n"
            + "<ElementCount>1</ElementCount>\n"
            + "<Element1>\n"
            + "<Name>hello</Name>\n"
            + "</Element1>\n"
            + "<Element2></Element2>\n"
            + "<Element1>\n"
            + "<Name>world</Name>\n"
            + "</Element1>\n"
            + "</Element1>\n";
        Object object = XmlElement.getElement(xml);
        return;
    }
    /**
     * Test the getElements method
     *
     * @throws NotAnXmlDocumentException if more than one elements not found
     */
    @Test
	public void testGetElements_with_getElements_more_than_that() throws NotAnXmlDocumentException {
        String xml = "<?xml version=\"1.0\"?>\n"
            + "<ElementCount>3</ElementCount>\n"
            + "<Element1>\n"
            + "<Name>hello</Name>\n"
            + "</Element1>\n"
            + "<Element2>1</Element2>\n"
            + "<Element1>\n"
            + "<Name>world</Name>\n"
            + "</Element1>\n"
            + "<Element3>\n"
            + "<Name1>3</Name1>\n"
            + "</Element3>\n"
            + "<Element3>\n"
            + "<Name1>4</Name1>\n"
            + "</Element3>\n"
            + "</Element1>\n";
        Elements elements = new Elements(xml);
        List result = XmlElement.getElements(elements);
        return;
    }
}


/**
 * Class of Elements. It inherits from Observable.
 *
 * @author fdietz
 */
class Elements {

    /**
     * Constructor
     *
     * @param xml the source XML
     */
    Elements(String xml) {
        setChanged();
        init(xml);
    }

    /**
     * The only constructor
     */
    private void init(String xml) {
        setElements(xml);
    }

    /**
     * Get the element that is found by the path
     *
     * @param path the path string which is a single character sequence.
     * @return the element with the path represented as a single character sequence
     */
    public Elements getElements(String path) {
        try {
            Enumeration e = getElements();
            List list = (List)e.nextElement();
            if (list.indexOf(path)!= -1) {
                return (Elements) list.get(list.indexOf(path)); 
            }
        }
        catch (NoSuchElementException nse) {
            return (null);
        }
        return (null);
    }


    /**
     * The getElements method
     *
     * @return the list of the first elements which will fit
     * with the path
     */
    public List getElements() {
        return list;
    }
    
    /**
     * Get the first element not found by the path
     *
     * @return the first element not found by the path
     */
    public Elements getFirstElements() {
        List list = init();
        return (list.get(0));
    }
    
    /**
     * Returns the last element not found by the path
     *
     * @return the last element not found by the path
     */
    public Elements getLastElements() {
      return list;
    }
}