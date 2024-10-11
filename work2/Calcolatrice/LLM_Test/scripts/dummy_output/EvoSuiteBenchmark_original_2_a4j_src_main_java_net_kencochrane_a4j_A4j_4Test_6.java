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
* It contains one unit test case for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_4Test {
		private static final String[] SINGLE_CAT = {"Cat:Test Category", "Cat:Test Category 2", "X"};
	    /**
		* Test case for {@link #getAuthorBooks(String)}.
		*/
	
    /**
     * Test case of  {@link #getBooks(Boolean, Integer, Integer)}.
     * If search is false, query should return a result of one book with the specified number,
     * else if it is equal to the number of books in the Cart, query should return a result of all books.
     * 
     * @throws IllegalStateException if query is false and Cart does not have sufficient items, as for a negative search is not possible
     * @since 1.0
     */
    @Test
    public void getBooks(final Boolean search, final Integer page) {
        A4j a4j = new A4j();

        try {
            A4j_4Test.class.getMethod("AuthorSearch", String.class, String.class, int[].class);

            String category = "";
            Search search = null;
            
            assertFalse(search == null && a4j.search!= null);
            if (search!= null) {
                search.setPage(page)
                   .setCategory(category)
                   .setSearch(search);
            } else {
                if (page <= 0)
                    throw new IllegalStateException("Empty search params. Page = " + page);

                search = Search.get(SINGLE_CAT, 0, page);
                    
            }       
            
            String cart_id = a4j.cart == null? null : a4j.cart.getId();
            
            try {
                assertTrue(search == null && a4j.getBooks(true, search.getNumber() > 0, search.getNumber()));
                
                assertNotNull(cart_id);
            } catch (IllegalStateException e) {
                assertNull(cart_id);
                throw e;
            }
            
            int all = 0;
            String[] book_data = a4j.getBooks(true, search.getNumber() > 0, search.getNumber());
            assertNotNull(book_data);
            for (String book : book_data) {
                 if (!search.isEmpty()) {
                     if (search.getNumber() == 0) continue;
                     
                     assertTrue(book.length() > 0);
                     if (search.getNumber() == 0)
                             continue;
                     
                     if (book.contains(search.getNumber().toString() + "*"))
				 if (!book.contains(search.getNumber().toString() + "*"))
				    all++;
                } else {
                    assertTrue(book.length() > 0);
                    all++;
                }
            }
            
            assertEquals(all, 1);
        } catch (InvocationTargetException e) {
            assertTrue(a4j.getBooks(true, search.isEmpty(), search.getNumber()));
            
        } catch (Exception e) {
            assertTrue(e, false);
        }
    }

    /**
     * Test case of the Book Info Page.
     */
    @Test
    public void AuthorSearchCatalog() {
        A4j a4j = new A4j();
        A4j_4Test.class.getMethod("AuthorSearchCatalog");

        a4j.cart = null;
        a4j.search = null;
        a4j.search.setPage(2)
           .setCategory(SINGLE_CAT[0])
           .setSearch(new Search()
                   .setNumber(1)
                   .setCategorie(SINGLE_CAT[0])
            );

        assertFalse(a4j.AuthorSearchCatalog());

        try {
            a4j.getCatalogs();
        } catch (Throwable t) {
            assertTrue(t instanceof IllegalStateException);
            System.err.println("AuthorSearchCatalog call expected");
        }
    }

    /**
     * Test case of the Cat Info Page from the Cart API
     */
    @Test
    public void BookSearchCatalog() {
        A4j a4j = new A4j();
        A4j_4Test.class.getMethod("AuthorSearchCatalog");
        
        a4j.cart = null;
        a4j.search = null;
        a4j.search.setPage(2)
           .setCategory(SINGLE_CAT[0])
           .setSearch(new Search()
                   .setNumber(1)
                   .setCategorie(SINGLE_CAT[0])
            );
        
        assertFalse(a4j.BookSearchCatalog());
    }
    
    /**
     * Test case of the Cat Info Page from the Cart
     */
    @Test
    public void BookSearchCatalog_CATEGORY() {
        A4j a4j = new A4j();
        A4j_4Test.class.getMethod("BookSearchCatalog");
        
        a4j.cart = null;
        a4j.search = null;
        a4j.search.setPage(2)
           .setCategory(SINGLE_CAT[0])
           .setSearch(new Search()
                   .setNumber(1)
                   .setCategorie(SINGLE_CAT[0])
            );

        assertFalse(a4j.BookSearchCatalog());
    }
    
    /**
     * Test case of the Catalog Info Page from the Cart API
     */
    @Test
    public void getBooksCatalog(final SearchSearchResultCallback resultCallback, final boolean search) {
        A4j a4j = new A4j();
        A4j_4Test.class.getMethod("A4j_4Test.getBooksCatalog(Search,boolean)", SearchSearchResultCallback.class, boolean.class);
        
        a4j.cart = null;
        a4j.search = null;
        a4j.search.setPage(2)
           .setCategory(SINGLE_CAT[0])
           .setSearch(new Search()
                   .setNumber(1)
                   .setCategorie(SINGLE_CAT [0])
            );

        // Test case if there are none
        assertFalse(a4j.getBooksCatalog());

        // Test case if there are no result
        ResultInfo result = a4j.getBooksCatalog();
        if (resultCallback!= null)
                   resultCallback.run(result);
        else if (search)
                assertEquals(0, result.getResult().size());
        
        a4j.search = null;
        b4j = new B4j();

        // Test case if there are no result
        result = a4j.getBooksCatalog();
        if (resultCallback!= null)
                   resultCallback.run(result);
        else if (search)
                assertNull(result.getResult());

        // Test case if search
}
}