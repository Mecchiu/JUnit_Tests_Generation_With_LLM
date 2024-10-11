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
		public static final int DEFAULT_PAGE = 1;
		
	/**
	 * Set up the test case.
	 */
	@Test
	public void testA4() {
		Search search = new Search();
		search.setParameter("name", "test");
		Product singleProduct = new Product();
		singleProduct.setId(1);
		singleProduct.setCategory(new Category("product-category-1"));
		singleProduct.setName("One");
		
		ProductCategory singleProductCat = new ProductCategory();
		singleProductCat.setId(1);
		singleProductCat.setName("product-category-1");
		singleProductCat.setDescription("description-1");
		
		ProductCategory multiProductCat = new ProductCategory();
		multiProductCat.setId(1);
		multiProductCat.setName("product-category-1", "description-2");
		multiProductCat.setDescription("description-2");
		
		
		search.setProductCategorySearchCriteria(new ProductCategorySearchCriteria());
		search.setProductCategorySearchCriteria().setCategory(new ProductCategory());
		search.setProductCategorySearchCriteria().getCategory().setName("product-category-2");
		
		SearchResult singleResult = new SearchResult();
		singleResult.setResultSet(new ProductResultSet());
		singleResult.getResultSet().getProductResultSet().add(singleProduct);
		
		// testBlended is called only if we get a result
		// the second argument specifies the page to be used
		// when results are paginated
		BlendedSearch blended = BlendedSearch("test", "lite");
		blended.setSearch(search);
		blended.setPage(2);

		// test search for single product
		// when running testBlended it should return an empty result set
		blended.setType("single");
		search = new Search();
		SearchResult singleResult2 = blended.search(search);

		assertEquals(singleResult.getResultSet().getProductResultSet().size(), singleResult2.getResultSet().getProductResultSet().size());
	}
}