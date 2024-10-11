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
* It contains one unit test case for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_3Test {
		/**
		* Returns {@link A4j#ArtistSearch(String, String, String) ProductInfo}
		* @param artistName - artist name to search for.
		* @param mode (music, classical)
		* @param page 1 2 3 etc.
		* @return {@link A4j#ArtistSearch(String, String, String)}
		* @since 1.0
		*/
		public ProductInfo ArtistSearch(String artistName, String mode, String page) {
			/* TODO:
			 * we should have separate unit test for the ArtistSearch(String,String,String) method.
			 */
   			Search search = new Search();

   			Search.setAscDesc("artistname");
   			search.setPage(page);
   			//Search.setSearchType(Search.ISOBJECT_NAME);
   			search.setSearchObjList(new Object[]{new Object[]{artistName}});
			
   			Cart cart = new Cart();

   			cart.setAscDesc("search");
   			//cart.setSearchObjList(new Search.SearchCriteria[]{search});
   			cart.setAscDesc("mode");
   			//cart.setSearchObjList(new Search.SearchCriteria[]{search});
   			Cart.setObjects(new Cart.CartObject[]{search});

   			Search search2 = new Search();

   			search2.setAscDesc("mode");
   			search2.setSearchObjList(new Object[]{new Object[]{mode}});
   			Cart.addScorable(cart);

   			return new A4j_3_ProductInfo(cart, search2);
		}

		/**
		* Returns {@link A4j#ArtistSearch(String, String) ProductInfo}
		* @param artistName - artist name to search for.
		* @param mode (music, classical)
		* @param page 1 2 3 etc.
		* @return {@link A4j#ArtistSearch(String,String) ProductInfo}
		* @since 1.0
		*/
		public ProductInfo ArtistSearch(String artistName) {
			return ArtistSearch("", "music", "1");
		}
}