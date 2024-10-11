// SearchResultElementTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains one unit test case for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {
		private final SearchResultElement element;

		public SearchResultElementTest() {
	        element = new SearchResultElement();
	    }
	    
	    @Test
	    public void getTypeDesc() {
	        assertNotNull(SearchResultElement.getTypeDesc());
	    }
	}