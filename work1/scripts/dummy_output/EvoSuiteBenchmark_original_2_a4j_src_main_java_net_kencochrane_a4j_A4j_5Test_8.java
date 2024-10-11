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
		@Test
        public void testAddtoCart() {
			A4j a4j = new A4j();
				a4j.AddtoCart("asin", "1");
				Product product = new Product("asin", "a_name_1", "description_1");
				product.AddtoCart(null, "1");
				Product product2 = new Product("asin", "a_name_2", "description_2");
				Product parentProduct = new Product("asin", "parent", "description_parent");
				parentProduct.AddtoCart(null, "1");
				product2.AddtoCart(null, "1");
				Cart cart = new Cart();
				cart.GetProducts(new String[]{"asin"});
				assertTrue(cart.GetProducts().length == 1);
				testAddtoCart(new Product[]{product}, new Product[]{product2}, cart);
		}

		private void testAddtoCart(String[] products, String[] products2, Cart cart) {
				Cart.Order []orders = cart.GetOrders();
				for (Cart.Order order : orders) {
					if (order.GetProductID()!= null &&
					    (order.GetProductID().length == 1 &&
					        products2[0].equals(order.GetProductID())))
					{
						cart.AddProductToCart(
							order.GetProductID(),
							order.GetSubProductID(),
							order.GetItemID(),
							order.IsItemSold(),
							order.IsSold());
					}
				}
		}

				@Test
        public void testGetCart() {
				try {
					A4j.GetCart();
					fail();
				} catch (RuntimeException e) {
					assertEquals(null, e.getCause() instanceof A4jException);
				}
		}

				@Test
        public void testGetSearch() {
				try {
					A4j.Search();
					fail();
				} catch (RuntimeException e) {
					assertEquals(null, e.getCause() instanceof A4jException);
				}
		}

				@Test
        public void testAddToCartEmptyCart() {
				try {
					A4j.AddtoCart("a_name", "1");
					fail();
				} catch (RuntimeException e) {
					assertEquals(A4jException.class.getName(), e.getCause()
					       .getClassName());
				}
		}

}