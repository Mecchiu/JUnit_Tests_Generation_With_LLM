```java
package de.outstare.fortbattleplayer.player;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BattleplayerTest {

    @Test
    void testNumberOfRoundsWithEmptyPlan() {
        Battleplan emptyPlan = new Battleplan();
        Battleplayer player = new Battleplayer(emptyPlan);
        assertEquals(0, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithSingleRound() {
        Battleplan singleRoundPlan = new Battleplan();
        singleRoundPlan.addRound(1);
        Battleplayer player = new Battleplayer(singleRoundPlan);
        assertEquals(1, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithMultipleRounds() {
        Battleplan multipleRoundsPlan = new Battleplan();
        multipleRoundsPlan.addRound(1);
        multipleRoundsPlan.addRound(2);
        multipleRoundsPlan.addRound(3);
        Battleplayer player = new Battleplayer(multipleRoundsPlan);
        assertEquals(3, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithNoRounds() {
        Battleplan noRoundsPlan = new Battleplan();
        Battleplayer player = new Battleplayer(noRoundsPlan);
        assertEquals(0, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithNullPlan() {
        Battleplayer player = new Battleplayer(null);
        assertEquals(0, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithEmptyPlanAndConfig() {
        Battleplan emptyPlan = new Battleplan();
        PlayerConfiguration config = new PlayerConfiguration();
        Battleplayer player = new Battleplayer(emptyPlan, config);
        assertEquals(0, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithSingleRoundAndConfig() {
        Battleplan singleRoundPlan = new Battleplan();
        singleRoundPlan.addRound(1);
        PlayerConfiguration config = new PlayerConfiguration();
        Battleplayer player = new Battleplayer(singleRoundPlan, config);
        assertEquals(1, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithMultipleRoundsAndConfig() {
        Battleplan multipleRoundsPlan = new Battleplan();
        multipleRoundsPlan.addRound(1);
        multipleRoundsPlan.addRound(2);
        multipleRoundsPlan.addRound(3);
        PlayerConfiguration config = new PlayerConfiguration();
        Battleplayer player = new Battleplayer(multipleRoundsPlan, config);
        assertEquals(3, player.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithNoRoundsAndConfig() {
        Battleplan noRoundsPlan = new Battleplan();
        PlayerConfiguration config = new PlayerConfiguration();
        Battleplayer player = new Battleplayer(noRoundsPlan, config);
        assertEquals(0, player.numberOfRounds());
    }
}
```
