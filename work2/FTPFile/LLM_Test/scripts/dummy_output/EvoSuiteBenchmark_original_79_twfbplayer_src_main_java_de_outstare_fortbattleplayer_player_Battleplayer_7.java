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
     * Test the result of the {@link Battleplayer#numberOfRounds()} method.
     */
    @Test
    void testNumberOfRounds() {
        try {
            Battleplayer player = new Battleplayer();
            assertTrue(player.numberOfRounds() == 0);
            for (int i = 0; i < 100; i++) {
                List<Combatant> enemies = new ArrayList<Combatant>();
                enemies.addAll(player.getEnemies());
                Set<Combatant> enemiesOnThisRound = new HashSet<Combatant>();
                enemiesOnThisRound.addAll(player.getEnemiesOnThisRound());
                int rounds = player.getRounds(enemies, enemiesOnThisRound, 0,
                        true);
                assertTrue((rounds + 1) == player.numberOfRounds());
            }
            System.out.println(
				"Rounds: " + player.numberOfRounds() + ", rounds: "
                        + player.getRounds(player.getEnemies(), player.getEnemiesOnThisRound(), 0, false)
                        + ", rounds on-this-round: "
                        + player.getRoundsOnThisRound(player.getEnemies(), player.getEnemiesOnThisRound()));
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }
    // BattleplayerTest.java
}