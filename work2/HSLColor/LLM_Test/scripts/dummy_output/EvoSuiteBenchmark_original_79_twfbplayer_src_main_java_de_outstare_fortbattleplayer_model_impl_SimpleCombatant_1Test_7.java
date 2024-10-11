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
		 * Unit test for {@link SimpleCombatant#_getCurrentLP()}
		*/
	@Test
    public void _getCurrentLP_returnsTrueWhenTheSector() {
		SimpleCombatant combatant = new SimpleCombatant();
		final Sector bonus = new SectorBonus(combatant, 5);
		combatant.addSector(bonus);
		assertSame(combatant.getSectorBonus(this).length(), 5);
	}
	
	/**
	 * Unit test for {@link SimpleCombatant#_getCurrentLp()}
	 */
	@Test
	public void _getCurrentLp_returnsTheSumOfSectorsOfKnownLevels_ofLevelOne() {
		SectorBonus bonus = new SectorBonus(new SimpleCombatant(), 10);
		final Sector bonusEnd = new SectorBonus(new SimpleCombatant(), this.calculateHighestLevel(), "", "", this.calculateHighestLevel(), "");
        final int level1 = this.calculateHighestLevel();
		final int level2 = this.calculateHighestLevel();
		assertTrue(this.calculateLevelsSum(bonus, this.calculateLevelsSum(bonusEnd)) == this.calculateLps("");
	}
	
	/**
	 * Unit test for {@link SimpleCombatant#_getCurrentLp()}
	 */
	@Test
	public void _getCurrentLp_returnsTheSumOfSectorsOfKnownLevels_ofLevelTwo() {
		SectorBonus end = new SectorBonus(new SimpleCombatant(), this.calculateHighestLevel());
    final int levelMin = 0, levelMax = this.getMaximumLevel();
		end.setLevel(this.calculateHighestLevel());
		assertTrue(this.calculateLevelsSum(end) == levelMin);
	}

	/**
	 * Unit test for {@link SimpleCombatant#getHighestLevel()}
	 */
	@Test
	public void getHighestLevel_returnsTheHighestLevel() {
	    final int level = this.calculateHighestLevel();
	    final int levelMax = this.calculateHighestLevel();
		final CombatantObserver characteristicObserver = new NullAttackObserver();
		final Combatant character = new SimpleCombatant(characteristicObserver);
		characteristicObserver.addCharacteristic(this);
		character.setCombatantData(new CombatantData(characteristicObserver, level, 4));
		character.setSectorBonus(level, this.calculateLevelsSum(characteristicObserver));

		assertEquals(characteristicObserver.getLastLp(), level);
	} 

	/**
	 * Unit test for {@link SimpleCombatant#getLevelsSum(java.util.Set)}.
	 */
	@Test
	public void getLevelsSum_shouldReturnLevelsSum() {
		final CombatantObserver characteristicObserver = new NullAttackObserver();
		final Combatant character = new SimpleCombatant(characteristicObserver);
		characteristicObserver.addCharacteristic(this);
                character.setCombatantData(new CombatantData(characteristicObserver, 5, 4));
                character.setSectorBonus(5, this.calculateLevelsSum(characteristicObserver));

		assertTrue("L1 + L2 > 1", this.calculateLevelsSum(characteristicObserver) > 1);
	}

	/**
	 * Unit test for {@link SimpleCombatant#getLevelsSum(java.util.Set)}.
	 */
	@Test
	public void getLevelsSum_shouldThrowExceptionWhenTheSector_hasBeenNull() {
		CharacterClass characterClass = new CharacterClass(CharacterClass.ATTACK, "BASIC", 0);
		// TODO: test that null can be used
	}

	public int calculateLps(String name) {
		return this._getCurrentLP();
	}
	
	private static final Logger logger = Logger.getLogger(SimpleCombatant.class.getCanonicalName());
}