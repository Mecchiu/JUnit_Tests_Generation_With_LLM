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
		* Create an instance of {@link ObjectFactory_0Test}
		*/
		ObjectFactory_0Test() {
		}
		/**
		* Create an instance of {@link ObjectFactory_0Test}
		* @return test case for the {@link ObjectFactory_0Test} class.
		* @param args the arguments.
		*/
		@Test
		public void testObjectFactory_0Test(String[] args) {
			Page obj0 = ObjectFactory_0Test.createPage();
			StaticPage obj1 = ObjectFactory_0Test.createStaticPage();
			Pagination obj2 = ObjectFactory_0Test.createPagination();
			Pages obj3 = ObjectFactory_0Test.createPages();
			assertNotNull("Expected a non-null result", obj0);
			assertNotNull("Expected a non-null result", obj1);
			assertNotNull("Expected a non-null result", obj2);
			assertNotNull("Expected a non-null result", obj3);
		}
	}