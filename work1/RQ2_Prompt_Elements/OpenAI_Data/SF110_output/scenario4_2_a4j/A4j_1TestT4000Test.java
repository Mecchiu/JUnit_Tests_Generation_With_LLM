// A4j_1Test.java
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
class A4j_1Test {

		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is null.
		*/
		@Test
		void testKeywordSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch(null, "books", "heavy", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is empty.
		*/
		@Test
		void testKeywordSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("", "books", "heavy", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_10() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
}

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
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is null.
		*/
		@Test
		void testKeywordSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch(null, "books", "heavy", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is empty.
		*/
		@Test
		void testKeywordSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("", "books", "heavy", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_10() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
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
* It contains ten unit test cases for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4j_3Test {
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is null.
		*/
		@Test
		void testKeywordSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch(null, "books", "heavy", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is empty.
		*/
		@Test
		void testKeywordSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("", "books", "heavy", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("java", "books", "heavy", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
		* It tests the case when the search term is not empty and not null.
		*/
		@Test
		void testKeywordSearch_7() {