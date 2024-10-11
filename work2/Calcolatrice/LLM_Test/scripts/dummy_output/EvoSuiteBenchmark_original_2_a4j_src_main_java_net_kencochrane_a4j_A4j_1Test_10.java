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
		private A4j dao;

		/**
		* Set up test cases
		*/
		public A4j_1Test() {
		}

		/**
		* @throws ClassNotFoundException if the class cannot be
		* found.
		* @throws InstantiationException if the class fails to be instantiated.
		*/
    @Test
	@SuppressWarnings("ThrowableResultOfMethodCallIgnored")
		public void testSetUp() throws ClassNotFoundException, InstantiationException {
        Class cls = Class.forName("net.kencochrane.a4j.DAO");
        System.out.println("Got c.class object: "+cls);
			dao = (A4j) cls.newInstance();
        System.out.println("Successfully set up");
    }

	/**
	* @see {@link DAO#Search()}
	* @throws DAOException if search is unsuccessful
	* @thrown {@link DAOException} if any other kind of exception occurs
	* @throws ClassNotFoundException if any exception occurs
	* @throws InstantiationException if DAO.Search calls DAO.save fails
	*/
	@Test
    @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
		public void testSearch() throws DAOException, ClassNotFoundException, InstantiationException {

			final String[] input = {"dvd", "ebs", "ebs5", "emc", "fs", "nms", "nms3d"};
			final String[] filter = {"product", "type", "page"};
			final String[] orderby = {"date"};
			final Integer[] limit = {Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7),
					Integer.valueOf(1), Integer.valueOf(3)};
			final Integer page = 1;
			final String order = "asc";
			final String offset = "asc";


			//test 1 - search
            Search search = dao.Search();
			try {
				search.Search(filter, orderby, page, limit);
				/* test that search succeeds */
				assertTrue(1);
				search.setFilter(filter, filter, null, limit);
		        DAO.StoreDAO<Search> store = dao.getStoreDAO();
				query = "";
		        query = query + "(";
		        query = query + filter[0];
		        query = query + ")";

		        query = query + "(";
		        query = query + filter[1];
		        query = query + ")";

		        query = query + "(";
		        query = query + filter[2];
		        query = query + ")";

			     /* test that search does not find more than the max results */
		        search.Search(filter, orderby, page, limit);

			} catch (DAOException e) {
				assertEquals("Max results has been exceeded", e.getMessage());
				/* query still fails */
			}
	  		
	}

	/**
	 * @see {@link DAO#Search()}
	 * @throws DAOException if search is unsuccessful
	 * @thrown {@link DAOException} if any other kind of exception occurs
	 * @throws ClassNotFoundException if any exception occurs
	 * @throws InstantiationException if DAO.Search calls DAO.save fails
	*/
	@Test
    @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
		public void testSearchByType() throws DAOException, ClassNotFoundException, InstantiationException {

			Search search = dao.Search();


			query = "";
			query = query + "(";
}
}