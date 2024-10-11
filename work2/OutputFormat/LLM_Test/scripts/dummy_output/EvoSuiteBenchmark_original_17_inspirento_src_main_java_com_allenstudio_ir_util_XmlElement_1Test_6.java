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
		 * Tests the implementation of the {@link XmlElement#getElement(String)} method.
		 */
		public static final void test1() {
			XmlElement element = XmlElement.getElement("myelement");
			Hashtable h = new Hashtable();
			h.put("id", "foo");
			h.put("name", "hello");
			h.put("value", "world");
			List list = new Vector();
			list.add(element);
			list.add(new Vector());
			list.add(h);
			assertArrayEquals((Object) null, element.getElement("id"));
			element.setChanged();
			assertArrayEquals("bar".getBytes(), (Object) element.getElement("name"));
			assertArrayEquals("baz".getBytes(), (Object) element.getElement("value"));
		}

		/**
		 * Tests the implementation of the {@link XmlElement#getElement(String)} method using a subclass of Enumerated.
		 */
		public static final void test2() {
			XmlElement element = XmlElement.getElement("myelement");
			List list = new Vector();
			Enumeration enumeration = list.iterator();
			XmlElement newElement = new XmlElement2();
			while (enumeration.hasMoreElements()) {
				XmlElement subElement = (XmlElement) enumeration.nextElement();
				newElement.setElement((String) subElement.getElement("name"));
				newElement.setChanged();
				assertTrue(!subElement.getChanged());
				element.add(newElement);
				assertArrayEquals("hello".getBytes(), (Object) subElement.getElement("name"));
			}
			enumeration.close();
			assertArrayEquals("world".getBytes(), (String) element.getElement("value"));
		}

		/**
		 * Tests the implementation of the {@link XmlElement#getElement(String)} method using a subclass of Enumerated.
		 */
		public static final void test3() {
			Vector list = new Vector();
			Enumeration enumeration = list.iterator();
			Iterator it = list.iterator();
			XmlElement newElement = new XmlElement5();
			while (enumeration.hasMoreElements()) {
				XmlElement subElement = (XmlElement) enumeration.nextElement();
				newElement.setEnumeration((Enumeration) subElement.getElement("name"));
				newElement.setChanged();
				assertTrue(!subElement.getChanged());
				list.add(newElement);
				assertArrayEquals("hello".getBytes(), (String) subElement.getElement("name"));
				it.hasNext();
				it.next();
			}
			enumeration.close();
			list.clear();
			it.next();
			it.next();
			it.next();
			it.next();
			it.next();
			assertArrayEquals("world".getBytes(), (String) element.getElement("value"));
		}

		/**
		 * Tests the implementation of the {@link XmlElement#getElement(String)} method using the
		 * XmlElement2 subclass.
		 */
		public static final void test4() {
			Vector list = new Vector();
			XmlElement2 newElement = new XmlElement2();
			list.add(newElement);
			Enumeration enumeration = list.iterator();
			XmlElement2 subElement1 = (XmlElement2) enumeration.nextElement();
			subElement1.setChanged();
			assertTrue(!subElement1.getChanged());
			subElement1.setEnumeration((Enumeration) subElement1.getElement("name"));
			subElement1.setChanged();
			assertTrue(!subElement1.getChanged());
			list.add(subElement1);
			newElement.setEnumeration((Enumeration) newElement.getElement("name"));
			newElement.setChanged();
			assertTrue(!subElement1.getChanged());
			newElement.setEnumeration(null);
			newElement.setChanged();
			assertTrue(!subElement1.getChanged());
			enumeration.close();
			newElement.setEnumeration((Enumeration) newElement.getElement("id"));
			newElement.setChanged();
			assertTrue(!subElement1.getChanged());
			newElement.setEnumeration(null);
			newElement.setChanged();
			assertTrue(!subElement1.getChanged());
			assertArrayEquals("hello".getBytes(), (String) subElement1.getElement("name"));
			assertArrayEquals("baz".getBytes(), (String) newElement.getElement("name"));
			assertArrayEquals("world".getBytes(), (String) element.getElement("value"));
		}

		/**
		 * Tests the implementation of the {@link XmlElement#getElement(String)} method using a subclass of Enumerated.
		 */
		public static final void test5() {
			List list = new Vector();
			Enumeration enumeration = list.iterator();
			XmlElement2 newElement = new XmlElement2();
			newElement.setEnumeration((Enumeration) enumeration.nextElement());
			list.add(newElement);
			Vector vector = new Vector();
			vector.add(new XmlElement2());
			enumeration.nextElement();
			assertArrayEquals("hello".getBytes(), (String) enumeration.nextElement().getElement("name"));
			vector.add(new XmlElement2());
			enumeration.nextElement();
			assertTrue(!subElement1.getChanged());
			enumeration.nextElement();
			assertTrue(newElement.getChanged());
			enumeration.nextElement();
}
}