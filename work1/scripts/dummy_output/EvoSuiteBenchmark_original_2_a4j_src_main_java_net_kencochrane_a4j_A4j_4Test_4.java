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
		A4j_4Test() {
	}
		@Test
	public void AuthorSearchTestCase() {
		// Add code in ProductInfo class to check the author result
		final ProductInfo author = new ProductInfo("Harry Potter", "harry@potter.com");
		final ProductInfo author2 = new ProductInfo("Peter Bjoern", "sarah@birn.com");
		final ProductInfo author3 = new ProductInfo("Philip Bloggs", "phil@bloggs.com");
		Test.
	   assertEquals(
	      "Harry Potter",
	      author.getAuthor()
	    );
		Test.assertEquals(
	     "harry@potter.com",
	     author.getAuthorLabel());
		Test.assertEquals(
		  "harry@bloggs.com",
	     author.getAuthorImage());
		Test.assertEquals(
	     "Philip Bloggs",
	     author.getAuthorName());
		Test.
    test();
    
      return;
   }
}
/* A4j_4Test extends A4j_4Test and it is defined as a UnitTest class which defines a test case for {@link A4j#AuthorSearch(String, String)} method
*/
// A4j_4Test.java