// SimpleCombatant_1Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCombatant}.
* It contains one unit test case for the {@link SimpleCombatant#_getCurrentLP()} method.
*/
class SimpleCombatant_1Test {
		private final Set<CharacterClass> _characterClassSet_1 = new HashSet<>(10);
	    private final Set<CharacterClass> _characterClassSet_2 = new HashSet<>(10);
		private final Set<SectorBonus> _sectorBonusSet_1 = new HashSet<>(10);
		private final Set<SectorBonus> _sectorBonusSet_2 = new HashSet<>(10);
		private final Set<Weapon> _weaponsSet_1 = new HashSet<>(10);
		private final Set<Weapon> _weaponsSet_2 = new HashSet<>(10);

		// Static method for testing constructor
		private final static Logger logger = Logger.getLogger(SimpleCombatant_1Test.class.getName());

		// Constructors that are protected, can only call one of the private constructor
	    // in the tests

		// Constructors that test constructor parameter (WeaponData)

		// Constructors that test the constructor parameter

		// Constructors that test the call of the constructor method
		// and call the method that initializes the objects
		// by reference

		// Constructors that control the method that is called after a battle
		// and update of the players state on the server.
		// It then creates all the necessary objects - but only before 
		// its battle is over (see battleFinished method)

		private final PlayerController getDefault_1 = new PlayerController(new SoldierController(), new GameObserver(), new CombatantObserver());
		
		private final PlayerController getDefault_2 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

		private final PlayerController getDefault_3 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

		private final PlayerController getDefault_4 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

		private final PlayerController getDefault_5 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

		private final PlayerController getDefault_6 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

	    private final PlayerController getDefault_7 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());
	    
	    private final PlayerController getDefault_8 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

	    private final PlayerController getDefault_9 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

	    private final PlayerController getDefault_10 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

	    private final PlayerController getDefault_11 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

			private final PlayerController getDefault_15 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

			private final PlayerController getDefault_25 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

			private final PlayerController getDefault_4_1 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

			private final PlayerController getDefault_4_2 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

			private final PlayerController getDefault_4_3 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

			private final PlayerController getDefault_4_4 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

			private final PlayerController getDefault_4_5 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

			private final PlayerController getDefault_5_1 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

			private ArmorPile getDefault_6_1 = new ArmorPile(new ArmorPileController(), new CombatantObserver());
	    

		private final PlayerController getDefault_8_1 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

		private final PlayerController getDefault_9_1 = new PlayerController((SectorBonusController) null, new GameObserver(), new CombatantObserver());

	    private ArmorPile getDefault_10_1 = new ArmorPile(new ArmorPileController(), new CombatantObserver());


			private ArmorPile getDefault_13_1 = new ArmorPile(new ArmorPileController(), new CombatantObserver());

			private World world = new World(10);


			private PlayerController getDefault_16_1 = new PlayerController(new PlayerController().updateSightRange(10), new CombatantObserver(), new CombatantObserver(), new CombatantObserver());

}