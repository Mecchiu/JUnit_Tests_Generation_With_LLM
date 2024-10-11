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
		public void testKeywordSearch_searchTermIsNull() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch(null, "", "", "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is empty.
		*/
		@Test
		public void testKeywordSearch_searchTermIsEmpty() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("", "", "", "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty.
		*/
		@Test
		public void testKeywordSearch_searchTermIsNotEmpty() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", "", "", "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the product line is null.
		*/
		@Test
		public void testKeywordSearch_productLineIsNull() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", null, "", "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the product line is empty.
		*/
		@Test
		public void testKeywordSearch_productLineIsEmpty() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", "", "", "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the product line is not empty.
		*/
		@Test
		public void testKeywordSearch_productLineIsNotEmpty() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", "test", "", "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the type is null.
		*/
		@Test
		public void testKeywordSearch_typeIsNull() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", "test", null, "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the type is empty.
		*/
		@Test
		public void testKeywordSearch_typeIsEmpty() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", "test", "", "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the type is not empty.
		*/
		@Test
		public void testKeywordSearch_typeIsNotEmpty() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", "test", "test", "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the page is null.
		*/
		@Test
		public void testKeywordSearch_pageIsNull() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", "test", "test", null);
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the page is empty.
		*/
		@Test
		public void testKeywordSearch_pageIsEmpty() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", "test", "test", "");
				assertEquals(0, productInfo.getProductList().size());
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the page is not empty.
		*/
		@Test
		public void testKeywordSearch_pageIsNotEmpty() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("test", "test", "test", "test");
				assertEquals(0, productInfo.getProductList().size());
		}
}