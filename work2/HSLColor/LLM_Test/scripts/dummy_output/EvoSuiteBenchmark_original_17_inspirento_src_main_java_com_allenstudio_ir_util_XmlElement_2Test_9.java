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
		public XmlElement a;
			/**
			* Add the <code>XmlElement</code> to the <code>XmlElement</code>
			* from file <code>test</code>.
			* <p/>
			*
			* @throws Exception
			*/
		@Test
		public void test1 () throws Exception {
				this.a = new XmlElement("test");
				testObject("test");
		}
		
}

public class XmlElement_5Test {
	
	/**
	* Add test case for {@link XmlElement#addSubElement(String)},
	* {@link XmlElement#addSubElement(String, int)}, {@link XmlElement#addSubElement(String,
	* Vector)}, {@link XmlElement#addSubElement(String, Hashtable)}, {@link XmlElement#addSubElement(
	* String, List)}, {@link XmlElement#addSubElement(String, Vector)}, {@link XmlElement#
	* addSubElement(Vector)}
	*/
	@Test
	public void test2() throws Exception {
		System.out.println("add subelement test");
		XmlElement x = new XmlElement("test");
        x.addSubElement("x");
        System.out.println(x.getPath());
		x = new XmlElement("test");
        x.addSubElement("x");
        System.out.println(x.getPath());
	}
	
}