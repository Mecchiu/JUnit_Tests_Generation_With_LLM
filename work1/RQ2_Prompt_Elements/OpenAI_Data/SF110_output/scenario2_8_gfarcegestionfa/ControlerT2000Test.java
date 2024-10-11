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
	* It tests if the method returns an array of formations.
	*/
	@Test
	void testFindAllFormation() {
		Controler c = new Controler();
		Formation[] f = c.findAllFormation();
		assertNotNull(f);
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
     * Fabrique de DAO
     *
     * @param typeFabrique le type de fabrique de DAO
     * @return une fabrique de DAO
     * @throws DaoFactoryException si le type de fabrique n'est pas reconnu
     */
    public static DaoFactory getDaoFactory(TypeFabrique typeFabrique) throws DaoFactoryException {
        switch (typeFabrique) {
            case DB:
                return new DaoFactoryDB();
            case XML:
                return new DaoFactoryXML();
            default:
                throw new DaoFactoryException("Type de fabrique inconnu");
        }
    }

    /**
     * Retourne un DAO pour les formations
     *
     * @return un DAO pour les formations
     */
    public abstract FormationDao getFormationDao();

    /**
     * Retourne un DAO pour les identites
     *
     * @return un DAO pour les identites
     */
    public abstract IdentiteDao getIdentiteDao();
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
     * Retourne un DAO pour les formations
     *
     * @return un DAO pour les formations
     */
    @Override
    public FormationDao getFormationDao() {
        return new FormationDaoDB();
    }

    /**
     * Retourne un DAO pour les identites
     *
     * @return un DAO pour les identites
     */
    @Override
    public IdentiteDao getIdentiteDao() {
        return new IdentiteDaoDB();
    }
}

// DaoFactoryException.java
package fr.unice.gfarce.dao;

/**
 * Exception levee par les DAO
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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DaoFactory}.
* It contains two unit test cases for the {@link DaoFactory#getDaoFactory(TypeFabrique)} method.
*/
class DaoFactoryTest {
		
	/**
	* Test case for the {@link DaoFactory#getDaoFactory(TypeFabrique)} method.
	* It tests if the method returns a DaoFactoryDB object.
	*/
	@Test
	void testGetDaoFactoryDB() {
		DaoFactory d = DaoFactory.getDaoFactory(TypeFabrique.DB);
		assertTrue(d instanceof DaoFactoryDB);
	}
	
	/**
	* Test case for the {@link DaoFactory#getDaoFactory(TypeFabrique)} method.
	* It tests if the method returns a DaoFactoryXML object.
	*/
	@Test
	void testGetDaoFactoryXML() {
		DaoFactory d = DaoFactory.getDaoFactory(TypeFabrique.XML);
		assertTrue(d instanceof DaoFactoryXML);
	}
}

// DaoFactoryXML.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;

/**
 * Fabrique de DAO pour un fichier XML
 *
 * @author scarankle
 */
public class DaoFactoryXML extends DaoFactory {

    /**
     * Retourne un DAO pour les formations
     *
     * @return un DAO pour les formations
     */
    @Override
    public FormationDao getFormationDao() {
        return new FormationDaoXML();
    }

    /**
     * Retourne un DAO pour les identites
     *
     * @return un DAO pour les identites
     */
    @Override
    public IdentiteDao getIdentiteDao() {
        return new IdentiteDaoXML();
    }
}

// Formation.java
package fr.unice.gfarce.identity;

import java.util.Calendar;
import java.util.Collection;

/**
 * Formation
 *
 * @author scarankle
 */
public class Formation {

    /**
     * Identifiant de la formation
     */
    private int id;
    /**
     * Nom de la formation
     */
    private String nom;
    /**
     * Date de debut de la formation
     */
    private Calendar dateDebut;
    /**
     * Date de fin de la formation
     */
    private Calendar dateFin;
    /**
     * Responsable de la formation
     */
    private RespFormation resp;
    /**
     * Candidats de la formation
     */
    private Collection<Candidat> candidats;

    /**
     * Constructeur
     *
     * @param id identifiant de la formation
     * @param nom nom de la formation
     * @param dateDebut date de debut de la formation
     * @param dateFin date de fin de la formation
     * @param resp responsable de la formation
     * @param candidats candidats de la formation
     */
    public Formation(int id, String nom, Calendar dateDebut, Calendar dateFin, RespFormation resp, Collection<Candidat> candidats) {
        this.id = id;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.resp = resp;
        this.candidats = candidats;
    }

    /**
     * Retourne l'identifiant de la formation
     *
     * @return l'identifiant de la formation
     */
    public int getId() {
        return id;
    }

    /**
    