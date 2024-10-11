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
		* Unit test case for A4j.KeywordSearch(String, String, String, String).
		* Given three product line books to search.
		*
		* @since 1.0
		*/
		@Test
		public void test() {
					// Unit tests for A4j.KeywordSearch(String, String, String, String)
				String testData = "{\"productLine\":\"Dvd 1, 1\",\"type\":\"s\",\"page\":\"3\",\"size\":\"200\":\"500\"}";
					JSONObject testResult = DAO.KeywordSearch(testData, 1, 1, 3);
					assertNotNull("Test result", testResult);	
				//System.out.println(testResult);
		}
	}