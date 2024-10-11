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

	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is null.
	*/
	@Test
	void testArtistSearch_1() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch(null, "music", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is empty.
	*/
	@Test
	void testArtistSearch_2() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("", "music", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is invalid.
	*/
	@Test
	void testArtistSearch_3() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("abc", "music", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid.
	*/
	@Test
	void testArtistSearch_4() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid.
	*/
	@Test
	void testArtistSearch_5() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid.
	*/
	@Test
	void testArtistSearch_6() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid.
	*/
	@Test
	void testArtistSearch_7() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid.
	*/
	@Test
	void testArtistSearch_8() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid.
	*/
	@Test
	void testArtistSearch_9() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid.
	*/
	@Test
	void testArtistSearch_10() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
}