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
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation1() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation2() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation3() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation4() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation5() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation6() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation7() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation8() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation9() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
	
	/**
	* Test case for the {@link Controler#findAllFormation()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testFindAllFormation10() {
		Controler controler = new Controler();
		Formation[] result = controler.findAllFormation();
		assertNull(result);
	}
}