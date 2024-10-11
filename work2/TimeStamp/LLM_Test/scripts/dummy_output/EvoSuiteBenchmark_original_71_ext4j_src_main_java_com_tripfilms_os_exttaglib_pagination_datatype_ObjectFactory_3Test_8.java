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
		* @brief JAXB object factory.
		*/
		private static final ObjectFactory _instance;
		static {
			_instance = new ObjectFactory();
		}
	
	/**
	* Default constructor.
	*/
	public ObjectFactory_3Test() {
	}
	
	/**
	* Tests whether creating an instance of a {@link Page } object is successful.
	*/	
	@Test
	public void testIsPageSuccessful() {
		assertFalse( _instance.createPage() == null);
	}
	
	/**
	* Tests whether creating an instance of a {@link Page } object is successful.
	*/	
	@Test
	public void testGetPaginationPage() {
		assertNotNull(_instance.createPage() instanceof Pagination);
	}
	
	/**
	* Tests whether creating an instance of a {@link StaticPage } object is successful.
	*/	
	@Test
	public void testIsStaticPageSuccessful() {
		assertNotNull( _instance.createPage().getPagination() instanceof StaticPage);
	}
	
	/**
	* Returns a non-null result of type {@link Pages}.
	*/	
	@Test
	public void testGetPages() {
		assertNotNull(_instance.createPages()!= null);
	}

}