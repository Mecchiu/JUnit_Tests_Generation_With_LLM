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
		private final A4j _this = new A4j();

		@Test
		public void testInit() {
			assertNotNull(_this.AuthorSearch("Michael", "mike"));
		}
		@Test
		public void testSearchProduct() {
			assertTrue(_this.AuthorSearch("Michael", "Mike") instanceof Product);
		}
		@Test
		public void testSearchDAO() {
			assertTrue(_this.AuthorSearch("Mike", "Mike@") instanceof Cart);
		}
		@Test
		public void testSearchSearch() {
			assertTrue(_this.AuthorSearch("Michael|Mike") instanceof Cart);
		}
		@Test
		public void testSearchDAOandSearch() {
			assertTrue(_this.AuthorSearch("Mike|Michael") instanceof Cart);
		}

		@Test
		public void testGetSearchResult() {
			assertFalse(_this.AuthorSearch("Mike", "Mike@") instanceof Product);
		}

		@Test
		public void testGetDAO() {
			assertNotNull(_this.AuthorSearch("Kevin", "Kevin"));
		}
		@Test
		public void testDAOs() {
			assertNotNull(_this.AuthorSearch("Mike", "Kevin") instanceof Search);
		}
	}