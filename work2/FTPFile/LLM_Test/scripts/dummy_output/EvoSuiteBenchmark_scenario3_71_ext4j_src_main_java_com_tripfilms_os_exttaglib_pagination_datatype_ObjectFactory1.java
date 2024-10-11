// ObjectFactoryTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createStaticPage()} method.
*/
class ObjectFactoryTest {
		
	/**
	* Test case for {@link ObjectFactory#createStaticPage()} method.
	* It tests the {@link ObjectFactory#createStaticPage()} method.
	*/
	@Test
	void testCreateStaticPage() {
		ObjectFactory objectFactory = new ObjectFactory();
		StaticPage staticPage = objectFactory.createStaticPage();
		assertNotNull(staticPage);
	}
}