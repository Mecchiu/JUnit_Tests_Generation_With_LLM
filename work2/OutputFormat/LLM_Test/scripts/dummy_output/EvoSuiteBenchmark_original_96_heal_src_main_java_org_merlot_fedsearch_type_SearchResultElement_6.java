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
     * Test method for {@link org.merlot.fedsearch.type.SearchResultElement#getTypeDesc()}.
     */
    @Test
    public void getTypeDesc() {
  
        assertEquals(SearchResultElement.getTypeDesc(),   SearchResultElementTest.class.getAnnotation(SearchResultElement.class).value());
        assertEquals(SearchResultElement.getTypeDesc().getURI(), SearchResultElementTest.class.getPackage().getName() + "#" +     SearchResultElement.getTypeDesc().getURI());
        
        
    }
}