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
    void findAllFormationTest(){
        // TODO: implement this test method
        assertFalse(false);
    }
	
    // TODO
	/**
	 * Unit test case for {@link Controler#findAllFormation()} method.
	 * It checks the behaviour of the {@link Controler#findAllFormation()} method 
	 * in a {@link fr.unice.gfarce.interGraph.FenetreChoix}
	 */
	@Test
    void findAllFormationTest() {
		// TODO: implement this test method
		assertFalse(false);
    }

	public static void main  (String[] params) {
	    fr.unice.gfarce.interGraph.FenetreChoix mfg; 
	    try {
	    	FormationDao formationDao = DaoFactoryFactory.getFactory().getDaoFactory().getDaoFactory().getFormationDao();
	    	for (int i = 0; i < FormationDao.getColumnCount(); i++) {
	    		// For the creation and manipulation of columns
	    		if (FormationDao.isHiddenOrNot(i)) {
	    			continue;
	    		}

	    		// We put the creation of the table :)
	            mfg = new FenetreChoix(TypeIdentite.TypeFormation,i);
	            FormationDao.fillColumn(mfg, i);
			    System.err.println("formation : " + FormationDao.print(mfg));
	            FenetreChoix fnc = (FenetreChoix) mfg;
	            fnc.loadByRowsExpected(2);
	            
           
	            WritableCellData[] columns = fnc.getColsCellData();
	            writeToFormationData(columns,fnc.getFormation()); 

	            // Write a table:
	            FenetreChoix fnc2 = (FenetreChoix) mfg;
	            fnc2.loadByRowsExpected(4);
	            writeToFormationData(fnc2.getColsCellData(),fnc2.getFormation());  
	        } 
	    }
	    catch (IOException e) {
	    	e.printStackTrace();
	    }
	}   

	private static void writeToFormationData(WritableCellData[] columns, Formula getFormationFormation)
			throws WriteException {

        assertEquals(getFormationFormation.getTypeFormation(), columns[0].getFormation().getTypeFormation());
		WritableCellData col0Data = columns[0];
        col0Data.writeToFile();

		FormationDao formationDao = DaoFactoryFactory.getFactory().getDaoFactory().getFormationDao();
		for (int i = 0 ; i < getFormationFormation.getFormation().size();i++) {
			if (getFormationFormation.getFormation().get(i) instanceof IdentificationFormationDto) {
				IdentificationFormationDto getIdentificationFormationdTo = (IdentificationFormationDto) getFormationFormation.getFormation().get(i);
	            getIdentificationFormationdTo.writeToFile();
			} else {
	            FormationDao.fillColumn(columns[1], i);
			    System.err.println(((BaseFormation) getFormationFormation.getFormation().get(i)).getTypeFormation());
			    System.out.println(((BaseFormation) getFormationFormation.getFormation().get(i)).getTypeFormation());
			}
		}    								
	}

    /* 
     * TODO: implement this test method
     */
    @Test
    void addFormationToControlerTest() {
		// TODO: implement this test method
		assertFalse(false);
    }

    public static void addFormationToFormationdaoTest() {
        // TODO: implement this test method
        assertFalse(false);
    }



    /* 
     * TODO: implement this test method
     */
    @Test
    public void removeFormationFromFormationdaoTest() {
		// TODO: implement this test method
		assertFalse(false);
    }

    /* 
     * TODO: implement this test method
     */
    @Test
    public void removeCandidatFromCandidatTest() {
    	// TODO: implement this test method
    	assertFalse(false);
    }
    
	
}