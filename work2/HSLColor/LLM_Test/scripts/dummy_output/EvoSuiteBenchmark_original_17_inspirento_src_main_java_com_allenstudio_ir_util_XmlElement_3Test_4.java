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
		/**
		* A method which is testing adding an element to an XmlElement
		*
		* @param Name the name of the element to add
		* @param data the data for this element
		*/
		@Test
        public void test5_1() {
				// Given
				XmlElement element = new XmlElement("test");
				// When
				element.addSubElement("test", "data");
				element.notifyObservers();

				// Then
				assertEquals("data", element.getChanged().getValue());
		}
		/**
		* A method which is testing checking its children when one should
		* notify it for a specific class which should be notified of its
		* children
		*
		* @param Observers
		* @return boolean
		*/
		@Test
        public void test5_2() {
				// Given
				XmlElement element = new XmlElement("test");

				// When
				List<Observer> observers = new Vector<Observer>();

				try {
					element.addObserver(observers);

					// Then
					fail("failure");
				} catch (IllegalStateException ex) {
					// then
					assertEquals("Element not added", ex.getMessage());
				}

				// When
				element.notifyObservers();

				// Then
				assertTrue("new children notification was notified.", observers.size()>0);
		}
		/**
		* A method which is testing adding a new child in the root element
		*
		* @param Name
		* @param data
		* @return boolean
		*/
		@Test
        public void test5_2a() {
				// Given
				XmlElement element = new XmlElement("test");
				/*
				 * When
				 *  The children of the XmlElement can be added in the root element.
				 *  - The "root" XmlElement should not be present.
				 *  - The "root" XmlElement sub element should be added with a "child" element
				 *  Name
				 *  Data
				 */
				XmlElement element2 = new XmlElement("test");
				element2.addSubElement("test", "data");

				// Then
				Iterator<XmlElement> it = element.childElements();
				while(it.hasNext()) {
					XmlElement child = it.next();
					assertNotNull(child.getChanged());
					assertEquals(false, child.getChanged().equals(element2.getChanged()));
					assertNotSame(element.getChanged(), child.getChanged());
				}

				// When
				element2.notifyObservers();

				// Then
				assertSame("child with root child element should have been notified", element2.getChanged(), element.getChanged());
		}

		/**
		 * An element which should NOT be notified when it contains other element
		 * children for a specific class.
		 *
		 * @param Parent
		 * @param Data
		 */
		@Test
        public void test5_4a() {
				// Given
				XmlElement element = new XmlElement("test");
				/*
				 * A subElement which is notified for the root element should NOT be present
				 * for any of its children of an element with other children
				 */
				XmlElement subElement = new XmlElement("test");

				// When
				element.addSubElement("test", "data");
				element.notifyObservers();

				// Then
				Iterator<XmlElement> it = element.childElements();
				while(it.hasNext()) {
					XmlElement child = it.next();
					assertTrue("child with no child element should have been notified", child.getChanged()==subElement.getChanged());
				}

				// When
				element.addObserver(subElement);

				// Then
				subElement.notifyObservers();

				assertTrue("child which is parent's child element should have been notified", subElement.getChanged());
		}

		/**
		 * An element which should be notified when it contains other element
		 * children for a subclass of E
		 *
		 * @param Parent
		 * @param Data
		 */
		@Test
        public void test5a() {
				// Given
				XmlElement element = new XmlElement("test");
				/*
				 * A subElement which is notified for the root element should NOT be present
				 * for any of its children of an element with other children
				 */
				XmlElement subElement = new XmlElement("test");

				// When
				element.addSubElement("test", "data");
				element.notifyObservers();

				// Then
				List<Observer> observers = new Vector<Observer>();

				try {
					element.addObserver(observers);

					// Then
					fail("failure");
				} catch (IllegalStateException ex) {
					// then
					assertEquals("element not added to child list", ex.getMessage());
				}

				// When
				element.addObserver(subElement);

				// Then
				assertTrue("The parent's child element should have been notified", element.getChanged().equals(subElement.getChanged()));

	}
}