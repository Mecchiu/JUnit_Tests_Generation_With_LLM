// PlayerConfiguration_2Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {
		/**
		* The {@link PlayerConfiguration#showShootline()} of this object.
		*/
		Set<Integer> shownShootline;
		/**
		* The number of lines that the {@link PlayerConfiguration#showShootline} should display.
		*/
		int showShootlineLineNumber;

		@Test
		void showShootline() {
				shownShootline = new HashSet<>();
				shownShootline.add(Integer.valueOf(0));
				shownShootline.add(Integer.valueOf(4));
				shownShootline.add(Integer.valueOf(2));
				shownShootline.add(Integer.valueOf(1));
				shownShootline.add(Integer.valueOf(5));
				assertTrue("Test value for {@link PlayerConfiguration#showShootline()} should be <em>true</em>.",shownShootline.contains(Boolean.TRUE));
		}

		@Test
		void showShootlineLineNumber() {
				shownShootlineLineNumber = 3;
				assertEquals("Test value for {@link PlayerConfiguration#showShootlineLineNumber()} should be 1.",shownShootlineLineNumber, 1);
		}
}