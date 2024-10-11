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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testArtistSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
		assertEquals(productInfo.getArtistName(), "The Beatles");
		assertEquals(productInfo.getMode(), "music");
		assertEquals(productInfo.getPage(), "1");
	}
}