// SearchResultElementTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains one unit test case for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {
		
	/**
    * Test cases  of {@link SearchResultElement}'s constructor.
    */
	@Test
    public void TestConstructor() {
        // setup
        

        
    }

    // SearchResultElementJIRATest.java
    /**
    * Test cases  of {@link SearchResultElement}.
    */
    @Test
    public void TestGetTypeDesc() {
        // setup
        

        SearchResultElement searchResultElement = new SearchResultElement();

        searchResultElement.setType( SearchResultType.COMPOSITE_STATUS );
        assertEquals(searchResultElement.getType(), SearchResultType.COMPOSITE_STATUS);
        
    }

}