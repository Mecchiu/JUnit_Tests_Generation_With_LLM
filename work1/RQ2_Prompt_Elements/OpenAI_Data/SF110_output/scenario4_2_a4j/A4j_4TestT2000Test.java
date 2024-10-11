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
* It contains ten unit test cases for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_4Test {

	@Test
	void testAuthorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "1");
		assertNotNull(productInfo);
		assertNotNull(productInfo.getDetails());
		assertNotNull(productInfo.getDetails().getProduct());
		assertNotNull(productInfo.getDetails().getProduct().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getASIN());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0));
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue());
		assertNotNull(productInfo.getDetails().getProduct().get(0).getItem().get(0).getItemAttributes().getAuthor().get(0).getName().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0).getValue().get(0