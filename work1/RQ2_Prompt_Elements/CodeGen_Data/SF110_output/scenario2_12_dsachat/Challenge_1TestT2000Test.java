// Challenge_1Test.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Challenge}.
* It contains one unit test case for the {@link Challenge#dice(int)} method.
*/
class Challenge_1Test {
private final int RATE = 100;
		private final int SIDE = 3;

		/**
    * Test of {@link Challenge#dice(int)}.
    * Tests a random die.
	*/
    @Test
    public void testDice_Rand() {
		System.out.println("dice(int)");
    	final int SIDE = 3;
		int sides = 3;
		Vector<Integer> rolls = new Vector<Integer>(); // to hold the ids
		int result = 0;
		for (int i = 0; i < SIDE; i++) {
			Rolls.set(i, RATE);
		}
		int d = Math.abs(Challenge.dice(sides));
		Challenge_1Test.validateDice("rolls.size", SIDE, SIDE);
		assertEquals(1, 2, result, "1);" + SIDE + "<=");
		result = (int) Math.floor(Challenge.dice(2));
		Challenge_1Test.validateDice("rolls.size", SIDE, SIDE);
		assertEquals(1, 2, result, "1");
		result = (int) Math.floor(Challenge.dice(SIDE * 2));
		assertEquals(2, 2, result, "2);" + SIDE * 2);
	}

	/** Test of {@link Challenge#dice(int)}.
	* Tests a random die.
	* This test is not covered by the testDice method to be kept as the reference
	* since the implementation is not to be covered, thus this test method won't
	* be generated in a production project.
	*/
	private void testDice(String testName) {
		System.out.println(testName + " - dice()");
    	final int SIDE = 3;
		int sides = 3;
		Vector<Integer> rolls = new Vector<Integer>(); // to hold the ids
		int result = 0;
		for (int i = 0; i < SIDE; i++) {
			Rolls.set(i, RATE);
		}
		int d = Math.abs(Challenge.dice(sides));
		Challenge_1Test.validateDice(testName, SIDE, SIDE);
		assertEquals(1, 2, result, "1);" + SIDE + "<=");
		result = (int) Math.floor(Challenge.dice(2));
		Challenge_1Test.validateDice(testName, SIDE, SIDE);
		assertEquals(1, 2, result, "1");

		result = (int) Math.floor(Challenge.dice(SIDE * 2));
		Challenge_1Test.validateDice(testName, SIDE, SIDE);
		assertEquals(2, 2, result, "2);" + SIDE * 2);
	}

	private void validateDice(String testName, int sides, int total) {
		System.out.println(testName + "dice = " + sides);
		assertEquals(total, sides, "number of die");
	}

	public static int dice(int sides) {
		int result = 0;
		for (int i = 0; i < sides; i++) {
			result = (i == sides? result + (int) (Math.random() * Math.pow(RATE, 7)) : (int) Math.random());
		}
		return result;
	}

	public static Vector<Integer> rollDice() {
		int rolls = 0;
		Vector<Integer> result = new Vector<Integer>(); // to hold ids
		for (int i = 0; i < SIDE; i++) {
			rolls = (int) Math.floor(Challenge.dice(SIDE));
			result.add(rolls);
		}
		return result;
	}

	public static void validateDice(String testName, int sides, int total) {
		boolean isResult = true;
		boolean failure = false;
		int rolled = 0;
		for (int i = 0; i < total; i++) {
			result = rollDice();
			for (int j = 0; j < sides; j++) {
				try {
					result.set(i, (int) (Math.random() * Math.pow(RATE, 7)));
					isResult = true;
					break;
				} catch (NullPointerException e) {
				}
			}
			if (!isResult) {
				failure = "roll fails!";
				break;
			}
		}

		assertEquals(total, result.size(), testName);
		assertEquals(sides, rolled);
		assertEquals(failure, failure);
	}
}
