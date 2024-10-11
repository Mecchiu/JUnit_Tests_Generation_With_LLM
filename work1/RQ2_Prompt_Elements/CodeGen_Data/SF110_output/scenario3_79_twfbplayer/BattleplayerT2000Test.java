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

    private static final Logger logger = new Logger("Battleplayer");
	
	private final Battleplayer player;

	private final String description;

	/**
	 * @param numberOfRounds rounds this player shows
	 * 					 
	 * @param description description of the battleplayer. 
	 */
	public BattleplayerTest (int numberOfRounds, String description) {
		player = new Battleplayer();
		player.numberOfRounds = numberOfRounds;
		player.description = description;
	}
	
	/**
	 * Method for checking results of the battleplayer from the {@link Battleplayer#numberOfRounds()} method.
	 * 
	 * @param object the battle player
	 */
	public void testNumberOfRoundsResults (Battleplayer object) {
		assertEquals (object.numberOfRounds(), numberOfRounds());
	}
			
	/**
	 * Method for checking all values of the battleplayer from the {@link Battleplayer#numberOfRounds()} method.
	 * 
	 * @param object the battle player
	 */
	public void testBattleplayer (Battleplayer object) {
		logger.info(String.format("%s is battleplayer with numberOfRound: %d and description: %s", description, object.numberOfRounds(), description));
		assertTrue (object.numberOfRounds() > 0);
		assertTrue (object.description.equals (description));
		Set<Combatant> combatants = new HashSet<Combatant>();
		combatants.addAll (object.getCombatants());
		Combatant combatantTest = new Combatant();
		combatantTest.combatant = null;
		for (Combatant battleControllor : combatants) {
			this.testCombatant (combatantTest, battleControllor);
		}
		String battleResult = player.battle(combatantTest);
		assertFalse (battleResult.equals ("battle result: \"\""));
		logger.info(battleResult);
		assertTrue (battleResult.endsWith("battle result: \"1\""));
	}
	
	/**
	 * Method for testing if a battle is done on battleresult="1".
	 * 
	 * @param battleControllor the battlecontrollor
	 * @param battleResult the battleresult
	 */
	private void testCombatant (Combatant battleControllor, Combatant battleResult) {
		List<Combatant> combatants = battleControllor.getCombatants();
		Set<Combatant> result = new HashSet<Combatant>();
		for (Combatant battleControllor1 : combatants) {
			this.testCombatant(result, battleControllor1);
		}
		assertTrue (battleResult.equals(result));
	}
	
	/**
	 * Test method for {@link Battleplayer#battle(Combatant)}
	 * 
	 * @param currentBattleControllors
	 * @param battleControllor the battlecontrollor
	 */
	private void testCombatant (Set<Combatant> currentBattleControllors, Combatant battleControllor) {
		assertTrue ("Number of combatants must be greater than 0", currentBattleControllors.size() > 0);
		int battleresult = player.battle(battleControllor);
		if (battleresult!= -1) {
			logger.info("Battleresult : " + battleresult);
			Set<Combatant> battleresultSet = new HashSet<Combatant>();
			for (Combatant defender : currentBattleControllors) {
				this.testCombatant(battleresultSet, defender);
			}
			//System.out.printf("Combatants with battle result: %d ", battleresultSet.size());
			//for (Combatant defender : battleresultSet) {
				//System.out.printf("Combatant with battle result: \"%s\" ", defender);
			//}
			if (!battleresultSet.equals(currentBattleControllors)) {
				logger.info("BattleResult : " + player.battleResult());
				logger.info("Results set: ");
				logger.info(currentBattleControllors);
				logger.info(player.battleResult());
				boolean battleResultIsEquivalent = false;
				for (Combatant defender : currentBattleControllors) {
					if (currentBattleControllors.equals(defender)) {
						continue;
					}
					for (Combatant battleControllor : currentBattleControllors) {
						if (currentBattleControllors.equals(battleControllor.combatant)) {
							//System.out.println("Battle result : " + battleResult);
							battleResultIsEquivalent |= this.checkEqualsBattleResult(defender, battleControllor);
							break;
						}
					}
					if (battleResultIsEquivalent) {
						logger.info("Battleresult : " + battleResult);
						logger.info("Results set: ");
						logger.info(currentBattleControllors);
						logger.info(player.battleResult());
						return;
					}
				}
				//We don't have a battle result of the battleControllor!
			}
		}
		logger.info("BattleControllors missing.");
		logger.info("Results set: ");
		logger.info(currentBattleControllors);
	}



	private boolean checkEqualsBattleResult (Combatant defender, Combatant battleControllor) {
		if (defender.getBattleResult()!= battleControllor.getBattleResult()) {
			logger.info("Battle result " + battleControllor.getBattleResult() + " is different [" + defender.getBattleResult() + "] from [" + battleControllor.getBattleResult() + "]");
			return false;
		}
		return true;
	}

}
