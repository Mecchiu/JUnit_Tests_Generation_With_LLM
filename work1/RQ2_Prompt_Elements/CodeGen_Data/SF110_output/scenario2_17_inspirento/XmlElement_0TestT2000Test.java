// XmlElement_0Test.java
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
* It contains one unit test case for the {@link XmlElement#addAttribute(String, String)} method.
*/
class XmlElement_0Test {
// XmlElement.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;

/**
 * The XmlElement is a generic containment class for elements within an XML
 * file.
 * <p>
 *
 * It extends Observable which should be used for gui elements which are
 * interested in configuration changes.
 * <p>
 *
 * Show interested in:
 *
 * <pre>
 * xmlElement.addObserver(yourObserver);
 * </pre>
 *
 * <p>
 * When making bigger changes on XmlElement and probably its subnodes and/or a
 * greater number of attributes at once, you should just change XmlElement
 * directly and manually notify the Observers by calling:
 * <p>
 *
 * <pre>
 * xmlElement.setChanged();
 * xmlElement.notifyObservers();
 * </pre>
 *
 * <p>
 * There a good introduction for the Observable/Observer pattern in
 * Model/View/Controller based applications at www.javaworld.com: -
 * {@link http://www.javaworld.com/javaworld/jw-10-1996/jw-10-howto.html}
 *
 * @author fdietz
 */
public class XmlElement extends Observable implements Cloneable {

    /**
     * Add attribute to this xml element.
     *
     * @param name name of key
     * @param value new attribute value
     * @return old attribute value
     */
    public Object addAttribute(String name, String value) {
        if ((value!= null) && (name!= null)) {
            Object returnValue = attributes.put(name, value);
            return returnValue;
        }
        return null;
    }
}

// XmlElement_0Test.java
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
* It contains one unit test case for the {@link XmlElement#addAttribute(String, String)} method.
*/
class XmlElement_0Test {
		/**
		* Default constructor for the {@link XmlElement_0Test}.
		*/
		public XmlElement_0Test() {
		}

		/**
		* Set a unit test case for {@link XmlElement#addAttribute(String, String)}.
		* <p>
		* This method is useful for generating a more powerful test suite for a
		* {@link XmlElement}.
		*
		* @param testCase a unit test case which will be executed to run
		*/
		public void addTest(Object testCase) {
		}

	
	/**
	 * The suite of {@link XmlElement#addAttribute(String, String)} tests
	 * contains 2 tests. These tests start with a "testElement" attribute and
	 * then have a "testCase" attribute with the following members. <p>
	 * <!-- begin-model-doc -->
	 * testElement is an attribute in a {@link XmlElement} with the name equal
	 * to "testElement" (without the ending dot).
	 * @version 1.0.0 02.07.2013
	 * <!-- begin-model-doc -->
	 * </end-model-doc>
	 * <!-- end-model-doc -->
	 <p>
	 * <!-- begin-model-source-code -->
	 * <<< Auto generated code
	 * startElementName="testElement"
	 * endElementName="testCase"
	 * <<< Auto generated code
	 * endElementName="testElement" >>
	 * <end-model-doc -->
	 * </end-model-source-code>
	 */
	@Test
	public void testAddAttributeTests() {
		addTest(new Object() {
		        @Override
		        public Object call() throws Exception {
		            testElement();
		            return null;
		        }
		});
		}

	/**
	 * The suite of {@link XmlElement#addAttribute(String, String)} tests
	 * contains 3 units tests. These tests start with an attribute with the
	 * name equal to "testElement" and then have a "testCase" attribute
	 * with the following members. <p>
	 * <!-- begin-model-doc -->
	 * testElement is an attribute with the name equal to "testElement"
	 * (without the ending dot).
	 * <!-- end-model-doc -->
	 * <!-- begin-model-source-code -->
	 * <!-- The following snippet shows a special example of testElement.
	 * It was generated using the reflection
	 * <!-- begin-model-doc -->
	 * <<< Auto generated code
	 *  startAttributeName="testElement"
	 *  endAttributeName="testCase"/>
	 * <!-- end-model-doc -->
	 * <!-- begin-model-source-code -->
	 * <<< Auto generated code
	 * startAttributeName="testElement"
	 *  endAttributeName="testCase"
	 * <<< Auto generated code
	 * endAttributeName="testElement" >>
	 * <end-model-doc -->
	 * </end-model-source-code>
	 */
	@Test
	public void testAddAttributeTest() {
		addTest(new Object() {
		        @Override
		        public Object call() throws Exception {
		            testElement();
		            return null;
		        }
		});
		}

	/**
	 * The suite of {@link XmlElement#addAttribute(String, String)} tests
	 * contains 4 units tests. These tests start with an attribute with the
	 * name equal to "testElement" and then have a "testCase" attribute
	 * with the following members. <p>
	 * <!-- begin-model-doc -->
	 * testElement is an attribute with the name equal to "testElement"
	 * (without the ending dot).
	 * <!-- end-model-doc -->
	 * <!-- begin-model-source-code -->
	 * <!-- The following snippet shows a "special" method for attributes
	 * and therefore is not part of the {@link XmlElement}
	 * <!-- end-model-source-code -->
	 * <!-- begin-model-source-code -->
	 * <!-- The following snippet shows a "special" method for attributes
	 * and therefore is not part of the "testElement" class
	 * <!-- end-model-source-code -->
	 */
	@Test
	public void testAddAttributeTest2() {
		addTest(new Object() {
		        @Override
		        public Object call() throws Exception {
		            testElement();
		            return null;
		        }
		});
		}

	public static void main(String[] args) {
		try {
		    XmlElement_0Test test = new XmlElement_0Test();   // Construct a new testcase for XmlElement test
		    test.testAddAttributeTests();  // Execute the testcase
		} catch (Throwable e) {   // Catch the Exception e, if any
		    e.printStackTrace(System.err);  // Output the stack trace
		}
	}
}
