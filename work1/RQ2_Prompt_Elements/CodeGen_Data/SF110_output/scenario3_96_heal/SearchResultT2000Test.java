// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains one unit test case for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {

	/**
	* Test method for {@link SearchResult#getTypeDesc()}.
	*/
	@Test
	public void testGetTypeDesc() {
		assertEquals(SearchResult.class, SearchResult.findTypeByName("com/merlot/fedsearch/type/SearchResult").getClass());
	}

}
