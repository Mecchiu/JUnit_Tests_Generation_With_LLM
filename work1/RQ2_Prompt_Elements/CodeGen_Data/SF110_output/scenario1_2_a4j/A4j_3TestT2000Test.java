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

  
    private Search search = new Search();

    /**
     * Test case for {@link A4j#ArtistSearch(String, String, String)}.
     */
    @Test
    public void testArtistSearch() {

        ArtistsInfo ret = search.ArtistSearch("cat", "all", "2").getFirstResult();
		assertNotNull(ret);
        assertTrue(ret instanceof ArtistInfo);
        assertEquals("Cat", ((ArtistInfo) ret).getArtistName());
        assertEquals("all", ((ArtistInfo) ret).getMode());
		assertEquals(2, ((ArtistInfo) ret).getTotalPageNumber());
		assertNotNull(((ArtistInfo) ret).getArticleList());
		assertNotNull(((ArtistInfo) ret).getSearchList());
        assertNotNull(((ArtistInfo) ret).getArtists());
		
	}  
	
	
}// End class A4j_3Test