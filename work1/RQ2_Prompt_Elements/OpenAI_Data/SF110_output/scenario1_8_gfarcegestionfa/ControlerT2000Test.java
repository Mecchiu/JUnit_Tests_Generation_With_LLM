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
	* This test case is used to test the {@link Controler#findAllFormation()} method.
	* It checks if the method returns an array of formations.
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
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;
import fr.unice.gfarce.dao.JdbcDaoFactory;
import fr.unice.gfarce.dao.XmlDaoFactory;

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

        JDBC, XML
    };

    /**
     * Fabrique de DAO
     *
     * @param typeFabrique
     * @return
     * @throws DaoFactoryException
     */
    public static DaoFactory getDaoFactory(TypeFabrique typeFabrique) throws DaoFactoryException {
        switch (typeFabrique) {
            case JDBC:
                return new JdbcDaoFactory();
            case XML:
                return new XmlDaoFactory();
            default:
                throw new DaoFactoryException("Type de fabrique inconnu");
        }
    }

    /**
     * Retourne un DAO de formation
     *
     * @return
     */
    public abstract FormationDao getFormationDao();

    /**
     * Retourne un DAO d'identite
     *
     * @return
     */
    public abstract IdentiteDao getIdentiteDao();
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
     * @param message
     */
    public DaoFactoryException(String message) {
        super(message);
    }
}

// Formation.java
package fr.unice.gfarce.identity;

import java.util.Calendar;

/**
 * Classe representant une formation
 *
 * @author scarankle
 */
public class Formation {

    private String nom;
    private Calendar dateDebut;
    private Calendar dateFin;
    private String lieu;
    private String description;
    private String objectif;
    private String prerequis;
    private String publicVise;
    private String programme;
    private String evaluation;
    private String certification;
    private String organisme;
    private String responsable;
    private String contact;
    private String email;
    private String telephone;
    private String fax;
    private String siteWeb;
    private String adresse;
    private String codePostal;
    private String ville;
    private String pays;

    /**
     * Constructeur
     *
     * @param nom
     * @param dateDebut
     * @param dateFin
     * @param lieu
     * @param description
     * @param objectif
     * @param prerequis
     * @param publicVise
     * @param programme
     * @param evaluation
     * @param certification
     * @param organisme
     * @param responsable
     * @param contact
     * @param email
     * @param telephone
     * @param fax
     * @param siteWeb
     * @param adresse
     * @param codePostal
     * @param ville
     * @param pays
     */
    public Formation(String nom, Calendar dateDebut, Calendar dateFin, String lieu, String description, String objectif, String prerequis, String publicVise, String programme, String evaluation, String certification, String organisme, String responsable, String contact, String email, String telephone, String fax, String siteWeb, String adresse, String codePostal, String ville, String pays) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.lieu = lieu;
        this.description = description;
        this.objectif = objectif;
        this.prerequis = prerequis;
        this.publicVise = publicVise;
        this.programme = programme;
        this.evaluation = evaluation;
        this.certification = certification;
        this.organisme = organisme;
        this.responsable = responsable;
        this.contact = contact;
        this.email = email;
        this.telephone = telephone;
        this.fax = fax;
        this.siteWeb = siteWeb;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    /**
     * Constructeur
     *
     * @param nom
     * @param dateDebut
     * @param dateFin
     * @param lieu
     * @param description
     * @param objectif
     * @param prerequis
     * @param publicVise
     * @param programme
     * @param evaluation
     * @param certification
     * @param organisme
     * @param responsable
     * @param contact
     * @param email
     * @param telephone
     * @param fax
     * @param siteWeb
     * @param adresse
     * @param codePostal
     * @param ville
     * @param pays
     */
    public Formation(String nom, String dateDebut, String dateFin, String lieu, String description, String objectif, String prerequis, String publicVise, String programme, String evaluation, String certification, String organisme, String responsable, String contact, String email, String telephone, String fax, String siteWeb, String adresse, String codePostal, String ville, String pays) {
        this.nom = nom;
        this.dateDebut = Calendar.getInstance();
        this.dateFin = Calendar.getInstance();
        this.lieu = lieu;
        this.description = description;
        this.objectif = objectif;
        this.prerequis = prerequis;
        this.publicVise = publicVise;
        this.programme = programme;
        this.evaluation = evaluation;
        this.certification = certification;
        this.organisme = organisme;
        this.responsable = responsable;
        this.contact = contact;
        this.email = email;
        this.telephone = telephone;
        this.fax = fax;
        this.siteWeb = siteWeb;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    /**
     * Constructeur
     *
     * @param nom
     * @param dateDebut
     * @param dateFin
     * @param lieu
     * @param description
     * @param objectif
     * @param prerequis
     * @param publicVise
     * @param programme
     * @param evaluation
     * @param certification
     * @param organisme
     * @param responsable
     * @param contact
     * @param email
     * @param telephone
     * @param fax
     * @param siteWeb
     * @param adresse
     * @param codePostal
     * @param ville
     * @param pays
     */
    public Formation(String nom, String dateDebut, String dateFin, String lieu, String description, String objectif, String prerequis, String publicVise, String programme, String evaluation, String certification, String organisme, String responsable, String contact, String email, String telephone, String fax, String siteWeb