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
		protected A4j getA4j() {
                return new A4j();
			}

		/**
		* Verifies the results when creating a Search object.
		* @throws IllegalArgumentException if parameter is null
		* @throws IllegalAccessException if Search object is abstract
		*/
		@Test
		public void verifySearchArgument() throws IllegalArgumentException,
			IllegalAccessException {
				final Search search = new Search();
				assertNotNull("Search object is not created", search);
	}

		/**
		* Verifies the results when creating a Search object after instantiation.
		* @throws IllegalArgumentException if parameter is null
		* @throws IllegalAccessException if Search object is abstract
		*/
		@Test
		public void verifyAfterInstantiationSearchParameter() throws IllegalArgumentException,
			IllegalAccessException {
				final A4j obj = getA4j();
				assertNotNull("Search object is not created", obj);
				assertEquals("Search has wrong number of parameters", 2, obj.count(Search.class));
	}

		/**
		* Verifies the results when using a different type for searching.
		* @throws IllegalArgumentException if parameter is null or unsupported
		* @throws IllegalAccessException if Search object is not abstract
		*/
		@Test
		public void verifyDifferentSearchArgumentTypes() throws IllegalArgumentException, IllegalAccessException {
				final Search search = new Search();
				search.setSearchType(A4j.SearchTypes.DVDS.toString());
				assertNotNull("Search object is not created", search);
	}

		/**
		* Verifies the results when using a different type for searching.
		* @throws IllegalArgumentException if parameter is null or unsupported
		* @throws IllegalAccessException if Search object is not abstract
		*/
		@Test
		public void verifyDifferentSearchParameterTypes() throws IllegalArgumentException, IllegalAccessException {
				final Search search = new Search();
				search.setSearchType(Dvds.class.getName());
				assertNotNull("Search object is not created", search);
	}

		/**
		* Verify if DAO object is created.
		* @throws IllegalArgumentException if DAO object is not created
		* @throws IllegalAccessException if DAO object is abstract (most likely an update DAO)
		*/
		@Test
		public void verifyDAOCreate() throws IllegalArgumentException, IllegalAccessException {
				assertNotNull("DAO object is null", A4j.DAO.get());
	}

		/**
		* Verify if DAO object is updated. This is done at the same time DAO object is created.
		* @param DAODAOTestDAO object containing a DAO test DAO instance
		* @throws IllegalArgumentException if DAO object is not correctly created
		* @throws IllegalAccessException if DAO object is abstract
		*/
		@Test
		public void verifyDAOReturnDAOUpdate(DAODAOTestDAODAO testDAO) throws IllegalArgumentException, IllegalAccessException {
				assertEquals("DAO object is not properly updated", DAO.get().getTestDAO(), testDAO.getTestDAO());
		}

		/**
		* Verify if DAO object is replaced by DAODAODAO object.
		* @param DAODAOTestDAO object containing a DAO test DAO instance
		* @throws IllegalArgumentException if DAO object is not correctly created
		* @throws IllegalAccessException if DAO object is abstract (most likely an update DAO)
		*/
		@Test
		public void verifyDAOReturnDAOReplacedDAO(DAODAOTestDAODAODAO testDAO) throws IllegalArgumentException, IllegalAccessException {
				assertSame("DAO object is not properly replaced", DAO.get().getTestDAO(), testDAO);
		}

		/**
		* Verify if DAO object is destroyed.
		* @throws IllegalArgumentException if DAO object is not correctly created.
		* @throws IllegalAccessException if DAO object is abstract
		*/
		@Test
		public void verifyDAODestroy() throws IllegalArgumentException, IllegalAccessException {
				final DAODAOTestDAODAO testDAO = new DAODAOTestDAODAO();
				final DAOFactoryDAODAODAO testDAOFactory = new DAOFactoryDAODAODAO();
				final DAODAODAODAODAODAODAODAODAODAODAODAO testDAO2 = DAO.get().getTestDAO();
}
}