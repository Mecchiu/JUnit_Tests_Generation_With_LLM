// A4j_5Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#AddtoCart(String, String)} method.
*/
class A4j_5Test {
A4j_5Test() {
			cart.AddtoCart("", "");
		}
		/**
		 * This method tests if {@link A4j#AddtoCart(String, String)}
		 * method adds a <c>asin</c> to your Cart and returns the <c>cart</c>
		 * object instead.
		 * 
		 * @since 1.0
		 * @throws Exception
		 */
		@Test
		void AddtoCart() throws Exception {
			cart.AddtoCart("", "");
			Cart<Product> cart = cart.GetCartBySearch("asin");
			assertTrue("cart has no asin", cart.GetFoundObjects().size() == 0);
		}

		/**
		 * This method returns the cart object of a <c>cart</c> and checks if
		 * it contains a asin id. If it does not get a valid ID then it throws an
		 * exception.
		 * 
		 * @since 1.0
		 * @throws Exception
		 */
		@Test
		void cartAsin() throws Exception {
			Cart cart = cart.GetCars(cart.GetProducts(),
					new Cart.CartSearch().SetType("Search"));
			assertTrue("cart does not contain an asin", cart.GetIds().size() > 0);

			cart.GetProductsByIds().forEach(p -> {
					assertTrue("cart does not contain an asin", cart.GetIds().contains(p.GetId()));
			});
			
			/**
			 * If no asin is returned from the <c>cart</c> then an exception is
			 * thrown.
			 */
			assertThrows("cart should not contain null asin", NullPointerException.class, () -> cart.GetIds().contains(null));
		}

		/**
		 * This method adds an <c>asin</c> to the cart and returns the cart of a
		 * valid product
		 * 
		 * @since 1.0
		 * @throws Exception
		 */
		@Test
		void addToCart() throws Exception {
			cart.AddtoCart("", "");
			Cart cart = cart.GetCartBySearch("asin");
			assertTrue("cart has not asin", cart.GetIds().size() > 0);
		}
}		
