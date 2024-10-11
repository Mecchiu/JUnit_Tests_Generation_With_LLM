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
	* Test of ArtistSearch method, of A4j for an artist from search results.
	* This method is a test method of the class.
	* It contains one test case for the ArtistSearch method with an invalid artist name.
	*
	* @since 1.1-Initial version
	* @throws DAORuntimeException
	* @throws DAOException
	*/
	@SuppressWarnings("Convert2Diamond")
	@Test
	public void ArtistSearch_ArtistNameIsInvalid() throws DAOException, DAORuntimeException {
		
		System.out.println("ArtistName = " + ArtistSearch_ArtistName);
		try {
			ArtistSearch_ArtistName = null;
			fail("ArtistName is invalid");
		} catch (NullPointerException e) { 
		}
	}
	
	/**
	* Test of ArtistSearch method, of A4j for an artist with product info.
	* This method is a test method of the class.
	* It contains one test case for the ArtistSearch method with a product info object with no artistName, 
	* 			the search object has a product info object with a name of "Non-Artist name"
	*
	* @since 1.1-Initial version
	* @throws DAOException
	*/
	@SuppressWarnings("Convert2Diamond")
	@Test
	public void ArtistSearch_ProductInfoIsNoArtist() throws DAOException {
		
		Log.d("ArtistName = " + ArtistSearch_ProductInfo.artist);
		
		Search s = new Search();
		s.setPage(Search.CUR_PAGE);
		Cart sCart = new Cart();
		sCart.setResult(s);
		
		Product p = new Product();
		p.setName("Non-Artist name");
		p.setProductName("Non-Artist name");
		
		s.setCart(sCart);
		s.setProduct(p);
		p.setArtist(ArtistSearch_ArtistName);
		
		ProductInfo product = ArtistSearch_ProductInfo;
		product.setArtist(ArtistSearch_ArtistName);
		// Create a new DAO
		DAO.getInstance().addDAO(s);
		
		// Set the results in the DAO
		DAO.getInstance().setSearchResults(s);

		// Test DAO update()
		// Create a new DAO
		DAO.getInstance().addDAO(new Search());
		
		// Test DAO delete()
		// Delete all DAO
		if (DAO.getInstance().deleteAll()) {
			fail("DAO.getInstance().deleteAll()");
		}

		// Perform the DAO update
		DAO.getInstance().update();

		// Search the DAO
		log( "DAO.getInstance().deleteAll()");
		DAO.getInstance().deleteAll();

		// Test DAO delete()
		// Delete the DAO
		if (DAO.getInstance().delete()) {
			fail("DAO.getInstance().delete()");
		}

		// Test DAO set()
		// Set the DAO
		DAO.getInstance().set(DAO.PRODUCT, p);

		// Test DAO get()
		// Get the DAO
		DAO.getInstance().get();

		// Test ProductInfo in the DAO
		// Test Product info name
		log( "s.getProduct().getName() = "+ s.getProduct().getName());
		assertEquals("Unmatched Artist name", "Non-Artist name", s.getProduct().getName());
		
		// Test DAO remove()
		// Remove the DAO
		DAO.getInstance().remove();
		
		if (DAO.getInstance().deleteAll()) {
			fail("DAO.getInstance().deleteAll()");
		}
	}
	
	/**
	* Log test.
	* It contains another test case for the ArtistSearch method.
	* It contains one test case for a product info matching an artist with a name "Non-Artist name"
	* This test is a test case of the artistSearch method with a product info object with an artist name,
	* the search object has a product info object with a name of "Non-Artist name" 
	* The test case is also a test case of the ProductInfo object.
	*/
	@Test
	public void ArtistSearch_ProductInfo_ArtistNameIsInvalid() throws DAOException {
		
		System.out.println("ArtistName = " + ArtistSearch_ProductInfo.artist);

		try {
			ArtistSearch_ProductInfo.artist = null;
			fail("ArtistName is invalid");
		} catch (NullPointerException e) { 
		}
		
		log("ArtistName is " + ArtistSearch_ProductInfo.artist);
	}
}