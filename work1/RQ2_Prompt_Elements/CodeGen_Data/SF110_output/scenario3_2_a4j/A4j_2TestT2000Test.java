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
* It contains one unit test case for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_2Test {
/**
		 * Simple test case for {@link A4j#ActorSearch(String, String, String)}.
		 *
		 * @since 1.0
		 * @test_category models
		 * @jav_raw_testclass A4j_Test
		*/
		@Test
		public void ActorSearch_SimpleTest() {
			final String actor = "test_actor";
			final String mode = "test_mode";
			final String page = "test_page";
			final ActorInfo actorInfo = new ActorInfo(actor, mode, page);

			final ProductInfo productInfo = new ProductInfo();
			final Product product = new Product(productInfo);
			final Search search = new Search(mode, page);

			final ProductInfo searchIn = search.Search();
			assertNotNull(searchIn);
			assertEquals(mode, searchIn.SearchMode.getMode());
			assertEquals(page, searchIn.SearchPage);

			final Cart cartInfo = new Cart();
			final Cart cart = new Cart(cartInfo, product, search);

			final ProductProductInfo prodInfo = new ProductProductInfo();
			final ProductProduct prod = new ProductProduct(prodInfo);
			final ProductInfoProduct prodIn = new ProductInfoProduct(prod);

			final SearchProductInfo searchInProductInfo = new SearchProductInfo();
			final Search searchInProduct = new Search(searchInProductInfo, prod);

			final ProductProductInfo searchInProd = new ProductProductInfo();
			final Product searchInProd2 = new ProductInfoProduct(searchInProductInfo);

			cart.add(product);
			search.Search();
			cart.add(searchInProduct);
			searchInProduct.Search();

			cart.add(searchInProd);
			searchInProd.Search();

			prod.Search();
			search.Search();

			new A4j().ActorSearch(actor, mode, page).Search();
			new A4j().ActorSearch(actor, mode, page + 1).Search();
			new A4j().ActorSearch(actor, mode, 1).Search();

			final String testMessage = message();
			assertEquals("Actor " + actor + " didn't match\n";
			assertEquals(testMessage, testMessage);
		}

		@AfterEach
		public void cleanUp() throws Exception {

		}
}
