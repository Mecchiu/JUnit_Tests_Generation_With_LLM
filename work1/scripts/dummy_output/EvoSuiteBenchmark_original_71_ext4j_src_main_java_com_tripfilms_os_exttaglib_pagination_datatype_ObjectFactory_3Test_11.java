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
		 * It contains one unit test case for the {@link ObjectFactory#createPagination()} method.
		 */
		@Test
		public void test_createPagination(){
			Page pagination = createPagination();
			assertNotNull("Create pagination", pagination);
			Pagination pagination2 = createPagination();
			System.out.println("TESTCASE PAGINATION1");
			System.out.println(pagination);
			System.out.println("TESTCASE PAGINATION2");
			System.out.println(pagination2);
			assertNotNull("Create pagination", pagination);
			assertNotNull("Create pagination2", pagination2);
		}

		/**
		 * It contains one unit test case for the {@link ObjectFactory#createPages()} method.
		 */
		@Test
		public void test_createPages(){
			Page pagination = createPagination();
			assertNotNull("Create pagination", pagination);
			Pagination pagination2 = createPagination();
			System.out.println("TESTCASE PAGINATION1");
			System.out.println(pagination);
			System.out.println("TESTCASE PAGINATION2");
			System.out.println(pagination2);
			assertNotNull("Create pagination", pagination);
			assertNotNull("Create pagination2", pagination2);
		}

		/**
		 * It contains one unit test case for the {@link ObjectFactory#createPagination()} method.
		 */
		@Test
		public void test_createPagination_null(){
			Page pagination = createPagination();
			assertNotNull("Create pagination", pagination);
			Pagination pagination2 = null;
			System.out.println("TESTCASE PAGINATION1");
			System.out.println(pagination);
			System.out.println("TESTCASE PAGINATION2");
			System.out.println(pagination2);
			assertNotNull("Create pagination", pagination);
			assertNull("Create pagination2", pagination2);
		}
		
}