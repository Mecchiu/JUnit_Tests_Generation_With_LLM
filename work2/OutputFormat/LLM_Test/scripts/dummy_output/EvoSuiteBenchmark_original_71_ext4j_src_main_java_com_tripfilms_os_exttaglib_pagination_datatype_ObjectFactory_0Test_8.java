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
		 * Test of createPage method, of class ObjectFactory.
		 */
		@Test
		public void testCreatePage() {
			System.out.println("createPage");
			Pagination result = ObjectFactory.createPage();
			null!= result && result.getClass().getName().equals("com.tripfilms.os.exttaglib.pagination.datatype.Pagination");
			assertNotNull(result);
			
			StaticPage result1 = result.createStaticPage();
			assertNotNull(result1);
			
			Pages result2 = result.createPages();
			assertNotNull(result2);
			
			System.out.println("createPages");
			Pagination result4 = ObjectFactory.createPagination();
			assertNotNull(result4);
			
			StaticPage result5 = result1.createStaticPage();
			assertNotNull(result5);
			
			Pages result6 = result2.createPages();
			assertNotNull(result6);
		}
}