// ObjectFactoryTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPagination()} method.
*/
class ObjectFactoryTest {
		
	/**
	* Test case for {@link ObjectFactory#createPagination()} method.
	* It tests if the method returns a {@link Pagination} object.
	*/
	@Test
	void testCreatePagination() {
		ObjectFactory objectFactory = new ObjectFactory();
		Pagination pagination = objectFactory.createPagination();
		assertNotNull(pagination);
	}
}