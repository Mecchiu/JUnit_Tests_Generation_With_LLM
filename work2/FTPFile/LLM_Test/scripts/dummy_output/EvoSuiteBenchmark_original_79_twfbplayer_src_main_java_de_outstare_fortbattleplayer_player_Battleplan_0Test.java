java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Battleplan_0Test {

    @Test
    void testNumberOfRounds_EmptyPlan() {
        Collection<Round> rounds = new ArrayList<>();
        Battleplan plan = new Battleplan(rounds);
        assertEquals(0, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRounds_SingleRound() {
        Collection<Round> rounds = new ArrayList<>();
        rounds.add(new Round(1));
        Battleplan plan = new Battleplan(rounds);
        assertEquals(1, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRounds_MultipleRounds() {
        Collection<Round> rounds = new ArrayList<>();
        rounds.add(new Round(1));
        rounds.add(new Round(2));
        rounds.add(new Round(3));
        Battleplan plan = new Battleplan(rounds);
        assertEquals(3, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRounds_DuplicateRounds() {
        Collection<Round> rounds = new ArrayList<>();
        rounds.add(new Round(1));
        rounds.add(new Round(1));
        rounds.add(new Round(2));
        Battleplan plan = new Battleplan(rounds);
        assertEquals(2, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRounds_NullRounds() {
        Collection<Round> rounds = null;
        Battleplan plan = new Battleplan(rounds);
        assertEquals(0, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRounds_EmptyRoundList() {
        Collection<Round> rounds = new ArrayList<>();
        Battleplan plan = new Battleplan(rounds);
        assertEquals(0, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRounds_LargeNumberOfRounds() {
        Collection<Round> rounds = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            rounds.add(new Round(i));
        }
        Battleplan plan = new Battleplan(rounds);
        assertEquals(1000, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRounds_NegativeRoundNumber() {
        Collection<Round> rounds = new ArrayList<>();
        rounds.add(new Round(-1));
        Battleplan plan = new Battleplan(rounds);
        assertEquals(1, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRounds_RoundNumberZero() {
        Collection<Round> rounds = new ArrayList<>();
        rounds.add(new Round(0));
        Battleplan plan = new Battleplan(rounds);
        assertEquals(1, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRounds_MaxIntegerRoundNumber() {
        Collection<Round> rounds = new ArrayList<>();
        rounds.add(new Round(Integer.MAX_VALUE));
        Battleplan plan = new Battleplan(rounds);
        assertEquals(1, plan.numberOfRounds());
    }
}
