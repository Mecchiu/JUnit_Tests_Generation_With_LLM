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
import java.util.Collection;

/**
 * Formation
 *
 * @author scarankle
 */
public class Formation {

    private String nom;
    private Calendar dateDebut;
    private Calendar dateFin;
    private Collection<Candidat> candidats;
    private Collection<RespFormation> responsables;

    /**
     * Constructeur
     *
     * @param nom
     * @param dateDebut
     * @param dateFin
     */
    public Formation(String nom, Calendar dateDebut, Calendar dateFin) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    /**
     * Retourne le nom de la formation
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne la date de debut de la formation
     *
     * @return
     */
    public Calendar getDateDebut() {
        return dateDebut;
    }

    /**
     * Retourne la date de fin de la formation
     *
     * @return
     */
    public Calendar getDateFin() {
        return dateFin;
    }

    /**
     * Retourne les candidats de la formation
     *
     * @return
     */
    public Collection<Candidat> getCandidats() {
        return candidats;
    }

    /**
     * Retourne les responsables de la formation
     *
     * @return
     */
    public Collection<RespFormation> getResponsables() {
        return responsables;
    }
}

// FormationDao.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.identity.Candidat;
import fr.unice.gfarce.identity.Formation;
import fr.unice.gfarce.identity.RespFormation;
import java.util.Calendar;

/**
 * Interface DAO de formation
 *
 * @author scarankle
 */
public interface FormationDao {

    /**
     * Retourne une formation
     *
     * @param nom
     * @param dateDebut
     * @return
     */
    public Formation findFormation(String nom, Calendar dateDebut);

    /**
     * Retourne toutes les formations
     *
     * @param nom
     * @param dateDebut
     * @return
     */
    public Formation[] findFormation(String nom, Calendar dateDebut);

    /**
     * Retourne les candidats d'une formation
     *
     * @param nom
     * @param dateDebut
     * @return
     */
    public Candidat[] findCandidats(String nom, Calendar dateDebut);

    /**
     * Retourne les responsables d'une formation
     *
     * @param nom
     * @param dateDebut
     * @return
     */
    public RespFormation[] findResponsables(String nom, Calendar dateDebut);

    /**
     * Ajoute une formation
     *
     * @param nom
     * @param dateDebut
     * @param dateFin
     */
    public void addFormation(String nom, Calendar dateDebut, Calendar dateFin);

    /**
     * Ajoute un candidat a une formation
     *
     * @param nom
     * @param dateDebut
     * @param candidat
     */
    public void addCandidat(String nom, Calendar dateDebut, Candidat candidat);

    /**
     * Ajoute un responsable a une formation
     *
     * @param nom
     * @param dateDebut
     * @param responsable
     */
    public void addResponsable(String nom, Calendar dateDebut, RespFormation responsable);

    /**
     * Supprime une formation
     *
     * @param nom
     * @param dateDebut
     */
    public void removeFormation(String nom, Calendar dateDebut);

    /**
     * Supprime un candidat d'une formation
     *
     * @param nom
     * @param dateDebut
     * @param candidat
     */
    public void removeCandidat(String nom, Calendar dateDebut, Candidat candidat);

    /**
     * Supprime un responsable d'une formation
     *
     * @param nom
     * @param dateDebut
     * @param responsable
     */
    public void removeResponsable(String nom, Calendar dateDebut, RespFormation responsable);
}

// Identite.java
package fr.unice.gfarce.identity;

import java.util.Calendar;

/**
 * Identite
 *
 * @author scarankle
 */
public class Identite {

    /**
     * Enumeration des types d'identite
     */
    public enum TypeIdentite {

        CANDIDAT, RESPONSABLE
    };

    private String nom;
    private String prenom;
    private Calendar dateNaissance;
    private TypeIdentite type;

    /**
     * Constructeur
     *
     * @param nom
     * @param prenom
     * @param dateNaissance
     * @param type
     */
    public Identite(String nom, String prenom, Calendar dateNaissance, TypeIdentite type) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.type = type;
    }

    /**
     * Retourne le nom de l'identite
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le prenom de l'identite
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Retourne la date de naissance de l'identite
     *
     * @return
     */
    public Calendar getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Retourne le type de l'identite
     *
     * @return
     */
    public TypeIdentite getType() {
        return type;
    }
}

// IdentiteDao.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.identity.Identite;
import fr.unice.gfarce.identity.Identite.TypeIdentite;
import java.util.Calendar;

