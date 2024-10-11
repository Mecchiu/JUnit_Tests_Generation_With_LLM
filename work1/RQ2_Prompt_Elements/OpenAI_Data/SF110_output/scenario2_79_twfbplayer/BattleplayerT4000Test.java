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
* It contains ten unit test cases for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {

		@Test
		void testNumberOfRounds() {
				// TODO: implement test
		}
}

// Combatant.java
package de.outstare.fortbattleplayer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link Combatant} is a participant of a battle.
 *
 * @author daniel
 */
public class Combatant {

    /**
     * @return the name of this combatant
     */
    public String getName() {
        return name;
    }

    /**
     * @return the health points of this combatant
     */
    public int getHealth() {
        return health;
    }

    /**
     * @return the attack points of this combatant
     */
    public int getAttack() {
        return attack;
    }

    /**
     * @return the defense points of this combatant
     */
    public int getDefense() {
        return defense;
    }

    /**
     * @return the speed of this combatant
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @return the number of rounds this combatant can fight
     */
    public int getRounds() {
        return rounds;
    }

    /**
     * @return the number of rounds this combatant has already fought
     */
    public int getRoundsFought() {
        return roundsFought;
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public int getRoundsLeft() {
        return rounds - roundsFought;
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isDead() {
        return !isAlive();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isExhausted() {
        return roundsFought >= rounds;
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotExhausted() {
        return !isExhausted();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReady() {
        return isAlive() && isNotExhausted();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReady() {
        return !isReady();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight() {
        return isReady() && isNotExhausted();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight() {
        return !isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent) {
        return isReadyToFight() && opponent.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent) {
        return !isReadyToFight(opponent);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final List<Combatant> opponents) {
        return isReadyToFight() && opponents.stream().allMatch(Combatant::isReadyToFight);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final List<Combatant> opponents) {
        return !isReadyToFight(opponents);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Set<Combatant> opponents) {
        return isReadyToFight() && opponents.stream().allMatch(Combatant::isReadyToFight);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Set<Combatant> opponents) {
        return !isReadyToFight(opponents);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant... opponents) {
        return isReadyToFight() && opponents.length > 0 && isReadyToFight(new ArrayList<>(opponents.length));
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant... opponents) {
        return !isReadyToFight(opponents);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2) {
        return !isReadyToFight(opponent1, opponent2);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3) {
        return !isReadyToFight(opponent1, opponent2, opponent3);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight() && opponent4.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4) {
        return !isReadyToFight(opponent1, opponent2, opponent3, opponent4);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight() && opponent4.isReadyToFight() && opponent5.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5) {
        return !isReadyToFight(opponent1, opponent2, opponent3, opponent4, opponent5);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight() && opponent4.isReadyToFight() && opponent5.isReadyToFight() && opponent6.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6) {
        return !isReadyToFight(opponent1, opponent2, opponent3, opponent4, opponent5, opponent6);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight() && opponent4.isReadyToFight() && opponent5.isReadyToFight() && opponent6.isReadyToFight() && opponent7.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7) {
        return !isReadyToFight(opponent1, opponent2, opponent3, opponent4, opponent5, opponent6, opponent7);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight() && opponent4.isReadyToFight() && opponent5.isReadyToFight() && opponent6.isReadyToFight() && opponent7.isReadyToFight() && opponent8.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8) {
        return !isReadyToFight(opponent1, opponent2, opponent3, opponent4, opponent5, opponent6, opponent7, opponent8);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8, final Combatant opponent9) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight() && opponent4.isReadyToFight() && opponent5.isReadyToFight() && opponent6.isReadyToFight() && opponent7.isReadyToFight() && opponent8.isReadyToFight() && opponent9.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8, final Combatant opponent9) {
        return !isReadyToFight(opponent1, opponent2, opponent3, opponent4, opponent5, opponent6, opponent7, opponent8, opponent9);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8, final Combatant opponent9, final Combatant opponent10) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight() && opponent4.isReadyToFight() && opponent5.isReadyToFight() && opponent6.isReadyToFight() && opponent7.isReadyToFight() && opponent8.isReadyToFight() && opponent9.isReadyToFight() && opponent10.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8, final Combatant opponent9, final Combatant opponent10) {
        return !isReadyToFight(opponent1, opponent2, opponent3, opponent4, opponent5, opponent6, opponent7, opponent8, opponent9, opponent10);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8, final Combatant opponent9, final Combatant opponent10, final Combatant opponent11) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight() && opponent4.isReadyToFight() && opponent5.isReadyToFight() && opponent6.isReadyToFight() && opponent7.isReadyToFight() && opponent8.isReadyToFight() && opponent9.isReadyToFight() && opponent10.isReadyToFight() && opponent11.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8, final Combatant opponent9, final Combatant opponent10, final Combatant opponent11) {
        return !isReadyToFight(opponent1, opponent2, opponent3, opponent4, opponent5, opponent6, opponent7, opponent8, opponent9, opponent10, opponent11);
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8, final Combatant opponent9, final Combatant opponent10, final Combatant opponent11, final Combatant opponent12) {
        return isReadyToFight() && opponent1.isReadyToFight() && opponent2.isReadyToFight() && opponent3.isReadyToFight() && opponent4.isReadyToFight() && opponent5.isReadyToFight() && opponent6.isReadyToFight() && opponent7.isReadyToFight() && opponent8.isReadyToFight() && opponent9.isReadyToFight() && opponent10.isReadyToFight() && opponent11.isReadyToFight() && opponent12.isReadyToFight();
    }

    /**
     * @return the number of rounds this combatant can still fight
     */
    public boolean isNotReadyToFight(final Combatant opponent1, final Combatant opponent2, final Combatant opponent3, final Combatant opponent4, final Combatant opponent5, final Combatant opponent6, final Combatant opponent7, final Combatant opponent8, final Combatant opponent9, final Combatant opponent10, final Combatant opponent11, final Combatant opponent12) {
       