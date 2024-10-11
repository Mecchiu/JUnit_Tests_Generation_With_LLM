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
     * Test of findAllFormation method, of class Controler.
     * Case when there are no formations in the database.
     */
    @Test
    public void testFindAllFormationNoFormation() throws DaoFactoryException {
        Controler instance = new Controler();
        instance.setTypeDataBase("test");
        instance.launchDatabase();
        Formation[] result = instance.findAllFormation();
        assertEquals(0, result.length);
    }

    /**
     * Test of findAllFormation method, of class Controler.
     * Case when there is one formation in the database.
     */
    @Test
    public void testFindAllFormationOneFormation() throws DaoFactoryException, IOException {
        Controler instance = new Controler();
        instance.setTypeDataBase("test");
        instance.launchDatabase();
        FormationDao fdao = instance.df.getFormationDao();
        Formation formation = new Formation("Formation 1", Calendar.getInstance(), 100, "Resp 1");
        fdao.insertFormation(formation);
        Formation[] result = instance.findAllFormation();
        assertEquals(1, result.length);
        assertEquals("Formation 1", result[0].getTitre());
    }

    /**
     * Test of findAllFormation method, of class Controler.
     * Case when there are multiple formations in the database.
     */
    @Test
    public void testFindAllFormationMultipleFormations() throws DaoFactoryException, IOException {
        Controler instance = new Controler();
        instance.setTypeDataBase("test");
        instance.launchDatabase();
        FormationDao fdao = instance.df.getFormationDao();
        Formation formation1 = new Formation("Formation 1", Calendar.getInstance(), 100, "Resp 1");
        Formation formation2 = new Formation("Formation 2", Calendar.getInstance(), 200, "Resp 2");
        fdao.insertFormation(formation1);
        fdao.insertFormation(formation2);
        Formation[] result = instance.findAllFormation();
        assertEquals(2, result.length);
        assertEquals("Formation 1", result[0].getTitre());
        assertEquals("Formation 2", result[1].getTitre());
    }

    /**
     * Test of findAllFormation method, of class Controler.
     * Case when the database throws an exception.
     */
    @Test
    public void testFindAllFormationException() throws DaoFactoryException, IOException {
        Controler instance = new Controler();
        instance.setTypeDataBase("test");
        instance.launchDatabase();
        FormationDao fdao = instance.df.getFormationDao();
        Formation formation1 = new Formation("Formation 1", Calendar.getInstance(), 100, "Resp 1");
        fdao.insertFormation(formation1);
        instance.df = null;
        assertThrows(DaoFactoryException.class, () -> {
            instance.findAllFormation();
        });
    }
}