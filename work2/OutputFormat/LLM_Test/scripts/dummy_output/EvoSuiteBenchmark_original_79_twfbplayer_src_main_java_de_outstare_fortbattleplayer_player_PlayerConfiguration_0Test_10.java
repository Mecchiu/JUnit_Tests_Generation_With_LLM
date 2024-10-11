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
		
    private static final Lock a = new ReentrantLock(true);
    private static final Lock b = new ReentrantLock(true);

    /**
     * This is a unit test case for the method {@link #copy()}
     */
    @Test
    void testCopy() {
        Configuration a = new Configuration(new HashSet());
        Configuration b = a.clone();

        assertEquals(a, b);

        Configuration j = a;
        Configuration j2 = b;
        assertEquals(j, j2);
    }

    /**
     * this test unit test is not very trivial. Each field will be tested
     * only once. One of the fields may be locked:
     *
     * a
     *
     * b
     *
     * The following test cases for the fields a,b are not so trivial because
     * they are not used by the unit test framework.
     */
	@Test
    void testRandomAccess() {
        String s = "";
        for (int i = 0; i < 1000; i++) {
                s = s + "random-access-test-" + i;
                for (ReentrantLock a : new ReentrantLock[]{a = createReentrantLock()}) {
                        try {
                                a.newLock().newLock();
                        } catch (LockObtainException e) {}
                        a.newLock().unlock();
                        a.lock();
                        a.newLock().unlock();
                        a.newLock().reentrantLock();
                }
                a.newLock().newLock();
        }
        System.out.println(s);
    }
	
	@Test
    void testEmpty() {
        new HashSet();
    }
}