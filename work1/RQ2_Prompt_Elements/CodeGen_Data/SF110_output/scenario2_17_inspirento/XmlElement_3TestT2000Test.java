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

	private XmlElement _superElement = null;
	private XmlNode _root = null;
	private XmlNode _subXml = null;

	private XmlElement_3Test(XmlNode _root){
		this._superElement = null;
		this._root = _root;
	}
	/**
	 * It adds a subnode to this XmlNode and sets the parent Node
	 * for the added XmlElement.
	 * 
	 * @return XmlElement
	 */
	public XmlElement addSubElement(){
		XmlElement e = new XmlElement();
		e.addSubElement("Node1", "Value1");
		e.addSubElement("Node2", "Value2");
		e.addSubElement("Node3", "Value3");
		e.setParent(this);
		this._subXml = e;
		return e;
	}
	/**
	 * Is the XmlElement a subsubstring element
	 * @return true if the Element is subsubelement of other (even if its not)
	 */
	public boolean isSubSubElement(){
		String s = _subXml.getAttribute("name");
		return (s.equals("Node3"));
	}
	/**
	 * Sets the XmlNode to which this XmlElement belongs or to the XmlElement
	 * itself.
	 * @param other a Node of the parent of the XmlElement
	 */
	public void setParent(XmlNode other){
		this._root = other;
	}
	/**
	 * Set a list of Enumerations of Attributes of this Element
	 * @param attributeNameEnumedNames
	 */
	public void setAttributeEnum(Hashtable<String,String> attributeNameEnumedNames){
		this._superElement.setAttributeEnum(attributeNameEnumedNames);
	}

	/**
	 * Gets the Enumerations of Attributes of this Element
	 * @return the List of AttributeNames
	 */
	Hashtable<String,String> getAttributeEnum(){
		Hashtable<String, String> attributeEnum = _superElement.getAttributeEnum();
		return attributeEnum;
	}
	/**
	 * Get a list of Enumerations of Attributes of this Element
	 * @return the Enumerations of the AttributeNames
	 */
	public Enumeration<String> getAttributeEnumEnum(){
		return _superElement.getAttributeEnumEnum();
	}



	/**
	 * Sets a subnode with the id of this XML element and set it as
	 * parent of this <code>XmlElement</code>
	 * @param id the id of the <code>XmlElement</code>
	 */
	public void setSubElement(String id){
		_subXml = id;

		XmlNode parent = _root;
		_root = (XmlNode)parent.getParent();
	}
    /**
     * Gets the <code>XmlNode</code> itself.
     * @return the <code>XmlNode</code> itself.
     */
    XmlNode getNode(){
        return this._root;
    }

	public List<XmlNode> getAllSubNodes(){
		List<XmlNode> root = new Vector();
		_superElement.getSubNodes(root);
		return root;
	}

	public String getSubElementHtml(String attributeName) {
		return "";
	}
}
