// ObjectFactory_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPagination()} method.
*/
class ObjectFactory_2Test {
		
	@Test
    public void testPagination() {
		 assertEquals(-1, createPagination().getPageNumber());
		 assertEquals(0, createPagination().getNumberOfPages());
		 assertEquals(0, createPagination().getTotalNumberOfRows());
		 assertEquals(0, createPagination().getNumberOfPagesPerRow());
	}

		
	@Test
    public void testStaticPage() {
		 assertEquals(-1, createStaticPage().getPageNumber());
		 assertEquals(0, createStaticPage().getNumberOfPages());
		 assertEquals(0, createStaticPage().getTotalNumberOfRows());
		 assertEquals(0, createStaticPage().getNumberOfPagesPerRow());
	}

		
	@Test
    public void testPages() {
		 assertEquals(-1, createPages().getPageNumber());
		 assertEquals(0, createPages().getNumberOfPages());
		 assertEquals(0, createPages().getTotalNumberOfRows());
		 assertEquals(0, createPages().getNumberOfPagesPerRow());
	}
	
	
	@Test
    public void testCreatePage() {
		 PagePage testPage = createPage();
		 assertEquals(123, testPage.getPageNumber());
		 assertEquals(1, testPage.getNumberOfPages());
		 assertEquals(1, testPage.getTotalNumberOfRows());
		 assertEquals(1, testPage.getNumberOfPagesPerRow());
	}
	
	
	@Test
    public void testCreateStaticPage() {
		 StaticPagePage testStaticPage = createStaticPage();
		 assertEquals(123, testStaticPage.getPageNumber());
		 assertEquals(1, testStaticPage.getNumberOfPages());
		 assertEquals(1, testStaticPage.getTotalNumberOfRows());
		 assertEquals(1, testStaticPage.getNumberOfPagesPerRow());
		}
	
	
	@Test
    public void testCreatePagination() {
		 PaginationPage testPagination = createPagination();
		 assertEquals(-1, testPagination.getPageNumber());
		 assertEquals(0, testPagination.getNumberOfPages());
		 assertEquals(0, testPagination.getTotalNumberOfRows());
		 assertEquals(0, testPagination.getNumberOfPagesPerRow());
	}
}