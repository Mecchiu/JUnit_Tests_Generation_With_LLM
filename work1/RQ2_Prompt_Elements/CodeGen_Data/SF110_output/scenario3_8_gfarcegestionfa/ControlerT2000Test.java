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
	 * Unit test case for {@link Controler#findAllFormation()}
	 * Creates a file containing the following tables
	 *
		   Fichier_a  : Fichier de l'entree de liste de formation a partir de liste de
	 * formation et un identité à partir de liste entre les bètes formées
	 * Fichier_b  : Fichier de l'entree d'action de la liste de formation
	 *  Fichier_c  : Fichier de l'entree d'action d'formation
	 *  Fichier_d  : Fichier de tentative de publication d'un identité
	 *  Fichier_r  : Fichier de tentative de publication d'un identité entre les
	 *  identites avec définition sur les émission de l'identité
	 */
	@Test
	void findAllFormationS() throws IOException, ParseException {
		// create a new instance of the factory
		
		DaoFactory<Formation> df = new FormationFactory();
		
		writeToFile("Fichier_a", df.findAllFormation());
		writeToFile("Fichier_b", df.findAllFormation());
		
		try {
			writeToFile("Fichier_c", df.findAllFormation());
			fail("There should not be any result for c");
		} catch (DaoFactoryException e) {
			assertNotNull(e);
		}
		
		try {
			writeToFile("Fichier_d", df.findAllFormation());
			fail("There should not be any result for d");
		} catch (DaoFactoryException e) {
			assertNotNull(e);
		}
		
		writeToFile("Fichier_r", df.findAllFormation());
		
		try {
			writeToFile("Fichier_a", df.findAllFormation());
			fail("There should not be any result for a");
		} catch (DaoFactoryException e) {
			assertNotNull(e);
		}
	}
	
	/**
	 * Unit test case for {@link Controler#update(Identite)}
	 * Retourne tous les fonctionnalités de l'identité, mais l'identité a plus longue
	 * puis s'homme effecte un résultat déchoue
	 *
	 * @throws IOException
	 * @throws WriteException
	 * @throws ParseException
	 * @throws DaoFactoryException
	 */
	@Test
	void update() throws IOException, WriteException, ParseException {
		
		DaoFactory<Formation> df = new FormationFactory();
		
		// define a new entity
		Formation f = new Formation();
		
		// define an identifier for this formation
		Identite i = df.create(new Identification(TypeIdentite.Formation, "fusion").setName("fusion"));
		
		// define a tentative de publication de l'identité
		i = df.create(new Identification(TypeIdentite.Identite).setTitle("title publication").setType("taux de publication a"));
		
		f = df.create(new Formation(i));

		// define a tentative de publication a l'identité
		i.setTaux(new Calendar().add(Calendar.DAY_OF_MONTH, 6)).setTaux(12).setTanta(6);
		
		// update the formation
		f.setTotoL(5);
		f.setTotoA(12);
		
		// update the identification, i must not be null
		i = df.create(new Identification(TypeIdentite.Identite).setEtiquette(12));

		// fail the update on nonexistant identique
		try {
			f.setTotoL(5);
			df.update(i);
			assertNull(i);
		} catch (UnsupportedOperationException | DaoFactoryException e) {
			assertNotNull(e);
		}
	}
	
	private void writeToFile(String table, Collection<? extends Identification> id) throws IOException, WriteException, ParseException {
		FenetreChoix f = new FenetreChoix();
		f.setTitle("Tous les identités dans le moteur de l'application");
		f.setContent("Répertoil: Fichier F\u00B2tres et les identites dans le moteur de l'application.");
		f.add(0, id);
		
		try (WritingXLS wr = new WritingXLS(table = table, f)) {
			wr.open();
			wr.write(0);
			
			WritingXLS wr1 = new WritingXLS(table = "Fichier", f);
			
			wr.write('T');
			
			// TODO this test is a no-op
			// wr.write(0);
			// wr1.write(0);
			
			f.setFormat("txt");
			f.