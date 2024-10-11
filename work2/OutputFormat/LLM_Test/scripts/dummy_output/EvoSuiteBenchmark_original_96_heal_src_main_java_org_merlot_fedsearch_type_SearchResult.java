// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains one unit test case for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {
		/*
		 * Test method for {@link SearchResult#getSearchResultCount()}.
		 */
    @Test
    public void testGetSearchResultCount() {
        assertEquals(1, new SearchResult(null, null, 0, null, null, 0, 0, "", null).getSearchResultCount());
    }

	/*
	 * Test method for {@link SearchResult#getResultsCount()}.
	 */
    @Test
    public void testGetResultsCount() {
        assertEquals(0, new SearchResult(null, null, 0, null, null, 0, 0, "", null).getResultsCount());
    }

	/*
	 * Test method for {@link SearchResult#getTotalResultsCount()}.
	 */
    @Test
    public void testGetTotalResultsCount() {
        assertEquals(0, new SearchResult(null, null, 0, null, null, 0, 0, "", null).getTotalResultsCount());
    }

}