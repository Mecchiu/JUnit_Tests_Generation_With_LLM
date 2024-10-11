// CarRaceCollisionTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {

	@Test
	void testCarRaceCollision() {
		assertEquals(4, CarRaceCollision.carRaceCollision(2));
		assertEquals(9, CarRaceCollision.carRaceCollision(3));
		assertEquals(16, CarRaceCollision.carRaceCollision(4));
		assertEquals(25, CarRaceCollision.carRaceCollision(5));
		assertEquals(36, CarRaceCollision.carRaceCollision(6));
		assertEquals(49, CarRaceCollision.carRaceCollision(7));
		assertEquals(64, CarRaceCollision.carRaceCollision(8));
		assertEquals(81, CarRaceCollision.carRaceCollision(9));
		assertEquals(100, CarRaceCollision.carRaceCollision(10));
		assertEquals(121, CarRaceCollision.carRaceCollision(11));
	}
}

// CarRaceCollision.java
package refactored;

class CarRaceCollision {

    /**
     * * Imagine a road that's a perfectly straight infinitely long line.
     * n cars are driving left to right;  simultaneously, a different set of n cars
     * are driving right to left.   The two sets of cars start out being very far from
     * each other.  All cars move in the same speed.  Two cars are said to collide
     * when a car that's moving left to right hits a car that's moving right to left.
     * However, the cars are infinitely sturdy and strong; as a result, they continue moving
     * in their trajectory as if they did not collide.
     * This function outputs the number of such collisions.
     *
     * > carRaceCollision(2)
     * 4
     * > carRaceCollision(3)
     * 9
     * > carRaceCollision(4)
     * 16
     * > carRaceCollision(8)
     * 64
     * > carRaceCollision(10)
     * 100
     */
    public static int carRaceCollision(int n) {
        return n * n;
    }
}

// CarRaceCollisionTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {
		
	@Test
	void testCarRaceCollision() {
		assertEquals(4, CarRaceCollision.carRaceCollision(2));
		assertEquals(9, CarRaceCollision.carRaceCollision(3));
		assertEquals(16, CarRaceCollision.carRaceCollision(4));
		assertEquals(25, CarRaceCollision.carRaceCollision(5));
		assertEquals(36, CarRaceCollision.carRaceCollision(6));
		assertEquals(49, CarRaceCollision.carRaceCollision(7));
		assertEquals(64, CarRaceCollision.carRaceCollision(8));
		assertEquals(81, CarRaceCollision.carRaceCollision(9));
		assertEquals(100, CarRaceCollision.carRaceCollision(10));
		assertEquals(121, CarRaceCollision.carRaceCollision(11));
	}
}