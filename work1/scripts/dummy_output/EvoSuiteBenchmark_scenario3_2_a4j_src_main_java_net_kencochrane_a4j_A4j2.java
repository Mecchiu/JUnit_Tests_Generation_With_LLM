// A4jTest.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testActorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
		assertEquals(productInfo.getActorName(), "Tom Hanks");
		assertEquals(productInfo.getMode(), "dvd");
		assertEquals(productInfo.getPage(), "1");
	}
}