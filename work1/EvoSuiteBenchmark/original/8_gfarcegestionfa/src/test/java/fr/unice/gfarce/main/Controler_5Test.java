package fr.unice.gfarce.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fr.unice.gfarce.identity.*;

class Controler_5Test {

    @Test
    void testFindAllFormation() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        assertNotNull(formations);
    }

    @Test
    void testFindAllFormationNotEmpty() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        assertTrue(formations.length > 0);
    }

    @Test
    void testFindAllFormationNotNull() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        for (Formation formation : formations) {
            assertNotNull(formation);
        }
    }

    @Test
    void testFindAllFormationTitleNotNull() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        for (Formation formation : formations) {
            assertNotNull(formation.getTitre_formation());
        }
    }

    @Test
    void testFindAllFormationDateLimiteNotNull() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        for (Formation formation : formations) {
            assertNotNull(formation.getDate_limite_candidature());
        }
    }

    @Test
    void testFindAllFormationMontantNotNull() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        for (Formation formation : formations) {
            assertNotNull(formation.getMontant_inscription());
        }
    }

    @Test
    void testFindAllFormationResponsableNotNull() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        for (Formation formation : formations) {
            assertNotNull(formation.getResponsable());
        }
    }

    @Test
    void testFindAllFormationCandidatsNotNull() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        for (Formation formation : formations) {
            assertNotNull(formation.getCandidat());
        }
    }

    @Test
    void testFindAllFormationCandidatsNotEmpty() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        for (Formation formation : formations) {
            assertTrue(formation.getCandidat().size() > 0);
        }
    }

    @Test
    void testFindAllFormationCandidatsType() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        for (Formation formation : formations) {
            for (Candidat candidat : formation.getCandidat()) {
                assertEquals(Identite.TypeIdentite.CANDIDAT, candidat.getType());
            }
        }
    }
}
