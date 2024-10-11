// A4j_0Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_0Test {

	/**
	* Test case for the {@link A4j#BlendedSearch(String, String)} method.
	*/
	@Test
	void testBlendedSearch() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite");
		assertNotNull(blendedSearch);
		assertNotNull(blendedSearch.getRequest());
		assertNotNull(blendedSearch.getRequest().getIsValid());
		assertTrue(blendedSearch.getRequest().getIsValid());
		assertNotNull(blendedSearch.getRequest().getKeywords());
		assertEquals("java", blendedSearch.getRequest().getKeywords());
		assertNotNull(blendedSearch.getRequest().getPage());
		assertEquals("1", blendedSearch.getRequest().getPage());
		assertNotNull(blendedSearch.getRequest().getMode());
		assertEquals("BlendedSearch", blendedSearch.getRequest().getMode());
		assertNotNull(blendedSearch.getRequest().getTag());
		assertEquals("kencochra-20", blendedSearch.getRequest().getTag());
		assertNotNull(blendedSearch.getRequest().getType());
		assertEquals("lite", blendedSearch.getRequest().getType());
		assertNotNull(blendedSearch.getRequest().getDevtag());
		assertEquals("kencochra-20", blendedSearch.getRequest().getDevtag());
		assertNotNull(blendedSearch.getRequest().getSort());
		assertEquals("+salesrank", blendedSearch.getRequest().getSort());
		assertNotNull(blendedSearch.getRequest().getVariationPage());
		assertEquals("All", blendedSearch.getRequest().getVariationPage());
		assertNotNull(blendedSearch.getRequest().getLocale());
		assertEquals("us", blendedSearch.getRequest().getLocale());
		assertNotNull(blendedSearch.getTotalResults());
		assertEquals("1", blendedSearch.getTotalResults());
		assertNotNull(blendedSearch.getTotalPages());
		assertEquals("1", blendedSearch.getTotalPages());
		assertNotNull(blendedSearch.getDetails());
		assertNotNull(blendedSearch.getDetails().getProductLine());
		assertEquals("Books", blendedSearch.getDetails().getProductLine());
		assertNotNull(blendedSearch.getDetails().getDetails());
		assertNotNull(blendedSearch.getDetails().getDetails().getAsin());
		assertEquals("0596002815", blendedSearch.getDetails().getDetails().getAsin());
		assertNotNull(blendedSearch.getDetails().getDetails().getProductName());
		assertEquals("Java Cookbook", blendedSearch.getDetails().getDetails().getProductName());
		assertNotNull(blendedSearch.getDetails().getDetails().getCatalog());
		assertEquals("Book", blendedSearch.getDetails().getDetails().getCatalog());
		assertNotNull(blendedSearch.getDetails().getDetails().getAuthors());
		assertNotNull(blendedSearch.getDetails().getDetails().getAuthors().getAuthor());
		assertEquals("Ian F. Darwin", blendedSearch.getDetails().getDetails().getAuthors().getAuthor());
		assertNotNull(blendedSearch.getDetails().getDetails().getManufacturer());
		assertEquals("O'Reilly Media", blendedSearch.getDetails().getDetails().getManufacturer());
		assertNotNull(blendedSearch.getDetails().getDetails().getReleaseDate());
		assertEquals("2003-10-01", blendedSearch.getDetails().getDetails().getReleaseDate());
		assertNotNull(blendedSearch.getDetails().getDetails().getOurPrice());
		assertEquals("$31.47", blendedSearch.getDetails().getDetails().getOurPrice());
		assertNotNull(blendedSearch.getDetails().getDetails().getUsedPrice());
		assertEquals("$31.47", blendedSearch.getDetails().getDetails().getUsedPrice());
		assertNotNull(blendedSearch.getDetails().getDetails().getCollectiblePrice());
		assertEquals("$31.47", blendedSearch.getDetails().getDetails().getCollectiblePrice());
		assertNotNull(blendedSearch.getDetails().getDetails().getRefurbishedPrice());
		assertEquals("$31.47", blendedSearch.getDetails().getDetails().getRefurbishedPrice());
		assertNotNull(blendedSearch.getDetails().getDetails().getThirdPartyNewPrice());
		assertEquals("$31.47", blendedSearch.getDetails().getDetails().getThirdPartyNewPrice());
		assertNotNull(blendedSearch.getDetails().getDetails().getListPrice());
		assertEquals("$39.95", blendedSearch.getDetails().getDetails().getListPrice());
		assertNotNull(blendedSearch.getDetails().getDetails().getUsedAvailability());
		assertEquals("Usually ships in 24 hours", blendedSearch.getDetails().getDetails().getUsedAvailability());
		assertNotNull(blendedSearch.getDetails().getDetails().getCollectibleAvailability());
		assertEquals("Usually ships in 24 hours", blendedSearch.getDetails().getDetails().getCollectibleAvailability());
		assertNotNull(blendedSearch.getDetails().getDetails().getRefurbishedAvailability());
		assertEquals("Usually ships in 24 hours", blendedSearch.getDetails().getDetails().getRefurbishedAvailability());
		assertNotNull(blendedSearch.getDetails().getDetails().getThirdPartyNewAvailability());
		assertEquals("Usually ships in 24 hours", blendedSearch.getDetails().getDetails().getThirdPartyNewAvailability());
		assertNotNull(blendedSearch.getDetails().getDetails().getImageUrlSmall());
		assertEquals("http://images.amazon.com/images/P/0596002815.01.THUMBZZZ.jpg", blendedSearch.getDetails().getDetails().getImageUrlSmall());
		assertNotNull(blendedSearch.getDetails().getDetails().getImageUrlMedium());
		assertEquals("http://images.amazon.com/images/P/0596002815.01.MZZZZZZZ.jpg", blendedSearch.getDetails().getDetails().getImageUrlMedium());
		assertNotNull(blendedSearch.getDetails().getDetails().getImageUrlLarge());
		assertEquals("http://images.amazon.com/images/P/0596002815.01.LZZZZZZZ.jpg", blendedSearch.getDetails().getDetails().getImageUrlLarge());
		assertNotNull(blendedSearch.getDetails().getDetails().getCustomerReviewsUrl());
		assertEquals("http://www.amazon.com/reviews/iframe?akid=kencochra-20&alinkCode=xm2&asin=0596002815&atag=kencochra-20&exp=2010-08-01T02%3A00%3A00Z&v=2&sig=%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B