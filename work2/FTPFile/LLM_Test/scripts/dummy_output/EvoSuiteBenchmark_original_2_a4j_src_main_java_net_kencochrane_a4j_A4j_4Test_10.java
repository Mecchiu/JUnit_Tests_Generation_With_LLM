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
		/**
		 * Create unit test case for {@link A4j#AuthorSearch(String, String)}
		 */
		public A4j_4Test(int Page) {
		}

		@Test
	     	public void testAuthorSearch() {
	     		// Check we have correct number of parameters
	     		assertEquals(Page, 6, "Wrong number of parameters. Use 4 for the page");
	     		// Check we get correct result for the page
	        	assertEquals(Cart.getInstance().getCart().size(), 6, "Cart size is wrong");
	        	
	    		// Check all cart items are correctly constructed
	        	assertNotNull(Cart.getInstance().getProduct(11).getInfo(), "Product not correctly returned");
	        	assertNotNull("Product 11 should exist", Cart.getInstance().getProduct(11));
	
	        	// This product will be used inside the search
	        	assertNotNull(Cart.getInstance().getCart().getProductByNo(1234).getInfo(), "Product not correctly returned");
	        	assertNotNull("The product 1234 is not the product that is used inside the search", Cart.getInstance().getCart().getProductByNo(1234));
	
		        	// Check we have correct number of products inside the cart
	        	assertEquals(Cart.getInstance().getCart().size(), 2, "Cart is not as expected");
	        	// Check all products as expected
	    		assertEquals(Cart.getInstance().getProduct(11).getInfo(), "Item 11", "Product 11");
	        	assertEquals(Cart.getInstance().getProduct(1234).getInfo().getName(), "Cart Product 1234", "Product  1234");
	        	
	        	// Check that the product has the correct information
	        	assertNotNull(Cart.getInstance().getProduct(1234).getInfo().getDescription());
	    		assertNotNull(Cart.getInstance().getProduct(1234).getInfo().getPrice());
	    		
	        	// Check that the author of the product exists
	        	assertNotNull(Cart.getInstance().getCart().getAuthorById(11));
	        	assertNotNull(Cart.getInstance().getCart().getAuthorById(1234));
	        	
	        	// Check that the author of the products exists
	        	assertNotNull(Cart.getInstance().getCart().getAuthor(1234));
	        	assertNotNull(Cart.getInstance().getCart().getAuthor(1234));
	
	        	// Check that the product exists before the search is called
	        	assertNotNull(Cart.getInstance().getProduct(1234).getInfo());
	        	assertNotNull(Cart.getInstance().getProduct(1234).getInfo().getDescription());
	        	
	        	// Check that the product has the correct information after the search is called
	        	assertNotNull(Cart.getInstance().getProduct(1234).getInfo().getInfo());
	            assertNotNull(Cart.getInstance().getProduct(1234).getInfo().getPrice());
	        	
	        	// Check the search for the author of the product
	        	Search.Result result = new Search.Result()
	        			.setAuthorID(11)
	        			.setAuthorName(new AuthorName("Mr. K", "Mr. K", "K", "Mr. K", 26, "123"))
	        			.setAuthorURL("");
	        	assertEquals("Search is returned for the author", 1, result.getLimit());
	        	assertNull("Should not return anything after the search", result.getRows());
	        	
	        	// Check that the author of the products exists before the search is called
	        	result.setAuthorID(1234);
	        	assertNotNull(Cart.getInstance().getCart().getAuthor(1234));
	        	result.setAuthorID(1234);
	        	assertEquals("Search is returned for the author", 4, result.getLimit());
	        	assertNotNull("No results returned.", result.getRows());
	        	
	        	// Check that the second author of the products exists before the search is called
	        	result.setAuthorID(1234);
	        	assertNotNull(Cart.getInstance().getCart().getAuthor(1234));
	    		
	        	// Check that the authorization URL of the product is returned
	        	Product info = Cart.getInstance().getCart().getProductByNo(1234).getInfo();
	        	assertNotNull("The product 1234 should be shown", info);
	         	assertEquals("The product 1234 should exist", 5, info.getURL());
	        	
	        	// Search for the category
	        	Search.Result results = new Search.Result()
	        			.setCategoryID(11)
	        			.setCategoryName("Mr. K");
	        	assertEquals("Search is returned for the category", 1, results.getLimit());
	        	assertEquals(1, results.getRows().size());
	        	
	        	// Search for the category
	        	results = new Search.Result()
	        			.setCategoryID(1234);
	        	assertEquals("Search is returned for a wrong category", 1, results.getLimit());
	        	assertNotEquals("Results should not contain the wrong category", Cart.getInstance().getAuthor(1234).getInfo().getCategoryName(), "Mr. K");
	        	assertEquals(12, results.getRows().size());
	        	
	        	// Perform the search again with a wrong category
	        	results.setCategoryID(1234);
	        	assertEquals("Search is not returning anything after a wrong category", 2, results.getLimit());
	        	assertNotEquals("Results should not contain the wrong category", Cart.getInstance().getCart().getCategoryByNo(1234), "Mr. K");
	        	assertEquals("Results should not contain the wrong category", Cart.getInstance().getCart().getAuthor(1234).getInfo().getCategoryName(), "Mr. K");
	        	assertEquals(12, results.getRows().size());
	        }
}