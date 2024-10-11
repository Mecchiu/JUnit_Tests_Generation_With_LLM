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
		* Constructor for {@link A4j_5Test}.
		*/
	public A4j_5Test() {}

	/**
	 * 	Test to add to cart to your Shopping cart.
	*/
	@Test
	public void AddtoCartTest(){
		String asin = "ASin_001";
		String quantity = "100";
		ShoppingCart c1 = AddtoCart(asin, quantity);
		assertEquals("Cart 1", asin, c1.getA4j().get(asin));

		Product p = new Product(asin, quantity, "Test product");
		c1 = AddtoCart(p.getA4j().get(asin), quantity);
		assertEquals("Product 1", p, c1.getA4j().get(asin));
	}
}