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
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
		/**
		* Test case for {@link Controler#findAllFormation()} method.
		* This test case checks if the method returns a collection of formations.
		*/
		@Test
		public void testFindAllFormation() {
				Collection<Formation> formations = null;
				assertNotNull(formations);
		}
		
}

// DaoFactory.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;
import fr.unice.gfarce.dao.DaoFactoryException;

/**
 * Fabrique de DAO
 *
 * @author scarankle
 */
public abstract class DaoFactory {

    /**
     * Enumeration des types de bases de donnees
     */
    public enum TypeFabrique {

        XML,
        SQL
    }

    /**
     * Methode de creation d'une fabrique de DAO
     * @param type
     * @return
     * @throws DaoFactoryException
     */
    public static DaoFactory getDaoFactory(TypeFabrique type) throws DaoFactoryException {
        switch (type) {
            case XML:
                return new DaoFactoryXML();
            case SQL:
                return new DaoFactorySQL();
            default:
                throw new DaoFactoryException("Type de DAO inconnu");
        }
    }

    /**
     * Methode de creation d'un DAO d'identite
     * @return
     */
    public abstract IdentiteDao getIdentiteDao();

    /**
     * Methode de creation d'un DAO de formation
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

// DaoFactorySQL.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactory;
import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;

/**
 * Fabrique de DAO pour une base de donnees SQL
 *
 * @author scarankle
 */
public class DaoFactorySQL extends DaoFactory {

    /**
     * Methode de creation d'un DAO d'identite
     * @return
     */
    public IdentiteDao getIdentiteDao() {
        return new IdentiteDaoSQL();
    }

    /**
     * Methode de creation d'un DAO de formation
     * @return
     */
    public FormationDao getFormationDao() {
        return new FormationDaoSQL();
    }
}

// DaoFactoryXML.java
package fr.unice.gfarce.dao;

import fr.unice.gfarce.dao.DaoFactory;
import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;

/**
 * Fabrique de DAO pour une base de donnees XML
 *
 * @author scarankle
 */
public class DaoFactoryXML extends DaoFactory {

    /**
     * Methode de creation d'un DAO d'identite
     * @return
     */
    public IdentiteDao getIdentiteDao() {
        return new IdentiteDaoXML();
    }

    /**
     * Methode de creation d'un DAO de formation
     * @return
     */
    public FormationDao getFormationDao() {
        return new FormationDaoXML();
    }
}

// Formation.java
package fr.unice.gfarce.identity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe representant une formation
 *
 * @author scarankle
 */
public class Formation implements Serializable {

    private String titre;

    private Calendar date_limite;

    private int montant;

    private RespFormation responsable;

    private Set<Candidat> candidats;

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     */
    public Formation(String titre, Calendar date_limite, int montant, RespFormation responsable) {
        this.titre = titre;
        this.date_limite = date_limite;
        this.montant = montant;
        this.responsable = responsable;
        candidats = new HashSet<Candidat>();
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     * @param candidats
     */
    public Formation(String titre, Calendar date_limite, int montant, RespFormation responsable, Set<Candidat> candidats) {
        this.titre = titre;
        this.date_limite = date_limite;
        this.montant = montant;
        this.responsable = responsable;
        this.candidats = candidats;
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     * @param candidats
     */
    public Formation(String titre, Calendar date_limite, int montant, RespFormation responsable, Collection<Candidat> candidats) {
        this.titre = titre;
        this.date_limite = date_limite;
        this.montant = montant;
        this.responsable = responsable;
        this.candidats = new HashSet<Candidat>(candidats);
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     */
    public Formation(String titre, Calendar date_limite, int montant, String responsable) {
        this.titre = titre;
        this.date_limite = date_limite;
        this.montant = montant;
        this.responsable = new RespFormation(responsable);
        candidats = new HashSet<Candidat>();
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     * @param candidats
     */
    public Formation(String titre, Calendar date_limite, int montant, String responsable, Set<Candidat> candidats) {
        this.titre = titre;
        this.date_limite = date_limite;
        this.montant = montant;
        this.responsable = new RespFormation(responsable);
        this.candidats = candidats;
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     * @param candidats
     */
    public Formation(String titre, Calendar date_limite, int montant, String responsable, Collection<Candidat> candidats) {
        this.titre = titre;
        this.date_limite = date_limite;
        this.montant = montant;
        this.responsable = new RespFormation(responsable);
        this.candidats = new HashSet<Candidat>(candidats);
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     */
    public Formation(String titre, String date_limite, int montant, String responsable) {
        this.titre = titre;
        this.date_limite = Calendar.getInstance();
        this.date_limite.set(Integer.parseInt(date_limite.substring(6, 10)), Integer.parseInt(date_limite.substring(3, 5)), Integer.parseInt(date_limite.substring(0, 2)));
        this.montant = montant;
        this.responsable = new RespFormation(responsable);
        candidats = new HashSet<Candidat>();
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     * @param candidats
     */
    public Formation(String titre, String date_limite, int montant, String responsable, Set<Candidat> candidats) {
        this.titre = titre;
        this.date_limite = Calendar.getInstance();
        this.date_limite.set(Integer.parseInt(date_limite.substring(6, 10)), Integer.parseInt(date_limite.substring(3, 5)), Integer.parseInt(date_limite.substring(0, 2)));
        this.montant = montant;
        this.responsable = new RespFormation(responsable);
        this.candidats = candidats;
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     * @param candidats
     */
    public Formation(String titre, String date_limite, int montant, String responsable, Collection<Candidat> candidats) {
        this.titre = titre;
        this.date_limite = Calendar.getInstance();
        this.date_limite.set(Integer.parseInt(date_limite.substring(6, 10)), Integer.parseInt(date_limite.substring(3, 5)), Integer.parseInt(date_limite.substring(0, 2)));
        this.montant = montant;
        this.responsable = new RespFormation(responsable);
        this.candidats = new HashSet<Candidat>(candidats);
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     */
    public Formation(String titre, String date_limite, int montant, RespFormation responsable) {
        this.titre = titre;
        this.date_limite = Calendar.getInstance();
        this.date_limite.set(Integer.parseInt(date_limite.substring(6, 10)), Integer.parseInt(date_limite.substring(3, 5)), Integer.parseInt(date_limite.substring(0, 2)));
        this.montant = montant;
        this.responsable = responsable;
        candidats = new HashSet<Candidat>();
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     * @param candidats
     */
    public Formation(String titre, String date_limite, int montant, RespFormation responsable, Set<Candidat> candidats) {
        this.titre = titre;
        this.date_limite = Calendar.getInstance();
        this.date_limite.set(Integer.parseInt(date_limite.substring(6, 10)), Integer.parseInt(date_limite.substring(3, 5)), Integer.parseInt(date_limite.substring(0, 2)));
        this.montant = montant;
        this.responsable = responsable;
        this.candidats = candidats;
    }

    /**
     * Constructeur
     * @param titre
     * @param date_limite
     * @param montant
     * @param responsable
     * @param candidats
     */