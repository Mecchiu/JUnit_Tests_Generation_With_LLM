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
		 * Constructor for {@link XmlElement}.<br>
		 * <b>Note:</b><br>
		 * If this method returns a new instance,
		 * your test class has to clone
		 * the instance.
		 *
		 * @return the generated instance
		 */
    public XmlElement_1Test() {
	super();
    }

    @Test
    public void test1() {
	String xpath = "./item[contains(@title, 'test')]";
        System.out.println(xpath);
        XmlElement element = new XmlElement_1Test();
        Hashtable hash = new Hashtable();
	Vector v = new Vector();
	v = element.findelements(xpath);
        assertEquals("length",1,v.size());
        xpath = "./parent/item[(@attr1)='1']";
	hash = element.findelements(xpath);
        assertEquals("length",1,hash.size());

	element = new XmlElement_1Test();
	v = element.findelements(xpath);
	Enumeration keys = v.elements();
	assertTrue("Enumeration is not empty",keys.hasMoreElements());
	assertEquals("next element",v.elementAt(0),keys.nextElement());
        assertEquals("next element",hash.elementAt(0),keys.nextElement());

	XmlElement_1Test e = (XmlElement_1Test)element.clone();
	XmlElement_1Test newE = (XmlElement_1Test)e.clone();
	assertNotSame("Clone failed",e,newE);
	assertEquals("length",1,hash.size());
	assertTrue("Not equal",hash.keyAt(0)==1);
        xpath = "//*[@attr1='1']";
	hash = element.findelements(xpath);
	assertEquals("length",1,hash.size());

	element = new XmlElement_1Test();
	v = element.findelements(xpath);
	keys = v.elements();
	assertTrue("Enumeration is not empty",keys.hasMoreElements());
	assertEquals("next element",v.elementAt(0),keys.nextElement());
	hash = element.findelements(xpath);
	assertEquals("length",1,hash.size());
        System.out.println(element.hashtable());
        System.out.println(hash.size());
    }









}