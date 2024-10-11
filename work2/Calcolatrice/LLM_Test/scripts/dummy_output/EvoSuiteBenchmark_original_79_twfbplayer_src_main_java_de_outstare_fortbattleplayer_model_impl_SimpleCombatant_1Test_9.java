// SimpleCombatant_1Test.java
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
* It contains one unit test case for the {@link SimpleCombatant#_getCurrentLP()} method.
*/
class SimpleCombatant_1Test {
		
	private static final String TAG = SimpleCombatant_1Test.class.getName();

	/**
	 * Simple test class - not designed for test performance.
	 * A simple unit test does it himself!
	 */
	@Test
	void testGetMaxAttackStrength() {

		final SimpleCombatant _combatant = new SimpleCombatant();

		// check for the value
		assertEquals(_combatant._getMaxAttackStrength(),
				_combatant.getMaxAttackStrength());
		_combatant.calcHP();
		assertEquals(_combatant._getMaxAttackStrength(), _combatant.calcHP());
	}

	/**
	 * Check if the Combatant has not a hit or no damage.
	 */
	@Test
	void checkStateAfterCompletingCombatant_attackAfterCompletion() {

		// prepare
		final Set<Combatant> allCombatants = new HashSet<Combatant>();
		
		// make sure our data contains the attacker
		for (final WarElement el : _warElement.getAll()){
			allCombatants.add(el.getCombatant());
		}

		// define a combatant that will fight with us
		final CharacterClass combatant = new CharacterClass("combatant");
		combatant.addWeapon(new Weapon('a', 1, 0, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('b', 5, 10, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('c', 50, 150, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('d', 1000, 0, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		final WarElement combatantWar = new WarElement();
		combatantWar.addWarElement(_warElement);
		combatantWar.addWarElement(combatant); // add two new items
		combatantWar.addWarElement(combatant); // add two new items
		combatantWar.addWarElement(combatant); // add two new items

		// add attacker 
		final Combatant attacker = new Combatant(combatant.getID(), combatant.getWarElement()
				.getWarElement(), combatant.getWarElement()
				.getWarElement(), new CharacterClass("combatant"), null);

		// add our combatant to the battle
		allCombatants.add(attacker);

		// run
		final CombatantState combatantStateAfterCompletion =
		        _combatant.checkIfStateAfterCompletion(attacker, attacker,
		                combatantWar.getWarElement(), new Set<CombatantSide>());	

		// verify
		assertTrue(combatantStateAfterCompletion instanceof CombatantState
				&& combatantStateAfterCompletion
				.getCombatants().equals(combatant.getCombatants()));
	}

	/**
	 * Check if the Combatant has a target and a target for us.
	 */
	@Test
	void checkStateAfterCompletingCombatant_targetAfterCompletion() {

		// prepare
		final Set<Combatant> allCombatants = new HashSet<Combatant>();
		
		// make sure our data contains the attacker
		for (final WarElement el : _warElement.getAll()){
			allCombatants.add(el.getCombatant());
		}

		// define a combatant that will fight with us
		final CharacterClass combatant = new CharacterClass("combatant");
		combatant.addWeapon(new Weapon('a', 1, 0, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('b', 5, 10, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('c', 50, 150, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('d', 1000, 0, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('d', 1000, 0, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('b', 1000, 0, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('c', 1000, 0, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		combatant.addWeapon(new Weapon('d', 1000, 0, 1000, new WeaponData("dummy"
						.getUnits().size(), null)));
		final WarElement combatantWar = new WarElement();
		combatantWar.addWarElement(_warElement);
		combatantWar.addWarElement(combatant); // add two new items
		combatantWar.addWarElement(combatant); // add two new items
		combatantWar.addWarElement(combatant); // add two new items

		// add attacker 
		final Combatant attacker = new Combatant(combatant.getID(),combatant.getWarElement()
				.getWarElement(),combatantWar.getWarElement(), new CharacterClass("combatant"), new Set<CombatantSide>(allCombatants));

		// add our combatant to the battle
		allCombatants.add(attacker);

		// run
		final CombatantState combatantStateAfterCompletion =
		        _combatant.checkIfStateAfterCompletion(attacker, attacker,
		                combatantWar.getWarElement(), new Set<CombatantSide>());	

		// verify
		assertTrue(combatantStateAfterCompletion instanceof CombatantState
				&& combatantStateAfterCompletion.getCombatants().equals(combatant.getCombatants()));
	}

	/**
	 * Check if the Combatant has a target and a target for us.
	 */
	@Test
	void checkStateAfterCompletingCombatant_differentTargetAfterCompletion() {

		// prepare
}
}