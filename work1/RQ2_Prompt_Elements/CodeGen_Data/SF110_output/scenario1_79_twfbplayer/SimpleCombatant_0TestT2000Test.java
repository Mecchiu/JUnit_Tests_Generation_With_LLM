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
/**
		* A Set used to verify if a GameWorldObserver can be obeyed by the <code>Combatant</code>.
		*/
	private static final Set<CombatantObserver> INVALID = new HashSet<CombatantObserver>();

	/**
	* Validate a GameWorldObserver's behavior.
	* The <code>invalidCombatant</code> method needs to be overloaded to validate, the methods should add the
	* combatant's identification to the Set of invalidCombatant.
	* One Combatant will be notified about any invalid attacker in the game as well as any invalid defender
	* @param gameWorldObserver The GameWorldObserver instance who needs to validate
	*/
	private static void validate (CombatantObserver gameWorldObserver) {
		if (gameWorldObserver!= null) {
			for (int i = 0; i < gameWorldObserver.getNumCombatants(); i++) {
				if (!INVALID.contains(gameWorldObserver)) {
					// Invalid attacker found.
					fail("Found invalid attacker");
				}
			}

			for (Combatant attacker : gameWorldObserver.getCombatants()) {
				if (!INVALID.contains(attacker)) {
					// Valid attacker found.
					fail("Found valid attacker");
				}
			}
		}
	}

	/**
	* Build a {@link SimpleCombatant} with the default values.
	*/
	public static SimpleCombatant build() {
		return new SimpleCombatant(10, 10);
	}

	/**
	* Basic constructor for the {@link SimpleCombatant}.
	* @param _maxLeft The maxLeft attribute for this Combatant instance.
	* @param _maxRight The maxRight attribute for this Combatant instance.
	* @throws NotEnoughAttacksException Thrown, if a required attribute is missing.
	* @throws TooManyAttacksException Thrown, if the required attribute will cause a attack.
	*/
	public SimpleCombatant(int _maxLeft, int _maxRight) throws NotEnoughAttacksException, TooManyAttacksException {
		this.addSectorBonus(_maxLeft);
		this.addSectorBonus(_maxRight);
	}

	/**
	* Test constructor with a different minLeft and maxRight.
	* @param _minLeft The minLeft attribute for this Combatant instance.
	* @param _maxRight The maxRight attribute for this Combatant instance.
	* @throws NotEnoughAttacksException Thrown, if a required attribute is missing.
	* @throws TooManyAttacksException Thrown, if the required attribute will cause a attack.
	* @throws WrongMoveCostException Thrown, if the move cost isn't consistent with the attributes.
	*/
	public SimpleCombatant(int _minLeft, int _maxRight, int _moveCost) throws NotEnoughAttacksException, TooManyAttacksException, WrongMoveCostException {
		super();
		assertEquals(_minLeft, 20);
		assertEquals(_maxRight, 10);
		this.addSectorBonus(_moveCost);
	}

	/**
	* Test constructor with a different minLeft attribute and maxRight.
	* @param _minLeft The minLeft attribute for this Combatant instance.
	* @param _maxRight The maxRight attribute for this Combatant instance.
	* @throws NotEnoughAttacksException Thrown, if a required attribute is missing.
	* @throws TooManyAttacksException Thrown, if the required attribute will cause a attack.
	* @throws WrongMoveCostException Thrown, if the move cost isn't consistent with the attributes.
	*/
	public SimpleCombatant(int _minLeft, int _maxRight, int _moveCost, 
			int _minObserverObservedAttacks, int _maxObserverObservedAttacks) 
			throws NotEnoughAttacksException, TooManyAttacksException,WrongMoveCostException {
		super();
		assertEquals(_minLeft, 20);
		assertEquals(_maxRight, 10);
		this.addSectorBonus(_moveCost);
		this.addSectorBonus(_minObserverObservedAttacks);
	}

	/**
	* A single instance of the {@link Combatant}.
	*/
	public static Combatant create () {
		return Combatant.create(10, 10);
	}
}

// SimpleCombatant_0.java
