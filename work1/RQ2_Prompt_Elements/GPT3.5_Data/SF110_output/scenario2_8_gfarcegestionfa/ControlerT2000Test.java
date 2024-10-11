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
     * Test case for the findAllFormation method when the database is empty.
     */
    @Test
    void testFindAllFormationEmpty() {
        Controler controler = new Controler();
        Formation[] formations = controler.findAllFormation();
        assertEquals(0, formations.length);
    }
    
    /**
     * Test case for the findAllFormation method when the database contains one formation.
     */
    @Test
    void testFindAllFormationOne() {
        Controler controler = new Controler();
        Formation formation = new Formation("Maths", "Licence", 3);
        controler.fdao.addFormation(formation);
        Formation[] formations = controler.findAllFormation();
        assertEquals(1, formations.length);
        assertEquals(formation, formations[0]);
    }
    
    /**
     * Test case for the findAllFormation method when the database contains multiple formations.
     */
    @Test
    void testFindAllFormationMultiple() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Maths", "Licence", 3);
        Formation formation2 = new Formation("Informatique", "Master", 2);
        controler.fdao.addFormation(formation1);
        controler.fdao.addFormation(formation2);
        Formation[] formations = controler.findAllFormation();
        assertEquals(2, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
    }
    
    /**
     * Test case for the findAllFormation method when the database contains formations with null values.
     */
    @Test
    void testFindAllFormationNullValues() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Maths", "Licence", 3);
        Formation formation2 = new Formation(null, "Master", 2);
        Formation formation3 = new Formation("Informatique", null, 2);
        Formation formation4 = new Formation("Physique", "Licence", null);
        controler.fdao.addFormation(formation1);
        controler.fdao.addFormation(formation2);
        controler.fdao.addFormation(formation3);
        controler.fdao.addFormation(formation4);
        Formation[] formations = controler.findAllFormation();
        assertEquals(4, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
        assertEquals(formation4, formations[3]);
    }
    
    /**
     * Test case for the findAllFormation method when the database contains formations with empty values.
     */
    @Test
    void testFindAllFormationEmptyValues() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Maths", "Licence", 3);
        Formation formation2 = new Formation("", "Master", 2);
        Formation formation3 = new Formation("Informatique", "", 2);
        Formation formation4 = new Formation("Physique", "Licence", "");
        controler.fdao.addFormation(formation1);
        controler.fdao.addFormation(formation2);
        controler.fdao.addFormation(formation3);
        controler.fdao.addFormation(formation4);
        Formation[] formations = controler.findAllFormation();
        assertEquals(4, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
        assertEquals(formation4, formations[3]);
    }
    
    /**
     * Test case for the findAllFormation method when the database contains formations with special characters.
     */
    @Test
    void testFindAllFormationSpecialCharacters() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Maths", "Licence", 3);
        Formation formation2 = new Formation("Informatique", "Master", 2);
        Formation formation3 = new Formation("Physique", "Licence", 2);
        Formation formation4 = new Formation("Chimie", "Licence", 2);
        Formation formation5 = new Formation("Sciences Po", "Master", 2);
        controler.fdao.addFormation(formation1);
        controler.fdao.addFormation(formation2);
        controler.fdao.addFormation(formation3);
        controler.fdao.addFormation(formation4);
        controler.fdao.addFormation(formation5);
        Formation[] formations = controler.findAllFormation();
        assertEquals(5, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
        assertEquals(formation4, formations[3]);
        assertEquals(formation5, formations[4]);
    }
    
    /**
     * Test case for the findAllFormation method when the database contains formations with long names.
     */
    @Test
    void testFindAllFormationLongNames() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Maths", "Licence", 3);
        Formation formation2 = new Formation("Informatique", "Master", 2);
        Formation formation3 = new Formation("Physique", "Licence", 2);
        Formation formation4 = new Formation("Chimie", "Licence", 2);
        Formation formation5 = new Formation("Sciences Po", "Master", 2);
        Formation formation6 = new Formation("Histoire de l'art", "Licence", 3);
        Formation formation7 = new Formation("Géographie et aménagement du territoire", "Master", 2);
        Formation formation8 = new Formation("Sciences de la vie et de la Terre", "Licence", 3);
        Formation formation9 = new Formation("Sciences économiques et sociales", "Licence", 3);
        Formation formation10 = new Formation("Langues étrangères appliquées", "Licence", 3);
        controler.fdao.addFormation(formation1);
        controler.fdao.addFormation(formation2);
        controler.fdao.addFormation(formation3);
        controler.fdao.addFormation(formation4);
        controler.fdao.addFormation(formation5);
        controler.fdao.addFormation(formation6);
        controler.fdao.addFormation(formation7);
        controler.fdao.addFormation(formation8);
        controler.fdao.addFormation(formation9);
        controler.fdao.addFormation(formation10);
        Formation[] formations = controler.findAllFormation();
        assertEquals(10, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
        assertEquals(formation4, formations[3]);
        assertEquals(formation5, formations[4]);
        assertEquals(formation6, formations[5]);
        assertEquals(formation7, formations[6]);
        assertEquals(formation8, formations[7]);
        assertEquals(formation9, formations[8]);
        assertEquals(formation10, formations[9]);
    }
    
    /**
     * Test case for the findAllFormation method when the database contains formations with negative values.
     */
    @Test
    void testFindAllFormationNegativeValues() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Maths", "Licence", 3);
        Formation formation2 = new Formation("Informatique", "Master", -2);
        Formation formation3 = new Formation("Physique", "Licence", 2);
        Formation formation4 = new Formation("Chimie", "Licence", -3);
        controler.fdao.addFormation(formation1);
        controler.fdao.addFormation(formation2);
        controler.fdao.addFormation(formation3);
        controler.fdao.addFormation(formation4);
        Formation[] formations = controler.findAllFormation();
        assertEquals(4, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3, formations[2]);
        assertEquals(formation4, formations[3]);
    }
    
    /**
     * Test case for the findAllFormation method when the database contains formations with zero values.
     */
    @Test
    void testFindAllFormationZeroValues() {
        Controler controler = new Controler();
        Formation formation1 = new Formation("Maths", "Licence", 3);
        Formation formation2 = new Formation("Informatique", "Master", 0);
        Formation formation3 = new Formation("Physique", "Licence", 2);
        Formation formation4 = new Formation("Chimie", "Licence", 0);
        controler.fdao.addFormation(formation1);
        controler.fdao.addFormation(formation2);
        controler.fdao.addFormation(formation3);
        controler.fdao.addFormation(formation4);
        Formation[] formations = controler.findAllFormation();
        assertEquals(4, formations.length);
        assertEquals(formation1, formations[0]);
        assertEquals(formation2, formations[1]);
        assertEquals(formation3,