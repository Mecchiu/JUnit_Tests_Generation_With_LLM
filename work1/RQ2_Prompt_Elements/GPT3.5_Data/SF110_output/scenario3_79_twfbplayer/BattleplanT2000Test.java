// Here's an example implementation of the Battleplan class and its test class:

// Battleplan.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.List;

/**
 * A plan which determines each step of the battle. A battle is divided into {@link Round}s.
 */
public class Battleplan {

    private final List<Round> rounds;

    public Battleplan(final List<Round> rounds) {
        this.rounds = rounds;
    }

    /**
     * @return the number of rounds this plan has
     */
    public int numberOfRounds() {
        return rounds.size();
    }
}

// BattleplanTest.java
package de.outstare.fortbattleplayer.player;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link Battleplan}.
 * It contains ten unit test cases for the {@link Battleplan#numberOfRounds()} method.
 */
class BattleplanTest {

    @Test
    void testNumberOfRoundsWithEmptyPlan() {
        final Battleplan plan = new Battleplan(new ArrayList<>());
        assertEquals(0, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithOneRound() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(1, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithTwoRounds() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(2, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithThreeRounds() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(3, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithFourRounds() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(4, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithFiveRounds() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(5, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithSixRounds() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(6, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithSevenRounds() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(7, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithEightRounds() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(8, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithNineRounds() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(9, plan.numberOfRounds());
    }

    @Test
    void testNumberOfRoundsWithTenRounds() {
        final List<Round> rounds = new ArrayList<>();
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        rounds.add(new Round());
        final Battleplan plan = new Battleplan(rounds);
        assertEquals(10, plan.numberOfRounds());
    }
}