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
		
		private final Set<CombatantState> state = new HashSet<>();
		private final Set<CombatantObserver> observer = new HashSet<>();
		private final Set<CombatantSide> side = new HashSet<>();
		private final Set<SectorBonus> bonuses = new HashSet<>();

		/**
		 * Private constructor for testing purposes.
		 */
		private SimpleCombatant_1Test() {
		}
		
		/**
		 * Tests that _getCurrentLP() returns the current LP from the set of state variables.<br />
		 * {@code Combatant_1Test.test.error.cantAccessPrivate} is expected to throw.
		 *
		 * @throws Exception in case of failure.
		 */
		@Test
		public void testGetCurrentLP() {
			
			// Create a Combatant from a location set
			Set<CharacterClass> set = new HashSet<>();
   	 	set.add(new CharacterClass("A", CombatantData.DEL_WEAPON));
   	 	Combatant compActual = new SimpleCombatant(set);

			// Check that the current HP of the actual Combatant is
			// the value returned by the method "getCurrentLP"
			assertEquals("The current HPV of the Combatant is wrong", 25, compActual._getCurrentLP());
		}
		
		/**
		 * Tests whether a Combatant has its state changed.
		 *
		 * @throws Exception in case of failure.
		 */
		@Test
		public void testStateChanged() throws Exception {
    
    	 // Create a Combatant
		   Combatant compActual = new SimpleCombatant(new Set<CharacterClass>());
		   CombatantObserver compObserver = new CombatantObserver();

		   // Set the Combatant to the state of the actual one
		   compActual.setObserver(compObserver);
   	 	assertEquals("The Combatant's state changed while an Observer is set", CombatantObserver.ACTIVE, compObserver.getState());
   	 	compObserver.setState(CombatantObserver.INACTIVE);

		   // Create another Combatant
  	        compActual = new SimpleCombatant(new Set<CharacterClass>());
			assertEquals("The Combatant's state changed while an Observer is set", CombatantObserver.INACTIVE, compObserver.getState());
			compObserver.setState(CombatantObserver.INACTIVE);
		}
		
		/**
		 * Tests whether a Combatant does not exist anymore.
		 *
		 * @throws Exception in case of failure.
		 */
       	@Test
		public void testIsNotRegistered() throws Exception {
    	
    	 // Create a Combatant
		   Combatant compActual = new SimpleCombatant(new Set<CharacterClass>());
		   CombatantObserver compObserver = new CombatantObserver();

		   assertNull("The Combatant should not be registered yet", compActual.isRegistered());
		   compObserver.setState(CombatantObserver.REGISTERED);
    	 	compActual.setObserver(compObserver);

		   // Create a Combatant
		   Combatant act = new SimpleCombatant(new Set<CharacterClass>());
		   assertEquals("The return state should be null", (Combatant) null, act.isRegistered());
		   act.setObserver(compObserver);
      	   assertEquals("The return state should be null", (Combatant) null, act.isRegistered());
		   compObserver.setState(CombatantObserver.ACTIVE);
		   compActual.setObserver(compObserver);
    	 	assertEquals("The return state should be null", (Combatant) null, act.isRegistered());
    	 	compObserver.setState(CombatantObserver.INACTIVE);
      	   assertNull("The return state should not be null", act.isRegistered());
		   compObserver.setState(CombatantObserver.REGISTERED);
		}

		/**
		 * Creates a Combatant with an empty location set.
		 *
		 * @throws Exception in case of failure.
		 */
		@Test
		public void testCreateWithoutLocation() throws Exception {
			
			// The Combatant should not exist, it does not need to be registered, it does not need to exist in the battle
			Combatant actual = new SimpleCombatant(new Set<CharacterClass>());
			assertNull("The Combatant should not exist yet", actual.isRegistered());
    		assertNotNull("The Combatant should not null", actual);
			assertEquals("This Combatant should be in the battle", Combatant.ACTIVE, actual);
			
	 	}
		
	}