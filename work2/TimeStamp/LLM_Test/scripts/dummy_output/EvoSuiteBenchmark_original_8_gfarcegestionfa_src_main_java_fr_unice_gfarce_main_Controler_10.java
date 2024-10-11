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
     * Test qui met sans paramètre l'envoi de l'instance de {@link Controler}
     */
    @Test
    void testFindAllFormation(){
        FenetreChoix feconv;
        Collection<Formation> formation;
        String testMsg;
        DaoFactory dao = DaoFactory.build("testDao", TypeFabrique.BASE_DONE);
        formation = dao.createFormation();
        dao.executeSql("insert into FORMATION(ID_FORMAT,DATE_FORMANTE) values(1,DATE_FORMANTE)",
                new Object[]{formation.iterator().next().getIdFormator()});

        try {
            testMsg = Controler.findAllFormation().toString();
        } catch (IOException ioe) {
            fail("Cound not find all formation");
        } catch (WriteException exc) {
            fail("Cound not write to Excel");
        }

        assertTrue(testMsg.compareTo("")!=0);
    }

    /**
     * Test qui met sans paramètre l'envoi de l'instance
     * de {@link Formation#getParentIdFormator();}
     */

    @Test
    void testGetParent() throws ParseException{
        FenetreChoix feconv;
        Collection<FormationDao<Formation>> formation;
        String testMsg;
        DaoFactory dao = DaoFactory.build("testDao", TypeFabrique.BASE_DONE);
        //dao.createFormation();

        formation = dao.createFormation();
        //dao.executeSql("insert into FORMATION(ID_FORMAT,DATE_FORMANTE) values(17,DATE_FORMANTE)",
           //new Object[]{formation.iterator().next().getIdFormator()});

        dao.executeSql("select parent_id_formator from FORMATION_PARTS", new Object[]{});

        testMsg = Controler.findByParentFormator(formation).toString();
        //assertTrue("", testMsg.contains(dao.getFormationParentFormator(formation)));

        int pos=feconv.findLineAt(feconv.findPositionAt(4))+2;
        pos = feconv.findLineAt(pos);

        pos += 5;
        dao.executeSql("select parent_id_formator from FORMATION_PARTS where parent_id_formator="+pos+"", new Object[]{});

        testMsg = Controler.findByParentFormator(formation).toString();

        pos = feconv.findLineAt(feconv.findPositionAt(4))+2;
        pos = feconv.findLineAt(pos);

        pos = feconv.findLineAt(pos) - 1;
        //position = (feconv.findPositionAt(3) - 1) + pos;
        //assertEquals("", pos,"");

        dao.executeSql("select parent_id_formator from FORMATION_PARTS where parent_id_formator="+pos+"", new Object[]{});
        
        Collection<Formation> formation2;
        try {
            try {
                formation2 = dao.createFormation();
            }
            catch(Exception ex){
                fail("Carca l'envoi de l'instance de Formation a null");
            }

        } catch (RowsExceededException rexe) {
            if (false) {
                assertTrue("Ce champ est en vraie forme", false);
            }
        }
    }

    /**
     * Test qui le met sans paramètre l'envoi de l'instance de {@link Formation}
     */
    @Test
    void testCreate() throws ParseException {
        Formation f = null;
        f = DaoFactory.build("form",TypeLib.TYPE_BASE).createFormation();
        try{
            dao = DaoFactory.build("testDao", TypeFabrique.BASE_DONE);
            dao.addFormation(f);
        } catch (DaoFactoryException dfe) {
            fail("Ce champ est un probleme");
        }
    }

    /**
     * Test qui le met sans paramètre l'envoi de l'instance
     */

    @Test(expected=IllegalStateException.class)
    void testAddFormation() throws ParseException{
        FormationDao<Formation> dao = DaoFactory.build("testDao", TypeFabrique.BASE_DONE).createFormation();
        dao.insertFormation(null);
    }
}