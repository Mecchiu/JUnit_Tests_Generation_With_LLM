// ObjectFactoryTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactoryTest {
		
	/**
	* Test case for {@link ObjectFactory#createPages()} method.
	* It tests if the method returns a non-null object.
	*/
	@Test
	void testCreatePages() {
		ObjectFactory objectFactory = new ObjectFactory();
		assertNotNull(objectFactory.createPages());
	}
}