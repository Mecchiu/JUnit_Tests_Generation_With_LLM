// SimpleCombatant_0Test.java
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
* It contains one unit test case for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatant_0Test {
		
	@Test
	void getMaxLP() {
		int max = 3;
		SimpleCombatant c = new SimpleCombatant();
		for(int i=0;i<max;i++) c = c.addWeapon(new SimpleCombatant().start().start());
		assertEquals(3, c.getMaxLP());
	}
	
	@Test
	void addWeapon_noDamage() {
		SimpleCombatant c = new SimpleCombatant();
		c.addWeapon(new SimpleCombatant().addWeapon(new Weapon().setWeight(0) ));
		assertEquals(1, c.count());
	}

	@Test
	void addWeapon() {
		SimpleCombatant c = new SimpleCombatant();
		WeaponData wd = new WeaponData().setWeight(1);
		Weapon w = c.addWeapon(wd);
		assertEquals(1, c.count());
	}
	
	@Test
	void addWeapon() {
		SimpleCombatant c = new SimpleCombatant();
		SectorBonus sd = c.addSectorBonus(new SectorBonus());
		assertEquals(1, c.count());
	}
	
	@Test
	void addWeapon_obsolete() {
		SimpleCombatant c = new SimpleCombatant();
		WeaponData wd = new WeaponData().setWeight(1);
		Weapon w = c.addWeapon(wd);
		assertEquals(1, c.count());
	}
	
	@Test
	void addWeapon() {
		for(int i=0;i<2;i++) c = new SimpleCombatant().getNewCombatantObserver();
		c.addWeapon(new Weapon().setWeight(1));
		assertEquals(1L, c.count());
	}
	
	@Test
	void addObserver() {
		SimpleCombatant c = new SimpleCombatant();
		c.addObserver(new CombatantObserver() {
			
			@Override
			public void notifyObserves(Combatant c) {
				c.deleteObserver();
			}
		});
		assertEquals(1, c.count());
	}
	
	@Test
	void count() {
		SimpleCombatant c = new SimpleCombatant();
		CharacterClass cc = new CharacterClass();
		c.addObserver(new CombatantObserver() {
			
			@Override
			public void notifyObserves(Combatant c) {
				c.deleteObserver();
			}
		});
		assertEquals(1, c.count());
		CharacterClass c2 = new CharacterClass().setClass(cc);
		c.addObserver(new CombatantObserver() {
			
			@Override
			public void notifyObserves(Combatant c) {
				c.deleteObserver();
			}
		});
		c.addObserver(new CombatantObserver() {
			
			@Override
			public void notifyObserves(Combatant c) {
				c.deleteObserver();
			}
		});
		assertEquals(2, c.count());
	}
	
	@Test
	void getSectorBonus() {
		//test without any skill
		SimpleCombatant c = new SimpleCombatant();
		c.addObserver(new CombatantObserver() {
			
			@Override
			public void notifyObserves(Combatant c) {
				c.deleteObserver();
			}
		});
		SectorBonus sb = c.getSectorBonus();
		assertNotNull(sb);
		//test with skill
		sb.getCharacterClassBonus().addSkill("Skill 1");
		sb.getCharacterClassBonus().clear();
		SectorBonus sb2 = c.getSectorBonus();
		assertEquals(0, sb.getCharacterClassBonus().size());
		assertEquals(1, c.count());
		assertEquals(1, sb2.getCharacterClassBonus().size());
		assertEquals(2, c.getSectorBonus().getCharacterClassBonus().size());

		//add second skill
		sb2.getCharacterClassBonus().addSkill("Skill 2");
		//assertEquals(7, c.count());
		assertEquals(7, c.getSectorBonus().getCharacterClassBonus().size());
		assertEquals(6, c.getSectorBonus().getCharacterClassBonus().count());
		assertEquals("Skill 1", sb2.getCharacterClassBonus().getCharacterClassBonus().get(0).getSkill());
		assertEquals("Skill 2", sb2.getCharacterClassBonus().getCharacterClassBonus().get(1).getSkill());
		c.deleteObserver();
	}
	
	@Test
	void removeObserver() {
		//test without any skill
		final Set<CombatantObserver> obsrs = new HashSet<CombatantObserver>();
		SimpleCombatant c = new SimpleCombatant();
		c.addObserver(new CombatantObserver() {
			
			@Override
			public void notifyObserves(Combatant c) {
				c.deleteObserver();
				obsrs.add(this);
			}
		});
		c.addObserver(new CombatantObserver() {
			
			@Override
			public void notifyObserves(Combatant c) {
				c.deleteObserver();
				obsrs.add(this);
			}
		});
		c.addObserver(new CombatantObserver() {
			
			@Override
			public void notifyObserves(Combatant c) {
				c.deleteObserver();
				c.deleteObserver();
				obsrs.add(this);
			}
		});
		assertEquals(2, c.getObserverSet().size());
		assertEquals(1, c.count());
		List<CombatantObserver> allObservers = new ArrayList<CombatantObserver>(obsrs);
		allObservers.remove(this);
		assertEquals(0, obsrs.size());
		c.deleteObserver();
		assertEquals(0, c.count());
		c.deleteObserver();
		assertEquals(0, allObservers.size());
}
}