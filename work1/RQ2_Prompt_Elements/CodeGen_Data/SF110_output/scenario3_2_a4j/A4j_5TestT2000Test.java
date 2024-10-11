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

		/**
		 * Test the AddtoCart(String, String) method
		 * 
		 * Example:
		 * 
		 * AddtoCart("id";"Quantity").
		 *
		 * @since 1.0.2
		 * @throws Exception 
		 */
		@Test
		public void AddtoCartTest() throws Exception {
			ShoppingCart cart = A4j.AddtoCart("id"; "Quantity");
			assertNotNull(cart);
			assertEquals("id", cart.getCartId());
			assertNotNull(cart.getProducts());
			Cart c4 = Cart.fromString("id"; "Quantity");
			assertNotNull(c4);
			assertTrue(c4.getProductIds().isEmpty());
			assertEquals("id", c4.getCartId());
			assertEquals("Quantity", c4.getQuotationStatus());
		}

		/**
		 * Test the Cart with quantity of 1.
		 *
		 * Unit test case for A4j.AddtoCart(String, String).
		 * 
		 * @throws Exception 
		 */
		@Test
		public void AddtoCartQuantityOne() throws Exception {
			ShoppingCart cart = A4j.AddtoCart("id", 1);
			assertNotNull(cart);
			assertEquals("id", cart.getCartId());
			assertNotNull(cart.getProducts());
			Cart c4 = Cart.fromString("id"; "") ;
			assertNotNull(c4);
			assertEquals(0, c4.getProductIds().size());
			assertEquals("Quantity 1", c4.getQuotationStatus());
		}

		/**
		 * Test the Cart with quantity of 3.
		 * Unit test case for A4j.AddtoCart(String, String).
		 * 
		 * @throws Exception 
		 */
		@Test
		public void AddtoCartQuantityThree() throws Exception {
			{
				ShoppingCart cart = A4j.AddtoCart("id", 3);
				assertNotNull(cart);
				assertEquals("id", cart.getCartId());
				assertNotNull(cart.getProducts());
				Cart c4 = Cart.fromString("id"; "") ;
				assertNotNull(c4);
				assertEquals(3, c4.getProductIds().size());
			}
			{
				ShoppingCart cart = A4j.AddtoCart("id", "Quantity");
				assertNotNull(cart);
				assertEquals("id", cart.getCartId());
				assertNotNull(cart.getProducts());
				Cart c4 = Cart.fromString("id"; "Quantity");
				assertNotNull(c4);
				assertEquals(3, c4.getProductIds().size());
			}
			{
				ShoppingCart cart = A4j.AddtoCart("id", 2);
				assertNotNull(cart);
				assertEquals("id", cart.getCartId());
				assertNotNull(cart.getProducts());
				Cart c4 = Cart.fromString("id"; "") ;
				assertNotNull(c4);
				assertEquals(3, c4.getProductIds().size());
				cart = A4j.AddtoCart("id", "Quantity");
				assertNotNull(cart);
				assertEquals("id", cart.getCartId());
				assertNotNull(cart.getProducts());
				c4 = Cart.fromString("id"; "Quantity");
				assertNotNull(c4);
				assertEquals(3, c4.getProductIds().size());
			}

		}

		/**
		 * Add to cart test for A4j.AddtoCart(String, String). 
		 * Units tests for A4j.Cart.fromString("cartid")
		 *
		 * @since 1.0.2
		 * @throws Exception 
		 */
		@Test
		public void AddtoCartTestWithUnit() throws Exception {
			{
				Cart c1 = A4j.Cart.fromString("cartid");
				assertNotNull(c1);
				assertTrue(c1.isEmpty());
			}
			{
				ShoppingCart c2 = A4j.AddtoCart("cartid", "Quantity");
				assertNotNull(c2);
				assertFalse(c2.isEmpty());
				c2.setUnits(0.10);
				assertTrue(c2.isEmpty());
			}
			{
				ShoppingCart c3 = A4j.Cart.fromString("cartid");
				assertNotNull(c3);
				assertFalse(c3.isEmpty());
				c3.setUnits(2.2 );
				assertTrue(c3.isEmpty());
			}
			{
				ShoppingCart c4 = A4j.Cart.fromString("cartid");
				assertNotNull(c4);
				Cart c5 = A4j.A4J.Cart.fromString("cartid");
				assertNotNull(c4);
				assertEquals(c5, c4.getShoppingCart());
				c4.setCartId("cartid");
				assertEquals(c5, c4.getShoppingCart());
				Cart c6 = A4j.Cart.fromString("cartid");
				assertNotNull(c6);
				assertTrue(Arrays.equals(c6.getCartIds(), new String[] {"art_id", "cartid"}));
			}
		}

		/**
		 * Test the Cart getShoppingCart(Cart) method
		 *
		 * @since 1.0
		 * @throws Exception 
		 */
		@Test
		public void CartGetShoppingCartTest() throws Exception {
			ShoppingCart c1 = A4j.NewCart("");
			assertNull(c1.getCartId());
			ShoppingCart c2 = A4j.Cart.fromString("cartid", "Quantity");
			assertEquals("cartid", c1.getCartId());
			assertNotNull(c2);
			c1.setCartId("cartid");
			ShoppingCart c3 = A4j.Cart.fromString("cartid", "Quantity");
			assertEquals("cartid", c1.getCartId());
			assertEquals("Quantity", c2.getQuotationStatus());
			assertNotEquals("cartid", c3.getCartId());
			assertNotEquals("cartid", c2.getCartId());
			assertNotEquals("cartid", c3.getCartId());
		}

}
