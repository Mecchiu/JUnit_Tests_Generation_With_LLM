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
		* ArtistArtistSearchTest.java
		* Test class of Search class to test for the search method of {@link A4jDAO}.
*/
	@Test
		public void searchArtistSearchTest(){
		
		DAO.ArtistSearch( "artist1", SearchMode.ALL, SearchPage.PAGE_1 );
		
	}	
}