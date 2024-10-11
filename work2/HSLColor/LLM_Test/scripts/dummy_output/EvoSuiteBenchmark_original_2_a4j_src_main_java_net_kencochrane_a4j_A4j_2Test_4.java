// A4j_2Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_2Test {
		private final Product p1, p2, p3;
		private final Search s1, s2, s3;

		/**
		* Constructor for A4j_2Test.
		* @param testcaseName name of testcase
		* @param mode (dvd, vhs, video) - testcase
		* @param page - page which should be used for the test search
		*/
		public A4j_2Test(final String testcaseName, String mode, String page) {
			p1 = Product.getByName(testcaseName);
            p2 = Product.getByName(testcaseName
                + (".dvd" == mode? "3" : ""))
            ;
            p3 = Product.getByName(testcaseName
                + (".vhs" == mode? "6" : ""))
            ;
			s1 = Search.getByName(testcaseName
                + (".video" == mode? "1" : "2"));
			s2 = Search.getByName(testcaseName
                + (".dvd" == mode? "3" : "4"));
			s3 = Search.getByName(testcaseName
                + (".vhs" == mode? "7" : "8"));
		}

		/**
		 * Unit-test for {@link A4j#ActorSearch(String, String, String)}.
		 * <tt>search</tt> is 1, 3 and 6, while <tt>page</tt> is 2, 3 and 6.
		 */
		@Test
		public void testActorSearch() {
			final A4j a4j = A4J;
			final A4j_Utils a4jU = new A4j_Utils(p1, p3, s1);
			final A4j_Utils a4jV = new A4j_Utils(p1, p3, s2);
			final A4j_Utils a4jW = new A4j_Utils(p1, p3, s3);

			final ProductResult pr = a4jU.ActorSearch(p1.getId(), p1.getName(), page);
			assertNotNull(pr);

			// test: p1
			final ProductInfo p1Info = pr.getProducts().iterator().next();

			assertNotNull(p1Info);
			assertEquals(page, p1Info.getPage());

			// test: p2
			final ProductInfo p2Info = p2.getProducts().iterator().next();
			assertNotNull(p2Info);

			// test: p3
			final ProductInfo p3Info = p3.getProducts().iterator().next();
			assertNotNull(p3Info);

			// test: s1
			final SearchResult rs = s1.Search(p1Info.getProductid(), p1Info.getName(), p1Info.getPage());
			assertNotNull(rs);
			assertEquals(p1Info.getPage(), rs.getPages().get(0));
			assertEquals(p1Info.getPage(), rs.getTotalPages().get(0));

			// test: s2
			// assertThat("should not be null",s2.getLimit(), "d" < 0);
			assertNotNull(s2.getLimit());
			assertEquals(page, s2.getLimit("d").get(-1).getValue());
			// assertThat("should not be null",s2.getLimit(0), "d" < 0);

			// test: s3
			// assertThat("should not be null",s3.getLimit(), "d" < 0);
			assertNotNull(s3.getLimit());
			assertEquals(page, s3.getLimit("d").get(-1).getValue());
			// assertThat("should not be null",s3.getLimit(0), "d" < 0);

			// test: p1.getAllProducts()
			final ProductCategory pc1 = p1.getAllProducts();
			assertNotNull(pc1);
			assertEquals(1, pc1.getProducts().size());
			assertTrue(pc1.getProducts().iterator().next()!= p1Info.getProductid());

		}

}