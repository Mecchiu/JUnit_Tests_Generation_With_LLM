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
		// Test case instance.
		@Test
		public void testArtistSearch() {
				// Test if artists are searched.
				assertNotNull(Search.ARTIST_FOUND);
				// Test if the artist found.
				assertEquals(Search.ARTIST_FOUND, ArtistSearch(null, "music", "2"));
				// Test if the artist was not found.
				assertNull(ArtistSearch("blah", "music", "2"));
		}

		@Test
		public void testSearch() {
			// Test if the Search method does return the right object.
			assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchArtist() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARCHIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARCHIST_FOUND.getField();
			assertEquals(Search.ARCHIST_FOUND, field);
		}

		@Test
		public void testSearchSearchId() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchProduct() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchSearchTitle() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchSearchUrl() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchSearchImageUrl() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchArtistName() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchImageName() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchArtistCoverUrl() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchArtistCoverName() {
				// Test if the Search method does return the right object.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testSearchArtistArtist() {
				// Test if the Search method does return that artist.
				assertNotNull(Search.ARTIST_FOUND);

			// Empty field is added to the array so when search fails one object
			// is returned instead of a null string.
			String[] field = Search.ARTIST_FOUND.getField();
			assertEquals(Search.ARTIST_FOUND, field);
		}

		@Test
		public void testArtistSearch() {
				// Test if the artist is searched.
				assertNotNull(DAO.ARTIST_FOUND);
				assertNotNull(DAO.ARTIST_FOUND.getArtist());  // This is what we are doing in testArtistSearch

				// Test if the artist found.
				assertEquals(DAO.ARTIST_FOUND.getArtist(), DAO.ARTIST_FOUND.getArtist());
				assertEquals(DAO.ARTIST_FOUND.getArtist(), null);
				assertEquals(DAO.ARTIST_FOUND.getArtist(), null);

				// TODO
				// Test if a null string is passed.
				// This should fail!
				// assertEquals(DAO.ARTIST_FOUND.getArtist(), null);
		}

		@Test
		public void testArtistSearch2() {
				// Test if the artist is searched.
				assertNotNull(DAO.ARTIST_FOUND);
				assertEquals(DAO.ARTIST_FOUND.getArtist(), DAO.ARTIST_FOUND.getArtist());

				// Test if the artist found.
}
}