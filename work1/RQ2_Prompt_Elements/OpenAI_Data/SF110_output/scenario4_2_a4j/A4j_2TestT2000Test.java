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
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_2Test {

	@Test
	void testActorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
		assertNotNull(productInfo.getDetails());
		assertNotNull(productInfo.getDetails().getActor());
		assertNotNull(productInfo.getDetails().getActor().getName());
		assertEquals("Tom Hanks", productInfo.getDetails().getActor().getName());
		assertNotNull(productInfo.getDetails().getActor().getProducts());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0));
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAsin());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getProductName());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getCatalog());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getReleaseDate());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTheatricalReleaseDate());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getRating());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getListPrice());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getOurPrice());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getUsedPrice());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0));
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getMerchantId());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getMerchantName());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getAvailability());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getAvailabilityAttributes());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getAvailabilityAttributes().getAvailabilityType());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getAvailabilityAttributes().getIsPreorder());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getAvailabilityAttributes().getMinimumHours());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getAvailabilityAttributes().getMaximumHours());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getAvailabilityAttributes().getIsAvailable());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getAvailabilityAttributes().getIsEligibleForSuperSaverShipping());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getAvailability().getAvailabilityType().get(0).getAvailabilityAttributes().getIsEligibleForPrime());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getImageUrlSmall());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getImageUrlMedium());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getImageUrlLarge());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getCustomerReviewAverage());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getCustomerReviewCount());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getEditorialReview());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getEditorialReview().getSource());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getEditorialReview().getContent());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getSimilarProducts());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getSimilarProducts().getSimilarProduct());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getSimilarProducts().getSimilarProduct().get(0));
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getSimilarProducts().getSimilarProduct().get(0).getAsin());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getSimilarProducts().getSimilarProduct().get(0).getTitle());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0));
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0).getNumber());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0).getTrack());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0).getTrack().get(0));
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0).getTrack().get(0).getNumber());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0).getTrack().get(0).getTitle());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0).getTrack().get(0).getArtist());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0).getTrack().get(0).getDuration());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0).getTrack().get(0).getComposer());
		assertNotNull(productInfo.getDetails().getActor().getProducts().getProduct().get(0).getTracks().getDisc().get(0).