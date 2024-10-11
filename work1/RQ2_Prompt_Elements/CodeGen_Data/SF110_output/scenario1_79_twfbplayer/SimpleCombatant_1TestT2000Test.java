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

	/**
	 * The _currentHP attribute of the Combatant
	 */
	int _currentHP = 0;
	
	/**
	 * The _currentMP attribute of the Combatant
	 */
	int _currentMP = 0;
	
	/**
	 * The _currentWeapon attribute of the Combatant
	 */
	Weapon _currentWeapon = null;
	
	/**
	 * The _currentLP is the current LP of the Combatant.
	 */
	int _currentLP = 0;
	
	/**
	 * The _isActive attribute of the Combatant
	 */
	boolean _isActive = false;
	
	/**
	 * The _state attribute of the Combatant
	 */
	CombatantState _state = CombatantState.FLEEING;
	
	/**
	 * The _combatantObserver attribute of this class
	 */
	CombatantObserver _combatantObserver = new CombatantObserver() {
		
		private Set<CombatantSide> currentSides = new HashSet<>();

		@Override
		public Set<CombatantSide> getAttackableSides() {
			return currentSides;
		}
		
		@Override
		public CombatantState getState() {
			return _state;
		}
		
		@Override
		public void notifyStateChanged() {
			_state = CombatantState.FLEEING;
		}
	};
	
	/**
	 * Test of getAttachedLPs method, of combatant.
	 */
	@Test
	public void testGetAttachedLPs() {
		// System.out.println("getAttachedLPs #1");
		//System.out.println(_currentHP);

		_currentHP = 1;
		
		// System.out.println("getAttachedLPs #2");
		//System.out.println(_currentHP);

		assertNotNull( _currentHP );
		assertEquals("getAttachedLPM", 1, _currentHP);
		
		_currentHP = 30;
		
		//System.out.println("got a new HP");
		//System.out.println(getAttachedLPM());
		
		// We must go forward!
		assertTrue(!isActive());
		
		//System.out.println("turn on");
		_isActive = true;
		
		// System.out.println(getAttachedLPM());
		assertEquals("was attached to sides #1", 30, getAttachedLPM());
		
		// We must go backward!
		_combatantObserver.notifyAttackStarted();
		assertEquals("set new HP", 30, getAttachedLPM());	
		
		_combatantObserver.notifyAttackOver();
		//TODO uncoment this if we have a weapon
		//assertTrue("attached to sides #1 is still attached",_combatantObserver.getAttackableSides().size() == 1);
		//assertFalse("attached to sides #1's new HP", _combatantObserver.getAttackableSides().iterator().next().getNewDamage());
		
		//_combatantObserver.notifyAttackOver();
		_combatantObserver.notifyAttackFulfilled();
		
		assertTrue("attack end.",_isActive);
		getAttachedLPM();
		assertEquals(1, _currentHP);
		
	}

	/**
	 * Test of _getCurrentLP() method, of combatant.
	 */
	@Test
	public void testGetCurrentLP() {
		//System.out.println("getCurrentLP");
		
		// We must go forward!
		assertTrue(!isActive());
		
		assertEquals("current LP is not already set to 0.", 0, _state.getCurrentHP().intValue());
		
		assertEquals("get Current HP", 30, getCurrentHP());
		
		// First time a LPS is assigned:
		assertEquals("get Current HP", 30, _currentHP);
		assertEquals("_getCurrentHP", 30, _currentHP);
		
		_isActive = true;
		
		for (int id : _state.getAttackableSides()) {
			for (int j = 0; j < id; ++j) {
				assertEquals("current LP assignment", 30, _currentHP);
				assertEquals("got a new HP", 30 + id, _currentHP);
				getCurrentHP();
				assertEquals(2, getAttachedLPM().getTotalHP());
				assertEquals(1, getAttachedLPM().getTotalHP());
			}
		}
		
		_currentRP = 0;
		assertEquals("_currentRP", 0, _currentRP);
		
		assertEquals("current RP is not set to 0", 0, _currentRP);
		
		_combatantObserver.notifyAttackStarted();
		_combatantObserver.notifyAttackOver();
		assertEquals("new LPS is added to _combatantObserver", 90, _currentRP);
		assertEquals("current RP is not already set to 90", 90, _currentRP);
		// TODO uncoment this if we have a weapon
		//assertEquals("attack end.", _combatantObserver.getAttackableSides().iterator().next().getNewDamage(), _combatantObserver.getAttackableSides().iterator().next().getNewDamage());
		//assertEquals("attack end.", _combatantObserver.getAttackableSides().iterator().next().getNewHP(), _combatantObserver.getAttackableSides().iterator().next().getNewHP());

		assertEquals("_combatantObserver.getCurrentLPM()", 0, _combatantObserver.getCurrentLPM().intValue());
		
		_combatantObserver.notifyAttackOver();
		_isActive = true;
		
		// TODO uncoment this if we have a weapon
		assertEquals("attack end.", _combatantObserver.getAttackableSides().iterator().next().getNewDamage(), _combatantObserver.getAttackableSides().iterator().next().getNewDamage());
		getCurrentHP();
		// TODO uncoment this if we have a weapon
		//assertEquals("attack end.", _combatantObserver.