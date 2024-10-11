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
		 * @param args the command line arguments
		 */
	public A4j_4Test(String[] args) { }

		/**
		 * Tests the {@link A4j#AuthorSearch} method
		 */
		@Test
		void AuthorSearchTest() {
			assertNotNull(AuthorSearch("John", "1"));
			assertNotNull(AuthorSearch("John", "2"));
			assertNotNull(AuthorSearch("John", "3"));
			assertNotNull(AuthorSearch("John", "99"));
			assertNull(AuthorSearch("John", "8"));
		}


		/**
		 * Test that a default page is returned
		 */
		@Test
		void AuthorSearchDefaultPageTest() {
			assertEquals("1", AuthorSearch("John", "", true).getPage());
		}


		/**
		 * Test a wrong page
		 */
		@Test
		void AuthorSearchWrongPageTest() {
			try {
				AuthorSearch("John", "98", true);
				fail();
			} catch (Exception ignored) {
				assertEquals("Page is not supported for author search.", ignored.getMessage());
			}
		}


		/**
		 * Test a correct page
		 */
		@Test
		void AuthorSearchCorrectPageTest() {
			assertEquals("1", AuthorSearch("John", "1", true).getPage());
		}


		/**
		 * Test the end of a product that is in the cart
		 */
		@Test
		void ProductSearchCartTest() {
			assertNull(ProductSearch("John", "1"));
			assertNotNull(ProductSearch("John", "2"));
			assertNotNull(ProductSearch("John", "3"));
			assertNotNull(ProductSearch("John", "4"));
			assertNotNull(ProductSearch("John", "99"));
		}


		/**
		 * Test the end of a product that is not in the cart
		 */
		@Test
		void ProductSearchCartNilTest() {
			assertNull(ProductSearch("John", "1"));
			try {
				ProductSearch("John", "2");
				fail();
			} catch (IllegalArgumentException ignored) {
			}
		}


		/**
		 * Test that a product with some search information can return a value.
		 */
		@Test
		void ProductSearchProductRetrievingTest() {
			assertEquals(
				"John",
				ProductSearch("John", "1", true).get(Cart.USER_PRODUCTS)
			);
		}

		/**
		 * Test that a product with some search information can return a value.
		 */
		@Test
		void ProductSearchCartReturningTest() {
			assertEquals("John, John, John",
				Cart.get(Cart.USER_PRODUCTS).get(Cart.USER_PRODUCTS));
		}

		/**
		 * Tests a product that is not in any cart
		 */
		@Test
		void ProductSearchCartCartNilTest() {
			assertNull(ProductSearch("John", "1"));
			try {
				Cart.get(Cart.USER_PRODUCTS);
				fail();
			} catch (IllegalArgumentException ignored) {
			}
		}

		/**
		 * Test the end of a search that is done by a product
		 */
		@Test
		void SearchCartTest() {
			assertNull(Search.get(Cart.USER_PRODUCTS).list());
		}


}