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
		XmlElement_1Test t1;
		/**
		* Creates a new instance of XmlElement test with a simple attribute
		* name, "path".
		*/
		public XmlElement_1Test() {
			super();
		}

		/**
		* Creates a new instance of XmlElement test with a simple attribute
		* name, "path".
		*
		* @param path attribute name
		*/
		public XmlElement_1Test(String path) {
			super(path);
		}

		/**
		* Creates a new instance of XmlElement test with the supplied
		* additional attribute name, "path".
		*
		* @param path
		* @param value attribute value
		*/
		public XmlElement_1Test(String path, String value) {
			super(path, value);
		}

		/**
		* Create a Hashtable with elements as key and the given
		* path as value.
		*
		* @param attributes element to store in the Hashtable
		*/
		public void initialize(Hashtable<String, String> attributes) {
			super.clear();
			Iterator it = attributes.keys().iterator();
			while (it.hasNext()) {
				String key= (String) it.next();
				String value=(String)attributes.get(key);
				this.addChildElement(new XmlElement(key, value));
			}
		}

		/**
		* Creates a vector of the contained elements with the given
		* path.
		*
		* @param path the path of the subelements
		* @return the vector of subelements
		*/
		public Vector makeChildElements(String path) {
			Vector<XmlElement> e1= new Vector<XmlElement>();	
			Enumeration en = this.elements();
			while (en.hasMoreElements()) {
				XmlElement child = (XmlElement) en.nextElement();
				if (!child.equals(path)) {
					en.removeElement();				
					e1.addElement(child);
				}
			}
			return e1.elements();
		}

		/**
		* Load a Vector with the children of the elements of the Vector
		* with the given path.
		*
		* @param path the path of the subelements
		* @return the Vector of subelements
		*/
		public Vector loadChildElements(String path) {
			Vector tmp= new Vector();
			Iterator it = (Vector) this.elements();
			while (it.hasMoreElements()) {
				XmlElement child = (XmlElement) it.nextElement();
				if (child.equals(path)) {
					tmp.addElement(child);
				}
			}
			return tmp;
		}

		/**
		* Adds a new vector of elements to this one and starts it.
		*
		* @param vec the new vector to add
		*/
		public void addChildElements(Vector vec) {
			Vector tmp= new Vector();
			if (vec.size() == 0) {
				return;
			}
			Iterator it = vec.iterator();
			while (it.hasNext()) {
				XmlElement child = (XmlElement) it.next();
				if (child.element() == 0) {
					tmp.addElement(child);
				}
			}
			elements().addElement(tmp);
		}

		/**
		* Checks if a Vector with this Vector as sub element contains
		* an element with the given path.
		*
		* @param path the path to check the sub element
		* @return true if does contains, false if does not
		*/
		public boolean containsElement(String path) {
			Vector temp= new Vector();
			if (path.equals("")) {
				return temp.size() > 0;
			}
			Enumeration en= this.elements();
			while (en.hasMoreElements()) {
				temp.add(en.nextElement());
			}
			Enumeration it = temp.elements();
			while (it.hasMoreElements()) {
				XmlElement child = (XmlElement) it.nextElement();
				if (!child.equals(path)) {
					return false;
				}
			}
			return true;
		}
}