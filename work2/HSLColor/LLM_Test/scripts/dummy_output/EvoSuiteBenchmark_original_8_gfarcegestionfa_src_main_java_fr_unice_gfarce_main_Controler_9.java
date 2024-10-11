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
	 * Check that the type of a formation is assigned
	 * by the dao of its parent class
	 */
    @Test
    void  checkFormationAssignment() {
    	Formation forme = FormationDao.checkFecle(3);

        // check that the formation is assigned
        assertNotNull(forme);
        assertEquals(TypeIdentite.TypeIdentiteFormation, forme.getTypeFormation());
        
        // check that the parent formation does not assign to the formation itself
        forme = FormationDao.checkFecle(4);
        assertNotSame(forme, forme.getParent().getFormation());
    }

	/**
	 * Check that the formation that is assigned to a formation by
	 * a parent formation can be retrieved
	 */
    @Test
    void checkParent1Assignment() {
        // check that the parent formation does not assign to the formation itself
       FormitionDao.checkFecle(TypeFabrique.TypeFabriqueFormation1);
       
       // check that the parent formation can be retrieved
       Formation forme = FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation1);
       assertNotNull(forme);
       assertNotSame(forme, forme.getParent().getFormation());
    }


    /**
     * Check that a formation can be assigned by an Id
     */
    @Test
    void checkFormationIdAssignment() {
        // check that the formation can be assigned
        FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation1.getId());
        
        // check that the parent formation can be assigned by an Id
        FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation1.getId().getParent().getFormation().getId());
    }
	
    /**
     * Check that the formation can be assigned by a Id
     */
    @Test
    void checkFormationId2Assignment() {
        FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation2.getId());
        
        // check that the parent formation can be assigned by a Id
        FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation2.getId().getParent().getFormation().getId());
    }

    /**
     * Check when two formation are created
     * and the parents formated by one of them can be retrieved
     */
    @Test
    void checkFormationAssignmentOfSameFormationTwice() {
        // check a null formation created by its parent
        FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation1.getId());
        // check a null formation created by the same formation
        FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation1.getId().getParent().getFormation().getId());

        // check if 1st parent formed
        Formation forme1 = FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation1.getId().getParent().getFormation());

        // check if 1st parent formed
        assertNotNull(forme1);

        // check if 2nd parent formed
        Formation forme2 = FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation2.getId().getParent().getFormation());

        // check if only 1st parent formed
        assertNotNull(forme2);

        // check if 2nd parent formed
        Formation forme3 = FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation2.getId().getParent().getFormation());

        // check 1st parent has formated by 1st formation
        assertEquals(forme1.getFormation(), forme2.getFormation());

        // check if 3rd parent has formated by 2nd formation
        assertEquals(forme3.getFormation(), forme2.getFormation());

        // check if 1st parent is identified by a Id
        assertEquals(forme1.getId(), forme2.getId());

        // check if 2nd parent is identified by a Id
        assertEquals(forme2.getId(), forme1.getId());

        // check not if the Id is different
        String newFormation1 = "Formation_"+forme1.getId().getValue();
        String newFormation2 = "Formation_"+forme2.getId().getValue();
        assertNotEquals(newFormation1,newFormation2);
        
    }

	/**
	 * Check if two formations can be created
	 */
	@Test
	void checkFormationCreation() {
		Formation formation1 = FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation1.getId());
		Formation formation2 = FormationDao.checkFecle(TypeFabrique.TypeFabriqueFormation2.getId());

        // check if 1st formation
}
}