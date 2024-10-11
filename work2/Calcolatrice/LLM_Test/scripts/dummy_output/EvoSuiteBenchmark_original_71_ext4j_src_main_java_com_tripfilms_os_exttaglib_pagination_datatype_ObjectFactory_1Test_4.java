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
		
	private static final String page = "page";
	
	@Test
    public void createStaticPage() {
        /**
         * This code block will execute when test is executed.
         */

        Page pageContent = page;
		
        assertNotNull(pageContent);
        assertTrue(pageContent instanceof StaticPage);

}
	/**
	 *  Test case of {@link ObjectFactory#createPagination()}.
	 *  It will test the {@link ObjectFactory#createPagination()} method.
	 */
    @Test
	public void createPagination() {
		
		/**
		 * This code block will execute when test is executed.
		 */

        Pagination pagination = new Pagination();
		
        assertNotNull(pagination);
        assertTrue(pagination instanceof Pagination);

}
	/**
	 *  Test case of {@link ObjectFactory#createPages()}.
	 *  It will test the {@link ObjectFactory#createPages()} method.
	 */
    @Test 
	public void createPaginationWithPages() {
		
		/**
		 * This code block will execute when test is executed.
		 */
		
		Pages pages = new Pages();
		
		assertNotNull(pages);
		assertTrue(pages instanceof Pages);
		
	}	

}