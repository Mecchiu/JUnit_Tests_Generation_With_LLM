// A4j_4Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_4Test {
/**
		 * Test code
		 * @since 1.0
		* @throws Exception
		 */
		@Test
		public void testCode() throws Exception {
				Search search = new Search();
				String productName = search.ProductName();

				ProductInfo info = search.PersonName("john", "Doe");
				assertEquals("john",info.Name());
				assertEquals("Doe",info.getFirstName());
				assertEquals("Barry",info.getLastName());
				assertEquals(productName,info.GetDisplayProduct());

				info = search.PersonName("John", "Doe");
				assertEquals("John",info.Name());
				assertEquals("Doe",info.getFirstName());
				assertEquals("Barry",info.getLastName());
				assertEquals(productName,info.GetDisplayProduct());
		}

		/**
		 * Test code
		 * @since 10.10.2013
		* @throws Exception
		 */
		@Test
		public void testClassImplements() throws Exception {
				var dao = new A4jDAO();
				assertNotNull(dao);
				assertTrue(dao.isInitialized());
				dao.begin();
				A4jDAO dao1 = new A4jDAO();
				dao1.prepare();
				A4jDAO dao2 = new A4jDAO();
				dao2.prepare();
				dao1.prepare();
				A4jDAO dao3 = new A4jDAO();
				dao3.prepare();
				dao3.commit();

				var dao4 = new A4jDAO();
				dao4.cleanUp();
				dao3.cleanUp();

				dao1.prepare();
				dao2.prepare();

				var info1 = dao1.PersonName("John", "Smith");
				var info2 = dao2.PersonName("John", "Smith");
				var info3 = dao1.AuthorSearch("John", "Smith");
				var info4 = dao1.AuthorSearch("John", "doe");
				assertTrue(info1.equals(info2));
				assertTrue(info1.equals(info3));
				assertTrue(info2.equals(info1));
				assertTrue(info3.equals(info1));

				assertTrue(info4.equals(info3));
				assertEquals(1, dao1.PersonSearchCount());
				assertEquals(1, dao2.PersonSearchCount());

				var info5 = dao1.PersonName("John", "johann");
				var info6 = "doe";
				var info7 = dao1.AuthorSearch(info5, info6);
				var info8 = dao1.AuthorSearch(info6, info7);

				assertEquals(info5,info6);
				assertNotSame(info6,info7);

				assertTrue(info5.equals(info6));
				assertEquals(info6,info8);

				info5 = dao1.ArtistSearch("John", "johann");
				assertTrue(info5.equals("johann"));

				assertTrue(info4.equals(info5));
				assertEquals(0, dao1.AuthorSearchCount());

				var myDAO = new A4jDAO();
				assertEquals(9,myDAO.PersonSearchCount());
		}
}