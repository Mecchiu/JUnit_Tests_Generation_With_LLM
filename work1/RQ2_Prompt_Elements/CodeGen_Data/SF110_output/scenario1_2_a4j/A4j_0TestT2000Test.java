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
		void BlendedSearch_withDefaults() {
			BlendedSearch search = A4j.BlendedSearch(null, null);

			assertNotNull(search);
		}

		@Test
		void BlendedSearch_withTypeAsQuery() {
			BlendedSearch _search = A4j.BlendedSearch("test", null);
			assertNotNull("Should not be null".equals(String
					.valueOf(_search.returnType())));
		}

        @Test
        void BlendedSearch_withTypeAsQuery_emptyQuery() {
            for (String query : null) {
                BlendedSearch search = A4j.BlendedSearch(null, null);
                assertNull("BlendedSearch should have null".equals(search));
            }
        }

	@Test
	void BlendedSearch_returnResultOnTypeOfSearch() {
		Search search = A4j.BlendedSearch(
				"test",
				Product.Type.BANDWIDTH
		);

		assertNotNull(search);
		assertEquals(productType(Product.Type.BANDWIDTH),
				search.type());
	}
	
        @Test
        void BlendedSearch_returnResultOnTypeOfSearch_forNull() {
            Search search = A4j.BlendedSearch("test", null);
            assertNotNull(search);
            assertEquals(Product.Type.BANDWIDTH, search.type());
        }

	@Test
	void BlendedSearch_returnResultOnTypeOfSearch_forBoll() {
		Search search = A4j.BlendedSearch("test", null);
		DAO.Cart cart = new DAO.Cart(new DAO.CartDAO());

		Product.Type[] productTypes = new Product.Type[] { 
				Product.Type.P1_1, Product.Type.P2_2
		};

		//
		// Searching with just Boll
		//
		for (Product.Type itemType : productTypes) {
			Search _search = search.forType(itemType);
			assertNotNull("Search should not be null".equals(
					"Boll " + itemType.name()))
					&& "Boll".equals(itemType.name());
		}

		//
		// Searching with combination of both
		//
		for (Product.Type itemType : productTypes) {
			for (String type : new String[] {"P1_3", "P1_2", "P1_1"})
			//if (itemType.name().equals(type)
			//		&& String.valueOf(type).equals(itemType.name())) {
			Search _search = productType(itemType).combinedWith(type);
			assertNotNull("Search should not be null".equals(
					"P1_3 + P1_2 + P1_1")
					&& "P1_3 + P1_2 + P1_1".equals(
					_search.whereType().equals(Product.Type.P1_3)
					&& "P1_2 + P1_1".equals(
					_search.whereType().equals(Product.Type.P1_2)
					&& type.equals(itemType.name()))))
					&& "P1_3 + P1_2 + P1_1".equals(
					_search.whereProductType().equals(itemType.name()))
					&& "P1_3 + P1_2 + P1_1".equals(
					_search.whereProductType().equals(itemType.name()));
		}
	}

}
