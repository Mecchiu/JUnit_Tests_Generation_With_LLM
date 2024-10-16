// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {
		
	/**
	* Test case for {@link SearchResult#getTypeDesc()} method.
	* Test case for the return value of the {@link SearchResult#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(SearchResult.getTypeDesc());
	}
}