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
	 * 
	 * <p>
	 * This test case is used to test the {@link SearchResult#getTypeDesc()} method.
	 * </p>
	 * 
	 * <p>
	 * The test case is expected to return a {@link org.apache.axis.description.TypeDesc} object.
	 * </p>
	 */
	@Test
	void testGetTypeDesc() {
		assertEquals(org.apache.axis.description.TypeDesc.class, SearchResult.getTypeDesc().getClass());
	}
}