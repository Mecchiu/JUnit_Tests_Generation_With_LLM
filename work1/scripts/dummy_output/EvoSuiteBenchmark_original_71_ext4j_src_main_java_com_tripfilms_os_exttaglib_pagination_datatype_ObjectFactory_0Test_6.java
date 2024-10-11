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
	void createPage() {
		
		assertNotNull("Page must not be null.", this.createPage());
		
	}

	@Test
	void createPages() {
		
		assertNotNull("Pages must not be null.", this.createPages());
		
	}

	@Test
	void createStaticPage() {
		
		assertNotNull("StaticPage must not be null.", this.createStaticPage());
		
	}

	@SuppressWarnings("unused")
	@Test
	public void createStaticPage_with_paintings() {
		
		assertNotNull("StaticPage must not be null.", this.createStaticPage());
		
	}

	@Test
	public void createPagination() {
		
		assertNotNull("Pagination must not be null.", this.createPagination());
		
	}

	@Test
	public void createPagination1() {
		
		assertNotNull("Pagination must not be null.", this.createPagination());
		
	}
	
}