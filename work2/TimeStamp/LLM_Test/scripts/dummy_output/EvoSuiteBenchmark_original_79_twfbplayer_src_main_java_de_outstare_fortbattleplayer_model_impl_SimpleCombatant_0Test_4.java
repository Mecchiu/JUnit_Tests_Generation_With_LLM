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
		
    @SuppressWarnings("unused")
    private static final Logger LOG = Logger.getLogger(SimpleCombatant_0Test.class.getName());

    /**
     * Test of setValue method, of class de.outstare.fortbattleplayer.model.Combatant.
     */
    @Test
    public void setValue_ShouldSetHPtoMaxHp() {
        SimpleCombatant sa = new SimpleCombatant();
        System.arraycopy(CharacterClass.MAX_HP, 0, CharacterClass.LIMIT.toCharArray(), 0, CharacterClass.LIMIT.size());
        assertEquals(CharacterClass.MAX_HP, sa.getMaxHP());
        Set<Combatant<CombatantParameters>> expected = new HashSet<Combatant<CombatantParameters>>();
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.COMBATING, new int[]{0})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.COMBATING, new int[]{1})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.COMBATED, new int[]{0})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.COMBATED, new int[]{1})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{0})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{1})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{2})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{3})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{4})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{5})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{6})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{7})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{8})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{9})));
        expected.add(new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.DEAD, new int[]{10})));
        //System.out.println(expected);
        Set<Combatant<CombatantParameters>> actual = new HashSet<Combatant<CombatantParameters>>();
        for(Combatant<CombatantParameters> cs : expected) {
            Combatant<CombatantParameters> cs2 = new SimpleCombatant<CombatantParameters>(new CombatantSide(CombatantSide.COMBATANT), new CombatantState(CombatantState.COMBATING, new int[]{cs.parameters.getHp()}));
            cs2.setMaxHP(cs.parameters.getHp());
            actual.add(cs2);
        }
        //System.out.println(actual);
        //actual.retainAll(expected);
        //System.out.println(expected);
        assertEquals(actual, expected);
    }
	
    /**
     * Test of getValue method, of class de.outstare.fortbattleplayer.model.Combatant.
     */
    @Test
    public void getValue_ShouldGetHP() {
        SimpleCombatant sa = new SimpleCombatant();
        System.arraycopy(CharacterClass.MIN_HP, 0, CharacterClass.LIMIT.toCharArray(), 0, CharacterClass.LIMIT.size());
        assertEquals(-5, sa.getMaxHP());
        assertEquals(CharacterClass.MIN_HP, sa.getMaxHP());
        assertEquals(CharacterClass.MAX_HP, sa.maxHP());
	}
	
	/**
    * Test of unload method, of class de.outstare.fortbattleplayer.model.Combatant.
    */
    @Test
    public void unload_ShouldDestroyCombatant() {
        Combatant sa = new SimpleCombatant();
        System.arraycopy(CharacterClass.MAX_HP, 0, CharacterClass.LIMIT.toCharArray(), 0, CharacterClass.LIMIT.size());
        assertEquals(CharacterClass.MAX_HP, sa.getMaxHP());
        sa.unload();
    }
	/**
    * Test of init method, of class de.outstare.fortbattleplayer.model.Combatant.
    */
    @Test
    public void init_ShouldInitializeCombatant() {
        SimpleCombatant sa = new SimpleCombatant();
		Set<CombatantState> seenStates = new HashSet<CombatantState>();
}
}