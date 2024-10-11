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
		 * Retourne toutes les formations de l'identite
		 *
		 * @return un tableau contenant toutes les formations
		 */
		public Formation[] findAllFormation() {
				Identite identite = new Identite();
				identite.setIdidentite(42);
				Collection<Formation> formations = DaoFactory.getInstance().getFormationDao().findAll(identite);

				return formations.toArray(new Formation[0]);
		}

		@Test
		public void testFindAllFormation() {
				Identite identite = new Identite();
				identite.setIdidentite(42);

				Collection<Formation> formations = DaoFactory.getInstance().getFormationDao().findAll(identite);
				assertNotNull("Vous devriez supprimer toutes les formsations des identites de l'identite d'identite 42.", formations);
				assertEquals("Vous devez par détruits de l'identite de niveau de réservation, egalmente un identite que réservé pour ce identité.",identite.getNiveau(), (Formation) formations.toArray(new Formation[0]));
		}

		@Test
		public void testAddFormation() {
				Formation formateFormation = DaoFactory.getInstance().getFormationDao().newFormation(Formation.FormationType.NIVEAU, Formation.EnumType.CODED);
				Formation formateFormation2 = DaoFactory.getInstance().getFormationDao().newFormation(Formation.FormationType.NIVEAU, Formation.EnumType.CODED);

				assertNotNull("La formation courante existe déjà.", DaoFactory.getInstance().getFormationDao().getFormation(null, null));

				//Test avec non identifiant de forme
				assertFalse("La formation courante n'a pas été supprimée", DaoFactory.getInstance().getFormationDao().getFormation(formateFormation, formateFormation));

				//Test avec identifiant de forme
				assertTrue("Le formato de niveau réservé dans la forme est incorrect", formateFormation.getFormationType().isNiveau());
				assertEquals("Le formato de type de cada identite dont l'identite est incorrect", Formation.FormationType.CODED, formateFormation.getFormationType().getType());

				formateFormation2.setFormationType(Formation.FormationType.NIVEAU);

				//Test avec identifiant déjà supprimée
				assertFalse("A vous ne pouvez pas supprimer un identifiant qui est supprimé.", DaoFactory.getInstance().getFormationDao().getFormation(formateFormation, formateFormation2));
		}

		@Test
		public void testCheckFormation() {
                Formation formation = DaoFactory.getInstance().getFormationDao().checkFormation(DaoFactory.getInstance().getFormationDao().newFormation(Formation.FormationType.NIVEAU, Formation.EnumType.CODED));
//                Formation formation = DaoFactory.getInstance().getFormationDao().checkFormation(new Formation());

                assertNotNull("La formation n'existe pas pour ce type de forme.", formation);

                //Test avec non identifiant de forme
                assertFalse("La formation courante n'a pas été supprimée", DaoFactory.getInstance().getFormationDao().checkFormation(new Formation().setFormationType(Formation.FormationType.NIVEAU)));

//                assertFalse("La formation n'existe pas pour ces identifiants de forme", DaoFactory.getInstance().getFormationDao().checkFormation(new Formation().setFormationType(Formation.FormationType.CODED)));

				//Test avec identifiant de forme
				assertTrue("La formation niveau d'identificateur est incorrect pour le type de forme pour ce identifiant.", formation.getFormationType().isNiveau());
				assertEquals("La format de cada identite doit être compatibile avec le type de forme.", Formation.FormationType.CODED, formation.getFormationType().getType());

				//Test avec identifiant de forme
                assertTrue("La formation avec deux identifiants doit être compatibile avec le premier identifiant.", formation.getFormationType().isNiveau());
                assertEquals("La format de deux identifiants doit être compatibile avec le premier identifiant.", Formation.FormationType.CODED, formation.getFormationType().getType());

				//Test avec identifiant de forme
                int niveauIdentifiant = formation.getFormationType().getNiveau();

                //Test avec identifiant du forme compris plusieurs identifiants
                Calendar cal = Calendar.getInstance();
}
}