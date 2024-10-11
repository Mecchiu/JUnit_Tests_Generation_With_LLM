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
		 * Test cases: testBlendedSearch1 - return blended search with single product category
		*/
		@Test
		void testBlendedSearch1(){
			final String keyword = "keyword";
			final String category1 = "category1";
			final String category2 = "category2";
			String keyword2 = "cwc";
			String category3 = "category3";
			String name1 = "test_name1";
			String name2 = "test_name2";
			String name3 = "test_name3";
			String description1 = "test1";
			String description2 = "test2";
			String description3 = "test3";
			String product1 = "product1";
			String product2 = "product2";
			String product3 = "product3";
			String product4 = "product4";
			String product5 = "product5";
			int page = 2;
			String mode = "a";
			String searchKey = "query";
			DAO dao = new DAO();

			// Add a search that will run across 2 categories
			dao.add(keyword, category1, name1, description1);
			dao.add(keyword, category2, name2, description2);
			dao.add(keyword, category3, name3, description3);

			// Test blended Search
			BlendedSearch blendedSearch = dao.blendedSearch(keyword, category1, name1, description1, mode, searchKey, (page));
			assertNotNull(blendedSearch);
			assertEquals(blendedSearch.getSearchMode(), "a");
			assertEquals(blendedSearch.getPage(), 2);

			blendedSearch = dao.blendedSearch(keyword, category1, name1, description2, mode, searchKey, (page));
			assertNotNull(blendedSearch);
			assertEquals(blendedSearch.getSearchMode(), mode);
			assertEquals(blendedSearch.getPage(), 2);
	
			blendedSearch = dao.blendedSearch(keyword, category2, name2, description2, mode, searchKey, (page));
			assertNotNull(blendedSearch);
			assertEquals(blendedSearch.getSearchMode(), mode);
			assertEquals(blendedSearch.getPage(), 1);
	
			blendedSearch = dao.blendedSearch(keyword, category2, name2, description3, mode, searchKey, (page));
			assertNotNull(blendedSearch);
			assertEquals(blendedSearch.getSearchMode(), mode);
			assertEquals(blendedSearch.getPage(), 1);

			blendedSearch = dao.blendedSearch(keyword, category2, name3, description3, title, description2);
			assertNotNull(blendedSearch);
			assertEquals(blendedSearch.getSearchMode(), searchKey == null? "a" : "b");
			assertEquals(blendedSearch.getSearchKey(), searchKey);
			assertEquals(blendedSearch.getPage(), 2);
	
			blendedSearch = dao.blendedSearch(keyword, category3, name3, description3, title, description3);
			assertNotNull(blendedSearch);
			assertEquals(blendedSearch.getSearchMode(), "a");
			assertEquals(blendedSearch.getSearchKey(), searchKey);
			assertEquals(blendedSearch.getPage(), 1);
	}
}