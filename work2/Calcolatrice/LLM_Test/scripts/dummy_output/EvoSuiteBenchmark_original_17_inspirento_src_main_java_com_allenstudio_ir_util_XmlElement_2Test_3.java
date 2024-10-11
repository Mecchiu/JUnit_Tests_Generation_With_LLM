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
		/** Constructor of XmlElement_2Test. */
    public XmlElement_2Test() {
    }

    /**
     * @return the test case.
	 */
	@Test
    public final XmlElement_2Test_ testString() {
        return new XmlElement_2Test();
    }
    
	/**
	 * @param clazz The class of which this test case is used.
	 * @return the test case
	 */
	@Test 
    public final boolean test(Class<?> clazz) {
    return clazz.equals(XmlElement_2Test.class);
	}
	

    
    /**
     * @param obj The Object which should be added.
     * @return the result of the addSubElement
     */
    public boolean addSubElement(String path) {
        return this.addSubElement(path,null,null);
    }
    
    /**
     * @param obj The Object which should be added.
     * @param objName The name to put in the hash where the object will be put.
     * @return true if the object was added, otherwise false
     */
    public boolean addSubElement(String path, String objName, Object obj) {
        XmlElement newElement = this.addSubElement(path,objName,obj);
        if (obj == null || objName == null || objName.equals(path)) {
            return true; 
        } else {
            return false;
        }
    }

    /**
     * @param obj The Object that will be put in the hash, if not null.
     * @return the result of the getSubElement
     */
    public XmlElement getSubElement(Object obj) {
        XmlElement newElement = this.getSubElement(obj);
        if (obj == null ||  newElement == null ) {
            return newElement;
        } else {
            return newElement;
        }
    }

    /**
     * @param obj The Object which is present in the xml document - 
     * objectName of XmlElement_2Test.testString
     * @return the result of the query
     * @throws XmlElement_2Test_Exception
     */
	  
    public boolean queryString(String objName) {
    return this.getSubElement(objName,null,null);
    }

    
    /**
     * @param obj The Object that will be put in the hash, if not null.
     * @param objName
     * @param objName
     * @return
     */
    public XmlElement getSubElement(Object obj, String objName) {
        XmlElement newElement = this.getSubElement(obj);
        if (obj == null ||  newElement == null) {
            newElement = new XmlElement();
            this.setChanged();
            this.setAdded(obj, newElement);
            this.setUpdated(obj, newElement);
            this.setNotified(obj, newElement);
            return newElement;
        } else {
            XmlElement oldElement = this.getSubElement(obj);
            if (obj == objName) {
                return newElement;
            } else  {
                return oldElement;
            }
        }
    }

    /**
     * @param subElems  The subElements that we want to be retrieved
     * @param obj       The value of which we want to look in the hashtable
     * @param childName The name of the element to return
     * @return subElement which holds the object.
     */
    protected XmlElement getSubElement(Hashtable<String,XmlElement_2Test.XmlElement> subElems, Object obj, String childName) {    
        XmlElement sub = subElems.get(childName);
        if (sub == null) {
            throw new XmlElement_2Test_Exception("Object "+obj+" does not have element "+childName);       
        } else {
            return sub;
        }
    }
    
    /**
     * @param childElems  The subElements that we want to set
     */
    protected void setSubElems(Hashtable<String,XmlElement_2Test.XmlElement> subElems) {
        this.setChanged();
        this.setAdded(null,subElems);
        this.setUpdated(null,subElems);
        this.setNotified(null,subElems);        
    }
  
    /**
     * 
     * @param childElems The subElements that we want to set
     */
    protected void setSubElems(Vector<String> subElems) { 
    	setSubElems(new Hashtable<String,XmlElement_2Test.XmlElement>());
        Enumeration<String> e = subElems.elements();
        while(e.hasMoreElements()) {
        XmlElement_2Test.XmlElement sub = new XmlElement_2Test.XmlElement();
            subElems.setElementAt(sub, e.nextElement());
    		}
    }
            
    /**
     * 
     * @param newElems The new Hash table
     */
    protected void setNewElems(Hashtable<String, XmlElement> newElems) {
    	setSubElems(newElems);
    	this.setChanged();
    	this.setAdded(null, newElems);
    	this.setUpdated(null, newElems);
    	this.setNotified(null, newElems);            
    }
        
}