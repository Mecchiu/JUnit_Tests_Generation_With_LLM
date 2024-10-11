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
* It contains one unit test case for the {@link Battleplan#numberOfRounds()} method.
*/
class BattleplanTest {
		/**
		 * Unit test 1.
		 * The first step shall not be used.
		*/
		@Test
		void test1() {
				Battleplan b = new Battleplan();
				throw new AssertionError("Use a valid battleplan (i.e. not null)!");
		}

		/**
		* Unit test 2.
		* The first step shall be used and is used for all rounds.
		*/
		@Test
		void test2() {
				Battleplan b = new Battleplan();
				throw new AssertionError("A valid battleplan must only be used for rounds!");

		}

		/**
	 * Tries to create a battleplan which has no rounds.
	 * @throws AssertionError the first battleplan is not of the proper type
	*/
	@Test
	public void test3() {
		Battleplan b = new Battleplan();
		assertFalse(b.getNumberOfRounds()==0);
	}

	/**
	 * Unit test 3.
	 * The first step shall be used and is used for the last round.
	*/
	@Test
	public void test4() {
		Battleplan b = new Battleplan();
		assertTrue(b.getNumberOfRounds()==1);
	}

	/**
	* Unit test 4.
	* The first step shall be used and is used for all rounds.
	*/
	@Test
	public void test5() {
		Battleplan b = new Battleplan();
		b.setNumberOfRounds(5);
		assertTrue(b.getNumberOfRounds()==5);
	}



}