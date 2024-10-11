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
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation1() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation2() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation3() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation4() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation5() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation6() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation7() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation8() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation9() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation10() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
}

// DaoFactory.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;

/**
 * Fabrique de DAO
 *
 * @author scarankle
 */
public abstract class DaoFactory {

    /**
     * Enumeration des types de fabriques de DAO
     */
    public enum TypeFabrique {

        /**
         * Fabrique de DAO pour une base de donnees
         */
        DB,
        /**
         * Fabrique de DAO pour un fichier XML
         */
        XML
    }

    /**
     * Fabrique de DAO pour une base de donnees
     */
    public static final TypeFabrique DB = TypeFabrique.DB;
    /**
     * Fabrique de DAO pour un fichier XML
     */
    public static final TypeFabrique XML = TypeFabrique.XML;

    /**
     * Retourne une fabrique de DAO
     *
     * @param typeFabrique le type de fabrique de DAO
     * @return une fabrique de DAO
     * @throws DaoFactoryException si le type de fabrique de DAO n'est pas
     * supporte
     */
    public static DaoFactory getDaoFactory(TypeFabrique typeFabrique) throws DaoFactoryException {
        switch (typeFabrique) {
            case DB:
                return new DaoFactoryDB();
            case XML:
                return new DaoFactoryXML();
            default:
                throw new DaoFactoryException("Type de fabrique de DAO inconnu");
        }
    }

    /**
     * Retourne un DAO pour les identites
     *
     * @return un DAO pour les identites
     */
    public abstract IdentiteDao getIdentiteDao();

    /**
     * Retourne un DAO pour les formations
     *
     * @return un DAO pour les formations
     */
    public abstract FormationDao getFormationDao();
}

// DaoFactoryDB.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;

/**
 * Fabrique de DAO pour une base de donnees
 *
 * @author scarankle
 */
public class DaoFactoryDB extends DaoFactory {

    /**
     * Retourne un DAO pour les identites
     *
     * @return un DAO pour les identites
     */
    @Override
    public IdentiteDao getIdentiteDao() {
        return new IdentiteDaoDB();
    }

    /**
     * Retourne un DAO pour les formations
     *
     * @return un DAO pour les formations
     */
    @Override
    public FormationDao getFormationDao() {
        return new FormationDaoDB();
    }
}

// DaoFactoryException.java
package fr.unice.gfarce.dao;

/**
 * Exception levee par les fabriques de DAO
 *
 * @author scarankle
 */
public class DaoFactoryException extends Exception {

    /**
     * Constructeur
     *
     * @param message le message de l'exception
     */
    public DaoFactoryException(String message) {
        super(message);
    }
}

// DaoFactoryTest.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;