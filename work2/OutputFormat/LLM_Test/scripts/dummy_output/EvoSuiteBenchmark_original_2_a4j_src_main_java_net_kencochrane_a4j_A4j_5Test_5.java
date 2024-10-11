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
	public void test() {
		// Call test
		TestBean.AddtoCart(2,5);
		// Check
		{
			Cart cart = TestBean.GetCart();
			assertNotNull(cart);
			assertTrue(cart.IsEmpty());
		}
	}
}