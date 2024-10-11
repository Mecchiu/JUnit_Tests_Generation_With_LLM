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
		// this class provides static methods that return the maximal life of the
		// combatant, which is defined in {@link SimpleCombatant}
		private static Integer maxLPSection(int pLPSolutionValue) {
			int lps = (int) (pLPSolutionValue / 2.0);
			int lps2 = (int) ((pLPSolutionValue * 2) + 1);
			return (int) (Math.sqrt(Math.pow(lps2, 2)) + lps);
			}
	
				// this static method returns the maximal life of the
				// weapon, which is defined in {@link Shot}
				public static Integer _getMax(String wpName) throws Exception {
    System.out.println("The value of the " + wpName + " weapon is " + maxLPSection(weaponData.getWorld().values().nextFloat()));
							return maxLPSection(weaponData.getWorld().values().nextFloat());	   
			}
	//-----------------------------------------------------------------
	// Test methods for the private static methods
	//-----------------------------------------------------------------
	/**
	 * Test method for {@link SimpleCombatant#_getMaxLP()}
	 * @throws Exception if ai tests fail.
	 */
	@Test
	public void test_getMaxLP() throws Exception {
		Area a = new Area();
		a.setDamage(weaponData.getWorld().values().nextFloat());
                Weapon weapon = new Weapon();
                weapon.setName(wpName);
				// Set up the combatants
				Set<CombatantState> c = new Set<CombatantState>();
			c.add(CombatantState.STATE_EASY);
			c.add(CombatantState.STATE_FAST);
			c.add(CombatantState.STATE_NORMAL);
			c.add(CombatantState.STATE_MELEE);
                a.addCombatant(CharacterClass.A, c);
				// Create a new game player.
				AiPlayer player = new AiPlayer(a);
				// Place the player!
				player.setObserver(new CharacterClassCombatantObserver());
				AiCharacter b = new AiCharacter(player);
			assertFalse((boolean) a.getCombatant(CharacterClass.A, CombatantSide.HAND).equals(b));
			assertFalse((boolean) a.getCombatant(CharacterClass.B, CombatantSide.HAND).equals(b));
			// Set the combatants.
			Set<Combatant> c2 = new HashSet<Combatant>();
			c2.add(new Combatant(player.getCharacterClass().A, CombatantSide.HAND));
			c2.add(new Combatant(player.getCharacterClass().B, CombatantSide.HAND));
			c2.add(new Combatant(player.getCharacterClass().B, CombatantSide.MIDDLE));
			a.addCombatant(CharacterClass.A, c2);
			AiCharacter a2 = new AiCharacter(player);
			assertTrue((boolean) a2.getCombatant(CharacterClass.B, CombatantSide.HAND).equals(b));
			assertFalse((boolean) a2.getCombatant(CharacterClass.A, CombatantSide.HAND).equals(b));
			a2.setAttackRange(new Integer(a2.getCombatant(CharacterClass.A, CombatantSide.HAND).getWeapon(Weapon.FIRE).getRange()));
			// Set the combatant to the B weapon of the A character.
			Set<CombatantObserver> ch = new HashSet<CombatantObserver>();
			ch.add(new CharacterClassCombatantObserver());
			a2.addObserver(ch);
			// Set up the player to use the first weapon.
			player = new AiPlayer(a);
			// Place the player!
			player.setObserver(ch);
			b = new AiCharacter(player);
			assertFalse((boolean) a.getCombatant(CharacterClass.B, CombatantSide.HAND).equals(b));
			c2.clear();
			c2.add(new Combatant(player.getCharacterClass().A, CombatantSide.HAND));
			c2.add(new Combatant(player.getCharacterClass().A, CombatantSide.MIDDLE));
			a.addCombatant(CharacterClass.A, c2);
			// Set the combatants.
			a2.setCombatant(CharacterClass.A, a2.getCombatant(CharacterClass.A, CombatantSide.MIDDLE));
			assertTrue((boolean) a2.getCombatant(CharacterClass.A, CombatantSide.HAND).equals(b));
			assertFalse((boolean) a2.getCombatant(CharacterClass.B, CombatantSide.HAND).equals(b));
			a2.setAttackRange(new Integer(a2.getCombatant(CharacterClass.B, CombatantSide.MIDDLE).getWeapon(Weapon.FIRE).getRange()));
			// Set the combatant to the B weapon of the A character.
			a2.setCombatant(CharacterClass.B, a2.getCombatant(CharacterClass.B, CombatantSide.HAND));
			ch.clear();
			ch.add(ch.get(0)); ch.add(ch.get(1)); ch.add(ch.get(4)); ch.remove(ch.get(5));
			ch.clear();
			ch.add(ch.get(0)); ch.add(ch.get(1)); ch.add(ch.get(3)); ch.remove(ch.get(4));
			ch.clear();
			ch.add(ch.get(0)); ch.add(ch.get(1)); ch.add(ch.get(2)); ch.remove(ch.get(4));
		
			// Set up the player to use the second weapon.
			player = new AiPlayer(a);
			player.setObserver(ch);
			b = new AiCharacter(player);
			assertFalse((boolean) a2.getCombatant(CharacterClass.A, CombatantSide.MIDDLE).equals(b));
}
}