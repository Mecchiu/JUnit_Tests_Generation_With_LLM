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

	final A4j testObject = new A4j();
	
	/**
	 * Unit test case for {@link A4j#ArtistSearch(String, String, String)}. It creates an instance of this
	 * class and performs checks on it.
	 *
	 * @throws Exception thrown when an error occurs.
	 */
	@Test
	public final void testArtistSearch() throws Exception {
		search(testObject.ArtistSearch("Moe", "music", "1"), "music");
		search(testObject.ArtistSearch("Moe", "music", "1"), "music");
		search(testObject.ArtistSearch("Coder", "music", "1"), "music");
		search(testObject.ArtistSearch("Moe", "fiction", "1"), "fiction");
		search(testObject.ArtistSearch("Moe", "fiction", "1"), "fiction");
		search(testObject.ArtistSearch("Moe", "fiction", "1"), "music");
		search(testObject.ArtistSearch("Moe", "fiction", "1"), "music");
	}
	
	/**
	 * Tests the {@link A4j#search(Search, String, Search)} method with a query to a DAO class which
	 * includes a class which is supposed to implement the {@link Search}, but which is not marked as
	 * implemented by the class' implementation.
	 * 
	 * @throws Exception thrown when an error occurs.
	 */
	@Test
	public final void testSearch() throws Exception {
		search("cat", "fiction");
		search("trio", "fiction");
		search("panda", "fiction");
	}
}