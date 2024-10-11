// A4j_4Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_4Test {

    /**
     * Test case for searching books by author name with valid input.
     */
    @Test
    void testAuthorSearchWithValidInput() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("J.K. Rowling", "1");
        assertNotNull(productInfo);
        assertEquals("J.K. Rowling", productInfo.getAuthor());
        assertEquals("1", productInfo.getPage());
    }

    /**
     * Test case for searching books by author name with invalid author name.
     */
    @Test
    void testAuthorSearchWithInvalidAuthorName() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("Invalid Author Name", "1");
        assertNull(productInfo);
    }

    /**
     * Test case for searching books by author name with invalid page number.
     */
    @Test
    void testAuthorSearchWithInvalidPageNumber() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("J.K. Rowling", "invalid page number");
        assertNull(productInfo);
    }

    /**
     * Test case for searching books by author name with null author name.
     */
    @Test
    void testAuthorSearchWithNullAuthorName() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch(null, "1");
        assertNull(productInfo);
    }

    /**
     * Test case for searching books by author name with null page number.
     */
    @Test
    void testAuthorSearchWithNullPageNumber() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("J.K. Rowling", null);
        assertNull(productInfo);
    }

    /**
     * Test case for searching books by author name with empty author name.
     */
    @Test
    void testAuthorSearchWithEmptyAuthorName() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("", "1");
        assertNull(productInfo);
    }

    /**
     * Test case for searching books by author name with empty page number.
     */
    @Test
    void testAuthorSearchWithEmptyPageNumber() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("J.K. Rowling", "");
        assertNull(productInfo);
    }

    /**
     * Test case for searching books by author name with invalid input.
     */
    @Test
    void testAuthorSearchWithInvalidInput() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("Invalid Input", "invalid page number");
        assertNull(productInfo);
    }

    /**
     * Test case for searching books by author name with special characters in author name.
     */
    @Test
    void testAuthorSearchWithSpecialCharactersInAuthorName() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("J.K. Rowling & J.R.R. Tolkien", "1");
        assertNotNull(productInfo);
        assertEquals("J.K. Rowling & J.R.R. Tolkien", productInfo.getAuthor());
        assertEquals("1", productInfo.getPage());
    }

    /**
     * Test case for searching books by author name with special characters in page number.
     */
    @Test
    void testAuthorSearchWithSpecialCharactersInPageNumber() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("J.K. Rowling", "1 & 2");
        assertNull(productInfo);
    }
}