// A4j_0Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_0Test {
private static void assertMatch(Object first, Object second, boolean result, String expected) {
				if (result == true) return;
				assertEquals(
					"The result does not match",
					expected,
					(" (" + first + " " + second + ") * " + result.toString() + " * " + result.toString() + "{}  " +
					expected.replace("{}", first) + " * " + result.toString().replace("{}", second) +
					")"
				);
		}

		@Test
		void BlendedSearch() {
			Long expected = 1L;
			Long query1 = 10L;
			Long query2 = 11L;
			Long query3 = 12L;
			Long query4 = 13L;
			expected = expected * 2L;
			assertMatch(BlendedSearch(query1, false).getContent(), Blast.Search_Title.C.title, 
				query1 == expected.longValue(), "Query1");
			assertMatch(BlendedSearch(query2, false).getContent(), Blast.Search_Title.C.title, 
				query2 == expected.longValue(), "Query2");
			assertMatch(BlendedSearch(query3, false).getContent(), Blast.Search_Title.C.title, 
				query3 == expected.longValue(), "Query3");
			assertMatch(BlendedSearch(query4, false).getContent(), Blast.Search_Title.C.title, 
				query4 == expected.longValue(), "Query4");
		}
}