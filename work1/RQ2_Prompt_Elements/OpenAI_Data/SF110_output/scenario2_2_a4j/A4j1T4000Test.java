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
* It contains ten unit test cases for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4jTest {

	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the search term is null.
	*/
	@Test
	void testKeywordSearch_searchTermIsNull() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch(null, "books", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the search term is empty.
	*/
	@Test
	void testKeywordSearch_searchTermIsEmpty() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("", "books", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the search term is invalid.
	*/
	@Test
	void testKeywordSearch_searchTermIsInvalid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("invalid", "books", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the search term is valid.
	*/
	@Test
	void testKeywordSearch_searchTermIsValid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the product line is null.
	*/
	@Test
	void testKeywordSearch_productLineIsNull() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", null, "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the product line is empty.
	*/
	@Test
	void testKeywordSearch_productLineIsEmpty() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the product line is invalid.
	*/
	@Test
	void testKeywordSearch_productLineIsInvalid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "invalid", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the product line is valid.
	*/
	@Test
	void testKeywordSearch_productLineIsValid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the type is null.
	*/
	@Test
	void testKeywordSearch_typeIsNull() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", null, "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the type is empty.
	*/
	@Test
	void testKeywordSearch_typeIsEmpty() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the type is invalid.
	*/
	@Test
	void testKeywordSearch_typeIsInvalid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "invalid", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the type is valid.
	*/
	@Test
	void testKeywordSearch_typeIsValid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the page is null.
	*/
	@Test
	void testKeywordSearch_pageIsNull() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", null);
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the page is empty.
	*/
	@Test
	void testKeywordSearch_pageIsEmpty() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the page is invalid.
	*/
	@Test
	void testKeywordSearch_pageIsInvalid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "invalid");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the page is valid.
	*/
	@Test
	void testKeywordSearch_pageIsValid() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
		assertNotNull(productInfo);
	}
}