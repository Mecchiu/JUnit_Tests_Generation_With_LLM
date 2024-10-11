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
		
	// TODO tests for the same stuff as for {@link Controler}
	/**
	 * Tests the {@link Controler#findAllFormation()} method.
	 * @throws WriteException
	 * @throws DaoFactoryException
	 * @throws IOException
	 * @throws ParseException
	 */
	@Test
	public void testFindAllFormation() throws WriteException, DaoFactoryException, IOException, ParseException {
		
		// Ini l'utilisation de {@link Controler.daoFactory}
		final DaoFactory daoFactory = DaoFactory
		               .init(TypeFabrique.DEFINEMENT);
		
		// Création d'un identite
		final Identite identiteA = new Identite("LIVA");
				
		// Création de 2 noms de bases de données
		final Collection<Candidat> candidatsBases = getCandidatsOfTypeFormation("BASE");
		IdentiteDao dao = daoFactory.getInstance(TypeAbbreviation.formation, Candidat.class);
		Identite identite = dao.create(identiteA);
		
		// Création du identite
		final Identification identification = new Identification(identite);
		
		//Création des 2 noms d'identités de candidats base
		final Collection<Candidat> candidacy_base = getCandidatsOfTypeFormation("REFERENCIER");
		for (Candidat candidat : candidacy_base){
			identification.append(candidat.getName(), candidat.getCandidat().getName());
		}
		
		// Création de du formation d'identitat (identité A)
		final Formatation formationA = new Formation(identity, candidacy_base);
				
		// Création des références d'identités de candidats base
		final Collection<Candidat> candidacy_base_r = getCandidatsOfTypeFormation("REFERENCIER_MOTIFIE");
		for (Candidat candidat : candidacy_base_r){
			identification.append(candidat.getName(), candidat.getCandidat().getName());
		}
		
		// Création de du formation d'identitat (identité B)
		final Formatation formationB = new Formation(identity, candidacy_base, new Collection<Candidat>());
				
		// Retourne le tableau
		final Collection<Formation> formations = FormationDao
		                  .getAllFormation(identification, formationA, formationB);
				
		//TODO pour le controlem
		/*
	        Test d'un identité:
	        LIVA = [
			[A, B],
			[B,A],
			[C,D]
	        ]
		*/

		//TODO pour le niveau quelque fonction voulu que l'interface graphique
		FormationDao.putAll(identification, formations, false);
		
		//TODO pour le niveau quelque fonction voulu que l'interface graphique
		assertEquals(formations.size(), 1); // il est pas de problème quand aucun identité est dans le dernier niveau
		assertFalse(identification.isDistant());
	}

	/**
	 * Test du tableau {@link FormationDao#getAllFormation(Identite, Formatation, Collection)}
	 *
	 * @throws WriteException
	 * @throws WritePossibleDataException
	 */
	@Test
	public void testListFormation() throws WriteException, WritePossibleDataException {
		
		// Ini l'utilisation de {@link DaoFactory}
		final DaoFactory daoFactory = DaoFactory
		               .init(TypeFabrique.DEFINEMENT);
		
		// Création de d'identites de base
		final Collection<Candidat> candidatsBase = getCandidatsOfTypeFormation("BASE");
		
		//Création d'une identite avec son nom
		final Identite identiteR = new Identite("R-A");
		identiteR.setName("R-R");

		//Création du identifier de candidat "A"
		final Identification identificationR = new Identification(identiteR);

		//Liste des identites
		final Collection<Identite> identities = IdentificationDao
		                                                        .getAllIdentitites(identificationR);

		//Retourne les identites du base de l'identité
		final Collection<Identite> bases = formationDao.getIdentitesOfType(candidatsBase, Identification.FORMATION, Identification.IDENTITE_FORMATION);
		final Collection<Identite> listeIdentites = IdentificationDao
		                                                 .getAllIdentitites(identificationR, bases);
		assertTrue(listeIdentites.isEmpty());

		//Création de base de niveau
}
}