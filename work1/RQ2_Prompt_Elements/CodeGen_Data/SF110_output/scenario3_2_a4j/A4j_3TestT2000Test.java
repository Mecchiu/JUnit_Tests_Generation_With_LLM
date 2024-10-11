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
private static final String A4J_SINGLE_PAGE = "http://www.kencochrane.net/A4J-DOC/search/Artist/Search/SinglePage/";
		private static final String A4J_SEARCH_FOR_ARTIST = "http://www.kencochrane.net/A4J-DOC/search/Artist.dtd";
		private static final String PAGE_SINGLE_PAGE = "1";
		private static final String SEARCH_FOR_ARTIST_ARTIST = "http://www.kencochrane.net/A4J-DOC/search/artist/Search/SinglePage/artist/artist";
		private static final String SEARCH_FOR_ALL_ARTIST_ARTIST = "http://www.kencochrane.net/A4J-DOC/search/artist/Search/SinglePage/artist";
		private static final String SEARCH_FOR_ALL_PAGE = "http://www.kencochrane.net/A4J-DOC/search/"; // This should work
		private static final String PAGE_PREFIX = "A4J_";
		private static final String SEARCH_FOR_NO_ARTIST_FOUND = "http://www.kencochrane.net/A4J-DOC/search/artist/Search/MultiplePages/noartist/";
		private static final String SEARCH_FOR_NO_ARTIST = "http://www.kencochrane.net/A4J-DOC/search/artist/Search/MultiplePages/NoArtist/";
		private Product.ProductInfo[][] products = new Product.ProductInfo[][] {};

		private final String SEARCH_TYPE = "single-page";
		private final String PAGE_URL = "http://www.kencochrane.net";
		private final String NO_ARTIST_URL = "http://www.kencochrane.net/A4J-DOC/search/artist/Search/MultiplePages/noartist/";

		@Test
		void SinglePageArtic(@SuppressWarnings("SameParameterValue") Search search) {
			ProductInfo pi = Search.Search(search, PAGE_SINGLE_PAGE).getResults();
			pi.setImage("http://a4j.net.kencochrane.net");
			pi.setProduct(Product.PRODUCT.JULEST);
			pi.getArtists().get(0).setImage("http://a4j.net.kencochrane.net");
			pi = ArtistSearch(pi.getArtistName(), SEARCH_TYPE, PAGE_SINGLE_PAGE).getResults();
			pi.getArtists().get(0).setImage("http://a4j.net.kencochrane.net");
		}
		@Test
		void MultiplePagesArtic(@SuppressWarnings("SameParameterValue") Search search) {
			ProductInfo pi = Search.Search(search, PAGE_SINGLE_PAGE).getResults();
			pi.setImage("http://a4j.net.kencochrane.net");
			pi.setProduct(Product.PRODUCT.PUPPET);
			pi.getArtists().get(0).setImage("http://a4j.net.kencochrane.net");
		}
		@Test
		void NoArtistArtic(@SuppressWarnings("SameParameterValue") Search search) {
			ProductInfo pi = Search.Search(search, SEARCH_FOR_NO_ARTIST_ARTIST).getResults();
			pi.setImage("http://a4j.net.kencochrane.net");
			pi.setProduct(Product.PRODUCT.PUPPET);
			pi.getArtists().get(0).setImage("http://a4j.net.kencochrane.net");
		}
		@Test
		void NoArtistSearch(@SuppressWarnings("SameParameterValue") Search search) {
			ProductInfo pi = Search.Search(search, SEARCH_FOR_NO_ARTIST).getResults();
			pi.setImage("http://a4j.net.kencochrane.net");
			pi.setProduct(Product.PRODUCT.PUPPET);
			pi.getArtists().get(0).setImage("http://a4j.net.kencochrane.net");
		}

		@Test
		void NoArtistSearch1(@SuppressWarnings("SameParameterValue") Search search) {
			ProductInfo pi = Search.Search(search, SEARCH_FOR_NO_ARTIST).getResults();
			pi.setImage("http://a4j.net.kencochrane.net");
			pi.setProduct(Product.PRODUCT.PUPPET);
			pi.getArtists().get(0).setImage("http://a4j.net.kencochrane.net");
		}

		@Test
		void NoArtistSearch3(@SuppressWarnings("SameParameterValue") Search search) {
			ProductInfo pi = Search.Search(search, SEARCH_FOR_NO_ARTIST_ARTIST).getResults();
			pi.setImage("http://a4j.net.kencochrane.net");
			pi.setProduct(Product.PRODUCT.JULEST);
			pi.getArtists().get(0).setImage("http://a4j.net.kencochrane.net");
		}
	}


	/**
	 * http://www.kencochrane.net/A4J-DOC/search/all/#ArtistSearch
	 */
	@Test
	public void ArtistSearch2() {
		String url = A4J_SINGLE_PAGE + SEARCH_FOR_ARTIST_ARTIST;
		Cart cart = new Cart();
		cart.clear();
		Cart.getInstance().add(url);
		A4j.DAO.search(url, "artist")
				.setType("artist")
				.setProduct(Product.PRODUCT.PUPPET)
				.getResults()
				.getArtists()
				.get(0)
				.addImage(url + "artist.png");
		assertEquals("http://www.kencochrane.net/A4J-DOC/search/artists/artist", A4J_SINGLE_PAGE + url);
	}

	/**
	 * http://www.kencochrane.net/A4J-DOC/search/artists/#ArtistSearch
	 */
	@Test
	public void ArtistSearch3() {
		String url = A4J_SINGLE_PAGE + SEARCH_FOR_ARTIST_ARTIST;
		Cart cart = new Cart();
		cart.clear();
		Cart.getInstance().add(url);
		A4j.DAO.search(url, "artist")
				.setType("artist")
				.setPage(PAGE_SINGLE_PAGE)
				.getResults()
				.getArtists()
				.get(0)
				.add