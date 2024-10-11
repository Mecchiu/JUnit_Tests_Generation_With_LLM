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
		/**
		 * Create unit test case for {@link ObjectFactory#createPage()} method.
		 */
	@Test
	public void testCreatePage() {
        Page aPage=ObjectFactory.createPage();
        assertNotNull(aPage);
        assertEquals(aPage.getPageTitle(), "Page Title");
        assertEquals(aPage.getPageType(), "Page Type");
	}
		/**
		 * Create unit test case for {@link ObjectFactory#createPagination()} method.
		 */
	@Test
	public void testCreatePagination() {
        Page aPage=ObjectFactory.createPagination();
        assertNotNull(aPage);
        assertEquals(aPage.getPageTitle(), "Page Title");
        assertEquals(aPage.getPageType(), "Pagination");
	}
		/**
		 * Create unit test case for {@link ObjectFactory#createPages()} method.
		 */
	@Test
	public void testCreatePages() {
        Pages aPages=ObjectFactory.createPages();
        assertNotNull(aPages);
        assertEquals(aPages.getPage1(), "Page 1");
        assertEquals(aPages.getPage2(), "Page 2");
        assertEquals(aPages.getPage3(), "Page 3");
	}
}