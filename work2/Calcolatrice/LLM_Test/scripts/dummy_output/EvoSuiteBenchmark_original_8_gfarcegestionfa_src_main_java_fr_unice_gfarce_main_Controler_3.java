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
		
    /**
     * Fait rechercher les deux bases de donnees
     *
     * @throws DaoFactoryException si la DaoFactory doit être utilisée
     * @throws WriteException si l'export de l'XLS ne doit pas être utilisé
     * @throws DaoFactoryException : l'exception au chargement des donnees
     */
    @Test
    public void testFindAllFormation() throws DaoFactoryException, WriteException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        DaoFactory dao = new DaoFactory(true);
        DaoFactoryException exception = null;
        try {
            String sheet = dao.getExportDao().getClass().getName();
            FormationDao formationDao = dao.getFormationDao(TypeFabrique.FORMATION);
            
            // Création du Fichier
            FenetreChoix f = new FenetreChoix();
            f.setTypeFichier(FenetreChoix.FichIER_CONTAINER);
            f.setName("container");
            f.setParentCombo("parentCombo");
            f.setExportDatasetFormat("csv");
            f.setFichier("Formation.xls");
            WritingXLS xls = new WritingXLS(new FormationDao(f),dao.getExportDao().getFileName()+".export",TypeFabrique.FORMATION);
            xls.setSheetName(sheet);
            xls.setDateFormat("dd-MM-yyyy");
            xls.setDateFormat("dd MMM yyyy");
            xls.write();
            
            // Retourne les données
            Collection<Formation> formations = formationDao.findAll();
            
            assertNotNull("No Formation trouvé!", formations);
            assertTrue("La Formation n'est pas pris en charge", formations.isEmpty());            
    		
        } catch (IOException e) {
            exception = new DaoFactoryException(e);
            e.printStackTrace();
            fail("La légende dans le XML d'origine doit être présent sur le fichier de l'export. Il doit gérer tout les mots-données à récupérer");
        } catch (ParseException e) {
            exception = new DaoFactoryException(e);
            e.printStackTrace();
            fail("La légende dans le XML présent sur le fichier de l'export donne déja pourquoi les données seront prises");
        } catch (RowsExceededException e) {
            exception = new DaoFactoryException(e);
            e.printStackTrace();
            fail("La légende dans le XML du fichier présent sur le fichier doit être présent sur l'exercice");
        }
    }
	
}