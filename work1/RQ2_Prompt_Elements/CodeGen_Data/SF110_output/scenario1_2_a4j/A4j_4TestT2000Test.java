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
* It contains one unit test case for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_4Test {
String TestString = "Some author search";
	A4j_4Test() {
        // do nothing
	}

	// A4j.AuthorSearch(String authorName, String page)
	@Test
	public void authorSearch()
	{
        assertEquals("There should be exactly one author search", 1, getCount());
        assertResultsMatch(authorName, getResults(), new A4jResultsData(TestString));
	}

    // A4j.AuthorSearch("Author name", "page")
	@Test
    public void authorSearch2() throws Exception {

		Cart cart = new Cart();
        cart.addAuthor("Some name");
		Author search = new Author(TestString, cart);

		A4jDAO.authorSearch = search;

		AuthorSearch();
	}

	// A4j.Search(DataObject obj)
	@Test
	public void searches() throws Exception {

		Search search = new Search();
		// do nothing
	}
}