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
* It contains ten unit test cases for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatantTest {

		/**
		 * Test case for {@link SimpleCombatant#_getMaxLP()}
		 *
		 * @author daniel
		 */
		@Test
		public void test_getMaxLP() {
				// setup
				final SimpleCombatant combatant = new SimpleCombatant();
				// execute
				final int result = combatant._getMaxLP();
				// verify
				assertEquals(100, result);
		}
}

// SimpleCombatant.java
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
 * A Combatant with basic attributes (position, health)
 *
 * @author daniel
 */
public class SimpleCombatant implements Combatant {

    /**
     * internal method for graphical display
     *
     * @return the maximal health
     */
    public int _getMaxLP() {
        return 100;
    }
}

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
* It contains ten unit test cases for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatantTest {
		
		/**
		 * Test case for {@link SimpleCombatant#_getMaxLP()}
		 *
		 * @author daniel
		 */
		@Test
		public void test_getMaxLP() {
				// setup
				final SimpleCombatant combatant = new SimpleCombatant();
				// execute
				final int result = combatant._getMaxLP();
				// verify
				assertEquals(100, result);
		}
}

// SimpleCombatant.java
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
 * A Combatant with basic attributes (position, health)
 *
 * @author daniel
 */
public class SimpleCombatant implements Combatant {

    /**
     * internal method for graphical display
     *
     * @return the maximal health
     */
    public int _getMaxLP() {
        return 100;
    }
}

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
* It contains ten unit test cases for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatantTest {
		
		/**
		 * Test case for {@link SimpleCombatant#_getMaxLP()}
		 *
		 * @author daniel
		 */
		@Test
		public void test_getMaxLP() {
				// setup
				final SimpleCombatant combatant = new SimpleCombatant();
				// execute
				final int result = combatant._getMaxLP();
				// verify
				assertEquals(100, result);
		}
}

// SimpleCombatant.java
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
 * A Combatant with basic attributes (position, health)
 *
 * @author daniel
 */
public class SimpleCombatant implements Combatant {

    /**
     * internal method for graphical display
     *
     * @return the maximal health
     */
    public int _getMaxLP() {
        return 100;
    }
}

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
import de.out