// A4j_1Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_1Test {

		/**
		* Test case for the {@link A4j#BlendedSearch(String, String)} method.
		*/
		@Test
		void testBlendedSearch() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite");
				assertNotNull(blendedSearch);
				assertNotNull(blendedSearch.getRequest());
				assertNotNull(blendedSearch.getRequest().getIsValid());
				assertTrue(blendedSearch.getRequest().getIsValid());
				assertNotNull(blendedSearch.getRequest().getKeywords());
				assertEquals("java", blendedSearch.getRequest().getKeywords());
				assertNotNull(blendedSearch.getRequest().getPage());
				assertEquals("1", blendedSearch.getRequest().getPage());
				assertNotNull(blendedSearch.getRequest().getMode());
				assertEquals("blended", blendedSearch.getRequest().getMode());
				assertNotNull(blendedSearch.getRequest().getTag());
				assertEquals("webservices-20", blendedSearch.getRequest().getTag());
				assertNotNull(blendedSearch.getRequest().getType());
				assertEquals("lite", blendedSearch.getRequest().getType());
				assertNotNull(blendedSearch.getRequest().getDevtag());
				assertEquals("A4J0R2W15K5FZ", blendedSearch.getRequest().getDevtag());
				assertNotNull(blendedSearch.getRequest().getSort());
				assertEquals("+salesrank", blendedSearch.getRequest().getSort());
				assertNotNull(blendedSearch.getTotalResults());
				assertEquals("1", blendedSearch.getTotalResults());
				assertNotNull(blendedSearch.getTotalPages());
				assertEquals("1", blendedSearch.getTotalPages());
				assertNotNull(blendedSearch.getDetails());
				assertNotNull(blendedSearch.getDetails().getProductName());
				assertEquals("Java", blendedSearch.getDetails().getProductName());
				assertNotNull(blendedSearch.getDetails().getCatalog());
				assertEquals("Books", blendedSearch.getDetails().getCatalog());
				assertNotNull(blendedSearch.getDetails().getAuthors());
				assertEquals("James Gosling", blendedSearch.getDetails().getAuthors());
				assertNotNull(blendedSearch.getDetails().getManufacturer());
				assertEquals("Prentice Hall", blendedSearch.getDetails().getManufacturer());
				assertNotNull(blendedSearch.getDetails().getModel());
				assertEquals("Paperback", blendedSearch.getDetails().getModel());
				assertNotNull(blendedSearch.getDetails().getUrl());
				assertEquals("http://www.amazon.com/exec/obidos/ASIN/0131103628/webservices-20", blendedSearch.getDetails().getUrl());
				assertNotNull(blendedSearch.getDetails().getImageUrlSmall());
				assertEquals("http://images.amazon.com/images/P/0131103628.01.THUMBZZZ.jpg", blendedSearch.getDetails().getImageUrlSmall());
				assertNotNull(blendedSearch.getDetails().getImageUrlMedium());
				assertEquals("http://images.amazon.com/images/P/0131103628.01.MZZZZZZZ.jpg", blendedSearch.getDetails().getImageUrlMedium());
				assertNotNull(blendedSearch.getDetails().getImageUrlLarge());
				assertEquals("http://images.amazon.com/images/P/0131103628.01.LZZZZZZZ.jpg", blendedSearch.getDetails().getImageUrlLarge());
				assertNotNull(blendedSearch.getDetails().getListPrice());
				assertEquals("$49.99", blendedSearch.getDetails().getListPrice());
				assertNotNull(blendedSearch.getDetails().getOurPrice());
				assertEquals("$33.99", blendedSearch.getDetails().getOurPrice());
				assertNotNull(blendedSearch.getDetails().getUsedPrice());
				assertEquals("$0.01", blendedSearch.getDetails().getUsedPrice());
				assertNotNull(blendedSearch.getDetails().getCollectiblePrice());
				assertEquals("$0.01", blendedSearch.getDetails().getCollectiblePrice());
				assertNotNull(blendedSearch.getDetails().getRefurbishedPrice());
				assertEquals("$0.01", blendedSearch.getDetails().getRefurbishedPrice());
				assertNotNull(blendedSearch.getDetails().getThirdPartyNewPrice());
				assertEquals("$0.01", blendedSearch.getDetails().getThirdPartyNewPrice());
				assertNotNull(blendedSearch.getDetails().getAvailability());
				assertEquals("Usually ships in 24 hours", blendedSearch.getDetails().getAvailability());
				assertNotNull(blendedSearch.getDetails().getAvailabilityType());
				assertEquals("now", blendedSearch.getDetails().getAvailabilityType());
				assertNotNull(blendedSearch.getDetails().getIsEligibleForSuperSaverShipping());
				assertEquals("1", blendedSearch.getDetails().getIsEligibleForSuperSaverShipping());
				assertNotNull(blendedSearch.getDetails().getIsEligibleForPrime());
				assertEquals("1", blendedSearch.getDetails().getIsEligibleForPrime());
				assertNotNull(blendedSearch.getDetails().getIsRedirectASIN());
				assertEquals("0", blendedSearch.getDetails().getIsRedirectASIN());
				assertNotNull(blendedSearch.getDetails().getCustomerReviewsUrl());
				assertEquals("http://www.amazon.com/reviews/iframe?akid=A4J0R2W15K5FZ&alinkCode=xm2&asin=0131103628&atag=webservices-20&exp=2010-08-01T02%3A00%3A00Z&v=2&sig=%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%2B%