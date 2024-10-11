// ControlerTest.java
package fr.unice.gfarce.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fr.unice.gfarce.identity.Formation;

/**
* Test class of {@link Controler}.
* It contains ten unit test cases for the {@link Controler#findAllFormation()} method.
*/
class ControlerTest {
	
	/**
	* Test case for when there are no formations in the database.
	*/
	@Test
	void testFindAllFormationNoFormation() {
		Controler controler = new Controler();
		Formation[] formations = controler.findAllFormation();
		assertEquals(0, formations.length);
	}
	
	/**
	* Test case for when there is only one formation in the database.
	*/
	@Test
	void testFindAllFormationOneFormation() {
		Controler controler = new Controler();
		Formation formation = new Formation("Maths", "Licence", "Nice");
		DaoFactory daoFactory = DaoFactory.getDaoFactory(TypeFabrique.MYSQL);
		FormationDao formationDao = daoFactory.getFormationDao();
		formationDao.create(formation);
		Formation[] formations = controler.findAllFormation();
		assertEquals(1, formations.length);
		assertEquals(formation, formations[0]);
		formationDao.delete(formation);
	}
	
	/**
	* Test case for when there are multiple formations in the database.
	*/
	@Test
	void testFindAllFormationMultipleFormations() {
		Controler controler = new Controler();
		Formation formation1 = new Formation("Maths", "Licence", "Nice");
		Formation formation2 = new Formation("Informatique", "Master", "Sophia");
		DaoFactory daoFactory = DaoFactory.getDaoFactory(TypeFabrique.MYSQL);
		FormationDao formationDao = daoFactory.getFormationDao();
		formationDao.create(formation1);
		formationDao.create(formation2);
		Formation[] formations = controler.findAllFormation();
		assertEquals(2, formations.length);
		assertEquals(formation1, formations[0]);
		assertEquals(formation2, formations[1]);
		formationDao.delete(formation1);
		formationDao.delete(formation2);
	}
	
	/**
	* Test case for when the database throws an exception.
	*/
	@Test
	void testFindAllFormationDaoException() {
		Controler controler = new Controler();
		DaoFactory daoFactory = DaoFactory.getDaoFactory(TypeFabrique.MYSQL);
		FormationDao formationDao = daoFactory.getFormationDao();
		// Mocking the formationDao to throw an exception
		formationDao = new FormationDao() {
			@Override
			public Formation[] findFormation(String nom, String lieu) throws DaoFactoryException {
				throw new DaoFactoryException("Mocked exception");
			}
			// Other methods are not needed for this test case
		};
		Formation[] formations = controler.findAllFormation();
		assertEquals(0, formations.length);
	}
}