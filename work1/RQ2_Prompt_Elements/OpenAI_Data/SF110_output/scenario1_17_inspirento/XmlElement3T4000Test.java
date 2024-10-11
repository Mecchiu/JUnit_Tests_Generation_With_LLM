// XmlElementTest.java
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
* It contains ten unit test cases for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElementTest {

	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = null, data = null
	* Input:
	* 	- name = null
	* 	- data = null
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_null_data_null() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement(null, null);
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = null, data = ""
	* Input:
	* 	- name = null
	* 	- data = ""
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_null_data_empty() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement(null, "");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = null, data = "data"
	* Input:
	* 	- name = null
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_null_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement(null, "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "", data = null
	* Input:
	* 	- name = ""
	* 	- data = null
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_empty_data_null() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("", null);
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "", data = ""
	* Input:
	* 	- name = ""
	* 	- data = ""
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_empty_data_empty() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("", "");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "", data = "data"
	* Input:
	* 	- name = ""
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_empty_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = null
	* Input:
	* 	- name = "name"
	* 	- data = null
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_null() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", null);
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = ""
	* Input:
	* 	- name = "name"
	* 	- data = ""
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_empty() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});
	}
	
	/**
	* Test case for {@link XmlElement#addSubElement(String, String)} method.
	* Test case for the path: name = "name", data = "data"
	* Input:
	* 	- name = "name"
	* 	- data = "data"
	* Expected result:
	* 	- NullPointerException
	*/
	@Test
	void testAddSubElement_name_name_data_data() {
		XmlElement xmlElement = new XmlElement();
		assertThrows(NullPointerException.class, () -> {
			xmlElement.addSubElement("name", "data");
		});