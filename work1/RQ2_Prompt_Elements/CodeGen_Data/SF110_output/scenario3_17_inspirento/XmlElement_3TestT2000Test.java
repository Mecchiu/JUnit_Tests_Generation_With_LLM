// XmlElement_3Test.java
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
* It contains one unit test case for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_3Test {
public XmlElement _self = null;
		public int _numAttributes = 10;
		public int _numElements = 10;

		/**
		 * @return String which contains the name of the element being added
		 */
		String getElement() {
				return _self.getName();
		}

		/**
		 * @return Enumeration which contains the sub element names
		 */
		Enumeration<String> getAttributes() {
				Vector<String> names = new Vector<>();
				for (Iterator<String> i = _self.getAttributeKeys().iterator(); i.hasNext();) {
						names.add(i.next());
				}
				return names.iterator();
		}

		/**
		 * @return Enumeration for sub childrens
		 */
		Enumeration<Enumeration<String>> getElements() {
				Vector<Enumeration<String>> atts = new Vector<>();
                for (Enumeration<String> e = _self.getAttributeKeys().iterator(); e.hasMoreElements(); ) {
                        atts.add( e.next() );
                }
				return atts.iterator();
		}

		/**
		 * @return Vector of sub childrens
		 */
		Vector<Enumeration<Attribute>> getAttributeKeys() {
				Vector<Enumeration<Attribute>> keys = new Vector<>();
		        for ( Enumeration<String> e = _self.getAttributeKeys().iterator(); e.hasMoreElements(); ) {
		                Attribute a = new Attribute( e.next(), e.next());
		                keys.add( a.getKeysAndValues());
		        }
		        return keys;
		}

		String makeString() {
				return getName() + ">";
		}

}

/**
* Test class for {@link XmlElement#addSubElement(String, String)}.
// Make a "Xml element" with attributes and child elements as subelemenet.
* This class can be used as the element for both Model/View/Pipeline classes
* which use an XML element as a data source or View/Controller.
*/
public class XmlElement_4Test extends XmlElement_3Test {
	public XmlElement_4Test() {
		super.addSubElement("Test", "test");
		super.addElements("Test1", "Test2");
		super.addSubElements("TestSub1", "TestSub2");
	}
}
