// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains one unit test case for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {
		 
	private SearchResult objectToTest = null;

	@Test
    public void test() throws Exception {
		// Initialize an instance of the service
		SearchResult result = SearchResult.getInstance();
        
        // Invoke the getType() method of the object
        String xml = result.getTypeDesc();

        // Make sure the return value corresponds to the expected type
        assertEquals(xml, "SearchResult");
    }
        
}