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
		
	@Test
	void testActorSearch( ) {
		ActorInfo actorInfo = new ActorInfo();
		String actorName = "HIGH SCO MATHEL";
		
		String productId = "MUSIC_DRUM";
		String productCode = "Music Drum";
		boolean isVhs = true;
		boolean isDvd = false;
		
		Search search = new Search(isVhs, isDvd, getType());
		Search.Results results = isVhs? search.FindForActor(actorName, Product.Type.HDV)
				: search.FindForActor(actorName, Product.Type.DVDA);
		assertTrue(!results.IsFiltered());

		search = new Search(isDvd, isVhs, getType());
		results = search.FindForActor(actorName, Product.Type.HDV);
		assertTrue(!results.IsFiltered());
		
		search = new Search(productId);
		results = search.FindForProduct(productId);
		assertTrue(!results.IsFiltered());
		
		search = new Search(productId);
		results = search.FindForProduct(productId);
		assertTrue(results.IsFiltered());
		
		search = new Search();
		results = search.FindForActor(actorName, Product.Type.HDV, Product.Type.HDV);
		assertTrue(!results.IsFiltered());
		
		search = new Search();
		results = search.FindForActor(actorName, Product.Type.HDV, Product.Type.DVDA);
		assertTrue(!results.IsFiltered());
		
		search = new Search();
		results = search.FindForActor(actorName, Product.Type.DVD, Product.Type.HDV);
		assertTrue(!results.IsFiltered());
		
		search = new Search();
		results = search.FindForActor(actorName, Product.Type.DVD, Product.Type.HDV);
		assertTrue(results.IsFiltered());
		
		search = new Search();
		results = search.FindForProduct(productId);
		assertTrue(!results.IsFiltered());
		
		search = new Search();
		results = search.FindForProduct(productId);
		assertTrue(results.IsFiltered());
		
		search = new Search();
		results = search.FindForProduct(productId);
		assertTrue(results.IsFiltered());
	}
	
	private String getType() {
		return isVhs? "VideoHDV" : "VideoHDV1";
	}
	
	@Test
	void testActorSearchAndFindForProductByPdId( ) {
		ActorInfo actorInfo = new ActorInfo();
		String actorName = "THE HIGH SCO MATHEL";
		
		String productId = "MUSIC_DRUM";
		String productCode = "Music Drum";
		boolean isVhs = true;
		boolean isDvd = false;
		
		Search search = new Search(isVhs, isDvd, getType());
		Search.Results results = isVhs? search.FindForActor(actorName, Product.Type.HDV)
				: search.FindForActor(actorName, Product.Type.DVDA);
		assertTrue(!results.IsFiltered());

		search = new Search(isDvd, isVhs, getType());
		results = search.FindForActor(actorName, Product.Type.HDV);
		assertTrue(!results.IsFiltered());
		
		result = results.First();
		assertEquals("The MED", result.getActor());
		
		results = search.FindForProduct(productId);
		assertEquals("Musica Drum", results.First().getProductCode());
		
		productInfo = search.FindForProduct(productId).First();
		assertTrue(productInfo!= null);
		assertEquals(productInfo.getId(), productId);
		
		result = results.First();
		assertEquals("THE HIGH SCO MATHEL", result.getActor());
		result = results.First().First();
		assertEquals("THE HIGH SCO MATHEL", result.getActor());
	}
}