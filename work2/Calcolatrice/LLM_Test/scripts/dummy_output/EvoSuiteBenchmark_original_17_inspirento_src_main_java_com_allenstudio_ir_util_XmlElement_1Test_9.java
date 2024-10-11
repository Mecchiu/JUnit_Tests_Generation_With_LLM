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
		/*
		 * There are two different ways to define a path element. By default it
		 * is defined to be as ".". In this way a path element may be a
		 * descendant of any node which may contain a sub node or a leaf node
		 * whose path to the end of the traversal is contained in the path for
		 * the node it denotes. The path may also optionally be followed by the
		 * node itself, which indicates a leaf node or any node can be the
		 * path element.
		 */

	private enum Type {
	        /**
	        * Element is not a descendant of any node.
	        */
	        EMPTY(2, null));

		private final int count;
		private final String path;

		private Type(int count, String path) {
		this.count = count;
		this.path = path;
		}

		public int getCount() {
		return count;
		}
		public Enumeration<XmlElement> findElements(String attribute) {
		Vector<XmlElement> v = new Vector<XmlElement>(count);
		XmlElement e = null;
		// First check if the attribute exists, so we can add the element
		// below (if it is a leaf node).
		if (attribute.indexOf(" ")!= -1) {
			String sub = attribute.substring(0, attribute.indexOf(" "));
			for (XmlElement child : findElements(sub)) {
				v.add(child);
				}
			}
		e = this;
		if ((attribute.length() >= 0) && (e.getCount() >= (count - 1))) { // Check if path exists
		Iterator<XmlElement> eit = v.iterator();
		while (eit.hasNext()) {
		if (e.path.indexOf(eit.next().path)!= -1) {
			return eit.next().findElements(attribute)
			v.add(e);
		}
		}
		} else {
		return v.iterator();
		}
		return v.iterator();
		}

		public String getPath() {
		return path;
		}

		public Set<Observer> getObservers() {
		return new Hashtable<Observer, XmlElement>() {
			protected XmlElement createEntry(Observer o) {
				return new XmlElement() {
			public Iterator<XmlElement> findElements(String attribute) {
				return findElements(attribute, o);
			}

			public Enumeration<Observer> findAll() {
				Hashtable<Observer, XmlElement> r = new Hashtable<Observer, XmlElement>();
				XmlElement e = createEntry(o);
				return r.keySet().iterator();
				}
			}
			};
		}

		};
	}

		/**
	 * Test if specified path is valid and if path element is a descendant of any of specified elements.
	 */
	@Test
	public void validate() {
		XmlElement.log.info("Testing validity of path Element");
		XmlElement.log.info(" ");
		/*
		 * The Element path must be a string of more than one character. The string "."
		 * is also a "no" wildcard pattern.
		 */
		XmlElement.validate(XmlElement_1Test.Type.EMPTY.path, "{}");
		for (XmlElement.Type t : XmlElement.Type.values()) {
		XmlElement.validate(t.path, String.valueOf(t.path));
		}
	}
	public static void main(String[] args) {
	XmlElement_1Test m = new XmlElement_1Test();
	XmlElement.validate(m.validate());
	}
}