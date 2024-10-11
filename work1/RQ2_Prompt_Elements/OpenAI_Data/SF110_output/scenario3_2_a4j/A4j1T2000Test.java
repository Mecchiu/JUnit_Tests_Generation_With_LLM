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
	void testKeywordSearch_NullSearchTerm() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch(null, "books", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the search term is empty.
	*/
	@Test
	void testKeywordSearch_EmptySearchTerm() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("", "books", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the search term is invalid.
	*/
	@Test
	void testKeywordSearch_InvalidSearchTerm() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("invalid", "books", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the search term is valid.
	*/
	@Test
	void testKeywordSearch_ValidSearchTerm() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the product line is null.
	*/
	@Test
	void testKeywordSearch_NullProductLine() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", null, "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the product line is empty.
	*/
	@Test
	void testKeywordSearch_EmptyProductLine() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the product line is invalid.
	*/
	@Test
	void testKeywordSearch_InvalidProductLine() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "invalid", "lite", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the product line is valid.
	*/
	@Test
	void testKeywordSearch_ValidProductLine() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the type is null.
	*/
	@Test
	void testKeywordSearch_NullType() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", null, "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the type is empty.
	*/
	@Test
	void testKeywordSearch_EmptyType() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the type is invalid.
	*/
	@Test
	void testKeywordSearch_InvalidType() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "invalid", "1");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the type is valid.
	*/
	@Test
	void testKeywordSearch_ValidType() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the page is null.
	*/
	@Test
	void testKeywordSearch_NullPage() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", null);
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the page is empty.
	*/
	@Test
	void testKeywordSearch_EmptyPage() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the page is invalid.
	*/
	@Test
	void testKeywordSearch_InvalidPage() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "invalid");
		assertNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
	* It tests the case when the page is valid.
	*/
	@Test
	void testKeywordSearch_ValidPage() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
		assertNotNull(productInfo);
	}
}

// Cart.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM