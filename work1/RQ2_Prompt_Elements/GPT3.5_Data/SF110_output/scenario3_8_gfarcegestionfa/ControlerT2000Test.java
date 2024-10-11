// ControlerTest.java
package fr.unice.gfarce.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fr.unice.gfarce.identity.Formation;

/**
* Test class of {@link Controler}.
* It contains ten unit test cases for the {@link Controler#findAllFormation()} method.
*/
class ControlerTest {

    /**
     * Test case for the findAllFormation method when there are no formations.
     */
    @Test
    void testFindAllFormationWithNoFormation() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        assertEquals(0, formations.length);
    }

    /**
     * Test case for the findAllFormation method when there is only one formation.
     */
    @Test
    void testFindAllFormationWithOneFormation() {
        Controler controler = new Controler();
        Formation formation = new Formation("Formation 1");
        controler.addFormation(formation);
        Formation[] formations = controler.findAllFormation();
        assertEquals(1, formations.length);
        assertEquals(formation, formations[0]);
    }

    /**
     * Test case for the findAllFormation method when there are multiple formations.
     */
    @Test
    void testFindAllFormationWithMultipleFormations() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Formation 1");
        Formation formation2 = new Formation("Formation 2");
        Formation formation3 = new Formation("Formation 3");
        controler.addFormation(formation1);
        controler.addFormation(formation2);
        controler.addFormation(formation3);
        Formation[] formations = controler.findAllFormation();
        assertEquals(3, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
    }

    /**
     * Test case for the findAllFormation method when there are duplicate formations.
     */
    @Test
    void testFindAllFormationWithDuplicateFormations() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Formation 1");
        Formation formation2 = new Formation("Formation 2");
        Formation formation3 = new Formation("Formation 3");
        controler.addFormation(formation1);
        controler.addFormation(formation2);
        controler.addFormation(formation3);
        controler.addFormation(formation1);
        Formation[] formations = controler.findAllFormation();
        assertEquals(3, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
    }

    /**
     * Test case for the findAllFormation method when there are no formations but other types of identities.
     */
    @Test
    void testFindAllFormationWithNoFormationButOtherIdentities() {
        Controler controler = new Controler();
        Candidat candidat = new Candidat("John", "Doe");
        RespFormation respFormation = new RespFormation("Jane", "Doe");
        controler.addIdentite(candidat);
        controler.addIdentite(respFormation);
        Formation[] formations = controler.findAllFormation();
        assertEquals(0, formations.length);
    }

    /**
     * Test case for the findAllFormation method when there is only one formation and other types of identities.
     */
    @Test
    void testFindAllFormationWithOneFormationAndOtherIdentities() {
        Controler controler = new Controler();
        Formation formation = new Formation("Formation 1");
        Candidat candidat = new Candidat("John", "Doe");
        RespFormation respFormation = new RespFormation("Jane", "Doe");
        controler.addFormation(formation);
        controler.addIdentite(candidat);
        controler.addIdentite(respFormation);
        Formation[] formations = controler.findAllFormation();
        assertEquals(1, formations.length);
        assertEquals(formation, formations[0]);
    }

    /**
     * Test case for the findAllFormation method when there are multiple formations and other types of identities.
     */
    @Test
    void testFindAllFormationWithMultipleFormationsAndOtherIdentities() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Formation 1");
        Formation formation2 = new Formation("Formation 2");
        Formation formation3 = new Formation("Formation 3");
        Candidat candidat = new Candidat("John", "Doe");
        RespFormation respFormation = new RespFormation("Jane", "Doe");
        controler.addFormation(formation1);
        controler.addFormation(formation2);
        controler.addFormation(formation3);
        controler.addIdentite(candidat);
        controler.addIdentite(respFormation);
        Formation[] formations = controler.findAllFormation();
        assertEquals(3, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
    }

    /**
     * Test case for the findAllFormation method when there are duplicate formations and other types of identities.
     */
    @Test
    void testFindAllFormationWithDuplicateFormationsAndOtherIdentities() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Formation 1");
        Formation formation2 = new Formation("Formation 2");
        Formation formation3 = new Formation("Formation 3");
        Candidat candidat = new Candidat("John", "Doe");
        RespFormation respFormation = new RespFormation("Jane", "Doe");
        controler.addFormation(formation1);
        controler.addFormation(formation2);
        controler.addFormation(formation3);
        controler.addFormation(formation1);
        controler.addIdentite(candidat);
        controler.addIdentite(respFormation);
        Formation[] formations = controler.findAllFormation();
        assertEquals(3, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
    }

    /**
     * Test case for the findAllFormation method when there are formations with the same name but different dates.
     */
    @Test
    void testFindAllFormationWithSameNameButDifferentDates() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Formation 1");
        Formation formation2 = new Formation("Formation 1");
        formation2.setDateDebut(Calendar.getInstance());
        Formation formation3 = new Formation("Formation 1");
        formation3.setDateDebut(Calendar.getInstance());
        formation3.setDateFin(Calendar.getInstance());
        controler.addFormation(formation1);
        controler.addFormation(formation2);
        controler.addFormation(formation3);
        Formation[] formations = controler.findAllFormation();
        assertEquals(3, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
    }

    /**
     * Test case for the findAllFormation method when there are formations with the same name and dates but different places.
     */
    @Test
    void testFindAllFormationWithSameNameAndDatesButDifferentPlaces() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Formation 1");
        formation1.setLieu("Lieu 1");
        Formation formation2 = new Formation("Formation 1");
        formation2.setLieu("Lieu 2");
        formation2.setDateDebut(Calendar.getInstance());
        Formation formation3 = new Formation("Formation 1");
        formation3.setLieu("Lieu 2");
        formation3.setDateDebut(Calendar.getInstance());
        formation3.setDateFin(Calendar.getInstance());
        controler.addFormation(formation1);
        controler.addFormation(formation2);
        controler.addFormation(formation3);
        Formation[] formations = controler.findAllFormation();
        assertEquals(3, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
    }

    /**
     * Test case for the findAllFormation method when there are formations with the same name, dates and places but different descriptions.
     */
    @Test
    void testFindAllFormationWithSameNameDatesAndPlacesButDifferentDescriptions() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Formation 1");
        formation1.setLieu("Lieu 1");
        formation1.setDescription("Description 1");
        Formation formation2 = new Formation("Formation 1");
        formation2.setLieu("Lieu 1");
        formation2.setDescription("Description 2");
        formation2.setDateDebut(Calendar.getInstance());
        Formation formation3 = new Formation("Formation 1");
        formation3.setLieu("Lieu 1");
        formation3.setDescription("Description 2");
        formation3.setDateDebut(Calendar.getInstance());
        formation3.setDateFin(Calendar.getInstance());
        controler.addFormation(formation1);
        controler.addFormation(formation2);
        controler.addFormation(formation3);
        Formation[] formations = controler.findAllFormation();
        assertEquals(3, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
    }
}