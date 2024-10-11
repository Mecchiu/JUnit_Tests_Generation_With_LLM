// A4j_0Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_0Test {
		@Test
        public void BlendedSearch() {
			Product p1 = new Product();
			p1.setDescription("A Product 1");
			p1.setCategory("Cat A");
			p1.setIsDisplayed("true");
			p1.setName("A Product 1");
			p1.setQty(5.5f);
			p1.setPrice(new BigDecimal("100.00"));

			p1.setCategory("Cat B");
			p1.setIsDisplayed("true");
			p1.setName("A Product B");
			p1.setQty(5.5f);
			p1.setPrice(new BigDecimal("10.00"));

			Cart cart = new Cart();
			cart.addItem(p1);
			Search search = new Search();
			search.addQuery("Cat B");
			search.addOrder("Rank");
			search.setSearchMode(Search.Mode.SORTED_BY_RELEVANCE);
			search.setPage("1");
			search.setSearchTerms(new String[] {"Cat A", "Cat B"});
			search.setLimit(1);

			return (BlendedSearch) DaO.getDAO().BLENDED_SEARCH.evaluate(search);
}
} // end class A4j