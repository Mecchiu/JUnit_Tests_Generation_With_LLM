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
		@Test
		public void Test(){
//		A4j.KeywordSearch("cat", "books", "heavy", "1");
		A4j.KeywordSearch("kart", "cars", "thin", "0");
		A4j.KeywordSearch("cats", "all", "light", "0");
		
//		A4j.KeywordSearch("kart", "cars", "thin", "5");
//		A4j.KeywordSearch("cats", "all", "light", "5");
//		A4j.KeywordSearch("kart", "all", "large", "5");
//		assertEquals("key", 5);
		
		//assertEquals("key", 5);
		A4j.KeywordSearch("kart", "cars", null);
		assertEquals("key", 5);
		
		
		
		
		
		}
	}