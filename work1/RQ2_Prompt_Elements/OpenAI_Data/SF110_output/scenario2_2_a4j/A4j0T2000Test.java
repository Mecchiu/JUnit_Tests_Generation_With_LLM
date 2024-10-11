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
* It contains ten unit test cases for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4jTest {

	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is null.
	*/
	@Test
	void testBlendedSearch_NullSearchTerm() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch(null, "lite");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is empty.
	*/
	@Test
	void testBlendedSearch_EmptySearchTerm() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("", "lite");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is invalid.
	*/
	@Test
	void testBlendedSearch_InvalidSearchTerm() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("invalid", "lite");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite");
		assertNotNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is null.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_NullType() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("java", null);
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is empty.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_EmptyType() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("java", "");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is invalid.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_InvalidType() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("java", "invalid");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is heavy.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_HeavyType() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("java", "heavy");
		assertNotNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is lite.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_LiteType() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite");
		assertNotNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is heavy.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_HeavyType_ValidResult() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("java", "heavy");
		assertNotNull(blendedSearch);
		assertNotNull(blendedSearch.getBlendedSearchResult());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0));
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getAsin());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getAuthor());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getManufacturer());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getProductName());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getReleaseDate());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getSmallImage());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getSmallImage().getUrl());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getSmallImage().getHeight());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getSmallImage().getWidth());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getMediumImage());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getMediumImage().getUrl());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getMediumImage().getHeight());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getMediumImage().getWidth());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getLargeImage());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getLargeImage().getUrl());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getLargeImage().getHeight());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getLargeImage().getWidth());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getListPrice());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getListPrice().getAmount());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getListPrice().getCurrencyCode());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getListPrice().getFormattedPrice());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getOfferSummary());
		assertNotNull(blendedSearch.getBlendedSearchResult().getBlendedSearchResult().get(0).getOfferSummary().getLowestNewPrice());
	