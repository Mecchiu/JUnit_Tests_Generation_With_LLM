// SearchResultElementTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains one unit test case for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {
		SearchResultElementTest() { }     
		
    /**
     * Test method for {@link org.merlot.fedsearch.type.SearchResultElement#getTypeDesc()}.
    */
    @Test public void testGetTypeDesc() {
    	assertTypeDescEquals("SearchResultElement.java", SearchResultElementTest.class);
    }    
}