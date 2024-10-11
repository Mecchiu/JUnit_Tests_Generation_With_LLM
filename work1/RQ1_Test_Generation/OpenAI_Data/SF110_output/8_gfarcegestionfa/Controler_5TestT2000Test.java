// Controler_5Test.java
package fr.unice.gfarce.main;

import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import fr.unice.gfarce.dao.DaoFactory;
import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;
import fr.unice.gfarce.identity.Candidat;
import fr.unice.gfarce.identity.Formation;
import fr.unice.gfarce.identity.Identite;
import fr.unice.gfarce.identity.Identite.TypeIdentite;
import fr.unice.gfarce.identity.RespFormation;
import fr.unice.gfarce.interGraph.FenetreChoix;
import fr.unice.gfarce.xls.WritingXLS;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Controler}.
* It contains ten unit test cases for the {@link Controler#findAllFormation()} method.
*/
class Controler_5Test {

		private Controler controler;
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation2() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation3() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation4() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation5() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation6() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation7() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation8() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation9() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
		
		/**
		* Test case for the {@link Controler#findAllFormation()} method.
		* This test case is used to test the {@link Controler#findAllFormation()} method.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindAllFormation10() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Formation[] formations = controler.findAllFormation();
				assertEquals(formations.length, 0);
		}
}

// Controler_6Test.java
package fr.unice.gfarce.main;

import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import fr.unice.gfarce.dao.DaoFactory;
