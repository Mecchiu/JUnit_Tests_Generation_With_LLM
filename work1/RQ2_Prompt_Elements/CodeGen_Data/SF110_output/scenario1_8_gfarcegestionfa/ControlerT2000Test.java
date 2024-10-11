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
		* It contains one unit test case for the {@link Controler#findAllFormation()} method.
		* It executes several methods.
		* There is one exception in the last one.
		* @throws FienetreChoixException 
		* @throws ParseException 
		* @throws WriteException 
		* @throws RowsExceededException 
		* @throws DaoFactoryException 
		* @throws DaoFactoryException 
		* @throws WriteException 
		* @throws ParseException 
		* @throws IOException 
		*/
	@Test

	public void findAllFormationTestCase() throws FienetreChoixException, ParseException, WriteException{
            WritingXLS xls = TestHelper.createXLS(null, null, null, null);

            //Initialize data source
            final FormulaDao formulaDao = DaoFactory.createFormulaDao();
            final IdentiteDao identiteDao = DaoFactory.createIdentiteDao(identiteDao.getBaseDataLayer());

            Formation testFormation = new Formation(
                    formulaDao.findFormation("0", null, null),
                    identiteDao.findIdentite("0", null)
            );

            testFormation.setBase("base");
            //Fait la conversion pour fait un test
            Formation testFormationConversion = testFormation.toMap();


            Calendar now = Calendar.getInstance();

            Collection<Formation> formations = FormulaDaoFactory.dao.findFormations();
            for(Formation formation : formations) {
                System.out.println(formation);
            }

            //Fetture d'une des détails
            String[] values = testFormation.getValues();
            String[] valuesConversion = testFormationConversion.getValues();
            assertEquals(values.length, valuesConversion.length);
            //N'est pas fait lorsque elle est prises
            testFormation.setValues(values);
            formulaDao.createFormation(testFormation);
            formulaDao.createFormation(testFormationConversion);

            //Permitoir de mettre de fait une fois l'effet
            testFormation = new Formation(
                    testFormation.getFormation(),
                    0,
                    0       //Fait l'identite
            );

            //Fetture d'une des détails
            values = testFormation.getValues();
            valuesConversion = testFormationConversion.getValues();
            assertEquals(values.length, valuesConversion.length);
            //Fetture de l'identite par défaut, et l'identite ne peut pas beaucoup
            assertNotEquals(0, valuesConversion[0].ordinal());
            //Filtre d'identites
            FormationDao formDao = DaoFactory.createFormationDao();
            Collection<Formation> filtered = formDao.findFormations();
            System.out.println(formFiltered);

            //Fetture d'une de la nouvelle fois, il est ajoutée
            //TEST
            formFormationTest(testFormation,values,filtered);
            //Fetture d'une de de la nouvelle fois, il etage la bonne position
            formFormationTest(testFormationConversion,values,filtered);
            //Fetture d'un détails, la bonne position est de 0
            FormationFormationToDTOTest(testFormation,valuesConversion,filtered,now);
            //Fetture d'un détails, la bonne position est à 0 +1
            FormationOneToZeroTotDTOTest(testFormationConversion,valuesConversion,filtered);
    }
    /**
     * Méthode qui test le permet de convertir l'identite dont une identite a ete et
     * le permet de convertir de un formé qui n'est pas la présente
     * @param testFormation
     */
    public static void checkFormation(FormationFormation testFormation) {
            assertNotNull(testFormation);
            //La type de forme n'est pas une identite. On veut de faire de l'intérieur. 
            assertEquals(testFormation.getFormation(),Formation.TypeForm);
            //La type de forme n'est pas une identite. On veut de faire de l'intérieur
    }
    /**
     * Permet de convertir les différentes identites de l'action qui n'utilise pas leurs paramètres
     * @param testFormation
     * @param values
     * @param filtered
     * @throws WriteException
     * @throws RowsExceededException
     * @throws ParseException
     */
    private static void formFormationTest(FormationFormation testFormation, String[] values, Collection<Formation> filtered) throws WriteException, RowsExceededException, ParseException {
        String[] valuesConversion = testFormDefinitionConversion(testFormion