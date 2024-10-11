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
		 * This test case checks the 'AuthorSearch' method for valid parameters.
		 * <p>
		 * It is executed three times: by creating a new instance;
		 * test method by using an existing instance (which may be deleted by the calling
		 * thread for another test).
		 * by by using the class name ("AuthorSearch") of the existing instance;
		 * test method by using the parameters from the previous instance.
		 *
		 * @since 1.0
		 * @see net.kencochrane.a4j.DAO#AuthorSearch(String, String)
		 * @see net.kencochrane.a4j.DAO.AuthorSearch
		* @see net.kencochrane.a4j.DAO.Cart
		* @see net.kencochrane.a4j.DAO.Product
		* @see net.kencochrane.a4j.DAO.Search
		*
		 * @since 1.0
		 */
		@Test
		public void testAuthorSearchValidParameters() {
				A4j.AuthorSearch("Bolier", "Sales");
				assertNotNull("Expecting 'AuthorSearch' error", A4j.AuthorSearch( "Bolier", "Sales") );
				assertNotNull("'AuthorSearch' does not work", A4j.AuthorSearch("Bolier", "Sales", true) );
				assertNotNull("'AuthorSearch' does not work", A4j.AuthorSearch( "Alfi", "Sales", true) );
		}
}