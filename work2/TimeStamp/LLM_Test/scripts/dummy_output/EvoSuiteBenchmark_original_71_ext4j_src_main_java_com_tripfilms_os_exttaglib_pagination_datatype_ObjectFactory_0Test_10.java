// ObjectFactory_0Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_0Test {
		
	@Test
	public void createPage() {
		
		Pagination pagination = null;
		ObjectFactory objectFactory = new ObjectFactory();
			
		pagination = objectFactory.createPagination();
		assertNotNull(pagination);
		assertEquals(0, pagination.getPageStart());
		assertEquals(1, pagination.getPageCount());

	}
	
	@Test
	public void create2Paginations() {
		
		Pagination pagination = null;
		pagination = null;
		ObjectFactory objectFactory = new ObjectFactory();
			
		pagination = objectFactory.createPagination();
		assertNull(pagination);
		assertNotNull(pagination);
		assertEquals(0, pagination.getPageStart());
		assertEquals(1, pagination.getPageCount());
		pagination = null;
		pagination = objectFactory.createPagination();
		assertNotNull(pagination);
		assertEquals(0, pagination.getPageStart());
		assertEquals(1, pagination.getPageCount());
		pagination = null;
		pagination = objectFactory.createPagination();
		assertNotNull(pagination);
		assertEquals(0, pagination.getPageStart());
		assertEquals(1, pagination.getPageCount());

	}
	
}