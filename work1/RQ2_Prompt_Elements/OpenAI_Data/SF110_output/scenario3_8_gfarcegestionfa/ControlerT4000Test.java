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
                throw new DaoFactoryException("Type de fabrique inconnu : " + typeFabrique);
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

import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
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

// DaoFactoryXML.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
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
     * Candidats de la formation
     */
    private Collection<Candidat> candidats;
    /**
     * Responsable de la formation
     */
    private RespFormation respFormation;

    /**
     * Constructeur
     *
     * @param nom le nom de la formation
     * @param dateDebut la date de debut de la formation
     * @param dateFin la date de fin de la formation
     * @param candidats les candidats de la formation
     * @param respFormation le responsable de la formation
     */
    public Formation(String nom, Calendar dateDebut, Calendar dateFin, Collection<Candidat> candidats, RespFormation respFormation) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.candidats = candidats;
        this.respFormation = respFormation;
    }

    /**
     * Retourne le nom de la formation
     *
     * @return le nom de la formation
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne la date de debut de la formation
     *
     * @return la date de debut de la formation
     */
    public Calendar getDateDebut() {
        return dateDebut;
    }

    /**
     * Retourne la date de fin de la formation
     *
     * @return la date de fin de la formation
     */
    public Calendar getDateFin() {
        return dateFin;
    }

    /**
     * Retourne les candidats de la formation
     *
     * @return les candidats de la formation
     */
    public Collection<Candidat> getCandidats() {
        return candidats;
    }

    /**
     * Retourne le responsable de la formation
     *
     * @return le responsable de la formation
     */
    public RespFormation getRespFormation() {
        return respFormation;
    }
}

// FormationDao.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.identity.Formation;
import java.util.Collection;

/**
 * DAO pour les formations
 *
 * @author scarankle
 */
public interface FormationDao {

    /**
     * Retourne toutes les formations
     *
     * @return un tableau contenant toutes les formations
     */
    public Formation[] findAllFormation();

    /**
     * Retourne une formation
     *
     * @param nom le nom de la formation
     * @return la formation
     */
    public Formation findFormation(String nom);

    /**
     * Retourne les formations d'un candidat
     *
     * @param candidat le candidat
     * @return les formations du candidat
     */
    public Collection<Formation> findFormationByCandidat(String candidat);

    /**
     * Retourne les formations d'un responsable
     *
     * @param responsable le responsable
     * @return les formations du responsable
     */
    public Collection<Formation> findFormationByResponsable(String responsable);

    /**
     * Retourne les formations d'un candidat
     *
     * @param candidat le candidat
     * @return les formations du candidat
     */
    public Collection<Formation> findFormationByCandidat(int candidat);

    /**
     * Retourne les formations d'un responsable
     *
     * @param responsable le responsable
     * @return les formations du responsable
     */
    public Collection<Formation> findFormationByResponsable(int responsable);

    /**
     * Ajoute une formation
     *
     * @param formation la formation a ajouter
     */
    public void addFormation(Formation formation);

    /**
     * Supprime une formation
     *
     * @param formation la formation a supprimer
     */
    public void removeFormation(Formation formation);
}

// FormationDaoDB.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.identity.Formation;
import java.util.Collection;

/**
 * DAO pour les formations pour une base de donnees
 *
 * @author scarankle
 */
public class FormationDaoDB implements FormationDao {

    /**
     * Retourne toutes les formations
     *
     * @return un tableau contenant toutes les formations
     */
    @Override
    public Formation[] findAllFormation() {
        return null;
    }

    /**
     * Retourne une formation
     *
     * @param nom le nom de la formation
     * @return la formation
     */
    @Override
    public Formation findFormation(String nom) {
        return null;
    }

    /**
     * Retourne les formations d'un candidat
     *
     * @param candidat le candidat
     * @return les formations du candidat
     */
    @Override
    public Collection<Formation> findFormationByCandidat(String candidat) {
        return null;
    }

    /**
     * Retourne les formations d'un responsable
     *
     * @param responsable le responsable
     * @return les formations du responsable
     */
    @Override
    public Collection<Formation> findFormationByResponsable(String responsable) {
        return null;
    }

    /**
     * Retourne les formations d'un candidat
     *
     * @param candidat le candidat
     * @return les formations du candidat
     */
    @Override
    public Collection<Formation> findFormationByCandidat(int candidat) {
        return null;
    }

    /**
     * Retourne les formations d'un responsable
     *
     * @param responsable le responsable
     * @return les formations du responsable
     */
    @Override
    public Collection<Formation> findFormationByResponsable(int responsable) {
        return null;
    }

    /**
     * Ajoute une formation
     *
     * @param formation la formation a ajouter
     */
    @Override
    public void addFormation(Formation formation) {
    }

    /**
     * Supprime une formation
     *
     * @param formation la formation a supprimer
     */
    @Override
    public void removeFormation(Formation formation) {
    }
}

// FormationDaoXML.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.identity.Formation;
import java.util.Collection;

/**
 * DAO pour les formations pour un fichier XML
 *
 * @author scarankle
 */
public class FormationDaoXML implements FormationDao {

    /**
     * Retour