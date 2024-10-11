// ObjectFactoryTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactoryTest {
		
	/**
	* Test case for {@link ObjectFactory#createPage()} method.
	* It tests if the method returns a {@link Page} object.
	*/
	@Test
	void testCreatePage() {
		ObjectFactory objectFactory = new ObjectFactory();
		Page page = objectFactory.createPage();
		assertTrue(page instanceof Page);
	}
}