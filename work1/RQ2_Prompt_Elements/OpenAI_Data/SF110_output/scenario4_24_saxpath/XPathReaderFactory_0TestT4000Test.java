// XPathReaderFactory_0Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_0Test {

	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is unset, and the default driver is used.
	* It expects the {@link XPathReader} instance is created successfully.
	*/
	@Test
	public void testCreateReader_0() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		XPathReader reader = XPathReaderFactory.createReader();
		assertNotNull(reader);
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is unset, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_1() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link XPathReader} instance is created successfully.
	*/
	@Test
	public void testCreateReader_2() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader");
		XPathReader reader = XPathReaderFactory.createReader();
		assertNotNull(reader);
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link XPathReader} instance is created successfully.
	*/
	@Test
	public void testCreateReader_3() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader");
		XPathReader reader = XPathReaderFactory.createReader();
		assertNotNull(reader);
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_4() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_0");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_5() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_0");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_6() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_1");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_7() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_1");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_8() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_2");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_9() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_2");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_10() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_3");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_11() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_3");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_12() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_4");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_13() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_4");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_14() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_5");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_15() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_5");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_16() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_6");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_17() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_6");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_18() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_7");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_19() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_7");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_20() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = true;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_8");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is not used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader_21() throws SAXPathException {
		XPathReaderFactory.USE_DEFAULT = false;
		System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader_8");
		assertThrows(SAXPathException.class, () -> {
			XPathReaderFactory.createReader();
		});
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that when the system property is set, and the default driver is used.
	* It expects the {@link SAXPathException} is thrown.
	*/
	@Test
	public void testCreateReader