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
             * This test is for
            public final XmlElement getSubElement(final String Name);
			public void runTest() {
			System.out.println(this.getClass().getName());
			}
			public String getName() {
			return "XmlElement_3Test";

}
				*/

	/**
				 * Returns Name of this element
				 *
				 * @return the name of this element
				 */
	public String getName() {return "Name_2";}
	/**
		 * Returns Name of this element
		 *
		 * @return the name of this element
		 */
	public String getData() {return "Name_1";}
  public XmlElement getSubElement(String Name) {
		// The elements should not be null
		assertNotNull("Object1","object");
		assertNotNull("Object2","object");
		// No two object are allowed
		assertFalse("Element1","object1");
		assertFalse("Element2","object2");

		// We have one object only
		assertEquals("element2","element2");

		// It would be nice to have one different one
		// with different data
		// but I guess can't
		// get it like this
		// the name of the same element
int d1 = getData().length()+"";
		//the name of the same element
int d2 = Name.length()+"";

		// the elements of different data must be different
		assertNotEquals("element2","element2");
		assertNotEquals("element2","element3");
		assertNotEquals("Element 2","Element 2");

		// The same data but different Name
		assertEquals("Name_1","Name_1");
		assertNotEquals("Name_2","Name_2");
		// The elements of the the same data must have different Strings
		System.out.println("Name_1" + d1 +Name +d2);
		assertNotEquals("Name_1","Name_1");
		assertNotEquals("Name_1","Name_1");
		assertEquals("Name_1","Name_2");
		assertNotEquals("Name_2","Name_1");
		assertEquals("Name_2","Name_2");
		assertNotEquals("Name_1","Name_1");
				}
 }