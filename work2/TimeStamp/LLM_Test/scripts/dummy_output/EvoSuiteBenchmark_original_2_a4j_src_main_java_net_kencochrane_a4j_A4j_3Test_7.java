// A4j_3Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_3Test {
		
	/**
	 * Test for {@link A4j#ArtistSearch(String, String, String)} method.
	 *
	 * @throws Exception
	 */
	@Test
	public void testArtistSearch() throws Exception {
    	A4j a = new A4j();
    	assertNotNull(a.ArtistSearch(0L, "music", "1"));
    }

}