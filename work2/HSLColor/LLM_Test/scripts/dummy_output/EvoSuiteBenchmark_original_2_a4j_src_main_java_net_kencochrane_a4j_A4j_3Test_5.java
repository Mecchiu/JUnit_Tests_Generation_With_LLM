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
	   * Constructor for {@link A4j_3Test}.
	   */
	  public A4j_3Test() {
	    }

		/**
	   * @since 1.0
	   * @param arg0 - Artist name to search for. 
	   * @param arg1 - music mode, should be one of "music", "classic",...
	   * @param arg2 - search page
	   * @return ProductInfo
	   */

	  ProductInfo ArtistSearch(String artistName, String mode, String page) {
		  return new ProductInfo(artistName, Search.ArtistSearch(artistName, mode, page));
	  }

        /**
         * Test if method {@link #ArtistSearch(String, String, String)} throws NullPointerException.
	  @since 0.1
	  @Test(expected=NullPointerException.class)
	  public void ProductInfo_ArtistSearch_NullArtistName() {
		 new ProductInfo(null, Search.ArtistSearch("test", "music", 1));
	  }

       /**
		 * Test if method {@link #ArtistSearch(String, String, String, Integer)} throws NullPointerException.
	  @since 0.1
	  @Test(expected=NullPointerException.class)
	  public void ProductInfo_ArtistSearch_NullMode() {
		 new ProductInfo("test", null);
	  }

		 /**
	   * Test if method {@link #ArtistSearch(String, String, String, Integer)} throws NullPointerException - invalid page number.
	   */
	  @Test(expected=NullPointerException.class)
	  public void ProductInfo_ArtistSearch_InvalidPage() {
		 new ProductInfo("test", Search.ArtistSearch("artist", Search.SearchMode.music, 0));
	  }

 }
// A4j_4Test.java
// ============