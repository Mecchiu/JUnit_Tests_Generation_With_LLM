// A4j_0Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_0Test {
		A4j_0Test() {};


		/**
		 * Test method for {@link A4j#BLENDED_SEARCH_SINGLE(String[],String,String)}.
		 */
		@Test
		public void testBLENDED_SEARCH_SINGLE(){
			A4j.BLENDED_SEARCH_SINGLE(new String[] { "test1", "test2", "test3" }, "blend", "");

		}


		/**
		 * Test method for {@link A4j#searchByMode(java.lang.String, org.apache.commons.lang3.String, org.apache.commons.lang3.String)}.
		 * It demonstrates that mode and param are parsed and there is no search string specified and mode not specified.
		 * @throws Exception
		 */
		@Test
		public void testBLENDED_SEARCH_BLEND_WHEN_NO_PARAM() throws Exception {
			Search se = new Search();
			Search se1 = new Search();
			se.setMode("test1");

			se1.setParameter("test2");

			assertNotNull(se1.getMode());
			assertTrue(se1.getSearchString().compareTo("test1&&test2")==0);
			assertEquals(se1.getMode(), "test1");
			assertNull(se1.getPage());
			assertNull(se1.getUserId());
			assertNull(se1.getSort());

			assertNotNull(se.getSearch());
			assertNotNull(se.getMode());
			assertTrue(se.getSearchString().compareTo("test1&&test2")==0);
			assertEquals(se.getMode(), "test1");
			assertNull(se.getPage());
			assertNull(se.getUserId());
			assertNull(se.getSort());

			assertNotNull(se1.getSearch());
			assertNotNull(se1.getMode());
			assertTrue(se1.getSearchString().compareTo("test1&&test2")==0);
			assertEquals(se1.getMode(), "test1");
			assertNull(se1.getPage());
			assertNull(se1.getUserId());
			assertNull(se1.getSort());

		}


		/**
		 * Test method for {@link A4j#searchByMode(java.lang.String, org.apache.commons.lang3.String, org.apache.commons.lang3.String)}.
		 * It demonstrates that there is only one parameter (userid and page) and that it is returned when search
		 * string contains key value pair separator character ("&").
		 * @throws Exception
		 */
		@Test
		public void testBLENDED_SEARCH_BLEND_WHEN_ONE_MESSAGE() throws Exception {
			Search se = new Search();
			Search se1 = new Search();
			se.setMode("test1");
			se1.setUserId("2");


			se1.setSearchString("UserId:2&&Page:123%%%");
			se1.getSearch();

			assertEquals(se.getSearchString(), "UserId:2&&Page:123%%%");
			assertNotNull(se.getPage());
			assertNotNull(se.getSort());
			assertNotNull(se1.getUserId());
			assertNotNull(se.getSort());
			assertEquals(se.getSort(), "Page:123%%%");
		}

		/**
		 * Test method for {@link A4j#BLENDED_SEARCH_BLEND_ALL(String[],String)}.
		 * It demonstrates that the search string does not have any search mode specified and all parameters are used.
		 * @throws Exception
		 */
		@Test
		public void testBLENDED_SEARCH_BLEND_ALL() throws Exception {

			Search se = new Search();
			Search se1 = new Search();
			se.setMode("All");
			se1.getSearch();

			assertTrue(se.getSearchString().contains("%")==false);
			assertEquals(se.getSearchString(), "%ALL%");
			assertEquals(se.getPage(), "");
			assertEquals(se1.getSearchString(), "1&&2");
			assertEquals(se1.getPage(), "%2%");
			assertEquals(se1.getSort(), "");
			assertNotNull(se1.getUserId());
			assertNotNull(se1.getSort());
			assertNotNull(se1.getSort());
			assertEqualsEquals(se1.getSort(), "Name:2&&Name:0&&Id:1");
			assertNotNull(se1.getSort("Name:2"));
			assertNotNull(se1.getSort("Name:2"));
			assertNotNull("1&&2", se1.getSort("Name:1|"));
		}

}