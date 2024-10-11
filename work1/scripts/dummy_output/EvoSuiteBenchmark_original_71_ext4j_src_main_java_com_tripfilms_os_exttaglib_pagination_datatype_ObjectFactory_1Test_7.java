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
	 * Run the Page createPage() method test.
	 */
	@Test
    public void createPage_1() {
        Pagination pagination = ObjectFactory.createPagination();

        Page page = ObjectFactory.createPage();
        assertEquals(page.getValue(), pagination.getValue());
    }

 	/**
	 * Run the StaticPage createStaticPage() method test.
	 */
 	@Test
    public void createStaticPage_1() {
        StaticPage staticPage = ObjectFactory.createStaticPage();

        assertNotNull(staticPage.getValue());
    }

 	/**
	 * Run the Pagination createPagination() method test.
	 */
 	@Test
    public void createPagination_1() {
        Pagination pagination = ObjectFactory.createPagination();

        assertNotNull(pagination.getValue());
    }

 	/**
	 * Run the Pagedetails createPagedetails() method test.
	 */
 	@Test
    public void createPagedetails_1() {
        Pagedetails pagedetails = ObjectFactory.createPagedetails();

        assertNotNull(pagedetails.getValue());
    }

}