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
		/* Create the test instance */  private XmlElement_0Test(){this.xmlElement=null;}

		/* Method to add a new attribute to this xml element.
		 * @param name name of key
		 * @param value new attribute value
		 */
		public void addAttribute(final String name, final String value) {
			final XmlElement test = (XmlElement) this.xmlElement;
			boolean found = false;
			for(int i = 0; i <test.getNumberOfAttributes(); i++){	if (test.getAttribute(i).getName().equals(name)){			found = true;	break;		}	}
			if(!found){
				test.addAttribute(new Attribute(name, value));
			}
			getAllAttributes();
			//getAllAttributes().wait();
		}

		/* Method to get all attributes of this xml element
		 * @return array where names of the attribute values
		 * will be in
		 * @see getAllAttributes()
		 */
		public Attribute[] getAllAttributes(){
			final XmlElement test = (XmlElement) this.xmlElement;
			String [] values = null;
			Attribute [] atts = test.getAllAttributes();
			List<Attribute> list = new Vector<Attribute>();
			if (atts!= null) {
				values = new String[atts.length];
				for(int i=0; i < atts.length; i++){
					values[i] = atts[i].getName();
				}
				list = Enumeration.create(atts);
			}
			return values;  }

		/* Clonable version of the addAttribute(String name, String value)
		 *
		 * @param name name of key
		 * @param value new attribute value
		 * @return old attribute value
		 */
		@java.lang.Deprecated
		public String addAttribute(final String name, final String value) {
			return this.addAttribute(name, value, null);
		}

		@java.lang.Deprecated
		public String addAttribute(final String name, final String value, final Object defaultValue) {
			return this.addAttribute(name, string(value? value : defaultValue));
		}

		@java.lang.Deprecated
		private String string(final String value){return value;}

		/* Get a copy of an attribute with name "name";
		 * create a hash table of its names, using the
		 * hash of itself as as key for the hash table
		 * where:
		 * name => name of current attribute
		 * key(name => hash map of current attributes) => key = current attributes
		 * value => value of new attribute
		 * @param name
		 */
		public String getAttribute(final String name){
			Hashtable nameHash = this.xmlElement.getAttributes();
			Object nameVal = null;
			if (nameHash.get(name)!= null) {	nameVal = nameHash.get(name);	}
			if (nameVal == null) {				nameVal = "";
			}
			return new String(nameVal);
		}

		/* Sets new value of an attribute
		 * @param name	name of key
		 * @param value	new attribute values
		 * @return old attribute value
		 */
		public Object setAttribute(final String name, final String value) {
			final XmlElement test = (XmlElement) this.xmlElement;
			Object old = test.getAttribute(name);
			final Attribute att = new Attribute(name, value);

			final Hashtable<String, Object> newNameHash = new Hashtable<String, Object>();
			newNameHash.put(name, att);
			Attribute[] newAttr = new Attribute[1];
			newAttr[0] = att;

			if (getAttribute(name)!= old) {		getAllAttributes();
					test.setValues(old);
					newNameHash.put(name, old);
					test.addAttribute(newAttr[0], newNameHash);
					getAllAttributes();
					//getAllAttributes().wait();
				}

			return old;
		}

		/* Removes an attribute from this xml element
		 * @param name	name of key
		 */
		public void removeAttribute(final String name) {
			final XmlElement test = (XmlElement) this.xmlElement;
			final Attribute att = new Attribute(name, null);
			test.removeAttribute(att);
			getAllAttributes();
			//getAllAttributes().wait();
		}

	}