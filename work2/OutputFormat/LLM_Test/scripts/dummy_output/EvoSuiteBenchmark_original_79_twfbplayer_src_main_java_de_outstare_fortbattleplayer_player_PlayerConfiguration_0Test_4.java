// PlayerConfiguration_0Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains one unit test case for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_0Test {
		
        private final Lock lock = new ReentrantLock();
        private final WorkerSet wset = new WorkerSet();
        private final HashSet<PlayerTest> tests = new HashSet<>();
        private final Set<PlayerTunable> tunables = new HashSet<>();
        private final Configuration configuration = new Configuration();
        
        /**
         * Creates a {@link PlayerConfiguration_0Test} with the specified tunables.
         */
        public PlayerConfiguration_0Test(Set<PlayerTunable> tunables) {
                this.tunables.addAll(tunables);
        }

        /**
         * Creates a {@link PlayerConfiguration_0Test} with the specified workers.
         */
        public PlayerConfiguration_0Test(Set<PlayerTest> tests) {
                this.tests.addAll(tests);
        }

}