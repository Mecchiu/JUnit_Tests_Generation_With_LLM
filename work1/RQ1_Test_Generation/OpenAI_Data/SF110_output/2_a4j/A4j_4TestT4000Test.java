// A4j_4Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_4Test {

		@Test
		void testArtistSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "1");
				assertEquals(productInfo.getTotalPages(), "1");
				assertEquals(productInfo.getMode(), "music");
				assertEquals(productInfo.getTag(), "webservices-20");
				assertEquals(productInfo.getType(), "lite");
				assertEquals(productInfo.getDevtag(), "A4J4TEST");
				assertEquals(productInfo.getPage(), "1");
				assertEquals(productInfo.getKeyword(), "The Beatles");
				assertEquals(productInfo.getProductLine(), "music");
				assertEquals(productInfo.getProduct().get(0).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getProduct().get(0).getProductName(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getProduct().get(0).getCatalog(), "Music");
				assertEquals(productInfo.getProduct().get(0).getArtist(), "The Beatles");
				assertEquals(productInfo.getProduct().get(0).getReleaseDate(), "1993-03-22");
				assertEquals(productInfo.getProduct().get(0).getManufacturer(), "Capitol");
				assertEquals(productInfo.getProduct().get(0).getLabel(), "Capitol");
				assertEquals(productInfo.getProduct().get(0).getListPrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getListPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getListPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getOurPrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getOurPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getOurPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getUsedPrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getUsedPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getUsedPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getCollectiblePrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getCollectiblePrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getCollectiblePrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getRefurbishedPrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getRefurbishedPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getRefurbishedPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getCollectibleCount(), "0");
				assertEquals(productInfo.getProduct().get(0).getUsedCount(), "0");
				assertEquals(productInfo.getProduct().get(0).getRefurbishedCount(), "0");
				assertEquals(productInfo.getProduct().get(0).getTotalNew(), "1");
				assertEquals(productInfo.getProduct().get(0).getTotalOffers(), "1");
				assertEquals(productInfo.getProduct().get(0).getTotalCollectible(), "0");
				assertEquals(productInfo.getProduct().get(0).getTotalRefurbished(), "0");
				assertEquals(productInfo.getProduct().get(0).getTotalUsed(), "0");
				assertEquals(productInfo.getProduct().get(0).getImageUrlSmall(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.THUMBZZZ.jpg");
				assertEquals(productInfo.getProduct().get(0).getImageUrlMedium(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.MZZZZZZZ.jpg");
				assertEquals(productInfo.getProduct().get(0).getImageUrlLarge(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
				assertEquals(productInfo.getProduct().get(0).getCustomerReviewUrl(), "http://www.amazon.com/review/product/B000002MNZ");
				assertEquals(productInfo.getProduct().get(0).getEditorialReview().get(0).getSource(), "Product Description");
				assertEquals(productInfo.getProduct().get(0).getEditorialReview().get(0).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTitle(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getProductGroup(), "Music");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getProductTypeName(), "MUSIC_TRACKS");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getAuthor(), "The Beatles");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getArtist(), "The Beatles");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getReleaseDate(), "1993-03-22");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getManufacturer(), "Capitol");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getLabel(), "Capitol");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getListPrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getListPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getListPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getOurPrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getOurPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getOurPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getUsedPrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getUsedPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getUsedPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getCollectiblePrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getCollectiblePrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getCollectiblePrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getRefurbishedPrice().getAmount(), "13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getRefurbishedPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getRefurbishedPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getCollectibleCount(), "0");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getUsedCount(), "0");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getRefurbishedCount(), "0");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTotalNew(), "1");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTotalOffers(), "1");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTotalCollectible(), "0");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTotalRefurbished(), "0");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTotalUsed(), "0");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getImageUrlSmall(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.THUMBZZZ.jpg");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getImageUrlMedium(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.MZZZZZZZ.jpg");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getImageUrlLarge(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getCustomerReviewUrl(), "http://www.amazon.com/review/product/B000002MNZ");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getEditorialReview().get(0).getSource(), "Product Description");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getEditorialReview().get(0).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(0).getDisc(), "1");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(0).getTrack(), "1");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(0).getTitle(), "Love Me Do");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(0).getArtist(), "The Beatles");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(0).getComposer(), "Lennon/McCartney");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(0).getDuration(), "2:22");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(0).getUrl(), "http://www.amazon.com/gp/dmusic/media/sample.m3u?ASIN=B000002MNZ&TrackId=1");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(1).getDisc(), "1");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(1).getTrack(), "2");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(1).getTitle(), "Please Please Me");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(1).getArtist(), "The Beatles");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(1).getComposer(), "Lennon/McCartney");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(1).getDuration(), "2:02");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(1).getUrl(), "http://www.amazon.com/gp/dmusic/media/sample.m3u?ASIN=B000002MNZ&TrackId=2");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(2).getDisc(), "1");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(2).getTrack(), "3");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(2).getTitle(), "From Me To You");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(2).getArtist(), "The Beatles");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(2).getComposer(), "Lennon/McCartney");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(2).getDuration(), "1:57");
				assertEquals(productInfo.getProduct().get(0).getSimilarProduct().get(0).getTracks().get(2).getUrl(), "http://www.amazon.com/gp/dmusic/media/sample.m3u?ASIN=B000002MNZ&TrackId=3");
		