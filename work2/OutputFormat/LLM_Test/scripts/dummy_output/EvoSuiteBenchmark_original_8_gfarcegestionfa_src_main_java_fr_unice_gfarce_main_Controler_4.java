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
		private final static String DATA_PATH = "/sample_data/";
		public static final Calendar DATA_CALENDAR = Calendar.getInstance();
		public static final int NUMBER_OF_CELLS = 4;
		public static final String INDEXED_FILE = DATA_PATH + "indexed_data.xlsx";
		private final DaoFactory daoFactory = DaoFactory.getInstance();
		public static final TypeFabrique VARIABLES = TypeFabrique.getInstance("VAR_"+Data.NUMBER);
		public static final DaoFactoryFactories daoFactoryFactories = DaoFactory.getFactoryFactories();
		public ControlerTest() { }

		@Test
		public void test() throws ParseException, WriteException, RowsExceededException, IOException, DaoFactoryException, DaoFactoryException, ClassNotFoundException, jxl.write.biff.RowsExceededException, WritingXLS {
			final Formula formE = (Formula) FormationDao.fetchByCode(FormationDao.BASE.getBaseCode(), FormationDao.TYPE.getTypeCode(TypeIdentite.Formation));

			// Obtenie toutes les formations
			Collection<Formation> formations = FormationDao.fetchByFormationCode(FormationDao.BASE.getBaseCode(), FormationDao.TYPE.getTypeCode(TypeIdentite.Formation));

			// Retourne les formations au format XLSX
			final Controler controler = new Controler();
			final String resFormationXLSX = controler.findAllFormation();

			// En prendre les nombre de mails gérants, a donnant les différes paramètres, car qu'si vous voulez quand que la vue est lue
}
}