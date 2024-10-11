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
    
    void findAllFormation_returnsArrayOfFormation() throws ParseException, IOException, ClassNotFoundException,DaoFactoryException, RowsExceededException, WriteException  {
        DaoFactory daoFactory = DaoFactory.getInstance();
        FenetreChoix fenetreChoix = new FenetreChoix();
        List<Formation> listFormats = daoFactory.genListFormation();
        
        assertNotNull(listFormats);
        assertNotNull(listFormats.get(0)); // only return the first element
        
        WriteExcel writeExcel = new WritingXLS("/Users/scarankle/projects/gfarce/workspace/françoisci/src/fr/unice/gfarce/xls/");
        
        // create tables to write an excel
        writeExcel.formatTable(listFormats);
        writeExcel.formatTable(listFormats.get(0));
        
    }
    
    @Test 
    
    void findAllFormation_returnsAFormationByDate() throws  IOException, ParseException, ClassNotFoundException, ClassNotFoundException, RowsExceededException, WriteException, DaoFactoryException{
        
        FormationDao formationDao = DaoFactory.getFactoryInstance().getDaoFactory().getFormationDao();
        
        assertNotNull(formationDao);
        assertTrue(formationDao instanceof FormationDao);
        
        Collection<Formation> formations = formationDao.findAllFormations();
        assertNotNull(formations);
        assertTrue(formations.size() > 0);
        
        Date d1 = new Date(2001,3,5); // formation date1 = 02/03/1999
        
        Formation formation = formations.iterator().next();
        assertNotNull(formation);
        List<Candidat> candidats = formation.getCandidats();
        assertNotNull(candidats);
        assertEquals("MIDY", candidats.get(0).getType());
        
        //formationDate2 = 05/09/1980
        assertEquals("MIDY", formation.getCandidats().get(1).getType());
        
        Date d2 = new Date(2001,3,5);
        DaoFactory.getFactoryInstance().getDaoFactory().getFormationDao().delete(formation);
    }

    @Test 
    
    void findAllFormation_deleteFormationsByIdentite() throws IOException, ParseException, DaoFactoryException {
    
        FormationDao formationDao = DaoFactory.getFactoryInstance().getDaoFactory().getFormationDao();
        
        assertNotNull(formationDao);
        assertTrue(formationDao instanceof FormationDao);
        
        Collection<Formation> formations = formationDao.findAllFormationsByIdentite((IdentiteDao)null);
        
        //verificer que as candidats contient les identites nulle
        assertTrue(formations.size() == 1);
        assertEquals(Formation.NOMERO_FORM, formations.iterator().next().getIdentite());
        
        //verificer que l'identite est un identite et le candidat est ne peut a encore ett nulle
        assertTrue(formationDao.findAllFormationByIdentite((IdentiteDao)null).size() == 1);
        
        DaoFactory.getFactoryInstance().getDaoFactory().deleteFormation(formations.iterator().next());
        
    }
    
	
	public void deleteFormation_idSet(Formation formation) {
		
}
}