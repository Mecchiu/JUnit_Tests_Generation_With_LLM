// ControlerTest.java
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
class ControlerTest {

		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns an empty collection when there is no formation in the database.
		*/
		@Test
		public void testFindAllFormation_EmptyCollection() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing one formation when there is one formation in the database.
		*/
		@Test
		public void testFindAllFormation_OneFormation() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing two formations when there are two formations in the database.
		*/
		@Test
		public void testFindAllFormation_TwoFormations() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing three formations when there are three formations in the database.
		*/
		@Test
		public void testFindAllFormation_ThreeFormations() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing four formations when there are four formations in the database.
		*/
		@Test
		public void testFindAllFormation_FourFormations() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing five formations when there are five formations in the database.
		*/
		@Test
		public void testFindAllFormation_FiveFormations() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing six formations when there are six formations in the database.
		*/
		@Test
		public void testFindAllFormation_SixFormations() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing seven formations when there are seven formations in the database.
		*/
		@Test
		public void testFindAllFormation_SevenFormations() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing eight formations when there are eight formations in the database.
		*/
		@Test
		public void testFindAllFormation_EightFormations() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing nine formations when there are nine formations in the database.
		*/
		@Test
		public void testFindAllFormation_NineFormations() {
				// TODO
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection containing ten formations when there are ten formations in the database.
		*/
		@Test
		public void testFindAllFormation_TenFormations() {
				// TODO
		}
		
}

// DaoFactory.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;
import fr.unice.gfarce.dao.JdbcDaoFactory;
import fr.unice.gfarce.dao.Neo4jDaoFactory;
import fr.unice.gfarce.dao.XmlDaoFactory;

/**
 * Fabrique de DAO
 *
 * @author scarankle
 */
public abstract class DaoFactory {

    /**
     * Enumeration des types de fabriques
     */
    public enum TypeFabrique {

        JDBC, XML, NEO4J
    };

    /**
     * Retourne une fabrique de DAO
     * @param type
     * @return
     * @throws DaoFactoryException
     */
    public static DaoFactory getDaoFactory(TypeFabrique type) throws DaoFactoryException {
        switch (type) {
            case JDBC:
                return new JdbcDaoFactory();
            case XML:
                return new XmlDaoFactory();
            case NEO4J:
                return new Neo4jDaoFactory();
            default:
                throw new DaoFactoryException("Type de fabrique inconnu");
        }
    }

    /**
     * Retourne un DAO d'identite
     * @return
     */
    public abstract IdentiteDao getIdentiteDao();

    /**
     * Retourne un DAO de formation
     * @return
     */
    public abstract FormationDao getFormationDao();
}

// DaoFactoryException.java
package fr.unice.gfarce.dao;

/**
 * Exception levee par la fabrique de DAO
 *
 * @author scarankle
 */
public class DaoFactoryException extends Exception {

    /**
     * Constructeur
     * @param message
     */
    public DaoFactoryException(String message) {
        super(message);
    }
}

// FormationDao.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.identity.Formation;
import java.util.Collection;

/**
 * Interface de DAO de formation
 *
 * @author scarankle
 */
public interface FormationDao {

    /**
     * Cree une formation
     * @param formation
     */
    public void createFormation(Formation formation);

    /**
     * Cherche une formation
     * @param name
     * @param date
     * @return
     */
    public Formation findFormation(String name, String date);

    /**
     * Cherche toutes les formations
     * @return
     */
    public Collection<Formation> findAllFormation();

    /**
     * Cherche tous les candidats d'une formation
     * @param formation
     * @param date
     * @return
     */
    public Collection<Formation> findCandidatInFormation(String formation, String date);

    /**
     * Met a jour une formation
     * @param formation
     */
    public void updateFormation(Formation formation);

    /**
     * Supprime une formation
     * @param formation
     */
    public void deleteFormation(Formation formation);
}

// Identite.java
package fr.unice.gfarce.identity;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe abstraite representant une identite
 *
 * @author scarankle
 */
public abstract class Identite implements Serializable {

    /**
     * Enumeration des types d'identite
     */
    public enum TypeIdentite {

        CANDIDAT, RESP_FORMATION
    };

    /**
     * Nom de l'identite
     */
    protected String nom;

    /**
     * Prenom de