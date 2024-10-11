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
		private final A4j a3 = new A4j();

		@Test
		void testArtistSearch() {
				/**
				 * Case 1: searching a single artist
				 * 
				 * @author ralph
				 */
				assertEquals(new Artifact("Art", ProductInfo.ART, new ProductInfo("michael", 4)), a3.ArtistSearch("michael", "music", "1"));
				/**
				 * Case 2: searching a single artist
				 * 
				 * @author ralph
				 */
				assertEquals(new Artifact("Art", ProductInfo.ART, new ProductInfo("michael", 4)), a3.ArtistSearch("lenny", "music", "1"));
				/**
				 * Case 3: searching a multi-artist
				 * 
				 * @author ralph
				 */
				assertEquals(new Artifact("C", ProductInfo.LENCH, new ProductInfo("michael", 4)), a3.ArtistSearch("michael", "music",
					"1", "classic"));
		}
}