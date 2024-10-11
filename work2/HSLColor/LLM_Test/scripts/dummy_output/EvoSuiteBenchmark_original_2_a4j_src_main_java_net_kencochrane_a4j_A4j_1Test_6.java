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
* It contains one unit test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4j_1Test {
		/**
		* Test of KeywordSearch method, of class A4j.
		*/
		@Test
		public void testKeywordSearch() {
			System.out.println("KeywordSearch");

			// Arrange & Act
			A4j instance = new A4j("KeywordSearch");

			// Validate result
				assertEquals("Keywords don't match",
						instance.KeywordSearch("sales", "sales", "price1", "1"), "price1");
				assertEquals("Keywords don't match",
						instance.KeywordSearch("price:sales", "sales", "price2", "1"), new Long(22));

				return;
		}
	}