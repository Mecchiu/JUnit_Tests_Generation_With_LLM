// ObjectFactory_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createStaticPage()} method.
*/
class ObjectFactory_1Test {
		
	/**
	 * A test case for the {@link ObjectFactory#createPagination()} method.
	 */
	@Test
	public void createPaginationTest() {
		// Set up the test case
		objectFactory.createPagination();
		
		// Perform assertions
	    assertNotNull(objectFactory.createStaticPage());
	    assertEquals("com.tripfilms.os.exttaglib.page.StaticPage", objectFactory.createStaticPage().getClass().getSimpleName());
	    assertEquals("com.tripfilms.os.exttaglib.page.StaticPage", objectFactory.createPagination().getClass().getSimpleName());
	}
	
}