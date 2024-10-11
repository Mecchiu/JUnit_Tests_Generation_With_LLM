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
	* Constructor
	*
	* @since 1.0
	*/
	public A4j_3Test() {
		System.out.println ("A4J_3TEST_Constructor");
	}

	/**
	* Constructor Tested by {@link #ArtistSearch(String, String, String)}.
	* @param search - {@link net.kencochrane.a4j.DAO.Search}
	* @since 1.0
	*/
	public A4j_3Test(Search search) {
		System.out.println ("A4J_3TEST_Constructor Tested by " + search.toString());
	}

	/**
	* Test ArtistNameSearch of An A4J Product
	*
	* @since 1.0
	* @since 1.0
	* @throws Exception
	*/
	@Test
	public void testArtistNameSearch() throws Exception {

        String artistName = "KoenCochrane";
		System.out.println ("ArtistNameSearch");
        Search search = new Search(new ProductInfoList(), artistName, mode);
        ProductInfo test = ArtistNameSearch(artistName, mode, "1");
        assertEquals ("artistName", artistName, search.toString());
        assertEquals ("ProductInfo", test, search.toString());
	}

	/**
	* Test SongNameSearch of An A4J Product
	*
	* @since 1.0
	* @since 1.0
	* @throws Exception
	*/
	@Test
	public void testSongNameSearch() throws Exception {

        String songName = "Chorizo";
		System.out.println ("SongNameSearch");
        Search search = new Search(new ProductInfoList(), songName, mode);
        ProductInfo test = SongNameSearch(songName, mode, "1");
        assertEquals ("songName", songName, search.toString());
        assertEquals ("ProductInfo", test, search.toString());
	}

        /**
         * Test Search() for ProductInfoList.
         *
         * @since 1.0
         */
        @Test
        public void testSearch() {

            Search search = new Search(new ProductInfoList(), "KoenCochrane", mode);
            // test default case
            assertTrue (true);
        }

        /**
         * Test Search() for ProductInfoList.ArtistNameSearch()
         * @throws Exception
         * @since 1.0
         */
        @Test
        public void testArtistNameSearch() throws Exception {

            String artistName = "KoenCochrane";
            // test default case
            Search search = new Search(new ProductInfoList(), artistName, mode);
            ProductInfo test = ArtistNameSearch(artistName, mode, "1");
            assertEquals("artistName", artistName, search.toString());
            assertEquals("ProductInfo", test, search.toString());
            TestSuite t = new TestSuite.Builder()
                   .appendParameter
                   .appendParameter
                   .appendParameter
                   .appendParameter()
                   .appendParameter()
                   .build();
            t.setTest(ArtistNameSearch("ArtistNameSearch", mode, "1"));
            assertTrue(t.isPassed());
        }
}