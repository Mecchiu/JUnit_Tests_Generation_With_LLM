// BattleplanTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplan}.
* It contains ten unit test cases for the {@link Battleplan#numberOfRounds()} method.
*/
class BattleplanTest {

		@Test
		void testNumberOfRounds() {
				// TODO: implement test
		}
}

// Round.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * A round of a battle.
 *
 * @author daniel
 */
public class Round {

    /**
     * @return the number of steps this round has
     */
    public int numberOfSteps() {
        return steps.size();
    }
}

// RoundTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Round}.
* It contains ten unit test cases for the {@link Round#numberOfSteps()} method.
*/
class RoundTest {
		
		@Test
		void testNumberOfSteps() {
				// TODO: implement test
		}
}

// Step.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * A step of a round.
 *
 * @author daniel
 */
public class Step {

    /**
     * @return the number of actions this step has
     */
    public int numberOfActions() {
        return actions.size();
    }
}

// StepTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Step}.
* It contains ten unit test cases for the {@link Step#numberOfActions()} method.
*/
class StepTest {
		
		@Test
		void testNumberOfActions() {
				// TODO: implement test
		}
}

// Action.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * An action of a step.
 *
 * @author daniel
 */
public class Action {

    /**
     * @return the number of effects this action has
     */
    public int numberOfEffects() {
        return effects.size();
    }
}

// ActionTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Action}.
* It contains ten unit test cases for the {@link Action#numberOfEffects()} method.
*/
class ActionTest {
		
		@Test
		void testNumberOfEffects() {
				// TODO: implement test
		}
}

// Effect.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * An effect of an action.
 *
 * @author daniel
 */
public class Effect {

    /**
     * @return the number of targets this effect has
     */
    public int numberOfTargets() {
        return targets.size();
    }
}

// EffectTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Effect}.
* It contains ten unit test cases for the {@link Effect#numberOfTargets()} method.
*/
class EffectTest {
		
		@Test
		void testNumberOfTargets() {
				// TODO: implement test
		}
}

// Target.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * A target of an effect.
 *
 * @author daniel
 */
public class Target {

    /**
     * @return the number of effects this target has
     */
    public int numberOfEffects() {
        return effects.size();
    }
}

// TargetTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Target}.
* It contains ten unit test cases for the {@link Target#numberOfEffects()} method.
*/
class TargetTest {
		
		@Test
		void testNumberOfEffects() {
				// TODO: implement test
		}
}