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
* It contains one unit test case for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_0Test {
		/**
		 * Basic search test: a blended search should return up to the number of
		* results on the most important product category.
		*/
		@Test
		public void testBlendedSearch() {
				final String searchTerm = "testSearch";
				final String id = "1";
				final String type = "heavy";
				final BlendedSearch search = BlendedSearch(searchTerm,  type);

				assertEquals("Test blended search should return up to the number of results at most on product category 1", "1", search.search(id));
		}

		/**
		 * The BlendedSearch should return only the number of results in a single query.
		 * There may be a result for different result types such as "heavy or lite" and "heavy and lite"
		 * on a single search.
		* @see A4j#BlendedSearch(String, String)
		*/
		@Test
		public void testBlendedNoQuery() {
				final String id = "1";
				final String type = "heavy";
				final String searchTerm = "a";
				final BlendedSearch search = BlendedSearch(searchTerm, type);

				assertEquals("Test blended no result return one result per query", 1, search.search(id));
		}

}