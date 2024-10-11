// BattleplayerTest.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
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
private static final transient Logger LOG = Logger.getLogger(BattleplayerTest.class.getName());

		/**
		 * Test method for {@link Battleplayer#numberOfRounds()}.
		 */
		@Test
		public void testNumberOfRounds() {
				final Battleplan plan = new Battleplan();
				final Battleplayer player = new Battleplayer(plan);
				assertEquals(0, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(1, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(2, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(3, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(4, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(5, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(6, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(7, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(8, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(9, player.numberOfRounds());
				plan.addRound(new Round(new HashSet<Combatant>()));
				assertEquals(10, player.numberOfRounds());
		}
}

// Player.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.List;

/**
 * A Player controls the battle. It is a puppet player controlling the behavior
 * of the {@link Combatant}s.
 *
 * @author daniel
 */
public interface Player {

    /**
     * let the battle begin! The whole battle is done by executing the
     * {@link Battleplan}.
     */
    public void play();

    /**
     * blocks until current round has ended
     *
     * @param round
     */
    public void gotoRound(int round);

    /**
     * stop playing
     */
    public void stop();

    /**
     * @return the number of rounds this player shows
     */
    public int numberOfRounds();

    /**
     * @return the round numbers of this player
     */
    public List<Integer> getRoundNumbers();
}

// PlayerConfiguration.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * PlayerConfiguration controls some aspects of the behavior of the player.
 *
 * @author daniel
 */
public class PlayerConfiguration {

    /**
     * the delay between two rounds in milliseconds
     */
    public int ROUND_DELAY = 1000;

    private final Lock lock = new ReentrantLock();

    /**
     * @return the lock
     */
    public Lock getLock() {
        return lock;
    }

    /**
     * @see java.util.concurrent.locks.Lock#lock()
     */
    public void lock() {
        lock.lock();
    }

    /**
     * @see java.util.concurrent.locks.Lock#unlock()
     */
    public void unlock() {
        lock.unlock();
    }
}

// Round.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.HashSet;
import java.util.Set;

import de.outstare.fortbattleplayer.model.Combatant;

/**
 * A Round is a set of {@link Combatant}s.
 *
 * @author daniel
 */
public class Round {

    private final Set<Combatant> combatants;

    /**
     * @param combatants
     */
    public Round(final Set<Combatant> combatants) {
        this.combatants = new HashSet<Combatant>(combatants);
    }

    /**
     * @return the combatants
     */
    public Set<Combatant> getCombatants() {
        return combatants;
    }
}

// RoundTest.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge,