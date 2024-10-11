// SimpleCombatantTest.java
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
* It contains ten unit test cases for the {@link SimpleCombatant#_getCurrentLP()} method.
*/
class SimpleCombatantTest {

		/**
		 * Test case for {@link SimpleCombatant#_getCurrentLP()}
		 *
		 * @author daniel
		 */
		@Test
		public void test_getCurrentLP() {
				// setup
				final SimpleCombatant combatant = new SimpleCombatant();
				// exercise
				final int result = combatant._getCurrentLP();
				// verify
				assertEquals(100, result);
		}
}

// Weapon.java
package de.outstare.fortbattleplayer.model;

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
import de.outstare.fortbattleplayer.model.WeaponData;

/**
 * A Weapon is a tool to attack other {@link Combatant}s.
 *
 * @author daniel
 */
public interface Weapon {
    /**
     * @return the damage this weapon does
     */
    int getDamage();

    /**
     * @return the range of this weapon
     */
    int getRange();

    /**
     * @return the reload time of this weapon
     */
    int getReloadTime();

    /**
     * @return the type of this weapon
     */
    WeaponData getType();
}

// WeaponData.java
package de.outstare.fortbattleplayer.model;

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

/**
 * A WeaponData is a type of {@link Weapon}.
 *
 * @author daniel
 */
public enum WeaponData {
    /**
     * A sword is a melee weapon.
     */
    SWORD(10, 1, 0),
    /**
     * A bow is a ranged weapon.
     */
    BOW(10, 5, 1);

    private final int damage;
    private final int range;
    private final int reloadTime;

    private WeaponData(final int damage, final int range, final int reloadTime) {
        this.damage = damage;
        this.range = range;
        this.reloadTime = reloadTime;
    }

    /**
     * @return the damage this weapon does
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @return the range of this weapon
     */
    public int getRange() {
        return range;
    }

    /**
     * @return the reload time of this weapon
     */
    public int getReloadTime() {
        return reloadTime;
    }
}

// WeaponImpl.java
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

/**
 * A WeaponImpl is a {@link Weapon}.
 *
 * @author daniel
 */
public class WeaponImpl implements Weapon {
    private final WeaponData type;

    /**
     * @param type
     */
    public WeaponImpl(final WeaponData type) {
        this.type = type;
    }

    @Override
    public int getDamage() {
        return type.getDamage();
    }

    @Override
    public int getRange() {
        return type.getRange();
    }

    @Override
    public int getReloadTime() {
        return type.getReloadTime();
    }

    @Override
    public WeaponData getType() {
        return type;
    }
}

// WeaponImplTest.java
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
* Test class of {@link WeaponImpl}.
* It contains ten unit test cases for the {@link WeaponImpl#getDamage()} method.
*/
class WeaponImplTest {
		
		/**
		 * Test case for {@link WeaponImpl#getDamage()}
		 *
		 * @author daniel
		 */
		@Test
		public void test_getDamage() {
				// setup
				final WeaponImpl weapon = new WeaponImpl(WeaponData.SWORD);
				// exercise
				final int result = weapon.getDamage();
				// verify
				assertEquals(10, result);
		}
}