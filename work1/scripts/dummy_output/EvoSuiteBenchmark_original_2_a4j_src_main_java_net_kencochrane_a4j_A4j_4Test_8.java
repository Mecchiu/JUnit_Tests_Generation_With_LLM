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
		@Test
		void testAuthorSearch() {
				new A4j(cartDAO);
				final Cart cart = cartDAO.getCart("Test: Test");

				final ProductInfo productInfo = new ProductInfo();

				final String authorName = "John";
				final String productId = "0";
				final String name = "The Hitchhiker's Guide to the Galaxy";
				final String isbn = "1729471352";

				/**
				 * <p>
				 * Create a new Product with the specified values
				 * </p>
				 */
				final Product newInstance = new Product();

				/**
				 * Verify that the create() method returns the new
				 * ProductInfo.
				 */
				final ProductInfo newProduct = new ProductInfo();
				newInstance.setCreate(newProduct);

				/**
				 * Now test the properties of the product as they are given
				*/
				assertTrue(new instance.isIsbnNumberKnown(name));

				// Now test the properties being added as desired
				assertEquals(name, newProduct.getName());
				assertEquals(isbn, newProduct.getIsbnNumber());
				assertEquals(authorName, newInstance.getAuthor());
				assertEquals(0, newInstance.getQuantity());
				assertEquals(1, newInstance.getVariation());

				/**
				 * Verify that the name is a String type
				 */
				final Object newInstance2 = newInstance.getCreate();
				assertNotNull(newInstance2);
				assertEquals(newInstance2, productInfo);

				/**
				 * Verify the isbn number is a String type
				 *
				 * Also add a price
				 */
				final String price = newInstance.getPrice();
				assertEquals("1729471352", price);
				newInstance.setPrice("1729471352");
				assertEquals("1729471352", price);

				/**
				 * Now test the properties of the other two ProductInfo's that are added
				 */
				assertEquals("John", newInstance.getAuthor());
				assertEquals(0, newInstance.getQuantity());
				assertEquals(1, newInstance.getVariation());

				/**
				 * Now test that an initial quantity for the product is 1000
				 */
				final int initialQuantity = cart.getTotalQuantity(cart.getProduct("0"));
				assertEquals(1000, initialQuantity);
				newInstance.setQuantity(initialQuantity + 100);
				assertEquals(initialQuantity + 100, cart.getTotalQuantity(cart.getProduct("0")));
				newInstance.setQuantity(initialQuantity);
				assertEquals(initialQuantity, cart.getTotalQuantity(cart.getProduct("0")));
				new instance.destroy();

			}

			/**
			 * A utility class providing DAO functionality to the A4J object.
			*/
			private DAO.Cart cartDAO = new DAO.Cart();


			/**
			 * A utility class providing DAO functionality to the A4J object.
			 */
			private DAO.Product newInstance = new DAO.Product();

			/** A utility class providing DAO functionality to any DAO object. */
			private DAO.Cart cartDAO = new DAO.Cart();

			/** A utility class providing DAO functionality to the A4J object. */
			private DAO.Product newInstanceDAO = new DAO.ProductDAO();
}