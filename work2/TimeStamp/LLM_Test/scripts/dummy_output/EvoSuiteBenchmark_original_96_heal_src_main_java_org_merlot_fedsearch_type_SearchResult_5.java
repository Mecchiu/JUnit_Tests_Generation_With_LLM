// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains one unit test case for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {
		

	public SearchResultTest() {
	}

	/**
	 * Test method for {@link SearchResult#getTypeDesc()}.
	 */
	@Test
	public void testGetTypeDesc() {
		
		SearchResult result=new SearchResult();
		String resultStr=result.getTypeDesc().toString();
		assertNotNull(resultStr);
		assertEquals("SearchResult",resultStr);
		
	}
}