/**
 * Interface DAO d'identite
 *
 * @author scarankle
 */
public interface IdentiteDao {

    /**
     * Retourne une identite
     *
     * @param nom
     * @param prenom
     * @param dateNaissance
     * @param type
     * @return
     */
    public Identite findIdentite(String nom, String prenom, Calendar dateNaissance, TypeIdentite type);

    /**
     * Retourne toutes les identites
     *
     * @param nom
     * @param prenom
     * @param dateNaissance
     * @param type
     * @return
     */
    public Identite[] findIdentite(String nom, String prenom, Calendar dateNaissance, TypeIdentite type);

    /**
     * Ajoute une identite
     *
     * @param nom
     * @param prenom
     * @param dateNaissance
     * @param type
     */
    public void addIdentite(String nom, String prenom, Calendar dateNaissance, TypeIdentite type);

    /**
     * Supprime une identite
     *
     * @param nom
     * @param prenom
     * @param dateNaissance
     * @param type
     */
    public void removeIdentite(String nom, String prenom, Calendar dateNaissance, TypeIdentite type);
}

// JdbcDaoFactory.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;
import fr.unice.gfarce.dao.JdbcDaoFactory;
import fr.unice.gfarce.dao.XmlDaoFactory;

/**
 * Fabrique de DAO JDBC
 *
 * @author scarankle
 */
public class JdbcDaoFactory extends DaoFactory {

    /**
     * Retourne un DAO de formation
     *
     * @return
     */
    public FormationDao getFormationDao() {
        return new JdbcFormationDao();
    }

    /**
     * Retourne un DAO d'identite
     *
     * @return
     */
    public IdentiteDao getIdentiteDao() {
        return new JdbcIdentiteDao();
    }
}

// JdbcFormationDao.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.identity.Candidat;
import fr.unice.gfarce.identity.Formation;
import fr.unice.gfarce.identity.RespFormation;
import java.util.Calendar;

/**
 * DAO de formation JDBC
 *
 * @author scarankle
 */
public class JdbcFormationDao implements FormationDao {

    /**
     * Retourne une formation
     *
     * @param nom
     * @param dateDebut
     * @return
     */
    public Formation findFormation(String nom, Calendar dateDebut) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retourne toutes les formations
     *
     * @param nom
     * @param dateDebut
     * @return
     */
    public Formation[] findFormation(String nom, Calendar dateDebut) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retourne les candidats d'une formation
     *
     * @param nom
     * @param dateDebut
     * @return
     */
    public Candidat[] findCandidats(String nom, Calendar dateDebut) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retourne les responsables d'une formation
     *
     * @param nom
     * @param dateDebut
     * @return
     */
    public RespFormation[] findResponsables(String nom, Calendar dateDebut) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Ajoute une formation
     *
     * @param nom
     * @param dateDebut
     * @param dateFin
     */
    public void addFormation(String nom, Calendar dateDebut, Calendar dateFin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Ajoute un candidat a une formation
     *
     * @param nom
     * @param dateDebut
     * @param candidat
     */
    public void addCandidat(String nom, Calendar dateDebut, Candidat candidat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Ajoute un responsable a une formation
     *
     * @param nom
     * @param dateDebut
     * @param responsable
     */
    public void addResponsable(String nom, Calendar dateDebut, RespFormation responsable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Supprime une formation
     *
     * @param nom
     * @param dateDebut
     */
    public void removeFormation(String nom, Calendar dateDebut) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Supprime un candidat d'une formation
     *
     * @param nom
     * @param dateDebut
     * @param candidat
     */
    public void removeCandidat(String nom, Calendar dateDebut, Candidat candidat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Supprime un responsable d'une formation
     *
     * @param nom
     * @param dateDebut
     * @param responsable
     */
    public void removeResponsable(String nom, Calendar dateDebut, RespFormation responsable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

// JdbcIdentiteDao.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.identity.Identite;
import fr.unice.gfarce.identity.Identite.TypeIdentite;
import java.util.Calendar;

/**
 * DAO d'identite JDBC
 *
 * @author scarankle
 */
public class JdbcIdentiteDao implements IdentiteDao {

    /**
     * Retourne une identite
     *
     * @param nom
     * @param prenom
     * @param dateNaissance
     * @param type
     * @return
     */
    public Identite findIdentite(String nom, String prenom, Calendar dateNaissance, TypeIdentite type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retourne toutes les identites
     *
     * @param nom
     * @param prenom
     *