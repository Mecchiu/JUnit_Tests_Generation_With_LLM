// ObjectFactory_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPagination()} method.
*/
class ObjectFactory_2Test {
		private void assertCreatePagination(Pagination pagination,String expected){
			assertEquals(pagination, ObjectFactory.createPagination(expected));
		}

		@Test
		public void testGetStaticValueEmpty(){
			assertTrue(ObjectFactory.getStaticValue(null).equalsIgnoreCase("null"));
		}
		
		@Test
		public void testGetStaticValueAll(){
			assertTrue(ObjectFactory.getStaticValue("").equalsIgnoreCase("all"));
		}
		
		@Test
		public void testGetPaginated(){
			assertNotNull(ObjectFactory.getPaginated(10));
		}

		@Test
		public void testGetPaginated2(){
			String[] expectedPage={"12", "6", "6", "", "", "", "", "", "", "", "", "", "", "", ""};
			ObjectFactory.Paginated paginated = ObjectFactory.getPaginated(expectedPage,"10px");
			assertEquals(paginated.getValue(), "10");
			assertEquals(paginated.getColumns(), "12-24-6-6-6-120-120-2");
		}

		@Test
		public void testGetPaginated3(){
			String[] expectedPage={"120", "8", "", "", "", "", "", "", "", "", "", "", "", ""};
			ObjectFactory.Paginated paginated = ObjectFactory.getPaginated(expectedPage,"10");
			assertEquals(paginated.getValue(), "100");
			assertEquals(paginated.getColumns(), "40-80-0-0-0-0-0-2");
		}
}