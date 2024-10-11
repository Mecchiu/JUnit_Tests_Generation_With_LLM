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
	public void testCase() {
		// Test case A4j#AddtoCart(String, String)
		Product product = new Product();
		product.setASIN(new ASIN("0:54553676:4:43"));
		product.setPrice("12.89");
		ShoppingCart cart = new ShoppingCart();
		cart.put(product);
		String testName = "Name";
		String testQuantity = "Quantity";
		cart.add((new NewShoppingCart(testName, testQuantity)));
		assertEquals("Product 'Name'; Quantity " + testQuantity + "; A4j -> ShoppingCart", testName, cart.countAsin());		
		// Test case A4j#AddtoCart(String, Object)
		Cart newCart = new Cart();
		newCart.add((new Product(new ASIN("0:42:0:98:42")), testQuantity));
		return newCart;
	}
}