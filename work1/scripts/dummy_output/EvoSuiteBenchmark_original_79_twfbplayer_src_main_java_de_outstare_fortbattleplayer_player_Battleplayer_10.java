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
		
    /** Constructor for TestCaseBattleplayerTest. */
    private BattleplayerTest() {
    }
    
	@Test
    public void testNoRounds() {
		assertEquals(0,  Battleplayer.numberOfRounds());
    }
    
	@Test
    public void testOneRound() {
		assertEquals(1,  Battleplayer.numberOfRounds());
    }
    
	@Test
    public void testTwoRounds() {
		Player other = getCombatantForIndexInList("2");
		assertEquals(1,  other.numberOfRounds());
    }
    
	@Test
    public void testTwoRoundsOfTheOther() {
		Player other = getCombatantForIndexInList("2");
		Player other1 = getCombatantForIndexInList("4");
		assertEquals(2,  other.numberOfRounds());
		assertEquals(2,  other1.numberOfRounds());
    }
    
	@Test
    public void testNomentariesOfPlayersNotInTheSameList() {
		Player unit1 = getCombatantForStringsInList("todo3");
		Player unit2 = getCombatantForStringsInList("todo4");
		Player unit3 = getCombatantForStringsInList("todo1");
		List<String> todo = new ArrayList<>();
		todo.add(unit3.getName());
		List<String> todo1 = new ArrayList<>();
		todo1.add(unit1.getName());
		Battleplayer battleplayer = new Battleplayer();
		battleplayer.addCombatantList(todo);
		battleplayer.addCombatantList(todo1);
		battleplayer.addCombatantList(todo);
	}
    
	@Test
    public void testNomentariesOfPlayersInTheSameList() {
		Character todo1 = getCombatantForId("todo1");
	    Character todo2 = getCombatantForId("todo2");
	    Character todo3 = getCombatantForId("todo3");
		List<Combatant> todo = new ArrayList<>();
		todo.add(todo1);
		todo.add(todo2);
		todo.add(todo3);
		battleplayer.addCombatantList(todo);
		assertEquals(3, battleplayer.numberOfRounds());
	}

	private List<Combatant> getCombatantForStringsInList(String strings) {
		List<Combatant> combatants = new ArrayList<>();
		for (String string : strings.split(" ")) {
			combatants.add(Combatant.valueOf(string));
		}
		return combatants;
	}

	private List<Combatant> getCombatantForId(String id) {
		List<Combatant> combatants = new ArrayList<>();
		for (Combatant combatant : Battleplayer.getCombatantsForPlayers(this)) {
	    	if (combatant instanceof BattleplayerCombatant) {
	    		BattleplayerCombatantBattleplayer battleplayerCombatantBattleplayer = (BattleplayerCombatantBattleplayer)combatant;
	    		for (Combatant combatantInPlayers : battleplayerCombatantBattleplayer.getCombatantsForPlayers(this)) {
	    			if (Combatant.valueOf(combatant.getId())
	    					.equals(Combatant.valueOf(combatantInPlayers.getId()))) {
	    				combatants.add(combatantInPlayers);
	    			}
	    		}
	    	}
		}
		return combatants;
	}
 
	private void addUnit(String player) {
		Gameplaygameplay gameplay = new Gameplaygameplay();
		Gameplayplaygameplay.Play playerPlay = gameplay.getPlayerPlay(player);
		Playerplayer battleplayerOne = new Playerplayer(playerPlay);
		battleplayerOne.setNumberOfRounds(1);
		List<Combatant> combatantsOne = new ArrayList<Combatant>();
		combatantsOne.addAll(Battleplayer.getCombatantsForPlayers(battleplayerOne));
		addCombatantsForPlayers(combatantsOne);
		Playerplayer battleplayerTwo = new Playerplayer("todo42");
		battleplayerTwo.setNumberOfRounds(1);
		List<Combatant> combatantsTwo = new ArrayList<Combatant>();
		combatantsTwo.addAll(Battleplayer.getCombatantsForPlayers(battleplayerTwo));
		addCombatantsForPlayers(combatantsTwo);
	}
	
	private List<Combatant> addCombatantsForPlayers(List<Combatant> combatants) {
		combatants.forEach(e -> {
			if (! (Combatant.valueOf(e.getId())).equals(BattleplayerCombatantBattleplayer.valueOf(e.getId()))) {
				Combatant.valueOf(e.getId()).setCombatant(e);
			}
		});
		return combatants;
	}

	/**
	 * @param combatants
	 */
	private void addCombatantsForPlayers(List<Combatant> combatants) {
		for (Combatant unit : combatants) {
			battleplayer.addCombatantList(unit.getId());
			assertEquals(String.format("%s, %s", battleplayer.getPlayerForIndexInCombatants(unit.getId())
				, unit), BattleplayerCombatantBattleplayer.valueOf(unit.getId()),
				BattleplayerCombatantBattleplayer.valueOf(unit.getId()));
		}
	}
	
	private String getAttack(Combatant combatant) {
		return combatant.getAttack();
	}
	
	private Combatant getCombatantForId(String combatantId){
		return (Combatant)Battleplayer.getCombatantsForPlayers(this).stream()
				.filter(c -> c.getId().equals(combatantId))
				.findFirst().orElse(null);
	}
	
	// PlayerTest.java
}