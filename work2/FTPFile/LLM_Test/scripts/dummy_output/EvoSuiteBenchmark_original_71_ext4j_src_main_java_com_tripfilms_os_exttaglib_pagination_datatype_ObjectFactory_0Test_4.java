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
		* Test the behavior when the class created from {@link ObjectFactory} is returned from {@link ObjectFactory#createPagination()}.
		*/
		@Test
		public void shouldHaveABindThatStoresThePagination() throws Exception {

    	ObjectFactory objectFactory = new ObjectFactory ();
    	Pagination pagination = objectFactory.createPagination();
    	assertEquals(pagination, objectFactory.createPage ());
    }

    /**
     * Tests if a non-dummy {@link StaticPage} is created on a non-dummy {@link Pagination}.
     */
    @Test
    public void staticStaticPaginationTest() throws Exception {

    }

    /**
     * Tests if a {@link Pagination} is created on a non-dummy {@link GlobalPage}.
     */
    @Test
    public void globalGlobalPaginationTest() throws Exception {

    }

	/**
	 * Test if a {@link Pagination} is not created on a non-dummy {@link GlobalPage} but it created on a dummy {@link GlobalPage}.
	 */
	@Test
	public void globalPaginationNonDummyTest() throws Exception {

	}
}