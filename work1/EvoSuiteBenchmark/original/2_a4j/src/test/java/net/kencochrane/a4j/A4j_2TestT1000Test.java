// A4j_2Test.java
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
class A4j_2Test {
	/**
			* Test case for {@link A4j#KeywordSearch(String, String, String, String)}.
			* It verifies that the method returns a {@link ProductInfo} object.
			*/
			@Test
			void testKeywordSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "books", "heavy", "1");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#KeywordSearch(String, String, String, String)}.
			* It verifies that the method returns a {@link ProductInfo} object with the correct number of items.
			*/
			@Test
			void testKeywordSearch2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "books", "heavy", "1");
				assertEquals(10, productInfo.getTotalResults());
			}

			/**
			* Test case for {@link A4j#KeywordSearch(String, String, String, String)}.
			* It verifies that the method returns a {@link ProductInfo} object with the correct number of pages.
			*/
			@Test
			void testKeywordSearch3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("Harry Potter", "books", "heavy", "1");
				assertEquals(1, productInfo.getTotalPages());
			}
}