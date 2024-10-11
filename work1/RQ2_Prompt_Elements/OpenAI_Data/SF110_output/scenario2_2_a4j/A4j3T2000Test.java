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
	void testArtistSearch_artistNameIsNull() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch(null, "music", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is empty.
	*/
	@Test
	void testArtistSearch_artistNameIsEmpty() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("", "music", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is invalid.
	*/
	@Test
	void testArtistSearch_artistNameIsInvalid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("abc", "music", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid.
	*/
	@Test
	void testArtistSearch_artistNameIsValid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid and the mode is null.
	*/
	@Test
	void testArtistSearch_artistNameIsValidAndModeIsNull() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", null, "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid and the mode is empty.
	*/
	@Test
	void testArtistSearch_artistNameIsValidAndModeIsEmpty() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid and the mode is invalid.
	*/
	@Test
	void testArtistSearch_artistNameIsValidAndModeIsInvalid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "abc", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid and the mode is valid.
	*/
	@Test
	void testArtistSearch_artistNameIsValidAndModeIsValid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid, the mode is valid and the page is null.
	*/
	@Test
	void testArtistSearch_artistNameIsValidAndModeIsValidAndPageIsNull() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", null);
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid, the mode is valid and the page is empty.
	*/
	@Test
	void testArtistSearch_artistNameIsValidAndModeIsValidAndPageIsEmpty() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid, the mode is valid and the page is invalid.
	*/
	@Test
	void testArtistSearch_artistNameIsValidAndModeIsValidAndPageIsInvalid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "abc");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ArtistSearch(String, String, String)} method.
	* It tests the case when the artist name is valid, the mode is valid and the page is valid.
	*/
	@Test
	void testArtistSearch_artistNameIsValidAndModeIsValidAndPageIsValid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("Michael Jackson", "music", "1");
		assertNotNull(productInfo);
	}
}