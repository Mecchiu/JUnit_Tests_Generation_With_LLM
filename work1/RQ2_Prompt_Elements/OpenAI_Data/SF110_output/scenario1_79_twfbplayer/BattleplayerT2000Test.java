// BattleplayerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplayer}.
* It contains ten unit test cases for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {

		@Test
		void testNumberOfRounds() {
				// TODO: implement test
		}
}

// Combatant.java
package de.outstare.fortbattleplayer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link Combatant} is a participant of a battle.
 *
 * @author daniel
 */
public class Combatant {
}

// Plan.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;

/**
 * A {@link Plan} is a strategy for a battle.
 *
 * @author daniel
 */
public class Plan {
    public int numberOfRounds() {
        return 0;
    }
}

// PlanTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Plan}.
* It contains ten unit test cases for the {@link Plan#numberOfRounds()} method.
*/
class PlanTest {
		
		@Test
		void testNumberOfRounds() {
				// TODO: implement test
		}
}