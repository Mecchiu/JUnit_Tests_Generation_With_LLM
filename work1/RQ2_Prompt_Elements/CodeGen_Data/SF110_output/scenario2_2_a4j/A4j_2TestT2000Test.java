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
DAO dao;
		DAO.DAOInterface daoIF = null;

		DAO_2DAO sDao = null;

		@Test
		public void testActorSearch() {
			System.out.println("ActorSearch");
			A4j a4j = new A4j();
			assertNotNull(a4j);

			// First the DAO factory
			dao = a4j.dao = new MockDAOFactory("ActorSearch");

			try {
				dao.checkDBVersion(daoIF);
			} catch (A4jException e) {
				System.err.println("Could not get DB version because DB is already installed");

				// If this can happen no point in running twice
				dao = a4j.dao = new MockDAOFactory("ActorSearch");
				daoIF = dao.initDAO(daoIF);
				dao.checkDBVersion(daoIF);
			}

			// Now the factory
			cDao = new A4j_CartDAO(dao);
			sDao = new A4j_SearchDAO(dao);

			// Now the search
			assertNotNull(sDao.ActorSearch("name", null, 1)); // should fail 
			assertEquals(0, dao.findTotalNumber(daoIF)); // should fail 

			// Now make this even more robust, without changing the factory values
			dao = new A4jDAO();

			// Now the factory
			assertNotNull(dao.dao = new MockDAOFactory());
		}

	/**
	 * Test an actor with different characteristics.
	 */
	@Test
	public void testActorDifferent() {
		System.out.println("testActorDifferent");
		A4j a4j = new A4j();
		assertNotNull(a4j);

		// First the DAO factory
		dao = a4j.dao = new MockDAOFactory("ActorDifferent");

		// Now the factory
		cDao = new A4j_CartDAO(dao);
		sDao = new A4j_SearchDAO(dao);

		// Now the search
		assertNotNull(sDao.ActorDifferent());
	}
}
