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
		private final boolean debug;

		public A4j_1Test(boolean debug) {
			this.debug = debug;
		}

		@Test
		public void test1() throws DAOException {	

			// test: A1 = A1 + {B}
			String a1 = "A1=A1+{B}";

			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "" + 1000));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "2"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "3", "1"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "3", "1", null));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "2"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "100"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "2"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3", "1"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3", "1", "2"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3", "1", "3"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3", "1", "3", "2"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3", "1", "3", "2", "400"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3", "1", "3", "2", "400", "3"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3", "1", "3", "2", "400", "3", "1", "4"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3", "1", "3", "2", "400", "3", "1", "4", "3"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "100", "4", "1", "3", "200", "3", "1", "3", "2", "400", "3", "1", "4", "3"));
			assertNotNull(A4j.KeywordSearch(a1, "S", "dvd", "200", null));


			// test: A2 = A2 + {B}
			String a2 = "A2=A2+{B}";

			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", null));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "2"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "3", "1"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "3", "1", null));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "4", "1"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "4", "1", "2"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "4", "1", "3"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "4", "1", "3", "100"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "4", "1", "3", "100", "2"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "4", "1", "3", "100", "3"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "4", "1", "3", "100", "3", "1"));
			assertNotNull(A4j.KeywordSearch(a2, "S", "dvd", "100", "4", "1", "3", "100", "3", "1", "2"));
}
}