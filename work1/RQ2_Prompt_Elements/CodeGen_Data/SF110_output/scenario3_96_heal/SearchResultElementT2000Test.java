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
     * @return Test method for {@link SearchResultElement#getTypeDesc()}.
     */
    @Test
    public void testGetTypeDesc() {
        SearchResultElement e = new SearchResultElement();
        assertEquals("Type descriptor of SearchResultElement test object.",
        		e.getTypeDesc(),
        		SearchResultElement.getTypeDesc());
    }

	/**
     * @return Test method for {@link SearchResultElement#getTitle()}.
     */
    @Test
    public void testGetTitle() {
        SearchResultElement e = new SearchResultElement();
        assertEquals("Title of SearchResultElement test object.",
        		e.getTitle(),
        		SearchResultElement.getTitle());
    }

	/**
     * @return Test method for {@link SearchResultElement#setTitle(java.lang.String)}.
     */
    @Test
    public void testSetTitle() {
        SearchResultElement e = new SearchResultElement();
        assertEquals("Title of SearchResultElement test object.",
        		e.getTitle(),
        		SearchResultElement.getTitle());
    }

	/**
	* Test method for {@link SearchResultElement#getSource()}.
	*/
    @Test
    public void testGetSource() {
        SearchResultElement e = new SearchResultElement();
        assertNull("Source of SearchResultElement test object.",
       e.getSource());
    }

	/**
	* Test method for {@link SearchResultElement#setSource(java.lang.String)}.
	*/
    @Test
    public void testSetSource() {
        SearchResultElement e = new SearchResultElement();
        assertNull("Source of SearchResultElement test object.",
       e.getSource());
    }

	/**
     * @return Test method for {@link SearchResultElement#getMetadataValue(java.lang.String)}.
     */
    @Test
    public void testGetMetadataValue() {
        SearchResultElement e = new SearchResultElement();
        Object obj = e.getMetadataValue("some-key");
        assertEquals("Metadata value of SearchResultElement test object.",
        		obj,
        		e.getMetadataValue("some-key"));
    }

	/**
	* Test method for {@link SearchResultElement#getContentDescription(java.lang.String)}.
	*/
    @Test
    public void testGetContentDescription() {
        SearchResultElement e = new SearchResultElement();
        Object obj = e.getContentDescription("some-key");
        assertEquals("Content description of SearchResultElement test object.", 
        		obj,
        		e.getContentDescription("some-key"));
    }

	/**
	* Test method for {@link SearchResultElement#getSearchQueryString()}.
	*/
    @Test
    public void testGetSearchQueryString() {
        SearchResultElement e = new SearchResultElement();
        assertEquals("Search query string of SearchResultElement test object.",
        		e.getSearchQueryString(),
        		SearchResultElement.getSearchQueryString());
    }

	/**
     * Test method for {@link SearchResultElement#getMetaDataElements()}.
     */
    @Test
    public void testGetMetaDataElements() {
        SearchResultElement e = new SearchResultElement();
        Object ret = e.getMetaDataElements();
        assertTrue("MetaDataElements of SearchResultElement test object.", ((ret instanceof SearchResultElement) && (ret!= null)));
    }

}
