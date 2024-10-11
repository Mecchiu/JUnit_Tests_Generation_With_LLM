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
		XmlElement testCase = null;

	    /**
	     * Default constructor.
		 *
	     * @throws Exception
	     */
	           		public XmlElement_0Test() throws Exception {
	            		testCase = new XmlElement(
	                            "test-case",
	                            "Test Content",
	                            "http://www.allenstudio.com/test-case");
	            	}
	           
	           /**
	          * Add an attribute.
	          *
	          * @param name attribute's name
	          * @param value attribute's value
	          * @return old attribute value
	          */
	           public Object addAttribute(String name, Object value);
	            /**
	             * Return old {@link Vector} instance.
	             *
	             * @return old {@link Vector} instance
	             */
	           public Vector getOldVector();


	           /**
	          * Create a new {@link Hashtable} with the same contents.
	          *
	          * @return new {@link Hashtable} with the same content as {@link Hashtable}.
	          */
	           public  Hashtable getNewHashtable();

}