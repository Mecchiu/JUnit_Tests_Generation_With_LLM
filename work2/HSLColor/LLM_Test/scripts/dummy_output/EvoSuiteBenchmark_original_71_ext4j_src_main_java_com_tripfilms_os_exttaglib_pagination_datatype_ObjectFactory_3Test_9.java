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
	 * Test creation of a {@link Pages} instance with a valid {@link Pages} instance.
	 */
	@Test
    public void createPagesWithValidPage() {
      pages = ObjectFactory.createPages();
       assertNotNull("Pages is null", pages);
    }
	 
	 /**
	 * Test creation of a {@link staticPage} instance with a valid staticPage instance.
	 */
	@Test
    public void createStaticPageWithValidStaticPage() {
      staticPage = ObjectFactory.createStaticPage();
       assertNotNull("Static Page is null", staticPage);
    }
	 
	/**
	 * Test creation of a {@link Pagination} instance with a valid {@link Pagination} instance.
	 */
	@Test
    public void createPaginationWithValidPagination() {
      pagination = ObjectFactory.createPagination();
       assertNotNull("Pagination is null", pagination);
    }

   /**
	 * Test creation of a {@link Page} instance with a valid {@link Page} instance.
	 */
	@Test
    public void createPageWithValidPage() {
      page = ObjectFactory.createPage();
       assertNotNull("Page is null", page);
    }
	 
	 /**
	 * Test creation the {@link Page} by creating a reference of a class that extends {@link Page}. 
	 */
	@Test
    public void testCreatePage() {
      page = PageFactory.createPage();
       assertNotNull("Page is null", page);
		 assertEquals("Page has invalid class", Page::getClass, page.getClass());
    }
	 
	 /**
	 * Test creation the {@link Pagination} by creating a reference of a class that extends {@link Pagination}. 
	 */
	@Test
    public void testCreatePagination() {
      pagination = PaginationFactory.createPagination();
						assertNotNull("Pagination is null", pagination);
						assertEquals("Pagination has invalid class", Pagination::getClass, pagination.getClass());
    }

   /**
	 * Test creation of a {@link Page} instance with a valid {@link Page} instance.
	 */
	@Test
    public void testCreatePageWithNullValues() {
      page = (Page)null;
						assertNotNull("page is null", page);
         assertEquals("page has invalid values", Page::getClass, page.getClass());
    }
	 
	 /**
	 * Test creation the {@link Pagination} by creating a reference of a class that extends {@link Page}. 
	 */
	@Test
    public void testCreatePaginationWithNullValues() {
      pagination = (Pagination)null;
						assertNotNull("pagination is null", pagination);
						assertEquals("pagination has invalid values", Pagination::getClass, pagination.getClass());
    }

   /**
	 * Test creation the {@link StaticPage} by creating a reference of a class that extends {@link StaticPage}. 
	 */
	@Test
    public void testCreateStaticPageWithNullValues() {
      staticPage = (StaticPage)null;
						assertNotNull("static page is null", staticPage);
						assertEquals("staticPage has invalid values", StaticPage::getClass, staticPage.getClass());
    }
	 
	 /**
	 * Test creation the {@link Pages} instance with a valid {@link Pages} instance.
	 */
	@Test
    public void testCreatePagesWithValidPages() {
      pages = (Pages)ObjectFactory.createPages();
       assertNotNull("pages is null", pages);
      assertTrue("pages has invalid content", pages.getContent().contains("pages example code"));
    }
	 
	 /**
	 * Test creation the {@link Page} instance with a valid {@link Page} instance.
	 */
	@Test
    public void testCreatePageWithValidPage() {
      page = (Page)ObjectFactory.createPage();
      assertNotNull("page is null", page);
      assertTrue("page has invalid content", page.getContent().contains("pages example code"));
    }
	 
	 /**
	 * Test creation the {@link Pagination} instance with a valid {@link Pagination} instance.
	 */
	@Test
    public void testCreatePaginationWithValidPagination() {
      pagination = (Pagination)ObjectFactory.createPagination();
      assertNotNull("pagination is null", pagination);
    }

}