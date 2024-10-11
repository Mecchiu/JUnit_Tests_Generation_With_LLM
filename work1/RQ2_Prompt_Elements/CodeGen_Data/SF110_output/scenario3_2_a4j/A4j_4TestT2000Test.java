// A4j_4Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_4Test {
@Test 
		public void testAuthorSearch() {
			final String authorName = "Chris";
			final String page = "5";
			final ProductInfo result = new ProductInfo(new Product(authorName), 8).setPageInfo(5, 7).setAuthorRanking(4);			
            
            final Search search = new Search("#A4J_4_Author_"+authorName+",$#A4J_4_Author_$#A4J_4_Article");				
            
			final Search search1 = new Search("#A4J_4_Author_"+authorName);			
			
//            result.setAuthorRanking(16).setArticleInfo(21, "This is test text");			
			
			final Cart cart = new Cart(3);

			search.setCart(cart);			
			final Product product = new Product("Chris","This is test text");
			final ProductInfo productInfo = new ProductInfo(product, 5).setPageInfo(5, 7);
			
			cart.add(productInfo);				
			
            cart.addSearch(search);

			final DAO a4jDAO = new Dao<ItemInfo>(ItemInfo.class);

			final ItemInfo resultItem = a4jDAO.find(itemInfoFrom(result));

			assertEquals(true, resultItem instanceof ItemInfo_4);
            
		}
	}