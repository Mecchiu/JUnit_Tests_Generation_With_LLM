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
		private final static String ARTIST_NAME = "Marianz Bader";

        /**
         * Test method for {@link A4j#ArtistSearch(String, String)}.
         */
        @Test
		public void testArtistSearch1() {
				Cart cart;
				DAO dao;
				Search search;
				String searchString;

				log.debug("{0}",A4j_3Test.class);
				System.out.println();

				dao = DAO.create(DAO.CART, DAO.SEARCH, DAO.SONG_LIST);
				searchString = ARTIST_NAME;

				try {
						cart = dao.searchAndFindAll(searchString, -1);
				} catch (DAOException e) {
						log.error("Error when searching artist {}",searchString, e);
						return;
				}

				assertNotNull(cart);

				assertEquals(cart.getId(),
						"cart-id-test",
						"Wrong ID (Cart)",
						cart);
				assertEquals(cart.getType(),
						"cart-type-test",
						"Wrong Type (Cart)",
						cart);

				assertEquals(cart.getName(),
						ARTIST_NAME,
						"Wrong name of artist returned",
						cart);

				assertNotNull(cart.getProducts());

				assertNull(cart.getProduct());

				assertNull(cart.getArtist());
				assertNotNull(cart.getCart());

				assertNotNull(cart.getSearch());

				assertNotNull(cart.getSearch().getCart());
				assertNotNull(cart.getSearch().getSearch());

				assertNotNull(cart.getSearch().getSearch());

				assertNotNull(cart.getSearch().getSONG_LIST());

				assertNotNull(cart.getSearch().getSONG_LIST());

				assertNotNull(cart.getSearch().getSONG_LIST().get(0));
				assertEquals(cart.getSearch().getSONG_LIST().get(0).getProduct().getId(),
						null,
						"Wrong product ID " + cart.getSearch().getSONG_LIST().get(0).getProduct().getId());

                assertNotNull(cart.getSearch().getSONG_LIST().get(0).getCart());
                assertNotNull(cart.getSearch().getSONG_LIST().get(0).getCart().getCart());
                assertEquals(cart.getSearch().getSONG_LIST().get(0).getCart().getCart().getType(),
                        "cart-type-test",
                        "Wrong type of cart returned",
                        cart.getSearch().getSONG_LIST().get(0).getCart().getCart().getType());

	
		}

	}