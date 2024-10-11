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
* It contains one unit test case for the {@link Controler#findAllFormation()} method.
*/
class ControlerTest {
		
    @Test
    public void testFindAllFormation() {
        // Creation de la base de données
        FormationDao formationDao = DaoFactory.getInstance().getFormationDao();
        // Création d'un identité
        IdentiteDao identiteDao = DaoFactory.getInstance().getIdentiteDao();
        // Création de l'interface graphique
        FormationDao.getInstance().createIFD(formationDao);
        IdentiteDao.getInstance().createIDD(identiteDao, formationDao);
        
        // Testing pour la formation
        Collection<Formation> allFormation = formationDao.findAllFormation();
        assertNotNull(allFormation);
        assertTrue(allFormation.contains(Formation.getInstance()));
        assertEquals(allFormation.size(), getNumberOfFormations());
        
        for (Formation formation : allFormation) {
            Identite identite = formation.getIdentite();
            assertNotNull(identite);
            assertEquals(identite.getTypeIdentite(), TypeIdentite.identiteChoix);
            String number = identite.getRefPart().getNoIdentification();
            assertEquals(number, getNumberOfIdentites());
        }
        IdentiteDao.getInstance().deleteIdentite(identiteDao, formationDao);
    }

	
    @Test
    public void testFindAllFormationByFenetreChoix() {
        // Creation de la base de données
        FormationDao formationDao = DaoFactory.getInstance().getFormationDao();
        // Création d'un identité
        IdentiteDao identiteDao = DaoFactory.getInstance().getIdentiteDao();
        // Création du tableau de formations
        FormationDao.getInstance().createIFD(formationDao);
        
        // Retourne une collection au format d'identites pour le formulaire izquif
        Collection<Formation> allFormation = formationDao.findAllFormationByFenetreChoix(FenetreChoix.EUROM_NOM);
        assertNotNull(allFormation);
        assertTrue(allFormation.contains(Formation.getInstance()));
        assertEquals(allFormation.size(), getNumberOfFormations());
        
        for (Formation formation : allFormation) {
            Identite identite = formation.getIdentite();
            assertNotNull(identite);
            assertEquals(identite.getRefPart().getTypeFenetreChoix(), FenetreChoix.EUROM_NOM);
            String number = identite.getRefPart().getNoIdentification();
            assertEquals(number, getNumberOfIdentites());
        }
        IdentiteDao.getInstance().deleteIdentite(identiteDao, formationDao);
    }
    
    /**
     * Retourne le nombre de identites de formations entier à partir
     * de l'utilisateur courant
     *
     * @return le nombre de identites
     */
    protected int getNumberOfIdentites() {}
    
    /**
     * Retourne le numéroté du tableau de identites
     *
     * @return le numéroté du tableau de identites
     */
    protected int getNumberOfIdentities() {
        return 0;
    }
    
}