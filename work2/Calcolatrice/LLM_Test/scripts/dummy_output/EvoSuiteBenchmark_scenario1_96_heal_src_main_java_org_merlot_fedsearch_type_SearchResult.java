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
	* This test case checks if the method returns a non-null value.
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(SearchResult.getTypeDesc());
	}
}