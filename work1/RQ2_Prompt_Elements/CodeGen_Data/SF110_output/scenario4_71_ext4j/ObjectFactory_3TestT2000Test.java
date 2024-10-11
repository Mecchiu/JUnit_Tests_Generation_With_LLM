// ObjectFactory_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_3Test {

	/**
	 * Test 1 for createPagination <br/>
	 * 1. When paging is created the page and the container is set to null<br/>
	 * 2. The container is called with page number = 1 and the container is not the page count<br/>
	 * 3. When the page is requested, Paging should be created for the container without page number == 1<br/>
	 * 4. When the page is requested, Paging should be created for the container with page number!= 1<br/>
	 * 5. The container is called with page number = 1 and the container is not the page count<br/>
	 * 6. When the page is requested, Paging should be created for the page count + 1 instead of the page count + 1.
	 */
	@Test
	  public void page1() {
		
		ObjectFactory factory = new ObjectFactory();
		
		//TODO: check the number of pages
		
		Pagination page = factory.createPagination();
		
		assertTrue(page instanceof StaticPage);
		
		page.pageNumber = 2;
		
		assertTrue(page.container.pageNumber == 1 && page.container.getPageCount() == 2);
		
	  }
  
}

