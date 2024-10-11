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
		/**
		 * Test all the methods
		 */
		@Test
		public void testGetProducts() {
			DAO a4jDAO = new DAO();

			// With no search term, search will start from the first result
			assertEquals("[Products] Should contain 4 records", 4, a4jDAO.getProducts(""));

			// Search with keyword
			BlendedSearch search = new BlendedSearch("a", "b");
			assertEquals(4, a4jDAO.getProducts(search));

			// Search with title
			search = new BlendedSearch("a.b.c.d.e", "b");
			assertEquals(4, a4jDAO.getProducts(search));

			// Search without keyword
			search = new BlendedSearch(null, "a.b");
			assertEquals(1, a4jDAO.getProducts(search).size());

			// Search with both keywords and titles
			search = new BlendedSearch("a.b.c.d.e, a.b.c.d.e.f", "a.b.d.e");
			assertEquals(4, a4jDAO.getProducts(search).size());

			// Search by keyword and title (both are empty)
			search = new BlendedSearch("a.b.c.d.e, a.b.c.d.e.f, a.b.d.e", "a.b.d.e");
			assertEquals(1, a4jDAO.getProducts(search).size());
		}
}