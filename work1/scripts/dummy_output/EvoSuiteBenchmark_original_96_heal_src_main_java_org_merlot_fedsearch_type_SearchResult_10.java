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
     * Test some operations of the search result.
	*/
    @Test
    public void testAddSearchResultElement() {
        SearchResult testobj = new SearchResult();
        
        SearchResultElement resultElement = new SearchResultElement();
        resultElement.setText("test");
        resultElement.setCategory("test");
        resultElement.setComments("test");
        resultElement.setEndIndex(1);
        resultElement.setQuery("test");
        resultElement.setResultsElements(new SearchResultElement[] {resultElement});
        testobj.setSearchResultElement(resultElement);
		
        assertEquals(resultElement.getText(), "test");
        assertEquals(resultElement.getCount(), Integer.valueOf(1));
        try {
            testobj.addSearchResultElement(resultElement);
        	fail("Method call should have failed.");
        } catch(SearchResultElementException e) {
        	
        }
        
        SearchResultElement[] resultElement2 = testobj.getResultElements();
		
        assertEquals(resultElement.getText(), resultElement2[0].getText());
	}
	
	/**
     * Test some operations of the search result element.
	*/
    @Test	
	public void testSearchResultElement() {
		SearchResult result = new SearchResult();

        SearchResultElement myResultElement = new SearchResultElement();
        myResultElement.setText("test");
        myResultElement.setCategory("test");
        myResultElement.setComments("test");
        myResultElement.setEndIndex(1);
        myResultElement.setQuery("test");
        myResultElement.setResultsElements(new SearchResultElement[] {myResultElement});
		SearchResultElement searchResultElement = new SearchResultElement();
		searchResultElement.setText("test");
		searchResultElement.setResultsElements(new SearchResultElement[] {myResultElement});

		result.setSearchResultElement(searchResultElement);
		
        SearchResultElement[] resultElements = result.getResultElements();
		
        // This is the case of empty result set.
		assertEquals(resultElements.length, 0);
        	
        SearchResultElement[] resultElements2 = result.getResultElements();
		
        // This is the case of non empty result set.
		assertEquals(resultElements2.length, 1);
		
		SearchResultElement[] resultElements3 = result.getResultElements();
		
		resultElements2 = result.getResultElements();
		
		assertEquals(resultElements2.length, 1);
		
		SearchResultElement[] resultElements7 = result.getResultElements();
		
		// Get a copy
        resultElements5 = result.getResultElements();
		
	}
	
	/**
     * Test some operations of the search result list.
	*/
    @Test
    public void testGetResultElements() {
        SearchResult result = new SearchResult();

        result.addSearchResultElement(resultElements[0]);
        result.addSearchResultElement(resultElements[0]);
        SearchResultElement[] resultElementsList = result.getResultElements();
		
        assertEquals(resultElementsList.length, 2);
        
        SearchResultElement[] resultElements1 = result.getResultElements();
		
        assertEquals(resultElementsList.length, 1);
        
        SearchResultElement[] resultElements2 = result.getResultElements();
}
}