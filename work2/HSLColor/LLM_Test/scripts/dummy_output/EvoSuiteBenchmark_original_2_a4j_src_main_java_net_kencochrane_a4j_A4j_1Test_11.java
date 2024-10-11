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
* It contains one unit test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4j_1Test {
		private static final String testId = "A4j 1Test";

		/**
	 * This unit test case is used to verify the implementation of the {@link KeywordSearch} method.
		 @jira_ticket JIRA: TNL-639
	 */
	@Test
	void findKeywordSearch() {
		assertNull(KeywordSearch("", "", "", ""));
		assertNotNull(KeywordSearch(null, "", "", ""));
	}

	/**
	 * This unit test case is used to verify the implementation of the {@link KeywordSearch} method.
		 @jira_ticket JIRA: TNL-639
	 */
	@Test
	void searchWithoutKeyword() {
		String keyW = "Keyword 1";
		String valW = "Val1";
		assertNull(KeywordSearch(null, keyW, valW, null));
		assertNull(Search(keyW, valW, null).getResults());
		Search search = Search(keyW, valW, null);
		assertNull(search.getResults());
		assertEquals(keyW, search.getKeyWord());
		assertEquals(valW, search.getValue());
	}
	/**
	 * This unit test case is used to verify the implementation of the {@link KeywordSearch} method.
		 @jira_ticket JIRA: TNL-639
	 */
	@Test
	void searchWithKeyword() {
		String keyW = "Keyword 1";
		String valW = "Val1";
		assertNotNull(KeywordSearch(keyW, valW, "", keyW));
		assertNull(Search(keyW, valW, keyW).getResults());
		Search search = Search(keyW, valW, "");
		assertNull(search.getResults());
		assertEquals(keyW, search.getKeyWord());
		assertEquals(valW, search.getValue());
	}
	/**
	 * This unit test case is used to verify the implementation of the {@link KeywordSearch} method.
		 @jira_ticket JIRA: TNL-639
	 */
	@Test
	void searchWithKeywordAndPage() {
		String keyW = "Keyword 1", valW = "Val1", keyP = "Page";
		String valP = "Page 1";
		assertNotNull(KeywordSearch(keyW, valW, valP, keyP));
		int i = 0;
		assertNull(Search(keyW, valW, valP, keyP).getResults());
		while (i ++ < 5) {
			assertNull(Search(keyW, valW, valP, keyP).getResults());
			i += 2;
		}
		Search search = Search(keyW, valW, valP, keyP);
		assertNull(search.getResults());
		assertEquals(keyW, search.getKeyWord());
		assertEquals(valP, search.getValue());
		i = 0;
		int iSearchPage = 2000l;
		while (i ++ < 5) {
			assertNull(Search(keyW, valW, valP, keyP).getResults());
			Search search2 = Search(keyW, valW, valP, keyP);
			assertNull(search.getResults());
			assertNull(search2.getResults());
			assertEquals(keyW + " " + keyP, search.getKeyWord());
			assertEquals(valW, search.getValue());
			iSearchPage += 2;
		}
		assertEquals(valW, search.getValue());
	}
}