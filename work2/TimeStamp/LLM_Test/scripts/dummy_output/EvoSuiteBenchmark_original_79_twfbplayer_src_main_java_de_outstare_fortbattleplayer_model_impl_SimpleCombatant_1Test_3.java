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
		
	static final Logger logger = Logger.getLogger( SimpleCombatant_1Test.class.getName() );
	
	final CombatantObserver observer = new CombatantObserver();
	
	@Test
	void testSingleWeaponClass() {
	    WeaponData wd1 = new WeaponData();
	    wd1.setType("Sword");
	    WeaponData wd2 = new WeaponData();
	    wd2.addSkill("Weapon");
	    assertTrue(!observer.isAvailable(CharacterClass.Weapon, wd1));
	    assertTrue(observer.isAvailable(CharacterClass.Weapon, wd2));
	}
	
	@Test
	void testMultipleWeaponClasses() {
		WeaponData wd1 = new WeaponData();
		wd1.addSkill("Weapon");
		// weapon of side 1
		WeaponData wd2 = new WeaponData();
		wd2.addSkill("Sword");
		wd2.addTargetClass(CharacterClass.Weapon);
		assertTrue(!observer.isAvailable(CharacterClass.Weapon, wd1));
		assertTrue(observer.isAvailable(CharacterClass.Weapon, wd2));
	}
	
	@Test
	void testDefaultWeaponClass() {
		assertTrue(observer.isAvailable(CharacterClass.Weapon, new WeaponData()));
		
	}
	
	@Test
	void testTwoWeaponsClasses() {
		// weapon of side 1 and side 2
		assertTrue(observer.isAvailable(CharacterClass.Weapon, new WeaponData()));
		assertTrue(observer.isAvailable(CharacterClass.Weapon, new WeaponData()));
	}
	
	
	@Test
	void testMultipleCharsClass() {
		CharacterClass ch1 = new CharacterClass();
		char c = 'A';
		ch1.addCharacterClass(c);
		
		CharacterClass ch2 = new CharacterClass();
		CharacterClass ch3 = new CharacterClass();
		CharacterClass ch4 = new CharacterClass();
		
		Set<CharacterClass> charactersAtLevel = new HashSet<>();
		charactersAtLevel.add(ch1);
		charactersAtLevel.add(ch2);
		charactersAtLevel.add(ch3);
		charactersAtLevel.add(ch4);
		
		WeaponData wd1 = new WeaponData();
		wd1.addTargetClass(ch1);
		charactersAtLevel.add(wd1);

		// weapon of side 1
		WeaponData wd2 = new WeaponData();
		wd2.addTargetClass(ch1);
		charactersAtLevel.add(wd2);
		
		// weapon of side 2
		WeaponData wd3 = new WeaponData();
		wd3.addTargetClass(ch1);
		wd3.addTargetClass(ch2);
		wd3.addTargetClass(ch3);
		wd3.addTargetClass(ch4);
		charactersAtLevel.add(wd3);

		assertTrue(observer.isAvailable(CharacterClass.Weapon, wd1));
		assertTrue(observer.isAvailable(CharacterClass.Weapon, wd2));
		assertTrue(observer.isAvailable(CharacterClass.Weapon, wd3));

	}
}