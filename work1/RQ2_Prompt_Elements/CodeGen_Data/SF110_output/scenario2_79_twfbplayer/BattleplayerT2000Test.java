// BattleplayerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplayer}.
* It contains one unit test case for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {

	static final Logger logger = Logger.getLogger(_BattleplayerTest.class.getName());
	
    @Test
    void testNumberOfRounds1() {
        Battleplayer battleplayer = new Battleplayer();
        int expectedRounds = 6;        
        Combatant combatant1 = new Combatant(2, "Combatant");
        Combatant combatant2 = new Combatant(7, "Combatant");
        List<Combatant> combatants1 = new ArrayList<>();
        combatants1.add(combatant1);
        combatants1.add(combatant2);
        
        List<Combatant> combatants = new ArrayList<>();
        combatants.add(combatant1);
        combatants.add(combatant2);
        
        battleplayer.addCombatant(combatant1);  // adds combatant1 to the battle
        List<Combatant> result = battleplayer.getCombatants();
        assertEquals(result.size(), expectedRounds);
        assertTrue(result.contains(combatant1));
        assertTrue(result.contains(combatant2));
    }
    
    @Test
    void testNumberOfRounds2() {
        Battleplayer battleplayer = new Battleplayer();
        int expectedRounds = 21;        
        Combatant combatant1 = new Combatant(7, "Combatant");
        Combatant combatant2 = new Combatant(11, "Combatant");
        List<Combatant> combatants1 = new ArrayList<>();
        combatants1.add(combatant1);
        combatants1.add(combatant2);
        
        List<Combatant> combatants = new ArrayList<>();
        combatants.add(combatant1);
        combatants.add(combatant2);
        
        battleplayer.addCombatant(combatant1);  // adds combatant1 to the battle
        List<Combatant> result = battleplayer.getCombatants();
        assertEquals(result.size(), expectedRounds);
        assertTrue(result.contains(combatant1));
        assertTrue(result.contains(combatant2));
    }
    
    @Test
    void testNumberOfRounds3() {
        Battleplayer battleplayer = new Battleplayer();
        int expectedRounds = 6;        
        Combatant combatant1 = new Combatant(10, "Combatant");
        Combatant combatant2 = new Combatant(18, "Combatant");
        Combatant combatant3 = new Combatant(21, "Combatant");
        List<Combatant> combatants1 = new ArrayList<>();
        combatants1.add(combatant1);
        combatants1.add(combatant2);
        combatants1.add(combatant3);
        
        List<Combatant> combatants = new ArrayList<>();
        combatants.add(combatant1);
        combatants.add(combatant2);
        combatants.add(combatant3);        
        
        battleplayer.addCombatant(combatant1);  // adds combatant1 to the battle
        List<Combatant> result = battleplayer.getCombatants();
        assertEquals(result.size(), expectedRounds);
        assertTrue(result.contains(combatant1));
        assertTrue(result.contains(combatant2));
        assertTrue(result.contains(combatant3));        
    }

    @Test
    void testNumberOfRounds4() {
        Battleplayer battleplayer = new Battleplayer();
        int expectedRounds = 42;        
        Combatant combatant1 = new Combatant(7, "Combatant");
        Combatant combatant2 = new Combatant(14, "Combatant");
        Combatant combatant3 = new Combatant(19, "Combatant");
        Combatant combatant4 = new Combatant(23, "Combatant");

        List<Combatant> combatants1 = new ArrayList<>();
        combatants1.add(combatant1);
        combatants1.add(combatant2);
        combatants1.add(combatant3);
        combatants1.add(combatant4);
        combatants1.add(combatant5);
        combatants1.add(combatant6);
        combatants1.add(combatant7);
        combatants1.add(combatant8);
        combatants1.add(combatant9);
        combatants1.add(combatant10);

        List<Combatant> combatants = new ArrayList<>();
        combatants.add(combatant1);
        combatants.add(combatant2);
        combatants.add(combatant3);
        combatants.add(combatant4);
        combatants.add(combatant5);
        combatants.add(combatant6);
        combatants.add(combatant7);
        combatants.add(combatant8);
        combatants.add(combatant9);
        combatants.add(combatant10);        

        battleplayer.addCombatant(combatant1);  // adds combatant1 to the battle
        List<Combatant> result = battleplayer.getCombatants();
        assertEquals(result.size(), expectedRounds);
        assertTrue(result.contains(combatant1));
        assertTrue(result.contains(combatant2));
        assertTrue(result.contains(combatant3));
        assertTrue(result.contains(combatant4));
        assertTrue(result.contains(combatant5));
        assertTrue(result.contains(combatant6));
        assertTrue(result.contains(combatant7));
        assertTrue(result.contains(combatant8));
        assertTrue(result.contains(combatant9));
        assertTrue(result.contains(combatant10));


        List<Combatant> result2 = battleplayer.getCombatants();
        assertEquals(result2.size(), expectedRounds * 2);
    }
    
    @Test
    void testNumberOfRounds5() {
        Battleplayer battleplayer = new Battleplayer();
        int expectedRounds = 10;        
        Combatant combatant1 = new Combatant(10, "Combatant");
        Combatant combatant2 = new Combatant(15, "Combatant");
        Combatant combatant3 = new Combatant(20, "Combatant");
        Combatant combatant4 = new Combatant(25, "Combatant");
        Combatant combatant5 = new Combatant(30, "Combatant");
        Combatant combatant6 = new Combatant(35, "Combatant");
        Combatant combatant7 = new Combatant(40, "Combatant");
        Combatant combatant8 = new Combatant(45, "Combatant");
        Combatant combatant9 = new Combatant(50, "Combatant");
        Combatant combatant10 = new Combatant(55, "Combatant");

        List<Combatant> combatants1 = new ArrayList<>();
        combatants1.add(combatant1);
        combatants1.add(combatant2);
        combatants1.add(combatant3);
        combatants1.add(combatant4);
        combatants1.add(combatant5);
        combatants