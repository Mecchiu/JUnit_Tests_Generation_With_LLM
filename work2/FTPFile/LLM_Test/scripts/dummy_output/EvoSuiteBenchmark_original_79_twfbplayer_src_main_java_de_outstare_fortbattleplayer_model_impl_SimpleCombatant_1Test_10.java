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
	 * This constructor is used to get a new {@link SimpleCombatant} object
	 * 
	 * @param theArea the area to create the new {@link SimpleCombatant}
	 */
	public SimpleCombatant_1Test(Area theArea) {
		for (SectorBonus sb : theArea.getSectors()) {
			for (Integer pos = 0; pos < sb.getSize(); pos++) {
				this.addVictim(sb.getSector(pos).getCombatant());
			}
		}
	}
	
	/**
	 * This method tests the {@link Combatant#_getCurrentLP()}
	 * method. It gets a new {@link Weapon} object for the given
	 * character class and position.
	 */
	@Test
    public void getCurrentLP() {
		assertEquals("get", -1, SimpleCombatant.class._getCurrentLP(), 0);
		SimpleCombatant simpleCombatant = new SimpleCombatant();
		assertEquals("get", -1, simpleCombatant._getCurrentLP(), 0);
		CharacterClass chc = new CharacterClass(simpleCombatant.getClass());
		CharacterClass.Item i1 = new CharacterClass.Item(chc.getCharacterClass(0).getClassClass(chc.getCharacterClass(0).getItem(2).getClassClass(), 1));
		assertEquals("get", 0, i1.getItem(0).getClassClass(i1.getItem(0).getClassClass()).getWeight(), 0);
		
		CharacterClass chc2 = new CharacterClass(simpleCombatant.getClass());
		CharacterClass.Item i2 = new CharacterClass.Item(chc2.getClassClass(0).getClassClass(i1.getItem(0).getClassClass()));
		assertEquals("get", 0, i2.getItem(1).getClassClass(i2.getItem(1).getClassClass()).getWeight(), 0);
	}
	
	/**
	 * Checks whether all given {@link Combatant}s contain the given
	 * {@link Character} object.
	 * 
	 * @throws Exception exception thrown in case something went wrong
	 */
	@Test
	public void checkAllContain(CombatantObserver observer) throws Exception {
		
		for (Combatant c : this.getClass().getCombatants()) {
			if (!(observer.checkObserve(c.getClass(), c))) {
				throw new Exception("No observe for " + c);
			}
		}
		
		for (Combatant c : this.getClass().getCombatants()) {
			System.out.println("Contain for " + c.getClass().getName() + ":" + c.getClass().name());
			assertTrue(observer.checkObserve(c.getClass(), c));
		}
	}
	
    /**
     * This method adds a new {@link Combatant} object to the {@link Area} of
     * the given {@link SimpleCombatant} object.
     */
    private void addVictim(Combatant victim) {
        Area newArea = new Area("", new HashSet<CombatantSide>(), newHashSet(victim.getClass().getSectorBonus(), true));
        this.addToArea(victim, newArea);
        victim.setSectorBonus(null);
    }
    
	/**
	 * This method checks whether all given {@link Weapon}s are the first
	 * element of or all the other {@link Weapon}s are the second element 
	 * of a {@link Weapon} object.
	 */
	@Test
	public void checkSomeFirstElementOfEachWeaponIsFirstElementOfEachOther()
			throws Exception {
		
}
}