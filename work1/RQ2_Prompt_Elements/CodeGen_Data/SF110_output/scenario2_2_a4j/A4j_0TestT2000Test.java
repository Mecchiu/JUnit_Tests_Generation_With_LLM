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
private static final String EXPECTED_QUERY =
				"\"searchTerm\"=\"searchTerm\" AND \"type\"=\"light\"";

	@Test
	public void BlendedSearchTest() {
				assertEquals(
							EXPECTED_QUERY,
							A4j.BlendedSearch(
								"searchTerm",
								"light"
								).toString());
	}

	@Test
	public void BlendedSearchSearchModeBlendedTest() {
					BlendedSearch search = new BlendedSearch(
							"searchTerm",
							"light"
					);

					assertTrue(
					"should return BlendedSearch",
					search.toString().endsWith("?queryMode=blended"));

					search = new BlendedSearch(
							"searchTerm",
							"light",
							"light"
					);

					assertTrue(
							"should not return BlendedSearch",
					search.toString().endsWith("?queryMode=blended"));
	}

	@Test
	public void BlendedSearchSearchModeSearchableTest() {
						BlendedSearch search = new BlendedSearch(
								"searchTerm",
								"light"
						);

						assertTrue(
							"should return BlendedSearch with a single query with mode=searchable",
							search.toString().endsWith("?mode=searchable"));

						search = new BlendedSearch(
								"searchTerm",
								"light",
								"light"
						);

						assertTrue(
						"should not return BlendedSearch with a single query with mode=searchable",
						search.toString().endsWith("?mode=searchable"));
	}

	@Test
	public void BlendedSearchSearchModeUnSearchableTest() {
					BlendedSearch search = new BlendedSearch(
							"searchTerm",
							"light"
					);

					assertTrue(
							"should return BlendedSearch with a single query with mode=unSearchable",
							search.toString().endsWith("?mode=unSearchable"));

					search = new BlendedSearch(
							"searchTerm",
							"light",
							"searchTerm"
					);

					assertTrue(
						"should not return BlendedSearch with a single query with mode=unSearchable",
						search.toString().endsWith("?mode=unSearchable"));
	}

}
