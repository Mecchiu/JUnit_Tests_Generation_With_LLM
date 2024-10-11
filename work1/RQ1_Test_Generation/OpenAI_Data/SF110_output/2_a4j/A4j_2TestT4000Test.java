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
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is null.
		*/
		@Test
		void testKeywordSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch(null, "books", "lite", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is empty.
		*/
		@Test
		void testKeywordSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("", "books", "lite", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is invalid.
		*/
		@Test
		void testKeywordSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("invalid", "books", "lite", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid.
		*/
		@Test
		void testKeywordSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is null.
		*/
		@Test
		void testKeywordSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", null, "lite", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is empty.
		*/
		@Test
		void testKeywordSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "", "lite", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is invalid.
		*/
		@Test
		void testKeywordSearch_7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "invalid", "lite", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is valid.
		*/
		@Test
		void testKeywordSearch_8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is valid and the type is null.
		*/
		@Test
		void testKeywordSearch_9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", null, "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is valid and the type is empty.
		*/
		@Test
		void testKeywordSearch_10() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is valid and the type is invalid.
		*/
		@Test
		void testKeywordSearch_11() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "invalid", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is valid and the type is valid.
		*/
		@Test
		void testKeywordSearch_12() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is valid and the type is valid and the page is null.
		*/
		@Test
		void testKeywordSearch_13() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", null);
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is valid and the type is valid and the page is empty.
		*/
		@Test
		void testKeywordSearch_14() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is valid and the type is valid and the page is invalid.
		*/
		@Test
		void testKeywordSearch_15() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "invalid");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is valid and the product line is valid and the type is valid and the page is valid.
		*/
		@Test
		void testKeywordSearch_16() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "lite", "1");
				assertNotNull(productInfo);
		}
		
}

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
* It contains ten unit test cases for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_3Test {
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is null.
		*/
		@Test
		void testBlendedSearch_1() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch(null, "lite");
				assertNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is empty.
		*/
		@Test
		void testBlendedSearch_2() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("", "lite");
				assertNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is invalid.
		*/
		@Test
		void testBlendedSearch_3() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("invalid", "lite");
				assertNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is valid.
		*/
		@Test
		void testBlendedSearch_4() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite");
				assertNotNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is valid and the type is null.
		*/
		@Test
		void testBlendedSearch_5() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", null);
				assertNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is valid and the type is empty.
		*/
		@Test
		void testBlendedSearch_6() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "");
				assertNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is valid and the type is invalid.
		*/
		@Test
		void testBlendedSearch_7() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "invalid");
				assertNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is valid and the type is valid.
		*/
		@Test
		void testBlendedSearch_8() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite");
				assertNotNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is valid and the type is valid and the page is null.
		*/
		@Test
		void testBlendedSearch_9() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite", null);
				assertNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is valid and the type is valid and the page is empty.
		*/
		@Test
		void testBlendedSearch_10() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite", "");
				assertNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is valid and the type is valid and the page is invalid.
		*/
		@Test
		void testBlendedSearch_11() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite", "invalid");
				assertNull(blendedSearch);
		}
		
		/**
		* Test case for {@link A4j#BlendedSearch(String, String)} method.
		* It tests the case when the search term is valid and the type is valid and the page is valid.
		*/
		@Test
		void testBlendedSearch_12() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite", "1");
				assertNotNull(blendedSearch);
		}
		
}

// A4j_