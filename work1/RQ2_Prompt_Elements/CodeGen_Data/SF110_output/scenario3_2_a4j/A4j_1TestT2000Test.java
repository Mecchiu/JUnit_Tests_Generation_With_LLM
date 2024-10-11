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
		 * This method tests if the method for creating a product is invoked with all required fields.
		 * It also verifies that the correct type of objects is being created for each field
		 * @throws {@link IllegalAccessException}
		 * @throws InvocationTargetException
		 * @throws NoSuchMethodException
		 * @throws ClassNotFoundException
		 */
		@Test
		public void KeywordSearch() throws IllegalAccessException, InvocationTargetException,
                NoSuchMethodException, ClassNotFoundException{
			A4j.KeywordSearch("finance", "finance is good for life", "light", "page 2");
			A4j.KeywordSearch("finance", "finance is good for life", "lighter", "page 3");
			A4j.KeywordSearch("finance", "finance is good for life", "lighter", "page 2");
			A4j.KeywordSearch("finance", "finance is good for life", "lighter", "page 3");
			A4j.KeywordSearch("finance", "finance is good for life", "lighter", "page 2");
			A4j.KeywordSearch("cant", "cant do this thing", "heavy", "page 1");
			A4j.KeywordSearch("cant", "cant do this thing", "light", "page 2");
			A4j.KeywordSearch("cant", "cant do this thing", "lighter", "page 2");
			A4j.KeywordSearch("cant", "cant do this thing", "light", "page 3");
			A4j.KeywordSearch("cant", "cant do this thing", "light", "page 2");
			A4j.KeywordSearch("cant", "cant do this thing", "lighter", "page 3");
		}
}
