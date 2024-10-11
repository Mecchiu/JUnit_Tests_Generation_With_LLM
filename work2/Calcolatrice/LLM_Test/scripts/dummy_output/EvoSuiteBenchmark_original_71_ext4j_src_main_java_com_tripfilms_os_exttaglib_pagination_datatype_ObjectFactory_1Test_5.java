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
		* Creates a new instance of {@link ObjectFactory_1Test} taking 
		* {@link Page} as parameter.
		*/
	@Test
	void createPage() {
		Page page =  ObjectFactory.createPage(staticField);
		assertNotNull(page);
	}


	/**
	* Create an instance of {@link ObjectFactory_1Test} taking 
	* {@link StaticPage} as parameter.
	*/
	@Test
	void createStaticPage() {
		StaticPage staticPage =  ObjectFactory.createStaticPage();
		assertNotNull(staticPage);
	}


	/**
	* Create an instance of {@link ObjectFactory_1Test} taking 
	* {@link Pagination} as parameter.
	*/
	@Test
	void createPagination() {
		Pagination pagination =  ObjectFactory.createPagination();
		assertNotNull(pagination);
	}


	/**
	* Create an instance of {@link ObjectFactory_1Test} taking 
	* {@link Pages} as parameter.
	*/
	@Test
	void createPages() {
		Pages pages = ObjectFactory.createPages();
		assertNotNull(pages);
	}
}