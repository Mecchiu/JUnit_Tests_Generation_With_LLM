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
private static final TypeLibeLibreType LIBRE_TYPE = TypeLibeLibreType.getInstance();
		private static final TypeLibeType LIBRE_TYPE_ID = TypeLibeType.getInstance();
	/**
	 * Test d'un constructeur pour la classe Controler qui contient l'état d'une
	 * {@link Formation} courant
	*/
//	@Test
    public void constructorContructeur() {
        Formation f = new Formation("id_F", "F");
        Formation f_a = new Formation("id_A", "A");
        Formation f_a_a = new Formation("id_A_A", "A_A");
        Formation f_a_b = new Formation("id_A_B", "A_B");
//        Formation f_c = new Formation("id_C", "C");
        
        Formation f_d = new Formation("id_X", "X");
        Formation f_d_a = new Formation("id_A_X", "A_X");
        Formation f_d_a_b = new Formation("id_A_B_X", "B_X");
        
        Formation f_e = new Formation("id_E", "E");
        Formation f_e_a = new Formation("id_A_E", "A_E");
        Formation f_e_b = new Formation("id_B_E", "B_E");
        
        Formation f_f = new Formation("id_F", "F");
        Formation f_f_a = new Formation("id_A_F", "A_F");
        Formation f_f_b = new Formation("id_B_F", "B_F");
        Formation f_f_c = new Formation("id_C_F", "C_F");
        Formation f_f_d = new Formation("id_D_F", "D_F");
        Formation f_f_d_a = new Formation("id_A_D_F", "A_D_F");
        Formation f_f_d_a_b = new Formion("id_A_B_D_F", "A_B_D_F");
}




}
