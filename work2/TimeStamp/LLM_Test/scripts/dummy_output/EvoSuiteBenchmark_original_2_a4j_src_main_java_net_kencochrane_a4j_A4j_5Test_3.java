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
		// Test cases ================================= ===================================================================

	/**
	 * Test of AddtoCart method, of class A4j.
	 */
	@Test
	void testAddToCart1() {
		A4j instance = new A4j();
		assertNotNull(instance.AddtoCart("Asin", "4"));
		assertEquals(1, instance.listProducts().size());
		assertEquals(2, instance.listCartItems(Cart.PRODUCT).size());
	}

	/**
	 * Test of AddtoCart method, of class A4j.
	 */
	@Test
	void testAddToCart2() {
		A4j instance = new A4j();
		assertNotNull(instance.AddtoCart("Asin", "4"));
		assertEquals(1, instance.listProducts().size());
		assertEquals(1, instance.listCartItems(Cart.PRODUCT).size());
	}




	// INSTANCES ================================= =================================================================

    public static A4j INSTANCE = new A4j();
	private A4j() {
	}
}