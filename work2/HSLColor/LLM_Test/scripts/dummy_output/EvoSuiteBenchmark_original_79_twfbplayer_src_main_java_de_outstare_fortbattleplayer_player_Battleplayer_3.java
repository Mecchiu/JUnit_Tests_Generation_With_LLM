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
* It contains one unit test case for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {
		/**
     * This method test checks if {@link Battleplayer#numberOfRounds()}
     * returns the same number of rounds, when called several times with different
     * values. It is called only in one test method.
     *
     * @throws Exception
     */
    @Test
    void numberOfRounds() throws Exception {
        assertEquals((6*6) + 12*12 + 24*24, numberOfRounds());
    }
    
    static int numberOfRounds() {
			Logger.getLogger("").finest("numberOfRounds()");
		
		List<Combatant> battleswap = new ArrayList<>();
		battleswap.add(new Combatant(0, "a", "b", "c"));
		battleswap.add(new Combatant(2, "a", "b", "c"));
		battleswap.add(new Combatant(4, "a", "b", "c"));
		battleswap.add(new Combatant(6, "a", "b", "c"));
		battleswap.add(new Combatant(8, "a", "b", "c"));
		battleswap.add(new Combatant(10, "a", "b", "c"));
		battleswap.add(new Combatant(12, "a", "b", "c"));
		battleswap.add(new Combatant(14, "a", "b", "c"));
		battleswap.add(new Combatant(16, "a", "b", "c"));
		battleswap.add(new Combatant(18, "a", "b", "c"));
		battleswap.add(new Combatant(20, "a", "b", "c"));
		battleswap.add(new Combatant(21, "a", "b", "c"));
		Combatant battlestoosh = battleswap.get(20);
		Combatant battlestoosh2 = battleswap.get(21);
		Combatant battlestoosh3 = battleswap.get(22);
		Combatant battlestooshn = battleswap.get(20);
		Combatant battlestotosh = battleswap.get(21);
		Combatant battlestotosh2 = battleswap.get(12);
		Combatant battlestotosh3 = battleswap.get(16);
		Combatant battlestotoshn = battleswap.get(20);
		Combatant battlestotoshn2 = battleswap.get(12);
		Combatant battlestotoshn3 = battleswap.get(16);
		
		System.out.println(1 + 1 + 11 + 11 + 5 + 5 + 20 + 20 + 10 + 10 + 5 + 5 + 10 + 20 + 10 + 5 + 5 + 10 + 20 + 10 + 5 + 5 + 10 + 20 + 10 + 5 + 5);
		
		int round = 0;
		while (round++ < 21) {
			Combatant battlestotooshn2 = battlestotoshn;
			if (round % 1000 == 0) {
				battlesttoshn = new Combatant(1, "a", "b", "c");
				round = 1 + 1 + 11 + 11 + 5 + 5 + 20 + 20 + 10 + 10 + 5 + 5 + 10 + 20 + 10 + 5 + 5 + 10 + 20 + 10 + 5 + 5;
			}
			if (round % 5 == 0) {
				throw new RuntimeException("Rounding over, we mustnt have to go all the way to 4th round");
			}
			
			round++;
			if (round % 10 == 0) {
				tallyRound(battlestoosh.toString()+" "+battlestoosh2.toString()+" "+battlestoosh3.toString()+" "+battlestooshn2.toString()+" "+battlestoosh3.toString());
			}
		}
		assertEquals(1 + 1 + 11 + 11 + 5 + 5 + 20 + 20 + 10 + 10 + 5 + 5 + 10 + 20 + 10 + 5 + 5 + 10 + 20 + 10 + 5 + 5, numberOfRounds());
		final char[] words = new char[6];
		for (int i=0; i<6; i++) words[i] = 'a';
		int counter = 0;
		for (Combatant battlestogoosh : battleswap) {
			if (battlestogoosh.getBattleCharacter()!= null) {
				words[counter] = battlestogoosh.getBattleCharacter().toUpperCase();
				counter++;
			}
		}
		final StringBuilder sb = new StringBuilder();
		Integer charIndex = null;
		
		while (true) {
			charIndex = counter==1? 3 : 4;
			sb.append(charIndex);
			for (int j=0; j<6; j++) {
				if (counter==j) {
					sb.append(words[charIndex]);
				}
				else {
					sb.append("_");
					counter++;
				}
			}
			sb.append('\n');
			counter--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
		tallyRound(s.toString()+" "+sb.toString());
		
	}
	
	static void tallyRound(String str) {
			Logger.getLogger("").finest("tallyRound" + str);
		
		System.out.println(battleswap.get(34).toString().toUpperCase());
	}
	
	/**
     * List of all combatants of this battleplayer.
     */
    private final List<Combatant> battlestoosh = new ArrayList<>();
    /*
     * List of all combatants of this battleplayer.
     */
    @SuppressWarnings("unused")
	public final List<Combatant> getbattlestoosh() {
		return battlestoosh;
	}
}