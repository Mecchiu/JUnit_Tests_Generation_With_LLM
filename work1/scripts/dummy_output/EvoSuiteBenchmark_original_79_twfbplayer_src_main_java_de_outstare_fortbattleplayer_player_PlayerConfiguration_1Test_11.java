// PlayerConfiguration_1Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfiguration_1Test {
		class A{};

    @Test
    void test() {

        try (PlayerConfiguration cl = new PlayerConfiguration()) {
            for (int i = 0; i < 5; ++i) {
                cl.createPlayer(A.class);
            }

            final Set<A> expected = new HashSet<>();
            final Lock mutex = new ReentrantLock();

            assertFalse(mutable.hasLastUpdate());
            assertNull(mutable.getLastUpdate());

            mutex.lock();
            try {
                expected.add(createPlayer(A.class));
            } catch (IllegalStateException ise) {
                mutex.unlock();
                throw ise;
            } finally {
                mutex.unlock();
            }
            
            assertEquals(expected, new HashSet<>(cl.createPlayer(A.class)));

            expected.clear();
            mutex.lock();
            try {
                expected.add(createPlayer(A.class));
            } catch (IllegalStateException ise) {
                mutex.unlock();
                throw ise;
            } finally {
                mutex.unlock();
            }
            expected.clear();
        }
    }

    @Test
    void createPlayerThrowsIllegalStateExceptionWithoutParameters() {
        try (PlayerConfiguration cl = new PlayerConfiguration()) {
            cl.createPlayer(A.class);
            cl.createPlayer(A.class);
        }

        assertThrows(IllegalStateException.class, ()-> {
            cl.createPlayer(A.class);
        });
    }
	/**
	* @return
	* @throws IllegalStateException
	*/
    static A createPlayer(Class<?> clazz) throws IllegalStateException {
        return (A)PlayerConfiguration.class.cast(Clipboard.get(clazz));
    }

	/**
	 * @return
	*/
    @Test
    @Configuration(showMoveTargets = true)
    public void createPlayerTest() {

        final Lock mutex = new ReentrantLock();
        assertThrows(IllegalStateException.class, ()-> {
            new PlayerConfiguration();
        });
}
}