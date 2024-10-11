// SimpleCombatant_0Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCombatant}.
* It contains one unit test case for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatant_0Test {

    @Test
    public void test_getMaxLP() {
        SimpleCombatant sm = new SimpleCombatant();
        assertEquals(0, sm.maxHealth);
        
        Combatant c1 = new SimpleCombatant(0.9, 0.1);
        Combatant c2 = new SimpleCombatant(0.9, 0.1);
        Combatant c3 = new SimpleCombatant(0.9, 0.1);
        
        // Set of all weapons used to check the defense formula
        Set<WeaponData> usedWeapons = new HashSet<>();
        usedWeapons.add(new WeaponData("gun", 0.9, 0.1, 0.001, "weapon"));
        usedWeapons.add(new WeaponData("gun", 0.9, 0.1, 0.001, "weapon"));
        usedWeapons.add(new WeaponData("gun", 0.9, 0.1, 0.001, "weapon"));
        usedWeapons.add(new WeaponData("gun", 0.9, 0.1, 0.001, "weapon"));
        usedWeapons.add(new WeaponData("gun", 0.9, 0.1, 0.001, "weapon"));
        usedWeapons.add(new WeaponData("gun", 0.9, 0.1, 0.001, "weapon"));

        // Add one Combatant which is controlled by a Weapon
        Combatant obs1 = new SimpleCombatantObserver(c1);
        observationList.add(obs1);
        
        // set up the control by a Weapon
        Weapon p01 = new Weapon("gum", 0.9, 0.1, 0.001, "weapon", usedWeapons);
        WeaponData p01_weaponData = new WeaponData("gun", 0.9, 0.1, 0);
        CharacterClass cc1 = new CharacterClass("de", 1);
        
        // set up the control by a Weapon
        Weapon p03 = new Weapon("Gun", 0.9, 0.1, 0.001, "weapon", usedWeapons);
        CharacterClass cc3 = new CharacterClass("de", 3);
        
        // add another one by a Weapon
        CombatantState c = new CombatantState("p01", p01, cc1);
        setObservers(p01, c);
        observationList.add(c);
        observationList.add(obs1);
        
        // set up the control by a Weapon
        Weapon p06 = new Weapon("gun", 0.9, 0.1, 0.001, "weapon", usedWeapons);
        CharacterClass cc6 = new CharacterClass("de", 6);
        
        // set up the control by a Weapon
        Weapon p07 = new Weapon("Gun", 0.9, 0.1, 0.001, "weapon", usedWeapons);
        CharacterClass cc06 = new CharacterClass("de", 6);
        
        // add another one by a Weapon
        CombatantState c2 = new CombatantState("p06", p06, cc6);
        setObservers(p06, c2);
        observationList.add(c2);
        observationList.add(obs1);
        
        // Set of all Weapons owned by the test
        CharacterClass cc = new CharacterClass("de", 0);
        ccList.add(cc);
        ccList.add(cc6);
        ccList.add(cc06);
        
        // set up the control by a Weapon
        CharacterClass cc2 = new CharacterClass("de", 1);
        observationList.add(c2);
        observationList.add(obs1);
        
        // set up the control by a Weapon
        CharacterClass cc3 = new CharacterClass("de", 3);
        CharacterClass cc7 = new CharacterClass("de", 6);
                
        // set-up the control by a Weapon
        CharacterClass cc8 = new CharacterClass("de", 8);
        CharacterClass cc10 = new CharacterClass("de", 10);
        CharacterClass cc12 = new CharacterClass("de", 12);
        
        GameData d = new GameData("p01", c1);
        d._setCharacterClass(cc1);
        d._setCombatantState(c);
        d._setObservers(obs1);
        
        d++;
        d._setCombatantState(c2);
        
        d.setCharacterClass(cc3);
        d.setCombatantState(c);
        d.setObservers(obs1);
        
        d.setCharacterClass(cc07);
        d.setCombatantState(c2);
        d.setObservers(obs1);
        
        d.setCharacterClass(cc6);
        d.setCombatantState(c2);
        
        d++;
        d._setCombatantState(c3);
        
        d.setCombatantState(c);
        d.setObservers(obs1);
        
        d.setCombatantState(c2);
        d.setObservers(obs1);
        
        d._setCombatantState(c11);
        
        d.setCombatantState(c12);
        
        d.setCombatantState(c6);
        
        combatantList.add(cc);
        combatantList.add(cc7);
        compositeList.add(d);
        
        combatantList.remove(new CharacterClass("de", 3));
        combatantList.remove(new CharacterClass("de", 6));
        combatantList.remove(new CharacterClass("de", 8));
        combatantList.remove(new CharacterClass("de", 10));
        
        debug("Created two combatants: cc1", cc1, cc1.getCombatant());
        debug("Created comcombatant cc7", cc7, cc7.getCombatant());
        debug("Created cc6", cc6, cc6.getCombatant());
        debug("Created cc8", cc8, cc8.getCombatant());
        
        assertEquals(0, p01.maxHealth);
        assertEquals(2, p06.maxHealth);
        
        // Check that two non-observers have no influence over the 2 others
        CharacterClass cc9