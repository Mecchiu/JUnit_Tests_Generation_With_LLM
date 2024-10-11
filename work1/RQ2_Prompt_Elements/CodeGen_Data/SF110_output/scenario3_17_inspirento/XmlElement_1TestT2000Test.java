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
static class MyObserver {
			public void init(XmlElement element) {
				//...
			}

			@Override
			public void messageOccurred(ObserverMessage message) {
				//...
			}
		}

		static class MyListener {
			public void init(XmlElement element) {
				//...
			}

			@Override
			public void messageOccurred(ObserverMessage message) {
				//...
			}
		}


		@Test
		void isSupportedElementConstructor() throws Exception {
				System.out.println("Testing if XMLElement is supported");
				if(!this._isSupported()) {
					System.out
							.println("WARNING: The Element test will fail if the XmlElement is supported");
				}
		}

		@Test
		boolean _isSupported() {
				return this.getClass().getDeclaredConstructor().newInstance()
						.isSupported();
		}

		@Test
		@SuppressWarnings("unchecked")
		boolean _isSupported() throws Exception {
					// if the xml element is supported
					if(!XmlElement.isSupported()) {
						return false;
					}

					// if the element is supported
					return XmlElement.isSupported();
		}

		@Test
		@SuppressWarnings("unchecked")
		boolean _isSupported() throws Exception {
					// if the xml element is supported
					if(!XmlElement.isSupported()) {
						return false;
					}
					if(!this.getClass().getDeclaredConstructor().newInstance()
							.isSupported()) {
						return false;
					}
		}

		@Test
		public void hasGetSetMethods() throws Exception {

			List<String> names = new Vector<String>();
			names.add("MyChild1");
			names.add("MyChild2");
			names.add("MyChild3");

			XmlElement element = new XmlElement("testElements", names);

			System.out.println(
					"\nTESTING Element.hasGetSetMethods() "+
							element.hasGetSetMethods().size()+" objects\n");

			System.out.println("\nGET: "+element.
					hasGetSetMethods().size()+" objects\n");

			System.out.println(
					"\nSET: "+names.size()+" objects\n");

			System.out.println(
					"\nGET: "+element.
					hasGetSetMethods()
							.size()+" objects\n");

			System.out.println(
					"\nSET: "+names.size()+" objects\n");
		}

		@Test
		void hasGetSetMethods() throws Exception {

			XmlElement element = new XmlElement("testElements", null);

			System.out.println(
					"\nTESTING element.hasGetSetMethods() "+
							element.hasGetSetMethods().size()+" object\n");

			// if the returned size is zero
			if(element.hasGetSetMethods().size()==0) {
				// then some objects which doesn't have a call to setGetSetMethods()
				// should return false from hasGetSetMethods()
				System.out
						.println("\n*** object "+element.
								hasGetSetMethods().size()+" returning false!!\n");

				return false;
			}

			System.out.println(
					"\nGET: "+element.
					hasGetSetMethods()
							.size()+" objects\n");

			System.out.println("\nSET: "+element.
					hasGetSetMethods().size()+" objects\n");

			System.out.println(
					"\nGET: "+element.
					hasGetSetMethods()
							.size()+" objects\n");

			System.out.println(
					"\nSET: "+element.
					hasGetSetMethods().size()+" objects\n");

			// when the size changed
			element.setHasSetMethods();
			System.out.println("\nSET: "+element.
					hasGetSetMethods().size()+" objects\n");

			System.out.println("\nGET: "+element.
					hasGetSetMethods()
							.size()+" objects\n");

			System.out.println("\nSET: "+element.
					hasGetSetMethods().size()+" objects\n");

			// when the size changed
			// this time the objects has not changed
			element.setHasGetSetMethods();
			System.out.println("\nGET: "+element.
					hasGetSetMethods().size()+" objects\n");

			System.out.println("\nGET: "+element.
                    hasGetSetMethods()
                           .size()+" objects\n");

			System.out.println("\nSET: "+element.
					hasGetSetMethods().size()+" objects\n");
		}

		@Test
		void getElementNames() throws Exception {

			XmlElement element = new XmlElement("testElements", null);

			System.out.println(
					"\nTESTING Element.getElementNames() "+
							element.getElementNames().size()+" element'\n");

			System.out.println("\nGET: "+element.
					getElementNames()
							.size()+" element'\n");

			System.out.println(
					"\nSET: "+element.
					getElementNames()
							.size()+" element'\n");

			System.out.println(
					"\nGET: "+element.
					getElementNames()
							.size()+" elements'\n");

			System.out.println(
					"\nSET: "+element.
					getElementNames()
							.size()+" elements'\n");

			System