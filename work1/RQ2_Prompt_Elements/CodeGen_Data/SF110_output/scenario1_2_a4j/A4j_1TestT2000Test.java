// A4j_1Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4j_1Test {
/**
		 * Check if the method is called correctly with invalid parameters.
		 */
		@Test
		public void whenCallWrongNumberOfParameters_ItReturnsError() {
			String searchTerm = "Test String";
			String productLine = "Folio";
			String type = "Plastic";
			String page = "Page";
			ProductInfo info = null;
			try {
				info = A4j.KeywordSearch(searchTerm, productLine, type, page);
			} catch (A4jBadQueryException e) {
				assertTrue(true);
				return;
			}
			assertTrue(false);
		}
		/**
		 * Check if the method is properly called correctly.
		 */
		@Test
		public void whenCallCorrectParameter_ItReturnsCorrectData() {
			String searchTerm = "Test String";
			String productLine = "Folio";
			String type = "Plastic";
			String page = "Page";
			String result = null;
			try {
				result = A4j.KeywordSearch(searchTerm, productLine, type, page);
			} catch (A4jErrorException e) {
				return;
			}
			assertNotNull(result);
			assertNotNull(result);
		}
}
